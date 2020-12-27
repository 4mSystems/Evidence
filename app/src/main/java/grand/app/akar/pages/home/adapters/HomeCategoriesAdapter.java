package grand.app.akar.pages.home.adapters;

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

import grand.app.akar.R;
import grand.app.akar.databinding.ItemCategoryBinding;
import grand.app.akar.databinding.ItemHomeCategoryBinding;
import grand.app.akar.pages.ads.itemViewModels.ItemCategoryViewModel;
import grand.app.akar.pages.ads.models.CategoriesData;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.resources.ResourceManager;


public class HomeCategoriesAdapter extends RecyclerView.Adapter<HomeCategoriesAdapter.MenuView> {
    private List<CategoriesData> categoriesDataList;
    private Context context;
    public int lastId = 0;

    public HomeCategoriesAdapter() {
        this.categoriesDataList = new ArrayList<>();

    }
    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_category,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        CategoriesData menuModel = categoriesDataList.get(position);
        ItemCategoryViewModel itemMenuViewModel = new ItemCategoryViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            notifyItemChanged(lastId);
            lastId = position;
            notifyItemChanged(lastId);
        });
        if (lastId == position) {
            holder.itemMenuBinding.v16.setBackgroundColor(ResourceManager.getColor(R.color.white));
            holder.itemMenuBinding.tvHomeItem.setTextColor(ResourceManager.getColor(R.color.white));
        } else {
            holder.itemMenuBinding.v16.setBackgroundColor(ResourceManager.getColor(R.color.colorPrimary));
            holder.itemMenuBinding.tvHomeItem.setTextColor(ResourceManager.getColor(R.color.colorPrimaryHolo));
        }
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<CategoriesData> dataList) {
        this.categoriesDataList.clear();
        categoriesDataList.addAll(dataList);
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
        return categoriesDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemHomeCategoryBinding itemMenuBinding;

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

        void setViewModel(ItemCategoryViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
