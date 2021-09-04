package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar_layout, 23);
        sViewsWithIds.put(R.id.home_item1, 24);
        sViewsWithIds.put(R.id.view_id, 25);
        sViewsWithIds.put(R.id.view_mohdr, 26);
        sViewsWithIds.put(R.id.view_users, 27);
        sViewsWithIds.put(R.id.view_casee, 28);
        sViewsWithIds.put(R.id.flow, 29);
        sViewsWithIds.put(R.id.br3, 30);
        sViewsWithIds.put(R.id.progress_bar_home, 31);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView20;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView21;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView22;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback102;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.Barrier) bindings[30]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[29]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[19]
            , (android.widget.ProgressBar) bindings[31]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[23]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[28]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[25]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[26]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.commingSessionRc.setTag(null);
        this.homeCases.setTag(null);
        this.homeItem2.setTag(null);
        this.homeItem3.setTag(null);
        this.homeItem4.setTag(null);
        this.homeMohdrs.setTag(null);
        this.homeReportersRc.setTag(null);
        this.homeSession.setTag(null);
        this.homeUsers.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView20 = (com.airbnb.lottie.LottieAnimationView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (com.airbnb.lottie.LottieAnimationView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (com.airbnb.lottie.LottieAnimationView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView5 = (com.google.android.material.button.MaterialButton) bindings[5];
        this.mboundView5.setTag(null);
        this.nextMohdareen.setTag(null);
        this.nextSessions.setTag(null);
        this.previousSessionRc.setTag(null);
        this.previousSessions.setTag(null);
        this.progress.setTag(null);
        this.tvDemoPackage.setTag(null);
        this.tvExpirePackage.setTag(null);
        this.tvWarningExpire.setTag(null);
        this.warningContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback100 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback101 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback99 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback102 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback103 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback98 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback97 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewmodel((te.app.evidence.pages.home.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.home.viewModels.HomeViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeViewmodelWarningDate((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewmodel((te.app.evidence.pages.home.viewModels.HomeViewModel) object, fieldId);
            case 3 :
                return onChangeViewmodelPackageRemainDays((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewmodelWarningDate(androidx.databinding.ObservableBoolean ViewmodelWarningDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.selectedBtn) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.comingSessionsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.prevSessionsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.homeReportersAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPackageRemainDays(androidx.databinding.ObservableField<java.lang.String> ViewmodelPackageRemainDays, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString = null;
        int viewmodelSelectedBtn = 0;
        int viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean viewmodelWarningDateBooleanTrue = false;
        java.lang.String viewmodelHomeDataCountDataSessions = null;
        java.lang.String homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = null;
        int viewmodelSelectedBtnInt2ViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataUsers = false;
        androidx.databinding.ObservableBoolean viewmodelWarningDate = null;
        java.lang.String viewmodelHomeDataUserPackageExpiryPackage = null;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = false;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataCases = false;
        boolean viewmodelWarningDateGet = false;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelPrevSessionsAdapter = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        boolean viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5 = false;
        int viewmodelPrevSessionsAdapterItemCount = 0;
        int viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY = false;
        int viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse = false;
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelComingSessionsAdapter = null;
        te.app.evidence.pages.home.models.CountData viewmodelHomeDataCountData = null;
        int viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringYViewVISIBLEViewGONE = 0;
        boolean viewmodelSelectedBtnInt1 = false;
        boolean viewmodelHomeReportersAdapterItemCountInt0 = false;
        int viewmodelHomeReportersAdapterItemCount = 0;
        int viewmodelHomeDataUserPackagePackageId = 0;
        java.lang.String tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangString = null;
        java.lang.String textUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataSessions = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = false;
        te.app.evidence.pages.home.models.HomeData viewmodelHomeData = null;
        int viewmodelComingSessionsAdapterItemCount = 0;
        int viewmodelWarningDateBooleanTrueViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;
        java.lang.String homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;
        boolean viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringN = false;
        java.lang.String tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangStringConcatTvWarningExpireAndroidStringDay = null;
        java.lang.String viewmodelPackageRemainDaysGet = null;
        int viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = 0;
        boolean viewmodelPrevSessionsAdapterItemCountInt0 = false;
        te.app.evidence.pages.home.adapters.HomeReportersAdapter viewmodelHomeReportersAdapter = null;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = false;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        boolean viewmodelHomeDataUserPackagePackageIdInt5 = false;
        boolean textUtilsIsEmptyViewmodelPackageRemainDays = false;
        int viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean TextUtilsIsEmptyViewmodelPackageRemainDays1 = false;
        boolean viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = false;
        boolean viewmodelSelectedBtnInt0 = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelPackageRemainDays = null;
        java.lang.String viewmodelHomeDataCountDataCases = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;
        te.app.evidence.pages.home.models.UserPackage viewmodelHomeDataUserPackage = null;
        int viewmodelHomeDataUserPackagePackageIdInt5ViewVISIBLEViewGONE = 0;
        boolean viewmodelComingSessionsAdapterItemCountInt0 = false;
        boolean viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse = false;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = null;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataCases1 = false;
        boolean viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse = false;
        java.lang.String viewmodelHomeDataCountDataMohdreen = null;
        java.lang.String viewmodelHomeDataCountDataUsers = null;
        boolean viewmodelSelectedBtnInt2 = false;
        java.lang.String homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = null;
        int viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringNViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x224L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedBtn
                        viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                    }


                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                    // read viewmodel.selectedBtn == 2
                    viewmodelSelectedBtnInt2 = (viewmodelSelectedBtn) == (2);
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                }
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                }
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt2) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt2ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_dark_home)));
            }
            if ((dirtyFlags & 0x205L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x205L) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x216L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.warningDate
                        viewmodelWarningDate = viewmodel.warningDate;
                    }
                    updateRegistration(1, viewmodelWarningDate);


                    if (viewmodelWarningDate != null) {
                        // read viewmodel.warningDate.get()
                        viewmodelWarningDateGet = viewmodelWarningDate.get();
                    }


                    // read viewmodel.warningDate.get() == true
                    viewmodelWarningDateBooleanTrue = (viewmodelWarningDateGet) == (true);
                if((dirtyFlags & 0x216L) != 0) {
                    if(viewmodelWarningDateBooleanTrue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if((dirtyFlags & 0x206L) != 0) {
                    if(viewmodelWarningDateBooleanTrue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }

                if ((dirtyFlags & 0x206L) != 0) {

                        // read viewmodel.warningDate.get() == true ? View.VISIBLE : View.GONE
                        viewmodelWarningDateBooleanTrueViewVISIBLEViewGONE = ((viewmodelWarningDateBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x2a4L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.prevSessionsAdapter
                        viewmodelPrevSessionsAdapter = viewmodel.getPrevSessionsAdapter();
                    }


                    if (viewmodelPrevSessionsAdapter != null) {
                        // read viewmodel.prevSessionsAdapter.itemCount
                        viewmodelPrevSessionsAdapterItemCount = viewmodelPrevSessionsAdapter.getItemCount();
                    }


                    // read viewmodel.prevSessionsAdapter.itemCount == 0
                    viewmodelPrevSessionsAdapterItemCountInt0 = (viewmodelPrevSessionsAdapterItemCount) == (0);
                if((dirtyFlags & 0x2a4L) != 0) {
                    if(viewmodelPrevSessionsAdapterItemCountInt0) {
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x264L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.comingSessionsAdapter
                        viewmodelComingSessionsAdapter = viewmodel.getComingSessionsAdapter();
                    }


                    if (viewmodelComingSessionsAdapter != null) {
                        // read viewmodel.comingSessionsAdapter.itemCount
                        viewmodelComingSessionsAdapterItemCount = viewmodelComingSessionsAdapter.getItemCount();
                    }


                    // read viewmodel.comingSessionsAdapter.itemCount == 0
                    viewmodelComingSessionsAdapterItemCountInt0 = (viewmodelComingSessionsAdapterItemCount) == (0);
                if((dirtyFlags & 0x264L) != 0) {
                    if(viewmodelComingSessionsAdapterItemCountInt0) {
                            dirtyFlags |= 0x80000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x214L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.homeData
                        viewmodelHomeData = viewmodel.getHomeData();
                    }


                    if (viewmodelHomeData != null) {
                        // read viewmodel.homeData.countData
                        viewmodelHomeDataCountData = viewmodelHomeData.getCountData();
                        // read viewmodel.homeData.userPackage
                        viewmodelHomeDataUserPackage = viewmodelHomeData.getUserPackage();
                    }


                    if (viewmodelHomeDataCountData != null) {
                        // read viewmodel.homeData.countData.sessions
                        viewmodelHomeDataCountDataSessions = viewmodelHomeDataCountData.getSessions();
                        // read viewmodel.homeData.countData.cases
                        viewmodelHomeDataCountDataCases = viewmodelHomeDataCountData.getCases();
                        // read viewmodel.homeData.countData.mohdreen
                        viewmodelHomeDataCountDataMohdreen = viewmodelHomeDataCountData.getMohdreen();
                        // read viewmodel.homeData.countData.users
                        viewmodelHomeDataCountDataUsers = viewmodelHomeDataCountData.getUsers();
                    }
                    if (viewmodelHomeDataUserPackage != null) {
                        // read viewmodel.homeData.userPackage.expiryPackage
                        viewmodelHomeDataUserPackageExpiryPackage = viewmodelHomeDataUserPackage.getExpiryPackage();
                        // read viewmodel.homeData.userPackage.packageId
                        viewmodelHomeDataUserPackagePackageId = viewmodelHomeDataUserPackage.getPackageId();
                    }


                    // read TextUtils.isEmpty(viewmodel.homeData.countData.sessions)
                    textUtilsIsEmptyViewmodelHomeDataCountDataSessions = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataSessions);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    textUtilsIsEmptyViewmodelHomeDataCountDataCases = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataCases);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataMohdreen);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataUsers);
                    // read viewmodel.homeData.userPackage.packageId == 5
                    viewmodelHomeDataUserPackagePackageIdInt5 = (viewmodelHomeDataUserPackagePackageId) == (5);
                if((dirtyFlags & 0x214L) != 0) {
                    if(viewmodelHomeDataUserPackagePackageIdInt5) {
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000L;
                    }
                }
                    if (viewmodelHomeDataUserPackageExpiryPackage != null) {
                        // read viewmodel.homeData.userPackage.expiryPackage.equals("n")
                        viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringN = viewmodelHomeDataUserPackageExpiryPackage.equals("n");
                    }
                if((dirtyFlags & 0x214L) != 0) {
                    if(viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringN) {
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.sessions)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = !textUtilsIsEmptyViewmodelHomeDataCountDataSessions;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataCases1 = !textUtilsIsEmptyViewmodelHomeDataCountDataCases;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = !textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    textUtilsIsEmptyViewmodelHomeDataCountDataUsers = !TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1;
                    // read viewmodel.homeData.userPackage.packageId == 5 ? View.VISIBLE : View.GONE
                    viewmodelHomeDataUserPackagePackageIdInt5ViewVISIBLEViewGONE = ((viewmodelHomeDataUserPackagePackageIdInt5) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.homeData.userPackage.expiryPackage.equals("n") ? View.GONE : View.VISIBLE
                    viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringNViewGONEViewVISIBLE = ((viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringN) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                if((dirtyFlags & 0x214L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }
                if((dirtyFlags & 0x214L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataCases1) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }
                if((dirtyFlags & 0x214L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x214L) != 0) {
                    if(textUtilsIsEmptyViewmodelHomeDataCountDataUsers) {
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x324L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.homeReportersAdapter
                        viewmodelHomeReportersAdapter = viewmodel.getHomeReportersAdapter();
                    }


                    if (viewmodelHomeReportersAdapter != null) {
                        // read viewmodel.homeReportersAdapter.itemCount
                        viewmodelHomeReportersAdapterItemCount = viewmodelHomeReportersAdapter.getItemCount();
                    }


                    // read viewmodel.homeReportersAdapter.itemCount == 0
                    viewmodelHomeReportersAdapterItemCountInt0 = (viewmodelHomeReportersAdapterItemCount) == (0);
                if((dirtyFlags & 0x324L) != 0) {
                    if(viewmodelHomeReportersAdapterItemCountInt0) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x20cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.packageRemainDays
                        viewmodelPackageRemainDays = viewmodel.packageRemainDays;
                    }
                    updateRegistration(3, viewmodelPackageRemainDays);


                    if (viewmodelPackageRemainDays != null) {
                        // read viewmodel.packageRemainDays.get()
                        viewmodelPackageRemainDaysGet = viewmodelPackageRemainDays.get();
                    }


                    // read TextUtils.isEmpty(viewmodel.packageRemainDays.get())
                    TextUtilsIsEmptyViewmodelPackageRemainDays1 = android.text.TextUtils.isEmpty(viewmodelPackageRemainDaysGet);


                    // read !TextUtils.isEmpty(viewmodel.packageRemainDays.get())
                    textUtilsIsEmptyViewmodelPackageRemainDays = !TextUtilsIsEmptyViewmodelPackageRemainDays1;
                if((dirtyFlags & 0x20cL) != 0) {
                    if(textUtilsIsEmptyViewmodelPackageRemainDays) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x82000080000000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.selectedBtn
                    viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                }

            if ((dirtyFlags & 0x2000000000000L) != 0) {

                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x80000000000000L) != 0) {

                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x80000000L) != 0) {

                    // read viewmodel.selectedBtn == 2
                    viewmodelSelectedBtnInt2 = (viewmodelSelectedBtn) == (2);
                if((dirtyFlags & 0x224L) != 0) {
                    if(viewmodelSelectedBtnInt2) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x214L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = ((TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1) ? (viewmodelHomeDataCountDataMohdreen) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = ((TextUtilsIsEmptyViewmodelHomeDataCountDataCases1) ? (viewmodelHomeDataCountDataCases) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = ((textUtilsIsEmptyViewmodelHomeDataCountDataUsers) ? (viewmodelHomeDataCountDataUsers) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = ((TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1) ? (viewmodelHomeDataCountDataSessions) : (""));


                // read @android:string/menuMohdar.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : "")
                homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = homeMohdrs.getResources().getString(R.string.menuMohdar).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString);
                // read @android:string/menuCases.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : "")
                homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = homeCases.getResources().getString(R.string.menuCases).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString);
                // read @android:string/menuUsers.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : "")
                homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = homeUsers.getResources().getString(R.string.menuUsers).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString);
                // read @android:string/sessions.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : "")
                homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = homeSession.getResources().getString(R.string.sessions).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString);
        }
        if ((dirtyFlags & 0x20cL) != 0) {

                // read !TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " "
                textUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString = ((textUtilsIsEmptyViewmodelPackageRemainDays) ? (viewmodelPackageRemainDaysGet) : (" "));


                // read @android:string/warning_expire.concat(" ").concat(!TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " ")
                tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString = tvWarningExpire.getResources().getString(R.string.warning_expire).concat(" ").concat(textUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString);


                if (tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString != null) {
                    // read @android:string/warning_expire.concat(" ").concat(!TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " ").concat(" ) ")
                    tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangString = tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangString.concat(" ) ");
                }


                if (tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangString != null) {
                    // read @android:string/warning_expire.concat(" ").concat(!TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " ").concat(" ) ").concat(@android:string/day)
                    tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangStringConcatTvWarningExpireAndroidStringDay = tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangString.concat(tvWarningExpire.getResources().getString(R.string.day));
                }
        }
        if ((dirtyFlags & 0x100000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.homeData
                    viewmodelHomeData = viewmodel.getHomeData();
                }


                if (viewmodelHomeData != null) {
                    // read viewmodel.homeData.userPackage
                    viewmodelHomeDataUserPackage = viewmodelHomeData.getUserPackage();
                }


                if (viewmodelHomeDataUserPackage != null) {
                    // read viewmodel.homeData.userPackage.packageId
                    viewmodelHomeDataUserPackagePackageId = viewmodelHomeDataUserPackage.getPackageId();
                }


                // read viewmodel.homeData.userPackage.packageId == 5
                viewmodelHomeDataUserPackagePackageIdInt5 = (viewmodelHomeDataUserPackagePackageId) == (5);
            if((dirtyFlags & 0x214L) != 0) {
                if(viewmodelHomeDataUserPackagePackageIdInt5) {
                        dirtyFlags |= 0x800000000000L;
                }
                else {
                        dirtyFlags |= 0x400000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x216L) != 0) {

                // read viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5
                viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5 = ((viewmodelWarningDateBooleanTrue) ? (true) : (viewmodelHomeDataUserPackagePackageIdInt5));
            if((dirtyFlags & 0x216L) != 0) {
                if(viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
        }
        if ((dirtyFlags & 0x324L) != 0) {

                // read viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
                viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse = ((viewmodelHomeReportersAdapterItemCountInt0) ? (viewmodelSelectedBtnInt2) : (false));
            if((dirtyFlags & 0x324L) != 0) {
                if(viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
                viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE = ((viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x2a4L) != 0) {

                // read viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
                viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse = ((viewmodelPrevSessionsAdapterItemCountInt0) ? (viewmodelSelectedBtnInt1) : (false));
            if((dirtyFlags & 0x2a4L) != 0) {
                if(viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }


                // read viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
                viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE = ((viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x264L) != 0) {

                // read viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
                viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse = ((viewmodelComingSessionsAdapterItemCountInt0) ? (viewmodelSelectedBtnInt0) : (false));
            if((dirtyFlags & 0x264L) != 0) {
                if(viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }


                // read viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
                viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE = ((viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.homeData
                    viewmodelHomeData = viewmodel.getHomeData();
                }


                if (viewmodelHomeData != null) {
                    // read viewmodel.homeData.userPackage
                    viewmodelHomeDataUserPackage = viewmodelHomeData.getUserPackage();
                }


                if (viewmodelHomeDataUserPackage != null) {
                    // read viewmodel.homeData.userPackage.expiryPackage
                    viewmodelHomeDataUserPackageExpiryPackage = viewmodelHomeDataUserPackage.getExpiryPackage();
                }


                if (viewmodelHomeDataUserPackageExpiryPackage != null) {
                    // read viewmodel.homeData.userPackage.expiryPackage.equals("y")
                    viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY = viewmodelHomeDataUserPackageExpiryPackage.equals("y");
                }
        }

        if ((dirtyFlags & 0x216L) != 0) {

                // read viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y")
                viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY = ((viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5) ? (true) : (viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY));
            if((dirtyFlags & 0x216L) != 0) {
                if(viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }


                // read viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y") ? View.VISIBLE : View.GONE
                viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringYViewVISIBLEViewGONE = ((viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringY) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x224L) != 0) {
            // api target 1

            this.commingSessionRc.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
            this.homeReportersRc.setVisibility(viewmodelSelectedBtnInt2ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextMohdareen, viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextSessions, viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome);
            this.previousSessionRc.setVisibility(viewmodelSelectedBtnInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.previousSessions, viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x244L) != 0) {
            // api target 1

            this.commingSessionRc.setAdapter(viewmodelComingSessionsAdapter);
        }
        if ((dirtyFlags & 0x214L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeCases, homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeMohdrs, homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeSession, homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeUsers, homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString);
            this.tvDemoPackage.setVisibility(viewmodelHomeDataUserPackagePackageIdInt5ViewVISIBLEViewGONE);
            this.tvExpirePackage.setVisibility(viewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringNViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.homeItem2.setOnClickListener(mCallback98);
            this.homeItem3.setOnClickListener(mCallback99);
            this.homeItem4.setOnClickListener(mCallback100);
            this.mboundView5.setOnClickListener(mCallback97);
            this.nextMohdareen.setOnClickListener(mCallback103);
            this.nextSessions.setOnClickListener(mCallback101);
            this.previousSessions.setOnClickListener(mCallback102);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            this.homeReportersRc.setAdapter(viewmodelHomeReportersAdapter);
        }
        if ((dirtyFlags & 0x264L) != 0) {
            // api target 1

            this.mboundView20.setVisibility(viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2a4L) != 0) {
            // api target 1

            this.mboundView21.setVisibility(viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x324L) != 0) {
            // api target 1

            this.mboundView22.setVisibility(viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            this.previousSessionRc.setAdapter(viewmodelPrevSessionsAdapter);
        }
        if ((dirtyFlags & 0x205L) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWarningExpire, tvWarningExpireAndroidStringWarningExpireConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelPackageRemainDaysViewmodelPackageRemainDaysJavaLangStringConcatJavaLangStringConcatTvWarningExpireAndroidStringDay);
        }
        if ((dirtyFlags & 0x206L) != 0) {
            // api target 1

            this.tvWarningExpire.setVisibility(viewmodelWarningDateBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x216L) != 0) {
            // api target 1

            this.warningContainer.setVisibility(viewmodelWarningDateBooleanTrueBooleanTrueViewmodelHomeDataUserPackagePackageIdInt5BooleanTrueViewmodelHomeDataUserPackageExpiryPackageEqualsJavaLangStringYViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewmodel.userData.permission
                te.app.evidence.pages.auth.models.Permission viewmodelUserDataPermission = null;
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel.userData.permission != null
                boolean viewmodelUserDataPermissionJavaLangObjectNull = false;
                // viewmodel.userData
                te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
                // viewmodel.userData.permission.searchCase.equals("yes") ? Constants.ALL_CASES : Constants.ERROR_TOAST
                java.lang.String viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = null;
                // viewmodel.userData != null
                boolean viewmodelUserDataJavaLangObjectNull = false;
                // viewmodel.userData.permission.searchCase.equals("yes")
                boolean viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYes = false;
                // viewmodel.userData.permission.searchCase
                java.lang.String viewmodelUserDataPermissionSearchCase = null;
                // viewmodel.userData.permission.searchCase != null
                boolean viewmodelUserDataPermissionSearchCaseJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodelUserData = viewmodel.userData;

                    viewmodelUserDataJavaLangObjectNull = (viewmodelUserData) != (null);
                    if (viewmodelUserDataJavaLangObjectNull) {


                        viewmodelUserDataPermission = viewmodelUserData.getPermission();

                        viewmodelUserDataPermissionJavaLangObjectNull = (viewmodelUserDataPermission) != (null);
                        if (viewmodelUserDataPermissionJavaLangObjectNull) {


                            viewmodelUserDataPermissionSearchCase = viewmodelUserDataPermission.getSearchCase();

                            viewmodelUserDataPermissionSearchCaseJavaLangObjectNull = (viewmodelUserDataPermissionSearchCase) != (null);
                            if (viewmodelUserDataPermissionSearchCaseJavaLangObjectNull) {



                                viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYes = viewmodelUserDataPermissionSearchCase.equals("yes");
                                if (viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYes) {




                                    viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = te.app.evidence.utils.Constants.ALL_CASES;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST);
                                }
                                else {




                                    viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.nextSessions();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel.userData.permission
                te.app.evidence.pages.auth.models.Permission viewmodelUserDataPermission = null;
                // viewmodel.userData.permission.users.equals("yes")
                boolean viewmodelUserDataPermissionUsersEqualsJavaLangStringYes = false;
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel.userData.permission != null
                boolean viewmodelUserDataPermissionJavaLangObjectNull = false;
                // viewmodel.userData
                te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
                // viewmodel.userData.permission.users != null
                boolean viewmodelUserDataPermissionUsersJavaLangObjectNull = false;
                // viewmodel.userData != null
                boolean viewmodelUserDataJavaLangObjectNull = false;
                // viewmodel.userData.permission.users
                java.lang.String viewmodelUserDataPermissionUsers = null;
                // viewmodel.userData.permission.users.equals("yes") ? Constants.USERS : Constants.ERROR_TOAST
                java.lang.String viewmodelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = null;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodelUserData = viewmodel.userData;

                    viewmodelUserDataJavaLangObjectNull = (viewmodelUserData) != (null);
                    if (viewmodelUserDataJavaLangObjectNull) {


                        viewmodelUserDataPermission = viewmodelUserData.getPermission();

                        viewmodelUserDataPermissionJavaLangObjectNull = (viewmodelUserDataPermission) != (null);
                        if (viewmodelUserDataPermissionJavaLangObjectNull) {


                            viewmodelUserDataPermissionUsers = viewmodelUserDataPermission.getUsers();

                            viewmodelUserDataPermissionUsersJavaLangObjectNull = (viewmodelUserDataPermissionUsers) != (null);
                            if (viewmodelUserDataPermissionUsersJavaLangObjectNull) {



                                viewmodelUserDataPermissionUsersEqualsJavaLangStringYes = viewmodelUserDataPermissionUsers.equals("yes");
                                if (viewmodelUserDataPermissionUsersEqualsJavaLangStringYes) {




                                    viewmodelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = te.app.evidence.utils.Constants.USERS;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST);
                                }
                                else {




                                    viewmodelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.previousSessions();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.nextMohdars();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel.userData.permission
                te.app.evidence.pages.auth.models.Permission viewmodelUserDataPermission = null;
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel.userData.permission != null
                boolean viewmodelUserDataPermissionJavaLangObjectNull = false;
                // viewmodel.userData
                te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
                // viewmodel.userData.permission.mohdreen
                java.lang.String viewmodelUserDataPermissionMohdreen = null;
                // viewmodel.userData != null
                boolean viewmodelUserDataJavaLangObjectNull = false;
                // viewmodel.userData.permission.mohdreen.equals("yes") ? Constants.GET_MOHDAREEN : Constants.ERROR_TOAST
                java.lang.String viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = null;
                // viewmodel.userData.permission.mohdreen.equals("yes")
                boolean viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYes = false;
                // viewmodel.userData.permission.mohdreen != null
                boolean viewmodelUserDataPermissionMohdreenJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodelUserData = viewmodel.userData;

                    viewmodelUserDataJavaLangObjectNull = (viewmodelUserData) != (null);
                    if (viewmodelUserDataJavaLangObjectNull) {


                        viewmodelUserDataPermission = viewmodelUserData.getPermission();

                        viewmodelUserDataPermissionJavaLangObjectNull = (viewmodelUserDataPermission) != (null);
                        if (viewmodelUserDataPermissionJavaLangObjectNull) {


                            viewmodelUserDataPermissionMohdreen = viewmodelUserDataPermission.getMohdreen();

                            viewmodelUserDataPermissionMohdreenJavaLangObjectNull = (viewmodelUserDataPermissionMohdreen) != (null);
                            if (viewmodelUserDataPermissionMohdreenJavaLangObjectNull) {



                                viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYes = viewmodelUserDataPermissionMohdreen.equals("yes");
                                if (viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYes) {




                                    viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = te.app.evidence.utils.Constants.GET_MOHDAREEN;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST);
                                }
                                else {




                                    viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    viewmodel.buttonAction(viewmodelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SUBSCRIBE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel.warningDate
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.packageRemainDays
        flag 4 (0x5L): viewmodel.homeData
        flag 5 (0x6L): viewmodel.selectedBtn
        flag 6 (0x7L): viewmodel.comingSessionsAdapter
        flag 7 (0x8L): viewmodel.prevSessionsAdapter
        flag 8 (0x9L): viewmodel.homeReportersAdapter
        flag 9 (0xaL): null
        flag 10 (0xbL): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 13 (0xeL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 14 (0xfL): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 18 (0x13L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5
        flag 21 (0x16L): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5
        flag 22 (0x17L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 25 (0x1aL): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 26 (0x1bL): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y")
        flag 27 (0x1cL): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y")
        flag 28 (0x1dL): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
        flag 31 (0x20L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
        flag 32 (0x21L): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y") ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewmodel.warningDate.get() == true ? true : viewmodel.homeData.userPackage.packageId == 5 ? true : viewmodel.homeData.userPackage.expiryPackage.equals("y") ? View.VISIBLE : View.GONE
        flag 34 (0x23L): !TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " "
        flag 35 (0x24L): !TextUtils.isEmpty(viewmodel.packageRemainDays.get()) ? viewmodel.packageRemainDays.get() : " "
        flag 36 (0x25L): viewmodel.warningDate.get() == true ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewmodel.warningDate.get() == true ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 39 (0x28L): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 40 (0x29L): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 41 (0x2aL): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 42 (0x2bL): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 45 (0x2eL): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 46 (0x2fL): viewmodel.homeData.userPackage.packageId == 5 ? View.VISIBLE : View.GONE
        flag 47 (0x30L): viewmodel.homeData.userPackage.packageId == 5 ? View.VISIBLE : View.GONE
        flag 48 (0x31L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
        flag 49 (0x32L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
        flag 50 (0x33L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 51 (0x34L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 52 (0x35L): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
        flag 53 (0x36L): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
        flag 54 (0x37L): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
        flag 55 (0x38L): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
        flag 56 (0x39L): viewmodel.homeData.userPackage.expiryPackage.equals("n") ? View.GONE : View.VISIBLE
        flag 57 (0x3aL): viewmodel.homeData.userPackage.expiryPackage.equals("n") ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}