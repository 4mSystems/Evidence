package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddSessionBindingImpl extends FragmentAddSessionBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.date_v, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final te.app.evidence.customViews.views.DateEditText mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addSessionRequest.sessionDate
            //         is viewmodel.addSessionRequest.setSessionDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addSessionRequest != null
            boolean viewmodelAddSessionRequestJavaLangObjectNull = false;
            // viewmodel.addSessionRequest.sessionDate
            java.lang.String viewmodelAddSessionRequestSessionDate = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.sessions.viewModels.AddSessionViewModel viewmodel = mViewmodel;
            // viewmodel.addSessionRequest
            te.app.evidence.pages.sessions.models.AddSessionRequest viewmodelAddSessionRequest = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddSessionRequest = viewmodel.getAddSessionRequest();

                viewmodelAddSessionRequestJavaLangObjectNull = (viewmodelAddSessionRequest) != (null);
                if (viewmodelAddSessionRequestJavaLangObjectNull) {




                    viewmodelAddSessionRequest.setSessionDate(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentAddSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (te.app.evidence.customViews.views.DateEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback52 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.sessions.viewModels.AddSessionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.sessions.viewModels.AddSessionViewModel Viewmodel) {
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
                return onChangeViewmodelAddSessionRequestDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.sessions.viewModels.AddSessionViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddSessionRequestDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddSessionRequestDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.sessions.viewModels.AddSessionViewModel Viewmodel, int fieldId) {
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
        java.lang.String viewmodelAddSessionRequestSessionDate = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddSessionRequestDateError = null;
        java.lang.String viewmodelAddSessionRequestDateErrorGet = null;
        te.app.evidence.pages.sessions.viewModels.AddSessionViewModel viewmodel = mViewmodel;
        te.app.evidence.pages.sessions.models.AddSessionRequest viewmodelAddSessionRequest = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.addSessionRequest
                    viewmodelAddSessionRequest = viewmodel.getAddSessionRequest();
                }

            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewmodelAddSessionRequest != null) {
                        // read viewmodel.addSessionRequest.sessionDate
                        viewmodelAddSessionRequestSessionDate = viewmodelAddSessionRequest.getSessionDate();
                    }
            }

                if (viewmodelAddSessionRequest != null) {
                    // read viewmodel.addSessionRequest.dateError
                    viewmodelAddSessionRequestDateError = viewmodelAddSessionRequest.dateError;
                }
                updateRegistration(0, viewmodelAddSessionRequestDateError);


                if (viewmodelAddSessionRequestDateError != null) {
                    // read viewmodel.addSessionRequest.dateError.get()
                    viewmodelAddSessionRequestDateErrorGet = viewmodelAddSessionRequestDateError.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddSessionRequestDateErrorGet);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddSessionRequestSessionDate);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback52);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.sessions.viewModels.AddSessionViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.addNewSession();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addSessionRequest.dateError
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}