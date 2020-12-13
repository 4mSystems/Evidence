package grand.app.akar.pages.myAds;

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
import grand.app.akar.databinding.FragmentMyAdsMainBinding;
import grand.app.akar.pages.myAds.adapters.MyAdsViewPagerAdapter;
import grand.app.akar.pages.myAds.viewModels.MyAdsViewModel;


public class MyAdsMainFragment extends BaseFragment {

    private Context context;
    @Inject
    MyAdsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMyAdsMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_ads_main, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        MyAdsViewPagerAdapter pagerAdapter = new MyAdsViewPagerAdapter(getActivity().getSupportFragmentManager());
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
