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
        sViewsWithIds.put(R.id.login_background, 9);
        sViewsWithIds.put(R.id.logo, 10);
        sViewsWithIds.put(R.id.app_name, 11);
        sViewsWithIds.put(R.id.app_login_title, 12);
        sViewsWithIds.put(R.id.login_header, 13);
        sViewsWithIds.put(R.id.app_login_hint, 14);
        sViewsWithIds.put(R.id.tv_forget_timer, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
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
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        this.startApp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback16 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback14 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeViewmodelLoginRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodel((te.app.evidence.pages.auth.login.LoginViewModel) object, fieldId);
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
    private boolean onChangeViewmodelLoginRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelLoginRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.auth.login.LoginViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        te.app.evidence.pages.auth.models.LoginRequest viewmodelLoginRequest = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestPasswordError = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelLoginRequestEmailErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelLoginRequestEmailError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelLoginRequestPassword = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        java.lang.String viewmodelLoginRequestEmail = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelLoginRequestPasswordErrorGet = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSStartAppAndroidDrawableCornerViewPrimaryDarkStartAppAndroidDrawableCornerViewMedium = null;
        te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x17L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.loginRequest
                        viewmodelLoginRequest = viewmodel.getLoginRequest();
                    }

                if ((dirtyFlags & 0x15L) != 0) {

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
                if ((dirtyFlags & 0x16L) != 0) {

                        if (viewmodelLoginRequest != null) {
                            // read viewmodel.loginRequest.emailError
                            viewmodelLoginRequestEmailError = viewmodelLoginRequest.emailError;
                        }
                        updateRegistration(1, viewmodelLoginRequestEmailError);


                        if (viewmodelLoginRequestEmailError != null) {
                            // read viewmodel.loginRequest.emailError.get()
                            viewmodelLoginRequestEmailErrorGet = viewmodelLoginRequestEmailError.get();
                        }
                }
                if ((dirtyFlags & 0x14L) != 0) {

                        if (viewmodelLoginRequest != null) {
                            // read viewmodel.loginRequest.password
                            viewmodelLoginRequestPassword = viewmodelLoginRequest.getPassword();
                            // read viewmodel.loginRequest.email
                            viewmodelLoginRequestEmail = viewmodelLoginRequest.getEmail();
                        }
                }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x1cL) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x1cL) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x1cL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x1cL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSStartAppAndroidDrawableCornerViewPrimaryDarkStartAppAndroidDrawableCornerViewMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(startApp.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(startApp.getContext(), R.drawable.corner_view_medium)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.forgetPassword.setOnClickListener(mCallback14);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback16);
            this.startApp.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelLoginRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.inputPassword.setError(viewmodelLoginRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelLoginRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelLoginRequestPassword);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.startApp, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSStartAppAndroidDrawableCornerViewPrimaryDarkStartAppAndroidDrawableCornerViewMedium);
            this.startApp.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
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
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.login.LoginViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.register();
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
        flag 1 (0x2L): viewmodel.loginRequest.emailError
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.message
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 6 (0x7L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}