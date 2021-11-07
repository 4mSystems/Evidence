package te.app.evidence.pages.attachments.adapters;

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

import te.app.evidence.R;
import te.app.evidence.databinding.ItemAttachmentBinding;
import te.app.evidence.pages.attachments.models.Attachment;
import te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.helper.AppHelper;

public class AttachmentsAdapter extends RecyclerView.Adapter<AttachmentsAdapter.ViewHolder> {
    List<Attachment> attachmentList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public AttachmentsAdapter() {
        this.attachmentList = new ArrayList<>();
    }

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_attachment,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Attachment attachment = attachmentList.get(position);
        AttachmentsItemViewModel itemMenuViewModel = new AttachmentsItemViewModel(attachment);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) context, o -> {
            lastSelected = position;
            if (o.equals(Constants.MENu))
                AppHelper.download(URLS.CASE_ATTACHMENTS_BASE_URL.concat(attachment.getImgUrl()), attachment.getImgDescription().concat(attachment.getImgUrl().substring(attachment.getImgUrl().lastIndexOf("."))), context);
            else
                actionLiveData.setValue(o);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Attachment> dataList) {
        this.attachmentList.clear();
        attachmentList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<Attachment> dataList) {
        int start = attachmentList.size();
        attachmentList.addAll(dataList);
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
        return attachmentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemAttachmentBinding itemMenuBinding;

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

        void setViewModel(AttachmentsItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
