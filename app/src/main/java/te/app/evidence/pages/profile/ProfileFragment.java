package te.app.evidence.pages.profile;

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
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentProfileBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.LauncherHelper;
import te.app.evidence.utils.session.UserHelper;
import te.app.evidence.utils.upload.FileOperations;

public class ProfileFragment extends BaseFragment {
    FragmentProfileBinding binding;
    @Inject
    ProfileViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
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
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.UPDATE_PROFILE:
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    toastMessage(((UsersResponse) ((Mutable) o).object).mMessage);
                    viewModel.goBack(requireActivity());
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        baseActivity().enableRefresh(false);
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, 9, (request, result) -> {
            if (result)
                pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
        });
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            binding.userImg.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
        }
    }


}
