package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddVillaHouseFormBindingImpl extends FragmentAddVillaHouseFormBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v1, 1);
        sViewsWithIds.put(R.id.tv_deal_type, 2);
        sViewsWithIds.put(R.id.btn_sell, 3);
        sViewsWithIds.put(R.id.bt_mnahda, 4);
        sViewsWithIds.put(R.id.v2, 5);
        sViewsWithIds.put(R.id.tv_price, 6);
        sViewsWithIds.put(R.id.input_price, 7);
        sViewsWithIds.put(R.id.v3, 8);
        sViewsWithIds.put(R.id.tv_address, 9);
        sViewsWithIds.put(R.id.input_address, 10);
        sViewsWithIds.put(R.id.v4, 11);
        sViewsWithIds.put(R.id.tv_land_size, 12);
        sViewsWithIds.put(R.id.input_land_size, 13);
        sViewsWithIds.put(R.id.v5, 14);
        sViewsWithIds.put(R.id.tv_building_size, 15);
        sViewsWithIds.put(R.id.input_building_size, 16);
        sViewsWithIds.put(R.id.v6, 17);
        sViewsWithIds.put(R.id.tv_floor_size, 18);
        sViewsWithIds.put(R.id.input_floor_size, 19);
        sViewsWithIds.put(R.id.v7, 20);
        sViewsWithIds.put(R.id.tv_floor_count, 21);
        sViewsWithIds.put(R.id.incrementalViewFloorNumber, 22);
        sViewsWithIds.put(R.id.v8, 23);
        sViewsWithIds.put(R.id.tv_rooms_count, 24);
        sViewsWithIds.put(R.id.incrementalViewRoomsNumber, 25);
        sViewsWithIds.put(R.id.v9, 26);
        sViewsWithIds.put(R.id.tv_paths_count, 27);
        sViewsWithIds.put(R.id.incrementalViewPathsNumber, 28);
        sViewsWithIds.put(R.id.v10, 29);
        sViewsWithIds.put(R.id.tv_kitchen_count, 30);
        sViewsWithIds.put(R.id.incrementalViewKitchenNumber, 31);
        sViewsWithIds.put(R.id.v11, 32);
        sViewsWithIds.put(R.id.tv_building_year, 33);
        sViewsWithIds.put(R.id.buildingYear, 34);
        sViewsWithIds.put(R.id.v12, 35);
        sViewsWithIds.put(R.id.tv_payment_type, 36);
        sViewsWithIds.put(R.id.btn_cash, 37);
        sViewsWithIds.put(R.id.bt_sac, 38);
        sViewsWithIds.put(R.id.bt_transform, 39);
        sViewsWithIds.put(R.id.v13, 40);
        sViewsWithIds.put(R.id.tv_doc_type, 41);
        sViewsWithIds.put(R.id.btn_real_estate_certificate, 42);
        sViewsWithIds.put(R.id.bt_customize, 43);
        sViewsWithIds.put(R.id.bt_holy_king, 44);
        sViewsWithIds.put(R.id.bt_title_deed, 45);
        sViewsWithIds.put(R.id.br3, 46);
        sViewsWithIds.put(R.id.optional_layout, 47);
        sViewsWithIds.put(R.id.expansionLayoutHeader, 48);
        sViewsWithIds.put(R.id.headerIndicator, 49);
        sViewsWithIds.put(R.id.header_menu_name, 50);
        sViewsWithIds.put(R.id.expansionLayout, 51);
        sViewsWithIds.put(R.id.tv_street_size, 52);
        sViewsWithIds.put(R.id.input_street_size, 53);
        sViewsWithIds.put(R.id.v14, 54);
        sViewsWithIds.put(R.id.tv_front_count, 55);
        sViewsWithIds.put(R.id.incrementalViewFrontCount, 56);
        sViewsWithIds.put(R.id.v15, 57);
        sViewsWithIds.put(R.id.tv_pool, 58);
        sViewsWithIds.put(R.id.pool_toggle, 59);
        sViewsWithIds.put(R.id.tv_elevator, 60);
        sViewsWithIds.put(R.id.elevator_toggle, 61);
        sViewsWithIds.put(R.id.tv_garage, 62);
        sViewsWithIds.put(R.id.garage_toggle, 63);
        sViewsWithIds.put(R.id.tv_furniture, 64);
        sViewsWithIds.put(R.id.furniture_toggle, 65);
        sViewsWithIds.put(R.id.v16, 66);
        sViewsWithIds.put(R.id.tv_services, 67);
        sViewsWithIds.put(R.id.mosque, 68);
        sViewsWithIds.put(R.id.school, 69);
        sViewsWithIds.put(R.id.hospital, 70);
        sViewsWithIds.put(R.id.police_station, 71);
        sViewsWithIds.put(R.id.v17, 72);
        sViewsWithIds.put(R.id.tv_building_desc, 73);
        sViewsWithIds.put(R.id.input_desc, 74);
        sViewsWithIds.put(R.id.confirmBtn, 75);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddVillaHouseFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 76, sIncludes, sViewsWithIds));
    }
    private FragmentAddVillaHouseFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[46]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[43]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[44]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[38]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[45]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[39]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[37]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[42]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[34]
            , (androidx.appcompat.widget.AppCompatButton) bindings[75]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[61]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[51]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[48]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[65]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[63]
            , (android.widget.ImageView) bindings[49]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[50]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[70]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[22]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[56]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[31]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[28]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[25]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[10]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[16]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[74]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[19]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[13]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[7]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[53]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[68]
            , (android.widget.LinearLayout) bindings[47]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[71]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[59]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[69]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[73]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[33]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[41]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[60]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[21]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[55]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[64]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[62]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[30]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[27]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[36]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[58]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[24]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[67]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[52]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[32]
            , (android.view.View) bindings[35]
            , (android.view.View) bindings[40]
            , (android.view.View) bindings[54]
            , (android.view.View) bindings[57]
            , (android.view.View) bindings[66]
            , (android.view.View) bindings[72]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[26]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}