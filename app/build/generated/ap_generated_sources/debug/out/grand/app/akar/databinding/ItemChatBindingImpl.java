package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChatBindingImpl extends ItemChatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br12, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.driverImage.setTag(null);
        this.itemMessage.setTag(null);
        this.itemMessageTime.setTag(null);
        this.rcChat.setTag(null);
        this.rlItemChat.setTag(null);
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
        if (BR.itemChatViewModel == variableId) {
            setItemChatViewModel((grand.app.akar.pages.chat.viewmodel.ItemChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemChatViewModel(@Nullable grand.app.akar.pages.chat.viewmodel.ItemChatViewModel ItemChatViewModel) {
        updateRegistration(0, ItemChatViewModel);
        this.mItemChatViewModel = ItemChatViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemChatViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemChatViewModel((grand.app.akar.pages.chat.viewmodel.ItemChatViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemChatViewModel(grand.app.akar.pages.chat.viewmodel.ItemChatViewModel ItemChatViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.chat) {
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
        java.lang.String itemChatViewModelUserDataIdItemChatViewModelChatReceiverIdItemChatViewModelUserDataImgItemChatViewModelChatReceiverImg = null;
        grand.app.akar.pages.chat.adapter.ChatImagesAdapter itemChatViewModelImagesAdapter = null;
        java.lang.String itemChatViewModelChatText = null;
        grand.app.akar.pages.auth.models.UserData itemChatViewModelChatReceiver = null;
        java.lang.String itemChatViewModelUserDataImg = null;
        grand.app.akar.pages.chat.model.Chat itemChatViewModelChat = null;
        grand.app.akar.pages.auth.models.UserData itemChatViewModelUserData = null;
        int itemChatViewModelChatReceiverId = 0;
        boolean itemChatViewModelChatMediaSizeInt0 = false;
        boolean itemChatViewModelUserDataIdItemChatViewModelChatReceiverId = false;
        java.lang.String itemChatViewModelChatReceiverImg = null;
        java.util.List<grand.app.akar.pages.home.models.DefaultImg> itemChatViewModelChatMedia = null;
        int itemChatViewModelChatMediaSize = 0;
        grand.app.akar.pages.chat.viewmodel.ItemChatViewModel itemChatViewModel = mItemChatViewModel;
        java.lang.String itemChatViewModelChatCreatedAt = null;
        int itemChatViewModelUserDataId = 0;
        int itemChatViewModelChatMediaSizeInt0ViewGONEViewVISIBLE = 0;
        int itemChatViewModelChatMediaSizeInt0ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemChatViewModel != null) {
                        // read itemChatViewModel.imagesAdapter
                        itemChatViewModelImagesAdapter = itemChatViewModel.getImagesAdapter();
                    }
            }

                if (itemChatViewModel != null) {
                    // read itemChatViewModel.chat
                    itemChatViewModelChat = itemChatViewModel.getChat();
                    // read itemChatViewModel.userData
                    itemChatViewModelUserData = itemChatViewModel.userData;
                }


                if (itemChatViewModelChat != null) {
                    // read itemChatViewModel.chat.text
                    itemChatViewModelChatText = itemChatViewModelChat.getText();
                    // read itemChatViewModel.chat.receiver
                    itemChatViewModelChatReceiver = itemChatViewModelChat.getReceiver();
                    // read itemChatViewModel.chat.media
                    itemChatViewModelChatMedia = itemChatViewModelChat.getMedia();
                    // read itemChatViewModel.chat.createdAt
                    itemChatViewModelChatCreatedAt = itemChatViewModelChat.getCreatedAt();
                }
                if (itemChatViewModelUserData != null) {
                    // read itemChatViewModel.userData.id
                    itemChatViewModelUserDataId = itemChatViewModelUserData.getId();
                }


                if (itemChatViewModelChatReceiver != null) {
                    // read itemChatViewModel.chat.receiver.id
                    itemChatViewModelChatReceiverId = itemChatViewModelChatReceiver.getId();
                }
                if (itemChatViewModelChatMedia != null) {
                    // read itemChatViewModel.chat.media.size()
                    itemChatViewModelChatMediaSize = itemChatViewModelChatMedia.size();
                }


                // read itemChatViewModel.userData.id == itemChatViewModel.chat.receiver.id
                itemChatViewModelUserDataIdItemChatViewModelChatReceiverId = (itemChatViewModelUserDataId) == (itemChatViewModelChatReceiverId);
                // read itemChatViewModel.chat.media.size() > 0
                itemChatViewModelChatMediaSizeInt0 = (itemChatViewModelChatMediaSize) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemChatViewModelUserDataIdItemChatViewModelChatReceiverId) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemChatViewModelChatMediaSizeInt0) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read itemChatViewModel.chat.media.size() > 0 ? View.GONE : View.VISIBLE
                itemChatViewModelChatMediaSizeInt0ViewGONEViewVISIBLE = ((itemChatViewModelChatMediaSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read itemChatViewModel.chat.media.size() > 0 ? View.VISIBLE : View.GONE
                itemChatViewModelChatMediaSizeInt0ViewVISIBLEViewGONE = ((itemChatViewModelChatMediaSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (itemChatViewModelUserData != null) {
                    // read itemChatViewModel.userData.img
                    itemChatViewModelUserDataImg = itemChatViewModelUserData.getImg();
                }
        }
        if ((dirtyFlags & 0x8L) != 0) {

                if (itemChatViewModelChatReceiver != null) {
                    // read itemChatViewModel.chat.receiver.img
                    itemChatViewModelChatReceiverImg = itemChatViewModelChatReceiver.getImg();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemChatViewModel.userData.id == itemChatViewModel.chat.receiver.id ? itemChatViewModel.userData.img : itemChatViewModel.chat.receiver.img
                itemChatViewModelUserDataIdItemChatViewModelChatReceiverIdItemChatViewModelUserDataImgItemChatViewModelChatReceiverImg = ((itemChatViewModelUserDataIdItemChatViewModelChatReceiverId) ? (itemChatViewModelUserDataImg) : (itemChatViewModelChatReceiverImg));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.driverImage, itemChatViewModelUserDataIdItemChatViewModelChatReceiverIdItemChatViewModelUserDataImgItemChatViewModelChatReceiverImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemMessage, itemChatViewModelChatText);
            this.itemMessage.setVisibility(itemChatViewModelChatMediaSizeInt0ViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemMessageTime, itemChatViewModelChatCreatedAt);
            this.rcChat.setVisibility(itemChatViewModelChatMediaSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.rcChat, itemChatViewModelImagesAdapter, "1", "2");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemChatViewModel
        flag 1 (0x2L): itemChatViewModel.chat
        flag 2 (0x3L): null
        flag 3 (0x4L): itemChatViewModel.userData.id == itemChatViewModel.chat.receiver.id ? itemChatViewModel.userData.img : itemChatViewModel.chat.receiver.img
        flag 4 (0x5L): itemChatViewModel.userData.id == itemChatViewModel.chat.receiver.id ? itemChatViewModel.userData.img : itemChatViewModel.chat.receiver.img
        flag 5 (0x6L): itemChatViewModel.chat.media.size() > 0 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): itemChatViewModel.chat.media.size() > 0 ? View.GONE : View.VISIBLE
        flag 7 (0x8L): itemChatViewModel.chat.media.size() > 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): itemChatViewModel.chat.media.size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}