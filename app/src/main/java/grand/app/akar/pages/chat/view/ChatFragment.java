package grand.app.akar.pages.chat.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;


import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;

import javax.inject.Inject;

import droidninja.filepicker.FilePickerConst;
import droidninja.filepicker.utils.ContentUriUtils;
import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.connection.FileObject;
import grand.app.akar.databinding.FragmentChatBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.chat.model.ChatResponse;
import grand.app.akar.pages.chat.model.ChatSendResponse;
import grand.app.akar.pages.chat.viewmodel.ChatViewModel;
import grand.app.akar.utils.Constants;

import static grand.app.akar.utils.Constants.CUSTOM_REQUEST_CODE;
import static grand.app.akar.utils.upload.FileOperations.pickImages;

public class ChatFragment extends BaseFragment {

    private Context context;
    private FragmentChatBinding binding;
    @Inject
    ChatViewModel viewModel;
    private ArrayList<Uri> photoPaths = new ArrayList<>();
    private ArrayList<Uri> docPaths = new ArrayList<>();

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
                Collections.reverse(((ChatResponse) mutable.object).getChats());
                viewModel.adapter.update(((ChatResponse) mutable.object).getChats());
                if (viewModel.adapter.getChatList().size() > 0)
                    new Handler().postDelayed(() -> binding.rcChat.smoothScrollToPosition(viewModel.adapter.getChatList().size() - 1), 200);
            } else if (Constants.SELECT.equals(mutable.message)) {
                pickImages(context, photoPaths, docPaths, 4, false);
            } else if (((Mutable) o).message.equals(Constants.SEND_MESSAGE)) {
                ChatSendResponse chatSendResponse = (ChatSendResponse) ((Mutable) o).object;
                viewModel.adapter.getChatList().add(chatSendResponse.getData());
                viewModel.fileObjectList.clear();
                binding.sendChat.setText("");
                binding.sendChat.setHint(getResources().getString(R.string.chat_hint));
                binding.rcChat.scrollToPosition(viewModel.adapter.getItemCount() - 1);
                viewModel.adapter.notifyItemChanged(viewModel.adapter.getItemCount() - 1);
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


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CUSTOM_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                ArrayList<Uri> dataList = data.getParcelableArrayListExtra(FilePickerConst.KEY_SELECTED_MEDIA);
                if (dataList != null) {
                    photoPaths = new ArrayList<>();
                    photoPaths.addAll(dataList);
                    binding.sendChat.setHint(getResources().getString(R.string.image_selected));
                }
            }
        }

        addThemToView(photoPaths, docPaths);
    }

    private void addThemToView(ArrayList<Uri> imagePaths, ArrayList<Uri> docPaths) {
        ArrayList<Uri> filePaths = new ArrayList<>();
        if (imagePaths != null) filePaths.addAll(imagePaths);

        if (docPaths != null) filePaths.addAll(docPaths);
        FileObject fileObject;
        for (int i = 0; i < filePaths.size(); i++) {
            try {
                String path = ContentUriUtils.INSTANCE.getFilePath(context, filePaths.get(i));
                fileObject = new FileObject("imgs[" + i + "]", path, Constants.FILE_TYPE_IMAGE);
                fileObject.setUri(filePaths.get(i));
                viewModel.fileObjectList.add(fileObject);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

        }

    }
}
