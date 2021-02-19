package te.app.evidence.pages.categories;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

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
    Context context;
    @Inject
    CategoriesViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.categories();
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.getCategoriesAdapter().update(((CategoriesResponse) mutable.object).getCategoriesDataList());
                viewModel.notifyChange(BR.categoriesAdapter);
            } else if (Constants.ADD_CATEGORY.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_new_category), AddCategoryFragment.class.getName(), null);
            } else if (Constants.DELETE_CATEGORY.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getCategoriesAdapter().getCategoriesDataList().remove(viewModel.getCategoriesAdapter().lastSelected);
                viewModel.getCategoriesAdapter().notifyItemRangeChanged(viewModel.getCategoriesAdapter().lastSelected, viewModel.getCategoriesAdapter().getItemCount());
                deleteDialog.dismiss();
            }
        });
        viewModel.getCategoriesAdapter().actionLiveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
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
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
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

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
