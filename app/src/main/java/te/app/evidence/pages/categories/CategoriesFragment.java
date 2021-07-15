package te.app.evidence.pages.categories;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentCategoriesBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class CategoriesFragment extends BaseFragment {
    FragmentCategoriesBinding binding;
    @Inject
    CategoriesViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.categories(1, true);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.setMainData(((CategoriesResponse) mutable.object).getMainData());
            } else if (Constants.ADD_CATEGORY.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.add_new_category), AddCategoryFragment.class.getName(), null);
            } else if (Constants.DELETE_CATEGORY.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getCategoriesAdapter().getCategoriesDataList().remove(viewModel.getCategoriesAdapter().lastSelected);
                viewModel.getCategoriesAdapter().notifyItemRangeChanged(viewModel.getCategoriesAdapter().lastSelected, viewModel.getCategoriesAdapter().getItemCount());
                deleteDialog.dismiss();
            }
        });
        viewModel.getCategoriesAdapter().actionLiveData.observe(requireActivity(), o -> showDeleteDialog());
        binding.rcCat.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getCategoriesAdapter().getItemCount()) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.categories((viewModel.getMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deleteCategory());
        deleteDialog.show();
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getCategoriesAdapter().lastSelected == -1) {
                        viewModel.getCategoriesAdapter().getCategoriesDataList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), CategoriesData.class));
                        viewModel.getCategoriesAdapter().notifyItemInserted(viewModel.getCategoriesAdapter().getCategoriesDataList().size() - 1);
                        binding.rcCat.scrollToPosition(viewModel.getCategoriesAdapter().getCategoriesDataList().size() - 1);
                    } else {
                        viewModel.getCategoriesAdapter().getCategoriesDataList().set(viewModel.getCategoriesAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), CategoriesData.class));
                        viewModel.getCategoriesAdapter().notifyItemChanged(viewModel.getCategoriesAdapter().lastSelected);
                        binding.rcCat.scrollToPosition(viewModel.getCategoriesAdapter().lastSelected);
                    }
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCategoriesRepository().setLiveData(viewModel.liveData);
    }

}
