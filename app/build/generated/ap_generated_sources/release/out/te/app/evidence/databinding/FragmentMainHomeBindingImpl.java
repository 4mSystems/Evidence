package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainHomeBindingImpl extends FragmentMainHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_main_img, 5);
        sViewsWithIds.put(R.id.t_points, 6);
        sViewsWithIds.put(R.id.flow3, 7);
        sViewsWithIds.put(R.id.view, 8);
        sViewsWithIds.put(R.id.welcome, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentMainHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.helper.widget.Flow) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (android.view.View) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            );
        this.icUserImg.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.tPointsValue.setTag(null);
        this.tvUsername.setTag(null);
        setRootTag(root);
        // listeners
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
        else if (fieldId == BR.homeMainAdapter) {
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
        te.app.evidence.pages.auth.models.UserData viewmodelUserDataUserData = null;
        te.app.evidence.pages.auth.models.UserMainData viewmodelUserData = null;
        java.lang.String viewmodelUserDataUserDataMyPoints = null;
        java.lang.String viewmodelUserDataUserDataImage = null;
        java.lang.String viewmodelUserDataUserDataName = null;
        te.app.evidence.pages.home.adapters.HomeMainAdapter viewmodelHomeMainAdapter = null;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.userData
                        viewmodelUserDataUserData = viewmodelUserData.getUserData();
                    }


                    if (viewmodelUserDataUserData != null) {
                        // read viewmodel.userData.userData.my_points
                        viewmodelUserDataUserDataMyPoints = viewmodelUserDataUserData.getMy_points();
                        // read viewmodel.userData.userData.image
                        viewmodelUserDataUserDataImage = viewmodelUserDataUserData.getImage();
                        // read viewmodel.userData.userData.name
                        viewmodelUserDataUserDataName = viewmodelUserDataUserData.getName();
                    }
            }

                if (viewmodel != null) {
                    // read viewmodel.homeMainAdapter
                    viewmodelHomeMainAdapter = viewmodel.getHomeMainAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.loadMarketImage(this.icUserImg, viewmodelUserDataUserDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tPointsValue, viewmodelUserDataUserDataMyPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, viewmodelUserDataUserDataName);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.mboundView4, viewmodelHomeMainAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.homeMainAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}