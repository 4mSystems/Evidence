package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentClientProfileBindingImpl extends FragmentClientProfileBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.client_data, 3);
        sViewsWithIds.put(R.id.client_data_container, 4);
        sViewsWithIds.put(R.id.client_name_text, 5);
        sViewsWithIds.put(R.id.client_name_value, 6);
        sViewsWithIds.put(R.id.v6, 7);
        sViewsWithIds.put(R.id.unit_text, 8);
        sViewsWithIds.put(R.id.unit_value, 9);
        sViewsWithIds.put(R.id.v2, 10);
        sViewsWithIds.put(R.id.client_type_text, 11);
        sViewsWithIds.put(R.id.client_type_value, 12);
        sViewsWithIds.put(R.id.v5, 13);
        sViewsWithIds.put(R.id.client_address_text, 14);
        sViewsWithIds.put(R.id.client_address_value, 15);
        sViewsWithIds.put(R.id.v3, 16);
        sViewsWithIds.put(R.id.client_note_text, 17);
        sViewsWithIds.put(R.id.client_note_value, 18);
        sViewsWithIds.put(R.id.v4, 19);
        sViewsWithIds.put(R.id.br4, 20);
        sViewsWithIds.put(R.id.input_search, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClientProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentClientProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[20]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[18]
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[7]
            );
        this.clientCases.setTag(null);
        this.clientNotes.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback18 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.clients.viewModels.ClientProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.clients.viewModels.ClientProfileViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.clients.viewModels.ClientProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.clients.viewModels.ClientProfileViewModel Viewmodel, int fieldId) {
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
        boolean viewmodelSelectedBtnInt1 = false;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean viewmodelSelectedBtnInt0 = false;
        te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.selectedBtn
                    viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                }


                // read viewmodel.selectedBtn == 1
                viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
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
                if(viewmodelSelectedBtnInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientCases.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientCases.getContext(), R.drawable.corner_view_primary_dark_home)));
                // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientNotes.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientNotes.getContext(), R.drawable.corner_view_primary_dark_home)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientCases, viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientNotes, viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clientCases.setOnClickListener(mCallback19);
            this.clientNotes.setOnClickListener(mCallback18);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;



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
                te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;



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
        flag 3 (0x4L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 4 (0x5L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 5 (0x6L): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 6 (0x7L): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
    flag mapping end*/
    //end
}