package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChatImagesBindingImpl extends ItemChatImagesBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChatImagesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemChatImagesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            );
        this.image1.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.defaultImg) {
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
        grand.app.akar.pages.home.models.DefaultImg itemViewModelDefaultImg = null;
        grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelDefaultImgMedia = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.defaultImg
                    itemViewModelDefaultImg = itemViewModel.getDefaultImg();
                }


                if (itemViewModelDefaultImg != null) {
                    // read itemViewModel.defaultImg.media
                    itemViewModelDefaultImgMedia = itemViewModelDefaultImg.getMedia();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.image1.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.image1, itemViewModelDefaultImgMedia);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel.defaultImg
        grand.app.akar.pages.home.models.DefaultImg itemViewModelDefaultImg = null;
        // itemViewModel
        grand.app.akar.pages.chat.viewmodel.ItemChatImagesViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;
        // itemViewModel.defaultImg != null
        boolean itemViewModelDefaultImgJavaLangObjectNull = false;
        // itemViewModel.defaultImg.media
        java.lang.String itemViewModelDefaultImgMedia = null;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {




            itemViewModelDefaultImg = itemViewModel.getDefaultImg();

            itemViewModelDefaultImgJavaLangObjectNull = (itemViewModelDefaultImg) != (null);
            if (itemViewModelDefaultImgJavaLangObjectNull) {


                itemViewModelDefaultImgMedia = itemViewModelDefaultImg.getMedia();


                itemViewModel.showImage(itemViewModelDefaultImgMedia, callbackArg_0);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.defaultImg
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}