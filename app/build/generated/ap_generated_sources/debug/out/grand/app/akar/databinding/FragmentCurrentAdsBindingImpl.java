package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCurrentAdsBindingImpl extends FragmentCurrentAdsBinding  {

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
    private final androidx.recyclerview.widget.RecyclerView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCurrentAdsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentCurrentAdsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.mboundView1 = (androidx.recyclerview.widget.RecyclerView) bindings[1];
        this.mboundView1.setTag(null);
        this.searchContainer.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.akar.pages.myAds.viewModels.MyAdsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.akar.pages.myAds.viewModels.MyAdsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((grand.app.akar.pages.myAds.viewModels.MyAdsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.akar.pages.myAds.viewModels.MyAdsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.myAdsAdapter) {
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
        grand.app.akar.pages.myAds.viewModels.MyAdsViewModel viewModel = mViewModel;
        grand.app.akar.pages.myAds.adapters.MyAdsAdapter viewModelMyAdsAdapter = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.myAdsAdapter
                    viewModelMyAdsAdapter = viewModel.getMyAdsAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.mboundView1, viewModelMyAdsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.myAdsAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}