package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NotifyItemBindingImpl extends NotifyItemBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView13, 2);
        sViewsWithIds.put(R.id.textView14, 3);
        sViewsWithIds.put(R.id.image, 4);
        sViewsWithIds.put(R.id.textView15, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NotifyItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private NotifyItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewBold) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback100 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        if (BR.notifyItemViewModels == variableId) {
            setNotifyItemViewModels((grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotifyItemViewModels(@Nullable grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels NotifyItemViewModels) {
        updateRegistration(0, NotifyItemViewModels);
        this.mNotifyItemViewModels = NotifyItemViewModels;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.notifyItemViewModels);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotifyItemViewModels((grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotifyItemViewModels(grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels NotifyItemViewModels, int fieldId) {
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
        grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels notifyItemViewModels = mNotifyItemViewModels;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback100);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // notifyItemViewModels != null
        boolean notifyItemViewModelsJavaLangObjectNull = false;
        // notifyItemViewModels
        grand.app.akar.pages.notifications.itemViewModels.NotificationsItemViewModels notifyItemViewModels = mNotifyItemViewModels;



        notifyItemViewModelsJavaLangObjectNull = (notifyItemViewModels) != (null);
        if (notifyItemViewModelsJavaLangObjectNull) {


            notifyItemViewModels.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notifyItemViewModels
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}