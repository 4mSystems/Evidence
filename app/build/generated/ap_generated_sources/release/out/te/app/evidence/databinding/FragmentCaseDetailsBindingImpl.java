package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCaseDetailsBindingImpl extends FragmentCaseDetailsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.client_data, 16);
        sViewsWithIds.put(R.id.client_data_container, 17);
        sViewsWithIds.put(R.id.tv_invetationNum_text, 18);
        sViewsWithIds.put(R.id.v1, 19);
        sViewsWithIds.put(R.id.court_text, 20);
        sViewsWithIds.put(R.id.v2, 21);
        sViewsWithIds.put(R.id.paper_type_text, 22);
        sViewsWithIds.put(R.id.v3, 23);
        sViewsWithIds.put(R.id.paper_number_text, 24);
        sViewsWithIds.put(R.id.v6, 25);
        sViewsWithIds.put(R.id.session_date_text, 26);
        sViewsWithIds.put(R.id.v7, 27);
        sViewsWithIds.put(R.id.status_text, 28);
        sViewsWithIds.put(R.id.client_cases, 29);
        sViewsWithIds.put(R.id.home_item1, 30);
        sViewsWithIds.put(R.id.home_item2, 31);
        sViewsWithIds.put(R.id.br1, 32);
        sViewsWithIds.put(R.id.home_item3, 33);
        sViewsWithIds.put(R.id.br4, 34);
        sViewsWithIds.put(R.id.progress_bar_home, 35);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.github.clans.fab.FloatingActionButton mboundView15;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCaseDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentCaseDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[32]
            , (androidx.constraintlayout.widget.Barrier) bindings[34]
            , (com.google.android.material.button.MaterialButton) bindings[29]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[20]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[30]
            , (com.google.android.material.card.MaterialCardView) bindings[31]
            , (com.google.android.material.card.MaterialCardView) bindings[33]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[24]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[22]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (android.widget.ProgressBar) bindings[35]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[26]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[28]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[18]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[27]
            );
        this.clientNotes.setTag(null);
        this.clients.setTag(null);
        this.courtValue.setTag(null);
        this.homeMohdrs.setTag(null);
        this.homeSession.setTag(null);
        this.homeUsers.setTag(null);
        this.khesm.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView15 = (com.github.clans.fab.FloatingActionButton) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView9 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.paperNumberValue.setTag(null);
        this.paperTypeValue.setTag(null);
        this.rcNotes.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.statusValue.setTag(null);
        this.tvInvetationNum.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback70 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback68 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback71 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback69 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((te.app.evidence.pages.cases.viewModels.CasesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.cases.viewModels.CasesViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.CasesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.CasesViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.caseDetails) {
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
        else if (fieldId == BR.clientsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = null;
        java.lang.String homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber = false;
        java.lang.String viewmodelCaseDetailsCaseDataInvetationNum = null;
        java.lang.String viewmodelCaseDetailsCaseDataCircleNum = null;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber = false;
        java.lang.String viewmodelCaseDetailsCaseDataInventationType = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt0ClientsAndroidDrawableCornerViewPrimaryYellowClientsAndroidDrawableCornerViewPrimaryDarkHome = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1 = false;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber = false;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1 = false;
        boolean viewmodelSelectedBtnInt0 = false;
        te.app.evidence.pages.clients.models.Category viewmodelCaseDetailsCaseDataCategory = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = null;
        java.lang.String viewmodelCaseDetailsCaseDataCourt = null;
        android.graphics.drawable.Drawable viewmodelSelectedBtnInt1KhesmAndroidDrawableCornerViewPrimaryYellowKhesmAndroidDrawableCornerViewPrimaryDarkHome = null;
        java.lang.String homeUsersAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = null;
        te.app.evidence.pages.cases.models.cases.Cases viewmodelCaseDetailsCaseData = null;
        java.lang.String viewmodelCaseDetailsCaseDataCategoryName = null;
        boolean viewmodelSelectedBtnInt1 = false;
        java.lang.String viewmodelCaseDetailsNumbersNotesNumber = null;
        te.app.evidence.pages.cases.adapters.InputTagClientsAdapter viewmodelClientsAdapter = null;
        java.lang.String viewmodelCaseDetailsNumbersAttachmentsNumber = null;
        te.app.evidence.pages.cases.models.caseDetails.CaseDetails viewmodelCaseDetails = null;
        java.lang.String viewmodelCaseDetailsCaseDataFirstSessionDate = null;
        te.app.evidence.pages.cases.models.caseDetails.CaseStatistics viewmodelCaseDetailsNumbers = null;
        java.lang.String viewmodelCaseDetailsNumbersSessionsNumber = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1 = false;
        te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;
        java.lang.String homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedBtn
                        viewmodelSelectedBtn = viewmodel.getSelectedBtn();
                    }


                    // read viewmodel.selectedBtn == 0
                    viewmodelSelectedBtnInt0 = (viewmodelSelectedBtn) == (0);
                    // read viewmodel.selectedBtn == 1
                    viewmodelSelectedBtnInt1 = (viewmodelSelectedBtn) == (1);
                if((dirtyFlags & 0x15L) != 0) {
                    if(viewmodelSelectedBtnInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x15L) != 0) {
                    if(viewmodelSelectedBtnInt1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt0ClientsAndroidDrawableCornerViewPrimaryYellowClientsAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clients.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clients.getContext(), R.drawable.corner_view_primary_dark_home)));
                    // read viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
                    viewmodelSelectedBtnInt1KhesmAndroidDrawableCornerViewPrimaryYellowKhesmAndroidDrawableCornerViewPrimaryDarkHome = ((viewmodelSelectedBtnInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(khesm.getContext(), R.drawable.corner_view_primary_yellow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(khesm.getContext(), R.drawable.corner_view_primary_dark_home)));
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.clientsAdapter
                        viewmodelClientsAdapter = viewmodel.getClientsAdapter();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.caseDetails
                        viewmodelCaseDetails = viewmodel.getCaseDetails();
                    }


                    if (viewmodelCaseDetails != null) {
                        // read viewmodel.caseDetails.caseData
                        viewmodelCaseDetailsCaseData = viewmodelCaseDetails.getCaseData();
                        // read viewmodel.caseDetails.numbers
                        viewmodelCaseDetailsNumbers = viewmodelCaseDetails.getNumbers();
                    }


                    if (viewmodelCaseDetailsCaseData != null) {
                        // read viewmodel.caseDetails.caseData.invetationNum
                        viewmodelCaseDetailsCaseDataInvetationNum = viewmodelCaseDetailsCaseData.getInvetationNum();
                        // read viewmodel.caseDetails.caseData.circleNum
                        viewmodelCaseDetailsCaseDataCircleNum = viewmodelCaseDetailsCaseData.getCircleNum();
                        // read viewmodel.caseDetails.caseData.inventationType
                        viewmodelCaseDetailsCaseDataInventationType = viewmodelCaseDetailsCaseData.getInventationType();
                        // read viewmodel.caseDetails.caseData.category
                        viewmodelCaseDetailsCaseDataCategory = viewmodelCaseDetailsCaseData.getCategory();
                        // read viewmodel.caseDetails.caseData.court
                        viewmodelCaseDetailsCaseDataCourt = viewmodelCaseDetailsCaseData.getCourt();
                        // read viewmodel.caseDetails.caseData.firstSessionDate
                        viewmodelCaseDetailsCaseDataFirstSessionDate = viewmodelCaseDetailsCaseData.getFirstSessionDate();
                    }
                    if (viewmodelCaseDetailsNumbers != null) {
                        // read viewmodel.caseDetails.numbers.notesNumber
                        viewmodelCaseDetailsNumbersNotesNumber = viewmodelCaseDetailsNumbers.getNotesNumber();
                        // read viewmodel.caseDetails.numbers.attachmentsNumber
                        viewmodelCaseDetailsNumbersAttachmentsNumber = viewmodelCaseDetailsNumbers.getAttachmentsNumber();
                        // read viewmodel.caseDetails.numbers.sessionsNumber
                        viewmodelCaseDetailsNumbersSessionsNumber = viewmodelCaseDetailsNumbers.getSessionsNumber();
                    }


                    if (viewmodelCaseDetailsCaseDataCategory != null) {
                        // read viewmodel.caseDetails.caseData.category.name
                        viewmodelCaseDetailsCaseDataCategoryName = viewmodelCaseDetailsCaseDataCategory.getName();
                    }
                    // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber)
                    textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersNotesNumber);
                    // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber)
                    textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersAttachmentsNumber);
                    // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber)
                    TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1 = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersSessionsNumber);


                    // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber)
                    TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber;
                    // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber)
                    TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber;
                    // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber)
                    textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber = !TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1;
                if((dirtyFlags & 0x13L) != 0) {
                    if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x13L) != 0) {
                    if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x13L) != 0) {
                    if(textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x13L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1) ? (viewmodelCaseDetailsNumbersNotesNumber) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = ((textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber) ? (viewmodelCaseDetailsNumbersSessionsNumber) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1) ? (viewmodelCaseDetailsNumbersAttachmentsNumber) : (""));


                // read @android:string/notes.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : "")
                homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = homeMohdrs.getResources().getString(R.string.notes).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString);
                // read @android:string/sessions.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : "")
                homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = homeSession.getResources().getString(R.string.sessions).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString);
                // read @android:string/attachments.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : "")
                homeUsersAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = homeUsers.getResources().getString(R.string.attachments).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.clientNotes.setOnClickListener(mCallback67);
            this.clients.setOnClickListener(mCallback69);
            this.khesm.setOnClickListener(mCallback70);
            this.mboundView15.setOnClickListener(mCallback71);
            this.mboundView9.setOnClickListener(mCallback68);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clients, viewmodelSelectedBtnInt0ClientsAndroidDrawableCornerViewPrimaryYellowClientsAndroidDrawableCornerViewPrimaryDarkHome);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.khesm, viewmodelSelectedBtnInt1KhesmAndroidDrawableCornerViewPrimaryYellowKhesmAndroidDrawableCornerViewPrimaryDarkHome);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.courtValue, viewmodelCaseDetailsCaseDataInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeMohdrs, homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeSession, homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeUsers, homeUsersAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperNumberValue, viewmodelCaseDetailsCaseDataCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperTypeValue, viewmodelCaseDetailsCaseDataCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, viewmodelCaseDetailsCaseDataFirstSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, viewmodelCaseDetailsCaseDataCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInvetationNum, viewmodelCaseDetailsCaseDataInvetationNum);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.getItemsV2Binding(this.rcNotes, viewmodelClientsAdapter, "2", "3");
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
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.EDIT_CASE);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.khesm();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.CASE_SESSIONS);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.ADD_CLIENTS);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.clients();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.caseDetails
        flag 2 (0x3L): viewmodel.selectedBtn
        flag 3 (0x4L): viewmodel.clientsAdapter
        flag 4 (0x5L): null
        flag 5 (0x6L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
        flag 6 (0x7L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
        flag 7 (0x8L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
        flag 8 (0x9L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
        flag 9 (0xaL): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 10 (0xbL): viewmodel.selectedBtn == 0 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 11 (0xcL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
        flag 12 (0xdL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
        flag 13 (0xeL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
        flag 14 (0xfL): viewmodel.selectedBtn == 1 ? @android:drawable/corner_view_primary_yellow : @android:drawable/corner_view_primary_dark_home
    flag mapping end*/
    //end
}