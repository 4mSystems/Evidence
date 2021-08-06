package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDailyReportsBindingImpl extends FragmentDailyReportsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_category, 6);
        sViewsWithIds.put(R.id.input_date, 7);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.DateEditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchReportRequest.session_date
            //         is viewmodel.searchReportRequest.setSession_date((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.searchReportRequest != null
            boolean viewmodelSearchReportRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchReportRequest
            te.app.evidence.pages.reports.models.SearchReportRequest viewmodelSearchReportRequest = null;
            // viewmodel
            te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;
            // viewmodel.searchReportRequest.session_date
            java.lang.String viewmodelSearchReportRequestSessionDate = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchReportRequest = viewmodel.getSearchReportRequest();

                viewmodelSearchReportRequestJavaLangObjectNull = (viewmodelSearchReportRequest) != (null);
                if (viewmodelSearchReportRequestJavaLangObjectNull) {




                    viewmodelSearchReportRequest.setSession_date(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentDailyReportsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentDailyReportsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            );
        this.inputCat.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.evidence.customViews.views.DateEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.progress.setTag(null);
        this.rcClients.setTag(null);
        this.search.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback20 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((te.app.evidence.pages.reports.viewModels.ReportsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.reports.viewModels.ReportsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.reports.viewModels.ReportsViewModel) object, fieldId);
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
    private boolean onChangeViewmodel(te.app.evidence.pages.reports.viewModels.ReportsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.searchReportRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.reportsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.reports.models.SearchReportRequest viewmodelSearchReportRequest = null;
        boolean viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminInputCatAndroidStringReportAboutInputCatAndroidStringReportAboutUser = null;
        java.lang.String viewmodelSearchReportRequestSessionDate = null;
        java.lang.String viewmodelUserDataUserDataType = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.reports.adapters.ReportsAdapter viewmodelReportsAdapter = null;
        te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x16L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchReportRequest
                        viewmodelSearchReportRequest = viewmodel.getSearchReportRequest();
                    }


                    if (viewmodelSearchReportRequest != null) {
                        // read viewmodel.searchReportRequest.session_date
                        viewmodelSearchReportRequestSessionDate = viewmodelSearchReportRequest.getSession_date();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x13L) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x12L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.userData
                        viewmodelUserDataUserData = viewmodelUserData.getUserData();
                    }


                    if (viewmodelUserDataUserData != null) {
                        // read viewmodel.userData.userData.type
                        viewmodelUserDataUserDataType = viewmodelUserDataUserData.getType();
                    }


                    if (viewmodelUserDataUserDataType != null) {
                        // read viewmodel.userData.userData.type.equals("admin")
                        viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin = viewmodelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0x12L) != 0) {
                    if(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewmodel.userData.userData.type.equals("admin") ? true : false
                    viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminBooleanTrueBooleanFalse = ((viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (true) : (false));
                    // read viewmodel.userData.userData.type.equals("admin") ? @android:string/report_about : @android:string/report_about_user
                    viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminInputCatAndroidStringReportAboutInputCatAndroidStringReportAboutUser = ((viewmodelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (inputCat.getResources().getString(R.string.report_about)) : (inputCat.getResources().getString(R.string.report_about_user)));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.reportsAdapter
                        viewmodelReportsAdapter = viewmodel.getReportsAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.inputCat.setEnabled(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminBooleanTrueBooleanFalse);
            this.inputCat.setHint(viewmodelUserDataUserDataTypeEqualsJavaLangStringAdminInputCatAndroidStringReportAboutInputCatAndroidStringReportAboutUser);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.inputCat.setOnClickListener(mCallback19);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.search.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelSearchReportRequestSessionDate);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcClients, viewmodelReportsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.evidence.utils.Constants.SHOW_CATEGORIES);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.reports.viewModels.ReportsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.getReports(1, true);
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
        flag 2 (0x3L): viewmodel.searchReportRequest
        flag 3 (0x4L): viewmodel.reportsAdapter
        flag 4 (0x5L): null
        flag 5 (0x6L): viewmodel.userData.userData.type.equals("admin") ? true : false
        flag 6 (0x7L): viewmodel.userData.userData.type.equals("admin") ? true : false
        flag 7 (0x8L): viewmodel.userData.userData.type.equals("admin") ? @android:string/report_about : @android:string/report_about_user
        flag 8 (0x9L): viewmodel.userData.userData.type.equals("admin") ? @android:string/report_about : @android:string/report_about_user
        flag 9 (0xaL): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}