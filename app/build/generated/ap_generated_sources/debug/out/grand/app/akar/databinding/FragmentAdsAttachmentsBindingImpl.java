package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAdsAttachmentsBindingImpl extends FragmentAdsAttachmentsBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.attach_title, 6);
        sViewsWithIds.put(R.id.video_title, 7);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdsAttachmentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentAdsAttachmentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            );
        this.adImagesRc.setTag(null);
        this.close7.setTag(null);
        this.confirmBtn.setTag(null);
        this.image7.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.play.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback55 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback58 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback56 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((grand.app.akar.pages.ads.viewModels.AttachmentsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AttachmentsViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AttachmentsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AttachmentsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.fileObjectVideo) {
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
        grand.app.akar.connection.FileObject viewmodelFileObjectVideo = null;
        boolean textUtilsIsEmptyViewmodelFileObjectVideoFilePath = false;
        java.lang.String viewmodelFileObjectVideoFilePath = null;
        boolean TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1 = false;
        grand.app.akar.pages.ads.adapter.AdImagesAdapter viewmodelImagesAdapter = null;
        int textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE = 0;
        grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.fileObjectVideo
                    viewmodelFileObjectVideo = viewmodel.getFileObjectVideo();
                }


                if (viewmodelFileObjectVideo != null) {
                    // read viewmodel.fileObjectVideo.filePath
                    viewmodelFileObjectVideoFilePath = viewmodelFileObjectVideo.getFilePath();
                }


                // read TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath)
                textUtilsIsEmptyViewmodelFileObjectVideoFilePath = android.text.TextUtils.isEmpty(viewmodelFileObjectVideoFilePath);


                // read !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath)
                TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1 = !textUtilsIsEmptyViewmodelFileObjectVideoFilePath;
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE = ((TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.imagesAdapter
                        viewmodelImagesAdapter = viewmodel.getImagesAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.adImagesRc, viewmodelImagesAdapter, "3", "1");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.close7.setOnClickListener(mCallback56);
            this.confirmBtn.setOnClickListener(mCallback58);
            this.image7.setOnClickListener(mCallback55);
            this.play.setOnClickListener(mCallback57);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.close7.setVisibility(textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE);
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
                grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.pickVideo();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.pickVideo();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.uploadAd();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.removeVideo();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.fileObjectVideo
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}