package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNoteBindingImpl extends ItemNoteBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_clients_header, 6);
        sViewsWithIds.put(R.id.icon_down_qu, 7);
        sViewsWithIds.put(R.id.v1, 8);
        sViewsWithIds.put(R.id.expansionLayoutClients, 9);
        sViewsWithIds.put(R.id.unit_text, 10);
        sViewsWithIds.put(R.id.v3, 11);
        sViewsWithIds.put(R.id.client_note_text, 12);
        sViewsWithIds.put(R.id.v4, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ItemNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            );
        this.clientNoteValue.setTag(null);
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmpName.setTag(null);
        this.unitValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback31 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.evidence.pages.notes.viewModels.NotesItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.notes.viewModels.NotesItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.evidence.pages.notes.viewModels.NotesItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.notes.viewModels.NotesItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notes) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        te.app.evidence.pages.auth.models.UserData itemViewModelNotesUser = null;
        java.lang.String itemViewModelNotesNotes = null;
        java.lang.String javaLangStringConcatStringValueOfItemViewModelNotesId = null;
        java.lang.String itemViewModelNotesUserName = null;
        te.app.evidence.pages.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
        java.lang.String stringValueOfItemViewModelNotesId = null;
        int itemViewModelNotesId = 0;
        te.app.evidence.pages.notes.models.Notes itemViewModelNotes = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.notes
                    itemViewModelNotes = itemViewModel.getNotes();
                }


                if (itemViewModelNotes != null) {
                    // read itemViewModel.notes.user
                    itemViewModelNotesUser = itemViewModelNotes.getUser();
                    // read itemViewModel.notes.notes
                    itemViewModelNotesNotes = itemViewModelNotes.getNotes();
                    // read itemViewModel.notes.id
                    itemViewModelNotesId = itemViewModelNotes.getId();
                }


                if (itemViewModelNotesUser != null) {
                    // read itemViewModel.notes.user.name
                    itemViewModelNotesUserName = itemViewModelNotesUser.getName();
                }
                // read String.valueOf(itemViewModel.notes.id)
                stringValueOfItemViewModelNotesId = java.lang.String.valueOf(itemViewModelNotesId);


                // read "#".concat(String.valueOf(itemViewModel.notes.id))
                javaLangStringConcatStringValueOfItemViewModelNotesId = "#".concat(stringValueOfItemViewModelNotesId);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNoteValue, itemViewModelNotesNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmpName, javaLangStringConcatStringValueOfItemViewModelNotesId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unitValue, itemViewModelNotesUserName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback30);
            this.edit.setOnClickListener(mCallback31);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toDelete();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toEdit();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.notes
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}