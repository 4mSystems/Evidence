package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeMainBindingImpl extends ItemHomeMainBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final te.app.evidence.customViews.views.CustomTextViewRegular mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemHomeMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.cardOffice.setTag(null);
        this.fbOffice.setTag(null);
        this.icOffice.setTag(null);
        this.mboundView3 = (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3];
        this.mboundView3.setTag(null);
        this.tvOffice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback51 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.mainObject) {
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
        java.lang.String itemViewModelMainObjectText = null;
        te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel itemViewModel = mItemViewModel;
        te.app.evidence.pages.home.models.HomeMainObject itemViewModelMainObject = null;
        java.lang.String itemViewModelMainObjectBody = null;
        int itemViewModelMainObjectIcon = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.mainObject
                    itemViewModelMainObject = itemViewModel.getMainObject();
                }


                if (itemViewModelMainObject != null) {
                    // read itemViewModel.mainObject.text
                    itemViewModelMainObjectText = itemViewModelMainObject.getText();
                    // read itemViewModel.mainObject.body
                    itemViewModelMainObjectBody = itemViewModelMainObject.getBody();
                    // read itemViewModel.mainObject.icon
                    itemViewModelMainObjectIcon = itemViewModelMainObject.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardOffice.setOnClickListener(mCallback50);
            this.fbOffice.setOnClickListener(mCallback51);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.evidence.base.ApplicationBinding.loadResourceImage(this.icOffice, itemViewModelMainObjectIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelMainObjectBody);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOffice, itemViewModelMainObjectText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.HOME);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.HOME);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.mainObject
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}