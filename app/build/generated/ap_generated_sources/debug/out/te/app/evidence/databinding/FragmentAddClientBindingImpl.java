package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddClientBindingImpl extends FragmentAddClientBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputLayout mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView12;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView13;
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
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addClientRequest.notes
            //         is viewmodel.addClientRequest.setNotes((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewmodel.addClientRequest.notes
            java.lang.String viewmodelAddClientRequestNotes = null;
            // viewmodel.addClientRequest
            te.app.evidence.pages.clients.models.AddClientRequest viewmodelAddClientRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addClientRequest != null
            boolean viewmodelAddClientRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddClientRequest = viewmodel.getAddClientRequest();

                viewmodelAddClientRequestJavaLangObjectNull = (viewmodelAddClientRequest) != (null);
                if (viewmodelAddClientRequestJavaLangObjectNull) {




                    viewmodelAddClientRequest.setNotes(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addClientRequest.client_Name
            //         is viewmodel.addClientRequest.setClient_Name((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addClientRequest.client_Name
            java.lang.String viewmodelAddClientRequestClientName = null;
            // viewmodel.addClientRequest
            te.app.evidence.pages.clients.models.AddClientRequest viewmodelAddClientRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addClientRequest != null
            boolean viewmodelAddClientRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddClientRequest = viewmodel.getAddClientRequest();

                viewmodelAddClientRequestJavaLangObjectNull = (viewmodelAddClientRequest) != (null);
                if (viewmodelAddClientRequestJavaLangObjectNull) {




                    viewmodelAddClientRequest.setClient_Name(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addClientRequest.client_Unit
            //         is viewmodel.addClientRequest.setClient_Unit((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.addClientRequest
            te.app.evidence.pages.clients.models.AddClientRequest viewmodelAddClientRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addClientRequest != null
            boolean viewmodelAddClientRequestJavaLangObjectNull = false;
            // viewmodel.addClientRequest.client_Unit
            java.lang.String viewmodelAddClientRequestClientUnit = null;
            // viewmodel
            te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddClientRequest = viewmodel.getAddClientRequest();

                viewmodelAddClientRequestJavaLangObjectNull = (viewmodelAddClientRequest) != (null);
                if (viewmodelAddClientRequestJavaLangObjectNull) {




                    viewmodelAddClientRequest.setClient_Unit(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addClientRequest.client_Address
            //         is viewmodel.addClientRequest.setClient_Address((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addClientRequest
            te.app.evidence.pages.clients.models.AddClientRequest viewmodelAddClientRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addClientRequest.client_Address
            java.lang.String viewmodelAddClientRequestClientAddress = null;
            // viewmodel.addClientRequest != null
            boolean viewmodelAddClientRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddClientRequest = viewmodel.getAddClientRequest();

                viewmodelAddClientRequestJavaLangObjectNull = (viewmodelAddClientRequest) != (null);
                if (viewmodelAddClientRequestJavaLangObjectNull) {




                    viewmodelAddClientRequest.setClient_Address(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddClientBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentAddClientBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            );
        this.catName.setTag(null);
        this.clientType.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (com.google.android.material.textfield.TextInputEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (androidx.appcompat.widget.AppCompatButton) bindings[13];
        this.mboundView13.setTag(null);
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
        mCallback2 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback3 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback1 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.clients.viewModels.AddClientViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.clients.viewModels.AddClientViewModel Viewmodel) {
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
                return onChangeViewmodelAddClientRequestClientUnitError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddClientRequestClientNoteError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddClientRequestClientCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddClientRequestClientTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddClientRequestClientNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelAddClientRequestClientAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodel((te.app.evidence.pages.clients.viewModels.AddClientViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientUnitError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientUnitError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientNoteError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientNoteError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddClientRequestClientAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddClientRequestClientAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.clients.viewModels.AddClientViewModel Viewmodel, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientUnitError = null;
        java.lang.String viewmodelAddClientRequestClientTypeErrorGet = null;
        java.lang.String viewmodelAddClientRequestClientUnitErrorGet = null;
        java.lang.String viewmodelAddClientRequestClientAddressErrorGet = null;
        java.lang.String viewmodelAddClientRequestClientNameErrorGet = null;
        java.lang.String viewmodelAddClientRequestClientUnit = null;
        java.lang.String viewmodelAddClientRequestNotes = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientNoteError = null;
        java.lang.String viewmodelAddClientRequestClientCatErrorGet = null;
        java.lang.String viewmodelAddClientRequestClientName = null;
        te.app.evidence.pages.clients.models.AddClientRequest viewmodelAddClientRequest = null;
        java.lang.String viewmodelAddClientRequestClientNoteErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientCatError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientTypeError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientNameError = null;
        java.lang.String viewmodelAddClientRequestClientAddress = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddClientRequestClientAddressError = null;
        te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xffL) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.addClientRequest
                    viewmodelAddClientRequest = viewmodel.getAddClientRequest();
                }

            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientUnitError
                        viewmodelAddClientRequestClientUnitError = viewmodelAddClientRequest.clientUnitError;
                    }
                    updateRegistration(0, viewmodelAddClientRequestClientUnitError);


                    if (viewmodelAddClientRequestClientUnitError != null) {
                        // read viewmodel.addClientRequest.clientUnitError.get()
                        viewmodelAddClientRequestClientUnitErrorGet = viewmodelAddClientRequestClientUnitError.get();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.client_Unit
                        viewmodelAddClientRequestClientUnit = viewmodelAddClientRequest.getClient_Unit();
                        // read viewmodel.addClientRequest.notes
                        viewmodelAddClientRequestNotes = viewmodelAddClientRequest.getNotes();
                        // read viewmodel.addClientRequest.client_Name
                        viewmodelAddClientRequestClientName = viewmodelAddClientRequest.getClient_Name();
                        // read viewmodel.addClientRequest.client_Address
                        viewmodelAddClientRequestClientAddress = viewmodelAddClientRequest.getClient_Address();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientNoteError
                        viewmodelAddClientRequestClientNoteError = viewmodelAddClientRequest.clientNoteError;
                    }
                    updateRegistration(1, viewmodelAddClientRequestClientNoteError);


                    if (viewmodelAddClientRequestClientNoteError != null) {
                        // read viewmodel.addClientRequest.clientNoteError.get()
                        viewmodelAddClientRequestClientNoteErrorGet = viewmodelAddClientRequestClientNoteError.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientCatError
                        viewmodelAddClientRequestClientCatError = viewmodelAddClientRequest.clientCatError;
                    }
                    updateRegistration(2, viewmodelAddClientRequestClientCatError);


                    if (viewmodelAddClientRequestClientCatError != null) {
                        // read viewmodel.addClientRequest.clientCatError.get()
                        viewmodelAddClientRequestClientCatErrorGet = viewmodelAddClientRequestClientCatError.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientTypeError
                        viewmodelAddClientRequestClientTypeError = viewmodelAddClientRequest.clientTypeError;
                    }
                    updateRegistration(3, viewmodelAddClientRequestClientTypeError);


                    if (viewmodelAddClientRequestClientTypeError != null) {
                        // read viewmodel.addClientRequest.clientTypeError.get()
                        viewmodelAddClientRequestClientTypeErrorGet = viewmodelAddClientRequestClientTypeError.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientNameError
                        viewmodelAddClientRequestClientNameError = viewmodelAddClientRequest.clientNameError;
                    }
                    updateRegistration(4, viewmodelAddClientRequestClientNameError);


                    if (viewmodelAddClientRequestClientNameError != null) {
                        // read viewmodel.addClientRequest.clientNameError.get()
                        viewmodelAddClientRequestClientNameErrorGet = viewmodelAddClientRequestClientNameError.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewmodelAddClientRequest != null) {
                        // read viewmodel.addClientRequest.clientAddressError
                        viewmodelAddClientRequestClientAddressError = viewmodelAddClientRequest.clientAddressError;
                    }
                    updateRegistration(5, viewmodelAddClientRequestClientAddressError);


                    if (viewmodelAddClientRequestClientAddressError != null) {
                        // read viewmodel.addClientRequest.clientAddressError.get()
                        viewmodelAddClientRequestClientAddressErrorGet = viewmodelAddClientRequestClientAddressError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.catName.setOnClickListener(mCallback2);
            this.clientType.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView13.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddClientRequestClientNameErrorGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.mboundView11.setError(viewmodelAddClientRequestClientNoteErrorGet);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelAddClientRequestNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddClientRequestClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddClientRequestClientUnit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddClientRequestClientAddress);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView3.setError(viewmodelAddClientRequestClientUnitErrorGet);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.mboundView5.setError(viewmodelAddClientRequestClientAddressErrorGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.mboundView7.setError(viewmodelAddClientRequestClientTypeErrorGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelAddClientRequestClientCatErrorGet);
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
                te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.showCategories();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.addNewClient();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.clients.viewModels.AddClientViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.showClientType();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addClientRequest.clientUnitError
        flag 1 (0x2L): viewmodel.addClientRequest.clientNoteError
        flag 2 (0x3L): viewmodel.addClientRequest.clientCatError
        flag 3 (0x4L): viewmodel.addClientRequest.clientTypeError
        flag 4 (0x5L): viewmodel.addClientRequest.clientNameError
        flag 5 (0x6L): viewmodel.addClientRequest.clientAddressError
        flag 6 (0x7L): viewmodel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}