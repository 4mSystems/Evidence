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
        sViewsWithIds.put(R.id.home_item1, 4);
        sViewsWithIds.put(R.id.home_session, 5);
        sViewsWithIds.put(R.id.home_item2, 6);
        sViewsWithIds.put(R.id.home_mohdrs, 7);
        sViewsWithIds.put(R.id.br1, 8);
        sViewsWithIds.put(R.id.home_item3, 9);
        sViewsWithIds.put(R.id.home_users, 10);
        sViewsWithIds.put(R.id.home_item4, 11);
        sViewsWithIds.put(R.id.home_cases, 12);
        sViewsWithIds.put(R.id.br2, 13);
        sViewsWithIds.put(R.id.br3, 14);
        sViewsWithIds.put(R.id.input_email, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[13]
            , (androidx.constraintlayout.widget.Barrier) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextMohdareen.setTag(null);
        this.nextSessions.setTag(null);
        this.previousSessions.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback10 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback9 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
        else if (fieldId == BR.selectedBtn) {
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
        int viewmodelSelectedBtn = 0;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean viewmodelSelectedBtnInt1 = false;
        boolean viewmodelSelectedBtnInt2 = false;
        boolean viewmodelSelectedBtnInt0 = false;
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.selectedBtn
                    viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                }


                // read viewmodel.selectedBtn == 1
                viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                // read viewmodel.selectedBtn == 2
                viewmodelSelectedBtnInt2 = (viewmodelSelectedBtn) == (2);
                // read viewmodel.selectedBtn == 0
                viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedBtnInt1) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedBtnInt2) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedBtnInt0) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(previousSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
                // read viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextMohdareen.getContext(), R.drawable.corner_view_primary_dark_home)));
                // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(nextSessions.getContext(), R.drawable.corner_view_primary_dark_home)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextMohdareen, viewmodelSelectedBtnInt2NextMohdareenAndroidDrawableCornerViewPrimaryYellowNextMohdareenAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.nextSessions, viewmodelSelectedBtnInt0NextSessionsAndroidDrawableCornerViewPrimaryYellowNextSessionsAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.previousSessions, viewmodelSelectedBtnInt1PreviousSessionsAndroidDrawableCornerViewPrimaryYellowPreviousSessionsAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.nextMohdareen.setOnClickListener(mCallback11);
            this.nextSessions.setOnClickListener(mCallback9);
            this.previousSessions.setOnClickListener(mCallback10);
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
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.nextMohdars();
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


                    viewmodel.previousSessions();
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


                    viewmodel.nextSessions();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.selectedBtn
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 4 (0x5L): viewmodel.selectedBtn == 2 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 5 (0x6L): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 6 (0x7L): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 7 (0x8L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 8 (0x9L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
    flag mapping end*/
    //end
}