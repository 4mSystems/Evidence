package grand.app.akar.pages.chat.view;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;


import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentChatBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.chat.model.ChatResponse;
import grand.app.akar.pages.chat.viewmodel.ChatViewModel;
import grand.app.akar.utils.Constants;

public class ChatFragment extends BaseFragment {

    private Context context;
    private FragmentChatBinding binding;
    @Inject
    ChatViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.chat();
        }
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.CHAT)) {
                viewModel.adapter.update(((ChatResponse) mutable.object).getChats());
                new Handler().postDelayed(() -> binding.rcChat.smoothScrollToPosition(viewModel.adapter.getChatList().size() - 1), 200);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super method removed
//        Timber.e("onActivityResult:" + requestCode);
//        if (requestCode == Constants.FILE_TYPE_IMAGE) {
//            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
//            File file = new File(getActivityBase().getCacheDir(), Constants.IMAGE + ".png");
//            UCrop.of(Uri.fromFile(fileObject.getFile()), Uri.fromFile(file))
//                    .start(context, ChatFragment.this);
//        } else if (requestCode == UCrop.REQUEST_CROP && data != null) {
//            final Uri resultUri = UCrop.getOutput(data);
//            if (resultUri != null) {
//                viewModel.image = new FileObject(Constants.IMAGE, resultUri.getPath(), Constants.FILE_TYPE_IMAGE);
//                viewModel.request.message = null;
//                viewModel.repository.sendChat(viewModel.request, viewModel.image);
//
//            }
//        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}
