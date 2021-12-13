package te.app.evidence.utils.helper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import te.app.evidence.base.MyApplication;
import te.app.evidence.R;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.databinding.DownloadDialogBinding;
import te.app.evidence.utils.resources.ResourceManager;

public class AppHelper {
    public static String selectDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return sdf.format(new Date());
    }

    public static void shareApp(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareSub = activity.getString(R.string.app_name);
        String shareBody = getPlayStoreLink(activity);
        intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        intent.putExtra(Intent.EXTRA_TEXT, shareBody);
        activity.startActivity(Intent.createChooser(intent, "share"));
    }

    public static String getPlayStoreLink(Context context) {
        final String appPackageName = context.getPackageName();
        return "https://play.google.com/store/apps/details?id=" + appPackageName;
    }

    public static void rateApp(Context context) {
        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            context.startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    public static void shareCustom(Activity activity, String title, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        final String appPackageName = MyApplication.getInstance().getPackageName();
        message += "\n\nhttps://play.google.com/store/apps/details?id=" + appPackageName;
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        activity.startActivity(Intent.createChooser(intent, "share"));

    }

    public static void openWhats(Activity activity, String number) {
        Uri uri = Uri.parse("smsto:" + number);
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.setPackage("com.whatsapp");
        activity.startActivity(Intent.createChooser(i, ""));
    }

    public static void openDialNumber(Context context, String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        context.startActivity(intent);
    }

    public static void openBrowser(Context context, String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://"))
            url = "http://" + url;
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(browserIntent);
    }


    public static void openEmail(Context context, String email) {
        String mailto = "mailto:" + email + "?" +
                "&subject=" + context.getString(R.string.app_name) +
                "&body=";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));
        try {
            context.startActivity(emailIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(context, "No Server Mail Application Found", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("WrongConstant")
    public static void initVerticalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.VERTICAL, false));
    }

    @SuppressLint("WrongConstant")
    public static void initVerticalRVST(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(spanCount, LinearLayoutManager.VERTICAL));
    }

    @SuppressLint("WrongConstant")
    public static void initHorizontalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.HORIZONTAL, false));
    }

    public static void download(String fromUrl, String toFilename, Context context) {
        Log.e("download", "download: "+fromUrl );
        //Show download dialog
        boolean downloading = true;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fromUrl));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, toFilename);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        DownloadManager dm = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        try {
            long id = dm.enqueue(request);
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterByStatus(DownloadManager.STATUS_FAILED | DownloadManager.STATUS_PAUSED | DownloadManager.STATUS_SUCCESSFUL | DownloadManager.STATUS_RUNNING | DownloadManager.STATUS_PENDING);
            Cursor c = dm.query(query);
            while (downloading) {
                c = dm.query(query);
                if (c.moveToFirst()) {
                    Log.i("FLAG", "Downloading");
                    int status = c.getInt(c.getColumnIndex(DownloadManager.COLUMN_STATUS));
                    if (status == DownloadManager.STATUS_SUCCESSFUL) {
                        downloading = false;
                        ((ParentActivity) context).toastMessage(ResourceManager.getString(R.string.download_success), R.drawable.ic_check_white_24dp, R.color.successColor);
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), toFilename);
                        if (file.exists()) {
                            Log.e("FLAG", "download: ");
                        }
                        break;
                    }
                    if (status == DownloadManager.STATUS_FAILED) {
                        Log.i("FLAG", "Fail"+status);
                        downloading = false;
                        break;
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
            dm.enqueue(request);
        }
    }

    public static void showDownloadDialog(String fromUrl, String toFilename, Context context) {
        Dialog downloadDialog = new Dialog(context, R.style.PauseDialog);
        downloadDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(downloadDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        downloadDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        DownloadDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(downloadDialog.getContext()), R.layout.download_dialog, null, false);
        downloadDialog.setContentView(binding.getRoot());
        downloadDialog.show();
        download(fromUrl, toFilename, context);
    }

    public static void startAndroidGoogleMap(Context context, String latitude, String longitude) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(mapLink(latitude, longitude)));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }

    public static String mapLink(String latitude, String longitude) {
        return "http://maps.google.com/maps?saddr=&daddr=" + latitude + "," + longitude;
    }
}
