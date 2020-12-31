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
        sViewsWithIds.put(R.id.attach_title, 7);
        sViewsWithIds.put(R.id.video_title, 8);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdsAttachmentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentAdsAttachmentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            );
        this.adImagesRc.setTag(null);
        this.close7.setTag(null);
        this.confirmBtn.setTag(null);
        this.editBtn.setTag(null);
        this.image7.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.play.setTag(null);
        setRootTag(root);
        // listeners
        mCallback106 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback108 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback107 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback105 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback109 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
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
        else if (fieldId == BR.sliderItem) {
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
        int viewmodelSliderItemSizeInt0ViewVISIBLEViewGONE = 0;
        int ViewmodelSliderItemSizeInt0ViewVISIBLEViewGONE1 = 0;
        int viewmodelSliderItemSize = 0;
        boolean viewmodelSliderItemSizeInt0 = false;
        grand.app.akar.connection.FileObject viewmodelFileObjectVideo = null;
        java.util.List<grand.app.akar.pages.adDetails.models.SliderItem> viewmodelSliderItem = null;
        boolean textUtilsIsEmptyViewmodelFileObjectVideoFilePath = false;
        java.lang.String viewmodelFileObjectVideoFilePath = null;
        boolean TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1 = false;
        grand.app.akar.pages.ads.adapter.AdImagesAdapter viewmodelImagesAdapter = null;
        int textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE = 0;
        boolean ViewmodelSliderItemSizeInt01 = false;
        grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

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
                if((dirtyFlags & 0xbL) != 0) {
                    if(TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
                    textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE = ((TextUtilsIsEmptyViewmodelFileObjectVideoFilePath1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.sliderItem
                        viewmodelSliderItem = viewmodel.getSliderItem();
                    }


                    if (viewmodelSliderItem != null) {
                        // read viewmodel.sliderItem.size()
                        viewmodelSliderItemSize = viewmodelSliderItem.size();
                    }


                    // read viewmodel.sliderItem.size() > 0
                    viewmodelSliderItemSizeInt0 = (viewmodelSliderItemSize) > (0);
                    // read viewmodel.sliderItem.size() == 0
                    ViewmodelSliderItemSizeInt01 = (viewmodelSliderItemSize) == (0);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewmodelSliderItemSizeInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0xdL) != 0) {
                    if(ViewmodelSliderItemSizeInt01) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.sliderItem.size() > 0 ? View.VISIBLE : View.GONE
                    viewmodelSliderItemSizeInt0ViewVISIBLEViewGONE = ((viewmodelSliderItemSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.sliderItem.size() == 0 ? View.VISIBLE : View.GONE
                    ViewmodelSliderItemSizeInt0ViewVISIBLEViewGONE1 = ((ViewmodelSliderItemSizeInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.imagesAdapter
                        viewmodelImagesAdapter = viewmodel.getImagesAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.adImagesRc, viewmodelImagesAdapter, "3", "1");
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.close7.setOnClickListener(mCallback106);
            this.confirmBtn.setOnClickListener(mCallback108);
            this.editBtn.setOnClickListener(mCallback109);
            this.image7.setOnClickListener(mCallback105);
            this.play.setOnClickListener(mCallback107);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.close7.setVisibility(textUtilsIsEmptyViewmodelFileObjectVideoFilePathViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.confirmBtn.setVisibility(ViewmodelSliderItemSizeInt0ViewVISIBLEViewGONE1);
            this.editBtn.setVisibility(viewmodelSliderItemSizeInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.updateImages();
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
        flag 2 (0x3L): viewmodel.sliderItem
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.sliderItem.size() > 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.sliderItem.size() > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.sliderItem.size() == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.sliderItem.size() == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.fileObjectVideo.filePath) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}