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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 5);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 6);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 7);
        sViewsWithIds.put(R.id.fl_home_container, 8);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback24 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
        te.app.evidence.pages.auth.models.UserData menuViewModelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData menuViewModelUserData = null;
        java.lang.String menuViewModelUserDataUserDataName = null;
        java.lang.String menuViewModelUserDataUserDataImage = null;

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
                    // read menuViewModel.userData.userData.name
                    menuViewModelUserDataUserDataName = menuViewModelUserDataUserData.getName();
                    // read menuViewModel.userData.userData.image
                    menuViewModelUserDataUserDataImage = menuViewModelUserDataUserData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback23);
            this.mboundView4.setOnClickListener(mCallback24);
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


                    menuViewModel.toUsers();
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