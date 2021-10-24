package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutNavigationDrawerBindingImpl extends LayoutNavigationDrawerBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 17);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 18);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 19);
        sViewsWithIds.put(R.id.fl_home_container, 20);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView10;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView11;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView12;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView13;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView14;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView15;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView16;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView5;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView6;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback148;
    @Nullable
    private final android.view.View.OnClickListener mCallback136;
    @Nullable
    private final android.view.View.OnClickListener mCallback144;
    @Nullable
    private final android.view.View.OnClickListener mCallback140;
    @Nullable
    private final android.view.View.OnClickListener mCallback137;
    @Nullable
    private final android.view.View.OnClickListener mCallback149;
    @Nullable
    private final android.view.View.OnClickListener mCallback145;
    @Nullable
    private final android.view.View.OnClickListener mCallback141;
    @Nullable
    private final android.view.View.OnClickListener mCallback138;
    @Nullable
    private final android.view.View.OnClickListener mCallback146;
    @Nullable
    private final android.view.View.OnClickListener mCallback134;
    @Nullable
    private final android.view.View.OnClickListener mCallback142;
    @Nullable
    private final android.view.View.OnClickListener mCallback139;
    @Nullable
    private final android.view.View.OnClickListener mCallback135;
    @Nullable
    private final android.view.View.OnClickListener mCallback147;
    @Nullable
    private final android.view.View.OnClickListener mCallback143;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.addCase.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView3 = (com.google.android.material.button.MaterialButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9];
        this.mboundView9.setTag(null);
        this.searchCase.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback148 = new te.app.evidence.generated.callback.OnClickListener(this, 15);
        mCallback136 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback144 = new te.app.evidence.generated.callback.OnClickListener(this, 11);
        mCallback140 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback137 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback149 = new te.app.evidence.generated.callback.OnClickListener(this, 16);
        mCallback145 = new te.app.evidence.generated.callback.OnClickListener(this, 12);
        mCallback141 = new te.app.evidence.generated.callback.OnClickListener(this, 8);
        mCallback138 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback146 = new te.app.evidence.generated.callback.OnClickListener(this, 13);
        mCallback134 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback142 = new te.app.evidence.generated.callback.OnClickListener(this, 9);
        mCallback139 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback135 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback147 = new te.app.evidence.generated.callback.OnClickListener(this, 14);
        mCallback143 = new te.app.evidence.generated.callback.OnClickListener(this, 10);
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
        if (BR.menuViewModel == variableId) {
            setMenuViewModel((te.app.evidence.customViews.menu.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuViewModel(@Nullable te.app.evidence.customViews.menu.MenuViewModel MenuViewModel) {
        updateRegistration(0, MenuViewModel);
        this.mMenuViewModel = MenuViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.menuViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuViewModel((te.app.evidence.customViews.menu.MenuViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuViewModel(te.app.evidence.customViews.menu.MenuViewModel MenuViewModel, int fieldId) {
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
        te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
        int menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYesViewVISIBLEViewGONE = 0;
        int menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYesViewVISIBLEViewGONE = 0;
        java.lang.String menuViewModelUserDataPermissionDailyReport = null;
        java.lang.String menuViewModelUserDataUserDataMyPoints = null;
        int menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String menuViewModelUserDataPermissionMonthlyReport = null;
        boolean menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYes = false;
        te.app.evidence.pages.auth.models.UserData menuViewModelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
        boolean menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
        java.lang.String menuViewModelUserDataUserDataMyPointsConcatJavaLangString = null;
        java.lang.String menuViewModelUserDataUserDataImage = null;
        java.lang.String menuViewModelUserDataUserDataMyPointsConcatJavaLangStringConcatMboundView3AndroidStringPoint = null;
        boolean menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYes = false;
        java.lang.String menuViewModelUserDataUserDataName = null;
        java.lang.String menuViewModelUserDataUserDataType = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (menuViewModel != null) {
                    // read menuViewModel.userData
                    menuViewModelUserData = menuViewModel.userData;
                }


                if (menuViewModelUserData != null) {
                    // read menuViewModel.userData.userData
                    menuViewModelUserDataUserData = menuViewModelUserData.getUserData();
                    // read menuViewModel.userData.permission
                    menuViewModelUserDataPermission = menuViewModelUserData.getPermission();
                }


                if (menuViewModelUserDataUserData != null) {
                    // read menuViewModel.userData.userData.my_points
                    menuViewModelUserDataUserDataMyPoints = menuViewModelUserDataUserData.getMy_points();
                    // read menuViewModel.userData.userData.image
                    menuViewModelUserDataUserDataImage = menuViewModelUserDataUserData.getImage();
                    // read menuViewModel.userData.userData.name
                    menuViewModelUserDataUserDataName = menuViewModelUserDataUserData.getName();
                    // read menuViewModel.userData.userData.type
                    menuViewModelUserDataUserDataType = menuViewModelUserDataUserData.getType();
                }
                if (menuViewModelUserDataPermission != null) {
                    // read menuViewModel.userData.permission.dailyReport
                    menuViewModelUserDataPermissionDailyReport = menuViewModelUserDataPermission.getDailyReport();
                    // read menuViewModel.userData.permission.monthlyReport
                    menuViewModelUserDataPermissionMonthlyReport = menuViewModelUserDataPermission.getMonthlyReport();
                }


                if (menuViewModelUserDataUserDataMyPoints != null) {
                    // read menuViewModel.userData.userData.my_points.concat(" ")
                    menuViewModelUserDataUserDataMyPointsConcatJavaLangString = menuViewModelUserDataUserDataMyPoints.concat(" ");
                }
                if (menuViewModelUserDataUserDataType != null) {
                    // read menuViewModel.userData.userData.type.equals("admin")
                    menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = menuViewModelUserDataUserDataType.equals("admin");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
                if (menuViewModelUserDataPermissionDailyReport != null) {
                    // read menuViewModel.userData.permission.dailyReport.equals("yes")
                    menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYes = menuViewModelUserDataPermissionDailyReport.equals("yes");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
                if (menuViewModelUserDataPermissionMonthlyReport != null) {
                    // read menuViewModel.userData.permission.monthlyReport.equals("yes")
                    menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYes = menuViewModelUserDataPermissionMonthlyReport.equals("yes");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYes) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                if (menuViewModelUserDataUserDataMyPointsConcatJavaLangString != null) {
                    // read menuViewModel.userData.userData.my_points.concat(" ").concat(@android:string/point)
                    menuViewModelUserDataUserDataMyPointsConcatJavaLangStringConcatMboundView3AndroidStringPoint = menuViewModelUserDataUserDataMyPointsConcatJavaLangString.concat(mboundView3.getResources().getString(R.string.point));
                }
                // read menuViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read menuViewModel.userData.permission.dailyReport.equals("yes") ? View.VISIBLE : View.GONE
                menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYesViewVISIBLEViewGONE = ((menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYes) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read menuViewModel.userData.permission.monthlyReport.equals("yes") ? View.VISIBLE : View.GONE
                menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYesViewVISIBLEViewGONE = ((menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYes) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.addCase.setOnClickListener(mCallback140);
            this.mboundView10.setOnClickListener(mCallback143);
            this.mboundView11.setOnClickListener(mCallback144);
            this.mboundView12.setOnClickListener(mCallback145);
            this.mboundView13.setOnClickListener(mCallback146);
            this.mboundView14.setOnClickListener(mCallback147);
            this.mboundView15.setOnClickListener(mCallback148);
            this.mboundView16.setOnClickListener(mCallback149);
            this.mboundView3.setOnClickListener(mCallback136);
            this.mboundView4.setOnClickListener(mCallback137);
            this.mboundView5.setOnClickListener(mCallback138);
            this.mboundView6.setOnClickListener(mCallback139);
            this.mboundView9.setOnClickListener(mCallback142);
            this.searchCase.setOnClickListener(mCallback141);
            this.tvUserLogin.setOnClickListener(mCallback135);
            this.vvNavigationDrawerImage.setOnClickListener(mCallback134);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(menuViewModelUserDataPermissionDailyReportEqualsJavaLangStringYesViewVISIBLEViewGONE);
            this.mboundView12.setVisibility(menuViewModelUserDataPermissionMonthlyReportEqualsJavaLangStringYesViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(menuViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, menuViewModelUserDataUserDataMyPointsConcatJavaLangStringConcatMboundView3AndroidStringPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserLogin, menuViewModelUserDataUserDataName);
            te.app.evidence.base.ApplicationBinding.loadMarketImage(this.vvNavigationDrawerImage, menuViewModelUserDataUserDataImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.changeLanguage();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.POINTS);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category != null
                boolean menuViewModelUserDataPermissionCategoryJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission.category.equals("yes") ? Constants.DAILY_REPORTS : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsDAILYREPORTSConstantsERRORTOAST = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category.equals("yes")
                boolean menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
                // menuViewModel.userData.permission.category
                java.lang.String menuViewModelUserDataPermissionCategory = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionCategory = menuViewModelUserDataPermission.getCategory();

                            menuViewModelUserDataPermissionCategoryJavaLangObjectNull = (menuViewModelUserDataPermissionCategory) != (null);
                            if (menuViewModelUserDataPermissionCategoryJavaLangObjectNull) {



                                menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = menuViewModelUserDataPermissionCategory.equals("yes");
                                if (menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsDAILYREPORTSConstantsERRORTOAST = te.app.evidence.utils.Constants.DAILY_REPORTS;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsDAILYREPORTSConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsDAILYREPORTSConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsDAILYREPORTSConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // menuViewModel.userData.permission.addcases.equals("yes") ? Constants.ADD_CASE : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYesConstantsADDCASEConstantsERRORTOAST = null;
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel.userData.permission.addcases
                java.lang.String menuViewModelUserDataPermissionAddcases = null;
                // menuViewModel.userData.permission.addcases.equals("yes")
                boolean menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYes = false;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.addcases != null
                boolean menuViewModelUserDataPermissionAddcasesJavaLangObjectNull = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionAddcases = menuViewModelUserDataPermission.getAddcases();

                            menuViewModelUserDataPermissionAddcasesJavaLangObjectNull = (menuViewModelUserDataPermissionAddcases) != (null);
                            if (menuViewModelUserDataPermissionAddcasesJavaLangObjectNull) {



                                menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYes = menuViewModelUserDataPermissionAddcases.equals("yes");
                                if (menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYesConstantsADDCASEConstantsERRORTOAST = te.app.evidence.utils.Constants.ADD_CASE;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYesConstantsADDCASEConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYesConstantsADDCASEConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionAddcasesEqualsJavaLangStringYesConstantsADDCASEConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.HOME);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.logout();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category != null
                boolean menuViewModelUserDataPermissionCategoryJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category.equals("yes")
                boolean menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
                // menuViewModel.userData.permission.category
                java.lang.String menuViewModelUserDataPermissionCategory = null;
                // menuViewModel.userData.permission.category.equals("yes") ? Constants.MONTHLY_REPORTS : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsMONTHLYREPORTSConstantsERRORTOAST = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionCategory = menuViewModelUserDataPermission.getCategory();

                            menuViewModelUserDataPermissionCategoryJavaLangObjectNull = (menuViewModelUserDataPermissionCategory) != (null);
                            if (menuViewModelUserDataPermissionCategoryJavaLangObjectNull) {



                                menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = menuViewModelUserDataPermissionCategory.equals("yes");
                                if (menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsMONTHLYREPORTSConstantsERRORTOAST = te.app.evidence.utils.Constants.MONTHLY_REPORTS;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsMONTHLYREPORTSConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsMONTHLYREPORTSConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsMONTHLYREPORTSConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel.userData.permission.searchCase
                java.lang.String menuViewModelUserDataPermissionSearchCase = null;
                // menuViewModel.userData.permission.searchCase.equals("yes") ? Constants.ALL_CASES : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = null;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData.permission.searchCase != null
                boolean menuViewModelUserDataPermissionSearchCaseJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
                // menuViewModel.userData.permission.searchCase.equals("yes")
                boolean menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYes = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionSearchCase = menuViewModelUserDataPermission.getSearchCase();

                            menuViewModelUserDataPermissionSearchCaseJavaLangObjectNull = (menuViewModelUserDataPermissionSearchCase) != (null);
                            if (menuViewModelUserDataPermissionSearchCaseJavaLangObjectNull) {



                                menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYes = menuViewModelUserDataPermissionSearchCase.equals("yes");
                                if (menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = te.app.evidence.utils.Constants.ALL_CASES;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionSearchCaseEqualsJavaLangStringYesConstantsALLCASESConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel.userData.permission.users.equals("yes")
                boolean menuViewModelUserDataPermissionUsersEqualsJavaLangStringYes = false;
                // menuViewModel.userData.permission.users.equals("yes") ? Constants.USERS : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = null;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.users
                java.lang.String menuViewModelUserDataPermissionUsers = null;
                // menuViewModel.userData.permission.users != null
                boolean menuViewModelUserDataPermissionUsersJavaLangObjectNull = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionUsers = menuViewModelUserDataPermission.getUsers();

                            menuViewModelUserDataPermissionUsersJavaLangObjectNull = (menuViewModelUserDataPermissionUsers) != (null);
                            if (menuViewModelUserDataPermissionUsersJavaLangObjectNull) {



                                menuViewModelUserDataPermissionUsersEqualsJavaLangStringYes = menuViewModelUserDataPermissionUsers.equals("yes");
                                if (menuViewModelUserDataPermissionUsersEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = te.app.evidence.utils.Constants.USERS;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionUsersEqualsJavaLangStringYesConstantsUSERSConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.PACKAGES);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.PROFILE);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel.userData.permission.mohdreen.equals("yes")
                boolean menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYes = false;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.mohdreen.equals("yes") ? Constants.GET_MOHDAREEN : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = null;
                // menuViewModel.userData.permission.mohdreen
                java.lang.String menuViewModelUserDataPermissionMohdreen = null;
                // menuViewModel.userData.permission.mohdreen != null
                boolean menuViewModelUserDataPermissionMohdreenJavaLangObjectNull = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionMohdreen = menuViewModelUserDataPermission.getMohdreen();

                            menuViewModelUserDataPermissionMohdreenJavaLangObjectNull = (menuViewModelUserDataPermissionMohdreen) != (null);
                            if (menuViewModelUserDataPermissionMohdreenJavaLangObjectNull) {



                                menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYes = menuViewModelUserDataPermissionMohdreen.equals("yes");
                                if (menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = te.app.evidence.utils.Constants.GET_MOHDAREEN;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionMohdreenEqualsJavaLangStringYesConstantsGETMOHDAREENConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel.userData.permission.clients.equals("yes") ? Constants.CLIENTS : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionClientsEqualsJavaLangStringYesConstantsCLIENTSConstantsERRORTOAST = null;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.clients.equals("yes")
                boolean menuViewModelUserDataPermissionClientsEqualsJavaLangStringYes = false;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData.permission.clients != null
                boolean menuViewModelUserDataPermissionClientsJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
                // menuViewModel.userData.permission.clients
                java.lang.String menuViewModelUserDataPermissionClients = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionClients = menuViewModelUserDataPermission.getClients();

                            menuViewModelUserDataPermissionClientsJavaLangObjectNull = (menuViewModelUserDataPermissionClients) != (null);
                            if (menuViewModelUserDataPermissionClientsJavaLangObjectNull) {



                                menuViewModelUserDataPermissionClientsEqualsJavaLangStringYes = menuViewModelUserDataPermissionClients.equals("yes");
                                if (menuViewModelUserDataPermissionClientsEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionClientsEqualsJavaLangStringYesConstantsCLIENTSConstantsERRORTOAST = te.app.evidence.utils.Constants.CLIENTS;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionClientsEqualsJavaLangStringYesConstantsCLIENTSConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionClientsEqualsJavaLangStringYesConstantsCLIENTSConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionClientsEqualsJavaLangStringYesConstantsCLIENTSConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.PROFILE);
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.evidence.utils.Constants.CONTACT_US);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category != null
                boolean menuViewModelUserDataPermissionCategoryJavaLangObjectNull = false;
                // menuViewModel.userData.permission
                te.app.evidence.pages.auth.models.Permission menuViewModelUserDataPermission = null;
                // menuViewModel.userData.permission != null
                boolean menuViewModelUserDataPermissionJavaLangObjectNull = false;
                // menuViewModel.userData.permission.category.equals("yes")
                boolean menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = false;
                // menuViewModel.userData.permission.category.equals("yes") ? Constants.CATEGORIES : Constants.ERROR_TOAST
                java.lang.String menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsCATEGORIESConstantsERRORTOAST = null;
                // menuViewModel.userData != null
                boolean menuViewModelUserDataJavaLangObjectNull = false;
                // menuViewModel.userData
                te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
                // menuViewModel.userData.permission.category
                java.lang.String menuViewModelUserDataPermissionCategory = null;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModelUserData = menuViewModel.userData;

                    menuViewModelUserDataJavaLangObjectNull = (menuViewModelUserData) != (null);
                    if (menuViewModelUserDataJavaLangObjectNull) {


                        menuViewModelUserDataPermission = menuViewModelUserData.getPermission();

                        menuViewModelUserDataPermissionJavaLangObjectNull = (menuViewModelUserDataPermission) != (null);
                        if (menuViewModelUserDataPermissionJavaLangObjectNull) {


                            menuViewModelUserDataPermissionCategory = menuViewModelUserDataPermission.getCategory();

                            menuViewModelUserDataPermissionCategoryJavaLangObjectNull = (menuViewModelUserDataPermissionCategory) != (null);
                            if (menuViewModelUserDataPermissionCategoryJavaLangObjectNull) {



                                menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes = menuViewModelUserDataPermissionCategory.equals("yes");
                                if (menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYes) {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsCATEGORIESConstantsERRORTOAST = te.app.evidence.utils.Constants.CATEGORIES;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsCATEGORIESConstantsERRORTOAST);
                                }
                                else {




                                    menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsCATEGORIESConstantsERRORTOAST = te.app.evidence.utils.Constants.ERROR_TOAST;

                                    menuViewModel.buttonAction(menuViewModelUserDataPermissionCategoryEqualsJavaLangStringYesConstantsCATEGORIESConstantsERRORTOAST);
                                }
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): menuViewModel.userData.permission.dailyReport.equals("yes") ? View.VISIBLE : View.GONE
        flag 3 (0x4L): menuViewModel.userData.permission.dailyReport.equals("yes") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): menuViewModel.userData.permission.monthlyReport.equals("yes") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): menuViewModel.userData.permission.monthlyReport.equals("yes") ? View.VISIBLE : View.GONE
        flag 6 (0x7L): menuViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 7 (0x8L): menuViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}