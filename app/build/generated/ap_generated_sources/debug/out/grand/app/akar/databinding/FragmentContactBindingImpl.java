package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgRegister, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputContactMessagetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.message
            //         is viewmodel.contactUsRequest.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputContactMessage);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.message
            java.lang.String viewmodelContactUsRequestMessage = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.akar.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputNametextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.name
            //         is viewmodel.contactUsRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputName);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.name
            java.lang.String viewmodelContactUsRequestName = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.akar.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputPhonetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.phone
            //         is viewmodel.contactUsRequest.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputPhone);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.phone
            java.lang.String viewmodelContactUsRequestPhone = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.akar.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputRegisterEmailtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.email
            //         is viewmodel.contactUsRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputRegisterEmail);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.akar.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel.contactUsRequest.email
            java.lang.String viewmodelContactUsRequestEmail = null;
            // viewmodel
            grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[1]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[2]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputContactMessage.setTag(null);
        this.inputName.setTag(null);
        this.inputPhone.setTag(null);
        this.inputRegisterEmail.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((grand.app.akar.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
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
        grand.app.akar.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
        java.lang.String viewmodelContactUsRequestMessage = null;
        java.lang.String viewmodelContactUsRequestName = null;
        java.lang.String viewmodelContactUsRequestPhone = null;
        java.lang.String viewmodelContactUsRequestEmail = null;
        grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.contactUsRequest
                    viewmodelContactUsRequest = viewmodel.getContactUsRequest();
                }


                if (viewmodelContactUsRequest != null) {
                    // read viewmodel.contactUsRequest.message
                    viewmodelContactUsRequestMessage = viewmodelContactUsRequest.getMessage();
                    // read viewmodel.contactUsRequest.name
                    viewmodelContactUsRequestName = viewmodelContactUsRequest.getName();
                    // read viewmodel.contactUsRequest.phone
                    viewmodelContactUsRequestPhone = viewmodelContactUsRequest.getPhone();
                    // read viewmodel.contactUsRequest.email
                    viewmodelContactUsRequestEmail = viewmodelContactUsRequest.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback30);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputContactMessage, inputContactMessagetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputName, inputNametextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPhone, inputPhonetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputRegisterEmail, inputRegisterEmailtextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.getText(this.inputContactMessage, viewmodelContactUsRequestMessage);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputName, viewmodelContactUsRequestName);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPhone, viewmodelContactUsRequestPhone);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputRegisterEmail, viewmodelContactUsRequestEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.akar.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.sendContact();
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