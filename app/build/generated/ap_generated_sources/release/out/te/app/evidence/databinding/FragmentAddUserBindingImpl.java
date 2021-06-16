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
    private final androidx.appcompat.widget.AppCompatButton mboundView15;
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
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentAddUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            );
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
        this.mboundView15 = (androidx.appcompat.widget.AppCompatButton) bindings[15];
        this.mboundView15.setTag(null);
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
        this.userType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback64 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback66 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        te.app.evidence.PassingObject viewmodelPassingObject = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestUserNameError = null;
        java.lang.String viewmodelAddUserRequestName = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestTypeError = null;
        java.lang.String viewmodelAddUserRequestEmailErrorGet = null;
        java.lang.String viewmodelAddUserRequestAddress = null;
        java.lang.String viewmodelAddUserRequestPhone = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestPhoneError = null;
        te.app.evidence.pages.users.models.AddUserRequest viewmodelAddUserRequest = null;
        java.lang.String viewmodelAddUserRequestUserNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestCatError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestPasswordError = null;
        java.lang.String viewmodelAddUserRequestPhoneErrorGet = null;
        java.lang.String viewmodelAddUserRequestTypeErrorGet = null;
        java.lang.Object viewmodelPassingObjectObjectClass = null;
        boolean viewmodelPassingObjectObjectClassJavaLangObjectNull = false;
        java.lang.String viewmodelAddUserRequestCatName = null;
        java.lang.String viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView15AndroidStringAddNewUserMboundView15AndroidStringEditUser = null;
        int viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String viewmodelAddUserRequestCatErrorGet = null;
        java.lang.String viewmodelAddUserRequestPasswordErrorGet = null;
        java.lang.String viewmodelAddUserRequestUserAddressErrorGet = null;
        java.lang.String viewmodelAddUserRequestType = null;
        java.lang.String viewmodelAddUserRequestEmail = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestEmailError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddUserRequestUserAddressError = null;
        boolean ViewmodelPassingObjectObjectClassJavaLangObjectNull1 = false;
        java.lang.String viewmodelAddUserRequestPassword = null;
        te.app.evidence.pages.users.viewModels.AddUserViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x380L) != 0) {

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
                if((dirtyFlags & 0x380L) != 0) {
                    if(viewmodelPassingObjectObjectClassJavaLangObjectNull) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x380L) != 0) {
                    if(ViewmodelPassingObjectObjectClassJavaLangObjectNull1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
                    viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView15AndroidStringAddNewUserMboundView15AndroidStringEditUser = ((viewmodelPassingObjectObjectClassJavaLangObjectNull) ? (mboundView15.getResources().getString(R.string.add_new_user)) : (mboundView15.getResources().getString(R.string.edit_user)));
                    // read viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
                    viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE = ((ViewmodelPassingObjectObjectClassJavaLangObjectNull1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x2ffL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addUserRequest
                        viewmodelAddUserRequest = viewmodel.getAddUserRequest();
                    }

                if ((dirtyFlags & 0x281L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.userNameError
                            viewmodelAddUserRequestUserNameError = viewmodelAddUserRequest.userNameError;
                        }
                        updateRegistration(0, viewmodelAddUserRequestUserNameError);


                        if (viewmodelAddUserRequestUserNameError != null) {
                            // read viewmodel.addUserRequest.userNameError.get()
                            viewmodelAddUserRequestUserNameErrorGet = viewmodelAddUserRequestUserNameError.get();
                        }
                }
                if ((dirtyFlags & 0x280L) != 0) {

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
                if ((dirtyFlags & 0x282L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.typeError
                            viewmodelAddUserRequestTypeError = viewmodelAddUserRequest.typeError;
                        }
                        updateRegistration(1, viewmodelAddUserRequestTypeError);


                        if (viewmodelAddUserRequestTypeError != null) {
                            // read viewmodel.addUserRequest.typeError.get()
                            viewmodelAddUserRequestTypeErrorGet = viewmodelAddUserRequestTypeError.get();
                        }
                }
                if ((dirtyFlags & 0x284L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.phoneError
                            viewmodelAddUserRequestPhoneError = viewmodelAddUserRequest.phoneError;
                        }
                        updateRegistration(2, viewmodelAddUserRequestPhoneError);


                        if (viewmodelAddUserRequestPhoneError != null) {
                            // read viewmodel.addUserRequest.phoneError.get()
                            viewmodelAddUserRequestPhoneErrorGet = viewmodelAddUserRequestPhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x288L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.catError
                            viewmodelAddUserRequestCatError = viewmodelAddUserRequest.catError;
                        }
                        updateRegistration(3, viewmodelAddUserRequestCatError);


                        if (viewmodelAddUserRequestCatError != null) {
                            // read viewmodel.addUserRequest.catError.get()
                            viewmodelAddUserRequestCatErrorGet = viewmodelAddUserRequestCatError.get();
                        }
                }
                if ((dirtyFlags & 0x290L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.passwordError
                            viewmodelAddUserRequestPasswordError = viewmodelAddUserRequest.passwordError;
                        }
                        updateRegistration(4, viewmodelAddUserRequestPasswordError);


                        if (viewmodelAddUserRequestPasswordError != null) {
                            // read viewmodel.addUserRequest.passwordError.get()
                            viewmodelAddUserRequestPasswordErrorGet = viewmodelAddUserRequestPasswordError.get();
                        }
                }
                if ((dirtyFlags & 0x2a0L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.emailError
                            viewmodelAddUserRequestEmailError = viewmodelAddUserRequest.emailError;
                        }
                        updateRegistration(5, viewmodelAddUserRequestEmailError);


                        if (viewmodelAddUserRequestEmailError != null) {
                            // read viewmodel.addUserRequest.emailError.get()
                            viewmodelAddUserRequestEmailErrorGet = viewmodelAddUserRequestEmailError.get();
                        }
                }
                if ((dirtyFlags & 0x2c0L) != 0) {

                        if (viewmodelAddUserRequest != null) {
                            // read viewmodel.addUserRequest.userAddressError
                            viewmodelAddUserRequestUserAddressError = viewmodelAddUserRequest.userAddressError;
                        }
                        updateRegistration(6, viewmodelAddUserRequestUserAddressError);


                        if (viewmodelAddUserRequestUserAddressError != null) {
                            // read viewmodel.addUserRequest.userAddressError.get()
                            viewmodelAddUserRequestUserAddressErrorGet = viewmodelAddUserRequestUserAddressError.get();
                        }
                }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catName, viewmodelAddUserRequestCatName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddUserRequestAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddUserRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddUserRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddUserRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddUserRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userType, viewmodelAddUserRequestType);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.catName.setOnClickListener(mCallback65);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.catName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, catNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            this.mboundView15.setOnClickListener(mCallback66);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.userType.setOnClickListener(mCallback64);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.userType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, userTypeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddUserRequestUserNameErrorGet);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            this.mboundView11.setError(viewmodelAddUserRequestTypeErrorGet);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            this.mboundView13.setError(viewmodelAddUserRequestCatErrorGet);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView15AndroidStringAddNewUserMboundView15AndroidStringEditUser);
            this.mboundView7.setVisibility(viewmodelPassingObjectObjectClassJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddUserRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddUserRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddUserRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddUserRequestUserAddressErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        flag 9 (0xaL): null
        flag 10 (0xbL): viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
        flag 11 (0xcL): viewmodel.passingObject.objectClass == null ? @android:string/add_new_user : @android:string/edit_user
        flag 12 (0xdL): viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewmodel.passingObject.objectClass != null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}