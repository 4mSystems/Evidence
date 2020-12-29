package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ReportDialogBindingImpl extends ReportDialogBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dialog_header, 4);
        sViewsWithIds.put(R.id.v13, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputDesctextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.reportRequest.text
            //         is viewModel.reportRequest.setText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputDesc);
            // localize variables for thread safety
            // viewModel.reportRequest
            grand.app.akar.pages.adDetails.models.ReportRequest viewModelReportRequest = null;
            // viewModel.reportRequest.text
            java.lang.String viewModelReportRequestText = null;
            // viewModel.reportRequest != null
            boolean viewModelReportRequestJavaLangObjectNull = false;
            // viewModel
            grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelReportRequest = viewModel.getReportRequest();

                viewModelReportRequestJavaLangObjectNull = (viewModelReportRequest) != (null);
                if (viewModelReportRequestJavaLangObjectNull) {




                    viewModelReportRequest.setText(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ReportDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ReportDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.view.View) bindings[5]
            );
        this.inputDesc.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.optionDone.setTag(null);
        this.selectedRc.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel ViewModel, int fieldId) {
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
        grand.app.akar.pages.adDetails.models.ReportRequest viewModelReportRequest = null;
        java.lang.String viewModelReportRequestText = null;
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
        grand.app.akar.pages.adDetails.adapters.ReportDialogReasonsAdapter viewModelReportDialogReasonsAdapter = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.reportRequest
                    viewModelReportRequest = viewModel.getReportRequest();
                    // read viewModel.reportDialogReasonsAdapter
                    viewModelReportDialogReasonsAdapter = viewModel.getReportDialogReasonsAdapter();
                }


                if (viewModelReportRequest != null) {
                    // read viewModel.reportRequest.text
                    viewModelReportRequestText = viewModelReportRequest.getText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.getText(this.inputDesc, viewModelReportRequestText);
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewModelReportDialogReasonsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputDesc, inputDesctextAttrChanged);
            this.optionDone.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.sendReport();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}