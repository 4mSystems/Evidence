package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAttachmentBindingImpl extends ItemAttachmentBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_username, 4);
        sViewsWithIds.put(R.id.v9, 5);
        sViewsWithIds.put(R.id.session_date_text, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAttachmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemAttachmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[4]
            , (android.view.View) bindings[5]
            );
        this.btnPrint.setTag(null);
        this.delete.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionCaseNumber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback87 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback88 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.attachment) {
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
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelAttachmentImgDescription = null;
        te.app.evidence.pages.attachments.models.Attachment itemViewModelAttachment = null;
        java.lang.String itemViewModelAttachmentFileType = null;
        te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPE = false;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        java.lang.String itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPEBtnPrintAndroidStringDownloadBtnPrintAndroidStringDownloadDoc = null;
        java.lang.String itemViewModelUserDataUserDataType = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.attachment
                    itemViewModelAttachment = itemViewModel.getAttachment();
                }


                if (itemViewModelAttachment != null) {
                    // read itemViewModel.attachment.imgDescription
                    itemViewModelAttachmentImgDescription = itemViewModelAttachment.getImgDescription();
                    // read itemViewModel.attachment.fileType
                    itemViewModelAttachmentFileType = itemViewModelAttachment.getFileType();
                }


                if (itemViewModelAttachmentFileType != null) {
                    // read itemViewModel.attachment.fileType.contains(Constants.IMAGE_MIME_TYPE)
                    itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPE = itemViewModelAttachmentFileType.contains(te.app.evidence.utils.Constants.IMAGE_MIME_TYPE);
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPE) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemViewModel.attachment.fileType.contains(Constants.IMAGE_MIME_TYPE) ? @android:string/download : @android:string/download_doc
                itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPEBtnPrintAndroidStringDownloadBtnPrintAndroidStringDownloadDoc = ((itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPE) ? (btnPrint.getResources().getString(R.string.download)) : (btnPrint.getResources().getString(R.string.download_doc)));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.userData
                        itemViewModelUserData = itemViewModel.userData;
                    }


                    if (itemViewModelUserData != null) {
                        // read itemViewModel.userData.userData
                        itemViewModelUserDataUserData = itemViewModelUserData.getUserData();
                    }


                    if (itemViewModelUserDataUserData != null) {
                        // read itemViewModel.userData.userData.type
                        itemViewModelUserDataUserDataType = itemViewModelUserDataUserData.getType();
                    }


                    if (itemViewModelUserDataUserDataType != null) {
                        // read itemViewModel.userData.userData.type.equals("admin")
                        itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = itemViewModelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }


                    // read itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnPrint.setOnClickListener(mCallback87);
            this.delete.setOnClickListener(mCallback88);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnPrint, itemViewModelAttachmentFileTypeContainsConstantsIMAGEMIMETYPEBtnPrintAndroidStringDownloadBtnPrintAndroidStringDownloadDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionCaseNumber, itemViewModelAttachmentImgDescription);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.delete.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.download();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.attachments.viewModels.AttachmentsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toDelete();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.attachment
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.attachment.fileType.contains(Constants.IMAGE_MIME_TYPE) ? @android:string/download : @android:string/download_doc
        flag 6 (0x7L): itemViewModel.attachment.fileType.contains(Constants.IMAGE_MIME_TYPE) ? @android:string/download : @android:string/download_doc
    flag mapping end*/
    //end
}