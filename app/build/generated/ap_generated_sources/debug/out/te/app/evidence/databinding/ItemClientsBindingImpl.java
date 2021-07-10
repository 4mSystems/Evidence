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
        sViewsWithIds.put(R.id.name_text, 9);
        sViewsWithIds.put(R.id.v1, 10);
        sViewsWithIds.put(R.id.unit_text, 11);
        sViewsWithIds.put(R.id.v2, 12);
        sViewsWithIds.put(R.id.client_type_text, 13);
        sViewsWithIds.put(R.id.v5, 14);
        sViewsWithIds.put(R.id.client_address_text, 15);
        sViewsWithIds.put(R.id.v3, 16);
        sViewsWithIds.put(R.id.client_note_text, 17);
        sViewsWithIds.put(R.id.v4, 18);
        sViewsWithIds.put(R.id.attachments, 19);
        sViewsWithIds.put(R.id.br5, 20);
        sViewsWithIds.put(R.id.v8, 21);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClientsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ItemClientsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (androidx.constraintlayout.widget.Barrier) bindings[20]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[21]
            );
        this.clientAddressValue.setTag(null);
        this.clientNoteValue.setTag(null);
        this.clientTypeValue.setTag(null);
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.nameValue.setTag(null);
        this.permission.setTag(null);
        this.unitValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback6 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback7 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelClientsClientUnit = null;
        te.app.evidence.pages.clients.models.Clients itemViewModelClients = null;
        java.lang.String itemViewModelClientsClientName = null;
        te.app.evidence.pages.clients.viewModels.ClientsItemViewModel itemViewModel = mItemViewModel;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        java.lang.String itemViewModelClientsType = null;
        java.lang.String itemViewModelClientsClientAddress = null;
        java.lang.String itemViewModelUserDataUserDataType = null;
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
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.userData
                        itemViewModelUserData = itemViewModel.userData;
                    }


                    if (itemViewModelUserData != null) {
                        // read itemViewModel.userData.userData
                        itemViewModelUserDataUserData = itemViewModelUserData.getUserData();
                    }


                    if (itemViewModelUserDataUserData != null) {
                        // read itemViewModel.userData.userData.type
                        itemViewModelUserDataUserDataType = itemViewModelUserDataUserData.getType();
                    }


                    if (itemViewModelUserDataUserDataType != null) {
                        // read itemViewModel.userData.userData.type.equals("admin")
                        itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = itemViewModelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }


                    // read itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientAddressValue, itemViewModelClientsClientAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNoteValue, itemViewModelClientsNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientTypeValue, itemViewModelClientsType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameValue, itemViewModelClientsClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unitValue, itemViewModelClientsClientUnit);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback7);
            this.edit.setOnClickListener(mCallback8);
            this.permission.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.delete.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            this.edit.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.clients
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}