package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddOfficeFormBindingImpl extends FragmentAddOfficeFormBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v1, 27);
        sViewsWithIds.put(R.id.tv_deal_type, 28);
        sViewsWithIds.put(R.id.v2, 29);
        sViewsWithIds.put(R.id.tv_price, 30);
        sViewsWithIds.put(R.id.v3, 31);
        sViewsWithIds.put(R.id.tv_address, 32);
        sViewsWithIds.put(R.id.v4, 33);
        sViewsWithIds.put(R.id.tv_land_size, 34);
        sViewsWithIds.put(R.id.v5, 35);
        sViewsWithIds.put(R.id.tv_rooms_count, 36);
        sViewsWithIds.put(R.id.v9, 37);
        sViewsWithIds.put(R.id.tv_paths_count, 38);
        sViewsWithIds.put(R.id.v10, 39);
        sViewsWithIds.put(R.id.tv_kitchen_count, 40);
        sViewsWithIds.put(R.id.v11, 41);
        sViewsWithIds.put(R.id.tv_building_year, 42);
        sViewsWithIds.put(R.id.buildingYear, 43);
        sViewsWithIds.put(R.id.v12, 44);
        sViewsWithIds.put(R.id.tv_payment_type, 45);
        sViewsWithIds.put(R.id.v13, 46);
        sViewsWithIds.put(R.id.tv_doc_type, 47);
        sViewsWithIds.put(R.id.br3, 48);
        sViewsWithIds.put(R.id.optional_layout, 49);
        sViewsWithIds.put(R.id.expansionLayoutHeader, 50);
        sViewsWithIds.put(R.id.headerIndicator, 51);
        sViewsWithIds.put(R.id.header_menu_name, 52);
        sViewsWithIds.put(R.id.expansionLayout, 53);
        sViewsWithIds.put(R.id.tv_street_size, 54);
        sViewsWithIds.put(R.id.v14, 55);
        sViewsWithIds.put(R.id.tv_front_count, 56);
        sViewsWithIds.put(R.id.v15, 57);
        sViewsWithIds.put(R.id.tv_garage, 58);
        sViewsWithIds.put(R.id.tv_furniture, 59);
        sViewsWithIds.put(R.id.v16, 60);
        sViewsWithIds.put(R.id.tv_services, 61);
        sViewsWithIds.put(R.id.v17, 62);
        sViewsWithIds.put(R.id.tv_building_desc, 63);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final grand.app.akar.customViews.views.DateEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
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
    private androidx.databinding.InverseBindingListener incrementalViewKitchenNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.kitchen_no
            //         is viewmodel.createAdRequest.setKitchen_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewKitchenNumber);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.kitchen_no
            java.lang.String viewmodelCreateAdRequestKitchenNo = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setKitchen_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewPathsNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.bathroom_no
            //         is viewmodel.createAdRequest.setBathroom_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewPathsNumber);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest.bathroom_no
            java.lang.String viewmodelCreateAdRequestBathroomNo = null;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setBathroom_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewRoomsNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.room_no
            //         is viewmodel.createAdRequest.setRoom_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewRoomsNumber);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest.room_no
            java.lang.String viewmodelCreateAdRequestRoomNo = null;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setRoom_no(((java.lang.String) (callbackArg_0)));
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
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.building_year
            //         is viewmodel.createAdRequest.setBuilding_year((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.building_year
            java.lang.String viewmodelCreateAdRequestBuildingYear = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setBuilding_year(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddOfficeFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 64, sIncludes, sViewsWithIds));
    }
    private FragmentAddOfficeFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.Barrier) bindings[48]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[43]
            , (androidx.appcompat.widget.AppCompatButton) bindings[26]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[53]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[50]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (android.widget.ImageView) bindings[51]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[52]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[23]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[18]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[8]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[7]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[6]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[25]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[5]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[17]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[21]
            , (android.widget.LinearLayout) bindings[49]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[24]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[32]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[63]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[42]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[47]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[56]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[59]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[58]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[40]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[34]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[38]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[45]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[30]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[36]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[61]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[54]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[39]
            , (android.view.View) bindings[41]
            , (android.view.View) bindings[44]
            , (android.view.View) bindings[46]
            , (android.view.View) bindings[55]
            , (android.view.View) bindings[57]
            , (android.view.View) bindings[60]
            , (android.view.View) bindings[62]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[35]
            , (android.view.View) bindings[37]
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
        this.garageToggle.setTag(null);
        this.hospital.setTag(null);
        this.incrementalViewFrontCount.setTag(null);
        this.incrementalViewKitchenNumber.setTag(null);
        this.incrementalViewPathsNumber.setTag(null);
        this.incrementalViewRoomsNumber.setTag(null);
        this.inputAddress.setTag(null);
        this.inputDesc.setTag(null);
        this.inputLandSize.setTag(null);
        this.inputPrice.setTag(null);
        this.inputStreetSize.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView9 = (grand.app.akar.customViews.views.DateEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.mosque.setTag(null);
        this.policeStation.setTag(null);
        this.school.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback57 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback58 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback55 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback56 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback65 = new grand.app.akar.generated.callback.OnClickListener(this, 16);
        mCallback52 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback64 = new grand.app.akar.generated.callback.OnClickListener(this, 15);
        mCallback54 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback53 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback50 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback62 = new grand.app.akar.generated.callback.OnClickListener(this, 13);
        mCallback63 = new grand.app.akar.generated.callback.OnClickListener(this, 14);
        mCallback51 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback60 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback61 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel) {
        updateRegistration(4, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCreateAdRequestPriceError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelCreateAdRequestBuildingYearError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelCreateAdRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelCreateAdRequestAreaError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestPriceError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestPriceError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestBuildingYearError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestBuildingYearError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestAreaError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestAreaError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.dealingType) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.createAdRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.paymentMethod) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.docType) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.garage) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.furniture) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.mosque) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.school) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.hospital) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.policeStation) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
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
        boolean viewmodelDealingTypeInt1 = false;
        java.lang.String viewmodelCreateAdRequestBathroomNo = null;
        boolean viewmodelHospitalInt0BooleanFalseBooleanTrue = false;
        java.lang.String viewmodelCreateAdRequestAreaErrorGet = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestPriceError = null;
        int viewmodelMosque = 0;
        android.graphics.drawable.Drawable viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = null;
        java.lang.String viewmodelCreateAdRequestAddress = null;
        java.lang.String viewmodelCreateAdRequestPrice = null;
        int viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = 0;
        int viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt1 = false;
        boolean viewmodelPaymentMethodInt0 = false;
        java.lang.String viewmodelCreateAdRequestBuildingYearErrorGet = null;
        int viewmodelHospital = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestBuildingYear = null;
        boolean viewmodelCreateAdRequestListingIdInt0 = false;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark = null;
        grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestBuildingYearError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestAddressError = null;
        int viewmodelDealingType = 0;
        int viewmodelDocType = 0;
        boolean viewmodelGarageInt0 = false;
        int viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = 0;
        boolean viewmodelPaymentMethodInt2 = false;
        boolean viewmodelPoliceStationInt0BooleanFalseBooleanTrue = false;
        boolean viewmodelDocTypeInt2 = false;
        int viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = 0;
        boolean viewmodelHospitalInt0 = false;
        boolean viewmodelSchoolInt0 = false;
        int viewmodelSchool = 0;
        boolean viewmodelDealingTypeInt0 = false;
        int viewmodelPoliceStation = 0;
        boolean viewmodelPaymentMethodInt1 = false;
        java.lang.String viewmodelCreateAdRequestRoomNo = null;
        android.graphics.drawable.Drawable viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestAreaError = null;
        java.lang.String viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit = null;
        int viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt3 = false;
        boolean viewmodelMosqueInt0 = false;
        java.lang.String viewmodelCreateAdRequestDesc = null;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = 0;
        java.lang.String viewmodelCreateAdRequestStreetWidth = null;
        boolean viewmodelMosqueInt0BooleanFalseBooleanTrue = false;
        boolean viewmodelPoliceStationInt0 = false;
        boolean viewmodelSchoolInt0BooleanFalseBooleanTrue = false;
        int viewmodelFurniture = 0;
        grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;
        int viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestPriceErrorGet = null;
        int viewmodelPaymentMethod = 0;
        java.lang.String viewmodelCreateAdRequestKitchenNo = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestFrontNo = null;
        int viewmodelCreateAdRequestListingId = 0;
        java.lang.String viewmodelCreateAdRequestArea = null;
        java.lang.String viewmodelCreateAdRequestAddressErrorGet = null;
        boolean viewmodelFurnitureInt0 = false;
        boolean viewmodelDocTypeInt0 = false;
        int viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite = 0;
        int viewmodelGarage = 0;
        int viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = 0;

        if ((dirtyFlags & 0xffffL) != 0) {


            if ((dirtyFlags & 0x8810L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.mosque
                        viewmodelMosque = viewmodel.getMosque();
                    }


                    // read viewmodel.mosque == 0
                    viewmodelMosqueInt0 = (viewmodelMosque) == (0);
                if((dirtyFlags & 0x8810L) != 0) {
                    if(viewmodelMosqueInt0) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }


                    // read viewmodel.mosque == 0 ? false : true
                    viewmodelMosqueInt0BooleanFalseBooleanTrue = ((viewmodelMosqueInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0xa010L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.hospital
                        viewmodelHospital = viewmodel.getHospital();
                    }


                    // read viewmodel.hospital == 0
                    viewmodelHospitalInt0 = (viewmodelHospital) == (0);
                if((dirtyFlags & 0xa010L) != 0) {
                    if(viewmodelHospitalInt0) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read viewmodel.hospital == 0 ? false : true
                    viewmodelHospitalInt0BooleanFalseBooleanTrue = ((viewmodelHospitalInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x805fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.createAdRequest
                        viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();
                    }

                if ((dirtyFlags & 0x8050L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.bathroom_no
                            viewmodelCreateAdRequestBathroomNo = viewmodelCreateAdRequest.getBathroom_no();
                            // read viewmodel.createAdRequest.address
                            viewmodelCreateAdRequestAddress = viewmodelCreateAdRequest.getAddress();
                            // read viewmodel.createAdRequest.price
                            viewmodelCreateAdRequestPrice = viewmodelCreateAdRequest.getPrice();
                            // read viewmodel.createAdRequest.building_year
                            viewmodelCreateAdRequestBuildingYear = viewmodelCreateAdRequest.getBuilding_year();
                            // read viewmodel.createAdRequest.room_no
                            viewmodelCreateAdRequestRoomNo = viewmodelCreateAdRequest.getRoom_no();
                            // read viewmodel.createAdRequest.desc
                            viewmodelCreateAdRequestDesc = viewmodelCreateAdRequest.getDesc();
                            // read viewmodel.createAdRequest.street_width
                            viewmodelCreateAdRequestStreetWidth = viewmodelCreateAdRequest.getStreet_width();
                            // read viewmodel.createAdRequest.kitchen_no
                            viewmodelCreateAdRequestKitchenNo = viewmodelCreateAdRequest.getKitchen_no();
                            // read viewmodel.createAdRequest.front_no
                            viewmodelCreateAdRequestFrontNo = viewmodelCreateAdRequest.getFront_no();
                            // read viewmodel.createAdRequest.listing_id
                            viewmodelCreateAdRequestListingId = viewmodelCreateAdRequest.getListing_id();
                            // read viewmodel.createAdRequest.area
                            viewmodelCreateAdRequestArea = viewmodelCreateAdRequest.getArea();
                        }


                        // read viewmodel.createAdRequest.listing_id == 0
                        viewmodelCreateAdRequestListingIdInt0 = (viewmodelCreateAdRequestListingId) == (0);
                    if((dirtyFlags & 0x8050L) != 0) {
                        if(viewmodelCreateAdRequestListingIdInt0) {
                                dirtyFlags |= 0x80000000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000000L;
                        }
                    }


                        // read viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
                        viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit = ((viewmodelCreateAdRequestListingIdInt0) ? (confirmBtn.getResources().getString(R.string.post_ad)) : (confirmBtn.getResources().getString(R.string.edit)));
                }
                if ((dirtyFlags & 0x8051L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.priceError
                            viewmodelCreateAdRequestPriceError = viewmodelCreateAdRequest.priceError;
                        }
                        updateRegistration(0, viewmodelCreateAdRequestPriceError);


                        if (viewmodelCreateAdRequestPriceError != null) {
                            // read viewmodel.createAdRequest.priceError.get()
                            viewmodelCreateAdRequestPriceErrorGet = viewmodelCreateAdRequestPriceError.get();
                        }
                }
                if ((dirtyFlags & 0x8052L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.buildingYearError
                            viewmodelCreateAdRequestBuildingYearError = viewmodelCreateAdRequest.buildingYearError;
                        }
                        updateRegistration(1, viewmodelCreateAdRequestBuildingYearError);


                        if (viewmodelCreateAdRequestBuildingYearError != null) {
                            // read viewmodel.createAdRequest.buildingYearError.get()
                            viewmodelCreateAdRequestBuildingYearErrorGet = viewmodelCreateAdRequestBuildingYearError.get();
                        }
                }
                if ((dirtyFlags & 0x8054L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.addressError
                            viewmodelCreateAdRequestAddressError = viewmodelCreateAdRequest.getAddressError();
                        }
                        updateRegistration(2, viewmodelCreateAdRequestAddressError);


                        if (viewmodelCreateAdRequestAddressError != null) {
                            // read viewmodel.createAdRequest.addressError.get()
                            viewmodelCreateAdRequestAddressErrorGet = viewmodelCreateAdRequestAddressError.get();
                        }
                }
                if ((dirtyFlags & 0x8058L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.areaError
                            viewmodelCreateAdRequestAreaError = viewmodelCreateAdRequest.areaError;
                        }
                        updateRegistration(3, viewmodelCreateAdRequestAreaError);


                        if (viewmodelCreateAdRequestAreaError != null) {
                            // read viewmodel.createAdRequest.areaError.get()
                            viewmodelCreateAdRequestAreaErrorGet = viewmodelCreateAdRequestAreaError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x8030L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dealingType
                        viewmodelDealingType = viewmodel.getDealingType();
                    }


                    // read viewmodel.dealingType == 1
                    viewmodelDealingTypeInt1 = (viewmodelDealingType) == (1);
                    // read viewmodel.dealingType == 0
                    viewmodelDealingTypeInt0 = (viewmodelDealingType) == (0);
                if((dirtyFlags & 0x8030L) != 0) {
                    if(viewmodelDealingTypeInt1) {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x8000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x4000000000000000L;
                    }
                }
                if((dirtyFlags & 0x8030L) != 0) {
                    if(viewmodelDealingTypeInt0) {
                            dirtyFlags |= 0x800000000000L;
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000L;
                            dirtyFlags |= 0x100000000000000L;
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
            if ((dirtyFlags & 0x8110L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.docType
                        viewmodelDocType = viewmodel.getDocType();
                    }


                    // read viewmodel.docType != 1
                    viewmodelDocTypeInt1 = (viewmodelDocType) != (1);
                    // read viewmodel.docType != 2
                    viewmodelDocTypeInt2 = (viewmodelDocType) != (2);
                    // read viewmodel.docType != 3
                    viewmodelDocTypeInt3 = (viewmodelDocType) != (3);
                    // read viewmodel.docType != 0
                    viewmodelDocTypeInt0 = (viewmodelDocType) != (0);
                if((dirtyFlags & 0x8110L) != 0) {
                    if(viewmodelDocTypeInt1) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x8110L) != 0) {
                    if(viewmodelDocTypeInt2) {
                            dirtyFlags |= 0x800000000000000L;
                            dirtyFlags_1 |= 0x2L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000000L;
                            dirtyFlags_1 |= 0x1L;
                    }
                }
                if((dirtyFlags & 0x8110L) != 0) {
                    if(viewmodelDocTypeInt3) {
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x100000000L;
                    }
                }
                if((dirtyFlags & 0x8110L) != 0) {
                    if(viewmodelDocTypeInt0) {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btCustomize.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btCustomize.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = ((viewmodelDocTypeInt1) ? (getColorFromResource(btCustomize, R.color.colordark)) : (getColorFromResource(btCustomize, R.color.white)));
                    // read viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btHolyKing.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btHolyKing.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = ((viewmodelDocTypeInt2) ? (getColorFromResource(btHolyKing, R.color.colordark)) : (getColorFromResource(btHolyKing, R.color.white)));
                    // read viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = ((viewmodelDocTypeInt3) ? (getColorFromResource(btTitleDeed, R.color.colordark)) : (getColorFromResource(btTitleDeed, R.color.white)));
                    // read viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTitleDeed.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTitleDeed.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = ((viewmodelDocTypeInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnRealEstateCertificate.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnRealEstateCertificate.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
                    viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = ((viewmodelDocTypeInt0) ? (getColorFromResource(btnRealEstateCertificate, R.color.colordark)) : (getColorFromResource(btnRealEstateCertificate, R.color.white)));
            }
            if ((dirtyFlags & 0x9010L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.school
                        viewmodelSchool = viewmodel.getSchool();
                    }


                    // read viewmodel.school == 0
                    viewmodelSchoolInt0 = (viewmodelSchool) == (0);
                if((dirtyFlags & 0x9010L) != 0) {
                    if(viewmodelSchoolInt0) {
                            dirtyFlags |= 0x80000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000000L;
                    }
                }


                    // read viewmodel.school == 0 ? false : true
                    viewmodelSchoolInt0BooleanFalseBooleanTrue = ((viewmodelSchoolInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0xc010L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.policeStation
                        viewmodelPoliceStation = viewmodel.getPoliceStation();
                    }


                    // read viewmodel.policeStation == 0
                    viewmodelPoliceStationInt0 = (viewmodelPoliceStation) == (0);
                if((dirtyFlags & 0xc010L) != 0) {
                    if(viewmodelPoliceStationInt0) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read viewmodel.policeStation == 0 ? false : true
                    viewmodelPoliceStationInt0BooleanFalseBooleanTrue = ((viewmodelPoliceStationInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x8410L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.furniture
                        viewmodelFurniture = viewmodel.getFurniture();
                    }


                    // read viewmodel.furniture == 0
                    viewmodelFurnitureInt0 = (viewmodelFurniture) == (0);
                if((dirtyFlags & 0x8410L) != 0) {
                    if(viewmodelFurnitureInt0) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = ((viewmodelFurnitureInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x8090L) != 0) {

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
                if((dirtyFlags & 0x8090L) != 0) {
                    if(viewmodelPaymentMethodInt0) {
                            dirtyFlags |= 0x8000000000000L;
                            dirtyFlags |= 0x2000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000000L;
                            dirtyFlags |= 0x1000000000000000L;
                    }
                }
                if((dirtyFlags & 0x8090L) != 0) {
                    if(viewmodelPaymentMethodInt2) {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x100000000000L;
                    }
                }
                if((dirtyFlags & 0x8090L) != 0) {
                    if(viewmodelPaymentMethodInt1) {
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                }


                    // read viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = ((viewmodelPaymentMethodInt0) ? (getColorFromResource(btnCash, R.color.colordark)) : (getColorFromResource(btnCash, R.color.white)));
                    // read viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCash.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCash.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTransform.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btTransform.getContext(), R.drawable.corner_view_primary_dark)));
                    // read viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite = ((viewmodelPaymentMethodInt2) ? (getColorFromResource(btTransform, R.color.colordark)) : (getColorFromResource(btTransform, R.color.white)));
                    // read viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
                    viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = ((viewmodelPaymentMethodInt1) ? (getColorFromResource(btSac, R.color.colordark)) : (getColorFromResource(btSac, R.color.white)));
                    // read viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
                    viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = ((viewmodelPaymentMethodInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btSac.getContext(), R.drawable.corner_view_light)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btSac.getContext(), R.drawable.corner_view_primary_dark)));
            }
            if ((dirtyFlags & 0x8210L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.garage
                        viewmodelGarage = viewmodel.getGarage();
                    }


                    // read viewmodel.garage == 0
                    viewmodelGarageInt0 = (viewmodelGarage) == (0);
                if((dirtyFlags & 0x8210L) != 0) {
                    if(viewmodelGarageInt0) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = ((viewmodelGarageInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8110L) != 0) {
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
        if ((dirtyFlags & 0x8000L) != 0) {
            // api target 1

            this.btCustomize.setOnClickListener(mCallback56);
            this.btHolyKing.setOnClickListener(mCallback57);
            this.btMnahda.setOnClickListener(mCallback51);
            this.btSac.setOnClickListener(mCallback53);
            this.btTitleDeed.setOnClickListener(mCallback58);
            this.btTransform.setOnClickListener(mCallback54);
            this.btnCash.setOnClickListener(mCallback52);
            this.btnRealEstateCertificate.setOnClickListener(mCallback55);
            this.btnSell.setOnClickListener(mCallback50);
            this.confirmBtn.setOnClickListener(mCallback65);
            this.furnitureToggle.setOnClickListener(mCallback60);
            this.garageToggle.setOnClickListener(mCallback59);
            this.hospital.setOnClickListener(mCallback63);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFrontCount, incrementalViewFrontCountvalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewKitchenNumber, incrementalViewKitchenNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewPathsNumber, incrementalViewPathsNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewRoomsNumber, incrementalViewRoomsNumbervalueAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputAddress, inputAddresstextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputDesc, inputDesctextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputLandSize, inputLandSizetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPrice, inputPricetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputStreetSize, inputStreetSizetextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
            this.mosque.setOnClickListener(mCallback61);
            this.policeStation.setOnClickListener(mCallback64);
            this.school.setOnClickListener(mCallback62);
        }
        if ((dirtyFlags & 0x8030L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btMnahda, viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark);
            this.btMnahda.setTextColor(viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSell, viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark);
            this.btnSell.setTextColor(viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite);
        }
        if ((dirtyFlags & 0x8090L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btSac, viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark);
            this.btSac.setTextColor(viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btTransform, viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark);
            this.btTransform.setTextColor(viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnCash, viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark);
            this.btnCash.setTextColor(viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite);
        }
        if ((dirtyFlags & 0x8050L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.confirmBtn, viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFrontCount, viewmodelCreateAdRequestFrontNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewKitchenNumber, viewmodelCreateAdRequestKitchenNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewPathsNumber, viewmodelCreateAdRequestBathroomNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewRoomsNumber, viewmodelCreateAdRequestRoomNo);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputAddress, viewmodelCreateAdRequestAddress);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputDesc, viewmodelCreateAdRequestDesc);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputLandSize, viewmodelCreateAdRequestArea);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPrice, viewmodelCreateAdRequestPrice);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputStreetSize, viewmodelCreateAdRequestStreetWidth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelCreateAdRequestBuildingYear);
        }
        if ((dirtyFlags & 0x8410L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.furnitureToggle, viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x8210L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.garageToggle, viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0xa010L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.hospital, viewmodelHospitalInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x8054L) != 0) {
            // api target 1

            this.inputAddress.setError(viewmodelCreateAdRequestAddressErrorGet);
        }
        if ((dirtyFlags & 0x8058L) != 0) {
            // api target 1

            this.inputLandSize.setError(viewmodelCreateAdRequestAreaErrorGet);
        }
        if ((dirtyFlags & 0x8051L) != 0) {
            // api target 1

            this.inputPrice.setError(viewmodelCreateAdRequestPriceErrorGet);
        }
        if ((dirtyFlags & 0x8052L) != 0) {
            // api target 1

            this.mboundView9.setError(viewmodelCreateAdRequestBuildingYearErrorGet);
        }
        if ((dirtyFlags & 0x8810L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mosque, viewmodelMosqueInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0xc010L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.policeStation, viewmodelPoliceStationInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x9010L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.school, viewmodelSchoolInt0BooleanFalseBooleanTrue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 10: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.garageChecked();
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
            case 16: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createFlatStoreOfficeAd();
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
            case 15: {
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
            case 13: {
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
            case 14: {
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
            case 11: {
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
            case 12: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.createAdRequest.priceError
        flag 1 (0x2L): viewmodel.createAdRequest.buildingYearError
        flag 2 (0x3L): viewmodel.createAdRequest.addressError
        flag 3 (0x4L): viewmodel.createAdRequest.areaError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.dealingType
        flag 6 (0x7L): viewmodel.createAdRequest
        flag 7 (0x8L): viewmodel.paymentMethod
        flag 8 (0x9L): viewmodel.docType
        flag 9 (0xaL): viewmodel.garage
        flag 10 (0xbL): viewmodel.furniture
        flag 11 (0xcL): viewmodel.mosque
        flag 12 (0xdL): viewmodel.school
        flag 13 (0xeL): viewmodel.hospital
        flag 14 (0xfL): viewmodel.policeStation
        flag 15 (0x10L): null
        flag 16 (0x11L): viewmodel.hospital == 0 ? false : true
        flag 17 (0x12L): viewmodel.hospital == 0 ? false : true
        flag 18 (0x13L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 19 (0x14L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 20 (0x15L): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 21 (0x16L): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 22 (0x17L): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 23 (0x18L): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 24 (0x19L): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 25 (0x1aL): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 26 (0x1bL): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 27 (0x1cL): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 28 (0x1dL): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 29 (0x1eL): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 30 (0x1fL): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 31 (0x20L): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 32 (0x21L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 33 (0x22L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 34 (0x23L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 35 (0x24L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 36 (0x25L): viewmodel.policeStation == 0 ? false : true
        flag 37 (0x26L): viewmodel.policeStation == 0 ? false : true
        flag 38 (0x27L): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 39 (0x28L): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 40 (0x29L): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 41 (0x2aL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 42 (0x2bL): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 43 (0x2cL): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 44 (0x2dL): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 45 (0x2eL): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 46 (0x2fL): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 47 (0x30L): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 48 (0x31L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 49 (0x32L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 50 (0x33L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 51 (0x34L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 52 (0x35L): viewmodel.mosque == 0 ? false : true
        flag 53 (0x36L): viewmodel.mosque == 0 ? false : true
        flag 54 (0x37L): viewmodel.school == 0 ? false : true
        flag 55 (0x38L): viewmodel.school == 0 ? false : true
        flag 56 (0x39L): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 57 (0x3aL): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 58 (0x3bL): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 59 (0x3cL): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 60 (0x3dL): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 61 (0x3eL): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 62 (0x3fL): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 63 (0x40L): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 64 (0x41L): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
        flag 65 (0x42L): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
    flag mapping end*/
    //end
}