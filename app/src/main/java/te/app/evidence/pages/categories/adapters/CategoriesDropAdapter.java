package te.app.evidence.pages.categories.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.pages.categories.models.CategoriesData;


public class CategoriesDropAdapter extends BaseAdapter implements Filterable {
    public List<CategoriesData> categoriesDataList, categoriesDataListFiltered;
    Context context;
    public String selectId;

    public CategoriesDropAdapter(List<CategoriesData> categoriesDataList) {
        this.categoriesDataList = categoriesDataList;
        this.categoriesDataListFiltered = this.categoriesDataList;
    }

    public CategoriesDropAdapter() {
    }

    @Override
    public int getCount() {
        return categoriesDataListFiltered != null ? categoriesDataListFiltered.size() : categoriesDataList.size();
    }

    @Override
    public CategoriesData getItem(int position) {
        return categoriesDataListFiltered.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        this.context = parent.getContext();
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.item_drop_category, parent, false);
        }
        CategoriesData currentItem = getItem(position);
        CustomTextViewMedium textViewItemName = convertView.findViewById(R.id.tv_drop_cat);
        textViewItemName.setText(currentItem.getName());
        if (position == categoriesDataList.size() - 1)
            convertView.findViewById(R.id.v_drop).setVisibility(View.GONE);
        return convertView;
    }

    @Override
    public Filter getFilter() {
        return nameFilter;
    }

    Filter nameFilter = new Filter() {
        @Override
        public CharSequence convertResultToString(Object resultValue) {
            return ((CategoriesData) resultValue).getName();
        }

        @Override
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charString = charSequence.toString();
            if (charString.isEmpty()) {
                categoriesDataListFiltered = categoriesDataList;
            } else {
                List<CategoriesData> filteredList = new ArrayList<>();
                for (CategoriesData row : categoriesDataList) {
                    if (row.getName().toLowerCase().contains(charString.toLowerCase())) {
                        filteredList.add(row);
                    }
                }

                categoriesDataListFiltered = filteredList;
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = categoriesDataListFiltered;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, Filter.FilterResults
                filterResults) {
            categoriesDataListFiltered = (ArrayList<CategoriesData>) filterResults.values;
            notifyDataSetChanged();
        }
    };
}
