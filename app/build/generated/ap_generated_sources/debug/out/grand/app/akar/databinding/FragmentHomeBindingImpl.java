package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"fragment_ad_rent_dialog"},
            new int[] {13},
            new int[] {grand.app.akar.R.layout.fragment_ad_rent_dialog});
        sIncludes.setIncludes(5, 
            new String[] {"home_map_layout"},
            new int[] {12},
            new int[] {grand.app.akar.R.layout.home_map_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_search, 14);
        sViewsWithIds.put(R.id.card_list, 15);
        sViewsWithIds.put(R.id.list_buttons, 16);
        sViewsWithIds.put(R.id.v17, 17);
        sViewsWithIds.put(R.id.map_buttons, 18);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback188;
    @Nullable
    private final android.view.View.OnClickListener mCallback194;
    @Nullable
    private final android.view.View.OnClickListener mCallback192;
    @Nullable
    private final android.view.View.OnClickListener mCallback189;
    @Nullable
    private final android.view.View.OnClickListener mCallback193;
    @Nullable
    private final android.view.View.OnClickListener mCallback191;
    @Nullable
    private final android.view.View.OnClickListener mCallback190;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[16]
            , (grand.app.akar.databinding.FragmentAdRentDialogBinding) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (grand.app.akar.databinding.HomeMapLayoutBinding) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            , (android.view.View) bindings[17]
            );
        this.btnDiffLocations.setTag(null);
        this.cardMap.setTag(null);
        this.catHomeRc.setTag(null);
        this.frameToList.setTag(null);
        this.googleBaseLocation.setTag(null);
        this.googleMapStyle.setTag(null);
        this.icFilter.setTag(null);
        setContainedBinding(this.listingTypeSheet);
        this.map.setTag(null);
        setContainedBinding(this.mapInclude);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.selectedRc.setTag(null);
        this.sort.setTag(null);
        setRootTag(root);
        // listeners
        mCallback188 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback194 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback192 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback189 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback193 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback191 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback190 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mapInclude.invalidateAll();
        listingTypeSheet.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mapInclude.hasPendingBindings()) {
            return true;
        }
        if (listingTypeSheet.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.home.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.home.viewModels.HomeViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mapInclude.setLifecycleOwner(lifecycleOwner);
        listingTypeSheet.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeListingTypeSheet((grand.app.akar.databinding.FragmentAdRentDialogBinding) object, fieldId);
            case 1 :
                return onChangeMapInclude((grand.app.akar.databinding.HomeMapLayoutBinding) object, fieldId);
            case 2 :
                return onChangeViewmodel((grand.app.akar.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeListingTypeSheet(grand.app.akar.databinding.FragmentAdRentDialogBinding ListingTypeSheet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMapInclude(grand.app.akar.databinding.HomeMapLayoutBinding MapInclude, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
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
        int viewmodelSearchRequestListingType = 0;
        grand.app.akar.pages.home.adapters.HomeCategoriesAdapter viewmodelCategoriesAdapter = null;
        java.lang.String viewmodelSearchRequestListingTypeInt0BtnDiffLocationsAndroidStringRentBtnDiffLocationsAndroidStringSell = null;
        grand.app.akar.pages.home.adapters.HomeAdapter viewmodelHomeAdapter = null;
        grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
        boolean viewmodelSearchRequestListingTypeInt0 = false;
        grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xcL) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.categoriesAdapter
                    viewmodelCategoriesAdapter = viewmodel.getCategoriesAdapter();
                    // read viewmodel.homeAdapter
                    viewmodelHomeAdapter = viewmodel.getHomeAdapter();
                    // read viewmodel.searchRequest
                    viewmodelSearchRequest = viewmodel.getSearchRequest();
                }


                if (viewmodelSearchRequest != null) {
                    // read viewmodel.searchRequest.listing_type
                    viewmodelSearchRequestListingType = viewmodelSearchRequest.getListing_type();
                }


                // read viewmodel.searchRequest.listing_type == 0
                viewmodelSearchRequestListingTypeInt0 = (viewmodelSearchRequestListingType) == (0);
            if((dirtyFlags & 0xcL) != 0) {
                if(viewmodelSearchRequestListingTypeInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewmodel.searchRequest.listing_type == 0 ? @android:string/rent : @android:string/sell
                viewmodelSearchRequestListingTypeInt0BtnDiffLocationsAndroidStringRentBtnDiffLocationsAndroidStringSell = ((viewmodelSearchRequestListingTypeInt0) ? (btnDiffLocations.getResources().getString(R.string.rent)) : (btnDiffLocations.getResources().getString(R.string.sell)));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnDiffLocations.setOnClickListener(mCallback188);
            this.frameToList.setOnClickListener(mCallback194);
            this.googleBaseLocation.setOnClickListener(mCallback192);
            this.googleMapStyle.setOnClickListener(mCallback193);
            this.icFilter.setOnClickListener(mCallback189);
            this.map.setOnClickListener(mCallback191);
            this.sort.setOnClickListener(mCallback190);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnDiffLocations, viewmodelSearchRequestListingTypeInt0BtnDiffLocationsAndroidStringRentBtnDiffLocationsAndroidStringSell);
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.catHomeRc, viewmodelCategoriesAdapter, "1", "2");
            this.listingTypeSheet.setViewModel(viewmodel);
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.mboundView4, viewmodelHomeAdapter, "1", "1");
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewmodelHomeAdapter, "1", "2");
        }
        executeBindingsOn(mapInclude);
        executeBindingsOn(listingTypeSheet);
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
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.rentTypeFilter();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.filpCard();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.reCenterToCurrentLocation();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toFilter();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.changeMapStyle();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.filpCard();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sortDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listingTypeSheet
        flag 1 (0x2L): mapInclude
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.searchRequest.listing_type == 0 ? @android:string/rent : @android:string/sell
        flag 5 (0x6L): viewmodel.searchRequest.listing_type == 0 ? @android:string/rent : @android:string/sell
    flag mapping end*/
    //end
}