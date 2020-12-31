package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddVillaHouseFormBindingImpl extends FragmentAddVillaHouseFormBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v1, 32);
        sViewsWithIds.put(R.id.tv_deal_type, 33);
        sViewsWithIds.put(R.id.v2, 34);
        sViewsWithIds.put(R.id.tv_price, 35);
        sViewsWithIds.put(R.id.v3, 36);
        sViewsWithIds.put(R.id.tv_address, 37);
        sViewsWithIds.put(R.id.v4, 38);
        sViewsWithIds.put(R.id.tv_land_size, 39);
        sViewsWithIds.put(R.id.v5, 40);
        sViewsWithIds.put(R.id.tv_building_size, 41);
        sViewsWithIds.put(R.id.v6, 42);
        sViewsWithIds.put(R.id.tv_floor_size, 43);
        sViewsWithIds.put(R.id.v7, 44);
        sViewsWithIds.put(R.id.tv_floor_count, 45);
        sViewsWithIds.put(R.id.v8, 46);
        sViewsWithIds.put(R.id.tv_rooms_count, 47);
        sViewsWithIds.put(R.id.v9, 48);
        sViewsWithIds.put(R.id.tv_paths_count, 49);
        sViewsWithIds.put(R.id.v10, 50);
        sViewsWithIds.put(R.id.tv_kitchen_count, 51);
        sViewsWithIds.put(R.id.v11, 52);
        sViewsWithIds.put(R.id.tv_building_year, 53);
        sViewsWithIds.put(R.id.buildingYear, 54);
        sViewsWithIds.put(R.id.v12, 55);
        sViewsWithIds.put(R.id.tv_payment_type, 56);
        sViewsWithIds.put(R.id.v13, 57);
        sViewsWithIds.put(R.id.tv_doc_type, 58);
        sViewsWithIds.put(R.id.br3, 59);
        sViewsWithIds.put(R.id.optional_layout, 60);
        sViewsWithIds.put(R.id.expansionLayoutHeader, 61);
        sViewsWithIds.put(R.id.headerIndicator, 62);
        sViewsWithIds.put(R.id.header_menu_name, 63);
        sViewsWithIds.put(R.id.expansionLayout, 64);
        sViewsWithIds.put(R.id.tv_street_size, 65);
        sViewsWithIds.put(R.id.v14, 66);
        sViewsWithIds.put(R.id.tv_front_count, 67);
        sViewsWithIds.put(R.id.v15, 68);
        sViewsWithIds.put(R.id.tv_pool, 69);
        sViewsWithIds.put(R.id.tv_elevator, 70);
        sViewsWithIds.put(R.id.tv_garage, 71);
        sViewsWithIds.put(R.id.tv_furniture, 72);
        sViewsWithIds.put(R.id.v16, 73);
        sViewsWithIds.put(R.id.tv_services, 74);
        sViewsWithIds.put(R.id.v17, 75);
        sViewsWithIds.put(R.id.tv_building_desc, 76);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final grand.app.akar.customViews.views.DateEditText mboundView12;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback77;
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener incrementalViewFloorNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.floor_no
            //         is viewmodel.createAdRequest.setFloor_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewFloorNumber);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel.createAdRequest.floor_no
            java.lang.String viewmodelCreateAdRequestFloorNo = null;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setFloor_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
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
    private androidx.databinding.InverseBindingListener inputBuildingSizetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.total_area
            //         is viewmodel.createAdRequest.setTotal_area((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputBuildingSize);
            // localize variables for thread safety
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest.total_area
            java.lang.String viewmodelCreateAdRequestTotalArea = null;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setTotal_area(((java.lang.String) (callbackArg_0)));
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
    private androidx.databinding.InverseBindingListener inputFloorSizetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.floor_area
            //         is viewmodel.createAdRequest.setFloor_area((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputFloorSize);
            // localize variables for thread safety
            // viewmodel.createAdRequest.floor_area
            java.lang.String viewmodelCreateAdRequestFloorArea = null;
            // viewmodel.createAdRequest
            grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createAdRequest != null
            boolean viewmodelCreateAdRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();

                viewmodelCreateAdRequestJavaLangObjectNull = (viewmodelCreateAdRequest) != (null);
                if (viewmodelCreateAdRequestJavaLangObjectNull) {




                    viewmodelCreateAdRequest.setFloor_area(((java.lang.String) (callbackArg_0)));
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
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createAdRequest.building_year
            //         is viewmodel.createAdRequest.setBuilding_year((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
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

    public FragmentAddVillaHouseFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 77, sIncludes, sViewsWithIds));
    }
    private FragmentAddVillaHouseFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (androidx.constraintlayout.widget.Barrier) bindings[59]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[19]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[54]
            , (androidx.appcompat.widget.AppCompatButton) bindings[31]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[64]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[61]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[62]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[63]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[28]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[8]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[21]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[11]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[10]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[9]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[6]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[30]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[7]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[5]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[20]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[26]
            , (android.widget.LinearLayout) bindings[60]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[27]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[37]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[76]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[41]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[53]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[33]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[58]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[70]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[45]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[43]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[67]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[72]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[71]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[51]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[39]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[49]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[56]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[69]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[35]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[47]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[74]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[65]
            , (android.view.View) bindings[32]
            , (android.view.View) bindings[50]
            , (android.view.View) bindings[52]
            , (android.view.View) bindings[55]
            , (android.view.View) bindings[57]
            , (android.view.View) bindings[66]
            , (android.view.View) bindings[68]
            , (android.view.View) bindings[73]
            , (android.view.View) bindings[75]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[36]
            , (android.view.View) bindings[38]
            , (android.view.View) bindings[40]
            , (android.view.View) bindings[42]
            , (android.view.View) bindings[44]
            , (android.view.View) bindings[46]
            , (android.view.View) bindings[48]
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
        this.elevatorToggle.setTag(null);
        this.furnitureToggle.setTag(null);
        this.garageToggle.setTag(null);
        this.hospital.setTag(null);
        this.incrementalViewFloorNumber.setTag(null);
        this.incrementalViewFrontCount.setTag(null);
        this.incrementalViewKitchenNumber.setTag(null);
        this.incrementalViewPathsNumber.setTag(null);
        this.incrementalViewRoomsNumber.setTag(null);
        this.inputAddress.setTag(null);
        this.inputBuildingSize.setTag(null);
        this.inputDesc.setTag(null);
        this.inputFloorSize.setTag(null);
        this.inputLandSize.setTag(null);
        this.inputPrice.setTag(null);
        this.inputStreetSize.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (grand.app.akar.customViews.views.DateEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mosque.setTag(null);
        this.policeStation.setTag(null);
        this.poolToggle.setTag(null);
        this.school.setTag(null);
        setRootTag(root);
        // listeners
        mCallback70 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback82 = new grand.app.akar.generated.callback.OnClickListener(this, 17);
        mCallback83 = new grand.app.akar.generated.callback.OnClickListener(this, 18);
        mCallback71 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback80 = new grand.app.akar.generated.callback.OnClickListener(this, 15);
        mCallback81 = new grand.app.akar.generated.callback.OnClickListener(this, 16);
        mCallback69 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback67 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback79 = new grand.app.akar.generated.callback.OnClickListener(this, 14);
        mCallback68 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback77 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback78 = new grand.app.akar.generated.callback.OnClickListener(this, 13);
        mCallback66 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback74 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback76 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        mCallback75 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback72 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback73 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100000L;
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
        if (BR.createRequest == variableId) {
            setCreateRequest((grand.app.akar.pages.ads.models.CreateAdRequest) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCreateRequest(@Nullable grand.app.akar.pages.ads.models.CreateAdRequest CreateRequest) {
        this.mCreateRequest = CreateRequest;
    }
    public void setViewmodel(@Nullable grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel) {
        updateRegistration(5, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCreateAdRequestFloorAreaError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelCreateAdRequestPriceError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelCreateAdRequestBuildingYearError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelCreateAdRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelCreateAdRequestAreaError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) object, fieldId);
            case 6 :
                return onChangeViewmodelCreateAdRequestTotalAreaError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestFloorAreaError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestFloorAreaError, int fieldId) {
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
    private boolean onChangeViewmodelCreateAdRequestBuildingYearError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestBuildingYearError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
    private boolean onChangeViewmodelCreateAdRequestAreaError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestAreaError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.dealingType) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.createAdRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.paymentMethod) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.docType) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.pool) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.lift) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.garage) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.furniture) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.mosque) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        else if (fieldId == BR.school) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        else if (fieldId == BR.hospital) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        else if (fieldId == BR.policeStation) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCreateAdRequestTotalAreaError(androidx.databinding.ObservableField<java.lang.String> ViewmodelCreateAdRequestTotalAreaError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestFloorAreaError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestPriceError = null;
        int viewmodelMosque = 0;
        android.graphics.drawable.Drawable viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = null;
        java.lang.String viewmodelCreateAdRequestAddress = null;
        java.lang.String viewmodelCreateAdRequestPrice = null;
        java.lang.String viewmodelCreateAdRequestTotalArea = null;
        int viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = 0;
        int viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt1 = false;
        boolean viewmodelPaymentMethodInt0 = false;
        java.lang.String viewmodelCreateAdRequestBuildingYearErrorGet = null;
        int viewmodelHospital = 0;
        android.graphics.drawable.Drawable viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestBuildingYear = null;
        boolean viewmodelCreateAdRequestListingIdInt0 = false;
        java.lang.String viewmodelCreateAdRequestFloorAreaErrorGet = null;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark = null;
        grand.app.akar.pages.ads.models.CreateAdRequest viewmodelCreateAdRequest = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestBuildingYearError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestAddressError = null;
        int viewmodelDealingType = 0;
        int viewmodelDocType = 0;
        boolean viewmodelGarageInt0 = false;
        boolean viewmodelLiftInt0 = false;
        int viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = 0;
        boolean viewmodelPaymentMethodInt2 = false;
        boolean viewmodelPoliceStationInt0BooleanFalseBooleanTrue = false;
        boolean viewmodelDocTypeInt2 = false;
        int viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = 0;
        boolean viewmodelHospitalInt0 = false;
        boolean viewmodelSchoolInt0 = false;
        boolean viewmodelPoolInt0 = false;
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
        int viewmodelPool = 0;
        java.lang.String viewmodelCreateAdRequestFloorArea = null;
        boolean viewmodelMosqueInt0 = false;
        android.graphics.drawable.Drawable viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill = null;
        java.lang.String viewmodelCreateAdRequestDesc = null;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = 0;
        java.lang.String viewmodelCreateAdRequestStreetWidth = null;
        boolean viewmodelMosqueInt0BooleanFalseBooleanTrue = false;
        java.lang.String viewmodelCreateAdRequestTotalAreaErrorGet = null;
        boolean viewmodelPoliceStationInt0 = false;
        int viewmodelLift = 0;
        boolean viewmodelSchoolInt0BooleanFalseBooleanTrue = false;
        int viewmodelFurniture = 0;
        grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;
        int viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite = 0;
        java.lang.String viewmodelCreateAdRequestFloorNo = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelCreateAdRequestPriceErrorGet = null;
        int viewmodelPaymentMethod = 0;
        android.graphics.drawable.Drawable viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill = null;
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelCreateAdRequestTotalAreaError = null;
        int viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = 0;

        if ((dirtyFlags & 0x1fff7fL) != 0) {


            if ((dirtyFlags & 0x110020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.mosque
                        viewmodelMosque = viewmodel.getMosque();
                    }


                    // read viewmodel.mosque == 0
                    viewmodelMosqueInt0 = (viewmodelMosque) == (0);
                if((dirtyFlags & 0x110020L) != 0) {
                    if(viewmodelMosqueInt0) {
                            dirtyFlags |= 0x1000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000000L;
                    }
                }


                    // read viewmodel.mosque == 0 ? false : true
                    viewmodelMosqueInt0BooleanFalseBooleanTrue = ((viewmodelMosqueInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x140020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.hospital
                        viewmodelHospital = viewmodel.getHospital();
                    }


                    // read viewmodel.hospital == 0
                    viewmodelHospitalInt0 = (viewmodelHospital) == (0);
                if((dirtyFlags & 0x140020L) != 0) {
                    if(viewmodelHospitalInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewmodel.hospital == 0 ? false : true
                    viewmodelHospitalInt0BooleanFalseBooleanTrue = ((viewmodelHospitalInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x10027fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.createAdRequest
                        viewmodelCreateAdRequest = viewmodel.getCreateAdRequest();
                    }

                if ((dirtyFlags & 0x100220L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.bathroom_no
                            viewmodelCreateAdRequestBathroomNo = viewmodelCreateAdRequest.getBathroom_no();
                            // read viewmodel.createAdRequest.address
                            viewmodelCreateAdRequestAddress = viewmodelCreateAdRequest.getAddress();
                            // read viewmodel.createAdRequest.price
                            viewmodelCreateAdRequestPrice = viewmodelCreateAdRequest.getPrice();
                            // read viewmodel.createAdRequest.total_area
                            viewmodelCreateAdRequestTotalArea = viewmodelCreateAdRequest.getTotal_area();
                            // read viewmodel.createAdRequest.building_year
                            viewmodelCreateAdRequestBuildingYear = viewmodelCreateAdRequest.getBuilding_year();
                            // read viewmodel.createAdRequest.room_no
                            viewmodelCreateAdRequestRoomNo = viewmodelCreateAdRequest.getRoom_no();
                            // read viewmodel.createAdRequest.floor_area
                            viewmodelCreateAdRequestFloorArea = viewmodelCreateAdRequest.getFloor_area();
                            // read viewmodel.createAdRequest.desc
                            viewmodelCreateAdRequestDesc = viewmodelCreateAdRequest.getDesc();
                            // read viewmodel.createAdRequest.street_width
                            viewmodelCreateAdRequestStreetWidth = viewmodelCreateAdRequest.getStreet_width();
                            // read viewmodel.createAdRequest.floor_no
                            viewmodelCreateAdRequestFloorNo = viewmodelCreateAdRequest.getFloor_no();
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
                    if((dirtyFlags & 0x100220L) != 0) {
                        if(viewmodelCreateAdRequestListingIdInt0) {
                                dirtyFlags |= 0x1000000000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000000000L;
                        }
                    }


                        // read viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
                        viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit = ((viewmodelCreateAdRequestListingIdInt0) ? (confirmBtn.getResources().getString(R.string.post_ad)) : (confirmBtn.getResources().getString(R.string.edit)));
                }
                if ((dirtyFlags & 0x100221L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.floorAreaError
                            viewmodelCreateAdRequestFloorAreaError = viewmodelCreateAdRequest.floorAreaError;
                        }
                        updateRegistration(0, viewmodelCreateAdRequestFloorAreaError);


                        if (viewmodelCreateAdRequestFloorAreaError != null) {
                            // read viewmodel.createAdRequest.floorAreaError.get()
                            viewmodelCreateAdRequestFloorAreaErrorGet = viewmodelCreateAdRequestFloorAreaError.get();
                        }
                }
                if ((dirtyFlags & 0x100222L) != 0) {

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
                if ((dirtyFlags & 0x100224L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.buildingYearError
                            viewmodelCreateAdRequestBuildingYearError = viewmodelCreateAdRequest.buildingYearError;
                        }
                        updateRegistration(2, viewmodelCreateAdRequestBuildingYearError);


                        if (viewmodelCreateAdRequestBuildingYearError != null) {
                            // read viewmodel.createAdRequest.buildingYearError.get()
                            viewmodelCreateAdRequestBuildingYearErrorGet = viewmodelCreateAdRequestBuildingYearError.get();
                        }
                }
                if ((dirtyFlags & 0x100228L) != 0) {

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
                if ((dirtyFlags & 0x100230L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.areaError
                            viewmodelCreateAdRequestAreaError = viewmodelCreateAdRequest.areaError;
                        }
                        updateRegistration(4, viewmodelCreateAdRequestAreaError);


                        if (viewmodelCreateAdRequestAreaError != null) {
                            // read viewmodel.createAdRequest.areaError.get()
                            viewmodelCreateAdRequestAreaErrorGet = viewmodelCreateAdRequestAreaError.get();
                        }
                }
                if ((dirtyFlags & 0x100260L) != 0) {

                        if (viewmodelCreateAdRequest != null) {
                            // read viewmodel.createAdRequest.totalAreaError
                            viewmodelCreateAdRequestTotalAreaError = viewmodelCreateAdRequest.totalAreaError;
                        }
                        updateRegistration(6, viewmodelCreateAdRequestTotalAreaError);


                        if (viewmodelCreateAdRequestTotalAreaError != null) {
                            // read viewmodel.createAdRequest.totalAreaError.get()
                            viewmodelCreateAdRequestTotalAreaErrorGet = viewmodelCreateAdRequestTotalAreaError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x100120L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dealingType
                        viewmodelDealingType = viewmodel.getDealingType();
                    }


                    // read viewmodel.dealingType == 1
                    viewmodelDealingTypeInt1 = (viewmodelDealingType) == (1);
                    // read viewmodel.dealingType == 0
                    viewmodelDealingTypeInt0 = (viewmodelDealingType) == (0);
                if((dirtyFlags & 0x100120L) != 0) {
                    if(viewmodelDealingTypeInt1) {
                            dirtyFlags |= 0x400000000L;
                            dirtyFlags_1 |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags_1 |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x100120L) != 0) {
                    if(viewmodelDealingTypeInt0) {
                            dirtyFlags |= 0x40000000000000L;
                            dirtyFlags_1 |= 0x1L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                            dirtyFlags |= 0x8000000000000000L;
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
            if ((dirtyFlags & 0x100820L) != 0) {

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
                if((dirtyFlags & 0x100820L) != 0) {
                    if(viewmodelDocTypeInt1) {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x100820L) != 0) {
                    if(viewmodelDocTypeInt2) {
                            dirtyFlags_1 |= 0x4L;
                            dirtyFlags_1 |= 0x400L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2L;
                            dirtyFlags_1 |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x100820L) != 0) {
                    if(viewmodelDocTypeInt3) {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x100820L) != 0) {
                    if(viewmodelDocTypeInt0) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x8000000000L;
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
            if ((dirtyFlags & 0x120020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.school
                        viewmodelSchool = viewmodel.getSchool();
                    }


                    // read viewmodel.school == 0
                    viewmodelSchoolInt0 = (viewmodelSchool) == (0);
                if((dirtyFlags & 0x120020L) != 0) {
                    if(viewmodelSchoolInt0) {
                            dirtyFlags |= 0x4000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000000L;
                    }
                }


                    // read viewmodel.school == 0 ? false : true
                    viewmodelSchoolInt0BooleanFalseBooleanTrue = ((viewmodelSchoolInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x180020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.policeStation
                        viewmodelPoliceStation = viewmodel.getPoliceStation();
                    }


                    // read viewmodel.policeStation == 0
                    viewmodelPoliceStationInt0 = (viewmodelPoliceStation) == (0);
                if((dirtyFlags & 0x180020L) != 0) {
                    if(viewmodelPoliceStationInt0) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read viewmodel.policeStation == 0 ? false : true
                    viewmodelPoliceStationInt0BooleanFalseBooleanTrue = ((viewmodelPoliceStationInt0) ? (false) : (true));
            }
            if ((dirtyFlags & 0x101020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.pool
                        viewmodelPool = viewmodel.getPool();
                    }


                    // read viewmodel.pool == 0
                    viewmodelPoolInt0 = (viewmodelPool) == (0);
                if((dirtyFlags & 0x101020L) != 0) {
                    if(viewmodelPoolInt0) {
                            dirtyFlags_1 |= 0x10L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8L;
                    }
                }


                    // read viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill = ((viewmodelPoolInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(poolToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(poolToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x102020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lift
                        viewmodelLift = viewmodel.getLift();
                    }


                    // read viewmodel.lift == 0
                    viewmodelLiftInt0 = (viewmodelLift) == (0);
                if((dirtyFlags & 0x102020L) != 0) {
                    if(viewmodelLiftInt0) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }


                    // read viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill = ((viewmodelLiftInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(elevatorToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(elevatorToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x108020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.furniture
                        viewmodelFurniture = viewmodel.getFurniture();
                    }


                    // read viewmodel.furniture == 0
                    viewmodelFurnitureInt0 = (viewmodelFurniture) == (0);
                if((dirtyFlags & 0x108020L) != 0) {
                    if(viewmodelFurnitureInt0) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = ((viewmodelFurnitureInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x100420L) != 0) {

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
                if((dirtyFlags & 0x100420L) != 0) {
                    if(viewmodelPaymentMethodInt0) {
                            dirtyFlags |= 0x400000000000000L;
                            dirtyFlags_1 |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000000L;
                            dirtyFlags_1 |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x100420L) != 0) {
                    if(viewmodelPaymentMethodInt2) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
                if((dirtyFlags & 0x100420L) != 0) {
                    if(viewmodelPaymentMethodInt1) {
                            dirtyFlags |= 0x100000000000L;
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                            dirtyFlags |= 0x80000000000000L;
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
            if ((dirtyFlags & 0x104020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.garage
                        viewmodelGarage = viewmodel.getGarage();
                    }


                    // read viewmodel.garage == 0
                    viewmodelGarageInt0 = (viewmodelGarage) == (0);
                if((dirtyFlags & 0x104020L) != 0) {
                    if(viewmodelGarageInt0) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = ((viewmodelGarageInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100820L) != 0) {
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
        if ((dirtyFlags & 0x100000L) != 0) {
            // api target 1

            this.btCustomize.setOnClickListener(mCallback72);
            this.btHolyKing.setOnClickListener(mCallback73);
            this.btMnahda.setOnClickListener(mCallback67);
            this.btSac.setOnClickListener(mCallback69);
            this.btTitleDeed.setOnClickListener(mCallback74);
            this.btTransform.setOnClickListener(mCallback70);
            this.btnCash.setOnClickListener(mCallback68);
            this.btnRealEstateCertificate.setOnClickListener(mCallback71);
            this.btnSell.setOnClickListener(mCallback66);
            this.confirmBtn.setOnClickListener(mCallback83);
            this.elevatorToggle.setOnClickListener(mCallback76);
            this.furnitureToggle.setOnClickListener(mCallback78);
            this.garageToggle.setOnClickListener(mCallback77);
            this.hospital.setOnClickListener(mCallback81);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFloorNumber, incrementalViewFloorNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFrontCount, incrementalViewFrontCountvalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewKitchenNumber, incrementalViewKitchenNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewPathsNumber, incrementalViewPathsNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewRoomsNumber, incrementalViewRoomsNumbervalueAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputAddress, inputAddresstextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputBuildingSize, inputBuildingSizetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputDesc, inputDesctextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputFloorSize, inputFloorSizetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputLandSize, inputLandSizetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPrice, inputPricetextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputStreetSize, inputStreetSizetextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mosque.setOnClickListener(mCallback79);
            this.policeStation.setOnClickListener(mCallback82);
            this.poolToggle.setOnClickListener(mCallback75);
            this.school.setOnClickListener(mCallback80);
        }
        if ((dirtyFlags & 0x100120L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btMnahda, viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark);
            this.btMnahda.setTextColor(viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSell, viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark);
            this.btnSell.setTextColor(viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite);
        }
        if ((dirtyFlags & 0x100420L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btSac, viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark);
            this.btSac.setTextColor(viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btTransform, viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark);
            this.btTransform.setTextColor(viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnCash, viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark);
            this.btnCash.setTextColor(viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite);
        }
        if ((dirtyFlags & 0x100220L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.confirmBtn, viewmodelCreateAdRequestListingIdInt0ConfirmBtnAndroidStringPostAdConfirmBtnAndroidStringEdit);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFloorNumber, viewmodelCreateAdRequestFloorNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFrontCount, viewmodelCreateAdRequestFrontNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewKitchenNumber, viewmodelCreateAdRequestKitchenNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewPathsNumber, viewmodelCreateAdRequestBathroomNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewRoomsNumber, viewmodelCreateAdRequestRoomNo);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputAddress, viewmodelCreateAdRequestAddress);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputBuildingSize, viewmodelCreateAdRequestTotalArea);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputDesc, viewmodelCreateAdRequestDesc);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputFloorSize, viewmodelCreateAdRequestFloorArea);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputLandSize, viewmodelCreateAdRequestArea);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPrice, viewmodelCreateAdRequestPrice);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputStreetSize, viewmodelCreateAdRequestStreetWidth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelCreateAdRequestBuildingYear);
        }
        if ((dirtyFlags & 0x102020L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.elevatorToggle, viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x108020L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.furnitureToggle, viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x104020L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.garageToggle, viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x140020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.hospital, viewmodelHospitalInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x100228L) != 0) {
            // api target 1

            this.inputAddress.setError(viewmodelCreateAdRequestAddressErrorGet);
        }
        if ((dirtyFlags & 0x100260L) != 0) {
            // api target 1

            this.inputBuildingSize.setError(viewmodelCreateAdRequestTotalAreaErrorGet);
        }
        if ((dirtyFlags & 0x100221L) != 0) {
            // api target 1

            this.inputFloorSize.setError(viewmodelCreateAdRequestFloorAreaErrorGet);
        }
        if ((dirtyFlags & 0x100230L) != 0) {
            // api target 1

            this.inputLandSize.setError(viewmodelCreateAdRequestAreaErrorGet);
        }
        if ((dirtyFlags & 0x100222L) != 0) {
            // api target 1

            this.inputPrice.setError(viewmodelCreateAdRequestPriceErrorGet);
        }
        if ((dirtyFlags & 0x100224L) != 0) {
            // api target 1

            this.mboundView12.setError(viewmodelCreateAdRequestBuildingYearErrorGet);
        }
        if ((dirtyFlags & 0x110020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mosque, viewmodelMosqueInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x180020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.policeStation, viewmodelPoliceStationInt0BooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x101020L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.poolToggle, viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x120020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.school, viewmodelSchoolInt0BooleanFalseBooleanTrue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
            case 17: {
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
            case 18: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createAd();
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
            case 15: {
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
            case 16: {
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


                    viewmodel.mosqueChecked();
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
            case 12: {
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
            case 13: {
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
            case 11: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.liftChecked();
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


                    viewmodel.poolChecked();
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.createAdRequest.floorAreaError
        flag 1 (0x2L): viewmodel.createAdRequest.priceError
        flag 2 (0x3L): viewmodel.createAdRequest.buildingYearError
        flag 3 (0x4L): viewmodel.createAdRequest.addressError
        flag 4 (0x5L): viewmodel.createAdRequest.areaError
        flag 5 (0x6L): viewmodel
        flag 6 (0x7L): viewmodel.createAdRequest.totalAreaError
        flag 7 (0x8L): createRequest
        flag 8 (0x9L): viewmodel.dealingType
        flag 9 (0xaL): viewmodel.createAdRequest
        flag 10 (0xbL): viewmodel.paymentMethod
        flag 11 (0xcL): viewmodel.docType
        flag 12 (0xdL): viewmodel.pool
        flag 13 (0xeL): viewmodel.lift
        flag 14 (0xfL): viewmodel.garage
        flag 15 (0x10L): viewmodel.furniture
        flag 16 (0x11L): viewmodel.mosque
        flag 17 (0x12L): viewmodel.school
        flag 18 (0x13L): viewmodel.hospital
        flag 19 (0x14L): viewmodel.policeStation
        flag 20 (0x15L): null
        flag 21 (0x16L): viewmodel.hospital == 0 ? false : true
        flag 22 (0x17L): viewmodel.hospital == 0 ? false : true
        flag 23 (0x18L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 24 (0x19L): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 25 (0x1aL): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 26 (0x1bL): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 27 (0x1cL): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 28 (0x1dL): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 29 (0x1eL): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 30 (0x1fL): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 31 (0x20L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 32 (0x21L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 33 (0x22L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 34 (0x23L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 35 (0x24L): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 36 (0x25L): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 37 (0x26L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 38 (0x27L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 39 (0x28L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 40 (0x29L): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 41 (0x2aL): viewmodel.policeStation == 0 ? false : true
        flag 42 (0x2bL): viewmodel.policeStation == 0 ? false : true
        flag 43 (0x2cL): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 44 (0x2dL): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 45 (0x2eL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 46 (0x2fL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 47 (0x30L): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 48 (0x31L): viewmodel.createAdRequest.listing_id == 0 ? @android:string/post_ad : @android:string/edit
        flag 49 (0x32L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 50 (0x33L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 51 (0x34L): viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 52 (0x35L): viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 53 (0x36L): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 54 (0x37L): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 55 (0x38L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 56 (0x39L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 57 (0x3aL): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 58 (0x3bL): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 59 (0x3cL): viewmodel.mosque == 0 ? false : true
        flag 60 (0x3dL): viewmodel.mosque == 0 ? false : true
        flag 61 (0x3eL): viewmodel.school == 0 ? false : true
        flag 62 (0x3fL): viewmodel.school == 0 ? false : true
        flag 63 (0x40L): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 64 (0x41L): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 65 (0x42L): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 66 (0x43L): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 67 (0x44L): viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 68 (0x45L): viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 69 (0x46L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 70 (0x47L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 71 (0x48L): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 72 (0x49L): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 73 (0x4aL): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
        flag 74 (0x4bL): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
    flag mapping end*/
    //end
}