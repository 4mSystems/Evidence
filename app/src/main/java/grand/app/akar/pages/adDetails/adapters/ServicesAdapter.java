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
import grand.app.akar.databinding.ItemAdDetailsServicesBinding;
import grand.app.akar.pages.adDetails.viewModels.ItemServicesViewModel;


public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.MenuView> {
    ArrayList<String> arrayList;
    Context context;
    MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public ServicesAdapter() {
        this.arrayList = new ArrayList<>();

    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ad_details_services,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        String menuModel = arrayList.get(position);
        ItemServicesViewModel itemMenuViewModel = new ItemServicesViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<String> dataList) {
        this.arrayList.clear();
        arrayList.addAll(dataList);
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
        return arrayList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemAdDetailsServicesBinding itemMenuBinding;

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

        void setViewModel(ItemServicesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
