package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAdRentDialogBindingImpl extends FragmentAdRentDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_diff_locations, 2);
        sViewsWithIds.put(R.id.radioRent, 3);
        sViewsWithIds.put(R.id.radioSell, 4);
    }
    // views
    @NonNull
    private final android.widget.RadioGroup mboundView1;
    // variables
    // values
    // listeners
    private OnCheckedChangeListenerImpl mViewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public FragmentAdRentDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentAdRentDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            );
        this.listingTypeSheet.setTag(null);
        this.mboundView1 = (android.widget.RadioGroup) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.akar.pages.home.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.akar.pages.home.viewModels.HomeViewModel ViewModel) {
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
                return onChangeViewModel((grand.app.akar.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.akar.pages.home.viewModels.HomeViewModel ViewModel, int fieldId) {
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
        android.widget.RadioGroup.OnCheckedChangeListener viewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        grand.app.akar.pages.home.viewModels.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::rentType
                    viewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener = (((mViewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener == null) ? (mViewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mViewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.mboundView1, (android.widget.RadioGroup.OnCheckedChangeListener)viewModelRentTypeAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.RadioGroup.OnCheckedChangeListener{
        private grand.app.akar.pages.home.viewModels.HomeViewModel value;
        public OnCheckedChangeListenerImpl setValue(grand.app.akar.pages.home.viewModels.HomeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
            this.value.rentType(arg0, arg1); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}