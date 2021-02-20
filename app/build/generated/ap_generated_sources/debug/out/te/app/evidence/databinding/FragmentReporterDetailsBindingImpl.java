package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReporterDetailsBindingImpl extends FragmentReporterDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView1;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView5;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView6;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView7;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView8;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReporterDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentReporterDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9];
        this.mboundView9.setTag(null);
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
            setViewmodel((te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.reportersData) {
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
        java.lang.String viewmodelReportersDataDeliverData = null;
        te.app.evidence.pages.mohdrs.models.details.ReportersDetailsData viewmodelReportersData = null;
        java.lang.String viewmodelReportersDataKhesmName = null;
        java.lang.String viewmodelReportersDataPaperType = null;
        java.lang.String viewmodelReportersDataCourtMohdareen = null;
        java.lang.String viewmodelReportersDataCaseNumber = null;
        java.lang.String viewmodelReportersDataPaperNumber = null;
        java.lang.String viewmodelReportersDataMokelName = null;
        te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelReportersDataSessionDate = null;
        java.lang.String viewmodelReportersDataNotes = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.reportersData
                    viewmodelReportersData = viewmodel.getReportersData();
                }


                if (viewmodelReportersData != null) {
                    // read viewmodel.reportersData.deliverData
                    viewmodelReportersDataDeliverData = viewmodelReportersData.getDeliverData();
                    // read viewmodel.reportersData.khesmName
                    viewmodelReportersDataKhesmName = viewmodelReportersData.getKhesmName();
                    // read viewmodel.reportersData.paperType
                    viewmodelReportersDataPaperType = viewmodelReportersData.getPaperType();
                    // read viewmodel.reportersData.courtMohdareen
                    viewmodelReportersDataCourtMohdareen = viewmodelReportersData.getCourtMohdareen();
                    // read viewmodel.reportersData.caseNumber
                    viewmodelReportersDataCaseNumber = viewmodelReportersData.getCaseNumber();
                    // read viewmodel.reportersData.paperNumber
                    viewmodelReportersDataPaperNumber = viewmodelReportersData.getPaperNumber();
                    // read viewmodel.reportersData.mokelName
                    viewmodelReportersDataMokelName = viewmodelReportersData.getMokelName();
                    // read viewmodel.reportersData.sessionDate
                    viewmodelReportersDataSessionDate = viewmodelReportersData.getSessionDate();
                    // read viewmodel.reportersData.notes
                    viewmodelReportersDataNotes = viewmodelReportersData.getNotes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelReportersDataCourtMohdareen);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelReportersDataPaperType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelReportersDataDeliverData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelReportersDataPaperNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelReportersDataSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelReportersDataMokelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelReportersDataKhesmName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelReportersDataCaseNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelReportersDataNotes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.reportersData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}