package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionBindingImpl extends ItemSessionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_username, 5);
        sViewsWithIds.put(R.id.v9, 6);
        sViewsWithIds.put(R.id.session_date_text, 7);
        sViewsWithIds.put(R.id.v2, 8);
        sViewsWithIds.put(R.id.session_status_text, 9);
        sViewsWithIds.put(R.id.v3, 10);
        sViewsWithIds.put(R.id.session_month_text, 11);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionCaseNumber.setTag(null);
        this.sessionDateValue.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.sessionStatusValue.setTag(null);
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
            setItemViewModel((te.app.evidence.pages.home.viewModels.SessionItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.home.viewModels.SessionItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.home.viewModels.SessionItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.home.viewModels.SessionItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.sessionItem) {
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
        te.app.evidence.pages.sessions.SessionItem itemViewModelSessionItem = null;
        te.app.evidence.pages.home.viewModels.SessionItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelSessionItemStatus = null;
        java.lang.String itemViewModelSessionItemSessionDate = null;
        java.lang.String itemViewModelSessionItemMonth = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.sessionItem
                    itemViewModelSessionItem = itemViewModel.getSessionItem();
                }


                if (itemViewModelSessionItem != null) {
                    // read itemViewModel.sessionItem.status
                    itemViewModelSessionItemStatus = itemViewModelSessionItem.getStatus();
                    // read itemViewModel.sessionItem.sessionDate
                    itemViewModelSessionItemSessionDate = itemViewModelSessionItem.getSessionDate();
                    // read itemViewModel.sessionItem.month
                    itemViewModelSessionItemMonth = itemViewModelSessionItem.getMonth();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionCaseNumber, itemViewModelSessionItemSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDateValue, itemViewModelSessionItemSessionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, itemViewModelSessionItemMonth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionStatusValue, itemViewModelSessionItemStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.sessionItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}