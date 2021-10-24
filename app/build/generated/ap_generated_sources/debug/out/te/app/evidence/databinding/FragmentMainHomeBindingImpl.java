package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainHomeBindingImpl extends FragmentMainHomeBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_main_img, 11);
        sViewsWithIds.put(R.id.t_points, 12);
        sViewsWithIds.put(R.id.flow3, 13);
        sViewsWithIds.put(R.id.view, 14);
        sViewsWithIds.put(R.id.welcome, 15);
        sViewsWithIds.put(R.id.ic_office, 16);
        sViewsWithIds.put(R.id.tv_office, 17);
        sViewsWithIds.put(R.id.ic_court_services, 18);
        sViewsWithIds.put(R.id.tv_service, 19);
        sViewsWithIds.put(R.id.ic_locations, 20);
        sViewsWithIds.put(R.id.tv_locations, 21);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton mboundView10;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentMainHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (android.view.View) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            );
        this.cardLocations.setTag(null);
        this.cardOffice.setTag(null);
        this.cardServices.setTag(null);
        this.fbLocations.setTag(null);
        this.fbOffice.setTag(null);
        this.fbServices.setTag(null);
        this.icUserImg.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[10];
        this.mboundView10.setTag(null);
        this.tPointsValue.setTag(null);
        this.tvUsername.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback45 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback43 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback42 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback40 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback44 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback41 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewmodelUserDataUserDataImage = null;
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        java.lang.String viewmodelUserDataUserDataMyPoints = null;
        java.lang.String viewmodelUserDataUserDataName = null;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userData
                    viewmodelUserData = viewmodel.userData;
                }


                if (viewmodelUserData != null) {
                    // read viewmodel.userData.userData
                    viewmodelUserDataUserData = viewmodelUserData.getUserData();
                }


                if (viewmodelUserDataUserData != null) {
                    // read viewmodel.userData.userData.image
                    viewmodelUserDataUserDataImage = viewmodelUserDataUserData.getImage();
                    // read viewmodel.userData.userData.my_points
                    viewmodelUserDataUserDataMyPoints = viewmodelUserDataUserData.getMy_points();
                    // read viewmodel.userData.userData.name
                    viewmodelUserDataUserDataName = viewmodelUserDataUserData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cardLocations.setOnClickListener(mCallback43);
            this.cardOffice.setOnClickListener(mCallback39);
            this.cardServices.setOnClickListener(mCallback41);
            this.fbLocations.setOnClickListener(mCallback44);
            this.fbOffice.setOnClickListener(mCallback40);
            this.fbServices.setOnClickListener(mCallback42);
            this.mboundView10.setOnClickListener(mCallback45);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.loadMarketImage(this.icUserImg, viewmodelUserDataUserDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tPointsValue, viewmodelUserDataUserDataMyPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, viewmodelUserDataUserDataName);
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
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.HOME);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SUPPORT);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.LOCATIONS);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SERVICES);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.HOME);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.LOCATIONS);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SERVICES);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}