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
        sViewsWithIds.put(R.id.login_background, 4);
        sViewsWithIds.put(R.id.logo, 5);
        sViewsWithIds.put(R.id.app_name, 6);
        sViewsWithIds.put(R.id.app_login_title, 7);
        sViewsWithIds.put(R.id.login_header, 8);
        sViewsWithIds.put(R.id.app_login_hint, 9);
        sViewsWithIds.put(R.id.forget_password, 10);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputEmailtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.email
            //         is viewmodel.loginRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.evidence.customViews.views.CustomEditText.setText(inputEmail);
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
    private androidx.databinding.InverseBindingListener inputPasswordtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.password
            //         is viewmodel.loginRequest.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.evidence.customViews.views.CustomEditText.setText(inputPassword);
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[1]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            );
        this.inputEmail.setTag(null);
        this.inputPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.startApp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestPasswordError = null;
        java.lang.String viewmodelLoginRequestPasswordErrorGet = null;
        java.lang.String viewmodelLoginRequestPassword = null;
        te.app.evidence.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
        java.lang.String viewmodelLoginRequestEmailErrorGet = null;
        te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestEmailError = null;
        java.lang.String viewmodelLoginRequestEmail = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.loginRequest
                    viewmodelLoginRequest = viewmodel.getLoginRequest();
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
            if ((dirtyFlags & 0xaL) != 0) {

                    if (viewmodelLoginRequest != null) {
                        // read viewmodel.loginRequest.password
                        viewmodelLoginRequestPassword = viewmodelLoginRequest.getPassword();
                        // read viewmodel.loginRequest.email
                        viewmodelLoginRequestEmail = viewmodelLoginRequest.getEmail();
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
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelLoginRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            te.app.evidence.customViews.views.CustomEditText.getText(this.inputEmail, viewmodelLoginRequestEmail);
            te.app.evidence.customViews.views.CustomEditText.getText(this.inputPassword, viewmodelLoginRequestPassword);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            te.app.evidence.customViews.views.CustomEditText.setTextListner(this.inputEmail, inputEmailtextAttrChanged);
            te.app.evidence.customViews.views.CustomEditText.setTextListner(this.inputPassword, inputPasswordtextAttrChanged);
            this.startApp.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.inputPassword.setError(viewmodelLoginRequestPasswordErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.login();
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