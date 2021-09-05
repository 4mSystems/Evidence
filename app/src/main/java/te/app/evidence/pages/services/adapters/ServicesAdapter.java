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
import te.app.evidence.databinding.ItemServiceBinding;
import te.app.evidence.pages.services.models.ServiceData;
import te.app.evidence.pages.services.viewModels.ItemServicesViewModel;


public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {
    List<ServiceData> serviceDataList;
    Context context;
    public int lastSelected = -1;

    public ServicesAdapter() {
        this.serviceDataList = new ArrayList<>();
    }

    public List<ServiceData> getServiceDataList() {
        return serviceDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        ServiceData product = serviceDataList.get(position);
        ItemServicesViewModel itemMenuViewModel = new ItemServicesViewModel(product);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ServiceData> dataList) {
        this.serviceDataList.clear();
        serviceDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<ServiceData> dataList) {
        int start = serviceDataList.size();
        serviceDataList.addAll(dataList);
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
        return serviceDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemServiceBinding itemMenuBinding;

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

        void setViewModel(ItemServicesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
