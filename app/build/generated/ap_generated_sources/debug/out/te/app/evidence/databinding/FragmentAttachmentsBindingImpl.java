package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAttachmentsBindingImpl extends FragmentAttachmentsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_search, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView3;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAttachmentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentAttachmentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (com.airbnb.lottie.LottieAnimationView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4];
        this.mboundView4.setTag(null);
        this.progress.setTag(null);
        this.rcAttachments.setTag(null);
        setRootTag(root);
        // listeners
        mCallback71 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewmodelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.attachmentsAdapter) {
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
        int viewmodelAttachmentsAdapterItemCount = 0;
        te.app.evidence.pages.attachments.adapters.AttachmentsAdapter viewmodelAttachmentsAdapter = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        boolean viewmodelAttachmentsAdapterItemCountInt0 = false;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        int viewmodelAttachmentsAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.attachmentsAdapter
                        viewmodelAttachmentsAdapter = viewmodel.getAttachmentsAdapter();
                    }


                    if (viewmodelAttachmentsAdapter != null) {
                        // read viewmodel.attachmentsAdapter.itemCount
                        viewmodelAttachmentsAdapterItemCount = viewmodelAttachmentsAdapter.getItemCount();
                    }


                    // read viewmodel.attachmentsAdapter.itemCount == 0
                    viewmodelAttachmentsAdapterItemCountInt0 = (viewmodelAttachmentsAdapterItemCount) == (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewmodelAttachmentsAdapterItemCountInt0) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.attachmentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                    viewmodelAttachmentsAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelAttachmentsAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewmodelAttachmentsAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcAttachments, viewmodelAttachmentsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback71);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.toAttach();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.attachmentsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.attachmentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.attachmentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}