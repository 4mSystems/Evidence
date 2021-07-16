package te.app.evidence.pages.home.adapters;

import android.annotation.SuppressLint;
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
import te.app.evidence.databinding.ItemSessionBinding;
import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.pages.home.viewModels.SessionItemViewModel;
import te.app.evidence.pages.sessions.AddSessionFragment;
import te.app.evidence.pages.sessions.SessionNotesFragment;
import te.app.evidence.pages.sessions.models.SessionItem;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class SessionsAdapter extends RecyclerView.Adapter<SessionsAdapter.ViewHolder> {
    List<SessionItem> sessionItemList;
    Context context;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();
    public int lastSelected = -1;

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
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        SessionItem sessionItem = sessionItemList.get(position);
        SessionItemViewModel itemMenuViewModel = new SessionItemViewModel(sessionItem);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.EDIT)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(sessionItem), ResourceManager.getString(R.string.edit_session), AddSessionFragment.class.getName(), null);
            } else if (o.equals(Constants.NOTES)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(sessionItem.getId()), ResourceManager.getString(R.string.client_notes), SessionNotesFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            } else if (o.equals(Constants.CHANGE_STATUS)) {
                actionLiveData.setValue(o);
            }
        });
        if (sessionItem.getStatus().equals(ResourceManager.getString(R.string.reporter_status_done)))
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.successColor));
        else
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.colorAccent));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<SessionItem> dataList) {
        this.sessionItemList.clear();
        sessionItemList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<SessionItem> dataList) {
        int start = sessionItemList.size();
        sessionItemList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
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
