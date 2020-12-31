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
        sViewsWithIds.put(R.id.searchContainer, 63);
        sViewsWithIds.put(R.id.cover_image, 64);
        sViewsWithIds.put(R.id.details_card, 65);
        sViewsWithIds.put(R.id.ad_area, 66);
        sViewsWithIds.put(R.id.v24, 67);
        sViewsWithIds.put(R.id.ad_building, 68);
        sViewsWithIds.put(R.id.v28, 69);
        sViewsWithIds.put(R.id.ad_building_year, 70);
        sViewsWithIds.put(R.id.v29, 71);
        sViewsWithIds.put(R.id.ad_payment, 72);
        sViewsWithIds.put(R.id.v30, 73);
        sViewsWithIds.put(R.id.ad_doc, 74);
        sViewsWithIds.put(R.id.v31, 75);
        sViewsWithIds.put(R.id.ad_id, 76);
        sViewsWithIds.put(R.id.v32, 77);
        sViewsWithIds.put(R.id.ad_last_updated, 78);
        sViewsWithIds.put(R.id.v33, 79);
        sViewsWithIds.put(R.id.ad_views, 80);
        sViewsWithIds.put(R.id.v34, 81);
        sViewsWithIds.put(R.id.br4, 82);
        sViewsWithIds.put(R.id.v5, 83);
        sViewsWithIds.put(R.id.heart, 84);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView45;
    @NonNull
    private final grand.app.akar.customViews.views.CustomTextViewRegular mboundView50;
    @NonNull
    private final de.hdodenhof.circleimageview.CircleImageView mboundView52;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView54;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView59;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
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
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAdDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 85, sIncludes, sViewsWithIds));
    }
    private FragmentAdDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[66]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[68]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[23]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[70]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[33]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[39]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[74]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[35]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[21]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[76]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[36]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[31]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[32]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[26]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[78]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[37]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[72]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[34]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[19]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[29]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[80]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[38]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[82]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[56]
            , (com.smarteist.autoimageslider.SliderView) bindings[64]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[62]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[40]
            , (androidx.cardview.widget.CardView) bindings[65]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[55]
            , (com.github.florent37.shapeofview.shapes.BubbleView) bindings[84]
            , (com.google.android.material.card.MaterialCardView) bindings[44]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[51]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[60]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[58]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[63]
            , (androidx.recyclerview.widget.RecyclerView) bindings[53]
            , (androidx.recyclerview.widget.RecyclerView) bindings[42]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[57]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[61]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[47]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[46]
            , (androidx.cardview.widget.CardView) bindings[48]
            , (androidx.cardview.widget.CardView) bindings[49]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[41]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[67]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[69]
            , (android.view.View) bindings[71]
            , (android.view.View) bindings[73]
            , (android.view.View) bindings[75]
            , (android.view.View) bindings[77]
            , (android.view.View) bindings[79]
            , (android.view.View) bindings[81]
            , (android.view.View) bindings[43]
            , (android.view.View) bindings[83]
            );
        this.adAreaTxt.setTag(null);
        this.adBathN.setTag(null);
        this.adBathNTxt.setTag(null);
        this.adBuildingTxt.setTag(null);
        this.adBuildingYearTxt.setTag(null);
        this.adDesc.setTag(null);
        this.adDocTxt.setTag(null);
        this.adFloorN.setTag(null);
        this.adFloorNTxt.setTag(null);
        this.adFontTxt.setTag(null);
        this.adFront.setTag(null);
        this.adIdTxt.setTag(null);
        this.adKitchenN.setTag(null);
        this.adKitchenNTxt.setTag(null);
        this.adLand.setTag(null);
        this.adLandTxt.setTag(null);
        this.adLastUpdatedTxt.setTag(null);
        this.adPaymentTxt.setTag(null);
        this.adRoomN.setTag(null);
        this.adRoomNTxt.setTag(null);
        this.adStreetWidth.setTag(null);
        this.adStreetWidthTxt.setTag(null);
        this.adTotalArea.setTag(null);
        this.adTotalAreaTxt.setTag(null);
        this.adViewsTxt.setTag(null);
        this.address.setTag(null);
        this.back.setTag(null);
        this.call.setTag(null);
        this.delete.setTag(null);
        this.desc.setTag(null);
        this.descText.setTag(null);
        this.favorite.setTag(null);
        this.imgHomeItem.setTag(null);
        this.map.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView45 = (androidx.appcompat.widget.AppCompatImageView) bindings[45];
        this.mboundView45.setTag(null);
        this.mboundView50 = (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[50];
        this.mboundView50.setTag(null);
        this.mboundView52 = (de.hdodenhof.circleimageview.CircleImageView) bindings[52];
        this.mboundView52.setTag(null);
        this.mboundView54 = (androidx.cardview.widget.CardView) bindings[54];
        this.mboundView54.setTag(null);
        this.mboundView59 = (androidx.cardview.widget.CardView) bindings[59];
        this.mboundView59.setTag(null);
        this.price.setTag(null);
        this.refresh.setTag(null);
        this.report.setTag(null);
        this.selectedRc.setTag(null);
        this.servicesRc.setTag(null);
        this.share.setTag(null);
        this.shareOwner.setTag(null);
        this.tvHomeDesc.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvPormote.setTag(null);
        this.tvRemove.setTag(null);
        this.v18.setTag(null);
        this.v19.setTag(null);
        this.v20.setTag(null);
        this.v21.setTag(null);
        this.v22.setTag(null);
        this.v23.setTag(null);
        this.v25.setTag(null);
        this.v26.setTag(null);
        this.v27.setTag(null);
        this.v35.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback37 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback38 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback35 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback36 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback33 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback34 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback30 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback42 = new grand.app.akar.generated.callback.OnClickListener(this, 14);
        mCallback32 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback31 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback40 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback41 = new grand.app.akar.generated.callback.OnClickListener(this, 13);
        mCallback29 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
                mDirtyFlags_1 = 0x0L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
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
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalse = false;
        grand.app.akar.pages.adDetails.models.ListingOptions viewModelAdDetailsDataListingListingOptions = null;
        boolean viewModelAdDetailsDataJavaLangObjectNull = false;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalse = false;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeterJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingDocType = null;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingCreatedAtJavaLangString = null;
        java.lang.String viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingPaymentMethod = null;
        java.lang.String viewModelTitle = null;
        java.lang.String stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangString = null;
        boolean viewModelUserDataTypeInt0 = false;
        java.lang.String stringValueOfViewModelAdDetailsDataListingListingOptionsFrontNo = null;
        int viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelAdDetailsDataListingListingOptionsDesc = null;
        int viewModelAdDetailsDataListingListingOptionsStreetWidth = 0;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelAdDetailsDataListingUserName = null;
        java.lang.String viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingBathroomNo = null;
        java.lang.String viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        boolean viewModelUserDataTypeInt1 = false;
        java.lang.String viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = null;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalse = false;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelBuildingAgeViewModelAdDetailsData = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingViewsJavaLangString = null;
        boolean viewModelAdDetailsDataListingAreaEqualsJavaLangString0 = false;
        int viewModelAdDetailsDataListingUserId = 0;
        grand.app.akar.pages.auth.models.UserData viewModelUserData = null;
        grand.app.akar.pages.home.models.DefaultImg viewModelAdDetailsDataListingDefaultImg = null;
        boolean viewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0 = false;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalse = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsFrontNoJavaLangString = null;
        boolean viewModelAdDetailsDataListingJavaLangObjectNull = false;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalse = false;
        int viewModelAdDetailsDataListingId = 0;
        java.lang.String viewModelAdDetailsDataListingArea = null;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalse = false;
        java.lang.String viewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeter = null;
        boolean viewModelAdDetailsDataListingRoomNoEqualsJavaLangString0 = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullStringValueOfViewModelAdDetailsDataListingIdJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingCreatedAt = null;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalse = false;
        java.lang.String viewModelAdDetailsDataListingFloorNo = null;
        boolean viewModelAdDetailsDataListingListingOptionsStreetWidthInt0 = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoJavaLangString = null;
        boolean viewModelAdDetailsDataListingFloorNoEqualsJavaLangString0 = false;
        java.lang.String viewModelAdDetailsDataListingBuildingYear = null;
        java.lang.String viewModelAdDetailsDataListingAreaConcatJavaLangString = null;
        boolean ViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString01 = false;
        grand.app.akar.pages.home.models.HomeData viewModelAdDetailsDataListing = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYearJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingTotalAreaConcatJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingUserImg = null;
        boolean viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = false;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTitleConcatJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingTotalArea = null;
        grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel viewModel = mViewModel;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingPrice = null;
        grand.app.akar.pages.auth.models.UserData viewModelAdDetailsDataListingUser = null;
        java.lang.String viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYear = null;
        java.lang.String viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = null;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeterJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingPriceConcatJavaLangString = null;
        boolean viewModelAdDetailsDataListingListingOptionsFrontNoInt0 = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBuildingYearJavaLangString = null;
        java.lang.String viewModelAdDetailsDataListingFloorArea = null;
        java.lang.String viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin = null;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalse = false;
        int viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = 0;
        java.lang.String viewModelAdDetailsDataListingViews = null;
        grand.app.akar.pages.home.adapters.HomeAdapter viewModelHomeAdapter = null;
        java.lang.String stringValueOfViewModelAdDetailsDataListingId = null;
        int viewModelUserDataType = 0;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseViewVISIBLEViewGONE = 0;
        grand.app.akar.pages.adDetails.adapters.ServicesAdapter viewModelServicesAdapter = null;
        java.lang.String viewModelAdDetailsDataListingAddress = null;
        boolean ViewModelAdDetailsDataListingAreaEqualsJavaLangString01 = false;
        boolean viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalse = false;
        int viewModelUserDataId = 0;
        java.lang.String stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidth = null;
        boolean viewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0 = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeterJavaLangString = null;
        boolean viewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0 = false;
        boolean viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull = false;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingPaymentMethodJavaLangString = null;
        boolean ViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString01 = false;
        boolean viewModelAdDetailsDataListingUserIdViewModelUserDataId = false;
        java.lang.String stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeter = null;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = false;
        java.lang.String viewModelAdDetailsDataListingRoomNo = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeterJavaLangString = null;
        boolean ViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString01 = false;
        grand.app.akar.pages.adDetails.models.AdDetailsData viewModelAdDetailsData = null;
        java.lang.String viewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeter = null;
        java.lang.String viewModelAdDetailsDataListingFloorAreaConcatJavaLangString = null;
        boolean viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse = false;
        java.lang.String viewModelAdDetailsDataListingDefaultImgMedia = null;
        int viewModelAdDetailsDataListingListingOptionsFrontNo = 0;
        int viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelAdDetailsDataListingKitchenNo = null;
        java.lang.String viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingDocTypeJavaLangString = null;
        boolean ViewModelAdDetailsDataListingRoomNoEqualsJavaLangString01 = false;
        java.lang.String viewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeter = null;
        boolean ViewModelAdDetailsDataListingFloorNoEqualsJavaLangString01 = false;

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
                        dirtyFlags |= 0x10000000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000000L;
                }
            }
                if (viewModelAdDetailsData != null) {
                    // read viewModel.adDetailsData.listing
                    viewModelAdDetailsDataListing = viewModelAdDetailsData.getListing();
                }


                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.listingOptions
                    viewModelAdDetailsDataListingListingOptions = viewModelAdDetailsDataListing.getListingOptions();
                    // read viewModel.adDetailsData.listing.defaultImg
                    viewModelAdDetailsDataListingDefaultImg = viewModelAdDetailsDataListing.getDefaultImg();
                    // read viewModel.adDetailsData.listing.price
                    viewModelAdDetailsDataListingPrice = viewModelAdDetailsDataListing.getPrice();
                    // read viewModel.adDetailsData.listing.user
                    viewModelAdDetailsDataListingUser = viewModelAdDetailsDataListing.getUser();
                }
                // read viewModel.adDetailsData.listing != null
                viewModelAdDetailsDataListingJavaLangObjectNull = (viewModelAdDetailsDataListing) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x4000000L;
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x100000000L;
                        dirtyFlags |= 0x1000000000L;
                        dirtyFlags |= 0x10000000000L;
                        dirtyFlags |= 0x40000000000L;
                        dirtyFlags |= 0x100000000000L;
                        dirtyFlags |= 0x400000000000L;
                        dirtyFlags |= 0x1000000000000L;
                        dirtyFlags |= 0x4000000000000L;
                        dirtyFlags |= 0x100000000000000L;
                        dirtyFlags |= 0x4000000000000000L;
                        dirtyFlags_1 |= 0x1L;
                        dirtyFlags_1 |= 0x4L;
                        dirtyFlags_1 |= 0x100L;
                        dirtyFlags_1 |= 0x400L;
                        dirtyFlags_1 |= 0x1000L;
                        dirtyFlags_1 |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x2000000L;
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x80000000L;
                        dirtyFlags |= 0x800000000L;
                        dirtyFlags |= 0x8000000000L;
                        dirtyFlags |= 0x20000000000L;
                        dirtyFlags |= 0x80000000000L;
                        dirtyFlags |= 0x200000000000L;
                        dirtyFlags |= 0x800000000000L;
                        dirtyFlags |= 0x2000000000000L;
                        dirtyFlags |= 0x80000000000000L;
                        dirtyFlags |= 0x2000000000000000L;
                        dirtyFlags |= 0x8000000000000000L;
                        dirtyFlags_1 |= 0x2L;
                        dirtyFlags_1 |= 0x80L;
                        dirtyFlags_1 |= 0x200L;
                        dirtyFlags_1 |= 0x800L;
                        dirtyFlags_1 |= 0x200000L;
                }
            }


                // read viewModel.adDetailsData.listing.listingOptions != null
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull = (viewModelAdDetailsDataListingListingOptions) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x1000000L;
                        dirtyFlags_1 |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x800000L;
                        dirtyFlags_1 |= 0x20000L;
                }
            }
                if (viewModelAdDetailsDataListingDefaultImg != null) {
                    // read viewModel.adDetailsData.listing.defaultImg.media
                    viewModelAdDetailsDataListingDefaultImgMedia = viewModelAdDetailsDataListingDefaultImg.getMedia();
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


                if (viewModelAdDetailsDataListingPriceConcatJavaLangString != null) {
                    // read viewModel.adDetailsData.listing.price.concat(" ").concat(@android:string/coin)
                    viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin = viewModelAdDetailsDataListingPriceConcatJavaLangString.concat(price.getResources().getString(R.string.coin));
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userData
                        viewModelUserData = viewModel.userData;
                        // read viewModel.homeAdapter
                        viewModelHomeAdapter = viewModel.getHomeAdapter();
                        // read viewModel.servicesAdapter
                        viewModelServicesAdapter = viewModel.getServicesAdapter();
                    }


                    if (viewModelUserData != null) {
                        // read viewModel.userData.type
                        viewModelUserDataType = viewModelUserData.getType();
                    }


                    // read viewModel.userData.type == 0
                    viewModelUserDataTypeInt0 = (viewModelUserDataType) == (0);
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalse) {
                        dirtyFlags_1 |= 0x10000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000L;
                }
            }
        }
        if ((dirtyFlags_1 & 0x400000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.docType
                    viewModelAdDetailsDataListingDocType = viewModelAdDetailsDataListing.getDocType();
                }
        }
        if ((dirtyFlags_1 & 0x1000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.paymentMethod
                    viewModelAdDetailsDataListingPaymentMethod = viewModelAdDetailsDataListing.getPaymentMethod();
                }
        }
        if ((dirtyFlags & 0x1000L) != 0 || (dirtyFlags_1 & 0x40000L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.desc
                    viewModelAdDetailsDataListingListingOptionsDesc = viewModelAdDetailsDataListingListingOptions.getDesc();
                }

            if ((dirtyFlags_1 & 0x40000L) != 0) {

                    // read viewModel.adDetailsData.listing.listingOptions.desc != null
                    viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull = (viewModelAdDetailsDataListingListingOptionsDesc) != (null);
            }
        }
        if ((dirtyFlags & 0x10000000000L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.streetWidth
                    viewModelAdDetailsDataListingListingOptionsStreetWidth = viewModelAdDetailsDataListingListingOptions.getStreetWidth();
                }


                // read viewModel.adDetailsData.listing.listingOptions.streetWidth != 0
                viewModelAdDetailsDataListingListingOptionsStreetWidthInt0 = (viewModelAdDetailsDataListingListingOptionsStreetWidth) != (0);
        }
        if ((dirtyFlags & 0x400040000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.bathroomNo
                    viewModelAdDetailsDataListingBathroomNo = viewModelAdDetailsDataListing.getBathroomNo();
                }

            if ((dirtyFlags & 0x400000000000L) != 0) {

                    if (viewModelAdDetailsDataListingBathroomNo != null) {
                        // read viewModel.adDetailsData.listing.bathroomNo.equals("0")
                        ViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString01 = viewModelAdDetailsDataListingBathroomNo.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.bathroomNo.equals("0")
                    viewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0 = !ViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString01;
            }
        }
        if ((dirtyFlags & 0x200000L) != 0) {

                // read viewModel.userData.type == 1
                viewModelUserDataTypeInt1 = (viewModelUserDataType) == (1);
            if((dirtyFlags & 0x200000L) != 0) {
                if(viewModelUserDataTypeInt1) {
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                }
            }


                // read viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt1) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.owner))) + (" )")) : (((" ( ") + (tvHomeDesc.getResources().getString(R.string.realtor))) + (" )")));
        }
        if ((dirtyFlags & 0x4000000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.buildingAge(viewModel.adDetailsData)
                    viewModelBuildingAgeViewModelAdDetailsData = viewModel.buildingAge(viewModelAdDetailsData);
                }


                if (viewModelBuildingAgeViewModelAdDetailsData != null) {
                    // read viewModel.buildingAge(viewModel.adDetailsData).concat(" ")
                    viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangString = viewModelBuildingAgeViewModelAdDetailsData.concat(" ");
                }


                if (viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangString != null) {
                    // read viewModel.buildingAge(viewModel.adDetailsData).concat(" ").concat(@android:string/year)
                    viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYear = viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangString.concat(adBuildingTxt.getResources().getString(R.string.year));
                }
        }
        if ((dirtyFlags & 0x10000000000000L) != 0) {

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
        if ((dirtyFlags & 0x100000000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.id
                    viewModelAdDetailsDataListingId = viewModelAdDetailsDataListing.getId();
                }


                // read String.valueOf(viewModel.adDetailsData.listing.id)
                stringValueOfViewModelAdDetailsDataListingId = java.lang.String.valueOf(viewModelAdDetailsDataListingId);
        }
        if ((dirtyFlags & 0x4000400L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.area
                    viewModelAdDetailsDataListingArea = viewModelAdDetailsDataListing.getArea();
                }

            if ((dirtyFlags & 0x4000000L) != 0) {

                    if (viewModelAdDetailsDataListingArea != null) {
                        // read viewModel.adDetailsData.listing.area.equals("0")
                        viewModelAdDetailsDataListingAreaEqualsJavaLangString0 = viewModelAdDetailsDataListingArea.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.area.equals("0")
                    ViewModelAdDetailsDataListingAreaEqualsJavaLangString01 = !viewModelAdDetailsDataListingAreaEqualsJavaLangString0;
            }
            if ((dirtyFlags & 0x400L) != 0) {

                    if (viewModelAdDetailsDataListingArea != null) {
                        // read viewModel.adDetailsData.listing.area.concat(" ")
                        viewModelAdDetailsDataListingAreaConcatJavaLangString = viewModelAdDetailsDataListingArea.concat(" ");
                    }


                    if (viewModelAdDetailsDataListingAreaConcatJavaLangString != null) {
                        // read viewModel.adDetailsData.listing.area.concat(" ").concat(@android:string/meter)
                        viewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeter = viewModelAdDetailsDataListingAreaConcatJavaLangString.concat(adLandTxt.getResources().getString(R.string.meter));
                    }
            }
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.createdAt
                    viewModelAdDetailsDataListingCreatedAt = viewModelAdDetailsDataListing.getCreatedAt();
                }
        }
        if ((dirtyFlags & 0x4040L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.floorNo
                    viewModelAdDetailsDataListingFloorNo = viewModelAdDetailsDataListing.getFloorNo();
                }

            if ((dirtyFlags & 0x40L) != 0) {

                    if (viewModelAdDetailsDataListingFloorNo != null) {
                        // read viewModel.adDetailsData.listing.floorNo.equals("0")
                        viewModelAdDetailsDataListingFloorNoEqualsJavaLangString0 = viewModelAdDetailsDataListingFloorNo.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.floorNo.equals("0")
                    ViewModelAdDetailsDataListingFloorNoEqualsJavaLangString01 = !viewModelAdDetailsDataListingFloorNoEqualsJavaLangString0;
            }
        }
        if ((dirtyFlags_1 & 0x1L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.buildingYear
                    viewModelAdDetailsDataListingBuildingYear = viewModelAdDetailsDataListing.getBuildingYear();
                }
        }
        if ((dirtyFlags_1 & 0x500L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.totalArea
                    viewModelAdDetailsDataListingTotalArea = viewModelAdDetailsDataListing.getTotalArea();
                }

            if ((dirtyFlags_1 & 0x100L) != 0) {

                    if (viewModelAdDetailsDataListingTotalArea != null) {
                        // read viewModel.adDetailsData.listing.totalArea.equals("0")
                        viewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0 = viewModelAdDetailsDataListingTotalArea.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.totalArea.equals("0")
                    ViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString01 = !viewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0;
            }
            if ((dirtyFlags_1 & 0x400L) != 0) {

                    if (viewModelAdDetailsDataListingTotalArea != null) {
                        // read viewModel.adDetailsData.listing.totalArea.concat(" ")
                        viewModelAdDetailsDataListingTotalAreaConcatJavaLangString = viewModelAdDetailsDataListingTotalArea.concat(" ");
                    }


                    if (viewModelAdDetailsDataListingTotalAreaConcatJavaLangString != null) {
                        // read viewModel.adDetailsData.listing.totalArea.concat(" ").concat(@android:string/meter)
                        viewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeter = viewModelAdDetailsDataListingTotalAreaConcatJavaLangString.concat(adTotalAreaTxt.getResources().getString(R.string.meter));
                    }
            }
        }
        if ((dirtyFlags & 0x4000000000000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.floorArea
                    viewModelAdDetailsDataListingFloorArea = viewModelAdDetailsDataListing.getFloorArea();
                }


                if (viewModelAdDetailsDataListingFloorArea != null) {
                    // read viewModel.adDetailsData.listing.floorArea.concat(" ")
                    viewModelAdDetailsDataListingFloorAreaConcatJavaLangString = viewModelAdDetailsDataListingFloorArea.concat(" ");
                }


                if (viewModelAdDetailsDataListingFloorAreaConcatJavaLangString != null) {
                    // read viewModel.adDetailsData.listing.floorArea.concat(" ").concat(@android:string/meter)
                    viewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeter = viewModelAdDetailsDataListingFloorAreaConcatJavaLangString.concat(adAreaTxt.getResources().getString(R.string.meter));
                }
        }
        if ((dirtyFlags & 0x100000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.views
                    viewModelAdDetailsDataListingViews = viewModelAdDetailsDataListing.getViews();
                }
        }
        if ((dirtyFlags & 0x1000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.address
                    viewModelAdDetailsDataListingAddress = viewModelAdDetailsDataListing.getAddress();
                }
        }
        if ((dirtyFlags & 0x1040000000000L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.roomNo
                    viewModelAdDetailsDataListingRoomNo = viewModelAdDetailsDataListing.getRoomNo();
                }

            if ((dirtyFlags & 0x40000000000L) != 0) {

                    if (viewModelAdDetailsDataListingRoomNo != null) {
                        // read viewModel.adDetailsData.listing.roomNo.equals("0")
                        ViewModelAdDetailsDataListingRoomNoEqualsJavaLangString01 = viewModelAdDetailsDataListingRoomNo.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.roomNo.equals("0")
                    viewModelAdDetailsDataListingRoomNoEqualsJavaLangString0 = !ViewModelAdDetailsDataListingRoomNoEqualsJavaLangString01;
            }
        }
        if ((dirtyFlags & 0x1000000000L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.frontNo
                    viewModelAdDetailsDataListingListingOptionsFrontNo = viewModelAdDetailsDataListingListingOptions.getFrontNo();
                }


                // read viewModel.adDetailsData.listing.listingOptions.frontNo != 0
                viewModelAdDetailsDataListingListingOptionsFrontNoInt0 = (viewModelAdDetailsDataListingListingOptionsFrontNo) != (0);
        }
        if ((dirtyFlags & 0x100000000000000L) != 0 || (dirtyFlags_1 & 0x4L) != 0) {

                if (viewModelAdDetailsDataListing != null) {
                    // read viewModel.adDetailsData.listing.kitchenNo
                    viewModelAdDetailsDataListingKitchenNo = viewModelAdDetailsDataListing.getKitchenNo();
                }

            if ((dirtyFlags_1 & 0x4L) != 0) {

                    if (viewModelAdDetailsDataListingKitchenNo != null) {
                        // read viewModel.adDetailsData.listing.kitchenNo.equals("0")
                        viewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0 = viewModelAdDetailsDataListingKitchenNo.equals("0");
                    }


                    // read !viewModel.adDetailsData.listing.kitchenNo.equals("0")
                    ViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString01 = !viewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0;
            }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (ViewModelAdDetailsDataListingFloorNoEqualsJavaLangString01) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.area.concat(" ").concat(@android:string/meter) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeterJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeter) : (""));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDesc) : (" "));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorNo : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingFloorNo) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.createdAt : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingCreatedAtJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingCreatedAt) : (""));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingAddress) : (""));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (ViewModelAdDetailsDataListingAreaEqualsJavaLangString01) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.bathroomNo : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingBathroomNo) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.views : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingViewsJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingViews) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsFrontNoInt0) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsStreetWidthInt0) : (false));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingRoomNoEqualsJavaLangString0) : (false));
                // read viewModel.adDetailsData.listing != null ? String.valueOf(viewModel.adDetailsData.listing.id) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullStringValueOfViewModelAdDetailsDataListingIdJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (stringValueOfViewModelAdDetailsDataListingId) : (""));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.roomNo : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingRoomNo) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.buildingAge(viewModel.adDetailsData).concat(" ").concat(@android:string/year) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYearJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYear) : (""));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse = ((viewModelAdDetailsDataJavaLangObjectNull) ? (viewModelAdDetailsDataListingUserIdViewModelUserDataId) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.kitchenNo : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingKitchenNo) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorArea.concat(" ").concat(@android:string/meter) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeterJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeter) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.buildingYear : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBuildingYearJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingBuildingYear) : (""));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (ViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString01) : (false));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalse = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (ViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString01) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.totalArea.concat(" ").concat(@android:string/meter) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeterJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeter) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.paymentMethod : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingPaymentMethodJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingPaymentMethod) : (""));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNull) ? (viewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNull) : (false));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.docType : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingDocTypeJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNull) ? (viewModelAdDetailsDataListingDocType) : (""));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalse) {
                        dirtyFlags |= 0x4000000000L;
                        dirtyFlags_1 |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                        dirtyFlags_1 |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalse) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags_1 |= 0x100000L;
                }
                else {
                        dirtyFlags_1 |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) {
                        dirtyFlags |= 0x1000000000000000L;
                        dirtyFlags_1 |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x800000000000000L;
                        dirtyFlags_1 |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags_1 |= 0x4000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
                viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE = ((viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
                viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (viewModelTitleConcatJavaLangString != null) {
                    // read viewModel.title.concat(" | ").concat(viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : "")
                    viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString = viewModelTitleConcatJavaLangString.concat(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString);
                }
        }
        if ((dirtyFlags & 0x5L) != 0) {

                // read viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewModelUserDataTypeInt0JavaLangStringTvHomeDescAndroidStringSeekerJavaLangStringViewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString = ((viewModelUserDataTypeInt0) ? (((" ( ") + (tvHomeDesc.getResources().getString(R.string.seeker))) + (" )")) : (viewModelUserDataTypeInt1JavaLangStringTvHomeDescAndroidStringOwnerJavaLangStringJavaLangStringTvHomeDescAndroidStringRealtorJavaLangString));
        }
        // batch finished

        if ((dirtyFlags_1 & 0x10000L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.streetWidth
                    viewModelAdDetailsDataListingListingOptionsStreetWidth = viewModelAdDetailsDataListingListingOptions.getStreetWidth();
                }


                // read String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth)
                stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidth = java.lang.String.valueOf(viewModelAdDetailsDataListingListingOptionsStreetWidth);


                if (stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidth != null) {
                    // read String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth).concat(" ")
                    stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangString = stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidth.concat(" ");
                }


                if (stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangString != null) {
                    // read String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth).concat(" ").concat(@android:string/meter)
                    stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeter = stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangString.concat(adStreetWidthTxt.getResources().getString(R.string.meter));
                }
        }
        if ((dirtyFlags & 0x4000000000L) != 0) {

                if (viewModelAdDetailsDataListingListingOptions != null) {
                    // read viewModel.adDetailsData.listing.listingOptions.frontNo
                    viewModelAdDetailsDataListingListingOptionsFrontNo = viewModelAdDetailsDataListingListingOptions.getFrontNo();
                }


                // read String.valueOf(viewModel.adDetailsData.listing.listingOptions.frontNo)
                stringValueOfViewModelAdDetailsDataListingListingOptionsFrontNo = java.lang.String.valueOf(viewModelAdDetailsDataListingListingOptionsFrontNo);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.frontNo) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsFrontNoJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalse) ? (stringValueOfViewModelAdDetailsDataListingListingOptionsFrontNo) : (""));
                // read viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth).concat(" ").concat(@android:string/meter) : ""
                viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeterJavaLangString = ((viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalse) ? (stringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeter) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adAreaTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorAreaConcatJavaLangStringConcatAdAreaTxtAndroidStringMeterJavaLangString);
            this.adBathN.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adBathNTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoJavaLangString);
            this.adBathNTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adBuildingTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelBuildingAgeViewModelAdDetailsDataConcatJavaLangStringConcatAdBuildingTxtAndroidStringYearJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adBuildingYearTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBuildingYearJavaLangString);
            this.adDesc.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adDocTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingDocTypeJavaLangString);
            this.adFloorN.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adFloorNTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoJavaLangString);
            this.adFloorNTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adFontTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsFrontNoJavaLangString);
            this.adFontTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseViewVISIBLEViewGONE);
            this.adFront.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adIdTxt, viewModelAdDetailsDataListingJavaLangObjectNullStringValueOfViewModelAdDetailsDataListingIdJavaLangString);
            this.adKitchenN.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adKitchenNTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoJavaLangString);
            this.adKitchenNTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.adLand.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adLandTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaConcatJavaLangStringConcatAdLandTxtAndroidStringMeterJavaLangString);
            this.adLandTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adLastUpdatedTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingCreatedAtJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adPaymentTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingPaymentMethodJavaLangString);
            this.adRoomN.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adRoomNTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoJavaLangString);
            this.adRoomNTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.adStreetWidth.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adStreetWidthTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullBooleanFalseStringValueOfViewModelAdDetailsDataListingListingOptionsStreetWidthConcatJavaLangStringConcatAdStreetWidthTxtAndroidStringMeterJavaLangString);
            this.adStreetWidthTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalseViewVISIBLEViewGONE);
            this.adTotalArea.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adTotalAreaTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaConcatJavaLangStringConcatAdTotalAreaTxtAndroidStringMeterJavaLangString);
            this.adTotalAreaTxt.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.adViewsTxt, viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingViewsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, viewModelTitleConcatJavaLangStringConcatViewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingAddressJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.desc.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangString);
            this.descText.setVisibility(viewModelAdDetailsDataListingListingOptionsJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsDescJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            this.imgHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView45, viewModelAdDetailsDataListingUserImg);
            grand.app.akar.base.ApplicationBinding.loadImage(this.mboundView52, viewModelAdDetailsDataListingDefaultImgMedia);
            this.mboundView54.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.mboundView59.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, viewModelAdDetailsDataListingPriceConcatJavaLangStringConcatPriceAndroidStringCoin);
            this.tvHomeDesc.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelAdDetailsDataListingUserName);
            this.tvHomeItem.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvPormote.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.tvRemove.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.v18.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsFrontNoInt0BooleanFalseViewVISIBLEViewGONE);
            this.v19.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
            this.v20.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingRoomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v21.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingBathroomNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v22.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingListingOptionsStreetWidthInt0BooleanFalseViewVISIBLEViewGONE);
            this.v23.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingFloorNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v25.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v26.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingTotalAreaEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v27.setVisibility(viewModelAdDetailsDataListingJavaLangObjectNullViewModelAdDetailsDataListingKitchenNoEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            this.v35.setVisibility(viewModelAdDetailsDataJavaLangObjectNullViewModelAdDetailsDataListingUserIdViewModelUserDataIdBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback29);
            this.call.setOnClickListener(mCallback37);
            this.delete.setOnClickListener(mCallback42);
            this.favorite.setOnClickListener(mCallback36);
            this.map.setOnClickListener(mCallback34);
            this.mboundView2.setOnClickListener(mCallback30);
            this.mboundView3.setOnClickListener(mCallback31);
            this.mboundView50.setOnClickListener(mCallback33);
            this.mboundView52.setOnClickListener(mCallback35);
            this.refresh.setOnClickListener(mCallback40);
            this.report.setOnClickListener(mCallback39);
            this.share.setOnClickListener(mCallback38);
            this.shareOwner.setOnClickListener(mCallback41);
            this.tvPormote.setOnClickListener(mCallback32);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.selectedRc, viewModelHomeAdapter, "1", "1");
            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.servicesRc, viewModelServicesAdapter, "1", "1");
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


                    viewModel.report();
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


                    viewModel.call();
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


                    viewModel.share();
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


                    viewModel.toMap();
                }
                break;
            }
            case 8: {
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


                    viewModel.chat();
                }
                break;
            }
            case 6: {
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


                    viewModel.share();
                }
                break;
            }
            case 14: {
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
            case 4: {
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


                    viewModel.openEditDialog();
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


                    viewModel.updateDate();
                }
                break;
            }
            case 13: {
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



                    viewModel.goBack(getRoot().getContext());
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.adDetailsData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false
        flag 4 (0x5L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false
        flag 5 (0x6L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false
        flag 6 (0x7L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false
        flag 7 (0x8L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.area.concat(" ").concat(@android:string/meter) : ""
        flag 10 (0xbL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.area.concat(" ").concat(@android:string/meter) : ""
        flag 11 (0xcL): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 12 (0xdL): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc : " "
        flag 13 (0xeL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorNo : ""
        flag 14 (0xfL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorNo : ""
        flag 15 (0x10L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.createdAt : ""
        flag 16 (0x11L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.createdAt : ""
        flag 17 (0x12L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 22 (0x17L): viewModel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 23 (0x18L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
        flag 24 (0x19L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.address : ""
        flag 25 (0x1aL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false
        flag 26 (0x1bL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false
        flag 27 (0x1cL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.floorNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.bathroomNo : ""
        flag 30 (0x1fL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.bathroomNo : ""
        flag 31 (0x20L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.views : ""
        flag 32 (0x21L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.views : ""
        flag 33 (0x22L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.area.equals("0") : false ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false
        flag 36 (0x25L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false
        flag 37 (0x26L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.frontNo) : ""
        flag 38 (0x27L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.frontNo) : ""
        flag 39 (0x28L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false
        flag 40 (0x29L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.streetWidth != 0 : false
        flag 41 (0x2aL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false
        flag 42 (0x2bL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false
        flag 43 (0x2cL): viewModel.adDetailsData.listing != null ? String.valueOf(viewModel.adDetailsData.listing.id) : ""
        flag 44 (0x2dL): viewModel.adDetailsData.listing != null ? String.valueOf(viewModel.adDetailsData.listing.id) : ""
        flag 45 (0x2eL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false
        flag 46 (0x2fL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false
        flag 47 (0x30L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.roomNo : ""
        flag 48 (0x31L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.roomNo : ""
        flag 49 (0x32L): viewModel.adDetailsData.listing != null ? viewModel.buildingAge(viewModel.adDetailsData).concat(" ").concat(@android:string/year) : ""
        flag 50 (0x33L): viewModel.adDetailsData.listing != null ? viewModel.buildingAge(viewModel.adDetailsData).concat(" ").concat(@android:string/year) : ""
        flag 51 (0x34L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
        flag 52 (0x35L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false
        flag 53 (0x36L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 54 (0x37L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.roomNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 55 (0x38L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.kitchenNo : ""
        flag 56 (0x39L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.kitchenNo : ""
        flag 57 (0x3aL): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 58 (0x3bL): viewModel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 59 (0x3cL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 60 (0x3dL): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 61 (0x3eL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorArea.concat(" ").concat(@android:string/meter) : ""
        flag 62 (0x3fL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.floorArea.concat(" ").concat(@android:string/meter) : ""
        flag 63 (0x40L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.buildingYear : ""
        flag 64 (0x41L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.buildingYear : ""
        flag 65 (0x42L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false
        flag 66 (0x43L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false
        flag 67 (0x44L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 68 (0x45L): viewModel.adDetailsData != null ? viewModel.adDetailsData.listing.userId == viewModel.userData.id : false ? View.GONE : View.VISIBLE
        flag 69 (0x46L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? View.VISIBLE : View.GONE
        flag 70 (0x47L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions.frontNo != 0 : false ? View.VISIBLE : View.GONE
        flag 71 (0x48L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false
        flag 72 (0x49L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.totalArea.equals("0") : false
        flag 73 (0x4aL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.totalArea.concat(" ").concat(@android:string/meter) : ""
        flag 74 (0x4bL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.totalArea.concat(" ").concat(@android:string/meter) : ""
        flag 75 (0x4cL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.paymentMethod : ""
        flag 76 (0x4dL): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.paymentMethod : ""
        flag 77 (0x4eL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 78 (0x4fL): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.kitchenNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 79 (0x50L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth).concat(" ").concat(@android:string/meter) : ""
        flag 80 (0x51L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.listingOptions != null : false ? String.valueOf(viewModel.adDetailsData.listing.listingOptions.streetWidth).concat(" ").concat(@android:string/meter) : ""
        flag 81 (0x52L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
        flag 82 (0x53L): viewModel.adDetailsData.listing.listingOptions != null ? viewModel.adDetailsData.listing.listingOptions.desc != null : false
        flag 83 (0x54L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 84 (0x55L): viewModel.adDetailsData.listing != null ? !viewModel.adDetailsData.listing.bathroomNo.equals("0") : false ? View.VISIBLE : View.GONE
        flag 85 (0x56L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.docType : ""
        flag 86 (0x57L): viewModel.adDetailsData.listing != null ? viewModel.adDetailsData.listing.docType : ""
    flag mapping end*/
    //end
}