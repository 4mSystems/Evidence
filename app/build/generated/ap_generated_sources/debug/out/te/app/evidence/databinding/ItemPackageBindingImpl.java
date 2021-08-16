package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPackageBindingImpl extends ItemPackageBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_free, 5);
        sViewsWithIds.put(R.id.ic_resource, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final te.app.evidence.customViews.views.CustomTextViewMedium mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback124;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPackageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemPackageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            );
        this.btnSubscribe.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.tvPackage.setTag(null);
        this.tvPackageDesc.setTag(null);
        setRootTag(root);
        // listeners
        mCallback124 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel ItemViewModel, int fieldId) {
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
        te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelPackagesDescription = null;
        java.lang.String itemViewModelPackagesName = null;
        java.lang.String itemViewModelPackagesCost = null;
        java.lang.String itemViewModelPackagesCostConcatJavaLangString = null;
        te.app.evidence.pages.settings.models.Packages itemViewModelPackages = null;
        java.lang.String itemViewModelPackagesCostConcatJavaLangStringConcatMboundView2AndroidStringCoin = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.packages
                    itemViewModelPackages = itemViewModel.packages;
                }


                if (itemViewModelPackages != null) {
                    // read itemViewModel.packages.description
                    itemViewModelPackagesDescription = itemViewModelPackages.getDescription();
                    // read itemViewModel.packages.name
                    itemViewModelPackagesName = itemViewModelPackages.getName();
                    // read itemViewModel.packages.cost
                    itemViewModelPackagesCost = itemViewModelPackages.getCost();
                }


                if (itemViewModelPackagesCost != null) {
                    // read itemViewModel.packages.cost.concat(" ")
                    itemViewModelPackagesCostConcatJavaLangString = itemViewModelPackagesCost.concat(" ");
                }


                if (itemViewModelPackagesCostConcatJavaLangString != null) {
                    // read itemViewModel.packages.cost.concat(" ").concat(@android:string/coin)
                    itemViewModelPackagesCostConcatJavaLangStringConcatMboundView2AndroidStringCoin = itemViewModelPackagesCostConcatJavaLangString.concat(mboundView2.getResources().getString(R.string.coin));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnSubscribe.setOnClickListener(mCallback124);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelPackagesCostConcatJavaLangStringConcatMboundView2AndroidStringCoin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPackage, itemViewModelPackagesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPackageDesc, itemViewModelPackagesDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.evidence.pages.settings.viewModels.ItemPackagesViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}