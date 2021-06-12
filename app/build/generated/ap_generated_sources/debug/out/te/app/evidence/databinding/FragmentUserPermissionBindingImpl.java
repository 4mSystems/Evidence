package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserPermissionBindingImpl extends FragmentUserPermissionBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_save, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView1;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView5;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView6;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView7;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserPermissionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentUserPermissionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new te.app.evidence.generated.callback.OnClickListener(this, 8);
        mCallback43 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback42 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback44 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback45 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback40 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback46 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback41 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((te.app.evidence.pages.users.viewModels.UserPermissionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.users.viewModels.UserPermissionsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.users.viewModels.UserPermissionsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.users.viewModels.UserPermissionsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.userPermissionsData) {
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
        te.app.evidence.pages.users.models.userPermissions.UserPermissionsData viewmodelUserPermissionsData = null;
        boolean viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes = false;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesMboundView6AndroidDrawableIcPermissionOnMboundView6AndroidDrawableIcPermissionOff = null;
        java.lang.String viewmodelUserPermissionsDataClients = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesMboundView4AndroidDrawableIcPermissionOnMboundView4AndroidDrawableIcPermissionOff = null;
        java.lang.String viewmodelUserPermissionsDataSearchCase = null;
        boolean viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataMonthlyReport = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff = null;
        boolean viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataAddcases = null;
        java.lang.String viewmodelUserPermissionsDataMohdreen = null;
        boolean viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes = false;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesMboundView5AndroidDrawableIcPermissionOnMboundView5AndroidDrawableIcPermissionOff = null;
        boolean viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataUsers = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesMboundView2AndroidDrawableIcPermissionOnMboundView2AndroidDrawableIcPermissionOff = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesMboundView1AndroidDrawableIcPermissionOnMboundView1AndroidDrawableIcPermissionOff = null;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesMboundView3AndroidDrawableIcPermissionOnMboundView3AndroidDrawableIcPermissionOff = null;
        java.lang.String viewmodelUserPermissionsDataDailyReport = null;
        boolean viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataCategory = null;
        te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userPermissionsData
                    viewmodelUserPermissionsData = viewmodel.getUserPermissionsData();
                }


                if (viewmodelUserPermissionsData != null) {
                    // read viewmodel.userPermissionsData.clients
                    viewmodelUserPermissionsDataClients = viewmodelUserPermissionsData.getClients();
                    // read viewmodel.userPermissionsData.searchCase
                    viewmodelUserPermissionsDataSearchCase = viewmodelUserPermissionsData.getSearchCase();
                    // read viewmodel.userPermissionsData.monthlyReport
                    viewmodelUserPermissionsDataMonthlyReport = viewmodelUserPermissionsData.getMonthlyReport();
                    // read viewmodel.userPermissionsData.addcases
                    viewmodelUserPermissionsDataAddcases = viewmodelUserPermissionsData.getAddcases();
                    // read viewmodel.userPermissionsData.mohdreen
                    viewmodelUserPermissionsDataMohdreen = viewmodelUserPermissionsData.getMohdreen();
                    // read viewmodel.userPermissionsData.users
                    viewmodelUserPermissionsDataUsers = viewmodelUserPermissionsData.getUsers();
                    // read viewmodel.userPermissionsData.dailyReport
                    viewmodelUserPermissionsDataDailyReport = viewmodelUserPermissionsData.getDailyReport();
                    // read viewmodel.userPermissionsData.category
                    viewmodelUserPermissionsDataCategory = viewmodelUserPermissionsData.getCategory();
                }


                if (viewmodelUserPermissionsDataClients != null) {
                    // read viewmodel.userPermissionsData.clients.equals("yes")
                    viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes = viewmodelUserPermissionsDataClients.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
                if (viewmodelUserPermissionsDataSearchCase != null) {
                    // read viewmodel.userPermissionsData.searchCase.equals("yes")
                    viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes = viewmodelUserPermissionsDataSearchCase.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
                if (viewmodelUserPermissionsDataMonthlyReport != null) {
                    // read viewmodel.userPermissionsData.monthlyReport.equals("yes")
                    viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes = viewmodelUserPermissionsDataMonthlyReport.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
                if (viewmodelUserPermissionsDataAddcases != null) {
                    // read viewmodel.userPermissionsData.addcases.equals("yes")
                    viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes = viewmodelUserPermissionsDataAddcases.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
                if (viewmodelUserPermissionsDataMohdreen != null) {
                    // read viewmodel.userPermissionsData.mohdreen.equals("yes")
                    viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes = viewmodelUserPermissionsDataMohdreen.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
                if (viewmodelUserPermissionsDataUsers != null) {
                    // read viewmodel.userPermissionsData.users.equals("yes")
                    viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes = viewmodelUserPermissionsDataUsers.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
                if (viewmodelUserPermissionsDataDailyReport != null) {
                    // read viewmodel.userPermissionsData.dailyReport.equals("yes")
                    viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes = viewmodelUserPermissionsDataDailyReport.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
                if (viewmodelUserPermissionsDataCategory != null) {
                    // read viewmodel.userPermissionsData.category.equals("yes")
                    viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes = viewmodelUserPermissionsDataCategory.equals("yes");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.userPermissionsData.clients.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesMboundView2AndroidDrawableIcPermissionOnMboundView2AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.searchCase.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesMboundView4AndroidDrawableIcPermissionOnMboundView4AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.addcases.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesMboundView3AndroidDrawableIcPermissionOnMboundView3AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.mohdreen.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesMboundView5AndroidDrawableIcPermissionOnMboundView5AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.users.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesMboundView1AndroidDrawableIcPermissionOnMboundView1AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_permission_off)));
                // read viewmodel.userPermissionsData.category.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesMboundView6AndroidDrawableIcPermissionOnMboundView6AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.ic_permission_off)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView1, viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesMboundView1AndroidDrawableIcPermissionOnMboundView1AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView2, viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesMboundView2AndroidDrawableIcPermissionOnMboundView2AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView3, viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesMboundView3AndroidDrawableIcPermissionOnMboundView3AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView4, viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesMboundView4AndroidDrawableIcPermissionOnMboundView4AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView5, viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesMboundView5AndroidDrawableIcPermissionOnMboundView5AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView6, viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesMboundView6AndroidDrawableIcPermissionOnMboundView6AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView7, viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView8, viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback40);
            this.mboundView2.setOnClickListener(mCallback41);
            this.mboundView3.setOnClickListener(mCallback42);
            this.mboundView4.setOnClickListener(mCallback43);
            this.mboundView5.setOnClickListener(mCallback44);
            this.mboundView6.setOnClickListener(mCallback45);
            this.mboundView7.setOnClickListener(mCallback46);
            this.mboundView8.setOnClickListener(mCallback47);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView8.getResources().getString(R.string.monthly_reports));
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView4.getResources().getString(R.string.search_case));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView3.getResources().getString(R.string.add_case));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView5.getResources().getString(R.string.menuMohdar));
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView6.getResources().getString(R.string.menuCat));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView1.getResources().getString(R.string.menuUsers));
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView7.getResources().getString(R.string.daily_reports));
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView2.getResources().getString(R.string.menuClients));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.userPermissionsData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.userPermissionsData.category.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 4 (0x5L): viewmodel.userPermissionsData.category.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 5 (0x6L): viewmodel.userPermissionsData.searchCase.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 6 (0x7L): viewmodel.userPermissionsData.searchCase.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 7 (0x8L): viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 8 (0x9L): viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 9 (0xaL): viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 10 (0xbL): viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 11 (0xcL): viewmodel.userPermissionsData.mohdreen.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 12 (0xdL): viewmodel.userPermissionsData.mohdreen.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 13 (0xeL): viewmodel.userPermissionsData.clients.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 14 (0xfL): viewmodel.userPermissionsData.clients.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 15 (0x10L): viewmodel.userPermissionsData.users.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 16 (0x11L): viewmodel.userPermissionsData.users.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 17 (0x12L): viewmodel.userPermissionsData.addcases.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 18 (0x13L): viewmodel.userPermissionsData.addcases.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
    flag mapping end*/
    //end
}