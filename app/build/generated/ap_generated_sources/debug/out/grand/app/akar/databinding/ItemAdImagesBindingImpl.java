package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAdImagesBindingImpl extends ItemAdImagesBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback104;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAdImagesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemAdImagesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            );
        this.close1.setTag(null);
        this.image1.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback104 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback103 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.orderImages) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.selected) {
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
        grand.app.akar.pages.ads.models.OrderImages itemViewModelOrderImages = null;
        grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelSelected = false;
        int itemViewModelSelectedViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelOrderImagesPath = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.orderImages
                        itemViewModelOrderImages = itemViewModel.getOrderImages();
                    }


                    if (itemViewModelOrderImages != null) {
                        // read itemViewModel.orderImages.path
                        itemViewModelOrderImagesPath = itemViewModelOrderImages.getPath();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.selected
                        itemViewModelSelected = itemViewModel.isSelected();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(itemViewModelSelected) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read itemViewModel.selected ? View.VISIBLE : View.GONE
                    itemViewModelSelectedViewVISIBLEViewGONE = ((itemViewModelSelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.close1.setOnClickListener(mCallback104);
            this.image1.setOnClickListener(mCallback103);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.close1.setVisibility(itemViewModelSelectedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.image1, itemViewModelOrderImagesPath);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.removeImage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.akar.pages.ads.viewModels.ItemPublicOrderImagesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.orderImages
        flag 2 (0x3L): itemViewModel.selected
        flag 3 (0x4L): null
        flag 4 (0x5L): itemViewModel.selected ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.selected ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}