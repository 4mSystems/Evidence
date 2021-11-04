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
        sViewsWithIds.put(R.id.toolbar_layout, 12);
        sViewsWithIds.put(R.id.client_data, 13);
        sViewsWithIds.put(R.id.client_data_container, 14);
        sViewsWithIds.put(R.id.client_name_text, 15);
        sViewsWithIds.put(R.id.v6, 16);
        sViewsWithIds.put(R.id.unit_text, 17);
        sViewsWithIds.put(R.id.v2, 18);
        sViewsWithIds.put(R.id.client_type_text, 19);
        sViewsWithIds.put(R.id.v5, 20);
        sViewsWithIds.put(R.id.client_address_text, 21);
        sViewsWithIds.put(R.id.v3, 22);
        sViewsWithIds.put(R.id.client_note_text, 23);
        sViewsWithIds.put(R.id.v4, 24);
        sViewsWithIds.put(R.id.br4, 25);
        sViewsWithIds.put(R.id.input_search, 26);
        sViewsWithIds.put(R.id.progress_bar_home, 27);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView11;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClientProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentClientProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Barrier) bindings[25]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[23]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[26]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            , (android.widget.ProgressBar) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[16]
            );
        this.clientAddressValue.setTag(null);
        this.clientCases.setTag(null);
        this.clientNameValue.setTag(null);
        this.clientNoteValue.setTag(null);
        this.clientNotes.setTag(null);
        this.clientTypeValue.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11];
        this.mboundView11.setTag(null);
        this.progress.setTag(null);
        this.rcClientCases.setTag(null);
        this.rcClientNotes.setTag(null);
        this.unitValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback40 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback41 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.clients.viewModels.ClientProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewmodelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.clients.viewModels.ClientProfileViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.clients) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.selectedBtn) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.notesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.clientCasesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.String viewmodelClientsClientAddress = null;
        int viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.clients.models.Clients viewmodelClients = null;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        int viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelClientsClientUnit = null;
        te.app.evidence.pages.clients.adapters.ClientCasesAdapter viewmodelClientCasesAdapter = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        boolean viewmodelSelectedBtnInt0 = false;
        java.lang.String viewmodelClientsType = null;
        java.lang.String viewmodelClientsNotes = null;
        boolean viewmodelSelectedBtnInt1 = false;
        te.app.evidence.pages.clients.notes.NotesAdapter viewmodelNotesAdapter = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String viewmodelClientsClientName = null;
        te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x4aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedBtn
                        viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                    }


                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                if((dirtyFlags & 0x4aL) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x4aL) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt0ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientNotes.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientNotes.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
                    viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = ((viewmodelSelectedBtnInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientCases.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clientCases.getContext(), R.drawable.corner_view_primary_dark_home)));
            }
            if ((dirtyFlags & 0x46L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.clients
                        viewmodelClients = viewmodel.getClients();
                    }


                    if (viewmodelClients != null) {
                        // read viewmodel.clients.clientAddress
                        viewmodelClientsClientAddress = viewmodelClients.getClientAddress();
                        // read viewmodel.clients.clientUnit
                        viewmodelClientsClientUnit = viewmodelClients.getClientUnit();
                        // read viewmodel.clients.type
                        viewmodelClientsType = viewmodelClients.getType();
                        // read viewmodel.clients.notes
                        viewmodelClientsNotes = viewmodelClients.getNotes();
                        // read viewmodel.clients.clientName
                        viewmodelClientsClientName = viewmodelClients.getClientName();
                    }
            }
            if ((dirtyFlags & 0x43L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x43L) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.clientCasesAdapter
                        viewmodelClientCasesAdapter = viewmodel.getClientCasesAdapter();
                    }
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.notesAdapter
                        viewmodelNotesAdapter = viewmodel.getNotesAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientAddressValue, viewmodelClientsClientAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNameValue, viewmodelClientsClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNoteValue, viewmodelClientsNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientTypeValue, viewmodelClientsType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unitValue, viewmodelClientsClientUnit);
        }
        if ((dirtyFlags & 0x4aL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientCases, viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientNotes, viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome);
            this.mboundView11.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
            this.rcClientCases.setVisibility(viewmodelSelectedBtnInt1ViewVISIBLEViewGONE);
            this.rcClientNotes.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.clientCases.setOnClickListener(mCallback40);
            this.clientNotes.setOnClickListener(mCallback39);
            this.mboundView11.setOnClickListener(mCallback41);
        }
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcClientCases, viewmodelClientCasesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcClientNotes, viewmodelNotesAdapter, "1", "1");
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
                te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.notes();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.cases();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toNewNote();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.clients
        flag 3 (0x4L): viewmodel.selectedBtn
        flag 4 (0x5L): viewmodel.notesAdapter
        flag 5 (0x6L): viewmodel.clientCasesAdapter
        flag 6 (0x7L): null
        flag 7 (0x8L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 12 (0xdL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 13 (0xeL): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 16 (0x11L): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
    flag mapping end*/
    //end
}