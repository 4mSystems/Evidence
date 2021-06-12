package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChangePasswordBindingImpl extends FragmentChangePasswordBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_background, 5);
        sViewsWithIds.put(R.id.img_login_logo, 6);
        sViewsWithIds.put(R.id.app_name, 7);
        sViewsWithIds.put(R.id.app_login_title, 8);
        sViewsWithIds.put(R.id.tv_change_title, 9);
        sViewsWithIds.put(R.id.tv_change_header_text, 10);
        sViewsWithIds.put(R.id.tv_change_new_password, 11);
        sViewsWithIds.put(R.id.tv_change_confirm_password, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputConfirmPasswordtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.confirmPassword
            //         is viewmodel.request.setConfirmPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.evidence.customViews.views.CustomEditText.setText(inputConfirmPassword);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.confirmPassword
            java.lang.String viewmodelRequestConfirmPassword = null;
            // viewmodel
            te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener inputNewPasswordtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.password
            //         is viewmodel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.evidence.customViews.views.CustomEditText.setText(inputNewPassword);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.password
            java.lang.String viewmodelRequestPassword = null;
            // viewmodel
            te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel viewmodel = mViewmodel;
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

    public FragmentChangePasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentChangePasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[3]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputConfirmPassword.setTag(null);
        this.inputNewPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback15 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel Viewmodel, int fieldId) {
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
        te.app.evidence.pages.auth.models.RegisterRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestPassword = null;
        java.lang.String viewmodelRequestConfirmPassword = null;
        te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.request
                    viewmodelRequest = viewmodel.getRequest();
                }


                if (viewmodelRequest != null) {
                    // read viewmodel.request.password
                    viewmodelRequestPassword = viewmodelRequest.getPassword();
                    // read viewmodel.request.confirmPassword
                    viewmodelRequestConfirmPassword = viewmodelRequest.getConfirmPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback16);
            te.app.evidence.customViews.views.CustomEditText.setTextListner(this.inputConfirmPassword, inputConfirmPasswordtextAttrChanged);
            te.app.evidence.customViews.views.CustomEditText.setTextListner(this.inputNewPassword, inputNewPasswordtextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            te.app.evidence.customViews.views.CustomEditText.getText(this.inputConfirmPassword, viewmodelRequestConfirmPassword);
            te.app.evidence.customViews.views.CustomEditText.getText(this.inputNewPassword, viewmodelRequestPassword);
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
                te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.submit();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
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