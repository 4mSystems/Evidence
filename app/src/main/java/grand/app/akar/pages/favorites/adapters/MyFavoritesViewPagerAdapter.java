package grand.app.akar.pages.favorites.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

import grand.app.akar.R;
import grand.app.akar.pages.favorites.FavoritesContactFragment;
import grand.app.akar.pages.favorites.FavoritesFragment;
import grand.app.akar.utils.resources.ResourceManager;

public class MyFavoritesViewPagerAdapter extends FragmentStatePagerAdapter {
    public MyFavoritesViewPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public @NotNull
    Fragment getItem(int position) {
        if (position == 1) {
            return new FavoritesContactFragment();
        } else {
            return new FavoritesFragment();
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
            title = ResourceManager.getString(R.string.favorite_contact_title);
        } else if (position == 0) {
            title = ResourceManager.getString(R.string.favorite_title);
        }
        return title;
    }
}
