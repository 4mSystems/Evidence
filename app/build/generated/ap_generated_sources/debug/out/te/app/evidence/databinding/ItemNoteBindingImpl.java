package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNoteBindingImpl extends ItemNoteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_clients_header, 1);
        sViewsWithIds.put(R.id.icon_down_qu, 2);
        sViewsWithIds.put(R.id.tv_qualifications, 3);
        sViewsWithIds.put(R.id.v1, 4);
        sViewsWithIds.put(R.id.expansionLayoutClients, 5);
        sViewsWithIds.put(R.id.unit_text, 6);
        sViewsWithIds.put(R.id.unit_value, 7);
        sViewsWithIds.put(R.id.v3, 8);
        sViewsWithIds.put(R.id.client_note_text, 9);
        sViewsWithIds.put(R.id.client_note_value, 10);
        sViewsWithIds.put(R.id.v4, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[10]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setItemViewModel((te.app.evidence.pages.clients.viewModels.ClientsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.clients.viewModels.ClientsItemViewModel ItemViewModel) {
        this.mItemViewModel = ItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.evidence.pages.clients.viewModels.ClientsItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.clients.viewModels.ClientsItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}