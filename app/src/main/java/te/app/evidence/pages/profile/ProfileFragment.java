package te.app.evidence.pages.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.R;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentProfileBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.session.UserHelper;
import te.app.evidence.utils.upload.FileOperations;

public class ProfileFragment extends BaseFragment {

    Context context;
    FragmentProfileBinding binding;
    @Inject
    ProfileViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.ERROR_TOAST:
                    showError(ResourceManager.getString(R.string.password_not_match));
                    break;
                case Constants.IMAGE:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
                    break;
                case Constants.UPDATE_PROFILE:
                    UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    toastMessage(((UsersResponse) ((Mutable) o).object).mMessage);
                    viewModel.goBack(context);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) context).enableRefresh(false);
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
//            binding.imgLoginLogo.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
        }
    }


}
