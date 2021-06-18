package te.app.evidence.pages.attachments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.R;
import te.app.evidence.databinding.ItemAttachmentBinding;
import te.app.evidence.pages.attachments.models.Attachment;
import te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel;

public class AttachmentsAdapter extends RecyclerView.Adapter<AttachmentsAdapter.ViewHolder> {
    List<Attachment> attachmentList;
    Context context;

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


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Attachment attachment = attachmentList.get(position);
        AttachmentsItemViewModel itemMenuViewModel = new AttachmentsItemViewModel(attachment);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Attachment> dataList) {
        this.attachmentList.clear();
        attachmentList.addAll(dataList);
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
