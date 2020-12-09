package grand.app.akar.pages.chat.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;


import org.jetbrains.annotations.NotNull;

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentChatBinding;
import grand.app.akar.pages.chat.viewmodel.ChatViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends BaseFragment {

    private Context context;
    private FragmentChatBinding binding;
    private static final String TAG = "NotificationFragment";
     ChatViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
//        viewModel.call();
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
//        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
//            Mutable mutable = (Mutable) o;
//            handleActions(mutable);
//            if (((Mutable) o).message.equals(URLS.CHAT)) {
//                viewModel.response = (ChatResponse) ((Mutable) o).object;
//                viewModel.updateAdapter();
//                binding.rvChat.scrollToPosition(viewModel.adapter.getItemCount() - 1);
//
//                Log.d("size",viewModel.adapter.getItemCount()+"");
//            } else if (((Mutable) o).message.equals(Constants.SELECT)) {
//                pickImageDialogSelect();
//            } else if (((Mutable) o).message.equals(URLS.CHAT_SEND)) {
//                ChatSendResponse chatSendResponse = (ChatSendResponse) ((Mutable) o).object;
//                viewModel.adapter.add(chatSendResponse.data);
//                viewModel.response.messageCount++;
//                viewModel.updateChatCount();
//                binding.etChatMessage.setText("");
//                binding.rvChat.scrollToPosition(viewModel.adapter.getItemCount() - 1);
//                Log.d("size",viewModel.adapter.getItemCount()+"");
//            }
//        });
    }

    @Override
    public void onResume() {
        super.onResume();
//        context.registerReceiver(chat, new IntentFilter(Constants.CHAT));
//        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


    private BroadcastReceiver chat = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
//            if(viewModel != null && viewModel.adapter != null){
//                Bundle bundle = intent.getBundleExtra(Constants.BUNDLE_NOTIFICATION);
//                if(bundle != null && bundle.containsKey(Constants.BUNDLE_NOTIFICATION)) {
//                    NotificationGCMModel notificationGCMModel = (NotificationGCMModel) bundle.getSerializable(Constants.BUNDLE_NOTIFICATION);
//                    if(notificationGCMModel != null) {
//                        Chat model = new Chat();
//                        model.type = 2;
//                        model.time = notificationGCMModel.time;
//                        if(notificationGCMModel.typeData == 1)
//                            model.message = notificationGCMModel.message;
//                        else
//                            model.image = notificationGCMModel.image;
//                        viewModel.adapter.add(model);
//                        viewModel.response.messageCount++;
//                        viewModel.updateChatCount();
//                        binding.rvChat.scrollToPosition(viewModel.adapter.getItemCount() - 1);
//                    }
//                }
//            }
        }
    };


    @Override
    public void onPause() {
        super.onPause();
        context.unregisterReceiver(chat);
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
