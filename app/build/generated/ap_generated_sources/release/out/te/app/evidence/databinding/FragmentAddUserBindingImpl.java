package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddUserBindingImpl extends FragmentAddUserBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView10;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView13;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener catNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.catName
            //         is viewmodel.addUserRequest.setCatName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(catName);
            // localize variables for thread safety
            // viewmodel.addUserRequest.catName
            java.lang.String viewmodelAddUserRequestCatName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setCatName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.address
            //         is viewmodel.addUserRequest.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewmodel.addUserRequest.address
            java.lang.String viewmodelAddUserRequestAddress = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.name
            //         is viewmodel.addUserRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest.name
            java.lang.String viewmodelAddUserRequestName = null;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.email
            //         is viewmodel.addUserRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest.email
            java.lang.String viewmodelAddUserRequestEmail = null;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.phone
            //         is viewmodel.addUserRequest.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addUserRequest.phone
            java.lang.String viewmodelAddUserRequestPhone = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.password
            //         is viewmodel.addUserRequest.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel.addUserRequest.password
            java.lang.String viewmodelAddUserRequestPassword = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener userTypeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addUserRequest.type
            //         is viewmodel.addUserRequest.setType((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(userType);
            // localize variables for thread safety
            // viewmodel.addUserRequest.type
            java.lang.String viewmodelAddUserRequestType = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addUserRequest != null
            boolean viewmodelAddUserRequestJavaLangObjectNull = false;
            // viewmodel.addUserRequest
            te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
            // viewmodel
            te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddUserRequest = viewmodel.getAddUserRequest();

                viewmodelAddUserRequestJavaLangObjectNull = (viewmodelAddUserRequest) != (null);
                if (viewmodelAddUserRequestJavaLangObjectNull) {




                    viewmodelAddUserRequest.setType(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentAddUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            );
        this.btnSave.setTag(null);
        this.catName.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (com.google.android.material.textfield.TextInputEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (com.google.android.material.textfield.TextInputLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        this.userType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback60 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback61 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.evidence.pages.users.viewModels.AddUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.users.viewModels.AddUserViewModel Viewmodel) {
        updateRegistration(7, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddUserRequestUserNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddUserRequestTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddUserRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddUserRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddUserRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddUserRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelAddUserRequestUserAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodel((te.app.evidence.pages.users.viewModels.AddUserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestUserNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestUserNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddUserRequestUserAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddUserRequestUserAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.users.viewModels.AddUserViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        boolean viewmodelAddUserRequestTypeErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium = null;
        te.app.evidence.PassingObject viewmodelPassingObject = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestUserNameError = null;
        java.lang.String viewmodelAddUserRequestName = null;
        boolean viewmodelAddUserRequestEmailErrorJavaLangObjectNull = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestTypeError = null;
        int viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        boolean viewmodelAddUserRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        java.lang.String viewmodelAddUserRequestEmailErrorGet = null;
        java.lang.String viewmodelAddUserRequestAddress = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAddUserRequestPhone = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestPhoneError = null;
        te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
        java.lang.String viewmodelAddUserRequestUserNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestCatError = null;
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        java.lang.String viewmodelMessage = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestPasswordError = null;
        java.lang.String viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewUserBtnSaveAndroidStringEditUser = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        boolean viewmodelAddUserRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean viewmodelAddUserRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelAddUserRequestPhoneErrorGet = null;
        java.lang.String viewmodelAddUserRequestTypeErrorGet = null;
        boolean viewmodelAddUserRequestUserNameErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean viewmodelAddUserRequestPhoneErrorJavaLangObjectNull = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.Object viewmodelPassingObjectObjectClass = null;
        boolean viewmodelPassingObjectObjectClassJavaLangObjectNull = false;
        boolean viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        java.lang.String viewmodelAddUserRequestCatName = null;
        boolean viewmodelAddUserRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean viewmodelAddUserRequestPasswordErrorJavaLangObjectNull = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        int viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String viewmodelAddUserRequestCatErrorGet = null;
        boolean viewmodelAddUserRequestCatErrorJavaLangObjectNull = false;
        java.lang.String viewmodelAddUserRequestPasswordErrorGet = null;
        boolean viewmodelAddUserRequestUserNameErrorJavaLangObjectNull = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        boolean viewmodelAddUserRequestTypeErrorJavaLangObjectNull = false;
        java.lang.String viewmodelAddUserRequestUserAddressErrorGet = null;
        boolean viewmodelAddUserRequestUserAddressErrorJavaLangObjectNull = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAddUserRequestType = null;
        boolean viewmodelAddUserRequestUserAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        java.lang.String viewmodelAddUserRequestEmail = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestEmailError = null;
        java.lang.String viewmodelUserDataUserDataType = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestUserAddressError = null;
        boolean ViewmodelPassingObjectObjectClassJavaLangObjectNull1 = false;
        java.lang.String viewmodelAddUserRequestPassword = null;
        te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x580L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.objectClass
                        viewmodelPassingObjectObjectClass = viewmodelPassingObject.getObjectClass();
                    }


                    // read viewmodel.passingObject.objectClass == null
                    viewmodelPassingObjectObjectClassJavaLangObjectNull = (viewmodelPassingObjectObjectClass) == (null);
                    // read viewmodel.passingObject.objectClass != null
                    ViewmodelPassingObjectObjectClassJavaLangObjectNull1 = (viewmodelPassingObjectObjectClass) != (null);
                if((dirtyFlags & 0x580L) != 0) {
                    if(viewmodelPassingObjectObjectClassJavaLangObjectNull) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x580L) != 0) {
                    if(ViewmodelPassingObjectObjectClassJavaLangObjectNull1) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
                    viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewUserBtnSaveAndroidStringEditUser = ((viewmodelPassingObjectObjectClassJavaLangObjectNull) ? (btnSave.getResources().getString(R.string.add_new_user)) : (btnSave.getResources().getString(R.string.edit_user)));
                    // read viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
                    viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE = ((ViewmodelPassingObjectObjectClassJavaLangObjectNull1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x4ffL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addUserRequest
                        viewmodelAddUserRequest = viewmodel.getAddUserRequest();
                    }

                if ((dirtyFlags & 0x481L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.userNameError
                            viewmodelAddUserRequestUserNameError = viewmodelAddUserRequest.userNameError;
                        }
                        updateRegistration(0, viewmodelAddUserRequestUserNameError);


                        if (viewmodelAddUserRequestUserNameError != null) {
                            // read viewmodel.addUserRequest.userNameError.get()
                            viewmodelAddUserRequestUserNameErrorGet = viewmodelAddUserRequestUserNameError.get();
                        }


                        // read viewmodel.addUserRequest.userNameError.get() != null
                        viewmodelAddUserRequestUserNameErrorJavaLangObjectNull = (viewmodelAddUserRequestUserNameErrorGet) != (null);
                    if((dirtyFlags & 0x481L) != 0) {
                        if(viewmodelAddUserRequestUserNameErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x4000000L;
                        }
                        else {
                                dirtyFlags |= 0x2000000L;
                        }
                    }


                        // read viewmodel.addUserRequest.userNameError.get() != null ? true : false
                        viewmodelAddUserRequestUserNameErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestUserNameErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x480L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.name
                            viewmodelAddUserRequestName = viewmodelAddUserRequest.getName();
                            // read viewmodel.addUserRequest.address
                            viewmodelAddUserRequestAddress = viewmodelAddUserRequest.getAddress();
                            // read viewmodel.addUserRequest.phone
                            viewmodelAddUserRequestPhone = viewmodelAddUserRequest.getPhone();
                            // read viewmodel.addUserRequest.catName
                            viewmodelAddUserRequestCatName = viewmodelAddUserRequest.getCatName();
                            // read viewmodel.addUserRequest.type
                            viewmodelAddUserRequestType = viewmodelAddUserRequest.getType();
                            // read viewmodel.addUserRequest.email
                            viewmodelAddUserRequestEmail = viewmodelAddUserRequest.getEmail();
                            // read viewmodel.addUserRequest.password
                            viewmodelAddUserRequestPassword = viewmodelAddUserRequest.getPassword();
                        }
                }
                if ((dirtyFlags & 0x482L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.typeError
                            viewmodelAddUserRequestTypeError = viewmodelAddUserRequest.typeError;
                        }
                        updateRegistration(1, viewmodelAddUserRequestTypeError);


                        if (viewmodelAddUserRequestTypeError != null) {
                            // read viewmodel.addUserRequest.typeError.get()
                            viewmodelAddUserRequestTypeErrorGet = viewmodelAddUserRequestTypeError.get();
                        }


                        // read viewmodel.addUserRequest.typeError.get() != null
                        viewmodelAddUserRequestTypeErrorJavaLangObjectNull = (viewmodelAddUserRequestTypeErrorGet) != (null);
                    if((dirtyFlags & 0x482L) != 0) {
                        if(viewmodelAddUserRequestTypeErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x1000L;
                        }
                        else {
                                dirtyFlags |= 0x800L;
                        }
                    }


                        // read viewmodel.addUserRequest.typeError.get() != null ? true : false
                        viewmodelAddUserRequestTypeErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestTypeErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x484L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.phoneError
                            viewmodelAddUserRequestPhoneError = viewmodelAddUserRequest.phoneError;
                        }
                        updateRegistration(2, viewmodelAddUserRequestPhoneError);


                        if (viewmodelAddUserRequestPhoneError != null) {
                            // read viewmodel.addUserRequest.phoneError.get()
                            viewmodelAddUserRequestPhoneErrorGet = viewmodelAddUserRequestPhoneError.get();
                        }


                        // read viewmodel.addUserRequest.phoneError.get() != null
                        viewmodelAddUserRequestPhoneErrorJavaLangObjectNull = (viewmodelAddUserRequestPhoneErrorGet) != (null);
                    if((dirtyFlags & 0x484L) != 0) {
                        if(viewmodelAddUserRequestPhoneErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x40000000L;
                        }
                        else {
                                dirtyFlags |= 0x20000000L;
                        }
                    }


                        // read viewmodel.addUserRequest.phoneError.get() != null ? true : false
                        viewmodelAddUserRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestPhoneErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x488L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.catError
                            viewmodelAddUserRequestCatError = viewmodelAddUserRequest.catError;
                        }
                        updateRegistration(3, viewmodelAddUserRequestCatError);


                        if (viewmodelAddUserRequestCatError != null) {
                            // read viewmodel.addUserRequest.catError.get()
                            viewmodelAddUserRequestCatErrorGet = viewmodelAddUserRequestCatError.get();
                        }


                        // read viewmodel.addUserRequest.catError.get() != null
                        viewmodelAddUserRequestCatErrorJavaLangObjectNull = (viewmodelAddUserRequestCatErrorGet) != (null);
                    if((dirtyFlags & 0x488L) != 0) {
                        if(viewmodelAddUserRequestCatErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x40000L;
                        }
                        else {
                                dirtyFlags |= 0x20000L;
                        }
                    }


                        // read viewmodel.addUserRequest.catError.get() != null ? true : false
                        viewmodelAddUserRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestCatErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x490L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.passwordError
                            viewmodelAddUserRequestPasswordError = viewmodelAddUserRequest.passwordError;
                        }
                        updateRegistration(4, viewmodelAddUserRequestPasswordError);


                        if (viewmodelAddUserRequestPasswordError != null) {
                            // read viewmodel.addUserRequest.passwordError.get()
                            viewmodelAddUserRequestPasswordErrorGet = viewmodelAddUserRequestPasswordError.get();
                        }


                        // read viewmodel.addUserRequest.passwordError.get() != null
                        viewmodelAddUserRequestPasswordErrorJavaLangObjectNull = (viewmodelAddUserRequestPasswordErrorGet) != (null);
                    if((dirtyFlags & 0x490L) != 0) {
                        if(viewmodelAddUserRequestPasswordErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x1000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000L;
                        }
                    }


                        // read viewmodel.addUserRequest.passwordError.get() != null ? true : false
                        viewmodelAddUserRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestPasswordErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x4a0L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.emailError
                            viewmodelAddUserRequestEmailError = viewmodelAddUserRequest.emailError;
                        }
                        updateRegistration(5, viewmodelAddUserRequestEmailError);


                        if (viewmodelAddUserRequestEmailError != null) {
                            // read viewmodel.addUserRequest.emailError.get()
                            viewmodelAddUserRequestEmailErrorGet = viewmodelAddUserRequestEmailError.get();
                        }


                        // read viewmodel.addUserRequest.emailError.get() != null
                        viewmodelAddUserRequestEmailErrorJavaLangObjectNull = (viewmodelAddUserRequestEmailErrorGet) != (null);
                    if((dirtyFlags & 0x4a0L) != 0) {
                        if(viewmodelAddUserRequestEmailErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x400000L;
                        }
                        else {
                                dirtyFlags |= 0x200000L;
                        }
                    }


                        // read viewmodel.addUserRequest.emailError.get() != null ? true : false
                        viewmodelAddUserRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestEmailErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0x4c0L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.userAddressError
                            viewmodelAddUserRequestUserAddressError = viewmodelAddUserRequest.userAddressError;
                        }
                        updateRegistration(6, viewmodelAddUserRequestUserAddressError);


                        if (viewmodelAddUserRequestUserAddressError != null) {
                            // read viewmodel.addUserRequest.userAddressError.get()
                            viewmodelAddUserRequestUserAddressErrorGet = viewmodelAddUserRequestUserAddressError.get();
                        }


                        // read viewmodel.addUserRequest.userAddressError.get() != null
                        viewmodelAddUserRequestUserAddressErrorJavaLangObjectNull = (viewmodelAddUserRequestUserAddressErrorGet) != (null);
                    if((dirtyFlags & 0x4c0L) != 0) {
                        if(viewmodelAddUserRequestUserAddressErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x4000000000L;
                        }
                        else {
                                dirtyFlags |= 0x2000000000L;
                        }
                    }


                        // read viewmodel.addUserRequest.userAddressError.get() != null ? true : false
                        viewmodelAddUserRequestUserAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelAddUserRequestUserAddressErrorJavaLangObjectNull) ? (true) : (false));
                }
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x680L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x680L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x480L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.userData
                        viewmodelUserDataUserData = viewmodelUserData.getUserData();
                    }


                    if (viewmodelUserDataUserData != null) {
                        // read viewmodel.userData.userData.type
                        viewmodelUserDataUserDataType = viewmodelUserDataUserData.getType();
                    }


                    if (viewmodelUserDataUserDataType != null) {
                        // read viewmodel.userData.userData.type.equals("admin")
                        viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = viewmodelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0x480L) != 0) {
                    if(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x10000000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x680L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x680L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x80000000L;
                }
            }
            if((dirtyFlags & 0x680L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.corner_view_medium)));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium);
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback62);
            this.catName.setOnClickListener(mCallback61);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.catName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, catNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.userType.setOnClickListener(mCallback60);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.userType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, userTypeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x580L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnSave, viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewUserBtnSaveAndroidStringEditUser);
            this.mboundView7.setVisibility(viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catName, viewmodelAddUserRequestCatName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddUserRequestAddress);
            this.mboundView13.setVisibility(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddUserRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddUserRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddUserRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddUserRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userType, viewmodelAddUserRequestType);
        }
        if ((dirtyFlags & 0x481L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddUserRequestUserNameErrorGet);
            this.mboundView1.setErrorEnabled(viewmodelAddUserRequestUserNameErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x482L) != 0) {
            // api target 1

            this.mboundView11.setErrorEnabled(viewmodelAddUserRequestTypeErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView11.setError(viewmodelAddUserRequestTypeErrorGet);
        }
        if ((dirtyFlags & 0x488L) != 0) {
            // api target 1

            this.mboundView13.setErrorEnabled(viewmodelAddUserRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView13.setError(viewmodelAddUserRequestCatErrorGet);
        }
        if ((dirtyFlags & 0x4a0L) != 0) {
            // api target 1

            this.mboundView3.setErrorEnabled(viewmodelAddUserRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView3.setError(viewmodelAddUserRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x484L) != 0) {
            // api target 1

            this.mboundView5.setErrorEnabled(viewmodelAddUserRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView5.setError(viewmodelAddUserRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x490L) != 0) {
            // api target 1

            this.mboundView7.setErrorEnabled(viewmodelAddUserRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView7.setError(viewmodelAddUserRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0x4c0L) != 0) {
            // api target 1

            this.mboundView9.setErrorEnabled(viewmodelAddUserRequestUserAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse);
            this.mboundView9.setError(viewmodelAddUserRequestUserAddressErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.addNewUser();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.showUserType();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.showCategories();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addUserRequest.userNameError
        flag 1 (0x2L): viewmodel.addUserRequest.typeError
        flag 2 (0x3L): viewmodel.addUserRequest.phoneError
        flag 3 (0x4L): viewmodel.addUserRequest.catError
        flag 4 (0x5L): viewmodel.addUserRequest.passwordError
        flag 5 (0x6L): viewmodel.addUserRequest.emailError
        flag 6 (0x7L): viewmodel.addUserRequest.userAddressError
        flag 7 (0x8L): viewmodel
        flag 8 (0x9L): viewmodel.passingObject
        flag 9 (0xaL): viewmodel.message
        flag 10 (0xbL): null
        flag 11 (0xcL): viewmodel.addUserRequest.typeError.get() != null ? true : false
        flag 12 (0xdL): viewmodel.addUserRequest.typeError.get() != null ? true : false
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 15 (0x10L): viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewmodel.addUserRequest.catError.get() != null ? true : false
        flag 18 (0x13L): viewmodel.addUserRequest.catError.get() != null ? true : false
        flag 19 (0x14L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
        flag 20 (0x15L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
        flag 21 (0x16L): viewmodel.addUserRequest.emailError.get() != null ? true : false
        flag 22 (0x17L): viewmodel.addUserRequest.emailError.get() != null ? true : false
        flag 23 (0x18L): viewmodel.addUserRequest.passwordError.get() != null ? true : false
        flag 24 (0x19L): viewmodel.addUserRequest.passwordError.get() != null ? true : false
        flag 25 (0x1aL): viewmodel.addUserRequest.userNameError.get() != null ? true : false
        flag 26 (0x1bL): viewmodel.addUserRequest.userNameError.get() != null ? true : false
        flag 27 (0x1cL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 28 (0x1dL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 29 (0x1eL): viewmodel.addUserRequest.phoneError.get() != null ? true : false
        flag 30 (0x1fL): viewmodel.addUserRequest.phoneError.get() != null ? true : false
        flag 31 (0x20L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 32 (0x21L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 33 (0x22L): viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
        flag 34 (0x23L): viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
        flag 35 (0x24L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewmodel.addUserRequest.userAddressError.get() != null ? true : false
        flag 38 (0x27L): viewmodel.addUserRequest.userAddressError.get() != null ? true : false
        flag 39 (0x28L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 40 (0x29L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}