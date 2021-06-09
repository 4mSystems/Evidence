package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddClientToCaseBindingImpl extends FragmentAddClientToCaseBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView7;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddClientToCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentAddClientToCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.clients.setTag(null);
        this.inputClients.setTag(null);
        this.inputKhesm.setTag(null);
        this.inputKhesms.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (android.widget.ProgressBar) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatButton) bindings[8];
        this.mboundView8.setTag(null);
        this.tvClients.setTag(null);
        this.tvKhesm.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback63 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback61 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewmodel((te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel Viewmodel) {
        updateRegistration(3, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddCaseRequestMokelError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelLoader((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddCaseRequestKhesmError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestMokelError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestMokelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLoader(androidx.databinding.ObservableField<java.lang.Boolean> ViewmodelLoader, int fieldId) {
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
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestMokelError = null;
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewmodelLoader = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelLoaderGet = false;
        int viewmodelPassingObjectIdInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAddCaseRequestKhesmErrorGet = null;
        boolean viewmodelLoaderBooleanFalse = false;
        int ViewmodelPassingObjectIdInt0ViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean viewmodelLoaderGet = null;
        boolean viewmodelPassingObjectIdInt0 = false;
        boolean viewmodelLoaderBooleanTrue = false;
        int viewmodelPassingObjectId = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestKhesmError = null;
        int viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = 0;
        boolean ViewmodelPassingObjectIdInt01 = false;
        java.lang.String viewmodelAddCaseRequestMokelErrorGet = null;
        int viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = 0;
        te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.id
                        viewmodelPassingObjectId = viewmodelPassingObject.getId();
                    }


                    // read viewmodel.passingObject.id != 0
                    viewmodelPassingObjectIdInt0 = (viewmodelPassingObjectId) != (0);
                    // read viewmodel.passingObject.id == 0
                    ViewmodelPassingObjectIdInt01 = (viewmodelPassingObjectId) == (0);
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewmodelPassingObjectIdInt0) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x38L) != 0) {
                    if(ViewmodelPassingObjectIdInt01) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.passingObject.id != 0 ? View.VISIBLE : View.GONE
                    ViewmodelPassingObjectIdInt0ViewVISIBLEViewGONE1 = ((viewmodelPassingObjectIdInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.passingObject.id == 0 ? View.VISIBLE : View.GONE
                    viewmodelPassingObjectIdInt0ViewVISIBLEViewGONE = ((ViewmodelPassingObjectIdInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x2dL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCaseRequest
                        viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                    }

                if ((dirtyFlags & 0x29L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.mokelError
                            viewmodelAddCaseRequestMokelError = viewmodelAddCaseRequest.mokelError;
                        }
                        updateRegistration(0, viewmodelAddCaseRequestMokelError);


                        if (viewmodelAddCaseRequestMokelError != null) {
                            // read viewmodel.addCaseRequest.mokelError.get()
                            viewmodelAddCaseRequestMokelErrorGet = viewmodelAddCaseRequestMokelError.get();
                        }
                }
                if ((dirtyFlags & 0x2cL) != 0) {

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
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.loader
                        viewmodelLoader = viewmodel.loader;
                    }
                    updateRegistration(1, viewmodelLoader);


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
                if((dirtyFlags & 0x2aL) != 0) {
                    if(viewmodelLoaderBooleanFalse) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x2aL) != 0) {
                    if(viewmodelLoaderBooleanTrue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanFalseViewGONEViewVISIBLE = ((viewmodelLoaderBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
                    viewmodelLoaderBooleanTrueViewGONEViewVISIBLE = ((viewmodelLoaderBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.clients.setVisibility(viewmodelPassingObjectIdInt0ViewVISIBLEViewGONE);
            this.inputKhesms.setVisibility(ViewmodelPassingObjectIdInt0ViewVISIBLEViewGONE1);
            this.tvClients.setVisibility(viewmodelPassingObjectIdInt0ViewVISIBLEViewGONE);
            this.tvKhesm.setVisibility(ViewmodelPassingObjectIdInt0ViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.clients.setError(viewmodelAddCaseRequestMokelErrorGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.inputClients.setOnClickListener(mCallback61);
            this.inputKhesm.setOnClickListener(mCallback62);
            this.mboundView8.setOnClickListener(mCallback63);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            this.inputKhesms.setError(viewmodelAddCaseRequestKhesmErrorGet);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewmodelLoaderBooleanFalseViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(viewmodelLoaderBooleanTrueViewGONEViewVISIBLE);
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
                te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel viewmodel = mViewmodel;



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
                te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel viewmodel = mViewmodel;



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
                te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel viewmodel = mViewmodel;



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
        flag 0 (0x1L): viewmodel.addCaseRequest.mokelError
        flag 1 (0x2L): viewmodel.loader
        flag 2 (0x3L): viewmodel.addCaseRequest.khesmError
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): viewmodel.passingObject
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.passingObject.id == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.passingObject.id == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.passingObject.id != 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.passingObject.id != 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == false ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loader.get()) == true ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}