package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserBindingImpl extends ItemUserBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_session_header, 9);
        sViewsWithIds.put(R.id.icon_down_qu, 10);
        sViewsWithIds.put(R.id.v1, 11);
        sViewsWithIds.put(R.id.expansionLayoutSessions, 12);
        sViewsWithIds.put(R.id.email_text, 13);
        sViewsWithIds.put(R.id.v2, 14);
        sViewsWithIds.put(R.id.user_type_text, 15);
        sViewsWithIds.put(R.id.v3, 16);
        sViewsWithIds.put(R.id.user_phone_text, 17);
        sViewsWithIds.put(R.id.v4, 18);
        sViewsWithIds.put(R.id.user_address_text, 19);
        sViewsWithIds.put(R.id.v5, 20);
        sViewsWithIds.put(R.id.br5, 21);
        sViewsWithIds.put(R.id.v8, 22);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ItemUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[22]
            );
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.emailValue.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.permission.setTag(null);
        this.tvUsername.setTag(null);
        this.userAddressValue.setTag(null);
        this.userPhoneValue.setTag(null);
        this.userTypeValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback42 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback44 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
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
            setItemViewModel((te.app.evidence.pages.users.viewModels.UserItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.users.viewModels.UserItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.users.viewModels.UserItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.users.viewModels.UserItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.systemUserData) {
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
        java.lang.String itemViewModelSystemUserDataType = null;
        java.lang.String itemViewModelSystemUserDataName = null;
        te.app.evidence.pages.users.viewModels.UserItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelSystemUserDataAddress = null;
        java.lang.String itemViewModelSystemUserDataPhone = null;
        java.lang.String itemViewModelSystemUserDataEmail = null;
        te.app.evidence.pages.users.models.SystemUserData itemViewModelSystemUserData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.systemUserData
                    itemViewModelSystemUserData = itemViewModel.getSystemUserData();
                }


                if (itemViewModelSystemUserData != null) {
                    // read itemViewModel.systemUserData.type
                    itemViewModelSystemUserDataType = itemViewModelSystemUserData.getType();
                    // read itemViewModel.systemUserData.name
                    itemViewModelSystemUserDataName = itemViewModelSystemUserData.getName();
                    // read itemViewModel.systemUserData.address
                    itemViewModelSystemUserDataAddress = itemViewModelSystemUserData.getAddress();
                    // read itemViewModel.systemUserData.phone
                    itemViewModelSystemUserDataPhone = itemViewModelSystemUserData.getPhone();
                    // read itemViewModel.systemUserData.email
                    itemViewModelSystemUserDataEmail = itemViewModelSystemUserData.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback43);
            this.edit.setOnClickListener(mCallback44);
            this.permission.setOnClickListener(mCallback42);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailValue, itemViewModelSystemUserDataEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, itemViewModelSystemUserDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userAddressValue, itemViewModelSystemUserDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userPhoneValue, itemViewModelSystemUserDataPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userTypeValue, itemViewModelSystemUserDataType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.users.viewModels.UserItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toDelete();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.users.viewModels.UserItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toUserPermission();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.users.viewModels.UserItemViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.systemUserData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}