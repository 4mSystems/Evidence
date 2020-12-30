package grand.app.akar.pages.chat.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.databinding.ItemAdImagesBinding;
import grand.app.akar.databinding.ItemChatImagesBinding;
import grand.app.akar.pages.ads.models.OrderImages;
import grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel;
import grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel;
import grand.app.akar.pages.home.models.DefaultImg;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;


public class ChatImagesAdapter extends RecyclerView.Adapter<ChatImagesAdapter.MenuView> {
    public List<DefaultImg> defaultImgList;
    private Context context;

    public ChatImagesAdapter() {
        this.defaultImgList = new ArrayList<>();
    }


    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_images,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        DefaultImg menuModel = defaultImgList.get(position);
        ItemChatImagesViewModel itemMenuViewModel = new ItemChatImagesViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<DefaultImg> dataList) {
        this.defaultImgList.clear();
        defaultImgList.addAll(dataList);
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
        return defaultImgList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemChatImagesBinding itemMenuBinding;

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

        void setViewModel(ItemChatImagesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
