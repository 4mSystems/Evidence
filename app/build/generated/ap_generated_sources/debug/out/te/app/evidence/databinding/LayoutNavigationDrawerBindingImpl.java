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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 12);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 13);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 14);
        sViewsWithIds.put(R.id.fl_home_container, 15);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 16);
        sViewsWithIds.put(R.id.layout_reports_header, 17);
        sViewsWithIds.put(R.id.icon_down_qu, 18);
        sViewsWithIds.put(R.id.tv_username, 19);
        sViewsWithIds.put(R.id.expansionLayoutReports, 20);
        sViewsWithIds.put(R.id.daily_reports, 21);
        sViewsWithIds.put(R.id.monthly_reports, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView10;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView11;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView5;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView8;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[12]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[17]
            , (android.widget.LinearLayout) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[22]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[16]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[19]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.addCase.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView8 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9];
        this.mboundView9.setTag(null);
        this.searchCase.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback79 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback87 = new te.app.evidence.generated.callback.OnClickListener(this, 9);
        mCallback86 = new te.app.evidence.generated.callback.OnClickListener(this, 8);
        mCallback84 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback82 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback80 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback85 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback83 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback81 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
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
        java.lang.String menuViewModelUserDataUserDataImage = null;
        te.app.evidence.pages.auth.models.UserData menuViewModelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
        java.lang.String menuViewModelUserDataUserDataName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (menuViewModel != null) {
                    // read menuViewModel.userData
                    menuViewModelUserData = menuViewModel.userData;
                }


                if (menuViewModelUserData != null) {
                    // read menuViewModel.userData.userData
                    menuViewModelUserDataUserData = menuViewModelUserData.getUserData();
                }


                if (menuViewModelUserDataUserData != null) {
                    // read menuViewModel.userData.userData.image
                    menuViewModelUserDataUserDataImage = menuViewModelUserDataUserData.getImage();
                    // read menuViewModel.userData.userData.name
                    menuViewModelUserDataUserDataName = menuViewModelUserDataUserData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.addCase.setOnClickListener(mCallback82);
            this.mboundView10.setOnClickListener(mCallback86);
            this.mboundView11.setOnClickListener(mCallback87);
            this.mboundView3.setOnClickListener(mCallback79);
            this.mboundView4.setOnClickListener(mCallback80);
            this.mboundView5.setOnClickListener(mCallback81);
            this.mboundView8.setOnClickListener(mCallback84);
            this.mboundView9.setOnClickListener(mCallback85);
            this.searchCase.setOnClickListener(mCallback83);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserLogin, menuViewModelUserDataUserDataName);
            te.app.evidence.base.ApplicationBinding.loadImage(this.vvNavigationDrawerImage, menuViewModelUserDataUserDataImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.toHome();
                }
                break;
            }
            case 9: {
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
            case 8: {
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
            case 6: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.toReporters();
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


                    menuViewModel.addCase();
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


                    menuViewModel.toUsers();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.toCategories();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // menuViewModel
                te.app.evidence.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {


                    menuViewModel.searchCase();
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


                    menuViewModel.toClients();
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
    flag mapping end*/
    //end
}