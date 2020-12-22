package grand.app.akar.pages.ads.adapter;

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
import grand.app.akar.databinding.ItemCityBinding;
import grand.app.akar.pages.ads.itemViewModels.ItemCategoryViewModel;
import grand.app.akar.pages.ads.itemViewModels.ItemCityViewModel;
import grand.app.akar.pages.ads.models.CategoriesData;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.resources.ResourceManager;


public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.MenuView> {
    private List<Cities> citiesList;
    private Context context;
    public int lastId = 0;

    public CitiesAdapter() {
        this.citiesList = new ArrayList<>();

    }

    public List<Cities> getCitiesList() {
        return citiesList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        Cities menuModel = citiesList.get(position);
        ItemCityViewModel itemMenuViewModel = new ItemCityViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            lastId = position;
            notifyDataSetChanged();
        });
        if (lastId == position) {
            holder.itemMenuBinding.catToggle.setImageBitmap(AppHelper.convertVectorToBitMap(ResourceManager.getDrawable(R.drawable.ic_toggel_category)));
        } else
            holder.itemMenuBinding.catToggle.setImageResource(R.color.white);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Cities> dataList) {
        this.citiesList.clear();
        citiesList.addAll(dataList);
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
        return citiesList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemCityBinding itemMenuBinding;

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

        void setViewModel(ItemCityViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
