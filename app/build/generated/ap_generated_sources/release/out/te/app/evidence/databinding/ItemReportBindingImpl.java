package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemReportBindingImpl extends ItemReportBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.client_text, 9);
        sViewsWithIds.put(R.id.v_client, 10);
        sViewsWithIds.put(R.id.opponents_text, 11);
        sViewsWithIds.put(R.id.v_opponents, 12);
        sViewsWithIds.put(R.id.tv_invetationNum_text, 13);
        sViewsWithIds.put(R.id.v1, 14);
        sViewsWithIds.put(R.id.court_text, 15);
        sViewsWithIds.put(R.id.v2, 16);
        sViewsWithIds.put(R.id.paper_type_text, 17);
        sViewsWithIds.put(R.id.v3, 18);
        sViewsWithIds.put(R.id.paper_number_text, 19);
        sViewsWithIds.put(R.id.v6, 20);
        sViewsWithIds.put(R.id.session_date_text, 21);
        sViewsWithIds.put(R.id.v7, 22);
        sViewsWithIds.put(R.id.status_text, 23);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemReportBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ItemReportBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[23]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[13]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[12]
            );
        this.clientValue.setTag(null);
        this.courtValue.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.opponentsValue.setTag(null);
        this.paperNumberValue.setTag(null);
        this.paperTypeValue.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.statusValue.setTag(null);
        this.tvInvetationNum.setTag(null);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.evidence.pages.reports.viewModels.ReportItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.reports.viewModels.ReportItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.evidence.pages.reports.viewModels.ReportItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.reports.viewModels.ReportItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.reportsData) {
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
        java.lang.String itemViewModelReportsDataPrintnotesNotes = null;
        java.lang.String itemViewModelReportsDataCasesInvetationNum = null;
        te.app.evidence.pages.reports.models.ReportsData itemViewModelReportsData = null;
        te.app.evidence.pages.cases.models.cases.Cases itemViewModelReportsDataCases = null;
        te.app.evidence.pages.reports.viewModels.ReportItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelReportsDataCasesFirstSessionDate = null;
        java.lang.String itemViewModelReportsDataCasesCircleNum = null;
        java.lang.String itemViewModelReportsDataCasesInventationType = null;
        java.lang.String itemViewModelReportsDataCasesCourt = null;
        te.app.evidence.pages.clients.notes.models.Notes itemViewModelReportsDataPrintnotes = null;
        java.lang.String itemViewModelReportsDataClient = null;
        java.lang.String itemViewModelReportsDataKhesm = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.reportsData
                    itemViewModelReportsData = itemViewModel.getReportsData();
                }


                if (itemViewModelReportsData != null) {
                    // read itemViewModel.reportsData.cases
                    itemViewModelReportsDataCases = itemViewModelReportsData.getCases();
                    // read itemViewModel.reportsData.printnotes
                    itemViewModelReportsDataPrintnotes = itemViewModelReportsData.getPrintnotes();
                    // read itemViewModel.reportsData.client
                    itemViewModelReportsDataClient = itemViewModelReportsData.getClient();
                    // read itemViewModel.reportsData.khesm
                    itemViewModelReportsDataKhesm = itemViewModelReportsData.getKhesm();
                }


                if (itemViewModelReportsDataCases != null) {
                    // read itemViewModel.reportsData.cases.invetationNum
                    itemViewModelReportsDataCasesInvetationNum = itemViewModelReportsDataCases.getInvetationNum();
                    // read itemViewModel.reportsData.cases.firstSessionDate
                    itemViewModelReportsDataCasesFirstSessionDate = itemViewModelReportsDataCases.getFirstSessionDate();
                    // read itemViewModel.reportsData.cases.circleNum
                    itemViewModelReportsDataCasesCircleNum = itemViewModelReportsDataCases.getCircleNum();
                    // read itemViewModel.reportsData.cases.inventationType
                    itemViewModelReportsDataCasesInventationType = itemViewModelReportsDataCases.getInventationType();
                    // read itemViewModel.reportsData.cases.court
                    itemViewModelReportsDataCasesCourt = itemViewModelReportsDataCases.getCourt();
                }
                if (itemViewModelReportsDataPrintnotes != null) {
                    // read itemViewModel.reportsData.printnotes.notes
                    itemViewModelReportsDataPrintnotesNotes = itemViewModelReportsDataPrintnotes.getNotes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clientValue, itemViewModelReportsDataClient);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.courtValue, itemViewModelReportsDataCasesInventationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.opponentsValue, itemViewModelReportsDataKhesm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperNumberValue, itemViewModelReportsDataCasesCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperTypeValue, itemViewModelReportsDataCasesCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, itemViewModelReportsDataCasesFirstSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, itemViewModelReportsDataPrintnotesNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInvetationNum, itemViewModelReportsDataCasesInvetationNum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.reportsData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}