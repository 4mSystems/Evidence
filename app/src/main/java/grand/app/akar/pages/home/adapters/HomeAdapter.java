package grand.app.akar.pages.home.adapters;

import android.content.Context;
import android.util.Log;
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

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.databinding.ItemHomeBinding;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.pages.home.viewModels.ItemHomeViewModel;
import grand.app.akar.utils.helper.MovementHelper;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MenuView> implements Filterable {
    private List<HomeData> homeDataList;
    private List<HomeData> homeDataListFiltered;
    private MutableLiveData<Integer> liveDataAdapter = new MutableLiveData<>();
    private Context context;

    public HomeAdapter() {
        this.homeDataList = new ArrayList<>();
        this.homeDataListFiltered = homeDataList;

    }

    public MutableLiveData<Integer> getLiveDataAdapter() {
        return liveDataAdapter;
    }

    public List<HomeData> getHomeDataListFiltered() {
        return homeDataListFiltered;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        HomeData menuModel = homeDataListFiltered.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
//        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel), menuModel.getName(), MarketMainFragment.class.getName(), null));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<HomeData> dataList) {
        this.homeDataListFiltered.clear();
        homeDataListFiltered.addAll(dataList);
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
        return homeDataListFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    homeDataListFiltered = homeDataList;
                } else {
                    List<HomeData> filteredList = new ArrayList<>();
                    for (HomeData row : homeDataList) {
                        if (row.getPrice().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    homeDataListFiltered = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = homeDataListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                homeDataListFiltered = (ArrayList<HomeData>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemHomeBinding itemMenuBinding;

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
