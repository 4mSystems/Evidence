package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAkarLocationsMapBindingImpl extends FragmentAkarLocationsMapBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_search, 4);
        sViewsWithIds.put(R.id.mapview, 5);
        sViewsWithIds.put(R.id.address_progress, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAkarLocationsMapBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentAkarLocationsMapBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (com.google.android.gms.maps.MapView) bindings[5]
            );
        this.btnDiffLocations.setTag(null);
        this.confirmBtn.setTag(null);
        this.editBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback47 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback48 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((grand.app.akar.pages.ads.viewModels.AdsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AdsViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AdsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AdsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.updateRequest) {
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
        int viewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE = 0;
        boolean viewmodelUpdateRequestListingIdInt0 = false;
        int ViewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE1 = 0;
        grand.app.akar.pages.ads.models.LocationUpdateRequest viewmodelUpdateRequest = null;
        int viewmodelUpdateRequestListingId = 0;
        boolean ViewmodelUpdateRequestListingIdInt01 = false;
        grand.app.akar.pages.ads.viewModels.AdsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.updateRequest
                    viewmodelUpdateRequest = viewmodel.getUpdateRequest();
                }


                if (viewmodelUpdateRequest != null) {
                    // read viewmodel.updateRequest.listing_id
                    viewmodelUpdateRequestListingId = viewmodelUpdateRequest.getListing_id();
                }


                // read viewmodel.updateRequest.listing_id == 0
                viewmodelUpdateRequestListingIdInt0 = (viewmodelUpdateRequestListingId) == (0);
                // read viewmodel.updateRequest.listing_id != 0
                ViewmodelUpdateRequestListingIdInt01 = (viewmodelUpdateRequestListingId) != (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUpdateRequestListingIdInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(ViewmodelUpdateRequestListingIdInt01) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewmodel.updateRequest.listing_id == 0 ? View.GONE : View.VISIBLE
                viewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE = ((viewmodelUpdateRequestListingIdInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewmodel.updateRequest.listing_id != 0 ? View.GONE : View.VISIBLE
                ViewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE1 = ((ViewmodelUpdateRequestListingIdInt01) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnDiffLocations.setOnClickListener(mCallback47);
            this.confirmBtn.setOnClickListener(mCallback48);
            this.editBtn.setOnClickListener(mCallback49);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.confirmBtn.setVisibility(ViewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE1);
            this.editBtn.setVisibility(viewmodelUpdateRequestListingIdInt0ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AdsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toEditLocations();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AdsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toCities();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AdsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toCategories();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.updateRequest
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.updateRequest.listing_id == 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewmodel.updateRequest.listing_id == 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewmodel.updateRequest.listing_id != 0 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewmodel.updateRequest.listing_id != 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}