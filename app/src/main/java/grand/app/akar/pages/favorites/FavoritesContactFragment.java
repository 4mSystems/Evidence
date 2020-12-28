package grand.app.akar.pages.favorites;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentContactFavoritesBinding;
import grand.app.akar.databinding.FragmentPreviousAdsBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.favorites.viewModels.MyFavoritesViewModel;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.myAds.viewModels.MyAdsViewModel;
import grand.app.akar.utils.Constants;


public class FavoritesContactFragment extends BaseFragment {

    private Context context;
    @Inject
    MyFavoritesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentContactFavoritesBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contact_favorites, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.FAVORITES)) {
                viewModel.getMyFavoritesAdapter().update(((HomeResponse) mutable.object).getHomeDataList());
                viewModel.notifyChange(BR.myFavoritesAdapter);
            } else if (mutable.message.equals(Constants.REMOVE_ADD_FAVORITE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getMyFavoritesAdapter().getHomeDataList().remove(viewModel.getMyFavoritesAdapter().lastPosition);
                viewModel.getMyFavoritesAdapter().notifyItemRemoved(viewModel.getMyFavoritesAdapter().lastPosition);
            }
        });
        viewModel.getMyFavoritesAdapter().getLiveDataAdapter().observe((LifecycleOwner) context, integer -> viewModel.removeFavorites(1, integer));
    }

    @Override
    public void onResume() {
        super.onResume();
        if (viewModel.getMyFavoritesAdapter().getItemCount() == 0) {
            viewModel.favoritesAds(1);
        }
        viewModel.getAdsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


}
