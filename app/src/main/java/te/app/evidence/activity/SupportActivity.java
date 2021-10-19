package te.app.evidence.activity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import im.delight.android.webview.AdvancedWebView;
import te.app.evidence.R;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.ActivitySupportBinding;
import te.app.evidence.utils.Constants;

public class SupportActivity extends AppCompatActivity implements AdvancedWebView.Listener {
    ActivitySupportBinding supportBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        supportBinding = DataBindingUtil.setContentView(this, R.layout.activity_support);
        String url = getIntent().getStringExtra(Constants.BUNDLE);
        String title = getIntent().getStringExtra(Constants.NAME_BAR);
        if (title != null)
            supportBinding.tvActionBarTitle.setText(title);
        else
            supportBinding.backContainer.setVisibility(View.GONE);
        if (url != null) {
            supportBinding.webview.setListener(this, this);
            supportBinding.webview.setMixedContentAllowed(false);
            supportBinding.webview.setDesktopMode(true);
            supportBinding.webview.loadUrl(url);
        }
        supportBinding.imgActionBarCancel.setOnClickListener(v -> finish());
    }

    @SuppressLint("NewApi")
    @Override
    public void onResume() {
        super.onResume();
        supportBinding.webview.onResume();
        // ...
    }

    @SuppressLint("NewApi")
    @Override
    public void onPause() {
        supportBinding.webview.onPause();
        // ...
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        supportBinding.webview.onDestroy();
        // ...
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        supportBinding.webview.onActivityResult(requestCode, resultCode, intent);
    }

    @Override
    public void onBackPressed() {
        if (!supportBinding.webview.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {
        supportBinding.webview.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPageFinished(String url) {
        supportBinding.webProgress.setVisibility(View.GONE);
    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {

    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {
    }

    @Override
    public void onExternalPageRequest(String url) {
    }
}