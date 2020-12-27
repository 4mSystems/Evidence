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
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(3, 
            new String[] {"home_map_layout"},
            new int[] {9},
            new int[] {grand.app.akar.R.layout.home_map_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_diff_locations, 10);
        sViewsWithIds.put(R.id.input_search, 11);
        sViewsWithIds.put(R.id.ic_filter, 12);
        sViewsWithIds.put(R.id.card_list, 13);
        sViewsWithIds.put(R.id.list_buttons, 14);
        sViewsWithIds.put(R.id.sort, 15);
        sViewsWithIds.put(R.id.v17, 16);
        sViewsWithIds.put(R.id.map_buttons, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (grand.app.akar.databinding.HomeMapLayoutBinding) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[15]
            , (android.view.View) bindings[16]
            );
        this.cardMap.setTag(null);
        this.catHomeRc.setTag(null);
        this.frameToList.setTag(null);
        this.googleBaseLocation.setTag(null);
        this.googleMapStyle.setTag(null);
        this.map.setTag(null);
        setContainedBinding(this.mapInclude);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.selectedRc.setTag(null);
        setRootTag(root);
        // listeners
        mCallback100 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback99 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback98 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback97 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mapInclude.invalidateAll();
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
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mapInclude.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMapInclude((grand.app.akar.databinding.HomeMapLayoutBinding) object, fieldId);
            case 1 :
                return onChangeViewmodel((grand.app.akar.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMapInclude(grand.app.akar.databinding.HomeMapLayoutBinding MapInclude, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
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
        grand.app.akar.pages.home.adapters.HomeCategoriesAdapter viewmodelCategoriesAdapter = null;
        grand.app.akar.pages.home.adapters.HomeAdapter viewmodelHomeAdapter = null;
        grand.app.akar.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.categoriesAdapter
                    viewmodelCategoriesAdapter = viewmodel.getCategoriesAdapter();
                    // read viewmodel.homeAdapter
                    viewmodelHomeAdapter = viewmodel.getHomeAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.catHomeRc, viewmodelCategoriesAdapter, "1", "2");
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.mboundView2, viewmodelHomeAdapter, "1", "1");
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewmodelHomeAdapter, "1", "2");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.frameToList.setOnClickListener(mCallback100);
            this.googleBaseLocation.setOnClickListener(mCallback98);
            this.googleMapStyle.setOnClickListener(mCallback99);
            this.map.setOnClickListener(mCallback97);
        }
        executeBindingsOn(mapInclude);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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


                    viewmodel.changeMapStyle();
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


                    viewmodel.reCenterToCurrentLocation();
                }
                break;
            }
            case 1: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mapInclude
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}