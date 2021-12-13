package te.app.evidence.base;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import te.app.evidence.R;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.utils.upload.FileOperations;


public class BaseFragment extends Fragment {
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }


    protected void pickImageDialogSelect(int requestCode) {
        FileOperations.pickImage(requireActivity(), requestCode);
    }

    protected void pickFile(int requestCode) {
        FileOperations.pickDocuments(requireActivity(), BaseFragment.this, requestCode);
    }


    public void handleActions(Mutable mutable) {
        ((ParentActivity) requireActivity()).handleActions(mutable);
    }


    public BaseActivity baseActivity() {
        return ((BaseActivity) requireActivity());
    }
    public MainActivity mainActivity() {
        return ((MainActivity) requireActivity());
    }

    public void toastMessage(String message, int icon, int color) {
        ((ParentActivity) requireActivity()).toastMessage(message, icon, color);
    }

    public void toastMessage(String message) {
        ((ParentActivity) requireActivity()).toastMessage(message, R.drawable.ic_check_white_24dp, R.color.successColor);
    }

    public void toastErrorMessage(String message) {
        ((ParentActivity) requireActivity()).toastError(message);
    }

    protected void finishActivity() {
        ((ParentActivity) requireActivity()).finish();
    }

    private static final String TAG = "BASEFRAGMENT";

    public void launchActivityResult(int request, int resultCode, Intent result) {
        Log.e(TAG, "launchActivityResult: " + request);
    }
}
