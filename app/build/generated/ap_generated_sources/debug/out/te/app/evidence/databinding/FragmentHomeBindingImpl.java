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
        sViewsWithIds.put(R.id.toolbar_layout, 18);
        sViewsWithIds.put(R.id.home_item1, 19);
        sViewsWithIds.put(R.id.view_id, 20);
        sViewsWithIds.put(R.id.view_mohdr, 21);
        sViewsWithIds.put(R.id.view_users, 22);
        sViewsWithIds.put(R.id.view_casee, 23);
        sViewsWithIds.put(R.id.flow, 24);
        sViewsWithIds.put(R.id.br3, 25);
        sViewsWithIds.put(R.id.progress_bar_home, 26);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView15;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView16;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView17;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Barrier) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[24]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[14]
            , (android.widget.ProgressBar) bindings[26]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[18]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[23]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[20]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[21]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[22]
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
        this.mboundView15 = (com.airbnb.lottie.LottieAnimationView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (com.airbnb.lottie.LottieAnimationView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.airbnb.lottie.LottieAnimationView) bindings[17];
        this.mboundView17.setTag(null);
        this.nextMohdareen.setTag(null);
        this.nextSessions.setTag(null);
        this.previousSessionRc.setTag(null);
        this.previousSessions.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback82 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback83 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback87 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback86 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback84 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback85 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
                return onChangeViewmodel((te.app.evidence.pages.home.viewModels.HomeViewModel) object, fieldId);
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
    private boolean onChangeViewmodel(te.app.evidence.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.selectedBtn) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.comingSessionsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.prevSessionsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.homeReportersAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        int viewmodelSelectedBtn = 0;
        int viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String viewmodelHomeDataCountDataSessions = null;
        java.lang.String homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = null;
        int viewmodelSelectedBtnInt2ViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataUsers = false;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = false;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataCases = false;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelPrevSessionsAdapter = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        int viewmodelPrevSessionsAdapterItemCount = 0;
        int viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = null;
        int viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse = false;
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelComingSessionsAdapter = null;
        te.app.evidence.pages.home.models.CountData viewmodelHomeDataCountData = null;
        boolean viewmodelSelectedBtnInt1 = false;
        boolean viewmodelHomeReportersAdapterItemCountInt0 = false;
        int viewmodelHomeReportersAdapterItemCount = 0;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataSessions = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = false;
        te.app.evidence.pages.home.models.HomeData viewmodelHomeData = null;
        int viewmodelComingSessionsAdapterItemCount = 0;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;
        java.lang.String homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;
        int viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = 0;
        boolean viewmodelPrevSessionsAdapterItemCountInt0 = false;
        te.app.evidence.pages.home.adapters.HomeReportersAdapter viewmodelHomeReportersAdapter = null;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = false;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        int viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = false;
        boolean viewmodelSelectedBtnInt0 = false;
        java.lang.String viewmodelHomeDataCountDataCases = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;
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

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x8aL) != 0) {

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
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000000000L;
                    }
                }
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt2) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x100000L;
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
            if ((dirtyFlags & 0x83L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x83L) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xaaL) != 0) {

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
                if((dirtyFlags & 0xaaL) != 0) {
                    if(viewmodelPrevSessionsAdapterItemCountInt0) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x9aL) != 0) {

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
                if((dirtyFlags & 0x9aL) != 0) {
                    if(viewmodelComingSessionsAdapterItemCountInt0) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x86L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.homeData
                        viewmodelHomeData = viewmodel.getHomeData();
                    }


                    if (viewmodelHomeData != null) {
                        // read viewmodel.homeData.countData
                        viewmodelHomeDataCountData = viewmodelHomeData.getCountData();
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


                    // read TextUtils.isEmpty(viewmodel.homeData.countData.sessions)
                    textUtilsIsEmptyViewmodelHomeDataCountDataSessions = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataSessions);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    textUtilsIsEmptyViewmodelHomeDataCountDataCases = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataCases);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataMohdreen);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataUsers);


                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.sessions)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = !textUtilsIsEmptyViewmodelHomeDataCountDataSessions;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataCases1 = !textUtilsIsEmptyViewmodelHomeDataCountDataCases;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = !textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    textUtilsIsEmptyViewmodelHomeDataCountDataUsers = !TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1;
                if((dirtyFlags & 0x86L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }
                if((dirtyFlags & 0x86L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataCases1) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
                if((dirtyFlags & 0x86L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x86L) != 0) {
                    if(textUtilsIsEmptyViewmodelHomeDataCountDataUsers) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xcaL) != 0) {

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
                if((dirtyFlags & 0xcaL) != 0) {
                    if(viewmodelHomeReportersAdapterItemCountInt0) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20802000000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.selectedBtn
                    viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                }

            if ((dirtyFlags & 0x800000000L) != 0) {

                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x20000000000L) != 0) {

                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x2000000L) != 0) {

                    // read viewmodel.selectedBtn == 2
                    viewmodelSelectedBtnInt2 = (viewmodelSelectedBtn) == (2);
                if((dirtyFlags & 0x8aL) != 0) {
                    if(viewmodelSelectedBtnInt2) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x86L) != 0) {

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

        if ((dirtyFlags & 0xcaL) != 0) {

                // read viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
                viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse = ((viewmodelHomeReportersAdapterItemCountInt0) ? (viewmodelSelectedBtnInt2) : (false));
            if((dirtyFlags & 0xcaL) != 0) {
                if(viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
                viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE = ((viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xaaL) != 0) {

                // read viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
                viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse = ((viewmodelPrevSessionsAdapterItemCountInt0) ? (viewmodelSelectedBtnInt1) : (false));
            if((dirtyFlags & 0xaaL) != 0) {
                if(viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
                viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE = ((viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x9aL) != 0) {

                // read viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
                viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse = ((viewmodelComingSessionsAdapterItemCountInt0) ? (viewmodelSelectedBtnInt0) : (false));
            if((dirtyFlags & 0x9aL) != 0) {
                if(viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }


                // read viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
                viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE = ((viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8aL) != 0) {
            // api target 1

            this.commingSessionRc.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
            this.homeReportersRc.setVisibility(viewmodelSelectedBtnInt2ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextMohdareen, viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextSessions, viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome);
            this.previousSessionRc.setVisibility(viewmodelSelectedBtnInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.previousSessions, viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x92L) != 0) {
            // api target 1

            this.commingSessionRc.setAdapter(viewmodelComingSessionsAdapter);
        }
        if ((dirtyFlags & 0x86L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeCases, homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeMohdrs, homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeSession, homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeUsers, homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.homeItem2.setOnClickListener(mCallback82);
            this.homeItem3.setOnClickListener(mCallback83);
            this.homeItem4.setOnClickListener(mCallback84);
            this.nextMohdareen.setOnClickListener(mCallback87);
            this.nextSessions.setOnClickListener(mCallback85);
            this.previousSessions.setOnClickListener(mCallback86);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.homeReportersRc.setAdapter(viewmodelHomeReportersAdapter);
        }
        if ((dirtyFlags & 0x9aL) != 0) {
            // api target 1

            this.mboundView15.setVisibility(viewmodelComingSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaaL) != 0) {
            // api target 1

            this.mboundView16.setVisibility(viewmodelPrevSessionsAdapterItemCountInt0ViewmodelSelectedBtnInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xcaL) != 0) {
            // api target 1

            this.mboundView17.setVisibility(viewmodelHomeReportersAdapterItemCountInt0ViewmodelSelectedBtnInt2BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            this.previousSessionRc.setAdapter(viewmodelPrevSessionsAdapter);
        }
        if ((dirtyFlags & 0x83L) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
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
            case 2: {
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


                    viewmodel.nextMohdars();
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


                    viewmodel.previousSessions();
                }
                break;
            }
            case 3: {
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
            case 4: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.homeData
        flag 3 (0x4L): viewmodel.selectedBtn
        flag 4 (0x5L): viewmodel.comingSessionsAdapter
        flag 5 (0x6L): viewmodel.prevSessionsAdapter
        flag 6 (0x7L): viewmodel.homeReportersAdapter
        flag 7 (0x8L): null
        flag 8 (0x9L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 11 (0xcL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 12 (0xdL): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 16 (0x11L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 21 (0x16L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 22 (0x17L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
        flag 25 (0x1aL): viewmodel.homeReportersAdapter.itemCount == 0 ? viewmodel.selectedBtn == 2 : false
        flag 26 (0x1bL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 29 (0x1eL): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 30 (0x1fL): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false ? View.VISIBLE : View.GONE
        flag 32 (0x21L): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 33 (0x22L): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 34 (0x23L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
        flag 35 (0x24L): viewmodel.prevSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 1 : false
        flag 36 (0x25L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 37 (0x26L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 38 (0x27L): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
        flag 39 (0x28L): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
        flag 40 (0x29L): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
        flag 41 (0x2aL): viewmodel.comingSessionsAdapter.itemCount == 0 ? viewmodel.selectedBtn == 0 : false
    flag mapping end*/
    //end
}