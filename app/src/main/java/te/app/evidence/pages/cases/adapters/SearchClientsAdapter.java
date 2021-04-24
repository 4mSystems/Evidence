package te.app.evidence.pages.cases.adapters;

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
import te.app.evidence.databinding.ItemClientSearchBinding;
import te.app.evidence.databinding.ItemClientsBinding;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.ClientProfileFragment;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.viewModels.ClientsItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class SearchClientsAdapter extends RecyclerView.Adapter<SearchClientsAdapter.ViewHolder> {
    List<Clients> clientsList;
    Context context;

    public SearchClientsAdapter() {
        this.clientsList = new ArrayList<>();
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_client_search,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Clients client = clientsList.get(position);
        ClientsItemViewModel itemMenuViewModel = new ClientsItemViewModel(client);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {

        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Clients> dataList) {
        this.clientsList.clear();
        clientsList.addAll(dataList);
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
        return clientsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemClientSearchBinding itemMenuBinding;

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

        void setViewModel(ClientsItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
