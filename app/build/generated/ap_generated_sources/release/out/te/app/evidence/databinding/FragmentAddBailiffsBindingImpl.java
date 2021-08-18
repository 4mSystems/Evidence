package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddBailiffsBindingImpl extends FragmentAddBailiffsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final te.app.evidence.customViews.views.DateEditText mboundView10;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView13;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView15;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView16;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView17;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView19;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final te.app.evidence.customViews.views.DateEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.sessionDate
            //         is viewmodel.addMohdrRequest.setSessionDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewmodel.addMohdrRequest.sessionDate
            java.lang.String viewmodelAddMohdrRequestSessionDate = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setSessionDate(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView16androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.casenumber
            //         is viewmodel.addMohdrRequest.setCasenumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView16);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest.casenumber
            java.lang.String viewmodelAddMohdrRequestCasenumber = null;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setCasenumber(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView19androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.notes
            //         is viewmodel.addMohdrRequest.setNotes((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView19);
            // localize variables for thread safety
            // viewmodel.addMohdrRequest.notes
            java.lang.String viewmodelAddMohdrRequestNotes = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setNotes(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.courtMohdareen
            //         is viewmodel.addMohdrRequest.setCourtMohdareen((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addMohdrRequest.courtMohdareen
            java.lang.String viewmodelAddMohdrRequestCourtMohdareen = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setCourtMohdareen(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.paperType
            //         is viewmodel.addMohdrRequest.setPaperType((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.addMohdrRequest.paperType
            java.lang.String viewmodelAddMohdrRequestPaperType = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setPaperType(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.deliverData
            //         is viewmodel.addMohdrRequest.setDeliverData((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addMohdrRequest.deliverData
            java.lang.String viewmodelAddMohdrRequestDeliverData = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setDeliverData(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addMohdrRequest.paperNumber
            //         is viewmodel.addMohdrRequest.setPaperNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest.paperNumber
            java.lang.String viewmodelAddMohdrRequestPaperNumber = null;
            // viewmodel.addMohdrRequest != null
            boolean viewmodelAddMohdrRequestJavaLangObjectNull = false;
            // viewmodel.addMohdrRequest
            te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();

                viewmodelAddMohdrRequestJavaLangObjectNull = (viewmodelAddMohdrRequest) != (null);
                if (viewmodelAddMohdrRequestJavaLangObjectNull) {




                    viewmodelAddMohdrRequest.setPaperNumber(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddBailiffsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentAddBailiffsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (androidx.appcompat.widget.AppCompatButton) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[18]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[21]
            );
        this.btnSave.setTag(null);
        this.inputCat.setTag(null);
        this.inputClients.setTag(null);
        this.inputKhesm.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (te.app.evidence.customViews.views.DateEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (com.google.android.material.textfield.TextInputLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (com.google.android.material.textfield.TextInputLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (com.google.android.material.textfield.TextInputEditText) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.google.android.material.textfield.TextInputLayout) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView19 = (com.google.android.material.textfield.TextInputEditText) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (te.app.evidence.customViews.views.DateEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback74 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback71 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback72 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback73 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setViewmodel((te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel Viewmodel) {
        updateRegistration(9, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddMohdrRequestKhesmError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddMohdrRequestInvetationNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddMohdrRequestPaperTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddMohdrRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddMohdrRequestCourtError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddMohdrRequestDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelAddMohdrRequestMokelError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodelAddMohdrRequestPaperNumberError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewmodelAddMohdrRequestDeliverDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewmodel((te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestKhesmError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestKhesmError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestInvetationNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestInvetationNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestPaperTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestPaperTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestCourtError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestCourtError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestMokelError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestMokelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestPaperNumberError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestPaperNumberError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddMohdrRequestDeliverDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddMohdrRequestDeliverDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestKhesmError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestInvetationNumError = null;
        java.lang.String viewmodelAddMohdrRequestCasenumber = null;
        java.lang.String viewmodelAddMohdrRequestDeliverDateErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestPaperTypeError = null;
        java.lang.String viewmodelAddMohdrRequestCatErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        boolean viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        java.lang.String viewmodelAddMohdrRequestKhesmErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestCatError = null;
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        java.lang.String viewmodelMessage = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestCourtError = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestDateError = null;
        java.lang.String viewmodelAddMohdrRequestDeliverData = null;
        java.lang.String viewmodelAddMohdrRequestNotes = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestMokelError = null;
        java.lang.String viewmodelAddMohdrRequestCourtErrorGet = null;
        int viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAddMohdrRequestMokelErrorGet = null;
        java.lang.String viewmodelAddMohdrRequestDateErrorGet = null;
        java.lang.String viewmodelAddMohdrRequestCourtMohdareen = null;
        java.lang.String viewmodelAddMohdrRequestInvetationNumErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelAddMohdrRequestPaperNumberErrorGet = null;
        java.lang.String viewmodelAddMohdrRequestPaperNumber = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestPaperNumberError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddMohdrRequestDeliverDateError = null;
        java.lang.String viewmodelAddMohdrRequestSessionDate = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        te.app.evidence.pages.mohdrs.models.AddMohdrRequest viewmodelAddMohdrRequest = null;
        java.lang.String viewmodelUserDataUserDataType = null;
        java.lang.String viewmodelAddMohdrRequestPaperType = null;
        java.lang.String viewmodelAddMohdrRequestPaperTypeErrorGet = null;
        te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0xe00L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xe00L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xe00L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0xa00L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.userData
                        viewmodelUserDataUserData = viewmodelUserData.getUserData();
                    }


                    if (viewmodelUserDataUserData != null) {
                        // read viewmodel.userData.userData.type
                        viewmodelUserDataUserDataType = viewmodelUserDataUserData.getType();
                    }


                    if (viewmodelUserDataUserDataType != null) {
                        // read viewmodel.userData.userData.type.equals("Admin")
                        viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = viewmodelUserDataUserDataType.equals("Admin");
                    }
                if((dirtyFlags & 0xa00L) != 0) {
                    if(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewmodel.userData.userData.type.equals("Admin") ? View.VISIBLE : View.GONE
                    viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xbffL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addMohdrRequest
                        viewmodelAddMohdrRequest = viewmodel.getAddMohdrRequest();
                    }

                if ((dirtyFlags & 0xa01L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.khesmError
                            viewmodelAddMohdrRequestKhesmError = viewmodelAddMohdrRequest.khesmError;
                        }
                        updateRegistration(0, viewmodelAddMohdrRequestKhesmError);


                        if (viewmodelAddMohdrRequestKhesmError != null) {
                            // read viewmodel.addMohdrRequest.khesmError.get()
                            viewmodelAddMohdrRequestKhesmErrorGet = viewmodelAddMohdrRequestKhesmError.get();
                        }
                }
                if ((dirtyFlags & 0xa02L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.invetationNumError
                            viewmodelAddMohdrRequestInvetationNumError = viewmodelAddMohdrRequest.invetationNumError;
                        }
                        updateRegistration(1, viewmodelAddMohdrRequestInvetationNumError);


                        if (viewmodelAddMohdrRequestInvetationNumError != null) {
                            // read viewmodel.addMohdrRequest.invetationNumError.get()
                            viewmodelAddMohdrRequestInvetationNumErrorGet = viewmodelAddMohdrRequestInvetationNumError.get();
                        }
                }
                if ((dirtyFlags & 0xa00L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.casenumber
                            viewmodelAddMohdrRequestCasenumber = viewmodelAddMohdrRequest.getCasenumber();
                            // read viewmodel.addMohdrRequest.deliverData
                            viewmodelAddMohdrRequestDeliverData = viewmodelAddMohdrRequest.getDeliverData();
                            // read viewmodel.addMohdrRequest.notes
                            viewmodelAddMohdrRequestNotes = viewmodelAddMohdrRequest.getNotes();
                            // read viewmodel.addMohdrRequest.courtMohdareen
                            viewmodelAddMohdrRequestCourtMohdareen = viewmodelAddMohdrRequest.getCourtMohdareen();
                            // read viewmodel.addMohdrRequest.paperNumber
                            viewmodelAddMohdrRequestPaperNumber = viewmodelAddMohdrRequest.getPaperNumber();
                            // read viewmodel.addMohdrRequest.sessionDate
                            viewmodelAddMohdrRequestSessionDate = viewmodelAddMohdrRequest.getSessionDate();
                            // read viewmodel.addMohdrRequest.paperType
                            viewmodelAddMohdrRequestPaperType = viewmodelAddMohdrRequest.getPaperType();
                        }
                }
                if ((dirtyFlags & 0xa04L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.paperTypeError
                            viewmodelAddMohdrRequestPaperTypeError = viewmodelAddMohdrRequest.paperTypeError;
                        }
                        updateRegistration(2, viewmodelAddMohdrRequestPaperTypeError);


                        if (viewmodelAddMohdrRequestPaperTypeError != null) {
                            // read viewmodel.addMohdrRequest.paperTypeError.get()
                            viewmodelAddMohdrRequestPaperTypeErrorGet = viewmodelAddMohdrRequestPaperTypeError.get();
                        }
                }
                if ((dirtyFlags & 0xa08L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.catError
                            viewmodelAddMohdrRequestCatError = viewmodelAddMohdrRequest.catError;
                        }
                        updateRegistration(3, viewmodelAddMohdrRequestCatError);


                        if (viewmodelAddMohdrRequestCatError != null) {
                            // read viewmodel.addMohdrRequest.catError.get()
                            viewmodelAddMohdrRequestCatErrorGet = viewmodelAddMohdrRequestCatError.get();
                        }
                }
                if ((dirtyFlags & 0xa10L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.courtError
                            viewmodelAddMohdrRequestCourtError = viewmodelAddMohdrRequest.courtError;
                        }
                        updateRegistration(4, viewmodelAddMohdrRequestCourtError);


                        if (viewmodelAddMohdrRequestCourtError != null) {
                            // read viewmodel.addMohdrRequest.courtError.get()
                            viewmodelAddMohdrRequestCourtErrorGet = viewmodelAddMohdrRequestCourtError.get();
                        }
                }
                if ((dirtyFlags & 0xa20L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.dateError
                            viewmodelAddMohdrRequestDateError = viewmodelAddMohdrRequest.dateError;
                        }
                        updateRegistration(5, viewmodelAddMohdrRequestDateError);


                        if (viewmodelAddMohdrRequestDateError != null) {
                            // read viewmodel.addMohdrRequest.dateError.get()
                            viewmodelAddMohdrRequestDateErrorGet = viewmodelAddMohdrRequestDateError.get();
                        }
                }
                if ((dirtyFlags & 0xa40L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.mokelError
                            viewmodelAddMohdrRequestMokelError = viewmodelAddMohdrRequest.mokelError;
                        }
                        updateRegistration(6, viewmodelAddMohdrRequestMokelError);


                        if (viewmodelAddMohdrRequestMokelError != null) {
                            // read viewmodel.addMohdrRequest.mokelError.get()
                            viewmodelAddMohdrRequestMokelErrorGet = viewmodelAddMohdrRequestMokelError.get();
                        }
                }
                if ((dirtyFlags & 0xa80L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.paperNumberError
                            viewmodelAddMohdrRequestPaperNumberError = viewmodelAddMohdrRequest.paperNumberError;
                        }
                        updateRegistration(7, viewmodelAddMohdrRequestPaperNumberError);


                        if (viewmodelAddMohdrRequestPaperNumberError != null) {
                            // read viewmodel.addMohdrRequest.paperNumberError.get()
                            viewmodelAddMohdrRequestPaperNumberErrorGet = viewmodelAddMohdrRequestPaperNumberError.get();
                        }
                }
                if ((dirtyFlags & 0xb00L) != 0) {

                        if (viewmodelAddMohdrRequest != null) {
                            // read viewmodel.addMohdrRequest.deliverDateError
                            viewmodelAddMohdrRequestDeliverDateError = viewmodelAddMohdrRequest.deliverDateError;
                        }
                        updateRegistration(8, viewmodelAddMohdrRequestDeliverDateError);


                        if (viewmodelAddMohdrRequestDeliverDateError != null) {
                            // read viewmodel.addMohdrRequest.deliverDateError.get()
                            viewmodelAddMohdrRequestDeliverDateErrorGet = viewmodelAddMohdrRequestDeliverDateError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xe00L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xe00L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0xe00L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
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
        if ((dirtyFlags & 0xe00L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, androidx.databinding.adapters.Converters.convertColorToDrawable(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor));
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback74);
            this.inputCat.setOnClickListener(mCallback73);
            this.inputClients.setOnClickListener(mCallback71);
            this.inputKhesm.setOnClickListener(mCallback72);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView16, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView16androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView19, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView19androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xa10L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddMohdrRequestCourtErrorGet);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddMohdrRequestSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, viewmodelAddMohdrRequestCasenumber);
            this.mboundView17.setVisibility(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, viewmodelAddMohdrRequestNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddMohdrRequestCourtMohdareen);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddMohdrRequestPaperType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddMohdrRequestDeliverData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddMohdrRequestPaperNumber);
        }
        if ((dirtyFlags & 0xa40L) != 0) {
            // api target 1

            this.mboundView11.setError(viewmodelAddMohdrRequestMokelErrorGet);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            this.mboundView13.setError(viewmodelAddMohdrRequestKhesmErrorGet);
        }
        if ((dirtyFlags & 0xa02L) != 0) {
            // api target 1

            this.mboundView15.setError(viewmodelAddMohdrRequestInvetationNumErrorGet);
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            this.mboundView17.setError(viewmodelAddMohdrRequestCatErrorGet);
        }
        if ((dirtyFlags & 0xa04L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddMohdrRequestPaperTypeErrorGet);
        }
        if ((dirtyFlags & 0xb00L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddMohdrRequestDeliverDateErrorGet);
        }
        if ((dirtyFlags & 0xa80L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddMohdrRequestPaperNumberErrorGet);
        }
        if ((dirtyFlags & 0xa20L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddMohdrRequestDateErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createMohdr();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.toClients(te.app.evidence.utils.Constants.CLIENTS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.toClients(te.app.evidence.utils.Constants.KHESM);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toCategories();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addMohdrRequest.khesmError
        flag 1 (0x2L): viewmodel.addMohdrRequest.invetationNumError
        flag 2 (0x3L): viewmodel.addMohdrRequest.paperTypeError
        flag 3 (0x4L): viewmodel.addMohdrRequest.catError
        flag 4 (0x5L): viewmodel.addMohdrRequest.courtError
        flag 5 (0x6L): viewmodel.addMohdrRequest.dateError
        flag 6 (0x7L): viewmodel.addMohdrRequest.mokelError
        flag 7 (0x8L): viewmodel.addMohdrRequest.paperNumberError
        flag 8 (0x9L): viewmodel.addMohdrRequest.deliverDateError
        flag 9 (0xaL): viewmodel
        flag 10 (0xbL): viewmodel.message
        flag 11 (0xcL): null
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 14 (0xfL): viewmodel.userData.userData.type.equals("Admin") ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.userData.userData.type.equals("Admin") ? View.VISIBLE : View.GONE
        flag 16 (0x11L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 17 (0x12L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 18 (0x13L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 19 (0x14L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 20 (0x15L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 23 (0x18L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}