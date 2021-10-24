package te.app.evidence.pages.auth.register;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import java.io.File;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentRegisterBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.helper.LauncherHelper;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.upload.FileOperations;

public class RegisterFragment extends BaseFragment {
    FragmentRegisterBinding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {

        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    LauncherHelper.launcherRequest = Constants.FILE_TYPE_IMAGE;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.IMAGE_MEMBERSHIP:
                    LauncherHelper.launcherRequest = Constants.ATTACH_REQUEST;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.REGISTER:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getRequest().getEmail()), null, ConfirmCodeFragment.class.getName(), null);
                    finishActivity();
                    break;
                case Constants.PRIVACY:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.POLICY_URL, getString(R.string.privacy));
                    break;
                case Constants.TERMS:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.TERMS_URL, getString(R.string.terms));
                    break;

            }
        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, LauncherHelper.launcherRequest, (request, result) -> {
            if (result)
                pickImageDialogSelect(LauncherHelper.launcherRequest);
        });
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null) {
            FileObject fileObject = null;
            if (request == Constants.FILE_TYPE_IMAGE) {
                fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
                binding.userImg.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
                viewModel.request.setUserImage(fileObject.getFilePath());
            } else if (request == Constants.ATTACH_REQUEST) {
                fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE_MEMBERSHIP, Constants.FILE_TYPE_IMAGE);
                viewModel.request.setMemberShipImage(new File(fileObject.getFilePath()).getName());
            }
            viewModel.getFileObject().add(fileObject);
            viewModel.notifyChange(BR.request);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
