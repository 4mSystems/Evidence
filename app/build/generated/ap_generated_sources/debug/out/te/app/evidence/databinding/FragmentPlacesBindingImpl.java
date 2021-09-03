package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlacesBindingImpl extends FragmentPlacesBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlacesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentPlacesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbBaseLoadingBar.setTag(null);
        this.rcProducts.setTag(null);
        this.searchInput.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.places.viewModels.PlacesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.places.viewModels.PlacesViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.places.viewModels.PlacesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.places.viewModels.PlacesViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.placesAdapter) {
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
        te.app.evidence.pages.places.adapters.PlacesAdapter viewmodelPlacesAdapter = null;
        int viewmodelPlacesAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        int viewmodelPlacesAdapterItemCount = 0;
        boolean viewmodelPlacesAdapterItemCountInt0 = false;
        te.app.evidence.pages.places.viewModels.PlacesViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.placesAdapter
                    viewmodelPlacesAdapter = viewmodel.getPlacesAdapter();
                }


                if (viewmodelPlacesAdapter != null) {
                    // read viewmodel.placesAdapter.itemCount
                    viewmodelPlacesAdapterItemCount = viewmodelPlacesAdapter.getItemCount();
                }


                // read viewmodel.placesAdapter.itemCount == 0
                viewmodelPlacesAdapterItemCountInt0 = (viewmodelPlacesAdapterItemCount) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPlacesAdapterItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.placesAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                viewmodelPlacesAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelPlacesAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.pbBaseLoadingBar.setVisibility(viewmodelPlacesAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcProducts, viewmodelPlacesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.searchInput.setOnClickListener(mCallback20);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.places.viewModels.PlacesViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.showGovs();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.placesAdapter
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.placesAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.placesAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}