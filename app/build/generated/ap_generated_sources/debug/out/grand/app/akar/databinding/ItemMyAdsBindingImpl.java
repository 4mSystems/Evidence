package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyAdsBindingImpl extends ItemMyAdsBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_home_distance, 4);
        sViewsWithIds.put(R.id.tv_home_desc, 5);
        sViewsWithIds.put(R.id.tv_building, 6);
        sViewsWithIds.put(R.id.tv_beds, 7);
        sViewsWithIds.put(R.id.tv_path, 8);
        sViewsWithIds.put(R.id.br10, 9);
        sViewsWithIds.put(R.id.tv_location, 10);
        sViewsWithIds.put(R.id.tv_pormote, 11);
        sViewsWithIds.put(R.id.tv_remove, 12);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyAdsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemMyAdsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[12]
            );
        this.imgHomeItem.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvHomeItem.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemHomeViewModel == variableId) {
            setItemHomeViewModel((grand.app.akar.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemHomeViewModel(@Nullable grand.app.akar.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel) {
        updateRegistration(0, ItemHomeViewModel);
        this.mItemHomeViewModel = ItemHomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemHomeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemHomeViewModel((grand.app.akar.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemHomeViewModel(grand.app.akar.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
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
        java.lang.String itemHomeViewModelImage = null;
        grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        java.lang.String itemHomeViewModelHomeDataName = null;
        grand.app.akar.pages.home.models.HomeData itemHomeViewModelHomeData = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemHomeViewModel != null) {
                        // read itemHomeViewModel.image
                        itemHomeViewModelImage = itemHomeViewModel.image;
                    }
            }

                if (itemHomeViewModel != null) {
                    // read itemHomeViewModel.homeData
                    itemHomeViewModelHomeData = itemHomeViewModel.getHomeData();
                }


                if (itemHomeViewModelHomeData != null) {
                    // read itemHomeViewModel.homeData.name
                    itemHomeViewModelHomeDataName = itemHomeViewModelHomeData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.imgHomeItem, itemHomeViewModelImage);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, itemHomeViewModelHomeDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemHomeViewModel
        grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        // itemHomeViewModel != null
        boolean itemHomeViewModelJavaLangObjectNull = false;



        itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
        if (itemHomeViewModelJavaLangObjectNull) {


            itemHomeViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemHomeViewModel
        flag 1 (0x2L): itemHomeViewModel.homeData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}