package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fl_home_container, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    private OnNavigationItemSelectedListenerImpl mViewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (grand.app.akar.customViews.views.CustomBottomNavigationView) bindings[1]
            );
        this.fab.setTag(null);
        this.homeNavigationMenu.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.akar.pages.home.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.akar.pages.home.viewModels.HomeViewModel ViewModel) {
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
                return onChangeViewModel((grand.app.akar.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.akar.pages.home.viewModels.HomeViewModel ViewModel, int fieldId) {
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
        com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener viewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = null;
        grand.app.akar.pages.home.viewModels.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onNavigationClick
                    viewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = (((mViewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener == null) ? (mViewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = new OnNavigationItemSelectedListenerImpl()) : mViewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.homeNavigationMenu.setOnNavigationItemSelectedListener(viewModelOnNavigationClickComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener);
        }
    }
    // Listener Stub Implementations
    public static class OnNavigationItemSelectedListenerImpl implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener{
        private grand.app.akar.pages.home.viewModels.HomeViewModel value;
        public OnNavigationItemSelectedListenerImpl setValue(grand.app.akar.pages.home.viewModels.HomeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onNavigationItemSelected(android.view.MenuItem arg0) {
            return this.value.onNavigationClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        grand.app.akar.pages.home.viewModels.HomeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.toNewAd();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}