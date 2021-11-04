package te.app.evidence.pages.publicFiles.adapters;

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
import te.app.evidence.databinding.ItemPublicFileBinding;
import te.app.evidence.pages.publicFiles.models.PublicFilesData;
import te.app.evidence.pages.publicFiles.viewModels.ItemFilesViewModel;
import te.app.evidence.utils.helper.AppHelper;

public class PublicFilesAdapter extends RecyclerView.Adapter<PublicFilesAdapter.ViewHolder> {
    List<PublicFilesData> publicFilesDataList;
    Context context;

    public PublicFilesAdapter() {
        this.publicFilesDataList = new ArrayList<>();
    }

    public List<PublicFilesData> getPublicFilesDataList() {
        return publicFilesDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_public_file,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        PublicFilesData file = publicFilesDataList.get(position);
        ItemFilesViewModel itemMenuViewModel = new ItemFilesViewModel(file);
        itemMenuViewModel.getLiveData().observeForever(o -> AppHelper.openBrowser(context, file.getFile()));
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<PublicFilesData> dataList) {
        this.publicFilesDataList.clear();
        publicFilesDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<PublicFilesData> dataList) {
        int start = publicFilesDataList.size();
        publicFilesDataList.addAll(dataList);
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
        return publicFilesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPublicFileBinding itemMenuBinding;

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

        void setViewModel(ItemFilesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
