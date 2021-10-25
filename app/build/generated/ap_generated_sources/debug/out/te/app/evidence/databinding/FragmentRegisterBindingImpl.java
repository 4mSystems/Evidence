package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements te.app.evidence.generated.callback.OnClickListener.Listener, te.app.evidence.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_img, 24);
        sViewsWithIds.put(R.id.input_invite_code, 25);
        sViewsWithIds.put(R.id.terms_container, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView15;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView17;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView18;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewRegular mboundView20;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewRegular mboundView21;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback118;
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback115;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputMemberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.memberShipImage
            //         is viewmodel.request.setMemberShipImage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputMember);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request.memberShipImage
            java.lang.String viewmodelRequestMemberShipImage = null;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setMemberShipImage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView11androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.address
            //         is viewmodel.request.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView11);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.address
            java.lang.String viewmodelRequestAddress = null;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView15androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.password
            //         is viewmodel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView15);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.password
            java.lang.String viewmodelRequestPassword = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView17androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.confirmPassword
            //         is viewmodel.request.setConfirmPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView17);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.confirmPassword
            java.lang.String viewmodelRequestConfirmPassword = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setConfirmPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView18androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.inviteCode
            //         is viewmodel.request.setInviteCode((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView18);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.inviteCode
            java.lang.String viewmodelRequestInviteCode = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setInviteCode(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.catName
            //         is viewmodel.request.setCatName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.catName
            java.lang.String viewmodelRequestCatName = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setCatName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputEditText) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[22]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[23]
            , (android.widget.LinearLayout) bindings[26]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[24]
            );
        this.checkbox.setTag(null);
        this.inputAddress.setTag(null);
        this.inputCompanyName.setTag(null);
        this.inputInfoCard.setTag(null);
        this.inputMember.setTag(null);
        this.inputName.setTag(null);
        this.inputPassword.setTag(null);
        this.inputPasswordConfirm.setTag(null);
        this.inputPhone.setTag(null);
        this.inputRegisterEmail.setTag(null);
        this.login.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputEditText) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView15 = (com.google.android.material.textfield.TextInputEditText) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (com.google.android.material.textfield.TextInputEditText) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (com.google.android.material.textfield.TextInputEditText) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView20 = (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback113 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback118 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback116 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback117 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback114 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback115 = new te.app.evidence.generated.callback.OnCheckedChangeListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setViewmodel((te.app.evidence.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.auth.register.RegisterViewModel Viewmodel) {
        updateRegistration(3, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestConfirmError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodel((te.app.evidence.pages.auth.register.RegisterViewModel) object, fieldId);
            case 4 :
                return onChangeViewmodelRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelRequestMemberShipImageError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewmodelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestConfirmError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestConfirmError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestMemberShipImageError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestMemberShipImageError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
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
        boolean viewmodelRequestMemberShipImageErrorJavaLangObjectNull = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestConfirmError = null;
        java.lang.String viewmodelRequestPhoneErrorGet = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelRequestPasswordErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPasswordError = null;
        boolean viewmodelRequestAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean viewmodelRequestCatErrorJavaLangObjectNull = false;
        java.lang.String viewmodelRequestPassword = null;
        java.lang.String viewmodelRequestConfirmPassword = null;
        boolean viewmodelRequestPhoneErrorJavaLangObjectNull = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        java.lang.String viewmodelRequestCatErrorGet = null;
        java.lang.String viewmodelRequestCatName = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelRequestAddress = null;
        boolean viewmodelRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestCatError = null;
        java.lang.String viewmodelRequestMemberShipImage = null;
        java.lang.String viewmodelRequestEmailErrorGet = null;
        te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
        boolean viewmodelRequestNameErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean viewmodelRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        java.lang.String viewmodelRequestConfirmErrorGet = null;
        java.lang.String viewmodelRequestMemberShipImageErrorGet = null;
        int textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSLoginAndroidColorColorPrimaryDarkLoginAndroidColorMediumColor = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestAddressError = null;
        boolean viewmodelRequestConfirmPasswordJavaLangObjectNull = false;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestMemberShipImageError = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        boolean viewmodelRequestEmailErrorJavaLangObjectNull = false;
        java.lang.String viewmodelRequestAddressErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestEmailError = null;
        boolean viewmodelRequestAddressErrorJavaLangObjectNull = false;
        java.lang.String viewmodelRequestInviteCode = null;
        java.lang.String viewmodelRequestPhone = null;
        boolean viewmodelRequestConfirmPasswordJavaLangObjectNullBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        boolean viewmodelRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPhoneError = null;
        boolean viewmodelRequestPasswordErrorJavaLangObjectNull = false;
        boolean viewmodelRequestNameErrorJavaLangObjectNull = false;
        boolean viewmodelRequestMemberShipImageErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean viewmodelRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse = false;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xc08L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xc08L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xbffL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0xa09L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.confirmError
                            viewmodelRequestConfirmError = viewmodelRequest.confirmError;
                        }
                        updateRegistration(0, viewmodelRequestConfirmError);


                        if (viewmodelRequestConfirmError != null) {
                            // read viewmodel.request.confirmError.get()
                            viewmodelRequestConfirmErrorGet = viewmodelRequestConfirmError.get();
                        }
                }
                if ((dirtyFlags & 0xa0aL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.passwordError
                            viewmodelRequestPasswordError = viewmodelRequest.passwordError;
                        }
                        updateRegistration(1, viewmodelRequestPasswordError);


                        if (viewmodelRequestPasswordError != null) {
                            // read viewmodel.request.passwordError.get()
                            viewmodelRequestPasswordErrorGet = viewmodelRequestPasswordError.get();
                        }


                        // read viewmodel.request.passwordError.get() != null
                        viewmodelRequestPasswordErrorJavaLangObjectNull = (viewmodelRequestPasswordErrorGet) != (null);
                    if((dirtyFlags & 0xa0aL) != 0) {
                        if(viewmodelRequestPasswordErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x800000000L;
                        }
                        else {
                                dirtyFlags |= 0x400000000L;
                        }
                    }


                        // read viewmodel.request.passwordError.get() != null ? true : false
                        viewmodelRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestPasswordErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa08L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.password
                            viewmodelRequestPassword = viewmodelRequest.getPassword();
                            // read viewmodel.request.confirmPassword
                            viewmodelRequestConfirmPassword = viewmodelRequest.getConfirmPassword();
                            // read viewmodel.request.catName
                            viewmodelRequestCatName = viewmodelRequest.getCatName();
                            // read viewmodel.request.address
                            viewmodelRequestAddress = viewmodelRequest.getAddress();
                            // read viewmodel.request.memberShipImage
                            viewmodelRequestMemberShipImage = viewmodelRequest.getMemberShipImage();
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                            // read viewmodel.request.email
                            viewmodelRequestEmail = viewmodelRequest.getEmail();
                            // read viewmodel.request.inviteCode
                            viewmodelRequestInviteCode = viewmodelRequest.getInviteCode();
                            // read viewmodel.request.phone
                            viewmodelRequestPhone = viewmodelRequest.getPhone();
                        }


                        // read viewmodel.request.confirmPassword != null
                        viewmodelRequestConfirmPasswordJavaLangObjectNull = (viewmodelRequestConfirmPassword) != (null);
                    if((dirtyFlags & 0xa08L) != 0) {
                        if(viewmodelRequestConfirmPasswordJavaLangObjectNull) {
                                dirtyFlags |= 0x20000000L;
                        }
                        else {
                                dirtyFlags |= 0x10000000L;
                        }
                    }


                        // read viewmodel.request.confirmPassword != null ? true : false
                        viewmodelRequestConfirmPasswordJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestConfirmPasswordJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa0cL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.catError
                            viewmodelRequestCatError = viewmodelRequest.catError;
                        }
                        updateRegistration(2, viewmodelRequestCatError);


                        if (viewmodelRequestCatError != null) {
                            // read viewmodel.request.catError.get()
                            viewmodelRequestCatErrorGet = viewmodelRequestCatError.get();
                        }


                        // read viewmodel.request.catError.get() != null
                        viewmodelRequestCatErrorJavaLangObjectNull = (viewmodelRequestCatErrorGet) != (null);
                    if((dirtyFlags & 0xa0cL) != 0) {
                        if(viewmodelRequestCatErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
                        }
                    }


                        // read viewmodel.request.catError.get() != null ? true : false
                        viewmodelRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestCatErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa18L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.addressError
                            viewmodelRequestAddressError = viewmodelRequest.addressError;
                        }
                        updateRegistration(4, viewmodelRequestAddressError);


                        if (viewmodelRequestAddressError != null) {
                            // read viewmodel.request.addressError.get()
                            viewmodelRequestAddressErrorGet = viewmodelRequestAddressError.get();
                        }


                        // read viewmodel.request.addressError.get() != null
                        viewmodelRequestAddressErrorJavaLangObjectNull = (viewmodelRequestAddressErrorGet) != (null);
                    if((dirtyFlags & 0xa18L) != 0) {
                        if(viewmodelRequestAddressErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x8000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                        }
                    }


                        // read viewmodel.request.addressError.get() != null ? true : false
                        viewmodelRequestAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestAddressErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa28L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.memberShipImageError
                            viewmodelRequestMemberShipImageError = viewmodelRequest.memberShipImageError;
                        }
                        updateRegistration(5, viewmodelRequestMemberShipImageError);


                        if (viewmodelRequestMemberShipImageError != null) {
                            // read viewmodel.request.memberShipImageError.get()
                            viewmodelRequestMemberShipImageErrorGet = viewmodelRequestMemberShipImageError.get();
                        }


                        // read viewmodel.request.memberShipImageError.get() != null
                        viewmodelRequestMemberShipImageErrorJavaLangObjectNull = (viewmodelRequestMemberShipImageErrorGet) != (null);
                    if((dirtyFlags & 0xa28L) != 0) {
                        if(viewmodelRequestMemberShipImageErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x200000000L;
                        }
                        else {
                                dirtyFlags |= 0x100000000L;
                        }
                    }


                        // read viewmodel.request.memberShipImageError.get() != null ? true : false
                        viewmodelRequestMemberShipImageErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestMemberShipImageErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa48L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.emailError
                            viewmodelRequestEmailError = viewmodelRequest.emailError;
                        }
                        updateRegistration(6, viewmodelRequestEmailError);


                        if (viewmodelRequestEmailError != null) {
                            // read viewmodel.request.emailError.get()
                            viewmodelRequestEmailErrorGet = viewmodelRequestEmailError.get();
                        }


                        // read viewmodel.request.emailError.get() != null
                        viewmodelRequestEmailErrorJavaLangObjectNull = (viewmodelRequestEmailErrorGet) != (null);
                    if((dirtyFlags & 0xa48L) != 0) {
                        if(viewmodelRequestEmailErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }


                        // read viewmodel.request.emailError.get() != null ? true : false
                        viewmodelRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestEmailErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xa88L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(7, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }


                        // read viewmodel.request.nameError.get() != null
                        viewmodelRequestNameErrorJavaLangObjectNull = (viewmodelRequestNameErrorGet) != (null);
                    if((dirtyFlags & 0xa88L) != 0) {
                        if(viewmodelRequestNameErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x800000L;
                        }
                        else {
                                dirtyFlags |= 0x400000L;
                        }
                    }


                        // read viewmodel.request.nameError.get() != null ? true : false
                        viewmodelRequestNameErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestNameErrorJavaLangObjectNull) ? (true) : (false));
                }
                if ((dirtyFlags & 0xb08L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.phoneError
                            viewmodelRequestPhoneError = viewmodelRequest.phoneError;
                        }
                        updateRegistration(8, viewmodelRequestPhoneError);


                        if (viewmodelRequestPhoneError != null) {
                            // read viewmodel.request.phoneError.get()
                            viewmodelRequestPhoneErrorGet = viewmodelRequestPhoneError.get();
                        }


                        // read viewmodel.request.phoneError.get() != null
                        viewmodelRequestPhoneErrorJavaLangObjectNull = (viewmodelRequestPhoneErrorGet) != (null);
                    if((dirtyFlags & 0xb08L) != 0) {
                        if(viewmodelRequestPhoneErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x2000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000L;
                        }
                    }


                        // read viewmodel.request.phoneError.get() != null ? true : false
                        viewmodelRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse = ((viewmodelRequestPhoneErrorJavaLangObjectNull) ? (true) : (false));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xc08L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xc08L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x4000000L;
                }
            }
            if((dirtyFlags & 0xc08L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSLoginAndroidColorColorPrimaryDarkLoginAndroidColorMediumColor = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (getColorFromResource(login, R.color.colorPrimaryDark)) : (getColorFromResource(login, R.color.medium_color)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.checkbox, mCallback115, (androidx.databinding.InverseBindingListener)null);
            this.inputMember.setOnClickListener(mCallback114);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputMember, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputMemberandroidTextAttrChanged);
            this.login.setOnClickListener(mCallback118);
            this.mboundView1.setOnClickListener(mCallback113);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView11, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView11androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView15, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView15androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView18, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView18androidTextAttrChanged);
            this.mboundView20.setOnClickListener(mCallback116);
            this.mboundView21.setOnClickListener(mCallback117);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xa18L) != 0) {
            // api target 1

            this.inputAddress.setError(viewmodelRequestAddressErrorGet);
            this.inputAddress.setErrorEnabled(viewmodelRequestAddressErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa0cL) != 0) {
            // api target 1

            this.inputCompanyName.setError(viewmodelRequestCatErrorGet);
            this.inputCompanyName.setErrorEnabled(viewmodelRequestCatErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa28L) != 0) {
            // api target 1

            this.inputInfoCard.setError(viewmodelRequestMemberShipImageErrorGet);
            this.inputInfoCard.setErrorEnabled(viewmodelRequestMemberShipImageErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputMember, viewmodelRequestMemberShipImage);
            this.inputPasswordConfirm.setErrorEnabled(viewmodelRequestConfirmPasswordJavaLangObjectNullBooleanTrueBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewmodelRequestAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewmodelRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewmodelRequestConfirmPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, viewmodelRequestInviteCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelRequestCatName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelRequestPhone);
        }
        if ((dirtyFlags & 0xa88L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelRequestNameErrorGet);
            this.inputName.setErrorEnabled(viewmodelRequestNameErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa0aL) != 0) {
            // api target 1

            this.inputPassword.setError(viewmodelRequestPasswordErrorGet);
            this.inputPassword.setErrorEnabled(viewmodelRequestPasswordErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa09L) != 0) {
            // api target 1

            this.inputPasswordConfirm.setError(viewmodelRequestConfirmErrorGet);
        }
        if ((dirtyFlags & 0xb08L) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelRequestPhoneErrorGet);
            this.inputPhone.setErrorEnabled(viewmodelRequestPhoneErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa48L) != 0) {
            // api target 1

            this.inputRegisterEmail.setError(viewmodelRequestEmailErrorGet);
            this.inputRegisterEmail.setErrorEnabled(viewmodelRequestEmailErrorJavaLangObjectNullBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.login, androidx.databinding.adapters.Converters.convertColorToDrawable(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSLoginAndroidColorColorPrimaryDarkLoginAndroidColorMediumColor));
            this.login.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(te.app.evidence.utils.Constants.IMAGE);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.register();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(te.app.evidence.utils.Constants.TERMS);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(te.app.evidence.utils.Constants.PRIVACY);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(te.app.evidence.utils.Constants.IMAGE_MEMBERSHIP);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {




            viewmodel.onCheckedChange(callbackArg_0, callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.confirmError
        flag 1 (0x2L): viewmodel.request.passwordError
        flag 2 (0x3L): viewmodel.request.catError
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): viewmodel.request.addressError
        flag 5 (0x6L): viewmodel.request.memberShipImageError
        flag 6 (0x7L): viewmodel.request.emailError
        flag 7 (0x8L): viewmodel.request.nameError
        flag 8 (0x9L): viewmodel.request.phoneError
        flag 9 (0xaL): viewmodel.request
        flag 10 (0xbL): viewmodel.message
        flag 11 (0xcL): null
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 14 (0xfL): viewmodel.request.addressError.get() != null ? true : false
        flag 15 (0x10L): viewmodel.request.addressError.get() != null ? true : false
        flag 16 (0x11L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 17 (0x12L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewmodel.request.catError.get() != null ? true : false
        flag 21 (0x16L): viewmodel.request.catError.get() != null ? true : false
        flag 22 (0x17L): viewmodel.request.nameError.get() != null ? true : false
        flag 23 (0x18L): viewmodel.request.nameError.get() != null ? true : false
        flag 24 (0x19L): viewmodel.request.phoneError.get() != null ? true : false
        flag 25 (0x1aL): viewmodel.request.phoneError.get() != null ? true : false
        flag 26 (0x1bL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 27 (0x1cL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 28 (0x1dL): viewmodel.request.confirmPassword != null ? true : false
        flag 29 (0x1eL): viewmodel.request.confirmPassword != null ? true : false
        flag 30 (0x1fL): viewmodel.request.emailError.get() != null ? true : false
        flag 31 (0x20L): viewmodel.request.emailError.get() != null ? true : false
        flag 32 (0x21L): viewmodel.request.memberShipImageError.get() != null ? true : false
        flag 33 (0x22L): viewmodel.request.memberShipImageError.get() != null ? true : false
        flag 34 (0x23L): viewmodel.request.passwordError.get() != null ? true : false
        flag 35 (0x24L): viewmodel.request.passwordError.get() != null ? true : false
        flag 36 (0x25L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 37 (0x26L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}