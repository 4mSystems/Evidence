package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAdsAttachmentsBindingImpl extends FragmentAdsAttachmentsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.attach_title, 1);
        sViewsWithIds.put(R.id.image1, 2);
        sViewsWithIds.put(R.id.close1, 3);
        sViewsWithIds.put(R.id.image2, 4);
        sViewsWithIds.put(R.id.close2, 5);
        sViewsWithIds.put(R.id.image3, 6);
        sViewsWithIds.put(R.id.close3, 7);
        sViewsWithIds.put(R.id.br5, 8);
        sViewsWithIds.put(R.id.image4, 9);
        sViewsWithIds.put(R.id.close4, 10);
        sViewsWithIds.put(R.id.image5, 11);
        sViewsWithIds.put(R.id.close5, 12);
        sViewsWithIds.put(R.id.image6, 13);
        sViewsWithIds.put(R.id.close6, 14);
        sViewsWithIds.put(R.id.br6, 15);
        sViewsWithIds.put(R.id.video_title, 16);
        sViewsWithIds.put(R.id.image7, 17);
        sViewsWithIds.put(R.id.close7, 18);
        sViewsWithIds.put(R.id.play, 19);
        sViewsWithIds.put(R.id.confirmBtn, 20);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdsAttachmentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentAdsAttachmentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatButton) bindings[20]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[4]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[6]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[11]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[13]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}