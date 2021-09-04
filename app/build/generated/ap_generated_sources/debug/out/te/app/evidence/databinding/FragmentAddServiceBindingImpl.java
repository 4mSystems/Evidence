package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddServiceBindingImpl extends FragmentAddServiceBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_container, 12);
        sViewsWithIds.put(R.id.tv_upload, 13);
        sViewsWithIds.put(R.id.ic_battery, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener clientTypeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addServiceRequest.serviceWhats
            //         is viewmodel.addServiceRequest.setServiceWhats((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(clientType);
            // localize variables for thread safety
            // viewmodel.addServiceRequest.serviceWhats
            java.lang.String viewmodelAddServiceRequestServiceWhats = null;
            // viewmodel.addServiceRequest != null
            boolean viewmodelAddServiceRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addServiceRequest
            te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
            // viewmodel
            te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();

                viewmodelAddServiceRequestJavaLangObjectNull = (viewmodelAddServiceRequest) != (null);
                if (viewmodelAddServiceRequestJavaLangObjectNull) {




                    viewmodelAddServiceRequest.setServiceWhats(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addServiceRequest.serviceTitle
            //         is viewmodel.addServiceRequest.setServiceTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addServiceRequest != null
            boolean viewmodelAddServiceRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addServiceRequest.serviceTitle
            java.lang.String viewmodelAddServiceRequestServiceTitle = null;
            // viewmodel.addServiceRequest
            te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
            // viewmodel
            te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();

                viewmodelAddServiceRequestJavaLangObjectNull = (viewmodelAddServiceRequest) != (null);
                if (viewmodelAddServiceRequestJavaLangObjectNull) {




                    viewmodelAddServiceRequest.setServiceTitle(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addServiceRequest.servicePrice
            //         is viewmodel.addServiceRequest.setServicePrice((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.addServiceRequest != null
            boolean viewmodelAddServiceRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addServiceRequest.servicePrice
            java.lang.String viewmodelAddServiceRequestServicePrice = null;
            // viewmodel.addServiceRequest
            te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
            // viewmodel
            te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();

                viewmodelAddServiceRequestJavaLangObjectNull = (viewmodelAddServiceRequest) != (null);
                if (viewmodelAddServiceRequestJavaLangObjectNull) {




                    viewmodelAddServiceRequest.setServicePrice(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addServiceRequest.servicePhone
            //         is viewmodel.addServiceRequest.setServicePhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addServiceRequest != null
            boolean viewmodelAddServiceRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addServiceRequest.servicePhone
            java.lang.String viewmodelAddServiceRequestServicePhone = null;
            // viewmodel.addServiceRequest
            te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
            // viewmodel
            te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();

                viewmodelAddServiceRequestJavaLangObjectNull = (viewmodelAddServiceRequest) != (null);
                if (viewmodelAddServiceRequestJavaLangObjectNull) {




                    viewmodelAddServiceRequest.setServicePhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addServiceRequest.serviceDesc
            //         is viewmodel.addServiceRequest.setServiceDesc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewmodel.addServiceRequest != null
            boolean viewmodelAddServiceRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addServiceRequest.serviceDesc
            java.lang.String viewmodelAddServiceRequestServiceDesc = null;
            // viewmodel.addServiceRequest
            te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
            // viewmodel
            te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();

                viewmodelAddServiceRequestJavaLangObjectNull = (viewmodelAddServiceRequest) != (null);
                if (viewmodelAddServiceRequestJavaLangObjectNull) {




                    viewmodelAddServiceRequest.setServiceDesc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAddServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13]
            );
        this.btnSave.setTag(null);
        this.clientType.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewmodel((te.app.evidence.pages.services.viewModels.ServicesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.services.viewModels.ServicesViewModel Viewmodel) {
        updateRegistration(4, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddServiceRequestServiceWhatseError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddServiceRequestServiceTitleError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddServiceRequestServicePhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddServiceRequestServicePriceError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((te.app.evidence.pages.services.viewModels.ServicesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddServiceRequestServiceWhatseError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddServiceRequestServiceWhatseError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddServiceRequestServiceTitleError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddServiceRequestServiceTitleError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddServiceRequestServicePhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddServiceRequestServicePhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddServiceRequestServicePriceError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddServiceRequestServicePriceError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.services.viewModels.ServicesViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.addServiceRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        te.app.evidence.PassingObject viewmodelPassingObject = null;
        java.lang.String viewmodelAddServiceRequestServicePriceErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddServiceRequestServiceWhatseError = null;
        java.lang.String viewmodelAddServiceRequestServiceTitle = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAddServiceRequestServiceTitleErrorGet = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelAddServiceRequestServiceDesc = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        te.app.evidence.pages.services.models.AddServiceRequest viewmodelAddServiceRequest = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.Object viewmodelPassingObjectObjectClass = null;
        java.lang.String viewmodelAddServiceRequestServicePrice = null;
        boolean viewmodelPassingObjectObjectClassJavaLangObjectNull = false;
        java.lang.String viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewClientBtnSaveAndroidStringEditClient = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelAddServiceRequestServiceWhatseErrorGet = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = 0;
        java.lang.String viewmodelAddServiceRequestServicePhoneErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddServiceRequestServiceTitleError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddServiceRequestServicePhoneError = null;
        java.lang.String viewmodelAddServiceRequestServiceWhats = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAddServiceRequestServicePhone = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddServiceRequestServicePriceError = null;
        te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.objectClass
                        viewmodelPassingObjectObjectClass = viewmodelPassingObject.getObjectClass();
                    }


                    // read viewmodel.passingObject.objectClass == null
                    viewmodelPassingObjectObjectClassJavaLangObjectNull = (viewmodelPassingObjectObjectClass) == (null);
                if((dirtyFlags & 0x190L) != 0) {
                    if(viewmodelPassingObjectObjectClassJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewmodel.passingObject.objectClass == null ? @android:string/add_new_client : @android:string/edit_client
                    viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewClientBtnSaveAndroidStringEditClient = ((viewmodelPassingObjectObjectClassJavaLangObjectNull) ? (btnSave.getResources().getString(R.string.add_new_client)) : (btnSave.getResources().getString(R.string.edit_client)));
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x150L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x150L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
            }
            if ((dirtyFlags & 0x13fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addServiceRequest
                        viewmodelAddServiceRequest = viewmodel.getAddServiceRequest();
                    }

                if ((dirtyFlags & 0x131L) != 0) {

                        if (viewmodelAddServiceRequest != null) {
                            // read viewmodel.addServiceRequest.serviceWhatseError
                            viewmodelAddServiceRequestServiceWhatseError = viewmodelAddServiceRequest.serviceWhatseError;
                        }
                        updateRegistration(0, viewmodelAddServiceRequestServiceWhatseError);


                        if (viewmodelAddServiceRequestServiceWhatseError != null) {
                            // read viewmodel.addServiceRequest.serviceWhatseError.get()
                            viewmodelAddServiceRequestServiceWhatseErrorGet = viewmodelAddServiceRequestServiceWhatseError.get();
                        }
                }
                if ((dirtyFlags & 0x130L) != 0) {

                        if (viewmodelAddServiceRequest != null) {
                            // read viewmodel.addServiceRequest.serviceTitle
                            viewmodelAddServiceRequestServiceTitle = viewmodelAddServiceRequest.getServiceTitle();
                            // read viewmodel.addServiceRequest.serviceDesc
                            viewmodelAddServiceRequestServiceDesc = viewmodelAddServiceRequest.getServiceDesc();
                            // read viewmodel.addServiceRequest.servicePrice
                            viewmodelAddServiceRequestServicePrice = viewmodelAddServiceRequest.getServicePrice();
                            // read viewmodel.addServiceRequest.serviceWhats
                            viewmodelAddServiceRequestServiceWhats = viewmodelAddServiceRequest.getServiceWhats();
                            // read viewmodel.addServiceRequest.servicePhone
                            viewmodelAddServiceRequestServicePhone = viewmodelAddServiceRequest.getServicePhone();
                        }
                }
                if ((dirtyFlags & 0x132L) != 0) {

                        if (viewmodelAddServiceRequest != null) {
                            // read viewmodel.addServiceRequest.serviceTitleError
                            viewmodelAddServiceRequestServiceTitleError = viewmodelAddServiceRequest.serviceTitleError;
                        }
                        updateRegistration(1, viewmodelAddServiceRequestServiceTitleError);


                        if (viewmodelAddServiceRequestServiceTitleError != null) {
                            // read viewmodel.addServiceRequest.serviceTitleError.get()
                            viewmodelAddServiceRequestServiceTitleErrorGet = viewmodelAddServiceRequestServiceTitleError.get();
                        }
                }
                if ((dirtyFlags & 0x134L) != 0) {

                        if (viewmodelAddServiceRequest != null) {
                            // read viewmodel.addServiceRequest.servicePhoneError
                            viewmodelAddServiceRequestServicePhoneError = viewmodelAddServiceRequest.servicePhoneError;
                        }
                        updateRegistration(2, viewmodelAddServiceRequestServicePhoneError);


                        if (viewmodelAddServiceRequestServicePhoneError != null) {
                            // read viewmodel.addServiceRequest.servicePhoneError.get()
                            viewmodelAddServiceRequestServicePhoneErrorGet = viewmodelAddServiceRequestServicePhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x138L) != 0) {

                        if (viewmodelAddServiceRequest != null) {
                            // read viewmodel.addServiceRequest.servicePriceError
                            viewmodelAddServiceRequestServicePriceError = viewmodelAddServiceRequest.servicePriceError;
                        }
                        updateRegistration(3, viewmodelAddServiceRequestServicePriceError);


                        if (viewmodelAddServiceRequestServicePriceError != null) {
                            // read viewmodel.addServiceRequest.servicePriceError.get()
                            viewmodelAddServiceRequestServicePriceErrorGet = viewmodelAddServiceRequestServicePriceError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x100000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x150L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x150L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x150L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (getColorFromResource(btnSave, R.color.colorPrimaryDark)) : (getColorFromResource(btnSave, R.color.medium_color)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, androidx.databinding.adapters.Converters.convertColorToDrawable(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor));
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.clientType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, clientTypeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnSave, viewmodelPassingObjectObjectClassJavaLangObjectNullBtnSaveAndroidStringAddNewClientBtnSaveAndroidStringEditClient);
        }
        if ((dirtyFlags & 0x130L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientType, viewmodelAddServiceRequestServiceWhats);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddServiceRequestServiceTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddServiceRequestServicePrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddServiceRequestServicePhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelAddServiceRequestServiceDesc);
        }
        if ((dirtyFlags & 0x132L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddServiceRequestServiceTitleErrorGet);
        }
        if ((dirtyFlags & 0x138L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddServiceRequestServicePriceErrorGet);
        }
        if ((dirtyFlags & 0x134L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddServiceRequestServicePhoneErrorGet);
        }
        if ((dirtyFlags & 0x131L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddServiceRequestServiceWhatseErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.services.viewModels.ServicesViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.addNewService();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addServiceRequest.serviceWhatseError
        flag 1 (0x2L): viewmodel.addServiceRequest.serviceTitleError
        flag 2 (0x3L): viewmodel.addServiceRequest.servicePhoneError
        flag 3 (0x4L): viewmodel.addServiceRequest.servicePriceError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.addServiceRequest
        flag 6 (0x7L): viewmodel.message
        flag 7 (0x8L): viewmodel.passingObject
        flag 8 (0x9L): null
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 11 (0xcL): viewmodel.passingObject.objectClass == null ? @android:string/add_new_client : @android:string/edit_client
        flag 12 (0xdL): viewmodel.passingObject.objectClass == null ? @android:string/add_new_client : @android:string/edit_client
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 15 (0x10L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 16 (0x11L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 20 (0x15L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}