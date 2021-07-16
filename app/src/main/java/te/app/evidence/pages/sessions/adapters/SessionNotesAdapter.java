package te.app.evidence.pages.sessions.adapters;

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
import te.app.evidence.databinding.ItemSessionNoteBinding;
import te.app.evidence.pages.clients.notes.AddNoteFragment;
import te.app.evidence.pages.clients.notes.models.Notes;
import te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel;
import te.app.evidence.pages.sessions.models.SessionItem;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class SessionNotesAdapter extends RecyclerView.Adapter<SessionNotesAdapter.ViewHolder> {
    List<Notes> notesList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<Object> actionLiveData = new MutableLiveData<>();

    public SessionNotesAdapter() {
        this.notesList = new ArrayList<>();
    }

    public List<Notes> getNotesList() {
        return notesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_session_note,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Notes notes = notesList.get(position);
        NotesItemViewModel itemMenuViewModel = new NotesItemViewModel(notes);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = position;
            if (o.equals(Constants.EDIT)) {
                notes.setWhoNotes(Constants.SESSION_NOTES);
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(notes), ResourceManager.getString(R.string.edit_note), AddNoteFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                actionLiveData.setValue(o);
            } else if (o.equals(Constants.CHANGE_STATUS)) {
                actionLiveData.setValue(o);
            }
        });
        if (notes.getStatus().equals(ResourceManager.getString(R.string.reporter_status_done)))
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.successColor));
        else
            holder.itemMenuBinding.statusValue.setBackgroundColor(ResourceManager.getColor(R.color.colorAccent));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Notes> dataList) {
        this.notesList.clear();
        notesList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<Notes> dataList) {
        int start = notesList.size();
        notesList.addAll(dataList);
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
        return notesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemSessionNoteBinding itemMenuBinding;

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

        void setViewModel(NotesItemViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
