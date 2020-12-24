package grand.app.akar.utils.helper;


import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.gson.Gson;

import grand.app.akar.PassingObject;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.activity.MainActivity;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.ParentActivity;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.utils.Constants;
import grand.app.akar.R;

import static android.app.Activity.RESULT_OK;


public class MovementHelper {


    //---------Fragments----------//
    private static final int CONTAINER_ID = R.id.fl_home_container;

    public static void popAllFragments(Context context) {
        FragmentManager fm = ((FragmentActivity) context).getSupportFragmentManager();
        for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }

    public static void addFragmentFromMain(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .add(CONTAINER_ID, fragment);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }

    public static void addFragment(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(CONTAINER_ID, fragment);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void addFragmentTag(Context context, Fragment fragment, String tag, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(CONTAINER_ID, fragment, tag);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void replaceFragmentTag(Context context, Fragment fragment, String tag, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(CONTAINER_ID, fragment, tag);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void replaceFragment(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(CONTAINER_ID, fragment);
        fragmentTransaction.commit();
    }

    public static void replaceHomeFragment(Context context, Fragment fragment) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.home_container, fragment);
//        homeActionBarView.setTitle(title);
//        if (notificationVisible != null)
//            homeActionBarView.notificationVisible();
//        homeMainFragment.mainHomeContainer.addView(homeActionBarView);

//        fragmentTransaction.commit();
    }


    public static void popLastFragment(Context context) {
        ((FragmentActivity) context).getSupportFragmentManager().popBackStack();
    }


    //-----------Activities-----------------//

    public static void startActivityWithBundle(Context from, PassingObject passingObject, String name, String page, String shareBar) {
        Intent intent = new Intent(from, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (name != null) {
            intent.putExtra(Constants.NAME_BAR, name);
        }
        if (shareBar != null) {
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        }
        from.startActivity(intent);
    }

    public static void startActivityForResultWithBundle(Context from, PassingObject passingObject, String name, String page, String shareBar) {
        Intent intent = new Intent(from, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        if (name != null) {
            intent.putExtra(Constants.NAME_BAR, name);
        }
        if (shareBar != null) {
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        }
        ((ParentActivity) from).startActivityForResult(intent, Constants.RESULT_CODE);
    }

    public static void finishWithResult(PassingObject passingObject, Context context) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, passingObject);
        intent.putExtra(Constants.BUNDLE, bundle);
        ((ParentActivity) context).setResult(RESULT_OK, intent);
        ((Activity) context).finish();
    }

    public static void startMapActivityForResultWithBundle(Context from, PassingObject passingObject) {
//        Intent intent = new Intent(from, MapAddressActivity.class);
//        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
////        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        ((ParentActivity) from).startActivityForResult(intent, Constants.RESULT_CODE);
    }

    public static void startDialogWithBundle(Context from, PassingObject passingObject, DialogFragment dialogFragment, Fragment fragment) {
        Intent intent = new Intent();
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        Bundle args = new Bundle();
        args.putString(Constants.BUNDLE, intent.getStringExtra(Constants.BUNDLE));
        dialogFragment.setArguments(args);
        dialogFragment.show(((FragmentActivity) from).getSupportFragmentManager(), dialogFragment.getTag());

    }

    public static void startActivityBase(Context context, String page, String pageNameBar, String shareBar) {
        Intent intent = new Intent(context, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        if (pageNameBar != null) {
            intent.putExtra(Constants.NAME_BAR, pageNameBar);
        }
        if (shareBar != null)
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        context.startActivity(intent);
        ((Activity) context).finishAffinity();
    }

    public static void startActivity(Context context, String page, String pageNameBar, String shareBar) {
        Intent intent = new Intent(context, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        if (pageNameBar != null) {
            intent.putExtra(Constants.NAME_BAR, pageNameBar);
        }
        if (shareBar != null)
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        context.startActivity(intent);
    }

    public static void startActivityMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
        ((Activity) context).finishAffinity();
    }


    public static void startWebPage(Context context, String page) {
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(page)));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static Activity unwrap(Context context) {
        while (!(context instanceof Activity) && context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static Bitmap resizeIcon(int drawable) {
        int height = 50;
        int width = 50;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) MyApplication.getInstance().getResources().getDrawable(drawable, null);
        Bitmap b = bitmapDrawable.getBitmap();
        return Bitmap.createScaledBitmap(b, width, height, false);
    }
}
