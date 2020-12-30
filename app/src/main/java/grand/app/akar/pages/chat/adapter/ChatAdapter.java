package grand.app.akar.pages.chat.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.databinding.ItemChatBinding;
import grand.app.akar.pages.chat.model.Chat;
import grand.app.akar.pages.chat.viewmodel.ItemChatViewModel;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    private List<Chat> chatList;
    private Context context;

    public ChatAdapter() {
        this.chatList = new ArrayList<>();
    }

    public List<Chat> getChatList() {
        return chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Chat dataModel = chatList.get(position);
        ItemChatViewModel itemMenuViewModel = new ItemChatViewModel(dataModel);
        if (dataModel.getReceiver().getId() == UserHelper.getInstance(context).getUserData().getId()) {
            holder.itemMenuBinding.rlItemChat.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            holder.itemMenuBinding.itemMessage.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary, null));
            holder.itemMenuBinding.itemMessage.setTextColor(context.getResources().getColor(R.color.white, null));
        } else {
            holder.itemMenuBinding.rlItemChat.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            holder.itemMenuBinding.itemMessage.setBackgroundColor(context.getResources().getColor(R.color.left_chat, null));
            holder.itemMenuBinding.itemMessage.setTextColor(context.getResources().getColor(R.color.black, null));
        }

        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Chat> dataList) {
        this.chatList.clear();
        chatList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemChatBinding itemMenuBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }

        void bind() {
            if (itemMenuBinding == null) {
                itemMenuBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemMenuBinding != null) {
                itemMenuBinding.unbind();
            }
        }

        void setViewModel(ItemChatViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemChatViewModel(itemViewModels);
            }
        }
    }
}
