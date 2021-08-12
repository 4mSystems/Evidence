package te.app.evidence.pages.settings.adapters;

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

import te.app.evidence.R;
import te.app.evidence.databinding.ItemPackageBinding;
import te.app.evidence.pages.settings.models.Packages;
import te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.ViewHolder> {
    List<Packages> packagesList;
    Context context;
   public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public PackagesAdapter() {
        this.packagesList = new ArrayList<>();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_package,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Packages client = packagesList.get(position);
        ItemPackagesViewModel itemMenuViewModel = new ItemPackagesViewModel(client);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) context, o -> liveData.setValue(client.getId()));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Packages> dataList) {
        this.packagesList.clear();
        packagesList.addAll(dataList);
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
        return packagesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPackageBinding itemMenuBinding;

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

        void setViewModel(ItemPackagesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
