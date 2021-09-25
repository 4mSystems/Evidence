package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServiceBindingImpl extends ItemServiceBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br, 11);
        sViewsWithIds.put(R.id.v_service, 12);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.ExpandableTextView) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (android.view.View) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            );
        this.call.setTag(null);
        this.icMore.setTag(null);
        this.icPlace.setTag(null);
        this.imgLive.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        this.tvDescPost.setTag(null);
        this.userCreate.setTag(null);
        this.userName.setTag(null);
        this.userPrice.setTag(null);
        this.whats.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback6 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback7 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.evidence.pages.services.viewModels.ItemServicesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.services.viewModels.ItemServicesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.services.viewModels.ItemServicesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.services.viewModels.ItemServicesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.serviceData) {
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
        java.lang.String itemViewModelServiceDataImage = null;
        java.lang.String itemViewModelServiceDataPriceConcatJavaLangString = null;
        boolean itemViewModelServiceDataUserIdItemViewModelUserDataUserDataId = false;
        int textUtilsIsEmptyItemViewModelServiceDataImageViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelServiceDataUserName = null;
        boolean textUtilsIsEmptyItemViewModelServiceDataImage = false;
        te.app.evidence.pages.auth.models.UserData itemViewModelServiceDataUser = null;
        java.lang.String itemViewModelServiceDataPrice = null;
        java.lang.String itemViewModelServiceDataTime = null;
        java.lang.String itemViewModelServiceDataDesc = null;
        int itemViewModelUserDataUserDataId = 0;
        java.lang.String itemViewModelServiceDataTitle = null;
        te.app.evidence.pages.services.viewModels.ItemServicesViewModel itemViewModel = mItemViewModel;
        boolean TextUtilsIsEmptyItemViewModelServiceDataImage1 = false;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        java.lang.String itemViewModelServiceDataPriceConcatJavaLangStringConcatUserPriceAndroidStringCoin = null;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        int itemViewModelServiceDataUserIdItemViewModelUserDataUserDataIdViewVISIBLEViewGONE = 0;
        te.app.evidence.pages.services.models.ServiceData itemViewModelServiceData = null;
        java.lang.String itemViewModelServiceDataUserImage = null;
        int itemViewModelServiceDataUserId = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.userData
                    itemViewModelUserData = itemViewModel.userData;
                    // read itemViewModel.serviceData
                    itemViewModelServiceData = itemViewModel.getServiceData();
                }


                if (itemViewModelUserData != null) {
                    // read itemViewModel.userData.userData
                    itemViewModelUserDataUserData = itemViewModelUserData.getUserData();
                }
                if (itemViewModelServiceData != null) {
                    // read itemViewModel.serviceData.image
                    itemViewModelServiceDataImage = itemViewModelServiceData.getImage();
                    // read itemViewModel.serviceData.user
                    itemViewModelServiceDataUser = itemViewModelServiceData.getUser();
                    // read itemViewModel.serviceData.price
                    itemViewModelServiceDataPrice = itemViewModelServiceData.getPrice();
                    // read itemViewModel.serviceData.time
                    itemViewModelServiceDataTime = itemViewModelServiceData.getTime();
                    // read itemViewModel.serviceData.desc
                    itemViewModelServiceDataDesc = itemViewModelServiceData.getDesc();
                    // read itemViewModel.serviceData.title
                    itemViewModelServiceDataTitle = itemViewModelServiceData.getTitle();
                }


                if (itemViewModelUserDataUserData != null) {
                    // read itemViewModel.userData.userData.id
                    itemViewModelUserDataUserDataId = itemViewModelUserDataUserData.getId();
                }
                // read TextUtils.isEmpty(itemViewModel.serviceData.image)
                textUtilsIsEmptyItemViewModelServiceDataImage = android.text.TextUtils.isEmpty(itemViewModelServiceDataImage);
                if (itemViewModelServiceDataUser != null) {
                    // read itemViewModel.serviceData.user.name
                    itemViewModelServiceDataUserName = itemViewModelServiceDataUser.getName();
                    // read itemViewModel.serviceData.user.image
                    itemViewModelServiceDataUserImage = itemViewModelServiceDataUser.getImage();
                    // read itemViewModel.serviceData.user.id
                    itemViewModelServiceDataUserId = itemViewModelServiceDataUser.getId();
                }
                if (itemViewModelServiceDataPrice != null) {
                    // read itemViewModel.serviceData.price.concat(" ")
                    itemViewModelServiceDataPriceConcatJavaLangString = itemViewModelServiceDataPrice.concat(" ");
                }


                // read !TextUtils.isEmpty(itemViewModel.serviceData.image)
                TextUtilsIsEmptyItemViewModelServiceDataImage1 = !textUtilsIsEmptyItemViewModelServiceDataImage;
                // read itemViewModel.serviceData.user.id == itemViewModel.userData.userData.id
                itemViewModelServiceDataUserIdItemViewModelUserDataUserDataId = (itemViewModelServiceDataUserId) == (itemViewModelUserDataUserDataId);
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyItemViewModelServiceDataImage1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelServiceDataUserIdItemViewModelUserDataUserDataId) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
                if (itemViewModelServiceDataPriceConcatJavaLangString != null) {
                    // read itemViewModel.serviceData.price.concat(" ").concat(@android:string/coin)
                    itemViewModelServiceDataPriceConcatJavaLangStringConcatUserPriceAndroidStringCoin = itemViewModelServiceDataPriceConcatJavaLangString.concat(userPrice.getResources().getString(R.string.coin));
                }


                // read !TextUtils.isEmpty(itemViewModel.serviceData.image) ? View.VISIBLE : View.GONE
                textUtilsIsEmptyItemViewModelServiceDataImageViewVISIBLEViewGONE = ((TextUtilsIsEmptyItemViewModelServiceDataImage1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemViewModel.serviceData.user.id == itemViewModel.userData.userData.id ? View.VISIBLE : View.GONE
                itemViewModelServiceDataUserIdItemViewModelUserDataUserDataIdViewVISIBLEViewGONE = ((itemViewModelServiceDataUserIdItemViewModelUserDataUserDataId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.call.setOnClickListener(mCallback7);
            this.icMore.setOnClickListener(mCallback6);
            this.whats.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.icMore.setVisibility(itemViewModelServiceDataUserIdItemViewModelUserDataUserDataIdViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.loadMShowImage(this.icPlace, itemViewModelServiceDataUserImage);
            this.imgLive.setVisibility(textUtilsIsEmptyItemViewModelServiceDataImageViewVISIBLEViewGONE);
            te.app.evidence.base.ApplicationBinding.loadMShowImage(this.imgLive, itemViewModelServiceDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemViewModelServiceDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescPost, itemViewModelServiceDataDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userCreate, itemViewModelServiceDataTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, itemViewModelServiceDataUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userPrice, itemViewModelServiceDataPriceConcatJavaLangStringConcatUserPriceAndroidStringCoin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.services.viewModels.ItemServicesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.action(te.app.evidence.utils.Constants.WHATS);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.services.viewModels.ItemServicesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.action(te.app.evidence.utils.Constants.EDIT);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.services.viewModels.ItemServicesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.action(te.app.evidence.utils.Constants.CALL);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.serviceData
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(itemViewModel.serviceData.image) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): !TextUtils.isEmpty(itemViewModel.serviceData.image) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.serviceData.user.id == itemViewModel.userData.userData.id ? View.VISIBLE : View.GONE
        flag 6 (0x7L): itemViewModel.serviceData.user.id == itemViewModel.userData.userData.id ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}