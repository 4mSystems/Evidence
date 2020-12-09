package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyAccountBindingImpl extends FragmentMyAccountBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_account_verified, 15);
        sViewsWithIds.put(R.id.br4, 16);
        sViewsWithIds.put(R.id.br_account_settings, 17);
        sViewsWithIds.put(R.id.view_gift, 18);
        sViewsWithIds.put(R.id.br_account_points, 19);
        sViewsWithIds.put(R.id.view_profile, 20);
        sViewsWithIds.put(R.id.br_account_orders, 21);
        sViewsWithIds.put(R.id.view_orders, 22);
        sViewsWithIds.put(R.id.tv_account_balance_text, 23);
        sViewsWithIds.put(R.id.br_account_balance, 24);
        sViewsWithIds.put(R.id.view_about, 25);
        sViewsWithIds.put(R.id.tv_delivery_vat_total_text, 26);
        sViewsWithIds.put(R.id.br_tv_delivery_vat_total, 27);
        sViewsWithIds.put(R.id.view_terms, 28);
        sViewsWithIds.put(R.id.tv_account_billing_total_text, 29);
        sViewsWithIds.put(R.id.br_account_support, 30);
        sViewsWithIds.put(R.id.view_support, 31);
        sViewsWithIds.put(R.id.tv_account_order_num_text, 32);
        sViewsWithIds.put(R.id.br_tv_account_order_num, 33);
        sViewsWithIds.put(R.id.view_rate, 34);
        sViewsWithIds.put(R.id.br_account_share, 35);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentMyAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.constraintlayout.widget.Barrier) bindings[16]
            , (androidx.constraintlayout.widget.Barrier) bindings[24]
            , (androidx.constraintlayout.widget.Barrier) bindings[21]
            , (androidx.constraintlayout.widget.Barrier) bindings[19]
            , (androidx.constraintlayout.widget.Barrier) bindings[17]
            , (androidx.constraintlayout.widget.Barrier) bindings[35]
            , (androidx.constraintlayout.widget.Barrier) bindings[30]
            , (androidx.constraintlayout.widget.Barrier) bindings[33]
            , (androidx.constraintlayout.widget.Barrier) bindings[27]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[23]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[29]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[32]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[26]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[28]
            );
        this.appCompatButtonNext.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rating.setTag(null);
        this.tvAccountBalance.setTag(null);
        this.tvAccountBillingTotalVal.setTag(null);
        this.tvAccountMyOrders.setTag(null);
        this.tvAccountNumCommentsText.setTag(null);
        this.tvAccountNumCommentsVal.setTag(null);
        this.tvAccountOrderNumVal.setTag(null);
        this.tvAccountPoints.setTag(null);
        this.tvAccountSettings.setTag(null);
        this.tvAccountUserId.setTag(null);
        this.tvAccountUsername.setTag(null);
        this.tvDeliveryVatTotalVal.setTag(null);
        this.userImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback9 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback5 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback8 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback10 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback7 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.profileData) {
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
        java.lang.String viewmodelProfileDataDeliveryFees = null;
        grand.app.akar.pages.auth.models.UserData viewmodelProfileDataUserData = null;
        java.lang.String viewmodelProfileDataDeliveryFeesConcatJavaLangStringConcatViewmodelCountryCurrency = null;
        java.lang.String viewmodelCountryCurrency = null;
        java.lang.String stringValueOfViewmodelProfileDataRatesCountConcatTvAccountNumCommentsValAndroidStringComment = null;
        java.lang.String viewmodelUserDataRate = null;
        java.lang.String viewmodelUserDataUserCode = null;
        java.lang.String javaLangStringConcatViewmodelUserDataUserCode = null;
        java.lang.String stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangString = null;
        java.lang.String viewmodelUserDataImage = null;
        java.lang.String stringValueOfViewmodelProfileDataUserDataWallet = null;
        java.lang.String viewmodelProfileDataDeliveryFeesConcatJavaLangString = null;
        java.lang.String stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangString = null;
        java.lang.String stringValueOfViewmodelProfileDataRatesCount = null;
        double viewmodelProfileDataUserDataWallet = 0.0;
        java.lang.String viewmodelProfileDataCashPaidConcatJavaLangString = null;
        int viewmodelProfileDataRatesCount = 0;
        java.lang.String stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangStringConcatViewmodelCountryCurrency = null;
        java.lang.String viewmodelProfileDataCashPaid = null;
        int viewmodelProfileDataOrdersCount = 0;
        java.lang.String viewmodelUserDataName = null;
        grand.app.akar.pages.auth.models.UserData viewmodelUserData = null;
        grand.app.akar.pages.myAccount.models.ProfileData viewmodelProfileData = null;
        java.lang.String viewmodelProfileDataCashPaidConcatJavaLangStringConcatViewmodelCountryCurrency = null;
        java.lang.String stringValueOfViewmodelProfileDataOrdersCount = null;
        java.lang.String stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangStringConcatTvAccountOrderNumValAndroidStringOrder = null;
        grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.countryCurrency
                    viewmodelCountryCurrency = viewmodel.getCountryCurrency();
                    // read viewmodel.profileData
                    viewmodelProfileData = viewmodel.getProfileData();
                }


                if (viewmodelProfileData != null) {
                    // read viewmodel.profileData.deliveryFees
                    viewmodelProfileDataDeliveryFees = viewmodelProfileData.getDeliveryFees();
                    // read viewmodel.profileData.userData
                    viewmodelProfileDataUserData = viewmodelProfileData.getUserData();
                    // read viewmodel.profileData.ratesCount
                    viewmodelProfileDataRatesCount = viewmodelProfileData.getRatesCount();
                    // read viewmodel.profileData.cashPaid
                    viewmodelProfileDataCashPaid = viewmodelProfileData.getCashPaid();
                    // read viewmodel.profileData.ordersCount
                    viewmodelProfileDataOrdersCount = viewmodelProfileData.getOrdersCount();
                }


                if (viewmodelProfileDataDeliveryFees != null) {
                    // read viewmodel.profileData.deliveryFees.concat(" ")
                    viewmodelProfileDataDeliveryFeesConcatJavaLangString = viewmodelProfileDataDeliveryFees.concat(" ");
                }
                if (viewmodelProfileDataUserData != null) {
                    // read viewmodel.profileData.userData.wallet
                    viewmodelProfileDataUserDataWallet = viewmodelProfileDataUserData.getWallet();
                }
                // read String.valueOf(viewmodel.profileData.ratesCount)
                stringValueOfViewmodelProfileDataRatesCount = java.lang.String.valueOf(viewmodelProfileDataRatesCount);
                // read String.valueOf(viewmodel.profileData.ordersCount)
                stringValueOfViewmodelProfileDataOrdersCount = java.lang.String.valueOf(viewmodelProfileDataOrdersCount);
                if (viewmodelProfileDataCashPaid != null) {
                    // read viewmodel.profileData.cashPaid.concat(" ")
                    viewmodelProfileDataCashPaidConcatJavaLangString = viewmodelProfileDataCashPaid.concat(" ");
                }


                if (viewmodelProfileDataDeliveryFeesConcatJavaLangString != null) {
                    // read viewmodel.profileData.deliveryFees.concat(" ").concat(viewmodel.countryCurrency)
                    viewmodelProfileDataDeliveryFeesConcatJavaLangStringConcatViewmodelCountryCurrency = viewmodelProfileDataDeliveryFeesConcatJavaLangString.concat(viewmodelCountryCurrency);
                }
                // read String.valueOf(viewmodel.profileData.userData.wallet)
                stringValueOfViewmodelProfileDataUserDataWallet = java.lang.String.valueOf(viewmodelProfileDataUserDataWallet);
                if (stringValueOfViewmodelProfileDataRatesCount != null) {
                    // read String.valueOf(viewmodel.profileData.ratesCount).concat(@android:string/comment)
                    stringValueOfViewmodelProfileDataRatesCountConcatTvAccountNumCommentsValAndroidStringComment = stringValueOfViewmodelProfileDataRatesCount.concat(tvAccountNumCommentsVal.getResources().getString(R.string.comment));
                }
                if (stringValueOfViewmodelProfileDataOrdersCount != null) {
                    // read String.valueOf(viewmodel.profileData.ordersCount).concat(" ")
                    stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangString = stringValueOfViewmodelProfileDataOrdersCount.concat(" ");
                }
                if (viewmodelProfileDataCashPaidConcatJavaLangString != null) {
                    // read viewmodel.profileData.cashPaid.concat(" ").concat(viewmodel.countryCurrency)
                    viewmodelProfileDataCashPaidConcatJavaLangStringConcatViewmodelCountryCurrency = viewmodelProfileDataCashPaidConcatJavaLangString.concat(viewmodelCountryCurrency);
                }


                if (stringValueOfViewmodelProfileDataUserDataWallet != null) {
                    // read String.valueOf(viewmodel.profileData.userData.wallet).concat(" ")
                    stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangString = stringValueOfViewmodelProfileDataUserDataWallet.concat(" ");
                }
                if (stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangString != null) {
                    // read String.valueOf(viewmodel.profileData.ordersCount).concat(" ").concat(@android:string/order)
                    stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangStringConcatTvAccountOrderNumValAndroidStringOrder = stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangString.concat(tvAccountOrderNumVal.getResources().getString(R.string.order));
                }


                if (stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangString != null) {
                    // read String.valueOf(viewmodel.profileData.userData.wallet).concat(" ").concat(viewmodel.countryCurrency)
                    stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangStringConcatViewmodelCountryCurrency = stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangString.concat(viewmodelCountryCurrency);
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.rate
                        viewmodelUserDataRate = viewmodelUserData.getRate();
                        // read viewmodel.userData.userCode
                        viewmodelUserDataUserCode = viewmodelUserData.getUserCode();
                        // read viewmodel.userData.image
                        viewmodelUserDataImage = viewmodelUserData.getImage();
                        // read viewmodel.userData.name
                        viewmodelUserDataName = viewmodelUserData.getName();
                    }


                    // read "#".concat(viewmodel.userData.userCode)
                    javaLangStringConcatViewmodelUserDataUserCode = "#".concat(viewmodelUserDataUserCode);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback10);
            this.tvAccountMyOrders.setOnClickListener(mCallback7);
            this.tvAccountNumCommentsText.setOnClickListener(mCallback8);
            this.tvAccountNumCommentsVal.setOnClickListener(mCallback9);
            this.tvAccountPoints.setOnClickListener(mCallback6);
            this.tvAccountSettings.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.setRate(this.rating, viewmodelUserDataRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountUserId, javaLangStringConcatViewmodelUserDataUserCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountUsername, viewmodelUserDataName);
            grand.app.akar.base.ApplicationBinding.loadImage(this.userImg, viewmodelUserDataImage);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountBalance, stringValueOfViewmodelProfileDataUserDataWalletConcatJavaLangStringConcatViewmodelCountryCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountBillingTotalVal, viewmodelProfileDataCashPaidConcatJavaLangStringConcatViewmodelCountryCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountNumCommentsVal, stringValueOfViewmodelProfileDataRatesCountConcatTvAccountNumCommentsValAndroidStringComment);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountOrderNumVal, stringValueOfViewmodelProfileDataOrdersCountConcatJavaLangStringConcatTvAccountOrderNumValAndroidStringOrder);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeliveryVatTotalVal, viewmodelProfileDataDeliveryFeesConcatJavaLangStringConcatViewmodelCountryCurrency);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toMyPoints();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toReviews();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toSettings();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toReviews();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toLogout();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toMyOrders();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.profileData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}