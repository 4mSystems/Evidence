package te.app.evidence.pages.attachments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;
import com.jaiselrahman.filepicker.activity.FilePickerActivity;
import com.jaiselrahman.filepicker.model.MediaFile;

import java.util.ArrayList;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentAddAttachmentBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.models.AddAttachmentResponse;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class AddAttachmentFragment extends BaseFragment {
    @Inject
    AddAttachmentViewModel viewModel;
    FragmentAddAttachmentBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_attachment, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (Constants.ADD_ATTACH.equals(((Mutable) o).message)) {
                toastMessage(((AddAttachmentResponse) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(((AddAttachmentResponse) mutable.object).getAttachment()), requireActivity());
            } else if (Constants.SELECT.equals(((Mutable) o).message)) {
                pickFile(Constants.RESULT_CODE);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getAttachmentsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.RESULT_CODE) {
            ArrayList<MediaFile> files = data.getParcelableArrayListExtra(FilePickerActivity.MEDIA_FILES);
            viewModel.getAttachmentRequest().setImage(files.get(0).getPath());
            binding.file.setText(files.get(0).getName());
            FileObject fileObject = new FileObject(Constants.ATTACHMENT_TYPE, files.get(0).getPath(), Constants.FILE_TYPE_IMAGE);
            fileObject.setUri(data.getData());
            viewModel.getFileObjects().add(fileObject);
        }
    }
}
