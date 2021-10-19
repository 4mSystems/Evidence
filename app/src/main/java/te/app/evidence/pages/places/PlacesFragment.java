package te.app.evidence.pages.places;

import android.app.Dialog;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentPlacesBinding;
import te.app.evidence.databinding.GovernDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.places.models.PlacesByGovernResponse;
import te.app.evidence.pages.places.models.PlacesResponse;
import te.app.evidence.pages.places.viewModels.PlacesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUp;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;

public class PlacesFragment extends BaseFragment {
    FragmentPlacesBinding binding;
    @Inject
    PlacesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_places, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getPlaces();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.LOCATIONS:
                    viewModel.setPlacesMain(((PlacesResponse) mutable.object).getPlacesMain());
                    break;
                case Constants.PLACES_BY_GOVERN:
                    viewModel.setPlacesPaginate(((PlacesByGovernResponse) mutable.object).getPlacesPaginate());
                    break;
                case Constants.SHOW_GOVS:
                    showGovernDialog();
                    break;
                case Constants.SHOW_TYPE:
                    showSearchType();
                    break;
            }
        });
        binding.rcPlaces.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getPlacesPaginate().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getPlacesAdapter().getPlacesDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.getPlacesByGovernId((viewModel.getPlacesPaginate().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showGovernDialog() {
        Dialog dialog = new Dialog(requireActivity(), R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        GovernDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.govern_dialog, null, false);
        dialog.setContentView(binding.getRoot());
        binding.setViewmodel(viewModel);
        viewModel.getGovernAdapter().liveData.observeForever(governmentData -> {
            viewModel.governText.set(governmentData.getName());
            viewModel.governId = governmentData.getId();
            viewModel.getPlacesByGovernId(1, true);
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showSearchType() {
        List<PopUp> typeList = new ArrayList<>();
        typeList.add(new PopUp(getString(R.string.court), "Court"));
        typeList.add(new PopUp(getString(R.string.station), "Police_station"));
        typeList.add(new PopUp(getString(R.string.real_estate_month), "Real_estate_month"));
        PopUpMenuHelper.showPopUp(requireActivity(), binding.searchType, typeList).
                setOnMenuItemClickListener(item -> {
                    viewModel.searchType.set(typeList.get(item.getItemId()).getId());
                    binding.searchType.setText(typeList.get(item.getItemId()).getName());
                    viewModel.getPlacesByGovernId(1, true);
                    return false;
                });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }
}
