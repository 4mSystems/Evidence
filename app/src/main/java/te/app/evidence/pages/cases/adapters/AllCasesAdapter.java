package te.app.evidence.pages.cases.adapters;

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
import te.app.evidence.databinding.ItemAllCaseBinding;
import te.app.evidence.pages.cases.CaseDetailsFragment;
import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class AllCasesAdapter extends RecyclerView.Adapter<AllCasesAdapter.ViewHolder> {
    List<Cases> casesList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public AllCasesAdapter() {
        this.casesList = new ArrayList<>();
    }

    public List<Cases> getCasesList() {
        return casesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_case,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Cases client = casesList.get(position);
        ClientCasesItemViewModel itemMenuViewModel = new ClientCasesItemViewModel(client);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.CASE_DETAILS)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(client.getId()), ResourceManager.getString(R.string.case_details), CaseDetailsFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Cases> dataList) {
        this.casesList.clear();
        casesList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<Cases> dataList) {
        int start = casesList.size();
        casesList.addAll(dataList);
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
        return casesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemAllCaseBinding itemMenuBinding;

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

        void setViewModel(ClientCasesItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
