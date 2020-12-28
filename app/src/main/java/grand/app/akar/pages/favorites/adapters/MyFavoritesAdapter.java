package grand.app.akar.pages.favorites.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.databinding.ItemFavoritesBinding;
import grand.app.akar.databinding.ItemHomeBinding;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.pages.home.viewModels.ItemHomeViewModel;


public class MyFavoritesAdapter extends RecyclerView.Adapter<MyFavoritesAdapter.MenuView> {
    private List<HomeData> homeDataList;
    private MutableLiveData<Integer> liveDataAdapter = new MutableLiveData<>();
    private Context context;
    public int lastPosition;

    public MyFavoritesAdapter() {
        this.homeDataList = new ArrayList<>();
    }

    public List<HomeData> getHomeDataList() {
        return homeDataList;
    }

    public MutableLiveData<Integer> getLiveDataAdapter() {
        return liveDataAdapter;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorites,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        HomeData menuModel = homeDataList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            lastPosition = position;
            liveDataAdapter.setValue(menuModel.getId());
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<HomeData> dataList) {
        this.homeDataList.clear();
        homeDataList.addAll(dataList);
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
        return homeDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemFavoritesBinding itemMenuBinding;

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

        void setViewModel(ItemHomeViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemHomeViewModel(itemViewModels);
            }
        }
    }
}
