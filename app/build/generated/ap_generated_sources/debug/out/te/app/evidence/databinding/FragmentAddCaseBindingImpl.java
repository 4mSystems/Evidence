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
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers
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

    public FragmentAddCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentAddCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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
        setRootTag(root);
        // listeners
        mCallback54 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback53 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddCaseRequestCircleNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCircleNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCircleNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
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
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        java.lang.String viewmodelAddCaseRequestCircleNumErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCircleNumError = null;
        java.lang.String viewmodelAddCaseRequestCircleNum = null;
        te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.addCaseRequest
                    viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                }


                if (viewmodelAddCaseRequest != null) {
                    // read viewmodel.addCaseRequest.circleNumError
                    viewmodelAddCaseRequestCircleNumError = viewmodelAddCaseRequest.circleNumError;
                }
                updateRegistration(0, viewmodelAddCaseRequestCircleNumError);


                if (viewmodelAddCaseRequestCircleNumError != null) {
                    // read viewmodel.addCaseRequest.circleNumError.get()
                    viewmodelAddCaseRequestCircleNumErrorGet = viewmodelAddCaseRequestCircleNumError.get();
                }
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewmodelAddCaseRequest != null) {
                        // read viewmodel.addCaseRequest.circle_num
                        viewmodelAddCaseRequestCircleNum = viewmodelAddCaseRequest.getCircle_num();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddCaseRequestCircleNumErrorGet);
            this.mboundView3.setError(viewmodelAddCaseRequestCircleNumErrorGet);
            this.mboundView5.setError(viewmodelAddCaseRequestCircleNumErrorGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback53);
            this.mboundView4.setOnClickListener(mCallback54);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddCaseRequestCircleNum);
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
        flag 0 (0x1L): viewmodel.addCaseRequest.circleNumError
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}