package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAllCaseBindingImpl extends ItemAllCaseBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.paper_type_text, 6);
        sViewsWithIds.put(R.id.v3, 7);
        sViewsWithIds.put(R.id.paper_number_text, 8);
        sViewsWithIds.put(R.id.v6, 9);
        sViewsWithIds.put(R.id.session_date_text, 10);
        sViewsWithIds.put(R.id.v7, 11);
        sViewsWithIds.put(R.id.status_text, 12);
        sViewsWithIds.put(R.id.v4, 13);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAllCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ItemAllCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.paperNumberValue.setTag(null);
        this.paperTypeValue.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.statusValue.setTag(null);
        this.viewValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback91 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.cases) {
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
        te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelCasesClients = null;
        java.lang.String itemViewModelCasesCourt = null;
        te.app.evidence.pages.cases.models.cases.Cases itemViewModelCases = null;
        java.lang.String itemViewModelCasesInvetationNum = null;
        java.lang.String itemViewModelCasesKhesms = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.cases
                    itemViewModelCases = itemViewModel.getCases();
                }


                if (itemViewModelCases != null) {
                    // read itemViewModel.cases.clients
                    itemViewModelCasesClients = itemViewModelCases.getClients();
                    // read itemViewModel.cases.court
                    itemViewModelCasesCourt = itemViewModelCases.getCourt();
                    // read itemViewModel.cases.invetationNum
                    itemViewModelCasesInvetationNum = itemViewModelCases.getInvetationNum();
                    // read itemViewModel.cases.khesms
                    itemViewModelCasesKhesms = itemViewModelCases.getKhesms();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperNumberValue, itemViewModelCasesCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperTypeValue, itemViewModelCasesInvetationNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, itemViewModelCasesClients);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, itemViewModelCasesKhesms);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.viewValue.setOnClickListener(mCallback91);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.cases
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}