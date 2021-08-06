package te.app.evidence.pages.home.adapters;

import android.content.Context;
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

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.databinding.ItemHomeReporterBinding;
import te.app.evidence.pages.mohdrs.ReportersDetailsFragment;
import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class HomeReportersAdapter extends RecyclerView.Adapter<HomeReportersAdapter.ViewHolder> {
    List<ReportersData> bailiffsDataList;
    Context context;

    public HomeReportersAdapter() {
        this.bailiffsDataList = new ArrayList<>();
    }

    public List<ReportersData> getBailiffsDataList() {
        return bailiffsDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_reporter,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        ReportersData user = bailiffsDataList.get(position);
        BailiffsItemViewModel itemMenuViewModel = new BailiffsItemViewModel(user);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            if (o.equals(Constants.VIEW)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(user.getMohId()), ResourceManager.getString(R.string.reporter_details), ReportersDetailsFragment.class.getName(), null);
            }
        });
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
        public ItemHomeReporterBinding itemMenuBinding;

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
