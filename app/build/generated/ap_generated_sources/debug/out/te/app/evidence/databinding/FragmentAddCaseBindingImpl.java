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
    private final android.widget.ProgressBar mboundView18;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView19;
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
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
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
        super(bindingComponent, root, 10
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            );
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
        this.mboundView18 = (android.widget.ProgressBar) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (androidx.appcompat.widget.AppCompatButton) bindings[19];
        this.mboundView19.setTag(null);
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
        setRootTag(root);
        // listeners
        mCallback55 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback56 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback57 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback58 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
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
                return onChangeViewmodelLoader((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddCaseRequestInvetationNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddCaseRequestDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddCaseRequestKhesmError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddCaseRequestCourtError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddCaseRequestCircleNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelAddCaseRequestMokelError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodelAddCaseRequestInvetationTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewmodelAddCaseRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelLoader(androidx.databinding.ObservableField<java.lang.Boolean> ViewmodelLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestKhesmError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestKhesmError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCourtError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCourtError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCircleNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCircleNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestMokelError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestMokelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String viewmodelAddCaseRequestCourt = null;
        java.lang.String viewmodelAddCaseRequestInvetationNum = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewmodelLoader = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationNumError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestDateError = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet = false;
        java.lang.String viewmodelAddCaseRequestInventationType = null;
        boolean viewmodelLoaderBooleanTrue = false;
        java.lang.String viewmodelAddCaseRequestInvetationTypeErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestKhesmError = null;
        int viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCourtError = null;
        int viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCircleNumError = null;
        java.lang.String viewmodelAddCaseRequestDateErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestMokelError = null;
        java.lang.String viewmodelAddCaseRequestFirstSessionDate = null;
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        java.lang.String viewmodelAddCaseRequestCircleNumErrorGet = null;
        java.lang.String viewmodelAddCaseRequestInvetationNumErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationTypeError = null;
        java.lang.String viewmodelAddCaseRequestKhesmErrorGet = null;
        java.lang.String viewmodelAddCaseRequestCatErrorGet = null;
        boolean viewmodelLoaderBooleanFalse = false;
        java.lang.Boolean viewmodelLoaderGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCatError = null;
        java.lang.String viewmodelAddCaseRequestCourtErrorGet = null;
        java.lang.String viewmodelAddCaseRequestMokelErrorGet = null;
        java.lang.String viewmodelAddCaseRequestDescion = null;
        java.lang.String viewmodelAddCaseRequestCircleNum = null;
        te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.loader
                        viewmodelLoader = viewmodel.loader;
                    }
                    updateRegistration(0, viewmodelLoader);


                    if (viewmodelLoader != null) {
                        // read viewmodel.loader.get()
                        viewmodelLoaderGet = viewmodelLoader.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelLoaderGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true
                    viewmodelLoaderBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet) == (true);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false
                    viewmodelLoaderBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet) == (false);
                if((dirtyFlags & 0x601L) != 0) {
                    if(viewmodelLoaderBooleanTrue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x601L) != 0) {
                    if(viewmodelLoaderBooleanFalse) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = ((viewmodelLoaderBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = ((viewmodelLoaderBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x7feL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCaseRequest
                        viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                    }

                if ((dirtyFlags & 0x600L) != 0) {

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
                if ((dirtyFlags & 0x602L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationNumError
                            viewmodelAddCaseRequestInvetationNumError = viewmodelAddCaseRequest.invetationNumError;
                        }
                        updateRegistration(1, viewmodelAddCaseRequestInvetationNumError);


                        if (viewmodelAddCaseRequestInvetationNumError != null) {
                            // read viewmodel.addCaseRequest.invetationNumError.get()
                            viewmodelAddCaseRequestInvetationNumErrorGet = viewmodelAddCaseRequestInvetationNumError.get();
                        }
                }
                if ((dirtyFlags & 0x604L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.dateError
                            viewmodelAddCaseRequestDateError = viewmodelAddCaseRequest.dateError;
                        }
                        updateRegistration(2, viewmodelAddCaseRequestDateError);


                        if (viewmodelAddCaseRequestDateError != null) {
                            // read viewmodel.addCaseRequest.dateError.get()
                            viewmodelAddCaseRequestDateErrorGet = viewmodelAddCaseRequestDateError.get();
                        }
                }
                if ((dirtyFlags & 0x608L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.khesmError
                            viewmodelAddCaseRequestKhesmError = viewmodelAddCaseRequest.khesmError;
                        }
                        updateRegistration(3, viewmodelAddCaseRequestKhesmError);


                        if (viewmodelAddCaseRequestKhesmError != null) {
                            // read viewmodel.addCaseRequest.khesmError.get()
                            viewmodelAddCaseRequestKhesmErrorGet = viewmodelAddCaseRequestKhesmError.get();
                        }
                }
                if ((dirtyFlags & 0x610L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.courtError
                            viewmodelAddCaseRequestCourtError = viewmodelAddCaseRequest.courtError;
                        }
                        updateRegistration(4, viewmodelAddCaseRequestCourtError);


                        if (viewmodelAddCaseRequestCourtError != null) {
                            // read viewmodel.addCaseRequest.courtError.get()
                            viewmodelAddCaseRequestCourtErrorGet = viewmodelAddCaseRequestCourtError.get();
                        }
                }
                if ((dirtyFlags & 0x620L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.circleNumError
                            viewmodelAddCaseRequestCircleNumError = viewmodelAddCaseRequest.circleNumError;
                        }
                        updateRegistration(5, viewmodelAddCaseRequestCircleNumError);


                        if (viewmodelAddCaseRequestCircleNumError != null) {
                            // read viewmodel.addCaseRequest.circleNumError.get()
                            viewmodelAddCaseRequestCircleNumErrorGet = viewmodelAddCaseRequestCircleNumError.get();
                        }
                }
                if ((dirtyFlags & 0x640L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.mokelError
                            viewmodelAddCaseRequestMokelError = viewmodelAddCaseRequest.mokelError;
                        }
                        updateRegistration(6, viewmodelAddCaseRequestMokelError);


                        if (viewmodelAddCaseRequestMokelError != null) {
                            // read viewmodel.addCaseRequest.mokelError.get()
                            viewmodelAddCaseRequestMokelErrorGet = viewmodelAddCaseRequestMokelError.get();
                        }
                }
                if ((dirtyFlags & 0x680L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError
                            viewmodelAddCaseRequestInvetationTypeError = viewmodelAddCaseRequest.invetationTypeError;
                        }
                        updateRegistration(7, viewmodelAddCaseRequestInvetationTypeError);


                        if (viewmodelAddCaseRequestInvetationTypeError != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError.get()
                            viewmodelAddCaseRequestInvetationTypeErrorGet = viewmodelAddCaseRequestInvetationTypeError.get();
                        }
                }
                if ((dirtyFlags & 0x700L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.catError
                            viewmodelAddCaseRequestCatError = viewmodelAddCaseRequest.catError;
                        }
                        updateRegistration(8, viewmodelAddCaseRequestCatError);


                        if (viewmodelAddCaseRequestCatError != null) {
                            // read viewmodel.addCaseRequest.catError.get()
                            viewmodelAddCaseRequestCatErrorGet = viewmodelAddCaseRequestCatError.get();
                        }
                }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.inputCat.setOnClickListener(mCallback57);
            this.inputClients.setOnClickListener(mCallback55);
            this.inputKhesm.setOnClickListener(mCallback56);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView16, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView16androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            this.mboundView19.setOnClickListener(mCallback58);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddCaseRequestMokelErrorGet);
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddCaseRequestFirstSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelAddCaseRequestCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, viewmodelAddCaseRequestInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewmodelAddCaseRequestDescion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddCaseRequestCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddCaseRequestInvetationNum);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.mboundView11.setError(viewmodelAddCaseRequestCourtErrorGet);
        }
        if ((dirtyFlags & 0x700L) != 0) {
            // api target 1

            this.mboundView13.setError(viewmodelAddCaseRequestCatErrorGet);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            this.mboundView15.setError(viewmodelAddCaseRequestInvetationTypeErrorGet);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(viewmodelLoaderBooleanFalseViewGONEViewVISIBLE);
            this.mboundView19.setVisibility(viewmodelLoaderBooleanTrueViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddCaseRequestKhesmErrorGet);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddCaseRequestCircleNumErrorGet);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddCaseRequestInvetationNumErrorGet);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddCaseRequestDateErrorGet);
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
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.loader
        flag 1 (0x2L): viewmodel.addCaseRequest.invetationNumError
        flag 2 (0x3L): viewmodel.addCaseRequest.dateError
        flag 3 (0x4L): viewmodel.addCaseRequest.khesmError
        flag 4 (0x5L): viewmodel.addCaseRequest.courtError
        flag 5 (0x6L): viewmodel.addCaseRequest.circleNumError
        flag 6 (0x7L): viewmodel.addCaseRequest.mokelError
        flag 7 (0x8L): viewmodel.addCaseRequest.invetationTypeError
        flag 8 (0x9L): viewmodel.addCaseRequest.catError
        flag 9 (0xaL): viewmodel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}