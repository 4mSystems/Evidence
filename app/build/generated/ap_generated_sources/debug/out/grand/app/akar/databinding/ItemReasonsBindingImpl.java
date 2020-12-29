package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemReasonsBindingImpl extends ItemReasonsBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnCheckedChangeListenerImpl mItemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public ItemReasonsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemReasonsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.wrongPrice.setTag(null);
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
            setItemViewModel((grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.reasonsItem) {
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
        java.lang.String itemViewModelReasonsItemText = null;
        grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel itemViewModel = mItemViewModel;
        grand.app.akar.pages.splash.models.ReasonsItem itemViewModelReasonsItem = null;
        android.widget.CompoundButton.OnCheckedChangeListener itemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.reasonsItem
                    itemViewModelReasonsItem = itemViewModel.getReasonsItem();
                }


                if (itemViewModelReasonsItem != null) {
                    // read itemViewModel.reasonsItem.text
                    itemViewModelReasonsItemText = itemViewModelReasonsItem.getText();
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::onCheckChange
                        itemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener = (((mItemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener == null) ? (mItemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mItemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener).setValue(itemViewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wrongPrice, itemViewModelReasonsItemText);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.wrongPrice, (android.widget.CompoundButton.OnCheckedChangeListener)itemViewModelOnCheckChangeAndroidWidgetCompoundButtonOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.CompoundButton.OnCheckedChangeListener{
        private grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel value;
        public OnCheckedChangeListenerImpl setValue(grand.app.akar.pages.adDetails.viewModels.ItemReasonsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
            this.value.onCheckChange(arg0, arg1); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.reasonsItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}