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
        sViewsWithIds.put(R.id.cover_image, 28);
        sViewsWithIds.put(R.id.back, 29);
        sViewsWithIds.put(R.id.details_card, 30);
        sViewsWithIds.put(R.id.v18, 31);
        sViewsWithIds.put(R.id.br4, 32);
        sViewsWithIds.put(R.id.v5, 33);
        sViewsWithIds.put(R.id.heart, 34);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView11;
    @NonNull
    private final de.hdodenhof.circleimageview.CircleImageView mboundView17;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView19;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView24;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private FragmentAdDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[29]
            , (androidx.constraintlayout.widget.Barrier) bindings[32]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[21]
            , (com.smarteist.autoimageslider.SliderView) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[27]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[20]
            , (com.github.florent37.shapeofview.shapes.BubbleView) bindings[34]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[26]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[9]
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
        this.mboundView11 = (androidx.appcompat.widget.AppCompatImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView17 = (de.hdodenhof.circleimageview.CircleImageView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView19 = (androidx.cardview.widget.CardView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView24 = (androidx.cardview.widget.CardView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.price.setTag(null);
        this.refresh.setTag(null);
        this.report.setTag(null);
        this.searchContainer.setTag(null);
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
        mCallback27 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback30 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback28 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback32 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback31 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback37 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback38 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback35 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback36 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback33 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback29 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback34 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelAdDetailsDataListingPrice = null;
        grand.app.akar.pages.auth.models.UserData viewModelAdDetailsDataListingUser = null;
        java.lang.String viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelAdDetailsDataListingListingOptions = null;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelAdDetailsDataJavaLangObjectNull = false;
        java.lang.String viewModelAdDetailsDataListingPriceConcatJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin = null;
        java.lang.String viewModelTitle = null;
        boolean viewModelUserDataTypeInt0 = false;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = 0;
        int viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        grand.app.akar.pages.home.adapters.HomeAdapter viewModelHomeAdapter = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsDesc = null;
        int viewModelUserDataType = 0;
        java.lang.String viewModelAdDetailsDataListingUserName = null;
        java.lang.String viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = null;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        boolean viewModelUserDataTypeInt1 = false;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = null;
        int viewModelAdDetailsDataListingUserId = 0;
        grand.app.akar.pages.auth.models.UserData viewModelUserData = null;
        java.lang.String viewModelAdDetailsDataListingAddress = null;
        grand.app.akar.pages.home.models.DefaultImg viewModelAdDetailsDataListingDefaultImg = null;
        int viewModelUserDataId = 0;
        boolean viewModelAdDetailsDataListingJavaLangObjectNull = false;
        boolean viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull = false;
        boolean viewModelAdDetailsDataListingUserIdViewModelUserDataId = false;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = false;
        grand.app.akar.pages.adDetails.models.AdDetailsData viewModelAdDetailsData = null;
        grand.app.akar.pages.home.models.HomeData viewModelAdDetailsDataListing = null;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse = false;
        java.lang.String viewModelAdDetailsDataListingDefaultImgMedia = null;
        java.lang.String viewModelAdDetailsDataListingUserImg = null;
        boolean viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = false;
        java.lang.String viewModelTitleConcatJavaLangString = null;
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.title
                    viewModelTitle = viewModel.title;
                    // read viewModel.adDetailsData
                    viewModelAdDetailsData = viewModel.getAdDetailsData();
                }


                if (viewModelTitle != null) {
                    // read viewModel.title.concat(" | ")
                    viewModelTitleConcatJavaLangString = viewModelTitle.concat(" | ");
                }
                // read viewModel.adDetailsData != null
                viewModelAdDetailsDataJavaLangObjectNull = (viewModelAdDetailsData) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataJavaLangObjectNull) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
                if (viewModelAdDetailsData != null) {
                    // read viewModel.adDetailsData.listing
                    viewModelAdDetailsDataListing = viewModelAdDetailsData.getListing();
                }


                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.price
                    viewModelAdDetailsDataListingPrice = viewModelAdDetailsDataListing.getPrice();
                    // read viewModel.adDetailsData.listing.user
                    viewModelAdDetailsDataListingUser = viewModelAdDetailsDataListing.getUser();
                    // read viewModel.adDetailsData.listing.listingOptions
                    viewModelAdDetailsDataListingListingOptions = viewModelAdDetailsDataListing.getListingOptions();
                    // read viewModel.adDetailsData.listing.defaultImg
                    viewModelAdDetailsDataListingDefaultImg = viewModelAdDetailsDataListing.getDefaultImg();
                }
                // read viewModel.adDetailsData.listing != null
                viewModelAdDetailsDataListingJavaLangObjectNull = (viewModelAdDetailsDataListing) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                if (viewModelAdDetailsDataListingPrice != null) {
                    // read viewModel.adDetailsData.listing.price.concat(" ")
                    viewModelAdDetailsDataListingPriceConcatJavaLangString = viewModelAdDetailsDataListingPrice.concat(" ");
                }
                if (viewModelAdDetailsDataListingUser != null) {
                    // read viewModel.adDetailsData.listing.user.name
                    viewModelAdDetailsDataListingUserName = viewModelAdDetailsDataListingUser.getName();
                    // read viewModel.adDetailsData.listing.user.img
                    viewModelAdDetailsDataListingUserImg = viewModelAdDetailsDataListingUser.getImg();
                }
                // read viewModel.adDetailsData.listing.listingOptions != null
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = (viewModelAdDetailsDataListingListingOptions) != (null);
                // read viewModel.adDetailsData.listing != null ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x80000L;
                }
            }
                if (viewModelAdDetailsDataListingDefaultImg != null) {
                    // read viewModel.adDetailsData.listing.defaultImg.media
                    viewModelAdDetailsDataListingDefaultImgMedia = viewModelAdDetailsDataListingDefaultImg.getMedia();
                }


                if (viewModelAdDetailsDataListingPriceConcatJavaLangString != null) {
                    // read viewModel.adDetailsData.listing.price.concat(" ").concat(@android:string/coin)
                    viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin = viewModelAdDetailsDataListingPriceConcatJavaLangString.concat(price.getResources().getString(R.string.coin));
                }
            if ((dirtyFlags & 0x5L) != 0) {

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
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeInt0) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100100L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.desc
                    viewModelAdDetailsDataListingListingOptionsDesc = viewModelAdDetailsDataListingListingOptions.getDesc();
                }

            if ((dirtyFlags & 0x100000L) != 0) {

                    // read viewModel.adDetailsData.listing.listingOptions.desc != null
                    viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull = (viewModelAdDetailsDataListingListingOptionsDesc) != (null);
            }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                // read viewModel.userData.type == 1
                viewModelUserDataTypeInt1 = (viewModelUserDataType) == (1);
            if((dirtyFlags & 0x8000L) != 0) {
                if(viewModelUserDataTypeInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt1) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.owner))) + (" )")) : (((" ( ") + (tvHomeDesc.getResources().getString(R.string.realtor))) + (" )")));
        }
        if ((dirtyFlags & 0x400000L) != 0) {

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
        if ((dirtyFlags & 0x40000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.address
                    viewModelAdDetailsDataListingAddress = viewModelAdDetailsDataListing.getAddress();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDesc) : (" "));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingAddress) : (""));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull) : (false));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = ((viewModelAdDetailsDataJavaLangObjectNull) ? (viewModelAdDetailsDataListingUserIdViewModelUserDataId) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x200L;
                }
            }


                if (viewModelTitleConcatJavaLangString != null) {
                    // read viewModel.title.concat(" | ").concat(viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : "")
                    viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = viewModelTitleConcatJavaLangString.concat(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString);
                }
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x5L) != 0) {

                // read viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt0) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.seeker))) + (" )")) : (viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.adDesc.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.desc.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.descText.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            this.imgHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView11, viewModelAdDetailsDataListingUserImg);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView17, viewModelAdDetailsDataListingDefaultImgMedia);
            this.mboundView19.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView24.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin);
            this.searchContainer.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvHomeDesc.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelAdDetailsDataListingUserName);
            this.tvHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvPormote.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvRemove.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.v19.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.call.setOnClickListener(mCallback33);
            this.delete.setOnClickListener(mCallback38);
            this.favorite.setOnClickListener(mCallback32);
            this.map.setOnClickListener(mCallback30);
            this.mboundView17.setOnClickListener(mCallback31);
            this.mboundView2.setOnClickListener(mCallback27);
            this.mboundView3.setOnClickListener(mCallback28);
            this.refresh.setOnClickListener(mCallback36);
            this.report.setOnClickListener(mCallback35);
            this.share.setOnClickListener(mCallback34);
            this.shareOwner.setOnClickListener(mCallback37);
            this.tvPormote.setOnClickListener(mCallback29);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewModelHomeAdapter, "1", "1");
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeDesc, viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
            case 6: {
                // localize variables for thread safety
                // viewModel.adDetailsData.listing.id
                int viewModelAdDetailsDataListingId = 0;
                // viewModel
                grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
                // viewModel.adDetailsData != null
                boolean viewModelAdDetailsDataJavaLangObjectNull = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.adDetailsData
                grand.app.akar.pages.adDetails.models.AdDetailsData viewModelAdDetailsData = null;
                // viewModel.adDetailsData.listing != null
                boolean viewModelAdDetailsDataListingJavaLangObjectNull = false;
                // viewModel.adDetailsData.listing
                grand.app.akar.pages.home.models.HomeData viewModelAdDetailsDataListing = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {





                    viewModelAdDetailsData = viewModel.getAdDetailsData();

                    viewModelAdDetailsDataJavaLangObjectNull = (viewModelAdDetailsData) != (null);
                    if (viewModelAdDetailsDataJavaLangObjectNull) {


                        viewModelAdDetailsDataListing = viewModelAdDetailsData.getListing();

                        viewModelAdDetailsDataListingJavaLangObjectNull = (viewModelAdDetailsDataListing) != (null);
                        if (viewModelAdDetailsDataListingJavaLangObjectNull) {


                            viewModelAdDetailsDataListingId = viewModelAdDetailsDataListing.getId();

                            viewModel.removeFavorites(0, viewModelAdDetailsDataListingId);
                        }
                    }
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


                    viewModel.removeDialog();
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.adDetailsData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 4 (0x5L): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 5 (0x6L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 8 (0x9L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 9 (0xaL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 10 (0xbL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 11 (0xcL): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.adDetailsData.listing != null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.adDetailsData.listing != null ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 16 (0x11L): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 17 (0x12L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
        flag 18 (0x13L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
        flag 19 (0x14L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
        flag 20 (0x15L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
        flag 21 (0x16L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
        flag 22 (0x17L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
    flag mapping end*/
    //end
}