package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditCaseBindingImpl extends FragmentEditCaseBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputEditText mboundView10;
    @NonNull
    private final android.widget.ProgressBar mboundView11;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView12;
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
    private final com.google.android.material.textfield.TextInputLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.inventation_type
            //         is viewmodel.addCaseRequest.setInventation_type((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
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
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.circle_num
            //         is viewmodel.addCaseRequest.setCircle_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
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
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.invetation_num
            //         is viewmodel.addCaseRequest.setInvetation_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
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
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.court
            //         is viewmodel.addCaseRequest.setCourt((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
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

    public FragmentEditCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentEditCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            );
        this.inputCat.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (com.google.android.material.textfield.TextInputEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ProgressBar) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (androidx.appcompat.widget.AppCompatButton) bindings[12];
        this.mboundView12.setTag(null);
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
        this.mboundView9 = (com.google.android.material.textfield.TextInputLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback24 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        updateRegistration(6, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
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
                return onChangeViewmodelAddCaseRequestInvetationTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddCaseRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddCaseRequestCourtError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddCaseRequestCircleNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
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
    private boolean onChangeViewmodelAddCaseRequestInvetationTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCatError, int fieldId) {
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
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewmodelLoader = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationNumError = null;
        java.lang.String viewmodelAddCaseRequestCircleNumErrorGet = null;
        java.lang.String viewmodelAddCaseRequestInvetationNumErrorGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationTypeError = null;
        java.lang.String viewmodelAddCaseRequestCatErrorGet = null;
        boolean viewmodelLoaderBooleanFalse = false;
        java.lang.Boolean viewmodelLoaderGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCatError = null;
        java.lang.String viewmodelAddCaseRequestInventationType = null;
        boolean viewmodelLoaderBooleanTrue = false;
        java.lang.String viewmodelAddCaseRequestInvetationTypeErrorGet = null;
        int viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = 0;
        java.lang.String viewmodelAddCaseRequestCourtErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCourtError = null;
        int viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCircleNumError = null;
        java.lang.String viewmodelAddCaseRequestCircleNum = null;
        te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xfeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCaseRequest
                        viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                    }

                if ((dirtyFlags & 0xc0L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.court
                            viewmodelAddCaseRequestCourt = viewmodelAddCaseRequest.getCourt();
                            // read viewmodel.addCaseRequest.invetation_num
                            viewmodelAddCaseRequestInvetationNum = viewmodelAddCaseRequest.getInvetation_num();
                            // read viewmodel.addCaseRequest.inventation_type
                            viewmodelAddCaseRequestInventationType = viewmodelAddCaseRequest.getInventation_type();
                            // read viewmodel.addCaseRequest.circle_num
                            viewmodelAddCaseRequestCircleNum = viewmodelAddCaseRequest.getCircle_num();
                        }
                }
                if ((dirtyFlags & 0xc2L) != 0) {

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
                if ((dirtyFlags & 0xc4L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError
                            viewmodelAddCaseRequestInvetationTypeError = viewmodelAddCaseRequest.invetationTypeError;
                        }
                        updateRegistration(2, viewmodelAddCaseRequestInvetationTypeError);


                        if (viewmodelAddCaseRequestInvetationTypeError != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError.get()
                            viewmodelAddCaseRequestInvetationTypeErrorGet = viewmodelAddCaseRequestInvetationTypeError.get();
                        }
                }
                if ((dirtyFlags & 0xc8L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.catError
                            viewmodelAddCaseRequestCatError = viewmodelAddCaseRequest.catError;
                        }
                        updateRegistration(3, viewmodelAddCaseRequestCatError);


                        if (viewmodelAddCaseRequestCatError != null) {
                            // read viewmodel.addCaseRequest.catError.get()
                            viewmodelAddCaseRequestCatErrorGet = viewmodelAddCaseRequestCatError.get();
                        }
                }
                if ((dirtyFlags & 0xd0L) != 0) {

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
                if ((dirtyFlags & 0xe0L) != 0) {

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
            }
            if ((dirtyFlags & 0xc1L) != 0) {

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


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false
                    viewmodelLoaderBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet) == (false);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true
                    viewmodelLoaderBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet) == (true);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewmodelLoaderBooleanFalse) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewmodelLoaderBooleanTrue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = ((viewmodelLoaderBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = ((viewmodelLoaderBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.inputCat.setOnClickListener(mCallback23);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            this.mboundView12.setOnClickListener(mCallback24);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddCaseRequestCircleNumErrorGet);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelAddCaseRequestInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddCaseRequestCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddCaseRequestInvetationNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddCaseRequestCourt);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewmodelLoaderBooleanFalseViewGONEViewVISIBLE);
            this.mboundView12.setVisibility(viewmodelLoaderBooleanTrueViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddCaseRequestInvetationNumErrorGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddCaseRequestCourtErrorGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddCaseRequestCatErrorGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddCaseRequestInvetationTypeErrorGet);
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


                    viewmodel.toCategories();
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


                    viewmodel.editCase();
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
        flag 2 (0x3L): viewmodel.addCaseRequest.invetationTypeError
        flag 3 (0x4L): viewmodel.addCaseRequest.catError
        flag 4 (0x5L): viewmodel.addCaseRequest.courtError
        flag 5 (0x6L): viewmodel.addCaseRequest.circleNumError
        flag 6 (0x7L): viewmodel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}