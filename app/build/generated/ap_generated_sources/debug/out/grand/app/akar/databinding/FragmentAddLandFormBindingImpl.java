package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddLandFormBindingImpl extends FragmentAddLandFormBinding  {

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
        sViewsWithIds.put(R.id.v12, 14);
        sViewsWithIds.put(R.id.tv_payment_type, 15);
        sViewsWithIds.put(R.id.btn_cash, 16);
        sViewsWithIds.put(R.id.bt_sac, 17);
        sViewsWithIds.put(R.id.bt_transform, 18);
        sViewsWithIds.put(R.id.v13, 19);
        sViewsWithIds.put(R.id.tv_doc_type, 20);
        sViewsWithIds.put(R.id.btn_real_estate_certificate, 21);
        sViewsWithIds.put(R.id.bt_customize, 22);
        sViewsWithIds.put(R.id.bt_holy_king, 23);
        sViewsWithIds.put(R.id.bt_title_deed, 24);
        sViewsWithIds.put(R.id.br3, 25);
        sViewsWithIds.put(R.id.optional_layout, 26);
        sViewsWithIds.put(R.id.expansionLayoutHeader, 27);
        sViewsWithIds.put(R.id.headerIndicator, 28);
        sViewsWithIds.put(R.id.header_menu_name, 29);
        sViewsWithIds.put(R.id.expansionLayout, 30);
        sViewsWithIds.put(R.id.tv_street_size, 31);
        sViewsWithIds.put(R.id.input_street_size, 32);
        sViewsWithIds.put(R.id.v14, 33);
        sViewsWithIds.put(R.id.tv_front_count, 34);
        sViewsWithIds.put(R.id.incrementalViewFrontCount, 35);
        sViewsWithIds.put(R.id.v15, 36);
        sViewsWithIds.put(R.id.tv_furniture, 37);
        sViewsWithIds.put(R.id.furniture_toggle, 38);
        sViewsWithIds.put(R.id.v16, 39);
        sViewsWithIds.put(R.id.tv_services, 40);
        sViewsWithIds.put(R.id.mosque, 41);
        sViewsWithIds.put(R.id.school, 42);
        sViewsWithIds.put(R.id.hospital, 43);
        sViewsWithIds.put(R.id.police_station, 44);
        sViewsWithIds.put(R.id.v17, 45);
        sViewsWithIds.put(R.id.tv_building_desc, 46);
        sViewsWithIds.put(R.id.input_desc, 47);
        sViewsWithIds.put(R.id.confirmBtn, 48);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddLandFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 49, sIncludes, sViewsWithIds));
    }
    private FragmentAddLandFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[25]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[22]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[23]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[24]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[21]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[48]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[30]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[27]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[29]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[43]
            , (grand.app.akar.customViews.views.IncrementalView) bindings[35]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[10]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[47]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[13]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[7]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[32]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[41]
            , (android.widget.LinearLayout) bindings[26]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[44]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[42]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[46]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[20]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[34]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[37]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[40]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[31]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[36]
            , (android.view.View) bindings[39]
            , (android.view.View) bindings[45]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
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