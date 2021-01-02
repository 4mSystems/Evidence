package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFilterBindingImpl extends FragmentFilterBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.filter_title, 23);
        sViewsWithIds.put(R.id.icon_down, 24);
        sViewsWithIds.put(R.id.tv_about, 25);
        sViewsWithIds.put(R.id.expansionLayout, 26);
        sViewsWithIds.put(R.id.min_price, 27);
        sViewsWithIds.put(R.id.max_price, 28);
        sViewsWithIds.put(R.id.rangeBar, 29);
        sViewsWithIds.put(R.id.icon_down2, 30);
        sViewsWithIds.put(R.id.tv_land_area, 31);
        sViewsWithIds.put(R.id.expansionLayoutLandArea, 32);
        sViewsWithIds.put(R.id.min_land_area, 33);
        sViewsWithIds.put(R.id.max_land_area, 34);
        sViewsWithIds.put(R.id.rangeBarLandArea, 35);
        sViewsWithIds.put(R.id.icon_down3, 36);
        sViewsWithIds.put(R.id.tv_total_area, 37);
        sViewsWithIds.put(R.id.expansionLayoutTotalArea, 38);
        sViewsWithIds.put(R.id.min_total_area, 39);
        sViewsWithIds.put(R.id.max_total_area, 40);
        sViewsWithIds.put(R.id.rangeBarTotalArea, 41);
        sViewsWithIds.put(R.id.icon_down4, 42);
        sViewsWithIds.put(R.id.tv_floor_area, 43);
        sViewsWithIds.put(R.id.expansionLayoutFloorArea, 44);
        sViewsWithIds.put(R.id.min_floor_area, 45);
        sViewsWithIds.put(R.id.max_floor_area, 46);
        sViewsWithIds.put(R.id.rangeBarFloorArea, 47);
        sViewsWithIds.put(R.id.tv_rooms_count, 48);
        sViewsWithIds.put(R.id.tv_bath_count, 49);
        sViewsWithIds.put(R.id.tv_kitchen_count, 50);
        sViewsWithIds.put(R.id.buildingYear, 51);
        sViewsWithIds.put(R.id.tv_building_year, 52);
        sViewsWithIds.put(R.id.icon_down5, 53);
        sViewsWithIds.put(R.id.tv_payment_type, 54);
        sViewsWithIds.put(R.id.expansionLayoutPaymentType, 55);
        sViewsWithIds.put(R.id.icon_down6, 56);
        sViewsWithIds.put(R.id.tv_doc_type, 57);
        sViewsWithIds.put(R.id.expansionLayoutDocType, 58);
        sViewsWithIds.put(R.id.icon_down7, 59);
        sViewsWithIds.put(R.id.tv_street_width, 60);
        sViewsWithIds.put(R.id.expansionLayoutStreetWidth, 61);
        sViewsWithIds.put(R.id.min_street_width, 62);
        sViewsWithIds.put(R.id.max_street_width, 63);
        sViewsWithIds.put(R.id.rangeBarStreetWidth, 64);
        sViewsWithIds.put(R.id.tv_floor_count, 65);
        sViewsWithIds.put(R.id.tv_front_count, 66);
        sViewsWithIds.put(R.id.icon_down8, 67);
        sViewsWithIds.put(R.id.tv_factory_size, 68);
        sViewsWithIds.put(R.id.expansionLayoutFactorySize, 69);
        sViewsWithIds.put(R.id.min_factory_size, 70);
        sViewsWithIds.put(R.id.max_factory_size, 71);
        sViewsWithIds.put(R.id.rangeBarFactorySize, 72);
        sViewsWithIds.put(R.id.icon_down9, 73);
        sViewsWithIds.put(R.id.tv_deal_type, 74);
        sViewsWithIds.put(R.id.expansionLayoutDealType, 75);
        sViewsWithIds.put(R.id.tv_pool, 76);
        sViewsWithIds.put(R.id.tv_elevator, 77);
        sViewsWithIds.put(R.id.tv_garage, 78);
        sViewsWithIds.put(R.id.tv_furniture, 79);
        sViewsWithIds.put(R.id.tv_ad_time, 80);
        sViewsWithIds.put(R.id.confirmBtn, 81);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final grand.app.akar.customViews.views.DateEditText mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback118;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback119;
    @Nullable
    private final android.view.View.OnClickListener mCallback120;
    @Nullable
    private final android.view.View.OnClickListener mCallback112;
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback110;
    @Nullable
    private final android.view.View.OnClickListener mCallback111;
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.view.View.OnClickListener mCallback115;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener incrementalViewBathNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.bathroom_no
            //         is viewmodel.searchRequest.setBathroom_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewBathNumber);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel.searchRequest.bathroom_no
            java.lang.String viewmodelSearchRequestBathroomNo = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setBathroom_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewFloorNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.floor_no
            //         is viewmodel.searchRequest.setFloor_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewFloorNumber);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel.searchRequest.floor_no
            java.lang.String viewmodelSearchRequestFloorNo = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setFloor_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewFrontNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.front_no
            //         is viewmodel.searchRequest.setFront_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewFrontNumber);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel.searchRequest.front_no
            java.lang.String viewmodelSearchRequestFrontNo = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setFront_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewKitchenNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.kitchen_no
            //         is viewmodel.searchRequest.setKitchen_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewKitchenNumber);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel.searchRequest.kitchen_no
            java.lang.String viewmodelSearchRequestKitchenNo = null;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setKitchen_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener incrementalViewRoomsNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.room_no
            //         is viewmodel.searchRequest.setRoom_no((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.IncrementalView.setValue(incrementalViewRoomsNumber);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel.searchRequest.room_no
            java.lang.String viewmodelSearchRequestRoomNo = null;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setRoom_no(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.searchRequest.building_year
            //         is viewmodel.searchRequest.setBuilding_year((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.searchRequest
            grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
            // viewmodel.searchRequest.building_year
            java.lang.String viewmodelSearchRequestBuildingYear = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.searchRequest != null
            boolean viewmodelSearchRequestJavaLangObjectNull = false;
            // viewmodel
            grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelSearchRequest = viewmodel.getSearchRequest();

                viewmodelSearchRequestJavaLangObjectNull = (viewmodelSearchRequest) != (null);
                if (viewmodelSearchRequestJavaLangObjectNull) {




                    viewmodelSearchRequest.setBuilding_year(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 82, sIncludes, sViewsWithIds));
    }
    private FragmentFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (com.google.android.material.card.MaterialCardView) bindings[51]
            , (androidx.appcompat.widget.AppCompatButton) bindings[81]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[26]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[75]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[58]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[69]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[44]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[32]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[55]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[61]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[38]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[36]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[42]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[53]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[56]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[59]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[67]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[73]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[4]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[14]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[15]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[5]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[71]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[46]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[34]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[63]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[40]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[70]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[45]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[33]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[27]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[62]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[39]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[29]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[72]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[47]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[35]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[64]
            , (com.github.guilhe.views.SeekBarRangedView) bindings[41]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[80]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[49]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[52]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[74]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[57]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[77]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[68]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[43]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[65]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[66]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[79]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[78]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[50]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[31]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[54]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[76]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[48]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[60]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[37]
            );
        this.back.setTag(null);
        this.btCustomize.setTag(null);
        this.btHolyKing.setTag(null);
        this.btMnahda.setTag(null);
        this.btSac.setTag(null);
        this.btTitleDeed.setTag(null);
        this.btTransform.setTag(null);
        this.btnCash.setTag(null);
        this.btnRealEstateCertificate.setTag(null);
        this.btnSell.setTag(null);
        this.elevatorToggle.setTag(null);
        this.filterReset.setTag(null);
        this.furnitureToggle.setTag(null);
        this.garageToggle.setTag(null);
        this.incrementalViewBathNumber.setTag(null);
        this.incrementalViewFloorNumber.setTag(null);
        this.incrementalViewFrontNumber.setTag(null);
        this.incrementalViewKitchenNumber.setTag(null);
        this.incrementalViewRoomsNumber.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (grand.app.akar.customViews.views.DateEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.poolToggle.setTag(null);
        this.timeToggle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback108 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback109 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback106 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback118 = new grand.app.akar.generated.callback.OnClickListener(this, 14);
        mCallback107 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback119 = new grand.app.akar.generated.callback.OnClickListener(this, 15);
        mCallback120 = new grand.app.akar.generated.callback.OnClickListener(this, 16);
        mCallback112 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback113 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback110 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback111 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback116 = new grand.app.akar.generated.callback.OnClickListener(this, 12);
        mCallback117 = new grand.app.akar.generated.callback.OnClickListener(this, 13);
        mCallback105 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback114 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback115 = new grand.app.akar.generated.callback.OnClickListener(this, 11);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewmodel((grand.app.akar.pages.home.viewModels.FilterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.home.viewModels.FilterViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.akar.pages.home.viewModels.FilterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.home.viewModels.FilterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.paymentMethod) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.docType) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.dealingType) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.pool) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.lift) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.garage) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.furniture) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        android.graphics.drawable.Drawable viewmodelDocTypeInt1BtCustomizeAndroidDrawableCornerViewLightBtCustomizeAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = null;
        int viewmodelDocTypeInt1BtCustomizeAndroidColorColordarkBtCustomizeAndroidColorWhite = 0;
        int viewmodelDocTypeInt3BtTitleDeedAndroidColorColordarkBtTitleDeedAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt1 = false;
        boolean viewmodelPaymentMethodInt0 = false;
        android.graphics.drawable.Drawable viewmodelDocTypeInt0BtnRealEstateCertificateAndroidDrawableCornerViewLightBtnRealEstateCertificateAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt3BtTitleDeedAndroidDrawableCornerViewLightBtTitleDeedAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelDealingType = 0;
        int viewmodelDocType = 0;
        boolean viewmodelGarageInt0 = false;
        boolean viewmodelLiftInt0 = false;
        int viewmodelDocTypeInt0BtnRealEstateCertificateAndroidColorColordarkBtnRealEstateCertificateAndroidColorWhite = 0;
        boolean viewmodelPaymentMethodInt2 = false;
        grand.app.akar.pages.home.models.SearchRequest viewmodelSearchRequest = null;
        boolean viewmodelDocTypeInt2 = false;
        int viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite = 0;
        boolean viewmodelPoolInt0 = false;
        boolean viewmodelDealingTypeInt0 = false;
        boolean viewmodelPaymentMethodInt1 = false;
        android.graphics.drawable.Drawable viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = null;
        int viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite = 0;
        boolean viewmodelDocTypeInt3 = false;
        int viewmodelPool = 0;
        android.graphics.drawable.Drawable viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill = null;
        android.graphics.drawable.Drawable viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite = 0;
        int viewmodelLift = 0;
        java.lang.String viewmodelSearchRequestBuildingYear = null;
        int viewmodelFurniture = 0;
        grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;
        int viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite = 0;
        java.lang.String viewmodelSearchRequestFrontNo = null;
        android.graphics.drawable.Drawable viewmodelDocTypeInt2BtHolyKingAndroidDrawableCornerViewLightBtHolyKingAndroidDrawableCornerViewPrimaryDark = null;
        int viewmodelPaymentMethod = 0;
        android.graphics.drawable.Drawable viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill = null;
        android.graphics.drawable.Drawable viewmodelFurnitureInt0TimeToggleAndroidDrawableIcToggleEmptyTimeToggleAndroidDrawableIcToggleFill = null;
        android.graphics.drawable.Drawable viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark = null;
        java.lang.String viewmodelSearchRequestBathroomNo = null;
        java.lang.String viewmodelSearchRequestFloorNo = null;
        boolean viewmodelFurnitureInt0 = false;
        boolean viewmodelDocTypeInt0 = false;
        int viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite = 0;
        int viewmodelGarage = 0;
        int viewmodelDocTypeInt2BtHolyKingAndroidColorColordarkBtHolyKingAndroidColorWhite = 0;
        java.lang.String viewmodelSearchRequestKitchenNo = null;
        java.lang.String viewmodelSearchRequestRoomNo = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x109L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dealingType
                        viewmodelDealingType = viewmodel.getDealingType();
                    }


                    // read viewmodel.dealingType == 1
                    viewmodelDealingTypeInt1 = (viewmodelDealingType) == (1);
                    // read viewmodel.dealingType == 0
                    viewmodelDealingTypeInt0 = (viewmodelDealingType) == (0);
                if((dirtyFlags & 0x109L) != 0) {
                    if(viewmodelDealingTypeInt1) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                }
                if((dirtyFlags & 0x109L) != 0) {
                    if(viewmodelDealingTypeInt0) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x20000000000L;
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
            if ((dirtyFlags & 0x105L) != 0) {

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
                if((dirtyFlags & 0x105L) != 0) {
                    if(viewmodelDocTypeInt1) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x105L) != 0) {
                    if(viewmodelDocTypeInt2) {
                            dirtyFlags |= 0x100000000000L;
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                            dirtyFlags |= 0x20000000000000L;
                    }
                }
                if((dirtyFlags & 0x105L) != 0) {
                    if(viewmodelDocTypeInt3) {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x800000L;
                    }
                }
                if((dirtyFlags & 0x105L) != 0) {
                    if(viewmodelDocTypeInt0) {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x2000000L;
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
            if ((dirtyFlags & 0x101L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchRequest
                        viewmodelSearchRequest = viewmodel.getSearchRequest();
                    }


                    if (viewmodelSearchRequest != null) {
                        // read viewmodel.searchRequest.building_year
                        viewmodelSearchRequestBuildingYear = viewmodelSearchRequest.getBuilding_year();
                        // read viewmodel.searchRequest.front_no
                        viewmodelSearchRequestFrontNo = viewmodelSearchRequest.getFront_no();
                        // read viewmodel.searchRequest.bathroom_no
                        viewmodelSearchRequestBathroomNo = viewmodelSearchRequest.getBathroom_no();
                        // read viewmodel.searchRequest.floor_no
                        viewmodelSearchRequestFloorNo = viewmodelSearchRequest.getFloor_no();
                        // read viewmodel.searchRequest.kitchen_no
                        viewmodelSearchRequestKitchenNo = viewmodelSearchRequest.getKitchen_no();
                        // read viewmodel.searchRequest.room_no
                        viewmodelSearchRequestRoomNo = viewmodelSearchRequest.getRoom_no();
                    }
            }
            if ((dirtyFlags & 0x111L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.pool
                        viewmodelPool = viewmodel.getPool();
                    }


                    // read viewmodel.pool == 0
                    viewmodelPoolInt0 = (viewmodelPool) == (0);
                if((dirtyFlags & 0x111L) != 0) {
                    if(viewmodelPoolInt0) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill = ((viewmodelPoolInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(poolToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(poolToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x121L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lift
                        viewmodelLift = viewmodel.getLift();
                    }


                    // read viewmodel.lift == 0
                    viewmodelLiftInt0 = (viewmodelLift) == (0);
                if((dirtyFlags & 0x121L) != 0) {
                    if(viewmodelLiftInt0) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill = ((viewmodelLiftInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(elevatorToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(elevatorToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.furniture
                        viewmodelFurniture = viewmodel.getFurniture();
                    }


                    // read viewmodel.furniture == 0
                    viewmodelFurnitureInt0 = (viewmodelFurniture) == (0);
                if((dirtyFlags & 0x181L) != 0) {
                    if(viewmodelFurnitureInt0) {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                }


                    // read viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill = ((viewmodelFurnitureInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(furnitureToggle.getContext(), R.drawable.ic_toggle_fill)));
                    // read viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelFurnitureInt0TimeToggleAndroidDrawableIcToggleEmptyTimeToggleAndroidDrawableIcToggleFill = ((viewmodelFurnitureInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(timeToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(timeToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
            if ((dirtyFlags & 0x103L) != 0) {

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
                if((dirtyFlags & 0x103L) != 0) {
                    if(viewmodelPaymentMethodInt0) {
                            dirtyFlags |= 0x10000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
                if((dirtyFlags & 0x103L) != 0) {
                    if(viewmodelPaymentMethodInt2) {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x80000000L;
                    }
                }
                if((dirtyFlags & 0x103L) != 0) {
                    if(viewmodelPaymentMethodInt1) {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x2000000000L;
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
            if ((dirtyFlags & 0x141L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.garage
                        viewmodelGarage = viewmodel.getGarage();
                    }


                    // read viewmodel.garage == 0
                    viewmodelGarageInt0 = (viewmodelGarage) == (0);
                if((dirtyFlags & 0x141L) != 0) {
                    if(viewmodelGarageInt0) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
                    viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill = ((viewmodelGarageInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_empty)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(garageToggle.getContext(), R.drawable.ic_toggle_fill)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback105);
            this.btCustomize.setOnClickListener(mCallback111);
            this.btHolyKing.setOnClickListener(mCallback112);
            this.btMnahda.setOnClickListener(mCallback115);
            this.btSac.setOnClickListener(mCallback108);
            this.btTitleDeed.setOnClickListener(mCallback113);
            this.btTransform.setOnClickListener(mCallback109);
            this.btnCash.setOnClickListener(mCallback107);
            this.btnRealEstateCertificate.setOnClickListener(mCallback110);
            this.btnSell.setOnClickListener(mCallback114);
            this.elevatorToggle.setOnClickListener(mCallback117);
            this.filterReset.setOnClickListener(mCallback106);
            this.furnitureToggle.setOnClickListener(mCallback119);
            this.garageToggle.setOnClickListener(mCallback118);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewBathNumber, incrementalViewBathNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFloorNumber, incrementalViewFloorNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewFrontNumber, incrementalViewFrontNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewKitchenNumber, incrementalViewKitchenNumbervalueAttrChanged);
            grand.app.akar.customViews.views.IncrementalView.setValueListner(this.incrementalViewRoomsNumber, incrementalViewRoomsNumbervalueAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            this.poolToggle.setOnClickListener(mCallback116);
            this.timeToggle.setOnClickListener(mCallback120);
        }
        if ((dirtyFlags & 0x105L) != 0) {
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
        if ((dirtyFlags & 0x109L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btMnahda, viewmodelDealingTypeInt0BtMnahdaAndroidDrawableCornerViewLightBtMnahdaAndroidDrawableCornerViewPrimaryDark);
            this.btMnahda.setTextColor(viewmodelDealingTypeInt0BtMnahdaAndroidColorColordarkBtMnahdaAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSell, viewmodelDealingTypeInt1BtnSellAndroidDrawableCornerViewLightBtnSellAndroidDrawableCornerViewPrimaryDark);
            this.btnSell.setTextColor(viewmodelDealingTypeInt1BtnSellAndroidColorColordarkBtnSellAndroidColorWhite);
        }
        if ((dirtyFlags & 0x103L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btSac, viewmodelPaymentMethodInt1BtSacAndroidDrawableCornerViewLightBtSacAndroidDrawableCornerViewPrimaryDark);
            this.btSac.setTextColor(viewmodelPaymentMethodInt1BtSacAndroidColorColordarkBtSacAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btTransform, viewmodelPaymentMethodInt2BtTransformAndroidDrawableCornerViewLightBtTransformAndroidDrawableCornerViewPrimaryDark);
            this.btTransform.setTextColor(viewmodelPaymentMethodInt2BtTransformAndroidColorColordarkBtTransformAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnCash, viewmodelPaymentMethodInt0BtnCashAndroidDrawableCornerViewLightBtnCashAndroidDrawableCornerViewPrimaryDark);
            this.btnCash.setTextColor(viewmodelPaymentMethodInt0BtnCashAndroidColorColordarkBtnCashAndroidColorWhite);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.elevatorToggle, viewmodelLiftInt0ElevatorToggleAndroidDrawableIcToggleEmptyElevatorToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.furnitureToggle, viewmodelFurnitureInt0FurnitureToggleAndroidDrawableIcToggleEmptyFurnitureToggleAndroidDrawableIcToggleFill);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.timeToggle, viewmodelFurnitureInt0TimeToggleAndroidDrawableIcToggleEmptyTimeToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.garageToggle, viewmodelGarageInt0GarageToggleAndroidDrawableIcToggleEmptyGarageToggleAndroidDrawableIcToggleFill);
        }
        if ((dirtyFlags & 0x101L) != 0) {
            // api target 1

            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewBathNumber, viewmodelSearchRequestBathroomNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFloorNumber, viewmodelSearchRequestFloorNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewFrontNumber, viewmodelSearchRequestFrontNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewKitchenNumber, viewmodelSearchRequestKitchenNo);
            grand.app.akar.customViews.views.IncrementalView.getValue(this.incrementalViewRoomsNumber, viewmodelSearchRequestRoomNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelSearchRequestBuildingYear);
        }
        if ((dirtyFlags & 0x111L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.poolToggle, viewmodelPoolInt0PoolToggleAndroidDrawableIcToggleEmptyPoolToggleAndroidDrawableIcToggleFill);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.paymentMethodAction(1);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.paymentMethodAction(2);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.reset();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.garageChecked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.paymentMethodAction(0);
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.furnChecked();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.furnChecked();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.docTypeAction(2);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.docTypeAction(3);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.docTypeAction(0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.docTypeAction(1);
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.poolChecked();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.liftChecked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.dealingTypeAction(0);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.home.viewModels.FilterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.dealingTypeAction(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.paymentMethod
        flag 2 (0x3L): viewmodel.docType
        flag 3 (0x4L): viewmodel.dealingType
        flag 4 (0x5L): viewmodel.pool
        flag 5 (0x6L): viewmodel.lift
        flag 6 (0x7L): viewmodel.garage
        flag 7 (0x8L): viewmodel.furniture
        flag 8 (0x9L): null
        flag 9 (0xaL): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 10 (0xbL): viewmodel.docType != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 11 (0xcL): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 12 (0xdL): viewmodel.garage == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 13 (0xeL): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 14 (0xfL): viewmodel.docType != 1 ? @android:color/colordark : @android:color/white
        flag 15 (0x10L): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 16 (0x11L): viewmodel.docType != 3 ? @android:color/colordark : @android:color/white
        flag 17 (0x12L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 18 (0x13L): viewmodel.docType != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 19 (0x14L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 20 (0x15L): viewmodel.dealingType == 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 21 (0x16L): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 22 (0x17L): viewmodel.paymentMethod != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 23 (0x18L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 24 (0x19L): viewmodel.docType != 3 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 25 (0x1aL): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 26 (0x1bL): viewmodel.docType != 0 ? @android:color/colordark : @android:color/white
        flag 27 (0x1cL): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 28 (0x1dL): viewmodel.paymentMethod != 1 ? @android:color/colordark : @android:color/white
        flag 29 (0x1eL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 30 (0x1fL): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 31 (0x20L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 32 (0x21L): viewmodel.paymentMethod != 2 ? @android:color/colordark : @android:color/white
        flag 33 (0x22L): viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 34 (0x23L): viewmodel.lift == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 35 (0x24L): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 36 (0x25L): viewmodel.dealingType == 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 37 (0x26L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 38 (0x27L): viewmodel.paymentMethod != 1 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 39 (0x28L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 40 (0x29L): viewmodel.paymentMethod != 0 ? @android:color/colordark : @android:color/white
        flag 41 (0x2aL): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 42 (0x2bL): viewmodel.dealingType == 0 ? @android:color/colordark : @android:color/white
        flag 43 (0x2cL): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 44 (0x2dL): viewmodel.docType != 2 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 45 (0x2eL): viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 46 (0x2fL): viewmodel.pool == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 47 (0x30L): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 48 (0x31L): viewmodel.furniture == 0 ? @android:drawable/ic_toggle_empty : @android:drawable/ic_toggle_fill
        flag 49 (0x32L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 50 (0x33L): viewmodel.paymentMethod != 0 ? @android:drawable/corner_view_light : @android:drawable/corner_view_primary_dark
        flag 51 (0x34L): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 52 (0x35L): viewmodel.dealingType == 1 ? @android:color/colordark : @android:color/white
        flag 53 (0x36L): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
        flag 54 (0x37L): viewmodel.docType != 2 ? @android:color/colordark : @android:color/white
    flag mapping end*/
    //end
}