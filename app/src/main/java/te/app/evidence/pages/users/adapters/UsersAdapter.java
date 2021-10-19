package te.app.evidence.pages.users.adapters;

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
import te.app.evidence.databinding.ItemUserBinding;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.pages.users.UserPermissionsFragment;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.pages.users.viewModels.UserItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder> {
    List<SystemUserData> systemUserDataList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public UsersAdapter() {
        this.systemUserDataList = new ArrayList<>();
    }

    public List<SystemUserData> getSystemUserDataList() {
        return systemUserDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        SystemUserData user = systemUserDataList.get(position);
        UserItemViewModel itemMenuViewModel = new UserItemViewModel(user);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.EDIT)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(user), ResourceManager.getString(R.string.edit_user), AddUserFragment.class.getName(), null);
            } else if (o.equals(Constants.USER_PERMISSION)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(user.getId()), ResourceManager.getString(R.string.user_permission), UserPermissionsFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<SystemUserData> dataList) {
        this.systemUserDataList.clear();
        systemUserDataList.addAll(dataList);
    }

    public void loadMore(@NotNull List<SystemUserData> dataList) {
        int start = systemUserDataList.size();
        systemUserDataList.addAll(dataList);
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
        return systemUserDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemUserBinding itemMenuBinding;

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

        void setViewModel(UserItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
