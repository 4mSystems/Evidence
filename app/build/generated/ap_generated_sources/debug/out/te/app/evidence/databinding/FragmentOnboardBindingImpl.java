package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOnboardBindingImpl extends FragmentOnboardBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageSlider, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOnboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentOnboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.smarteist.autoimageslider.SliderView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            );
        this.searchContainer.setTag(null);
        this.startApp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
        if (BR.onBoardViewModels == variableId) {
            setOnBoardViewModels((te.app.evidence.pages.splash.SplashViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnBoardViewModels(@Nullable te.app.evidence.pages.splash.SplashViewModel OnBoardViewModels) {
        updateRegistration(0, OnBoardViewModels);
        this.mOnBoardViewModels = OnBoardViewModels;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onBoardViewModels);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOnBoardViewModels((te.app.evidence.pages.splash.SplashViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOnBoardViewModels(te.app.evidence.pages.splash.SplashViewModel OnBoardViewModels, int fieldId) {
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
        te.app.evidence.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.startApp.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // onBoardViewModels
        te.app.evidence.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
        // onBoardViewModels != null
        boolean onBoardViewModelsJavaLangObjectNull = false;



        onBoardViewModelsJavaLangObjectNull = (onBoardViewModels) != (null);
        if (onBoardViewModelsJavaLangObjectNull) {


            onBoardViewModels.toLogin();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onBoardViewModels
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}