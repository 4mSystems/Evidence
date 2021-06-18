package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_background, 7);
        sViewsWithIds.put(R.id.logo, 8);
        sViewsWithIds.put(R.id.app_name, 9);
        sViewsWithIds.put(R.id.app_login_title, 10);
        sViewsWithIds.put(R.id.login_header, 11);
        sViewsWithIds.put(R.id.app_login_hint, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.email
            //         is viewmodel.loginRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.loginRequest != null
            boolean viewmodelLoginRequestJavaLangObjectNull = false;
            // viewmodel.loginRequest
            te.app.evidence.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;
            // viewmodel.loginRequest.email
            java.lang.String viewmodelLoginRequestEmail = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLoginRequest = viewmodel.getLoginRequest();

                viewmodelLoginRequestJavaLangObjectNull = (viewmodelLoginRequest) != (null);
                if (viewmodelLoginRequestJavaLangObjectNull) {




                    viewmodelLoginRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.password
            //         is viewmodel.loginRequest.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.loginRequest.password
            java.lang.String viewmodelLoginRequestPassword = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.loginRequest != null
            boolean viewmodelLoginRequestJavaLangObjectNull = false;
            // viewmodel.loginRequest
            te.app.evidence.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
            // viewmodel
            te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLoginRequest = viewmodel.getLoginRequest();

                viewmodelLoginRequestJavaLangObjectNull = (viewmodelLoginRequest) != (null);
                if (viewmodelLoginRequestJavaLangObjectNull) {




                    viewmodelLoginRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            );
        this.forgetPassword.setTag(null);
        this.inputEmail.setTag(null);
        this.inputPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.startApp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback12 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewmodel((te.app.evidence.pages.auth.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.auth.login.LoginViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelLoginRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.auth.login.LoginViewModel) object, fieldId);
            case 2 :
                return onChangeViewmodelLoginRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelLoginRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> ViewmodelLoginRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.auth.login.LoginViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLoginRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelLoginRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewmodelLoginRequestPassword = null;
        te.app.evidence.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
        java.lang.String viewmodelLoginRequestEmail = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestPasswordError = null;
        java.lang.String viewmodelLoginRequestPasswordErrorGet = null;
        java.lang.String viewmodelLoginRequestEmailErrorGet = null;
        te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestEmailError = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.loginRequest
                    viewmodelLoginRequest = viewmodel.getLoginRequest();
                }

            if ((dirtyFlags & 0xaL) != 0) {

                    if (viewmodelLoginRequest != null) {
                        // read viewmodel.loginRequest.password
                        viewmodelLoginRequestPassword = viewmodelLoginRequest.getPassword();
                        // read viewmodel.loginRequest.email
                        viewmodelLoginRequestEmail = viewmodelLoginRequest.getEmail();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodelLoginRequest != null) {
                        // read viewmodel.loginRequest.passwordError
                        viewmodelLoginRequestPasswordError = viewmodelLoginRequest.passwordError;
                    }
                    updateRegistration(0, viewmodelLoginRequestPasswordError);


                    if (viewmodelLoginRequestPasswordError != null) {
                        // read viewmodel.loginRequest.passwordError.get()
                        viewmodelLoginRequestPasswordErrorGet = viewmodelLoginRequestPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodelLoginRequest != null) {
                        // read viewmodel.loginRequest.emailError
                        viewmodelLoginRequestEmailError = viewmodelLoginRequest.emailError;
                    }
                    updateRegistration(2, viewmodelLoginRequestEmailError);


                    if (viewmodelLoginRequestEmailError != null) {
                        // read viewmodel.loginRequest.emailError.get()
                        viewmodelLoginRequestEmailErrorGet = viewmodelLoginRequestEmailError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.forgetPassword.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.startApp.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelLoginRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.inputPassword.setError(viewmodelLoginRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelLoginRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelLoginRequestPassword);
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
                te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.login();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.forgetPassword();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.loginRequest.passwordError
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.loginRequest.emailError
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}