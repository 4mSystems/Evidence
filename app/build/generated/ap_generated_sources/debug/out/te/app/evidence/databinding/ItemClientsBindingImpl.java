package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClientsBindingImpl extends ItemClientsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_clients_header, 9);
        sViewsWithIds.put(R.id.icon_down_qu, 10);
        sViewsWithIds.put(R.id.v1, 11);
        sViewsWithIds.put(R.id.expansionLayoutClients, 12);
        sViewsWithIds.put(R.id.unit_text, 13);
        sViewsWithIds.put(R.id.v2, 14);
        sViewsWithIds.put(R.id.client_type_text, 15);
        sViewsWithIds.put(R.id.v5, 16);
        sViewsWithIds.put(R.id.client_address_text, 17);
        sViewsWithIds.put(R.id.v3, 18);
        sViewsWithIds.put(R.id.client_note_text, 19);
        sViewsWithIds.put(R.id.v4, 20);
        sViewsWithIds.put(R.id.attachments, 21);
        sViewsWithIds.put(R.id.br5, 22);
        sViewsWithIds.put(R.id.v8, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClientsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ItemClientsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (androidx.constraintlayout.widget.Barrier) bindings[22]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[23]
            );
        this.clientAddressValue.setTag(null);
        this.clientNoteValue.setTag(null);
        this.clientTypeValue.setTag(null);
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.permission.setTag(null);
        this.tvQualifications.setTag(null);
        this.unitValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback7 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback5 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.evidence.pages.clients.viewModels.ClientsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.clients.viewModels.ClientsItemViewModel ItemViewModel) {
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
        else if (fieldId == BR.clients) {
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
        java.lang.String itemViewModelClientsClientUnit = null;
        te.app.evidence.pages.clients.models.Clients itemViewModelClients = null;
        java.lang.String itemViewModelClientsClientName = null;
        te.app.evidence.pages.clients.viewModels.ClientsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelClientsType = null;
        java.lang.String itemViewModelClientsClientAddress = null;
        java.lang.String itemViewModelClientsNotes = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.clients
                    itemViewModelClients = itemViewModel.getClients();
                }


                if (itemViewModelClients != null) {
                    // read itemViewModel.clients.clientUnit
                    itemViewModelClientsClientUnit = itemViewModelClients.getClientUnit();
                    // read itemViewModel.clients.clientName
                    itemViewModelClientsClientName = itemViewModelClients.getClientName();
                    // read itemViewModel.clients.type
                    itemViewModelClientsType = itemViewModelClients.getType();
                    // read itemViewModel.clients.clientAddress
                    itemViewModelClientsClientAddress = itemViewModelClients.getClientAddress();
                    // read itemViewModel.clients.notes
                    itemViewModelClientsNotes = itemViewModelClients.getNotes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientAddressValue, itemViewModelClientsClientAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNoteValue, itemViewModelClientsNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientTypeValue, itemViewModelClientsType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQualifications, itemViewModelClientsClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unitValue, itemViewModelClientsClientUnit);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback6);
            this.edit.setOnClickListener(mCallback7);
            this.permission.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.viewModels.ClientsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toDelete();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.viewModels.ClientsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toEdit();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.viewModels.ClientsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toClientProfile();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.clients
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}