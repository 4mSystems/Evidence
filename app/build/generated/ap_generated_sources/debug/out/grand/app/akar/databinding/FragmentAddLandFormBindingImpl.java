package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddLandFormBindingImpl extends FragmentAddLandFormBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v1, 22);
        sViewsWithIds.put(R.id.tv_deal_type, 23);
        sViewsWithIds.put(R.id.v2, 24);
        sViewsWithIds.put(R.id.tv_price, 25);
        sViewsWithIds.put(R.id.v3, 26);
        sViewsWithIds.put(R.id.tv_address, 27);
        sViewsWithIds.put(R.id.v4, 28);
        sViewsWithIds.put(R.id.tv_land_size, 29);
        sViewsWithIds.put(R.id.v12, 30);
        sViewsWithIds.put(R.id.tv_payment_type, 31);
        sViewsWithIds.put(R.id.v13, 32);
        sViewsWithIds.put(R.id.tv_doc_type, 33);
        sViewsWithIds.put(R.id.br3, 34);
        sViewsWithIds.put(R.id.optional_layout, 35);
        sViewsWithIds.put(R.id.expansionLayoutHeader, 36);
        sViewsWithIds.put(R.id.headerIndicator, 37);
        sViewsWithIds.put(R.id.header_menu_name, 38);
        sViewsWithIds.put(R.id.expansionLayout, 39);
        sViewsWithIds.put(R.id.tv_street_size, 40);
        sViewsWithIds.put(R.id.v14, 41);
        sViewsWithIds.put(R.id.tv_front_count, 42);
        sViewsWithIds.put(R.id.v15, 43);
        sViewsWithIds.put(R.id.tv_furniture, 44);
        sViewsWithIds.put(R.id.v16, 45);
        sViewsWithIds.put(R.id.tv_services, 46);
        sViewsWithIds.put(R.id.v17, 47);
        sViewsWithIds.put(R.id.tv_building_desc, 48);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener incrementalViewFrontCountvalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.front_no
            //         is viewmodel.createAdRequest.setFront_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewFrontCount);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.front_no
            java.lang.String viewmodelCreateAdRequestFrontNo = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setFront_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputAddresstextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.address
            //         is viewmodel.createAdRequest.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputAddress);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest.address
            java.lang.String viewmodelCreateAdRequestAddress = null;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputDesctextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.desc
            //         is viewmodel.createAdRequest.setDesc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputDesc);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.desc
            java.lang.String viewmodelCreateAdRequestDesc = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setDesc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputLandSizetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.area
            //         is viewmodel.createAdRequest.setArea((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputLandSize);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.area
            java.lang.String viewmodelCreateAdRequestArea = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setArea(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputPricetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.price
            //         is viewmodel.createAdRequest.setPrice((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputPrice);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest.price
            java.lang.String viewmodelCreateAdRequestPrice = null;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setPrice(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputStreetSizetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.street_width
            //         is viewmodel.createAdRequest.setStreet_width((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputStreetSize);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;
            // viewmodel.createAdRequest.street_width
            java.lang.String viewmodelCreateAdRequestStreetWidth = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setStreet_width(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddLandFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 49, sIncludes, sViewsWithIds));
    }
    private FragmentAddLandFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.Barrier) bindings[34]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[39]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[36]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[37]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[38]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[18]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[14]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[20]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[5]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[13]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[16]
            , (android.widget.LinearLayout) bindings[35]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[19]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[27]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[48]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[23]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[33]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[42]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[44]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[29]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[31]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[46]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[40]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[32]
            , (android.view.View) bindings[41]
            , (android.view.View) bindings[43]
            , (android.view.View) bindings[45]
            , (android.view.View) bindings[47]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[28]
            );
        this.btCustomize.setTag(null);
        this.btHolyKing.setTag(null);
        this.btMnahda.setTag(null);
        this.btSac.setTag(null);
        this.btTitleDeed.setTag(null);
        this.btTransform.setTag(null);
        this.btnCash.setTag(null);
        this.btnRealEstateCertificate.setTag(null);
        this.btnSell.setTag(null);
        this.confirmBtn.setTag(null);
        this.furnitureToggle.setTag(null);
        this.hospital.setTag(null);
        this.incrementalViewFrontCount.setTag(null);
        this.inputAddress.setTag(null);
        this.inputDesc.setTag(null);
        this.inputLandSize.setTag(null);
        this.inputPrice.setTag(null);
        this.inputStreetSize.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mosque.setTag(null);
        this.policeStation.setTag(null);
        this.school.setTag(null);
        setRootTag(root);
        // listeners
        mCallback94 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback95 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback89 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback92 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback93 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback87 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback86 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback90 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback88 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback91 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback96 = new grand.app.akar.generated.callback.OnClickListener(this, 13);
        mCallback84 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback98 = new grand.app.akar.generated.callback.OnClickListener(this, 15);
        mCallback85 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback97 = new grand.app.akar.generated.callback.OnClickListener(this, 14);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCreateAdRequestAreaError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelCreateAdRequestPriceError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) object, fieldId);
            case 3 :
                return onChangeViewmodelCreateAdRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestAreaError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestAreaError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestPriceError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestPriceError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.dealingType) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.createAdRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.paymentMethod) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.docType) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.furniture) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.mosque) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.school) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.hospital) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.policeStation) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean viewmodelDealingTypeInt1 = false;
        android.graphics.drawable.Drawable viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestAreaError = null;
        java.lang.String viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit = null;
        int viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt3 = false;
        boolean viewmodelHospitalInt0BooleanFalseBooleanTrue = false;
        java.lang.String viewmodelCreateAdRequestAreaErrorGet = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestPriceError = null;
        boolean viewmodelMosqueInt0 = false;
        int viewmodelMosque = 0;
        java.lang.String viewmodelCreateAdRequestDesc = null;
        java.lang.String viewmodelCreateAdRequestAddress = null;
        java.lang.String viewmodelCreateAdRequestPrice = null;
        int viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = 0;
        int viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = 0;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark = null;
        boolean viewmodelDocTypeInt1 = false;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = null;
        boolean viewmodelPaymentMethodInt0 = false;
        int viewmodelHospital = 0;
        int viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = null;
        boolean viewmodelCreateAdRequestListingIdInt0 = false;
        java.lang.String viewmodelCreateAdRequestStreetWidth = null;
        boolean viewmodelMosqueInt0BooleanFalseBooleanTrue = false;
        boolean viewmodelPoliceStationInt0 = false;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark = null;
        boolean viewmodelSchoolInt0BooleanFalseBooleanTrue = false;
        grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelFurniture = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = null;
        grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestAddressError = null;
        int viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite = 0;
        int viewmodelDealingType = 0;
        int viewmodelDocType = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = 0;
        boolean viewmodelPaymentMethodInt2 = false;
        java.lang.String viewmodelCreateAdRequestPriceErrorGet = null;
        int viewmodelPaymentMethod = 0;
        boolean viewmodelPoliceStationInt0BooleanFalseBooleanTrue = false;
        boolean viewmodelDocTypeInt2 = false;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestFrontNo = null;
        int viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = 0;
        boolean viewmodelHospitalInt0 = false;
        boolean viewmodelSchoolInt0 = false;
        int viewmodelCreateAdRequestListingId = 0;
        java.lang.String viewmodelCreateAdRequestArea = null;
        java.lang.String viewmodelCreateAdRequestAddressErrorGet = null;
        int viewmodelSchool = 0;
        boolean viewmodelDealingTypeInt0 = false;
        boolean viewmodelFurnitureInt0 = false;
        int viewmodelPoliceStation = 0;
        boolean viewmodelDocTypeInt0 = false;
        int viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite = 0;
        boolean viewmodelPaymentMethodInt1 = false;
        int viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = 0;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x2204L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.mosque
                        viewmodelMosque = viewmodel.getMosque();
                    }


                    // read viewmodel.mosque == 0
                    viewmodelMosqueInt0 = (viewmodelMosque) == (0);
                if((dirtyFlags & 0x2204L) != 0) {
                    if(viewmodelMosqueInt0) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read viewmodel.mosque == 0 ? false : true
                    viewmodelMosqueInt0BooleanFalseBooleanTrue = ((viewmodelMosqueInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x2804L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.hospital
                        viewmodelHospital = viewmodel.getHospital();
                    }


                    // read viewmodel.hospital == 0
                    viewmodelHospitalInt0 = (viewmodelHospital) == (0);
                if((dirtyFlags & 0x2804L) != 0) {
                    if(viewmodelHospitalInt0) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read viewmodel.hospital == 0 ? false : true
                    viewmodelHospitalInt0BooleanFalseBooleanTrue = ((viewmodelHospitalInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x202fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.createAdRequest
                        viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();
                    }

                if ((dirtyFlags & 0x2025L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.areaError
                            viewmodelCreateAdRequestAreaError = viewmodelCreateAdRequest.areaError;
                        }
                        updateRegistration(0, viewmodelCreateAdRequestAreaError);


                        if (viewmodelCreateAdRequestAreaError != null) {
                            // read viewmodel.createAdRequest.areaError.get()
                            viewmodelCreateAdRequestAreaErrorGet = viewmodelCreateAdRequestAreaError.get();
                        }
                }
                if ((dirtyFlags & 0x2026L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.priceError
                            viewmodelCreateAdRequestPriceError = viewmodelCreateAdRequest.priceError;
                        }
                        updateRegistration(1, viewmodelCreateAdRequestPriceError);


                        if (viewmodelCreateAdRequestPriceError != null) {
                            // read viewmodel.createAdRequest.priceError.get()
                            viewmodelCreateAdRequestPriceErrorGet = viewmodelCreateAdRequestPriceError.get();
                        }
                }
                if ((dirtyFlags & 0x2024L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.desc
                            viewmodelCreateAdRequestDesc = viewmodelCreateAdRequest.getDesc();
                            // read viewmodel.createAdRequest.address
                            viewmodelCreateAdRequestAddress = viewmodelCreateAdRequest.getAddress();
                            // read viewmodel.createAdRequest.price
                            viewmodelCreateAdRequestPrice = viewmodelCreateAdRequest.getPrice();
                            // read viewmodel.createAdRequest.street_width
                            viewmodelCreateAdRequestStreetWidth = viewmodelCreateAdRequest.getStreet_width();
                            // read viewmodel.createAdRequest.front_no
                            viewmodelCreateAdRequestFrontNo = viewmodelCreateAdRequest.getFront_no();
                            // read viewmodel.createAdRequest.listing_id
                            viewmodelCreateAdRequestListingId = viewmodelCreateAdRequest.getListing_id();
                            // read viewmodel.createAdRequest.area
                            viewmodelCreateAdRequestArea = viewmodelCreateAdRequest.getArea();
                        }


                        // read viewmodel.createAdRequest.listing_id == 0
                        viewmodelCreateAdRequestListingIdInt0 = (viewmodelCreateAdRequestListingId) == (0);
                    if((dirtyFlags & 0x2024L) != 0) {
                        if(viewmodelCreateAdRequestListingIdInt0) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }


                        // read viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
                        viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit = ((viewmodelCreateAdRequestListingIdInt0) ? (confirmBtn.getResources().getString(R.string.post_ad)) : (confirmBtn.getResources().getString(R.string.edit)));
                }
                if ((dirtyFlags & 0x202cL) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.addressError
                            viewmodelCreateAdRequestAddressError = viewmodelCreateAdRequest.getAddressError();
                        }
                        updateRegistration(3, viewmodelCreateAdRequestAddressError);


                        if (viewmodelCreateAdRequestAddressError != null) {
                            // read viewmodel.createAdRequest.addressError.get()
                            viewmodelCreateAdRequestAddressErrorGet = viewmodelCreateAdRequestAddressError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x2104L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.furniture
                        viewmodelFurniture = viewmodel.getFurniture();
                    }


                    // read viewmodel.furniture == 0
                    viewmodelFurnitureInt0 = (viewmodelFurniture) == (0);
                if((dirtyFlags & 0x2104L) != 0) {
                    if(viewmodelFurnitureInt0) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = ((viewmodelFurnitureInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x2014L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dealingType
                        viewmodelDealingType = viewmodel.getDealingType();
                    }


                    // read viewmodel.dealingType == 1
                    viewmodelDealingTypeInt1 = (viewmodelDealingType) == (1);
                    // read viewmodel.dealingType == 0
                    viewmodelDealingTypeInt0 = (viewmodelDealingType) == (0);
                if((dirtyFlags & 0x2014L) != 0) {
                    if(viewmodelDealingTypeInt1) {
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x800000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x400000000000000L;
                    }
                }
                if((dirtyFlags & 0x2014L) != 0) {
                    if(viewmodelDealingTypeInt0) {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x400000000000L;
                    }
                }


                    // read viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark = ((viewmodelDealingTypeInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSell.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSell.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
                    viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite = ((viewmodelDealingTypeInt1) ? (getColorFromResource(btnSell, R.color.colordark)) : (getColorFromResource(btnSell, R.color.white)));
                    // read viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark = ((viewmodelDealingTypeInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btMnahda.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btMnahda.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
                    viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite = ((viewmodelDealingTypeInt0) ? (getColorFromResource(btMnahda, R.color.colordark)) : (getColorFromResource(btMnahda, R.color.white)));
            }
            if ((dirtyFlags & 0x2084L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.docType
                        viewmodelDocType = viewmodel.getDocType();
                    }


                    // read viewmodel.docType != 3
                    viewmodelDocTypeInt3 = (viewmodelDocType) != (3);
                    // read viewmodel.docType != 1
                    viewmodelDocTypeInt1 = (viewmodelDocType) != (1);
                    // read viewmodel.docType != 2
                    viewmodelDocTypeInt2 = (viewmodelDocType) != (2);
                    // read viewmodel.docType != 0
                    viewmodelDocTypeInt0 = (viewmodelDocType) != (0);
                if((dirtyFlags & 0x2084L) != 0) {
                    if(viewmodelDocTypeInt3) {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x100000000000L;
                    }
                }
                if((dirtyFlags & 0x2084L) != 0) {
                    if(viewmodelDocTypeInt1) {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }
                if((dirtyFlags & 0x2084L) != 0) {
                    if(viewmodelDocTypeInt2) {
                            dirtyFlags |= 0x2000000000000L;
                            dirtyFlags |= 0x2000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                            dirtyFlags |= 0x1000000000000000L;
                    }
                }
                if((dirtyFlags & 0x2084L) != 0) {
                    if(viewmodelDocTypeInt0) {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                }


                    // read viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = ((viewmodelDocTypeInt3) ? (getColorFromResource(btTitleDeed, R.color.colordark)) : (getColorFromResource(btTitleDeed, R.color.white)));
                    // read viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTitleDeed.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTitleDeed.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btCustomize.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btCustomize.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = ((viewmodelDocTypeInt1) ? (getColorFromResource(btCustomize, R.color.colordark)) : (getColorFromResource(btCustomize, R.color.white)));
                    // read viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btHolyKing.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btHolyKing.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = ((viewmodelDocTypeInt2) ? (getColorFromResource(btHolyKing, R.color.colordark)) : (getColorFromResource(btHolyKing, R.color.white)));
                    // read viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnRealEstateCertificate.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnRealEstateCertificate.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = ((viewmodelDocTypeInt0) ? (getColorFromResource(btnRealEstateCertificate, R.color.colordark)) : (getColorFromResource(btnRealEstateCertificate, R.color.white)));
            }
            if ((dirtyFlags & 0x2044L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.paymentMethod
                        viewmodelPaymentMethod = viewmodel.getPaymentMethod();
                    }


                    // read viewmodel.paymentMethod != 0
                    viewmodelPaymentMethodInt0 = (viewmodelPaymentMethod) != (0);
                    // read viewmodel.paymentMethod != 2
                    viewmodelPaymentMethodInt2 = (viewmodelPaymentMethod) != (2);
                    // read viewmodel.paymentMethod != 1
                    viewmodelPaymentMethodInt1 = (viewmodelPaymentMethod) != (1);
                if((dirtyFlags & 0x2044L) != 0) {
                    if(viewmodelPaymentMethodInt0) {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x80000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x40000000000000L;
                    }
                }
                if((dirtyFlags & 0x2044L) != 0) {
                    if(viewmodelPaymentMethodInt2) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                }
                if((dirtyFlags & 0x2044L) != 0) {
                    if(viewmodelPaymentMethodInt1) {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x100000000000000L;
                    }
                }


                    // read viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = ((viewmodelPaymentMethodInt0) ? (getColorFromResource(btnCash, R.color.colordark)) : (getColorFromResource(btnCash, R.color.white)));
                    // read viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCash.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCash.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite = ((viewmodelPaymentMethodInt2) ? (getColorFromResource(btTransform, R.color.colordark)) : (getColorFromResource(btTransform, R.color.white)));
                    // read viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTransform.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTransform.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btSac.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btSac.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = ((viewmodelPaymentMethodInt1) ? (getColorFromResource(btSac, R.color.colordark)) : (getColorFromResource(btSac, R.color.white)));
            }
            if ((dirtyFlags & 0x2404L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.school
                        viewmodelSchool = viewmodel.getSchool();
                    }


                    // read viewmodel.school == 0
                    viewmodelSchoolInt0 = (viewmodelSchool) == (0);
                if((dirtyFlags & 0x2404L) != 0) {
                    if(viewmodelSchoolInt0) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read viewmodel.school == 0 ? false : true
                    viewmodelSchoolInt0BooleanFalseBooleanTrue = ((viewmodelSchoolInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.policeStation
                        viewmodelPoliceStation = viewmodel.getPoliceStation();
                    }


                    // read viewmodel.policeStation == 0
                    viewmodelPoliceStationInt0 = (viewmodelPoliceStation) == (0);
                if((dirtyFlags & 0x3004L) != 0) {
                    if(viewmodelPoliceStationInt0) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }


                    // read viewmodel.policeStation == 0 ? false : true
                    viewmodelPoliceStationInt0BooleanFalseBooleanTrue = ((viewmodelPoliceStationInt0) ? (false) : (true));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x2084L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btCustomize, viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark);
            this.btCustomize.setTextColor(viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btHolyKing, viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark);
            this.btHolyKing.setTextColor(viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btTitleDeed, viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark);
            this.btTitleDeed.setTextColor(viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnRealEstateCertificate, viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark);
            this.btnRealEstateCertificate.setTextColor(viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.btCustomize.setOnClickListener(mCallback90);
            this.btHolyKing.setOnClickListener(mCallback91);
            this.btMnahda.setOnClickListener(mCallback85);
            this.btSac.setOnClickListener(mCallback87);
            this.btTitleDeed.setOnClickListener(mCallback92);
            this.btTransform.setOnClickListener(mCallback88);
            this.btnCash.setOnClickListener(mCallback86);
            this.btnRealEstateCertificate.setOnClickListener(mCallback89);
            this.btnSell.setOnClickListener(mCallback84);
            this.confirmBtn.setOnClickListener(mCallback98);
            this.furnitureToggle.setOnClickListener(mCallback93);
            this.hospital.setOnClickListener(mCallback96);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFrontCount, incrementalViewFrontCountvalueAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputAddress, inputAddresstextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputDesc, inputDesctextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputLandSize, inputLandSizetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPrice, inputPricetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputStreetSize, inputStreetSizetextAttrChanged);
            this.mosque.setOnClickListener(mCallback94);
            this.policeStation.setOnClickListener(mCallback97);
            this.school.setOnClickListener(mCallback95);
        }
        if ((dirtyFlags & 0x2014L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btMnahda, viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark);
            this.btMnahda.setTextColor(viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSell, viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark);
            this.btnSell.setTextColor(viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite);
        }
        if ((dirtyFlags & 0x2044L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btSac, viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark);
            this.btSac.setTextColor(viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btTransform, viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark);
            this.btTransform.setTextColor(viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnCash, viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark);
            this.btnCash.setTextColor(viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite);
        }
        if ((dirtyFlags & 0x2024L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.confirmBtn, viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFrontCount, viewmodelCreateAdRequestFrontNo);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputAddress, viewmodelCreateAdRequestAddress);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputDesc, viewmodelCreateAdRequestDesc);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputLandSize, viewmodelCreateAdRequestArea);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPrice, viewmodelCreateAdRequestPrice);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputStreetSize, viewmodelCreateAdRequestStreetWidth);
        }
        if ((dirtyFlags & 0x2104L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.furnitureToggle, viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x2804L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.hospital, viewmodelHospitalInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x202cL) != 0) {
            // api target 1

            this.inputAddress.setError(viewmodelCreateAdRequestAddressErrorGet);
        }
        if ((dirtyFlags & 0x2025L) != 0) {
            // api target 1

            this.inputLandSize.setError(viewmodelCreateAdRequestAreaErrorGet);
        }
        if ((dirtyFlags & 0x2026L) != 0) {
            // api target 1

            this.inputPrice.setError(viewmodelCreateAdRequestPriceErrorGet);
        }
        if ((dirtyFlags & 0x2204L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mosque, viewmodelMosqueInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.policeStation, viewmodelPoliceStationInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x2404L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.school, viewmodelSchoolInt0BooleanFalseBooleanTrue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.mosqueChecked();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.schoolChecked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.docTypeAction(btnRealEstateCertificate.getResources().getString(R.string.real_estate_certificate), 0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.docTypeAction(btTitleDeed.getResources().getString(R.string.title_deed), 3);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.furnChecked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.paymentMethodAction(btSac.getResources().getString(R.string.sac), 1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.paymentMethodAction(btnCash.getResources().getString(R.string.cash), 0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.docTypeAction(btCustomize.getResources().getString(R.string.customize), 1);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.paymentMethodAction(btTransform.getResources().getString(R.string.transform), 2);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.docTypeAction(btHolyKing.getResources().getString(R.string.holy_king), 2);
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.hospitalChecked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.dealingTypeAction(0);
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createLandAd();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.dealingTypeAction(1);
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.stationChecked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.createAdRequest.areaError
        flag 1 (0x2L): viewmodel.createAdRequest.priceError
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.createAdRequest.addressError
        flag 4 (0x5L): viewmodel.dealingType
        flag 5 (0x6L): viewmodel.createAdRequest
        flag 6 (0x7L): viewmodel.paymentMethod
        flag 7 (0x8L): viewmodel.docType
        flag 8 (0x9L): viewmodel.furniture
        flag 9 (0xaL): viewmodel.mosque
        flag 10 (0xbL): viewmodel.school
        flag 11 (0xcL): viewmodel.hospital
        flag 12 (0xdL): viewmodel.policeStation
        flag 13 (0xeL): null
        flag 14 (0xfL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 15 (0x10L): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 16 (0x11L): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 17 (0x12L): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 18 (0x13L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 19 (0x14L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 20 (0x15L): viewmodel.hospital == 0 ? false : true
        flag 21 (0x16L): viewmodel.hospital == 0 ? false : true
        flag 22 (0x17L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 23 (0x18L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 24 (0x19L): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 25 (0x1aL): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 26 (0x1bL): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 27 (0x1cL): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 28 (0x1dL): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 29 (0x1eL): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 30 (0x1fL): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 31 (0x20L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 32 (0x21L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 33 (0x22L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 34 (0x23L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 35 (0x24L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 36 (0x25L): viewmodel.mosque == 0 ? false : true
        flag 37 (0x26L): viewmodel.mosque == 0 ? false : true
        flag 38 (0x27L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 39 (0x28L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 40 (0x29L): viewmodel.school == 0 ? false : true
        flag 41 (0x2aL): viewmodel.school == 0 ? false : true
        flag 42 (0x2bL): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 43 (0x2cL): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 44 (0x2dL): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 45 (0x2eL): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 46 (0x2fL): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 47 (0x30L): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 48 (0x31L): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 49 (0x32L): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 50 (0x33L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 51 (0x34L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 52 (0x35L): viewmodel.policeStation == 0 ? false : true
        flag 53 (0x36L): viewmodel.policeStation == 0 ? false : true
        flag 54 (0x37L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 55 (0x38L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 56 (0x39L): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 57 (0x3aL): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 58 (0x3bL): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 59 (0x3cL): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 60 (0x3dL): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
        flag 61 (0x3eL): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
    flag mapping end*/
    //end
}