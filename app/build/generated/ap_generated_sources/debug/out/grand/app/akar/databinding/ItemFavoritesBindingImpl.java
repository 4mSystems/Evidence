package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFavoritesBindingImpl extends ItemFavoritesBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_home_item, 9);
        sViewsWithIds.put(R.id.br10, 10);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback167;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFavoritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ItemFavoritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.tvBeds.setTag(null);
        this.tvBuilding.setTag(null);
        this.tvHomeDesc.setTag(null);
        this.tvHomeDistance.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvLocation.setTag(null);
        this.tvPath.setTag(null);
        setRootTag(root);
        // listeners
        mCallback167 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
        java.lang.String itemHomeViewModelHomeDataArea = null;
        int itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = null;
        java.lang.String itemHomeViewModelHomeDataRoomNo = null;
        java.lang.String itemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoom = null;
        int itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String itemHomeViewModelHomeDataDefaultImgMedia = null;
        grand.app.akar.pages.home.models.HomeData itemHomeViewModelHomeData = null;
        java.lang.String itemHomeViewModelHomeDataAddress = null;
        java.lang.String itemHomeViewModelTitle = null;
        java.lang.String itemHomeViewModelHomeDataRoomNoJavaLangObjectNullItemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoomJavaLangString = null;
        boolean itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull = false;
        java.lang.String itemHomeViewModelHomeDataPrice = null;
        java.lang.String itemHomeViewModelHomeDataAreaConcatTvBuildingAndroidStringMeter = null;
        java.lang.String itemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBath = null;
        grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        java.lang.String itemHomeViewModelHomeDataType = null;
        java.lang.String itemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthly = null;
        grand.app.akar.pages.home.models.DefaultImg itemHomeViewModelHomeDataDefaultImg = null;
        java.lang.String itemHomeViewModelHomeDataTypeEqualsJavaLangString0ItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthlyItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin = null;
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
                    // read itemHomeViewModel.homeData.area
                    itemHomeViewModelHomeDataArea = itemHomeViewModelHomeData.getArea();
                    // read itemHomeViewModel.homeData.roomNo
                    itemHomeViewModelHomeDataRoomNo = itemHomeViewModelHomeData.getRoomNo();
                    // read itemHomeViewModel.homeData.address
                    itemHomeViewModelHomeDataAddress = itemHomeViewModelHomeData.getAddress();
                    // read itemHomeViewModel.homeData.type
                    itemHomeViewModelHomeDataType = itemHomeViewModelHomeData.getType();
                    // read itemHomeViewModel.homeData.defaultImg
                    itemHomeViewModelHomeDataDefaultImg = itemHomeViewModelHomeData.getDefaultImg();
                }


                // read itemHomeViewModel.homeData.bathroomNo != null
                itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull = (itemHomeViewModelHomeDataBathroomNo) != (null);
                // read itemHomeViewModel.homeData.roomNo != null
                itemHomeViewModelHomeDataRoomNoJavaLangObjectNull = (itemHomeViewModelHomeDataRoomNo) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelHomeDataRoomNoJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
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
                if (itemHomeViewModelHomeDataDefaultImg != null) {
                    // read itemHomeViewModel.homeData.defaultImg.media
                    itemHomeViewModelHomeDataDefaultImgMedia = itemHomeViewModelHomeDataDefaultImg.getMedia();
                }


                // read itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
                itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE = ((itemHomeViewModelHomeDataBathroomNoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
                itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE = ((itemHomeViewModelHomeDataRoomNoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemHomeViewModel != null) {
                        // read itemHomeViewModel.title
                        itemHomeViewModelTitle = itemHomeViewModel.title;
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

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
        if ((dirtyFlags & 0x1000L) != 0) {

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
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView1, itemHomeViewModelHomeDataDefaultImgMedia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBeds, itemHomeViewModelHomeDataRoomNoJavaLangObjectNullItemHomeViewModelHomeDataRoomNoConcatTvBedsAndroidStringRoomJavaLangString);
            this.tvBeds.setVisibility(itemHomeViewModelHomeDataRoomNoJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBuilding, itemHomeViewModelHomeDataAreaConcatTvBuildingAndroidStringMeter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeDesc, itemHomeViewModelHomeDataTypeEqualsJavaLangString0ItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoinConcatTvHomeDescAndroidStringMonthlyItemHomeViewModelHomeDataPriceConcatTvHomeDescAndroidStringCoin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, itemHomeViewModelHomeDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPath, itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullItemHomeViewModelHomeDataBathroomNoConcatTvPathAndroidStringBathJavaLangString);
            this.tvPath.setVisibility(itemHomeViewModelHomeDataBathroomNoJavaLangObjectNullViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvHomeDistance.setOnClickListener(mCallback167);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.tvHomeItem.setHint(itemHomeViewModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemHomeViewModel
        grand.app.akar.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        // itemHomeViewModel != null
        boolean itemHomeViewModelJavaLangObjectNull = false;



        itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
        if (itemHomeViewModelJavaLangObjectNull) {


            itemHomeViewModel.removeFavorite();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemHomeViewModel
        flag 1 (0x2L): itemHomeViewModel.homeData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemHomeViewModel.homeData.bathroomNo != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): itemHomeViewModel.homeData.roomNo != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): itemHomeViewModel.homeData.roomNo != null ? itemHomeViewModel.homeData.roomNo.concat(@android:string/room) : ""
        flag 8 (0x9L): itemHomeViewModel.homeData.roomNo != null ? itemHomeViewModel.homeData.roomNo.concat(@android:string/room) : ""
        flag 9 (0xaL): itemHomeViewModel.homeData.type.equals("0") ? itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly) : itemHomeViewModel.homeData.price.concat(@android:string/coin)
        flag 10 (0xbL): itemHomeViewModel.homeData.type.equals("0") ? itemHomeViewModel.homeData.price.concat(@android:string/coin).concat(@android:string/monthly) : itemHomeViewModel.homeData.price.concat(@android:string/coin)
        flag 11 (0xcL): itemHomeViewModel.homeData.bathroomNo != null ? itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath) : ""
        flag 12 (0xdL): itemHomeViewModel.homeData.bathroomNo != null ? itemHomeViewModel.homeData.bathroomNo.concat(@android:string/bath) : ""
    flag mapping end*/
    //end
}