package te.app.evidence.pages.places.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.R;
import te.app.evidence.databinding.ItemGovernBinding;
import te.app.evidence.pages.places.models.GovernmentData;
import te.app.evidence.pages.places.viewModels.ItemGovernViewModel;


public class GovernAdapter extends RecyclerView.Adapter<GovernAdapter.ViewHolder> implements Filterable {
    List<GovernmentData> governmentDataList, governmentDataListFilter;
    Context context;
    public MutableLiveData<GovernmentData> liveData = new MutableLiveData<>();

    public GovernAdapter() {
        this.governmentDataList = new ArrayList<>();
        this.governmentDataListFilter = this.governmentDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_govern,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        GovernmentData dataModel = governmentDataListFilter.get(position);
        ItemGovernViewModel itemMenuViewModel = new ItemGovernViewModel(dataModel);
        itemMenuViewModel.getLiveData().observeForever(o -> liveData.setValue(dataModel));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<GovernmentData> dataList) {
        this.governmentDataListFilter.clear();
        governmentDataListFilter.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    governmentDataListFilter = governmentDataList;
                } else {
                    List<GovernmentData> filteredList = new ArrayList<>();
                    for (GovernmentData row : governmentDataList) {
                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getName().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    governmentDataListFilter = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = governmentDataListFilter;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                governmentDataListFilter = (ArrayList<GovernmentData>) filterResults.values;
                notifyDataSetChanged();
            }
        };
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
        return governmentDataListFilter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemGovernBinding itemMenuBinding;

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

        void setViewModel(ItemGovernViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
