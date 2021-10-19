package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBailiffsBindingImpl extends FragmentBailiffsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView5;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback152;
    @Nullable
    private final android.view.View.OnClickListener mCallback151;
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.search
            //         is viewmodel.searchRequest.setSearch((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputSearch);
            // localize variables for thread safety
            // viewmodel.searchRequest
            te.app.evidence.model.base.SearchRequest viewmodelSearchRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel.searchRequest.search
            java.lang.String viewmodelSearchRequestSearch = null;
            // viewmodel
            te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.searchRequest;

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setSearch(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentBailiffsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentBailiffsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[2]
            );
        this.inputSearch.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (com.airbnb.lottie.LottieAnimationView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6];
        this.mboundView6.setTag(null);
        this.progress.setTag(null);
        this.rcMohdrs.setTag(null);
        this.search.setTag(null);
        setRootTag(root);
        // listeners
        mCallback152 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback151 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel) object, fieldId);
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
    private boolean onChangeViewmodel(te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.bailiffsAdapter) {
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
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        boolean viewmodelBailiffsAdapterItemCountInt0 = false;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        te.app.evidence.model.base.SearchRequest viewmodelSearchRequest = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        int viewmodelBailiffsAdapterItemCount = 0;
        java.lang.String viewmodelSearchRequestSearch = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.mohdrs.adapters.BailiffsAdapter viewmodelBailiffsAdapter = null;
        int viewmodelBailiffsAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


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
            if ((dirtyFlags & 0xaL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onTextChanged
                        viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                        // read viewmodel.searchRequest
                        viewmodelSearchRequest = viewmodel.searchRequest;
                    }


                    if (viewmodelSearchRequest != null) {
                        // read viewmodel.searchRequest.search
                        viewmodelSearchRequestSearch = viewmodelSearchRequest.getSearch();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.bailiffsAdapter
                        viewmodelBailiffsAdapter = viewmodel.getBailiffsAdapter();
                    }


                    if (viewmodelBailiffsAdapter != null) {
                        // read viewmodel.bailiffsAdapter.itemCount
                        viewmodelBailiffsAdapterItemCount = viewmodelBailiffsAdapter.getItemCount();
                    }


                    // read viewmodel.bailiffsAdapter.itemCount == 0
                    viewmodelBailiffsAdapterItemCountInt0 = (viewmodelBailiffsAdapterItemCount) == (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewmodelBailiffsAdapterItemCountInt0) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.bailiffsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                    viewmodelBailiffsAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelBailiffsAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputSearch, viewmodelSearchRequestSearch);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputSearchandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewmodelBailiffsAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcMohdrs, viewmodelBailiffsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(mCallback152);
            this.search.setOnClickListener(mCallback151);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel value;
        public OnTextChangedImpl setValue(te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toAddMohdr();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.search(1, true);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.bailiffsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.bailiffsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.bailiffsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}