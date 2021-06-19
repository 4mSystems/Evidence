package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddCaseBindingImpl extends FragmentAddCaseBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputEditText mboundView12;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView13;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView15;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView16;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView17;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.first_session_date
            //         is viewmodel.addCaseRequest.setFirst_session_date((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.first_session_date
            java.lang.String viewmodelAddCaseRequestFirstSessionDate = null;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setFirst_session_date(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.court
            //         is viewmodel.addCaseRequest.setCourt((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.court
            java.lang.String viewmodelAddCaseRequestCourt = null;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setCourt(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView16androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.inventation_type
            //         is viewmodel.addCaseRequest.setInventation_type((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView16);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.inventation_type
            java.lang.String viewmodelAddCaseRequestInventationType = null;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setInventation_type(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView17androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.descion
            //         is viewmodel.addCaseRequest.setDescion((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView17);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.descion
            java.lang.String viewmodelAddCaseRequestDescion = null;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setDescion(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.circle_num
            //         is viewmodel.addCaseRequest.setCircle_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.circle_num
            java.lang.String viewmodelAddCaseRequestCircleNum = null;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setCircle_num(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.invetation_num
            //         is viewmodel.addCaseRequest.setInvetation_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel.addCaseRequest.invetation_num
            java.lang.String viewmodelAddCaseRequestInvetationNum = null;
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setInvetation_num(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentAddCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[19]
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
        this.mboundView12 = (com.google.android.material.textfield.TextInputEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (com.google.android.material.textfield.TextInputLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (com.google.android.material.textfield.TextInputLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (com.google.android.material.textfield.TextInputEditText) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.google.android.material.textfield.TextInputEditText) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
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
        mCallback27 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback28 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback29 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback26 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
            setViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel) {
        updateRegistration(8, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddCaseRequestInvetationNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddCaseRequestDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddCaseRequestKhesmError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddCaseRequestCourtError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddCaseRequestCircleNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddCaseRequestMokelError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelAddCaseRequestInvetationTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodelAddCaseRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestKhesmError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestKhesmError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCourtError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCourtError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCircleNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCircleNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestMokelError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestMokelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewmodelAddCaseRequestCourt = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAddCaseRequestInvetationNum = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationNumError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestDateError = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelAddCaseRequestInventationType = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelAddCaseRequestInvetationTypeErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestKhesmError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCourtError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCircleNumError = null;
        java.lang.String viewmodelAddCaseRequestDateErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestMokelError = null;
        java.lang.String viewmodelAddCaseRequestFirstSessionDate = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = 0;
        java.lang.String viewmodelAddCaseRequestCircleNumErrorGet = null;
        java.lang.String viewmodelAddCaseRequestInvetationNumErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationTypeError = null;
        java.lang.String viewmodelAddCaseRequestKhesmErrorGet = null;
        java.lang.String viewmodelAddCaseRequestCatErrorGet = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCatError = null;
        java.lang.String viewmodelAddCaseRequestCourtErrorGet = null;
        java.lang.String viewmodelAddCaseRequestMokelErrorGet = null;
        java.lang.String viewmodelAddCaseRequestDescion = null;
        java.lang.String viewmodelAddCaseRequestCircleNum = null;
        te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x700L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x700L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x700L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
            }
            if ((dirtyFlags & 0x5ffL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCaseRequest
                        viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                    }

                if ((dirtyFlags & 0x500L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.court
                            viewmodelAddCaseRequestCourt = viewmodelAddCaseRequest.getCourt();
                            // read viewmodel.addCaseRequest.invetation_num
                            viewmodelAddCaseRequestInvetationNum = viewmodelAddCaseRequest.getInvetation_num();
                            // read viewmodel.addCaseRequest.inventation_type
                            viewmodelAddCaseRequestInventationType = viewmodelAddCaseRequest.getInventation_type();
                            // read viewmodel.addCaseRequest.first_session_date
                            viewmodelAddCaseRequestFirstSessionDate = viewmodelAddCaseRequest.getFirst_session_date();
                            // read viewmodel.addCaseRequest.descion
                            viewmodelAddCaseRequestDescion = viewmodelAddCaseRequest.getDescion();
                            // read viewmodel.addCaseRequest.circle_num
                            viewmodelAddCaseRequestCircleNum = viewmodelAddCaseRequest.getCircle_num();
                        }
                }
                if ((dirtyFlags & 0x501L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationNumError
                            viewmodelAddCaseRequestInvetationNumError = viewmodelAddCaseRequest.invetationNumError;
                        }
                        updateRegistration(0, viewmodelAddCaseRequestInvetationNumError);


                        if (viewmodelAddCaseRequestInvetationNumError != null) {
                            // read viewmodel.addCaseRequest.invetationNumError.get()
                            viewmodelAddCaseRequestInvetationNumErrorGet = viewmodelAddCaseRequestInvetationNumError.get();
                        }
                }
                if ((dirtyFlags & 0x502L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.dateError
                            viewmodelAddCaseRequestDateError = viewmodelAddCaseRequest.dateError;
                        }
                        updateRegistration(1, viewmodelAddCaseRequestDateError);


                        if (viewmodelAddCaseRequestDateError != null) {
                            // read viewmodel.addCaseRequest.dateError.get()
                            viewmodelAddCaseRequestDateErrorGet = viewmodelAddCaseRequestDateError.get();
                        }
                }
                if ((dirtyFlags & 0x504L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.khesmError
                            viewmodelAddCaseRequestKhesmError = viewmodelAddCaseRequest.khesmError;
                        }
                        updateRegistration(2, viewmodelAddCaseRequestKhesmError);


                        if (viewmodelAddCaseRequestKhesmError != null) {
                            // read viewmodel.addCaseRequest.khesmError.get()
                            viewmodelAddCaseRequestKhesmErrorGet = viewmodelAddCaseRequestKhesmError.get();
                        }
                }
                if ((dirtyFlags & 0x508L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.courtError
                            viewmodelAddCaseRequestCourtError = viewmodelAddCaseRequest.courtError;
                        }
                        updateRegistration(3, viewmodelAddCaseRequestCourtError);


                        if (viewmodelAddCaseRequestCourtError != null) {
                            // read viewmodel.addCaseRequest.courtError.get()
                            viewmodelAddCaseRequestCourtErrorGet = viewmodelAddCaseRequestCourtError.get();
                        }
                }
                if ((dirtyFlags & 0x510L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.circleNumError
                            viewmodelAddCaseRequestCircleNumError = viewmodelAddCaseRequest.circleNumError;
                        }
                        updateRegistration(4, viewmodelAddCaseRequestCircleNumError);


                        if (viewmodelAddCaseRequestCircleNumError != null) {
                            // read viewmodel.addCaseRequest.circleNumError.get()
                            viewmodelAddCaseRequestCircleNumErrorGet = viewmodelAddCaseRequestCircleNumError.get();
                        }
                }
                if ((dirtyFlags & 0x520L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.mokelError
                            viewmodelAddCaseRequestMokelError = viewmodelAddCaseRequest.mokelError;
                        }
                        updateRegistration(5, viewmodelAddCaseRequestMokelError);


                        if (viewmodelAddCaseRequestMokelError != null) {
                            // read viewmodel.addCaseRequest.mokelError.get()
                            viewmodelAddCaseRequestMokelErrorGet = viewmodelAddCaseRequestMokelError.get();
                        }
                }
                if ((dirtyFlags & 0x540L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError
                            viewmodelAddCaseRequestInvetationTypeError = viewmodelAddCaseRequest.invetationTypeError;
                        }
                        updateRegistration(6, viewmodelAddCaseRequestInvetationTypeError);


                        if (viewmodelAddCaseRequestInvetationTypeError != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError.get()
                            viewmodelAddCaseRequestInvetationTypeErrorGet = viewmodelAddCaseRequestInvetationTypeError.get();
                        }
                }
                if ((dirtyFlags & 0x580L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.catError
                            viewmodelAddCaseRequestCatError = viewmodelAddCaseRequest.catError;
                        }
                        updateRegistration(7, viewmodelAddCaseRequestCatError);


                        if (viewmodelAddCaseRequestCatError != null) {
                            // read viewmodel.addCaseRequest.catError.get()
                            viewmodelAddCaseRequestCatErrorGet = viewmodelAddCaseRequestCatError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

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

        if ((dirtyFlags & 0x700L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x700L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x700L) != 0) {
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
        if ((dirtyFlags & 0x700L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, androidx.databinding.adapters.Converters.convertColorToDrawable(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor));
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback29);
            this.inputCat.setOnClickListener(mCallback28);
            this.inputClients.setOnClickListener(mCallback26);
            this.inputKhesm.setOnClickListener(mCallback27);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView16, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView16androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x520L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddCaseRequestMokelErrorGet);
        }
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddCaseRequestFirstSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelAddCaseRequestCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, viewmodelAddCaseRequestInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewmodelAddCaseRequestDescion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddCaseRequestCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddCaseRequestInvetationNum);
        }
        if ((dirtyFlags & 0x508L) != 0) {
            // api target 1

            this.mboundView11.setError(viewmodelAddCaseRequestCourtErrorGet);
        }
        if ((dirtyFlags & 0x580L) != 0) {
            // api target 1

            this.mboundView13.setError(viewmodelAddCaseRequestCatErrorGet);
        }
        if ((dirtyFlags & 0x540L) != 0) {
            // api target 1

            this.mboundView15.setError(viewmodelAddCaseRequestInvetationTypeErrorGet);
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddCaseRequestKhesmErrorGet);
        }
        if ((dirtyFlags & 0x510L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddCaseRequestCircleNumErrorGet);
        }
        if ((dirtyFlags & 0x501L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddCaseRequestInvetationNumErrorGet);
        }
        if ((dirtyFlags & 0x502L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddCaseRequestDateErrorGet);
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
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



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
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toCategories();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createCase();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.toClients(te.app.evidence.utils.Constants.CLIENTS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addCaseRequest.invetationNumError
        flag 1 (0x2L): viewmodel.addCaseRequest.dateError
        flag 2 (0x3L): viewmodel.addCaseRequest.khesmError
        flag 3 (0x4L): viewmodel.addCaseRequest.courtError
        flag 4 (0x5L): viewmodel.addCaseRequest.circleNumError
        flag 5 (0x6L): viewmodel.addCaseRequest.mokelError
        flag 6 (0x7L): viewmodel.addCaseRequest.invetationTypeError
        flag 7 (0x8L): viewmodel.addCaseRequest.catError
        flag 8 (0x9L): viewmodel
        flag 9 (0xaL): viewmodel.message
        flag 10 (0xbL): null
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
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