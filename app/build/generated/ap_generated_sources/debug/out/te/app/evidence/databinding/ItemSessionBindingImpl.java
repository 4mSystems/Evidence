package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionBindingImpl extends ItemSessionBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.session_date_text, 12);
        sViewsWithIds.put(R.id.v2, 13);
        sViewsWithIds.put(R.id.session_status_text, 14);
        sViewsWithIds.put(R.id.br_status, 15);
        sViewsWithIds.put(R.id.v3, 16);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[11]
            );
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionCaseNumber.setTag(null);
        this.sessionDateValue.setTag(null);
        this.sessionMonthText.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.sessionStatusValue.setTag(null);
        this.statusValue.setTag(null);
        this.tvUsername.setTag(null);
        this.v9.setTag(null);
        this.viewValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback64 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback62 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback63 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.evidence.pages.home.viewModels.SessionItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.home.viewModels.SessionItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.home.viewModels.SessionItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.home.viewModels.SessionItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.sessionItem) {
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
        te.app.evidence.pages.sessions.models.SessionItem itemViewModelSessionItem = null;
        boolean textUtilsIsEmptyItemViewModelSessionItemInvetationNum = false;
        int textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelSessionItemSessionDate = null;
        int TextUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE1 = 0;
        java.lang.String itemViewModelSessionItemMonth = null;
        te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelSessionItemStatus = null;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        java.lang.String itemViewModelSessionItemInvetationNum = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelUserDataUserDataType = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalse = false;
        boolean TextUtilsIsEmptyItemViewModelSessionItemInvetationNum1 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.sessionItem
                    itemViewModelSessionItem = itemViewModel.getSessionItem();
                    // read itemViewModel.userData
                    itemViewModelUserData = itemViewModel.userData;
                }


                if (itemViewModelSessionItem != null) {
                    // read itemViewModel.sessionItem.sessionDate
                    itemViewModelSessionItemSessionDate = itemViewModelSessionItem.getSessionDate();
                    // read itemViewModel.sessionItem.month
                    itemViewModelSessionItemMonth = itemViewModelSessionItem.getMonth();
                    // read itemViewModel.sessionItem.status
                    itemViewModelSessionItemStatus = itemViewModelSessionItem.getStatus();
                    // read itemViewModel.sessionItem.invetation_num
                    itemViewModelSessionItemInvetationNum = itemViewModelSessionItem.getInvetation_num();
                }
                if (itemViewModelUserData != null) {
                    // read itemViewModel.userData.userData
                    itemViewModelUserDataUserData = itemViewModelUserData.getUserData();
                }


                // read TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num)
                textUtilsIsEmptyItemViewModelSessionItemInvetationNum = android.text.TextUtils.isEmpty(itemViewModelSessionItemInvetationNum);
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyItemViewModelSessionItemInvetationNum) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
                if (itemViewModelUserDataUserData != null) {
                    // read itemViewModel.userData.userData.type
                    itemViewModelUserDataUserDataType = itemViewModelUserDataUserData.getType();
                }


                // read TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
                TextUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE1 = ((textUtilsIsEmptyItemViewModelSessionItemInvetationNum) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num)
                TextUtilsIsEmptyItemViewModelSessionItemInvetationNum1 = !textUtilsIsEmptyItemViewModelSessionItemInvetationNum;
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyItemViewModelSessionItemInvetationNum1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (itemViewModelUserDataUserDataType != null) {
                    // read itemViewModel.userData.userData.type.equals("admin")
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = itemViewModelUserDataUserDataType.equals("admin");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read !TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
                textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE = ((TextUtilsIsEmptyItemViewModelSessionItemInvetationNum1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false
                itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalse = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (textUtilsIsEmptyItemViewModelSessionItemInvetationNum) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false ? View.VISIBLE : View.GONE
                itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalseViewVISIBLEViewGONE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback63);
            this.edit.setOnClickListener(mCallback64);
            this.statusValue.setOnClickListener(mCallback62);
            this.viewValue.setOnClickListener(mCallback65);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.delete.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalseViewVISIBLEViewGONE);
            this.edit.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminTextUtilsIsEmptyItemViewModelSessionItemInvetationNumBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionCaseNumber, itemViewModelSessionItemInvetationNum);
            this.sessionCaseNumber.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDateValue, itemViewModelSessionItemSessionDate);
            this.sessionMonthText.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, itemViewModelSessionItemMonth);
            this.sessionMonthValue.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionStatusValue, itemViewModelSessionItemStatus);
            this.sessionStatusValue.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, itemViewModelSessionItemStatus);
            this.statusValue.setVisibility(TextUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE1);
            this.tvUsername.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            this.v9.setVisibility(textUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE);
            this.viewValue.setVisibility(TextUtilsIsEmptyItemViewModelSessionItemInvetationNumViewVISIBLEViewGONE1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.NOTES);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.EDIT);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.CHANGE_STATUS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.DELETE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.sessionItem
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): !TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false
        flag 10 (0xbL): itemViewModel.userData.userData.type.equals("admin") ? TextUtils.isEmpty(itemViewModel.sessionItem.invetation_num) : false
    flag mapping end*/
    //end
}