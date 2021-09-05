package te.app.evidence.pages.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import java.io.File;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentAddServiceBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.services.models.AddServiceResponse;
import te.app.evidence.pages.services.viewModels.ServicesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.LauncherHelper;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.upload.FileOperations;

public class AddServiceFragment extends BaseFragment {
    FragmentAddServiceBinding binding;
    @Inject
    ServicesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_service, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
//            viewModel.setSystemUserData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), SystemUserData.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.IMAGE)) {
                LauncherHelper.execute(LauncherHelper.storage);
            } else if (((Mutable) o).message.equals(Constants.ADD_SERVICE)) {
                toastMessage(((AddServiceResponse) mutable.object).mMessage);
                MovementHelper.finishWithResultWithRequestCode(new PassingObject(((AddServiceResponse) mutable.object).getServiceData()), requireActivity(), Constants.ADD_SERVICE_REQUEST);
            }
        });
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
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObjects().add(fileObject);
            binding.icImage.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
            viewModel.getAddServiceRequest().setServiceImage(fileObject.getFilePath());
            viewModel.notifyChange(BR.addServiceRequest);
        }
    }
}
