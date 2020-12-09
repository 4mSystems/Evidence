package grand.app.akar.pages.chat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.databinding.ItemChatBinding;
import grand.app.akar.pages.chat.model.Chat;
import grand.app.akar.pages.chat.viewmodel.ItemChatViewModel;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.NotificationModelView> {
    private List<Chat> items = new ArrayList<>();
    private LayoutInflater layoutInflater;
    public MutableLiveData<Object> mMutableLiveData  = new MutableLiveData<>();;
    public int width = 0;
    public int height = 0;

    public ChatAdapter() {
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public NotificationModelView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        if(layoutInflater == null){
            layoutInflater  = LayoutInflater.from(parent.getContext());
        }
        ItemChatBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_chat,parent,false);
        return new NotificationModelView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationModelView holder, final int position) {
        ItemChatViewModel itemNotificationModelViewModel = new ItemChatViewModel(items.get(position),position);
//        if(items.get(position).image.equals("")){
//            holder.binding.imgItemChat.setVisibility(View.GONE);
//            holder.binding.tvItemChat.setVisibility(View.VISIBLE);
//            holder.binding.tvItemChat.setText(items.get(position).message);
//        }else{
//            holder.binding.imgItemChat.setVisibility(View.VISIBLE);
//            holder.binding.tvItemChat.setVisibility(View.GONE);
//        }

        if(items.get(position).type == 1){
            holder.binding.rlItemChat.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }else
            holder.binding.rlItemChat.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

        holder.binding.setItemChatViewModel(itemNotificationModelViewModel);
    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    public void update(List<Chat> data) {
        this.items = data;
        notifyDataSetChanged();
    }

    public void add(Chat data) {
        this.items.add(data);
        notifyDataSetChanged();
    }

    public class NotificationModelView extends RecyclerView.ViewHolder{

        private ItemChatBinding binding;
        public NotificationModelView(@NonNull ItemChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
