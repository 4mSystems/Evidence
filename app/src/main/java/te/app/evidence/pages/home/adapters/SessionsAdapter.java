package te.app.evidence.pages.home.adapters;

import android.content.Context;
import android.util.Log;
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
import te.app.evidence.databinding.ItemSessionBinding;
import te.app.evidence.pages.home.viewModels.SessionItemViewModel;
import te.app.evidence.pages.sessions.SessionItem;
import te.app.evidence.utils.helper.MovementHelper;

public class SessionsAdapter extends RecyclerView.Adapter<SessionsAdapter.ViewHolder> {
    List<SessionItem> sessionItemList;
    Context context;

    public SessionsAdapter() {
        this.sessionItemList = new ArrayList<>();
    }

    public List<SessionItem> getSessionItemList() {
        return sessionItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_session,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SessionItem sessionItem = sessionItemList.get(position);
        SessionItemViewModel itemMenuViewModel = new SessionItemViewModel(sessionItem);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {

        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<SessionItem> dataList) {
        Log.e("update", "update: " + dataList.size());
        this.sessionItemList.clear();
        sessionItemList.addAll(dataList);
        Log.e("update", "update: " + sessionItemList.size());
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
        return sessionItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemSessionBinding itemMenuBinding;

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

        void setViewModel(SessionItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}