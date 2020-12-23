package grand.app.akar.pages.ads.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.databinding.ItemAdImagesBinding;
import grand.app.akar.pages.ads.models.OrderImages;
import grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.resources.ResourceManager;


public class AdImagesAdapter extends RecyclerView.Adapter<AdImagesAdapter.MenuView> {
    public List<OrderImages> orderImagesList;
    private Context context;
    private MutableLiveData<Integer> newImageLiveData = new MediatorLiveData<>();

    public AdImagesAdapter() {
        this.orderImagesList = new ArrayList<>();
    }

    public MutableLiveData<Integer> getNewImageLiveData() {
        return newImageLiveData;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ad_images,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        OrderImages menuModel = orderImagesList.get(position);
        ItemPublicOrderImagesViewModel itemMenuViewModel = new ItemPublicOrderImagesViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) MovementHelper.unwrap(context)), o -> {
            if (o.equals(Constants.NEW_IMAGE)) {
                newImageLiveData.setValue(position);
            } else if (o.equals(Constants.REMOVE_IMAGE)) {
                orderImagesList.get(position).setPath("");
//                holder.itemMenuBinding.image1.setImageResource(R.drawable.holo);
                notifyDataSetChanged();
            }
        });
        itemMenuViewModel.setSelected(!menuModel.getPath().isEmpty());
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<OrderImages> dataList) {
        this.orderImagesList.clear();
        orderImagesList.addAll(dataList);
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
        return orderImagesList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemAdImagesBinding itemMenuBinding;

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

        void setViewModel(ItemPublicOrderImagesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
