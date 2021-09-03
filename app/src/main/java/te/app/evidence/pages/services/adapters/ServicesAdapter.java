package te.app.evidence.pages.services.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.R;
import te.app.evidence.databinding.ItemPlaceBinding;
import te.app.evidence.pages.places.models.PlacesData;
import te.app.evidence.pages.places.viewModels.ItemPlacesViewModel;


public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {
    List<PlacesData> placesDataList;
    Context context;

    public ServicesAdapter() {
        this.placesDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        PlacesData product = placesDataList.get(position);
        ItemPlacesViewModel itemMenuViewModel = new ItemPlacesViewModel(product);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<PlacesData> dataList) {
        this.placesDataList.clear();
        placesDataList.addAll(dataList);
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
        return placesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPlaceBinding itemMenuBinding;

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

        void setViewModel(ItemPlacesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
