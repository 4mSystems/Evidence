package grand.app.akar.pages.favorites;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentMyFavoritesMainBinding;
import grand.app.akar.pages.favorites.adapters.MyFavoritesViewPagerAdapter;
import grand.app.akar.pages.favorites.viewModels.MyFavoritesViewModel;


public class MyFavoritesMainFragment extends BaseFragment {

    private Context context;
    @Inject
    MyFavoritesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMyFavoritesMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_favorites_main, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        MyFavoritesViewPagerAdapter pagerAdapter = new MyFavoritesViewPagerAdapter(getActivity().getSupportFragmentManager());
        binding.pager.setOffscreenPageLimit(1);
        binding.pager.setAdapter(pagerAdapter);
        binding.tabs.setupWithViewPager(binding.pager);
        return binding.getRoot();
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
