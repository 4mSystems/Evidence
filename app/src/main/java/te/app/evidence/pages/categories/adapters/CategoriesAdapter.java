package te.app.evidence.pages.categories.adapters;

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
import te.app.evidence.databinding.ItemCategoryBinding;
import te.app.evidence.pages.categories.AddCategoryFragment;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.categories.viewModels.CategoriesItemViewModel;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.pages.users.UserPermissionsFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    List<CategoriesData> categoriesDataList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public CategoriesAdapter() {
        this.categoriesDataList = new ArrayList<>();
    }

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CategoriesData categoriesData = categoriesDataList.get(position);
        CategoriesItemViewModel itemMenuViewModel = new CategoriesItemViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.EDIT)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(categoriesData), ResourceManager.getString(R.string.edit_category), AddCategoryFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<CategoriesData> dataList) {
        this.categoriesDataList.clear();
        categoriesDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<CategoriesData> dataList) {
        int start = categoriesDataList.size();
        categoriesDataList.addAll(dataList);
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
        return categoriesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCategoryBinding itemMenuBinding;

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

        void setViewModel(CategoriesItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
