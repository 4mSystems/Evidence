package te.app.evidence.pages.reports.adapters;

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
import te.app.evidence.databinding.ItemClientsBinding;
import te.app.evidence.databinding.ItemReportBinding;
import te.app.evidence.pages.attachments.AttachmentsFragment;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.ClientProfileFragment;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.viewModels.ClientsItemViewModel;
import te.app.evidence.pages.reports.models.ReportsData;
import te.app.evidence.pages.reports.viewModels.ReportItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class ReportsAdapter extends RecyclerView.Adapter<ReportsAdapter.ViewHolder> {
    List<ReportsData> reportsDataList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public ReportsAdapter() {
        this.reportsDataList = new ArrayList<>();
    }

    public List<ReportsData> getReportsDataList() {
        return reportsDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_report,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        ReportsData client = reportsDataList.get(position);
        ReportItemViewModel itemMenuViewModel = new ReportItemViewModel(client);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ReportsData> dataList) {
        this.reportsDataList.clear();
        reportsDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<ReportsData> dataList) {
        int start = reportsDataList.size();
        reportsDataList.addAll(dataList);
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
        return reportsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemReportBinding itemMenuBinding;

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

        void setViewModel(ReportItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
