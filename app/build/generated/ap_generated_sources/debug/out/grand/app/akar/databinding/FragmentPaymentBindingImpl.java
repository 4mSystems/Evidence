package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPaymentBindingImpl extends FragmentPaymentBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_payment_title, 2);
        sViewsWithIds.put(R.id.pay_img, 3);
        sViewsWithIds.put(R.id.tv_payment_person_type, 4);
        sViewsWithIds.put(R.id.tv_payment_desc, 5);
        sViewsWithIds.put(R.id.v20, 6);
        sViewsWithIds.put(R.id.tv_payment_title_2, 7);
        sViewsWithIds.put(R.id.tv_payment_price_text, 8);
        sViewsWithIds.put(R.id.tv_payment_price, 9);
        sViewsWithIds.put(R.id.v21, 10);
        sViewsWithIds.put(R.id.tv_payment_total_text, 11);
        sViewsWithIds.put(R.id.tv_payment_total, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPaymentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentPaymentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[11]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[10]
            );
        this.appCompatButtonNext.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback83 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.auth.payment.PaymentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.auth.payment.PaymentViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.auth.payment.PaymentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.auth.payment.PaymentViewModel Viewmodel, int fieldId) {
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
        grand.app.akar.pages.auth.payment.PaymentViewModel viewmodel = mViewmodel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback83);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.akar.pages.auth.payment.PaymentViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.updatePayment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}