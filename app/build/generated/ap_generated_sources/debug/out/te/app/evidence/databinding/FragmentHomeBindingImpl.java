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
        sViewsWithIds.put(R.id.home_item1, 14);
        sViewsWithIds.put(R.id.view_id, 15);
        sViewsWithIds.put(R.id.view_mohdr, 16);
        sViewsWithIds.put(R.id.view_users, 17);
        sViewsWithIds.put(R.id.view_casee, 18);
        sViewsWithIds.put(R.id.flow, 19);
        sViewsWithIds.put(R.id.br3, 20);
        sViewsWithIds.put(R.id.input_search, 21);
        sViewsWithIds.put(R.id.progress_bar_home, 22);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[21]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (android.widget.ProgressBar) bindings[22]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[18]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[15]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[16]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[17]
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
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextMohdareen.setTag(null);
        this.nextSessions.setTag(null);
        this.previousSessionRc.setTag(null);
        this.previousSessions.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback70 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback68 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback71 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback69 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback72 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
                return onChangeViewmodel((te.app.evidence.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.selectedBtn) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.sessionsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.homeReportersAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        te.app.evidence.pages.home.adapters.SessionsAdapter viewmodelSessionsAdapter = null;
        int viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        int viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelHomeDataCountDataSessions = null;
        te.app.evidence.pages.home.adapters.HomeReportersAdapter viewmodelHomeReportersAdapter = null;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = false;
        java.lang.String homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        int viewmodelSelectedBtnInt2ViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataUsers = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = false;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataCases = false;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = null;
        java.lang.String homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelHomeDataCountDataSessions = false;
        boolean viewmodelSelectedBtnInt0 = false;
        java.lang.String viewmodelHomeDataCountDataCases = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = null;
        te.app.evidence.pages.home.models.CountData viewmodelHomeDataCountData = null;
        boolean viewmodelSelectedBtnInt1 = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataCases1 = false;
        java.lang.String viewmodelHomeDataCountDataMohdreen = null;
        java.lang.String viewmodelHomeDataCountDataUsers = null;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = false;
        boolean TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = false;
        te.app.evidence.pages.home.models.HomeData viewmodelHomeData = null;
        boolean viewmodelSelectedBtnInt2 = false;
        java.lang.String homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = null;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;
        java.lang.String homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedBtn
                        viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                    }


                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                    // read viewmodel.selectedBtn == 2
                    viewmodelSelectedBtnInt2 = (viewmodelSelectedBtn) == (2);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelSelectedBtnInt2) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt2ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_dark_home)));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.sessionsAdapter
                        viewmodelSessionsAdapter = viewmodel.getSessionsAdapter();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.homeReportersAdapter
                        viewmodelHomeReportersAdapter = viewmodel.getHomeReportersAdapter();
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

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
                    TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1 = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataSessions);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    textUtilsIsEmptyViewmodelHomeDataCountDataCases = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataCases);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1 = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataMohdreen);
                    // read TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1 = android.text.TextUtils.isEmpty(viewmodelHomeDataCountDataUsers);


                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.sessions)
                    textUtilsIsEmptyViewmodelHomeDataCountDataSessions = !TextUtilsIsEmptyViewmodelHomeDataCountDataSessions1;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.cases)
                    TextUtilsIsEmptyViewmodelHomeDataCountDataCases1 = !textUtilsIsEmptyViewmodelHomeDataCountDataCases;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen)
                    textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen = !TextUtilsIsEmptyViewmodelHomeDataCountDataMohdreen1;
                    // read !TextUtils.isEmpty(viewmodel.homeData.countData.users)
                    textUtilsIsEmptyViewmodelHomeDataCountDataUsers = !TextUtilsIsEmptyViewmodelHomeDataCountDataUsers1;
                if((dirtyFlags & 0x23L) != 0) {
                    if(textUtilsIsEmptyViewmodelHomeDataCountDataSessions) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(TextUtilsIsEmptyViewmodelHomeDataCountDataCases1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(textUtilsIsEmptyViewmodelHomeDataCountDataUsers) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x23L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = ((TextUtilsIsEmptyViewmodelHomeDataCountDataCases1) ? (viewmodelHomeDataCountDataCases) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = ((textUtilsIsEmptyViewmodelHomeDataCountDataMohdreen) ? (viewmodelHomeDataCountDataMohdreen) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = ((textUtilsIsEmptyViewmodelHomeDataCountDataUsers) ? (viewmodelHomeDataCountDataUsers) : (""));
                // read !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
                textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = ((textUtilsIsEmptyViewmodelHomeDataCountDataSessions) ? (viewmodelHomeDataCountDataSessions) : (""));


                // read @android:string/menuCases.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : "")
                homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString = homeCases.getResources().getString(R.string.menuCases).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString);
                // read @android:string/menuMohdar.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : "")
                homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString = homeMohdrs.getResources().getString(R.string.menuMohdar).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString);
                // read @android:string/menuUsers.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : "")
                homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString = homeUsers.getResources().getString(R.string.menuUsers).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString);
                // read @android:string/sessions.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : "")
                homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString = homeSession.getResources().getString(R.string.sessions).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.commingSessionRc.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
            this.homeReportersRc.setVisibility(viewmodelSelectedBtnInt2ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextMohdareen, viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextSessions, viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome);
            this.previousSessionRc.setVisibility(viewmodelSelectedBtnInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.previousSessions, viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.commingSessionRc.setAdapter(viewmodelSessionsAdapter);
            this.previousSessionRc.setAdapter(viewmodelSessionsAdapter);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeCases, homeCasesAndroidStringMenuCasesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataCasesViewmodelHomeDataCountDataCasesJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeMohdrs, homeMohdrsAndroidStringMenuMohdarConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataMohdreenViewmodelHomeDataCountDataMohdreenJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeSession, homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataSessionsViewmodelHomeDataCountDataSessionsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeUsers, homeUsersAndroidStringMenuUsersConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelHomeDataCountDataUsersViewmodelHomeDataCountDataUsersJavaLangString);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.homeItem2.setOnClickListener(mCallback67);
            this.homeItem3.setOnClickListener(mCallback68);
            this.homeItem4.setOnClickListener(mCallback69);
            this.nextMohdareen.setOnClickListener(mCallback72);
            this.nextSessions.setOnClickListener(mCallback70);
            this.previousSessions.setOnClickListener(mCallback71);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.homeReportersRc.setAdapter(viewmodelHomeReportersAdapter);
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.homeData
        flag 2 (0x3L): viewmodel.selectedBtn
        flag 3 (0x4L): viewmodel.sessionsAdapter
        flag 4 (0x5L): viewmodel.homeReportersAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 9 (0xaL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 10 (0xbL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.homeData.countData.cases) ? viewmodel.homeData.countData.cases : ""
        flag 14 (0xfL): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.selectedBtn == 2 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.homeData.countData.mohdreen) ? viewmodel.homeData.countData.mohdreen : ""
        flag 18 (0x13L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 19 (0x14L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 20 (0x15L): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 21 (0x16L): !TextUtils.isEmpty(viewmodel.homeData.countData.users) ? viewmodel.homeData.countData.users : ""
        flag 22 (0x17L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 23 (0x18L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 24 (0x19L): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
        flag 25 (0x1aL): !TextUtils.isEmpty(viewmodel.homeData.countData.sessions) ? viewmodel.homeData.countData.sessions : ""
    flag mapping end*/
    //end
}