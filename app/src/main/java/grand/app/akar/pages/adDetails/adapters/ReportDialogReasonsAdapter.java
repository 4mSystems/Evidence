package grand.app.akar.pages.adDetails.adapters;

import android.content.Context;
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

import grand.app.akar.R;
import grand.app.akar.databinding.ItemReasonsBinding;
import grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel;
import grand.app.akar.pages.splash.models.ReasonsItem;


public class ReportDialogReasonsAdapter extends RecyclerView.Adapter<ReportDialogReasonsAdapter.MenuView> {
     List<ReasonsItem> reasonsItemList;
     Context context;
     MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public ReportDialogReasonsAdapter() {
        this.reasonsItemList = new ArrayList<>();

    }

    public MutableLiveData<Integer> getLiveData() {
        return liveData;
    }

    public List<ReasonsItem> getReasonsItemList() {
        return reasonsItemList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reasons,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        ReasonsItem menuModel = reasonsItemList.get(position);
        ItemReasonsViewModel itemMenuViewModel = new ItemReasonsViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ReasonsItem> dataList) {
        this.reasonsItemList.clear();
        reasonsItemList.addAll(dataList);
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
        return reasonsItemList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemReasonsBinding itemMenuBinding;

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

        void setViewModel(ItemReasonsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
