package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMonthlyReportsBindingImpl extends FragmentMonthlyReportsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_year, 5);
        sViewsWithIds.put(R.id.input_month, 6);
        sViewsWithIds.put(R.id.search, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMonthlyReportsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentMonthlyReportsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            );
        this.inputCat.setTag(null);
        this.inputCategory.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.rcClients.setTag(null);
        setRootTag(root);
        // listeners
        mCallback83 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewmodel((te.app.evidence.pages.reports.viewModels.ReportsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.reports.viewModels.ReportsViewModel Viewmodel) {
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
                return onChangeViewmodelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.reports.viewModels.ReportsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewmodelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.reports.viewModels.ReportsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.clientsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        int viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        te.app.evidence.pages.clients.adapters.ClientsAdapter viewmodelClientsAdapter = null;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String viewmodelUserDataUserDataType = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.clientsAdapter
                        viewmodelClientsAdapter = viewmodel.getClientsAdapter();
                    }
            }
            if ((dirtyFlags & 0xaL) != 0) {

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
                        // read viewmodel.userData.userData.type.equals("admin")
                        viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = viewmodelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0xaL) != 0) {
                    if(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.inputCat.setOnClickListener(mCallback83);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.inputCategory.setVisibility(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcClients, viewmodelClientsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {




            viewmodel.action(te.app.evidence.utils.Constants.SHOW_CATEGORIES);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.clientsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}