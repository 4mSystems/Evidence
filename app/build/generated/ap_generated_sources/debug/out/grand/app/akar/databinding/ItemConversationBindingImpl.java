package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemConversationBindingImpl extends ItemConversationBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br9, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemConversationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemConversationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.conDescText.setTag(null);
        this.conTime.setTag(null);
        this.conTitle.setTag(null);
        this.conTitleAddress.setTag(null);
        this.conUserImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.conversationsData) {
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
        grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel itemViewModel = mItemViewModel;
        grand.app.akar.pages.auth.models.UserData itemViewModelConversationsDataReceiver = null;
        java.lang.String itemViewModelConversationsDataReceiverImg = null;
        java.lang.String itemViewModelConversationsDataCreatedAt = null;
        grand.app.akar.pages.conversations.models.ConversationsData itemViewModelConversationsData = null;
        java.lang.String itemViewModelConversationsDataReceiverName = null;
        java.lang.String itemViewModelConversationsDataText = null;
        java.lang.String itemViewModelConversationsDataAddress = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.conversationsData
                    itemViewModelConversationsData = itemViewModel.getConversationsData();
                }


                if (itemViewModelConversationsData != null) {
                    // read itemViewModel.conversationsData.receiver
                    itemViewModelConversationsDataReceiver = itemViewModelConversationsData.getReceiver();
                    // read itemViewModel.conversationsData.createdAt
                    itemViewModelConversationsDataCreatedAt = itemViewModelConversationsData.getCreatedAt();
                    // read itemViewModel.conversationsData.text
                    itemViewModelConversationsDataText = itemViewModelConversationsData.getText();
                    // read itemViewModel.conversationsData.address
                    itemViewModelConversationsDataAddress = itemViewModelConversationsData.getAddress();
                }


                if (itemViewModelConversationsDataReceiver != null) {
                    // read itemViewModel.conversationsData.receiver.img
                    itemViewModelConversationsDataReceiverImg = itemViewModelConversationsDataReceiver.getImg();
                    // read itemViewModel.conversationsData.receiver.name
                    itemViewModelConversationsDataReceiverName = itemViewModelConversationsDataReceiver.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conDescText, itemViewModelConversationsDataText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTime, itemViewModelConversationsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTitle, itemViewModelConversationsDataReceiverName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTitleAddress, itemViewModelConversationsDataAddress);
            grand.app.akar.base.ApplicationBinding.loadImage(this.conUserImage, itemViewModelConversationsDataReceiverImg);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback19);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.conversationsData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}