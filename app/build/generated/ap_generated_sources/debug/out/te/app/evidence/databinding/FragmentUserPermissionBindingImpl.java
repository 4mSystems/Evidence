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
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView1;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView2;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView3;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView4;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView5;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView6;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView7;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserPermissionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentUserPermissionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            );
        this.btnSave.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback50 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback48 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback51 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback49 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback45 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback52 = new te.app.evidence.generated.callback.OnClickListener(this, 8);
        mCallback46 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback53 = new te.app.evidence.generated.callback.OnClickListener(this, 9);
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
        else if (fieldId == BR.message) {
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
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium = null;
        boolean viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        te.app.evidence.pages.users.models.userPermissions.UserPermissionsData viewmodelUserPermissionsData = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelUserPermissionsDataClients = null;
        java.lang.String viewmodelUserPermissionsDataSearchCase = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes = false;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelUserPermissionsDataMonthlyReport = null;
        boolean viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff = null;
        boolean viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        boolean viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        boolean viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataAddcases = null;
        java.lang.String viewmodelUserPermissionsDataMohdreen = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        android.graphics.drawable.Drawable viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        boolean viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelUserPermissionsDataUsers = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelUserPermissionsDataDailyReport = null;
        boolean viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes = false;
        boolean viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes = false;
        java.lang.String viewmodelUserPermissionsDataCategory = null;
        te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

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
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                    if (viewmodelUserPermissionsDataSearchCase != null) {
                        // read viewmodel.userPermissionsData.searchCase.equals("yes")
                        viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes = viewmodelUserPermissionsDataSearchCase.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                    if (viewmodelUserPermissionsDataMonthlyReport != null) {
                        // read viewmodel.userPermissionsData.monthlyReport.equals("yes")
                        viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes = viewmodelUserPermissionsDataMonthlyReport.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                    if (viewmodelUserPermissionsDataAddcases != null) {
                        // read viewmodel.userPermissionsData.addcases.equals("yes")
                        viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes = viewmodelUserPermissionsDataAddcases.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                    if (viewmodelUserPermissionsDataMohdreen != null) {
                        // read viewmodel.userPermissionsData.mohdreen.equals("yes")
                        viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes = viewmodelUserPermissionsDataMohdreen.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                    if (viewmodelUserPermissionsDataUsers != null) {
                        // read viewmodel.userPermissionsData.users.equals("yes")
                        viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes = viewmodelUserPermissionsDataUsers.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                    if (viewmodelUserPermissionsDataDailyReport != null) {
                        // read viewmodel.userPermissionsData.dailyReport.equals("yes")
                        viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes = viewmodelUserPermissionsDataDailyReport.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                    if (viewmodelUserPermissionsDataCategory != null) {
                        // read viewmodel.userPermissionsData.category.equals("yes")
                        viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes = viewmodelUserPermissionsDataCategory.equals("yes");
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewmodel.userPermissionsData.clients.equals("yes") ? true : false
                    viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataClientsEqualsJavaLangStringYes) ? (true) : (false));
                    // read viewmodel.userPermissionsData.searchCase.equals("yes") ? true : false
                    viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYes) ? (true) : (false));
                    // read viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                    viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.ic_permission_off)));
                    // read viewmodel.userPermissionsData.addcases.equals("yes") ? true : false
                    viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYes) ? (true) : (false));
                    // read viewmodel.userPermissionsData.mohdreen.equals("yes") ? true : false
                    viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYes) ? (true) : (false));
                    // read viewmodel.userPermissionsData.users.equals("yes") ? true : false
                    viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataUsersEqualsJavaLangStringYes) ? (true) : (false));
                    // read viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
                    viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff = ((viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYes) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_permission_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_permission_off)));
                    // read viewmodel.userPermissionsData.category.equals("yes") ? true : false
                    viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesBooleanTrueBooleanFalse = ((viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYes) ? (true) : (false));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xdL) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xdL) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x20000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xdL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0xdL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.corner_view_medium)));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableCornerViewPrimaryDarkBtnSaveAndroidDrawableCornerViewMedium);
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback53);
            this.mboundView1.setOnClickListener(mCallback45);
            this.mboundView2.setOnClickListener(mCallback46);
            this.mboundView3.setOnClickListener(mCallback47);
            this.mboundView4.setOnClickListener(mCallback48);
            this.mboundView5.setOnClickListener(mCallback49);
            this.mboundView6.setOnClickListener(mCallback50);
            this.mboundView7.setOnClickListener(mCallback51);
            this.mboundView8.setOnClickListener(mCallback52);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, viewmodelUserPermissionsDataUsersEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, viewmodelUserPermissionsDataClientsEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, viewmodelUserPermissionsDataAddcasesEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, viewmodelUserPermissionsDataSearchCaseEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView5, viewmodelUserPermissionsDataMohdreenEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView6, viewmodelUserPermissionsDataCategoryEqualsJavaLangStringYesBooleanTrueBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView7, viewmodelUserPermissionsDataDailyReportEqualsJavaLangStringYesMboundView7AndroidDrawableIcPermissionOnMboundView7AndroidDrawableIcPermissionOff);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.mboundView8, viewmodelUserPermissionsDataMonthlyReportEqualsJavaLangStringYesMboundView8AndroidDrawableIcPermissionOnMboundView8AndroidDrawableIcPermissionOff);
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
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeStatus(mboundView3.getResources().getString(R.string.add_case));
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
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.users.viewModels.UserPermissionsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.updatePermission();
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
        flag 2 (0x3L): viewmodel.message
        flag 3 (0x4L): null
        flag 4 (0x5L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 5 (0x6L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_medium
        flag 6 (0x7L): viewmodel.userPermissionsData.searchCase.equals("yes") ? true : false
        flag 7 (0x8L): viewmodel.userPermissionsData.searchCase.equals("yes") ? true : false
        flag 8 (0x9L): viewmodel.userPermissionsData.category.equals("yes") ? true : false
        flag 9 (0xaL): viewmodel.userPermissionsData.category.equals("yes") ? true : false
        flag 10 (0xbL): viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 11 (0xcL): viewmodel.userPermissionsData.monthlyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 12 (0xdL): viewmodel.userPermissionsData.mohdreen.equals("yes") ? true : false
        flag 13 (0xeL): viewmodel.userPermissionsData.mohdreen.equals("yes") ? true : false
        flag 14 (0xfL): viewmodel.userPermissionsData.clients.equals("yes") ? true : false
        flag 15 (0x10L): viewmodel.userPermissionsData.clients.equals("yes") ? true : false
        flag 16 (0x11L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 17 (0x12L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 18 (0x13L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 19 (0x14L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 20 (0x15L): viewmodel.userPermissionsData.addcases.equals("yes") ? true : false
        flag 21 (0x16L): viewmodel.userPermissionsData.addcases.equals("yes") ? true : false
        flag 22 (0x17L): viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 23 (0x18L): viewmodel.userPermissionsData.dailyReport.equals("yes") ? @android:drawable/ic_permission_on : @android:drawable/ic_permission_off
        flag 24 (0x19L): viewmodel.userPermissionsData.users.equals("yes") ? true : false
        flag 25 (0x1aL): viewmodel.userPermissionsData.users.equals("yes") ? true : false
        flag 26 (0x1bL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 29 (0x1eL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}