package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_account_title, 5);
        sViewsWithIds.put(R.id.account_card_container, 6);
        sViewsWithIds.put(R.id.tv_register_name, 7);
        sViewsWithIds.put(R.id.tv_register_email, 8);
        sViewsWithIds.put(R.id.tv_register_phone, 9);
        sViewsWithIds.put(R.id.tv_register_password, 10);
        sViewsWithIds.put(R.id.tv_identity_number, 11);
        sViewsWithIds.put(R.id.input_register_confirm_password, 12);
        sViewsWithIds.put(R.id.tv_type, 13);
        sViewsWithIds.put(R.id.btn_seeker, 14);
        sViewsWithIds.put(R.id.bt_owner, 15);
        sViewsWithIds.put(R.id.bt_realtor, 16);
        sViewsWithIds.put(R.id.br11, 17);
        sViewsWithIds.put(R.id.appCompatButtonNext, 18);
        sViewsWithIds.put(R.id.img_login_logo, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputEmailtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputEmail);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener inputNametextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputName);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener inputNewPasswordtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.password
            //         is viewmodel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputNewPassword);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.password
            java.lang.String viewmodelRequestPassword = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
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
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
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

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (androidx.constraintlayout.widget.Barrier) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[19]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[2]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[1]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            );
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputNewPassword.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewmodel((grand.app.akar.pages.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.profile.ProfileViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.profile.ProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.profile.ProfileViewModel Viewmodel, int fieldId) {
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
        grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestPassword = null;
        java.lang.String viewmodelRequestPhone = null;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.request
                    viewmodelRequest = viewmodel.getRequest();
                }


                if (viewmodelRequest != null) {
                    // read viewmodel.request.password
                    viewmodelRequestPassword = viewmodelRequest.getPassword();
                    // read viewmodel.request.phone
                    viewmodelRequestPhone = viewmodelRequest.getPhone();
                    // read viewmodel.request.name
                    viewmodelRequestName = viewmodelRequest.getName();
                    // read viewmodel.request.email
                    viewmodelRequestEmail = viewmodelRequest.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.getText(this.inputEmail, viewmodelRequestEmail);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputName, viewmodelRequestName);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputNewPassword, viewmodelRequestPassword);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPhone, viewmodelRequestPhone);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputEmail, inputEmailtextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputName, inputNametextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputNewPassword, inputNewPasswordtextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPhone, inputPhonetextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}