package te.app.evidence.pages.services.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.databinding.ItemServiceBinding;
import te.app.evidence.pages.services.AddServiceFragment;
import te.app.evidence.pages.services.models.ServiceData;
import te.app.evidence.pages.services.viewModels.ItemServicesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUp;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;
import te.app.evidence.utils.helper.AppHelper;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;


public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {
    List<ServiceData> serviceDataList;
    Context context;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();
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
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        ServiceData product = serviceDataList.get(position);
        ItemServicesViewModel itemMenuViewModel = new ItemServicesViewModel(product);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastSelected = position;
            if (o.equals(Constants.WHATS)) {
                AppHelper.openWhats((Activity) context, product.getWhatsapp());
            } else if (o.equals(Constants.CALL)) {
                AppHelper.openDialNumber(context, product.getPhone());
            } else if (o.equals(Constants.EDIT)) {
                showPostOption(holder);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }

    private void showPostOption(ViewHolder holder) {
        List<PopUp> popUpList = new ArrayList<>();
        popUpList.add(new PopUp(ResourceManager.getString(R.string.edit), "1"));
        popUpList.add(new PopUp(ResourceManager.getString(R.string.delete), "2"));
        PopUpMenuHelper.showPopUp(context, holder.itemMenuBinding.icMore, popUpList).
                setOnMenuItemClickListener(item -> {
                    if (popUpList.get(item.getItemId()).getId().equals("2"))
                        liveData.setValue(Constants.DELETE);
                    else
                        liveData.setValue(Constants.EDIT);
                    return false;
                });
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
