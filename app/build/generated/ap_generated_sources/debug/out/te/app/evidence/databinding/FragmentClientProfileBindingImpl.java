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
        sViewsWithIds.put(R.id.client_data, 11);
        sViewsWithIds.put(R.id.client_data_container, 12);
        sViewsWithIds.put(R.id.client_name_text, 13);
        sViewsWithIds.put(R.id.v6, 14);
        sViewsWithIds.put(R.id.unit_text, 15);
        sViewsWithIds.put(R.id.v2, 16);
        sViewsWithIds.put(R.id.client_type_text, 17);
        sViewsWithIds.put(R.id.v5, 18);
        sViewsWithIds.put(R.id.client_address_text, 19);
        sViewsWithIds.put(R.id.v3, 20);
        sViewsWithIds.put(R.id.client_note_text, 21);
        sViewsWithIds.put(R.id.v4, 22);
        sViewsWithIds.put(R.id.br4, 23);
        sViewsWithIds.put(R.id.input_search, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.github.clans.fab.FloatingActionButton mboundView10;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClientProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentClientProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[23]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomEditText) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[14]
            );
        this.clientAddressValue.setTag(null);
        this.clientCases.setTag(null);
        this.clientNameValue.setTag(null);
        this.clientNoteValue.setTag(null);
        this.clientNotes.setTag(null);
        this.clientTypeValue.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.github.clans.fab.FloatingActionButton) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView9 = (androidx.recyclerview.widget.RecyclerView) bindings[9];
        this.mboundView9.setTag(null);
        this.rcNotes.setTag(null);
        this.unitValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback24 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback25 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else if (fieldId == BR.clients) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.selectedBtn) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.notesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.clientCasesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        int viewmodelSelectedBtnInt1ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelClientsClientUnit = null;
        te.app.evidence.pages.clients.adapters.ClientCasesAdapter viewmodelClientCasesAdapter = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean viewmodelSelectedBtnInt0 = false;
        java.lang.String viewmodelClientsType = null;
        java.lang.String viewmodelClientsNotes = null;
        boolean viewmodelSelectedBtnInt1 = false;
        te.app.evidence.pages.notes.NotesAdapter viewmodelNotesAdapter = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String viewmodelClientsClientName = null;
        te.app.evidence.pages.clients.viewModels.ClientProfileViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedBtn
                        viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                    }


                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
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
            if ((dirtyFlags & 0x23L) != 0) {

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
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.clientCasesAdapter
                        viewmodelClientCasesAdapter = viewmodel.getClientCasesAdapter();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.notesAdapter
                        viewmodelNotesAdapter = viewmodel.getNotesAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientAddressValue, viewmodelClientsClientAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNameValue, viewmodelClientsClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientNoteValue, viewmodelClientsNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientTypeValue, viewmodelClientsType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unitValue, viewmodelClientsClientUnit);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientCases, viewmodelSelectedBtnInt1ClientCasesAndroidDrawableCornerViewPrimaryYellowClientCasesAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clientNotes, viewmodelSelectedBtnInt0ClientNotesAndroidDrawableCornerViewPrimaryYellowClientNotesAndroidDrawableCornerViewPrimaryDarkHome);
            this.mboundView10.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewmodelSelectedBtnInt1ViewVISIBLEViewGONE);
            this.rcNotes.setVisibility(viewmodelSelectedBtnInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.clientCases.setOnClickListener(mCallback24);
            this.clientNotes.setOnClickListener(mCallback23);
            this.mboundView10.setOnClickListener(mCallback25);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.mboundView9, viewmodelClientCasesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcNotes, viewmodelNotesAdapter, "1", "1");
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
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.clients
        flag 2 (0x3L): viewmodel.selectedBtn
        flag 3 (0x4L): viewmodel.notesAdapter
        flag 4 (0x5L): viewmodel.clientCasesAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.selectedBtn == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.selectedBtn == 1 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 11 (0xcL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 12 (0xdL): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 13 (0xeL): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
    flag mapping end*/
    //end
}