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
        sViewsWithIds.put(R.id.searchContainer, 12);
        sViewsWithIds.put(R.id.cover_image, 13);
        sViewsWithIds.put(R.id.back, 14);
        sViewsWithIds.put(R.id.details_card, 15);
        sViewsWithIds.put(R.id.v18, 16);
        sViewsWithIds.put(R.id.v19, 17);
        sViewsWithIds.put(R.id.img_home_item, 18);
        sViewsWithIds.put(R.id.tv_home_desc, 19);
        sViewsWithIds.put(R.id.tv_pormote, 20);
        sViewsWithIds.put(R.id.tv_remove, 21);
        sViewsWithIds.put(R.id.br4, 22);
        sViewsWithIds.put(R.id.v5, 23);
        sViewsWithIds.put(R.id.call, 24);
        sViewsWithIds.put(R.id.share, 25);
        sViewsWithIds.put(R.id.report, 26);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentAdDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.constraintlayout.widget.Barrier) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[19]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[20]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[23]
            );
        this.adDesc.setTag(null);
        this.address.setTag(null);
        this.desc.setTag(null);
        this.descText.setTag(null);
        this.favorite.setTag(null);
        this.map.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (androidx.appcompat.widget.AppCompatImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.price.setTag(null);
        this.selectedRc.setTag(null);
        this.tvHomeItem.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback13 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback14 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
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
        else if (fieldId == BR.homeData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.adDetailsData) {
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
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelAdDetailsDataListingListingOptions = null;
        java.lang.String viewModelTitleConcatJavaLangStringConcatViewModelHomeDataAddress = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = null;
        java.lang.String viewModelHomeDataListingOptionsDesc = null;
        java.lang.String viewModelTitle = null;
        java.lang.String viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString = null;
        java.lang.String viewModelHomeDataAddress = null;
        grand.app.akar.pages.home.adapters.HomeAdapter viewModelHomeAdapter = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsDesc = null;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = false;
        boolean viewModelHomeDataListingOptionsJavaLangObjectNull = false;
        java.lang.String viewModelAdDetailsDataListingUserName = null;
        grand.app.akar.pages.adDetails.models.AdDetailsData viewModelAdDetailsData = null;
        grand.app.akar.pages.home.models.HomeData viewModelAdDetailsDataListing = null;
        grand.app.akar.pages.home.models.HomeData viewModelHomeData = null;
        java.lang.String viewModelAdDetailsDataListingUserImg = null;
        java.lang.String viewModelHomeDataPriceConcatJavaLangString = null;
        java.lang.String viewModelTitleConcatJavaLangString = null;
        int viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewVISIBLEViewGONE = 0;
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelHomeDataListingOptions = null;
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

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
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewModelHomeDataListingOptionsJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
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
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.adDetailsData
                        viewModelAdDetailsData = viewModel.getAdDetailsData();
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
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.adDetailsData.listing.listingOptions != null ? View.VISIBLE : View.GONE
                    viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModelHomeDataListingOptions != null) {
                    // read viewModel.homeData.listingOptions.desc
                    viewModelHomeDataListingOptionsDesc = viewModelHomeDataListingOptions.getDesc();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.desc
                    viewModelAdDetailsDataListingListingOptionsDesc = viewModelAdDetailsDataListingListingOptions.getDesc();
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDesc) : (" "));
        }
        if ((dirtyFlags & 0xbL) != 0) {

                // read viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
                viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString = ((viewModelHomeDataListingOptionsJavaLangObjectNull) ? (viewModelHomeDataListingOptionsDesc) : (" "));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.adDesc.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.descText.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewVISIBLEViewGONE);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView6, viewModelAdDetailsDataListingUserImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelAdDetailsDataListingUserName);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, viewModelTitleConcatJavaLangStringConcatViewModelHomeDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, viewModelHomeDataListingOptionsJavaLangObjectNullViewModelHomeDataListingOptionsDescJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, viewModelHomeDataPriceConcatJavaLangStringConcatPriceAndroidStringCoin);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.favorite.setOnClickListener(mCallback15);
            this.map.setOnClickListener(mCallback13);
            this.mboundView9.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewModelHomeAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
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
            case 1: {
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


                    viewModel.toMap();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.homeData
        flag 2 (0x3L): viewModel.adDetailsData
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 5 (0x6L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 6 (0x7L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
        flag 7 (0x8L): viewModel.homeData.listingOptions != null ? viewModel.homeData.listingOptions.desc : " "
        flag 8 (0x9L): viewModel.adDetailsData.listing.listingOptions != null ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.adDetailsData.listing.listingOptions != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}