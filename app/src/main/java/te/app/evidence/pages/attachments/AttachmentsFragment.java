package te.app.evidence.pages.attachments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAttachmentsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.models.AttachmentsResponse;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;
import te.app.evidence.utils.Constants;


public class AttachmentsFragment extends BaseFragment {

    private Context context;
    @Inject
    AttachmentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAttachmentsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_attachments, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.attachments();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_ATTACHMENTS.equals(((Mutable) o).message)) {
                viewModel.getAttachmentsAdapter().update(((AttachmentsResponse) mutable.object).getAttachmentList());
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getAttachmentsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
