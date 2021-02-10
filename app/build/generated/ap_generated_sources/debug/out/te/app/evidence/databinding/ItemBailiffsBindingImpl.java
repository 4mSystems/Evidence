package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemBailiffsBindingImpl extends ItemBailiffsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_session_header, 1);
        sViewsWithIds.put(R.id.icon_down_qu, 2);
        sViewsWithIds.put(R.id.tv_qualifications, 3);
        sViewsWithIds.put(R.id.v1, 4);
        sViewsWithIds.put(R.id.expansionLayoutSessions, 5);
        sViewsWithIds.put(R.id.court_text, 6);
        sViewsWithIds.put(R.id.court_value, 7);
        sViewsWithIds.put(R.id.v2, 8);
        sViewsWithIds.put(R.id.paper_type_text, 9);
        sViewsWithIds.put(R.id.paper_type_value, 10);
        sViewsWithIds.put(R.id.v3, 11);
        sViewsWithIds.put(R.id.paper_number_text, 12);
        sViewsWithIds.put(R.id.paper_number_value, 13);
        sViewsWithIds.put(R.id.v6, 14);
        sViewsWithIds.put(R.id.session_date_text, 15);
        sViewsWithIds.put(R.id.session_month_value, 16);
        sViewsWithIds.put(R.id.v7, 17);
        sViewsWithIds.put(R.id.status_text, 18);
        sViewsWithIds.put(R.id.status_value, 19);
        sViewsWithIds.put(R.id.v4, 20);
        sViewsWithIds.put(R.id.delete, 21);
        sViewsWithIds.put(R.id.edit, 22);
        sViewsWithIds.put(R.id.view_value, 23);
        sViewsWithIds.put(R.id.v5, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBailiffsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ItemBailiffsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[22]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[16]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[18]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[23]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.evidence.pages.home.viewModels.SessionItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.home.viewModels.SessionItemViewModel ItemViewModel) {
        this.mItemViewModel = ItemViewModel;
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}