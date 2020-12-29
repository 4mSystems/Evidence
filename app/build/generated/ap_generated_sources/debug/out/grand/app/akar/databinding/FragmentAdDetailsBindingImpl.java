package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAdDetailsBindingImpl extends FragmentAdDetailsBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 27);
        sViewsWithIds.put(R.id.cover_image, 28);
        sViewsWithIds.put(R.id.back, 29);
        sViewsWithIds.put(R.id.details_card, 30);
        sViewsWithIds.put(R.id.v18, 31);
        sViewsWithIds.put(R.id.br4, 32);
        sViewsWithIds.put(R.id.v5, 33);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView10;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView16;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView18;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView23;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentAdDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[29]
            , (androidx.constraintlayout.widget.Barrier) bindings[32]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[20]
            , (com.smarteist.autoimageslider.SliderView) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[26]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[19]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[24]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[21]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[33]
            );
        this.adDesc.setTag(null);
        this.address.setTag(null);
        this.call.setTag(null);
        this.delete.setTag(null);
        this.desc.setTag(null);
        this.descText.setTag(null);
        this.favorite.setTag(null);
        this.imgHomeItem.setTag(null);
        this.map.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView16 = (androidx.appcompat.widget.AppCompatImageView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (androidx.cardview.widget.CardView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView23 = (androidx.cardview.widget.CardView) bindings[23];
        this.mboundView23.setTag(null);
        this.price.setTag(null);
        this.refresh.setTag(null);
        this.report.setTag(null);
        this.selectedRc.setTag(null);
        this.share.setTag(null);
        this.shareOwner.setTag(null);
        this.tvHomeDesc.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvPormote.setTag(null);
        this.tvRemove.setTag(null);
        this.v19.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback28 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback25 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback26 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback23 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback19 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback24 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback17 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback21 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback20 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback22 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback18 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel ViewModel) {
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
                return onChangeViewModel((grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.adDetailsData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.homeData) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewModelHomeDataPriceConcatJavaLangStringConcatPriceAndroidStringCoin = null;
        java.lang.String viewModelHomeDataPrice = null;
        grand.app.akar.pages.auth.models.UserData viewModelAdDetailsDataListingUser = null;
        java.lang.String viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelAdDetailsDataListingListingOptions = null;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelAdDetailsDataJavaLangObjectNull = false;
        java.lang.String viewModelTitleConcatJavaLangStringConcatViewModelHomeDataAddress = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = null;
        java.lang.String viewModelHomeDataListingOptionsDesc = null;
        java.lang.String viewModelTitle = null;
        boolean viewModelUserDataTypeInt0 = false;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = 0;
        java.lang.String viewModelHomeDataAddress = null;
        grand.app.akar.pages.home.adapters.HomeAdapter viewModelHomeAdapter = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsDesc = null;
        int viewModelUserDataType = 0;
        int viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelHomeDataListingOptionsJavaLangObjectNull = false;
        java.lang.String viewModelAdDetailsDataListingUserName = null;
        java.lang.String viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        boolean viewModelUserDataTypeInt1 = false;
        int viewModelAdDetailsDataListingUserId = 0;
        grand.app.akar.pages.auth.models.UserData viewModelUserData = null;
        int viewModelUserDataId = 0;
        boolean viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalse = false;
        java.lang.String viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString = null;
        boolean viewModelAdDetailsDataListingUserIdViewModelUserDataId = false;
        boolean viewModelHomeDataListingOptionsDescJavaLangObjectNull = false;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = false;
        grand.app.akar.pages.adDetails.models.AdDetailsData viewModelAdDetailsData = null;
        grand.app.akar.pages.home.models.HomeData viewModelAdDetailsDataListing = null;
        grand.app.akar.pages.home.models.HomeData viewModelHomeData = null;
        java.lang.String viewModelAdDetailsDataListingUserImg = null;
        boolean viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = false;
        java.lang.String viewModelHomeDataPriceConcatJavaLangString = null;
        java.lang.String viewModelTitleConcatJavaLangString = null;
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelHomeDataListingOptions = null;
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.title;
                        // read viewModel.homeData
                        viewModelHomeData = viewModel.getHomeData();
                    }


                    if (viewModelTitle != null) {
                        // read viewModel.title.concat(" | ")
                        viewModelTitleConcatJavaLangString = viewModelTitle.concat(" | ");
                    }
                    if (viewModelHomeData != null) {
                        // read viewModel.homeData.price
                        viewModelHomeDataPrice = viewModelHomeData.getPrice();
                        // read viewModel.homeData.address
                        viewModelHomeDataAddress = viewModelHomeData.getAddress();
                        // read viewModel.homeData.listingOptions
                        viewModelHomeDataListingOptions = viewModelHomeData.getListingOptions();
                    }


                    if (viewModelHomeDataPrice != null) {
                        // read viewModel.homeData.price.concat(" ")
                        viewModelHomeDataPriceConcatJavaLangString = viewModelHomeDataPrice.concat(" ");
                    }
                    if (viewModelTitleConcatJavaLangString != null) {
                        // read viewModel.title.concat(" | ").concat(viewModel.homeData.address)
                        viewModelTitleConcatJavaLangStringConcatViewModelHomeDataAddress = viewModelTitleConcatJavaLangString.concat(viewModelHomeDataAddress);
                    }
                    // read viewModel.homeData.listingOptions != null
                    viewModelHomeDataListingOptionsJavaLangObjectNull = (viewModelHomeDataListingOptions) != (null);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelHomeDataListingOptionsJavaLangObjectNull) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    if (viewModelHomeDataPriceConcatJavaLangString != null) {
                        // read viewModel.homeData.price.concat(" ").concat(@android:string/coin)
                        viewModelHomeDataPriceConcatJavaLangStringConcatPriceAndroidStringCoin = viewModelHomeDataPriceConcatJavaLangString.concat(price.getResources().getString(R.string.coin));
                    }
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.homeAdapter
                        viewModelHomeAdapter = viewModel.getHomeAdapter();
                        // read viewModel.userData
                        viewModelUserData = viewModel.userData;
                    }


                    if (viewModelUserData != null) {
                        // read viewModel.userData.type
                        viewModelUserDataType = viewModelUserData.getType();
                    }


                    // read viewModel.userData.type == 0
                    viewModelUserDataTypeInt0 = (viewModelUserDataType) == (0);
                if((dirtyFlags & 0x9L) != 0) {
                    if(viewModelUserDataTypeInt0) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.adDetailsData
                        viewModelAdDetailsData = viewModel.getAdDetailsData();
                    }


                    // read viewModel.adDetailsData != null
                    viewModelAdDetailsDataJavaLangObjectNull = (viewModelAdDetailsData) != (null);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewModelAdDetailsDataJavaLangObjectNull) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                    if (viewModelAdDetailsData != null) {
                        // read viewModel.adDetailsData.listing
                        viewModelAdDetailsDataListing = viewModelAdDetailsData.getListing();
                    }


                    if (viewModelAdDetailsDataListing != null) {
                        // read viewModel.adDetailsData.listing.user
                        viewModelAdDetailsDataListingUser = viewModelAdDetailsDataListing.getUser();
                        // read viewModel.adDetailsData.listing.listingOptions
                        viewModelAdDetailsDataListingListingOptions = viewModelAdDetailsDataListing.getListingOptions();
                    }


                    if (viewModelAdDetailsDataListingUser != null) {
                        // read viewModel.adDetailsData.listing.user.name
                        viewModelAdDetailsDataListingUserName = viewModelAdDetailsDataListingUser.getName();
                        // read viewModel.adDetailsData.listing.user.img
                        viewModelAdDetailsDataListingUserImg = viewModelAdDetailsDataListingUser.getImg();
                    }
                    // read viewModel.adDetailsData.listing.listingOptions != null
                    viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = (viewModelAdDetailsDataListingListingOptions) != (null);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xa0000L) != 0) {

                if (viewModelHomeDataListingOptions != null) {
                    // read viewModel.homeData.listingOptions.desc
                    viewModelHomeDataListingOptionsDesc = viewModelHomeDataListingOptions.getDesc();
                }

            if ((dirtyFlags & 0x20000L) != 0) {

                    // read viewModel.homeData.listingOptions.desc != null
                    viewModelHomeDataListingOptionsDescJavaLangObjectNull = (viewModelHomeDataListingOptionsDesc) != (null);
            }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.desc
                    viewModelAdDetailsDataListingListingOptionsDesc = viewModelAdDetailsDataListingListingOptions.getDesc();
                }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                // read viewModel.userData.type == 1
                viewModelUserDataTypeInt1 = (viewModelUserDataType) == (1);
            if((dirtyFlags & 0x4000L) != 0) {
                if(viewModelUserDataTypeInt1) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt1) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.owner))) + (" )")) : (((" ( ") + (tvHomeDesc.getResources().getString(R.string.realtor))) + (" )")));
        }
        if ((dirtyFlags & 0x200000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.userId
                    viewModelAdDetailsDataListingUserId = viewModelAdDetailsDataListing.getUserId();
                }
                if (viewModel != null) {
                    // read viewModel.userData
                    viewModelUserData = viewModel.userData;
                }


                if (viewModelUserData != null) {
                    // read viewModel.userData.id
                    viewModelUserDataId = viewModelUserData.getId();
                }


                // read viewModel.adDetailsData.listing.userId == viewModel.userData.id
                viewModelAdDetailsDataListingUserIdViewModelUserDataId = (viewModelAdDetailsDataListingUserId) == (viewModelUserDataId);
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDesc) : (" "));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = ((viewModelAdDetailsDataJavaLangObjectNull) ? (viewModelAdDetailsDataListingUserIdViewModelUserDataId) : (false));
            if((dirtyFlags & 0xbL) != 0) {
                if(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x9L) != 0) {

                // read viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt0) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.seeker))) + (" )")) : (viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString));
        }
        if ((dirtyFlags & 0xdL) != 0) {

                // read viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false
                viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalse = ((viewModelHomeDataListingOptionsJavaLangObjectNull) ? (viewModelHomeDataListingOptionsDescJavaLangObjectNull) : (false));
                // read viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
                viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString = ((viewModelHomeDataListingOptionsJavaLangObjectNull) ? (viewModelHomeDataListingOptionsDesc) : (" "));
            if((dirtyFlags & 0xdL) != 0) {
                if(viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
                viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.adDesc.setVisibility(viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, viewModelTitleConcatJavaLangStringConcatViewModelHomeDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString);
            this.desc.setVisibility(viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            this.descText.setVisibility(viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, viewModelHomeDataPriceConcatJavaLangStringConcatPriceAndroidStringCoin);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.call.setOnClickListener(mCallback23);
            this.delete.setOnClickListener(mCallback28);
            this.favorite.setOnClickListener(mCallback22);
            this.map.setOnClickListener(mCallback20);
            this.mboundView1.setOnClickListener(mCallback17);
            this.mboundView16.setOnClickListener(mCallback21);
            this.mboundView2.setOnClickListener(mCallback18);
            this.refresh.setOnClickListener(mCallback26);
            this.report.setOnClickListener(mCallback25);
            this.share.setOnClickListener(mCallback24);
            this.shareOwner.setOnClickListener(mCallback27);
            this.tvPormote.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.imgHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView1.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView10, viewModelAdDetailsDataListingUserImg);
            this.mboundView18.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            this.mboundView23.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            this.tvHomeDesc.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelAdDetailsDataListingUserName);
            this.tvHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvPormote.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvRemove.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.v19.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewModelHomeAdapter, "1", "1");
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeDesc, viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.share();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.delete();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.report();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.updateDate();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.call();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.call();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.share();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.share();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toMap();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toMap();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel.homeData != null
                boolean viewModelHomeDataJavaLangObjectNull = false;
                // viewModel.homeData.id
                int viewModelHomeDataId = 0;
                // viewModel.homeData
                grand.app.akar.pages.home.models.HomeData viewModelHomeData = null;
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {





                    viewModelHomeData = viewModel.getHomeData();

                    viewModelHomeDataJavaLangObjectNull = (viewModelHomeData) != (null);
                    if (viewModelHomeDataJavaLangObjectNull) {


                        viewModelHomeDataId = viewModelHomeData.getId();

                        viewModel.removeFavorites(0, viewModelHomeDataId);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openEditDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.adDetailsData
        flag 2 (0x3L): viewModel.homeData
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 5 (0x6L): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 6 (0x7L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 9 (0xaL): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 10 (0xbL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 11 (0xcL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 15 (0x10L): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 16 (0x11L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false
        flag 17 (0x12L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc != null : false
        flag 18 (0x13L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
        flag 19 (0x14L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
        flag 20 (0x15L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
        flag 21 (0x16L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
    flag mapping end*/
    //end
}