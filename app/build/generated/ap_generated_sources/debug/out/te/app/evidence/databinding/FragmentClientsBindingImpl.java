package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentClientsBindingImpl extends FragmentClientsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_search, 3);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.github.clans.fab.FloatingActionButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClientsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentClientsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.github.clans.fab.FloatingActionButton) bindings[2];
        this.mboundView2.setTag(null);
        this.rcClients.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.clients.viewModels.ClientsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.clients.viewModels.ClientsViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.evidence.pages.clients.viewModels.ClientsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.clients.viewModels.ClientsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.clientsAdapter) {
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
        te.app.evidence.pages.clients.adapters.ClientsAdapter viewmodelClientsAdapter = null;
        te.app.evidence.pages.clients.viewModels.ClientsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.clientsAdapter
                    viewmodelClientsAdapter = viewmodel.getClientsAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback34);
        }
        if ((dirtyFlags & 0x7L) != 0) {
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
        te.app.evidence.pages.clients.viewModels.ClientsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.toNewClient();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.clientsAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}