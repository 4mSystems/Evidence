package grand.app.akar.pages.myAds.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

import grand.app.akar.R;
import grand.app.akar.pages.myAds.CurrentAdsFragment;
import grand.app.akar.pages.myAds.PreviousAdsFragment;
import grand.app.akar.utils.resources.ResourceManager;

public class MyAdsViewPagerAdapter extends FragmentStatePagerAdapter {
    public MyAdsViewPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public @NotNull Fragment getItem(int position) {
        if (position == 1) {
            return new PreviousAdsFragment();
        } else {
            return new CurrentAdsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        if (position == 1) {
            title = ResourceManager.getString(R.string.previous_ads);
        } else if (position == 0) {
            title = ResourceManager.getString(R.string.current_ads);
        }
        return title;
    }
}