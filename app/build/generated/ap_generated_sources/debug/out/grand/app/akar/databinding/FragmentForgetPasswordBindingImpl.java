package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgetPasswordBindingImpl extends FragmentForgetPasswordBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_login_logo, 6);
        sViewsWithIds.put(R.id.tv_login_title, 7);
        sViewsWithIds.put(R.id.tv_login_header_number, 8);
        sViewsWithIds.put(R.id.br1, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputPhonetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputPhone);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.ForgetPasswordRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;
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
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.tvForgetTitle.setTag(null);
        this.tvSocialTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback18 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
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
        java.lang.String viewmodelPassingObjectObject = null;
        grand.app.akar.PassingObject viewmodelPassingObject = null;
        int viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewVISIBLEViewGONE = 0;
        grand.app.akar.pages.auth.models.ForgetPasswordRequest viewmodelRequest = null;
        boolean viewmodelPassingObjectObjectEqualsJavaLangStringForgetPassword = false;
        java.lang.String viewmodelRequestPhone = null;
        int viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewGONEViewVISIBLE = 0;
        grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.passingObject
                    viewmodelPassingObject = viewmodel.getPassingObject();
                }


                if (viewmodelPassingObject != null) {
                    // read viewmodel.passingObject.object
                    viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                }


                if (viewmodelPassingObjectObject != null) {
                    // read viewmodel.passingObject.object.equals("forget_password")
                    viewmodelPassingObjectObjectEqualsJavaLangStringForgetPassword = viewmodelPassingObjectObject.equals("forget_password");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPassingObjectObjectEqualsJavaLangStringForgetPassword) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewmodel.passingObject.object.equals("forget_password") ? View.VISIBLE : View.GONE
                viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewVISIBLEViewGONE = ((viewmodelPassingObjectObjectEqualsJavaLangStringForgetPassword) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.passingObject.object.equals("forget_password") ? View.GONE : View.VISIBLE
                viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewGONEViewVISIBLE = ((viewmodelPassingObjectObjectEqualsJavaLangStringForgetPassword) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }


                    if (viewmodelRequest != null) {
                        // read viewmodel.request.phone
                        viewmodelRequestPhone = viewmodelRequest.getPhone();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback18);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPhone, inputPhonetextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPhone, viewmodelRequestPhone);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.tvForgetTitle.setVisibility(viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewVISIBLEViewGONE);
            this.tvSocialTitle.setVisibility(viewmodelPassingObjectObjectEqualsJavaLangStringForgetPasswordViewGONEViewVISIBLE);
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
                grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sendCode();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.passingObject
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.passingObject.object.equals("forget_password") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.passingObject.object.equals("forget_password") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.passingObject.object.equals("forget_password") ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewmodel.passingObject.object.equals("forget_password") ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}