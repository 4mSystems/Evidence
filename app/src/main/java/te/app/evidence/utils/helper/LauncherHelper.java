package te.app.evidence.utils.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.activity.result.contract.ActivityResultContracts;

import te.app.evidence.base.ParentActivity;

public class LauncherHelper {
    public static int launcherRequest;

    public static void execute(Intent intent, int launcherRequestIntent, Context context) {
        launcherRequest = launcherRequestIntent;
        ((ParentActivity) context).someActivityResultLauncher.launch(intent);
    }

    public static void onActivityResult(ParentActivity fragment, LauncherInterface.activityResultInterface resultInterface) {
        fragment.someActivityResultLauncher = fragment.registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK || result.getResultCode() == launcherRequest) {
                        // There are no request codes
                        resultInterface.result(launcherRequest, result.getResultCode(), result.getData());
                    }
                });
    }
}
