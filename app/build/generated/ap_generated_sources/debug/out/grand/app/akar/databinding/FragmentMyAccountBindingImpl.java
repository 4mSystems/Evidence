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
        sViewsWithIds.put(R.id.tv_account_title, 13);
        sViewsWithIds.put(R.id.account_card_container, 14);
        sViewsWithIds.put(R.id.tv_account_support_contact, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback176;
    @Nullable
    private final android.view.View.OnClickListener mCallback172;
    @Nullable
    private final android.view.View.OnClickListener mCallback169;
    @Nullable
    private final android.view.View.OnClickListener mCallback177;
    @Nullable
    private final android.view.View.OnClickListener mCallback173;
    @Nullable
    private final android.view.View.OnClickListener mCallback178;
    @Nullable
    private final android.view.View.OnClickListener mCallback174;
    @Nullable
    private final android.view.View.OnClickListener mCallback170;
    @Nullable
    private final android.view.View.OnClickListener mCallback175;
    @Nullable
    private final android.view.View.OnClickListener mCallback171;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentMyAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[3]
            );
        this.editIcon.setTag(null);
        this.imgLoginLogo.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAccountAbout.setTag(null);
        this.tvAccountContact.setTag(null);
        this.tvAccountFundAds.setTag(null);
        this.tvAccountLogout.setTag(null);
        this.tvAccountMyAds.setTag(null);
        this.tvAccountName.setTag(null);
        this.tvAccountRate.setTag(null);
        this.tvAccountShare.setTag(null);
        this.tvAccountTerms.setTag(null);
        this.tvAccountType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback176 = new grand.app.akar.generated.callback.OnClickListener(this, 8);
        mCallback172 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback169 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback177 = new grand.app.akar.generated.callback.OnClickListener(this, 9);
        mCallback173 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback178 = new grand.app.akar.generated.callback.OnClickListener(this, 10);
        mCallback174 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback170 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback175 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback171 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewmodelUserDataType = 0;
        boolean viewmodelUserDataTypeInt0 = false;
        boolean ViewmodelUserDataTypeInt01 = false;
        java.lang.String viewmodelUserDataImg = null;
        boolean viewmodelUserDataTypeInt1 = false;
        java.lang.String viewmodelUserDataTypeInt0JavaLangStringTvAccountTypeAndroidStringSeekerJavaLangStringViewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = null;
        int viewmodelUserDataTypeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = null;
        java.lang.String viewmodelUserDataName = null;
        grand.app.akar.pages.auth.models.UserData viewmodelUserData = null;
        grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userData
                    viewmodelUserData = viewmodel.userData;
                }


                if (viewmodelUserData != null) {
                    // read viewmodel.userData.type
                    viewmodelUserDataType = viewmodelUserData.getType();
                    // read viewmodel.userData.img
                    viewmodelUserDataImg = viewmodelUserData.getImg();
                    // read viewmodel.userData.name
                    viewmodelUserDataName = viewmodelUserData.getName();
                }


                // read viewmodel.userData.type == 0
                viewmodelUserDataTypeInt0 = (viewmodelUserDataType) == (0);
                // read viewmodel.userData.type != 0
                ViewmodelUserDataTypeInt01 = (viewmodelUserDataType) != (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelUserDataTypeInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(ViewmodelUserDataTypeInt01) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewmodel.userData.type != 0 ? View.VISIBLE : View.GONE
                viewmodelUserDataTypeInt0ViewVISIBLEViewGONE = ((ViewmodelUserDataTypeInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x4L) != 0) {

                // read viewmodel.userData.type == 1
                viewmodelUserDataTypeInt1 = (viewmodelUserDataType) == (1);
            if((dirtyFlags & 0x4L) != 0) {
                if(viewmodelUserDataTypeInt1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = ((viewmodelUserDataTypeInt1) ? (((" ( ") + (tvAccountType.getResources().getString(R.string.owner))) + (" )")) : (((" ( ") + (tvAccountType.getResources().getString(R.string.realtor))) + (" )")));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read viewmodel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
                viewmodelUserDataTypeInt0JavaLangStringTvAccountTypeAndroidStringSeekerJavaLangStringViewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = ((viewmodelUserDataTypeInt0) ? (((" ( ") + (tvAccountType.getResources().getString(R.string.seeker))) + (" )")) : (viewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.editIcon.setOnClickListener(mCallback170);
            this.imgLoginLogo.setOnClickListener(mCallback169);
            this.tvAccountAbout.setOnClickListener(mCallback174);
            this.tvAccountContact.setOnClickListener(mCallback173);
            this.tvAccountFundAds.setOnClickListener(mCallback172);
            this.tvAccountLogout.setOnClickListener(mCallback178);
            this.tvAccountMyAds.setOnClickListener(mCallback171);
            this.tvAccountRate.setOnClickListener(mCallback176);
            this.tvAccountShare.setOnClickListener(mCallback177);
            this.tvAccountTerms.setOnClickListener(mCallback175);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.imgLoginLogo, viewmodelUserDataImg);
            this.tvAccountFundAds.setVisibility(viewmodelUserDataTypeInt0ViewVISIBLEViewGONE);
            this.tvAccountMyAds.setVisibility(viewmodelUserDataTypeInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountName, viewmodelUserDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountType, viewmodelUserDataTypeInt0JavaLangStringTvAccountTypeAndroidStringSeekerJavaLangStringViewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.rateApp();
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


                    viewmodel.toMyPremiumAds();
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


                    viewmodel.toProfile();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toShare();
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


                    viewmodel.toSettings();
                }
                break;
            }
            case 10: {
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
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toAbout();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toProfile();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toTerms();
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


                    viewmodel.toMyAds();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewmodel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 3 (0x4L): viewmodel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 4 (0x5L): viewmodel.userData.type != 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.userData.type != 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 7 (0x8L): viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
    flag mapping end*/
    //end
}