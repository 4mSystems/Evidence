package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionsBindingImpl extends FragmentSessionsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView6;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.sessionDate
            //         is viewmodel.searchRequest.setSessionDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputSearch);
            // localize variables for thread safety
            // viewmodel.searchRequest
            te.app.evidence.model.base.SearchRequest viewmodelSearchRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel.searchRequest.sessionDate
            java.lang.String viewmodelSearchRequestSessionDate = null;
            // viewmodel
            te.app.evidence.pages.sessions.viewModels.SessionsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.searchRequest;

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setSessionDate(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSessionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentSessionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (te.app.evidence.customViews.views.DateEditText) bindings[1]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[3]
            );
        this.inputSearch.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView6 = (com.airbnb.lottie.LottieAnimationView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7];
        this.mboundView7.setTag(null);
        this.progress.setTag(null);
        this.rcClients.setTag(null);
        this.search.setTag(null);
        setRootTag(root);
        // listeners
        mCallback69 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback70 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback68 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.sessions.viewModels.SessionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.sessions.viewModels.SessionsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.sessions.viewModels.SessionsViewModel) object, fieldId);
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
    private boolean onChangeViewmodel(te.app.evidence.pages.sessions.viewModels.SessionsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.sessionsAdapter) {
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
        int viewmodelSessionsAdapterItemCount = 0;
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelSessionsAdapter = null;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        java.lang.String viewmodelSearchRequestSessionDate = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        te.app.evidence.model.base.SearchRequest viewmodelSearchRequest = null;
        int viewmodelSessionsAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        boolean viewmodelSearchProgressVisibleGet = false;
        boolean viewmodelSessionsAdapterItemCountInt0 = false;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.sessions.viewModels.SessionsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.sessionsAdapter
                        viewmodelSessionsAdapter = viewmodel.getSessionsAdapter();
                    }


                    if (viewmodelSessionsAdapter != null) {
                        // read viewmodel.sessionsAdapter.itemCount
                        viewmodelSessionsAdapterItemCount = viewmodelSessionsAdapter.getItemCount();
                    }


                    // read viewmodel.sessionsAdapter.itemCount == 0
                    viewmodelSessionsAdapterItemCountInt0 = (viewmodelSessionsAdapterItemCount) == (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewmodelSessionsAdapterItemCountInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.sessionsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                    viewmodelSessionsAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelSessionsAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
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
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
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
                        // read viewmodel.searchRequest.sessionDate
                        viewmodelSearchRequestSessionDate = viewmodelSearchRequest.getSessionDate();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputSearch, viewmodelSearchRequestSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputSearchandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback68);
            this.mboundView7.setOnClickListener(mCallback70);
            this.search.setOnClickListener(mCallback69);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewmodelSessionsAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcClients, viewmodelSessionsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.evidence.pages.sessions.viewModels.SessionsViewModel value;
        public OnTextChangedImpl setValue(te.app.evidence.pages.sessions.viewModels.SessionsViewModel value) {
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
                te.app.evidence.pages.sessions.viewModels.SessionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.search(1, true);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.sessions.viewModels.SessionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toAddSession();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.sessions.viewModels.SessionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.clear();
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
        flag 2 (0x3L): viewmodel.sessionsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.sessionsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.sessionsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}