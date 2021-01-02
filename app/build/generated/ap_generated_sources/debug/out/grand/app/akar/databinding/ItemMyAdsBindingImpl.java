package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyAdsBindingImpl extends ItemMyAdsBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_home_item, 12);
        sViewsWithIds.put(R.id.br10, 13);
        sViewsWithIds.put(R.id.tv_remove, 14);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final grand.app.akar.customViews.views.CustomTextViewRegular mboundView11;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback164;
    @Nullable
    private final android.view.View.OnClickListener mCallback165;
    @Nullable
    private final android.view.View.OnClickListener mCallback166;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyAdsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ItemMyAdsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[14]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvBeds.setTag(null);
        this.tvBuilding.setTag(null);
        this.tvHomeDesc.setTag(null);
        this.tvHomeDistance.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvLocation.setTag(null);
        this.tvPath.setTag(null);
        this.tvPormote.setTag(null);
        setRootTag(root);
        // listeners
        mCallback164 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback165 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback166 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
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
        if (BR.itemHomeViewModel == variableId) {
            setItemHomeViewModel((grand.app.akar.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemHomeViewModel(@Nullable grand.app.akar.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel) {
        updateRegistration(0, ItemHomeViewModel);
        this.mItemHomeViewModel = ItemHomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemHomeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemHomeViewModel((grand.app.akar.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemHomeViewModel(grand.app.akar.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
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
        boolean itemHomeViewModelHomeDataRoomNoJavaLangObjectNull = false;
        java.lang.String itemHomeViewModelHomeDataBathroomNo = null;
        java.lang.String javaLangStringConcatStringValueOfItemHomeViewModelHomeDataId = null;
        int itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String itemHomeViewModelHomeDataAddress = null;
        java.lang.String itemHomeViewModelHomeDataRoomNoJavaLangObjectNullItemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoomJavaLangString = null;
        boolean itemHomeViewModelHomeDataPremiumInt1 = false;
        java.lang.String itemHomeViewModelHomeDataAreaConcatTvBuildingAndroidStringMeter = null;
        grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        int itemHomeViewModelHomeDataPremiumInt1ViewGONEViewVISIBLE = 0;
        java.lang.String itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthly = null;
        grand.app.akar.pages.home.models.DefaultImg itemHomeViewModelHomeDataDefaultImg = null;
        java.lang.String itemHomeViewModelHomeDataTypeEqualsJavaLangString0ItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthlyItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = null;
        int itemHomeViewModelHomeDataPremium = 0;
        java.lang.String itemHomeViewModelHomeDataArea = null;
        int itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = null;
        java.lang.String itemHomeViewModelHomeDataRoomNo = null;
        java.lang.String stringValueOfItemHomeViewModelHomeDataId = null;
        java.lang.String itemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoom = null;
        java.lang.String itemHomeViewModelHomeDataDefaultImgMedia = null;
        grand.app.akar.pages.home.models.HomeData itemHomeViewModelHomeData = null;
        java.lang.String itemHomeViewModelTitle = null;
        boolean itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull = false;
        java.lang.String itemHomeViewModelHomeDataPrice = null;
        java.lang.String itemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBath = null;
        java.lang.String itemHomeViewModelHomeDataType = null;
        int itemHomeViewModelHomeDataId = 0;
        java.lang.String itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullItemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBathJavaLangString = null;
        boolean itemHomeViewModelHomeDataTypeEqualsJavaLangString0 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemHomeViewModel != null) {
                    // read itemHomeViewModel.homeData
                    itemHomeViewModelHomeData = itemHomeViewModel.getHomeData();
                }


                if (itemHomeViewModelHomeData != null) {
                    // read itemHomeViewModel.homeData.bathroomNo
                    itemHomeViewModelHomeDataBathroomNo = itemHomeViewModelHomeData.getBathroomNo();
                    // read itemHomeViewModel.homeData.address
                    itemHomeViewModelHomeDataAddress = itemHomeViewModelHomeData.getAddress();
                    // read itemHomeViewModel.homeData.defaultImg
                    itemHomeViewModelHomeDataDefaultImg = itemHomeViewModelHomeData.getDefaultImg();
                    // read itemHomeViewModel.homeData.premium
                    itemHomeViewModelHomeDataPremium = itemHomeViewModelHomeData.getPremium();
                    // read itemHomeViewModel.homeData.area
                    itemHomeViewModelHomeDataArea = itemHomeViewModelHomeData.getArea();
                    // read itemHomeViewModel.homeData.roomNo
                    itemHomeViewModelHomeDataRoomNo = itemHomeViewModelHomeData.getRoomNo();
                    // read itemHomeViewModel.homeData.type
                    itemHomeViewModelHomeDataType = itemHomeViewModelHomeData.getType();
                    // read itemHomeViewModel.homeData.id
                    itemHomeViewModelHomeDataId = itemHomeViewModelHomeData.getId();
                }


                // read itemHomeViewModel.homeData.bathroomNo != null
                itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull = (itemHomeViewModelHomeDataBathroomNo) != (null);
                // read itemHomeViewModel.homeData.premium == 1
                itemHomeViewModelHomeDataPremiumInt1 = (itemHomeViewModelHomeDataPremium) == (1);
                // read itemHomeViewModel.homeData.roomNo != null
                itemHomeViewModelHomeDataRoomNoJavaLangObjectNull = (itemHomeViewModelHomeDataRoomNo) != (null);
                // read String.valueOf(itemHomeViewModel.homeData.id)
                stringValueOfItemHomeViewModelHomeDataId = java.lang.String.valueOf(itemHomeViewModelHomeDataId);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataPremiumInt1) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataRoomNoJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }
                if (itemHomeViewModelHomeDataDefaultImg != null) {
                    // read itemHomeViewModel.homeData.defaultImg.media
                    itemHomeViewModelHomeDataDefaultImgMedia = itemHomeViewModelHomeDataDefaultImg.getMedia();
                }
                if (itemHomeViewModelHomeDataArea != null) {
                    // read itemHomeViewModel.homeData.area.concat(@android:string/meter)
                    itemHomeViewModelHomeDataAreaConcatTvBuildingAndroidStringMeter = itemHomeViewModelHomeDataArea.concat(tvBuilding.getResources().getString(R.string.meter));
                }
                if (itemHomeViewModelHomeDataType != null) {
                    // read itemHomeViewModel.homeData.type.equals("0")
                    itemHomeViewModelHomeDataTypeEqualsJavaLangString0 = itemHomeViewModelHomeDataType.equals("0");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataTypeEqualsJavaLangString0) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
                itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE = ((itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemHomeViewModel.homeData.premium == 1 ? View.GONE : View.VISIBLE
                itemHomeViewModelHomeDataPremiumInt1ViewGONEViewVISIBLE = ((itemHomeViewModelHomeDataPremiumInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
                itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE = ((itemHomeViewModelHomeDataRoomNoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read "# ".concat(String.valueOf(itemHomeViewModel.homeData.id))
                javaLangStringConcatStringValueOfItemHomeViewModelHomeDataId = "# ".concat(stringValueOfItemHomeViewModelHomeDataId);
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemHomeViewModel != null) {
                        // read itemHomeViewModel.title
                        itemHomeViewModelTitle = itemHomeViewModel.title;
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (itemHomeViewModelHomeDataRoomNo != null) {
                    // read itemHomeViewModel.homeData.roomNo.concat(@android:string/room)
                    itemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoom = itemHomeViewModelHomeDataRoomNo.concat(tvBeds.getResources().getString(R.string.room));
                }
        }
        if ((dirtyFlags & 0x600L) != 0) {

                if (itemHomeViewModelHomeData != null) {
                    // read itemHomeViewModel.homeData.price
                    itemHomeViewModelHomeDataPrice = itemHomeViewModelHomeData.getPrice();
                }


                if (itemHomeViewModelHomeDataPrice != null) {
                    // read itemHomeViewModel.homeData.price.concat(@android:string/coin)
                    itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = itemHomeViewModelHomeDataPrice.concat(tvHomeDesc.getResources().getString(R.string.coin));
                }

            if ((dirtyFlags & 0x400L) != 0) {

                    if (itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin != null) {
                        // read itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly)
                        itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthly = itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin.concat(tvHomeDesc.getResources().getString(R.string.monthly));
                    }
            }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (itemHomeViewModelHomeDataBathroomNo != null) {
                    // read itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath)
                    itemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBath = itemHomeViewModelHomeDataBathroomNo.concat(tvPath.getResources().getString(R.string.bath));
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemHomeViewModel.homeData.roomNo != null ? itemHomeViewModel.homeData.roomNo.concat(@android:string/room) : ""
                itemHomeViewModelHomeDataRoomNoJavaLangObjectNullItemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoomJavaLangString = ((itemHomeViewModelHomeDataRoomNoJavaLangObjectNull) ? (itemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoom) : (""));
                // read itemHomeViewModel.homeData.type.equals("0") ? itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly) : itemHomeViewModel.homeData.price.concat(@android:string/coin)
                itemHomeViewModelHomeDataTypeEqualsJavaLangString0ItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthlyItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = ((itemHomeViewModelHomeDataTypeEqualsJavaLangString0) ? (itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthly) : (itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin));
                // read itemHomeViewModel.homeData.bathroomNo != null ? itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath) : ""
                itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullItemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBathJavaLangString = ((itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull) ? (itemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBath) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback164);
            this.mboundView1.setOnClickListener(mCallback165);
            this.mboundView11.setOnClickListener(mCallback166);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView2, itemHomeViewModelHomeDataDefaultImgMedia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBeds, itemHomeViewModelHomeDataRoomNoJavaLangObjectNullItemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoomJavaLangString);
            this.tvBeds.setVisibility(itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBuilding, itemHomeViewModelHomeDataAreaConcatTvBuildingAndroidStringMeter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeDesc, itemHomeViewModelHomeDataTypeEqualsJavaLangString0ItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthlyItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeDistance, javaLangStringConcatStringValueOfItemHomeViewModelHomeDataId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, itemHomeViewModelHomeDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPath, itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullItemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBathJavaLangString);
            this.tvPath.setVisibility(itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvPormote.setVisibility(itemHomeViewModelHomeDataPremiumInt1ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.tvHomeItem.setHint(itemHomeViewModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemHomeViewModel
                grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
                // itemHomeViewModel != null
                boolean itemHomeViewModelJavaLangObjectNull = false;



                itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
                if (itemHomeViewModelJavaLangObjectNull) {


                    itemHomeViewModel.itemAction();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemHomeViewModel
                grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
                // itemHomeViewModel != null
                boolean itemHomeViewModelJavaLangObjectNull = false;



                itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
                if (itemHomeViewModelJavaLangObjectNull) {


                    itemHomeViewModel.itemAction();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemHomeViewModel
                grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
                // itemHomeViewModel != null
                boolean itemHomeViewModelJavaLangObjectNull = false;



                itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
                if (itemHomeViewModelJavaLangObjectNull) {


                    itemHomeViewModel.removeAd();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemHomeViewModel
        flag 1 (0x2L): itemHomeViewModel.homeData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemHomeViewModel.homeData.roomNo != null ? itemHomeViewModel.homeData.roomNo.concat(@android:string/room) : ""
        flag 6 (0x7L): itemHomeViewModel.homeData.roomNo != null ? itemHomeViewModel.homeData.roomNo.concat(@android:string/room) : ""
        flag 7 (0x8L): itemHomeViewModel.homeData.premium == 1 ? View.GONE : View.VISIBLE
        flag 8 (0x9L): itemHomeViewModel.homeData.premium == 1 ? View.GONE : View.VISIBLE
        flag 9 (0xaL): itemHomeViewModel.homeData.type.equals("0") ? itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly) : itemHomeViewModel.homeData.price.concat(@android:string/coin)
        flag 10 (0xbL): itemHomeViewModel.homeData.type.equals("0") ? itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly) : itemHomeViewModel.homeData.price.concat(@android:string/coin)
        flag 11 (0xcL): itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): itemHomeViewModel.homeData.bathroomNo != null ? itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath) : ""
        flag 14 (0xfL): itemHomeViewModel.homeData.bathroomNo != null ? itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath) : ""
    flag mapping end*/
    //end
}