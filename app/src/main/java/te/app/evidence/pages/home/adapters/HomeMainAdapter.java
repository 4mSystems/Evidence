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
import te.app.evidence.R;
import te.app.evidence.databinding.ItemHomeMainBinding;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.pages.home.models.HomeMainObject;
import te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel;
import te.app.evidence.utils.helper.MovementHelper;

public class HomeMainAdapter extends RecyclerView.Adapter<HomeMainAdapter.ViewHolder> {
    List<HomeMainObject> mainObjectList;
    Context context;

    public HomeMainAdapter() {
        this.mainObjectList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_main,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        HomeMainObject dataModel = mainObjectList.get(position);
        ItemMainObjectViewModel itemMenuViewModel = new ItemMainObjectViewModel(dataModel);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            if (dataModel.getFragment().equals(HomeFragment.class.getName()))
                MovementHelper.startActivityMain(context);
            else
                MovementHelper.startActivity(context, dataModel.getFragment(), dataModel.getText(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<HomeMainObject> dataList) {
        this.mainObjectList.clear();
        mainObjectList.addAll(dataList);
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
        return mainObjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemHomeMainBinding itemMenuBinding;

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

        void setViewModel(ItemMainObjectViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
