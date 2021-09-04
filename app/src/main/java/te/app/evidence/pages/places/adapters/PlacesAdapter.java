package te.app.evidence.pages.places.adapters;

import android.app.Activity;
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
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.AppHelper;


public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {
    List<PlacesData> placesDataList;
    Context context;

    public PlacesAdapter() {
        this.placesDataList = new ArrayList<>();
    }

    public List<PlacesData> getPlacesDataList() {
        return placesDataList;
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
        itemMenuViewModel.getLiveData().observeForever(o -> {
            if (Constants.LOCATIONS == o)
                AppHelper.startAndroidGoogleMap(context, product.getLat(), product.getLng());
            else
                AppHelper.shareCustom((Activity) context, product.getName(), product.getAddress().concat("\n").concat(AppHelper.mapLink(product.getLat(), product.getLng())));
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<PlacesData> dataList) {
        this.placesDataList.clear();
        placesDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<PlacesData> dataList) {
        int start = placesDataList.size();
        placesDataList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
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
