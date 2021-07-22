package te.app.evidence.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.io.File;

import im.delight.android.webview.AdvancedWebView;
import te.app.evidence.R;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;

public class PdftActivity extends ParentActivity implements AdvancedWebView.Listener {
    private AdvancedWebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_downloader);
        mWebView = findViewById(R.id.webview);
        String url = getIntent().getStringExtra(Constants.BUNDLE);
        if (url != null) {
            mWebView.setListener(this, this);
            mWebView.setMixedContentAllowed(false);
            mWebView.loadUrl(url);
        }
    }

    @SuppressLint("NewApi")
    @Override
    public void onResume() {
        super.onResume();
        mWebView.onResume();
        // ...
    }

    @SuppressLint("NewApi")
    @Override
    protected void onPause() {
        mWebView.onPause();
        // ...
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mWebView.onDestroy();
        // ...
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        mWebView.onActivityResult(requestCode, resultCode, intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {
    }

    @Override
    public void onPageFinished(String url) {
    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {
        finish();
    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {
        Log.e("onDownloadRequested", "onDownloadRequested: " + Environment.DIRECTORY_DOWNLOADS + "/" + suggestedFilename);
        if (AdvancedWebView.handleDownload(this, url, suggestedFilename)) {
            toastMessage(ResourceManager.getString(R.string.download_success), R.drawable.ic_check_white_24dp, R.color.successColor);
//            finish();
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + suggestedFilename);
            if (file.exists()) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }else
                Log.e("onDownloadRequested", "onDownloadRequested: ");
        }
    }

    @Override
    public void onExternalPageRequest(String url) {
    }
}