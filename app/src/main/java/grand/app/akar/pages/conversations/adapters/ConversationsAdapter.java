package grand.app.akar.pages.conversations.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.databinding.ItemConversationBinding;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.chat.view.ChatFragment;
import grand.app.akar.pages.conversations.models.ConversationsData;
import grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.resources.ResourceManager;


public class ConversationsAdapter extends RecyclerView.Adapter<ConversationsAdapter.MenuView> {
    List<ConversationsData> conversationsDataList;
    private Context context;

    public ConversationsAdapter() {
        this.conversationsDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_conversation,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        ConversationsData menuModel = conversationsDataList.get(position);
        ItemConversationsViewModel itemMenuViewModel = new ItemConversationsViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) MovementHelper.unwrap(context)), o -> MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel.getListingId(), String.valueOf(menuModel.getReceiver().getId())), ResourceManager.getString(R.string.menuConversations), ChatFragment.class.getName(), null));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ConversationsData> dataList) {
        this.conversationsDataList.clear();
        conversationsDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull MenuView holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull MenuView holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return conversationsDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemConversationBinding itemMenuBinding;

        MenuView(View itemView) {
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

        void setViewModel(ItemConversationsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
