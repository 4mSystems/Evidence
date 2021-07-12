package te.app.evidence.utils.helper;

import android.content.Intent;

public interface LauncherInterface {
    interface activityResultInterface {
        void result(int request, int resultCode, Intent result);
    }

}
