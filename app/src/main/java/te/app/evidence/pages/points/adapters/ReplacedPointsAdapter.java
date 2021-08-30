package te.app.evidence.pages.points.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import te.app.evidence.databinding.ItemReplacedPointsBinding;
import te.app.evidence.pages.categories.AddCategoryFragment;
import te.app.evidence.pages.categories.viewModels.CategoriesItemViewModel;
import te.app.evidence.pages.points.models.ReplacedPoints;
import te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.AppHelper;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class ReplacedPointsAdapter extends RecyclerView.Adapter<ReplacedPointsAdapter.ViewHolder> {
    List<ReplacedPoints> replacedPointsList;
    Context context;

    public ReplacedPointsAdapter() {
        this.replacedPointsList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_replaced_points,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ReplacedPoints categoriesData = replacedPointsList.get(position);
        ItemReplacedPointsViewModel itemMenuViewModel = new ItemReplacedPointsViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            AppHelper.shareCustom(((Activity) context), ResourceManager.getString(R.string.invite_friend), ResourceManager.getString(R.string.invite_code).concat("\n").concat(itemMenuViewModel.userData.getUserData().getUser_code()));
        });

        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ReplacedPoints> dataList) {
        this.replacedPointsList.clear();
        replacedPointsList.addAll(dataList);
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
        return replacedPointsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemReplacedPointsBinding itemMenuBinding;

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

        void setViewModel(ItemReplacedPointsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
