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
        sViewsWithIds.put(R.id.client_data, 17);
        sViewsWithIds.put(R.id.client_data_container, 18);
        sViewsWithIds.put(R.id.tv_invetationNum_text, 19);
        sViewsWithIds.put(R.id.v1, 20);
        sViewsWithIds.put(R.id.court_text, 21);
        sViewsWithIds.put(R.id.v2, 22);
        sViewsWithIds.put(R.id.paper_type_text, 23);
        sViewsWithIds.put(R.id.v3, 24);
        sViewsWithIds.put(R.id.paper_number_text, 25);
        sViewsWithIds.put(R.id.v6, 26);
        sViewsWithIds.put(R.id.session_date_text, 27);
        sViewsWithIds.put(R.id.v7, 28);
        sViewsWithIds.put(R.id.status_text, 29);
        sViewsWithIds.put(R.id.client_cases, 30);
        sViewsWithIds.put(R.id.view_id, 31);
        sViewsWithIds.put(R.id.home_item2, 32);
        sViewsWithIds.put(R.id.view_mohdr, 33);
        sViewsWithIds.put(R.id.view_khesm, 34);
        sViewsWithIds.put(R.id.view_clients, 35);
        sViewsWithIds.put(R.id.view_attachments, 36);
        sViewsWithIds.put(R.id.flow, 37);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCaseDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private FragmentCaseDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[30]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[37]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[32]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[25]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[23]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[27]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[29]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[19]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[28]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[36]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[35]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[31]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[34]
            , (com.ramijemli.percentagechartview.PercentageChartView) bindings[33]
            );
        this.clientNotes.setTag(null);
        this.courtValue.setTag(null);
        this.homeCases.setTag(null);
        this.homeItem1.setTag(null);
        this.homeItem3.setTag(null);
        this.homeItem4.setTag(null);
        this.homeItem5.setTag(null);
        this.homeKhems.setTag(null);
        this.homeMohdrs.setTag(null);
        this.homeSession.setTag(null);
        this.homeUsers.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.paperNumberValue.setTag(null);
        this.paperTypeValue.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.statusValue.setTag(null);
        this.tvInvetationNum.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new te.app.evidence.generated.callback.OnClickListener(this, 4);
        mCallback37 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback40 = new te.app.evidence.generated.callback.OnClickListener(this, 5);
        mCallback38 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback36 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewmodelCaseDetailsNumbersKhesm = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = null;
        java.lang.String homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber = false;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber = false;
        java.lang.String homeCasesAndroidStringClientsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1 = false;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber = false;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString = null;
        java.lang.String homeUsersAndroidStringOpponentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString = null;
        te.app.evidence.pages.cases.models.cases.Cases viewmodelCaseDetailsCaseData = null;
        java.lang.String viewmodelCaseDetailsNumbersNotesNumber = null;
        te.app.evidence.pages.cases.models.caseDetails.CaseDetails viewmodelCaseDetails = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1 = false;
        te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;
        java.lang.String homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersClients = false;
        java.lang.String viewmodelCaseDetailsCaseDataInvetationNum = null;
        java.lang.String viewmodelCaseDetailsCaseDataCircleNum = null;
        java.lang.String viewmodelCaseDetailsCaseDataInventationType = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersClients1 = false;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1 = false;
        te.app.evidence.pages.clients.models.Category viewmodelCaseDetailsCaseDataCategory = null;
        java.lang.String textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = null;
        java.lang.String viewmodelCaseDetailsCaseDataCourt = null;
        boolean textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm = false;
        java.lang.String viewmodelCaseDetailsNumbersClients = null;
        java.lang.String viewmodelCaseDetailsCaseDataCategoryName = null;
        boolean TextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm1 = false;
        java.lang.String homeKhemsAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = null;
        java.lang.String viewmodelCaseDetailsNumbersAttachmentsNumber = null;
        java.lang.String viewmodelCaseDetailsCaseDataFirstSessionDate = null;
        te.app.evidence.pages.cases.models.caseDetails.CaseStatistics viewmodelCaseDetailsNumbers = null;
        java.lang.String viewmodelCaseDetailsNumbersSessionsNumber = null;

        if ((dirtyFlags & 0x7L) != 0) {



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
                    // read viewmodel.caseDetails.numbers.khesm
                    viewmodelCaseDetailsNumbersKhesm = viewmodelCaseDetailsNumbers.getKhesm();
                    // read viewmodel.caseDetails.numbers.notesNumber
                    viewmodelCaseDetailsNumbersNotesNumber = viewmodelCaseDetailsNumbers.getNotesNumber();
                    // read viewmodel.caseDetails.numbers.clients
                    viewmodelCaseDetailsNumbersClients = viewmodelCaseDetailsNumbers.getClients();
                    // read viewmodel.caseDetails.numbers.attachmentsNumber
                    viewmodelCaseDetailsNumbersAttachmentsNumber = viewmodelCaseDetailsNumbers.getAttachmentsNumber();
                    // read viewmodel.caseDetails.numbers.sessionsNumber
                    viewmodelCaseDetailsNumbersSessionsNumber = viewmodelCaseDetailsNumbers.getSessionsNumber();
                }


                if (viewmodelCaseDetailsCaseDataCategory != null) {
                    // read viewmodel.caseDetails.caseData.category.name
                    viewmodelCaseDetailsCaseDataCategoryName = viewmodelCaseDetailsCaseDataCategory.getName();
                }
                // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm)
                textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersKhesm);
                // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber)
                textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersNotesNumber);
                // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients)
                textUtilsIsEmptyViewmodelCaseDetailsNumbersClients = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersClients);
                // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber)
                textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersAttachmentsNumber);
                // read TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber)
                textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber = android.text.TextUtils.isEmpty(viewmodelCaseDetailsNumbersSessionsNumber);


                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm)
                TextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm;
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber)
                TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber;
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients)
                TextUtilsIsEmptyViewmodelCaseDetailsNumbersClients1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersClients;
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber)
                TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber;
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber)
                TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1 = !textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber;
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm1) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersClients1) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x7L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumber1) ? (viewmodelCaseDetailsNumbersSessionsNumber) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients) ? viewmodel.caseDetails.numbers.clients : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersClients1) ? (viewmodelCaseDetailsNumbersClients) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumber1) ? (viewmodelCaseDetailsNumbersNotesNumber) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm) ? viewmodel.caseDetails.numbers.khesm : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesm1) ? (viewmodelCaseDetailsNumbersKhesm) : (""));
                // read !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
                textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = ((TextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumber1) ? (viewmodelCaseDetailsNumbersAttachmentsNumber) : (""));


                // read @android:string/sessions.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : "")
                homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString = homeSession.getResources().getString(R.string.sessions).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString);
                // read @android:string/clients.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients) ? viewmodel.caseDetails.numbers.clients : "")
                homeCasesAndroidStringClientsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString = homeCases.getResources().getString(R.string.clients).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString);
                // read @android:string/notes.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : "")
                homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString = homeMohdrs.getResources().getString(R.string.notes).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString);
                // read @android:string/opponents.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm) ? viewmodel.caseDetails.numbers.khesm : "")
                homeUsersAndroidStringOpponentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString = homeUsers.getResources().getString(R.string.opponents).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString);
                // read @android:string/attachments.concat("\n").concat("#").concat(!TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : "")
                homeKhemsAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString = homeKhems.getResources().getString(R.string.attachments).concat("\n").concat("#").concat(textUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clientNotes.setOnClickListener(mCallback36);
            this.homeItem1.setOnClickListener(mCallback37);
            this.homeItem3.setOnClickListener(mCallback38);
            this.homeItem4.setOnClickListener(mCallback39);
            this.homeItem5.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.courtValue, viewmodelCaseDetailsCaseDataInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeCases, homeCasesAndroidStringClientsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersClientsViewmodelCaseDetailsNumbersClientsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeKhems, homeKhemsAndroidStringAttachmentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersAttachmentsNumberViewmodelCaseDetailsNumbersAttachmentsNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeMohdrs, homeMohdrsAndroidStringNotesConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersNotesNumberViewmodelCaseDetailsNumbersNotesNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeSession, homeSessionAndroidStringSessionsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersSessionsNumberViewmodelCaseDetailsNumbersSessionsNumberJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.homeUsers, homeUsersAndroidStringOpponentsConcatJavaLangStringNConcatJavaLangStringConcatTextUtilsIsEmptyViewmodelCaseDetailsNumbersKhesmViewmodelCaseDetailsNumbersKhesmJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperNumberValue, viewmodelCaseDetailsCaseDataCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperTypeValue, viewmodelCaseDetailsCaseDataCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, viewmodelCaseDetailsCaseDataFirstSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, viewmodelCaseDetailsCaseDataCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInvetationNum, viewmodelCaseDetailsCaseDataInvetationNum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.CasesViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.CLIENTS);
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




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.CASE_ATTACHMENTS);
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




                    viewmodel.buttonActions(te.app.evidence.utils.Constants.KHESM);
                }
                break;
            }
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.caseDetails
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
        flag 4 (0x5L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.sessionsNumber) ? viewmodel.caseDetails.numbers.sessionsNumber : ""
        flag 5 (0x6L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients) ? viewmodel.caseDetails.numbers.clients : ""
        flag 6 (0x7L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.clients) ? viewmodel.caseDetails.numbers.clients : ""
        flag 7 (0x8L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
        flag 8 (0x9L): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.notesNumber) ? viewmodel.caseDetails.numbers.notesNumber : ""
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm) ? viewmodel.caseDetails.numbers.khesm : ""
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.khesm) ? viewmodel.caseDetails.numbers.khesm : ""
        flag 11 (0xcL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
        flag 12 (0xdL): !TextUtils.isEmpty(viewmodel.caseDetails.numbers.attachmentsNumber) ? viewmodel.caseDetails.numbers.attachmentsNumber : ""
    flag mapping end*/
    //end
}