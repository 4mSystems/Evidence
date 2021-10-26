package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsBottomSheetBindingImpl extends SettingsBottomSheetBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v_bottom, 8);
        sViewsWithIds.put(R.id.v_about, 9);
        sViewsWithIds.put(R.id.v_terms, 10);
        sViewsWithIds.put(R.id.v_privacy, 11);
        sViewsWithIds.put(R.id.v_contact, 12);
        sViewsWithIds.put(R.id.v_support, 13);
        sViewsWithIds.put(R.id.v_share, 14);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.view.View.OnClickListener mCallback112;
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    @Nullable
    private final android.view.View.OnClickListener mCallback115;
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback111;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private SettingsBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[10]
            );
        this.about.setTag(null);
        this.contact.setTag(null);
        this.privacy.setTag(null);
        this.rateApp.setTag(null);
        this.share.setTag(null);
        this.sheet.setTag(null);
        this.support.setTag(null);
        this.terms.setTag(null);
        setRootTag(root);
        // listeners
        mCallback116 = new te.app.evidence.generated.callback.OnClickListener(this, 6);
        mCallback114 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback112 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback117 = new te.app.evidence.generated.callback.OnClickListener(this, 7);
        mCallback115 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback113 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback111 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
        te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.about.setOnClickListener(mCallback111);
            this.contact.setOnClickListener(mCallback114);
            this.privacy.setOnClickListener(mCallback113);
            this.rateApp.setOnClickListener(mCallback117);
            this.share.setOnClickListener(mCallback116);
            this.support.setOnClickListener(mCallback115);
            this.terms.setOnClickListener(mCallback112);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SHARE_BAR);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.CONTACT);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.TERMS);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.RATE);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.SUPPORT);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.PRIVACY);
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




                    viewmodel.buttonAction(te.app.evidence.utils.Constants.ABOUT);
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