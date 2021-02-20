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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 9);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 10);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 11);
        sViewsWithIds.put(R.id.fl_home_container, 12);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 13);
        sViewsWithIds.put(R.id.layout_cases_header, 14);
        sViewsWithIds.put(R.id.icon_down_case, 15);
        sViewsWithIds.put(R.id.tv_case, 16);
        sViewsWithIds.put(R.id.expansionLayoutCases, 17);
        sViewsWithIds.put(R.id.search_case, 18);
        sViewsWithIds.put(R.id.layout_reports_header, 19);
        sViewsWithIds.put(R.id.icon_down_qu, 20);
        sViewsWithIds.put(R.id.tv_username, 21);
        sViewsWithIds.put(R.id.expansionLayoutReports, 22);
        sViewsWithIds.put(R.id.daily_reports, 23);
        sViewsWithIds.put(R.id.monthly_reports, 24);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView6;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView7;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[23]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[9]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[17]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[14]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[19]
            , (android.widget.LinearLayout) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[24]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[18]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[21]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.addCase.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback37 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback42 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback40 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback38 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback41 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
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

            this.addCase.setOnClickListener(mCallback39);
            this.mboundView3.setOnClickListener(mCallback37);
            this.mboundView4.setOnClickListener(mCallback38);
            this.mboundView6.setOnClickListener(mCallback40);
            this.mboundView7.setOnClickListener(mCallback41);
            this.mboundView8.setOnClickListener(mCallback42);
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
            case 3: {
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
            case 1: {
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
            case 6: {
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
            case 4: {
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
            case 2: {
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
            case 5: {
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