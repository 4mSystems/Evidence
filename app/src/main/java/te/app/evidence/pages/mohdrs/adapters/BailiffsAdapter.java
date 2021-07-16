package te.app.evidence.pages.mohdrs.adapters;

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

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.databinding.ItemBailiffsBinding;
import te.app.evidence.pages.mohdrs.ReportersDetailsFragment;
import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class BailiffsAdapter extends RecyclerView.Adapter<BailiffsAdapter.ViewHolder> {
    List<ReportersData> bailiffsDataList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public BailiffsAdapter() {
        this.bailiffsDataList = new ArrayList<>();
    }

    public List<ReportersData> getBailiffsDataList() {
        return bailiffsDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bailiffs,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ReportersData reportersData = bailiffsDataList.get(position);
        BailiffsItemViewModel itemMenuViewModel = new BailiffsItemViewModel(reportersData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.EDIT)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(reportersData), ResourceManager.getString(R.string.edit_user), AddUserFragment.class.getName(), null);
            } else if (o.equals(Constants.VIEW)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(reportersData.getMohId()), ResourceManager.getString(R.string.reporter_details), ReportersDetailsFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            } else if (o.equals(Constants.CHANGE_STATUS)) {
                actionLiveData.setValue(o);
            }
        });
        if (reportersData.getStatus().equals(ResourceManager.getString(R.string.reporter_status_done)))
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.successColor));
        else
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.colorAccent));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ReportersData> dataList) {
        this.bailiffsDataList.clear();
        bailiffsDataList.addAll(dataList);
        notifyDataSetChanged();
    }
    public void loadMore(@NotNull List<ReportersData> dataList) {
        int start = bailiffsDataList.size();
        bailiffsDataList.addAll(dataList);
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
        return bailiffsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemBailiffsBinding itemMenuBinding;

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

        void setViewModel(BailiffsItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
