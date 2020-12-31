package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_login_logo, 6);
        sViewsWithIds.put(R.id.tv_login_title, 7);
        sViewsWithIds.put(R.id.tv_login_header, 8);
        sViewsWithIds.put(R.id.tv_login_header_number, 9);
        sViewsWithIds.put(R.id.tv_change_new_password, 10);
        sViewsWithIds.put(R.id.img_login_google, 11);
        sViewsWithIds.put(R.id.tv_login_social_or, 12);
        sViewsWithIds.put(R.id.img_login_facebook, 13);
        sViewsWithIds.put(R.id.tv_login_social_desc, 14);
        sViewsWithIds.put(R.id.tv_forget_timer, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.loginkey
            //         is viewmodel.loginRequest.setLoginkey((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputPhone);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.loginRequest != null
            boolean viewmodelLoginRequestJavaLangObjectNull = false;
            // viewmodel.loginRequest
            grand.app.akar.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
            // viewmodel.loginRequest.loginkey
            java.lang.String viewmodelLoginRequestLoginkey = null;
            // viewmodel
            grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLoginRequest = viewmodel.getLoginRequest();

                viewmodelLoginRequestJavaLangObjectNull = (viewmodelLoginRequest) != (null);
                if (viewmodelLoginRequestJavaLangObjectNull) {




                    viewmodelLoginRequest.setLoginkey(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputRegisterPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.loginRequest.password
            //         is viewmodel.loginRequest.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputRegisterPassword);
            // localize variables for thread safety
            // viewmodel.loginRequest.password
            java.lang.String viewmodelLoginRequestPassword = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.loginRequest != null
            boolean viewmodelLoginRequestJavaLangObjectNull = false;
            // viewmodel.loginRequest
            grand.app.akar.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
            // viewmodel
            grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[1]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            );
        this.btnPhone.setTag(null);
        this.inputPhone.setTag(null);
        this.inputRegisterPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.tvLoginForget.setTag(null);
        setRootTag(root);
        // listeners
        mCallback45 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback46 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback44 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((grand.app.akar.pages.auth.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.auth.login.LoginViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.akar.pages.auth.login.LoginViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.auth.login.LoginViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        grand.app.akar.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
        java.lang.String viewmodelLoginRequestLoginkey = null;
        grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.loginRequest
                    viewmodelLoginRequest = viewmodel.getLoginRequest();
                }


                if (viewmodelLoginRequest != null) {
                    // read viewmodel.loginRequest.password
                    viewmodelLoginRequestPassword = viewmodelLoginRequest.getPassword();
                    // read viewmodel.loginRequest.loginkey
                    viewmodelLoginRequestLoginkey = viewmodelLoginRequest.getLoginkey();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnPhone.setOnClickListener(mCallback45);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputPhoneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputRegisterPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputRegisterPasswordandroidTextAttrChanged);
            this.mboundView5.setOnClickListener(mCallback46);
            this.tvLoginForget.setOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputPhone, viewmodelLoginRequestLoginkey);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputRegisterPassword, viewmodelLoginRequestPassword);
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
                grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.loginPhone();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toRegister();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



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
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}