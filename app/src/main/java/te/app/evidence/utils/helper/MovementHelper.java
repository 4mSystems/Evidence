package te.app.evidence.utils.helper;


import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.gson.Gson;

import te.app.evidence.PassingObject;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.base.MyApplication;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.utils.Constants;
import te.app.evidence.R;

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
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
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
        LauncherHelper.execute(intent, Constants.RESULT_CODE, from);
    }

    public static void startActivityForResultWithBundle(Context from, PassingObject passingObject, String name, String page, int request) {
        Intent intent = new Intent(from, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        intent.putExtra(Constants.REQUEST_RESULT, request);
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        if (name != null) {
            intent.putExtra(Constants.NAME_BAR, name);
        }
        LauncherHelper.execute(intent, request, from);
    }

    public static void finishWithResult(PassingObject passingObject, Context context) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, passingObject);
        intent.putExtra(Constants.BUNDLE, bundle);
        ((ParentActivity) context).setResult(RESULT_OK, intent);
        ((Activity) context).finish();
    }

    public static void finishWithResult(PassingObject passingObject, Context context, int request) {
        LauncherHelper.launcherRequest = request;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, passingObject);
        intent.putExtra(Constants.BUNDLE, bundle);
        ((ParentActivity) context).setResult(request, intent);
        ((Activity) context).finish();
    }

    public static void finishWithResultWithRequestCode(PassingObject passingObject, Context context, int request) {
        LauncherHelper.launcherRequest = request;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, passingObject);
        intent.putExtra(Constants.BUNDLE, bundle);
        ((ParentActivity) context).setResult(request, intent);
        ((Activity) context).finish();
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
//        ((Activity) context).finishAffinity();
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

    public static Bitmap createDrawableFromView(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);

        return bitmap;
    }

    public static void openDialNumber(String number, Context context) {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(((Activity) context), new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number));
            context.startActivity(intent);
        }

    }
}
