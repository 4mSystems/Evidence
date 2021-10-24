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
        sViewsWithIds.put(R.id.name_text, 10);
        sViewsWithIds.put(R.id.v1, 11);
        sViewsWithIds.put(R.id.email_text, 12);
        sViewsWithIds.put(R.id.v2, 13);
        sViewsWithIds.put(R.id.user_type_text, 14);
        sViewsWithIds.put(R.id.v3, 15);
        sViewsWithIds.put(R.id.user_phone_text, 16);
        sViewsWithIds.put(R.id.v4, 17);
        sViewsWithIds.put(R.id.user_address_text, 18);
        sViewsWithIds.put(R.id.br5, 19);
        sViewsWithIds.put(R.id.v8, 20);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ItemUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[18]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[20]
            );
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.emailValue.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.nameValue.setTag(null);
        this.permission.setTag(null);
        this.userAddressValue.setTag(null);
        this.userPhoneValue.setTag(null);
        this.userTypeValue.setTag(null);
        this.v5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback47 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback48 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelSystemUserDataTypeEqualsJavaLangStringAdminUserTypeValueAndroidStringAdminUserTypeValueAndroidStringUser = null;
        java.lang.String itemViewModelSystemUserDataName = null;
        te.app.evidence.pages.users.viewModels.UserItemViewModel itemViewModel = mItemViewModel;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        java.lang.String itemViewModelSystemUserDataAddress = null;
        java.lang.String itemViewModelSystemUserDataPhone = null;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewINVISIBLE = 0;
        boolean itemViewModelSystemUserDataTypeEqualsJavaLangStringAdmin = false;
        java.lang.String itemViewModelSystemUserDataEmail = null;
        te.app.evidence.pages.users.models.SystemUserData itemViewModelSystemUserData = null;
        java.lang.String itemViewModelUserDataUserDataType = null;

        if ((dirtyFlags & 0x7L) != 0) {


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
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.INVISIBLE
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewINVISIBLE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }

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


                if (itemViewModelSystemUserDataType != null) {
                    // read itemViewModel.systemUserData.type.equals("admin")
                    itemViewModelSystemUserDataTypeEqualsJavaLangStringAdmin = itemViewModelSystemUserDataType.equals("admin");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelSystemUserDataTypeEqualsJavaLangStringAdmin) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemViewModel.systemUserData.type.equals("admin") ? @android:string/admin : @android:string/user
                itemViewModelSystemUserDataTypeEqualsJavaLangStringAdminUserTypeValueAndroidStringAdminUserTypeValueAndroidStringUser = ((itemViewModelSystemUserDataTypeEqualsJavaLangStringAdmin) ? (userTypeValue.getResources().getString(R.string.admin)) : (userTypeValue.getResources().getString(R.string.user)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback48);
            this.edit.setOnClickListener(mCallback49);
            this.permission.setOnClickListener(mCallback47);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.delete.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            this.edit.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            this.permission.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            this.v5.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailValue, itemViewModelSystemUserDataEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameValue, itemViewModelSystemUserDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userAddressValue, itemViewModelSystemUserDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userPhoneValue, itemViewModelSystemUserDataPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userTypeValue, itemViewModelSystemUserDataTypeEqualsJavaLangStringAdminUserTypeValueAndroidStringAdminUserTypeValueAndroidStringUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.systemUserData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.systemUserData.type.equals("admin") ? @android:string/admin : @android:string/user
        flag 6 (0x7L): itemViewModel.systemUserData.type.equals("admin") ? @android:string/admin : @android:string/user
        flag 7 (0x8L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}