package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgetPasswordBindingImpl extends FragmentForgetPasswordBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_background, 3);
        sViewsWithIds.put(R.id.logo, 4);
        sViewsWithIds.put(R.id.app_name, 5);
        sViewsWithIds.put(R.id.app_login_title, 6);
        sViewsWithIds.put(R.id.tv_forget_title, 7);
        sViewsWithIds.put(R.id.tv_login_header_number, 8);
        sViewsWithIds.put(R.id.tv_forget_remember, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputPhonetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.evidence.customViews.views.CustomEditText.setText(inputPhone);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.evidence.pages.auth.models.ForgetPasswordRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;
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

    public FragmentForgetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentForgetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel Viewmodel, int fieldId) {
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
        te.app.evidence.pages.auth.models.ForgetPasswordRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestPhone = null;
        te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.request
                    viewmodelRequest = viewmodel.getRequest();
                }


                if (viewmodelRequest != null) {
                    // read viewmodel.request.phone
                    viewmodelRequestPhone = viewmodelRequest.getPhone();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback4);
            te.app.evidence.customViews.views.CustomEditText.setTextListner(this.inputPhone, inputPhonetextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            te.app.evidence.customViews.views.CustomEditText.getText(this.inputPhone, viewmodelRequestPhone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.sendCode();
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