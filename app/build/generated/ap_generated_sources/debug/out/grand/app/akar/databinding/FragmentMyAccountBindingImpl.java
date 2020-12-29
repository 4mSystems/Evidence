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
        sViewsWithIds.put(R.id.tv_account_title, 10);
        sViewsWithIds.put(R.id.img_login_logo, 11);
        sViewsWithIds.put(R.id.account_card_container, 12);
        sViewsWithIds.put(R.id.tv_account_support_contact, 13);
        sViewsWithIds.put(R.id.tv_account_rate, 14);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback110;
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    @Nullable
    private final android.view.View.OnClickListener mCallback111;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentMyAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.akar.customViews.views.CustomTextViewRegular) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAccountAbout.setTag(null);
        this.tvAccountContact.setTag(null);
        this.tvAccountFundAds.setTag(null);
        this.tvAccountLogout.setTag(null);
        this.tvAccountMyAds.setTag(null);
        this.tvAccountName.setTag(null);
        this.tvAccountShare.setTag(null);
        this.tvAccountTerms.setTag(null);
        this.tvAccountType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback106 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback110 = new grand.app.akar.generated.callback.OnClickListener(this, 6);
        mCallback108 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback107 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback105 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback111 = new grand.app.akar.generated.callback.OnClickListener(this, 7);
        mCallback109 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
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
        java.lang.String viewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = null;
        java.lang.String viewmodelUserDataName = null;
        grand.app.akar.pages.auth.models.UserData viewmodelUserData = null;
        boolean viewmodelUserDataTypeInt1 = false;
        java.lang.String viewmodelUserDataTypeInt0JavaLangStringTvAccountTypeAndroidStringSeekerJavaLangStringViewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString = null;
        grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userData
                    viewmodelUserData = viewmodel.userData;
                }


                if (viewmodelUserData != null) {
                    // read viewmodel.userData.type
                    viewmodelUserDataType = viewmodelUserData.getType();
                    // read viewmodel.userData.name
                    viewmodelUserDataName = viewmodelUserData.getName();
                }


                // read viewmodel.userData.type == 0
                viewmodelUserDataTypeInt0 = (viewmodelUserDataType) == (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelUserDataTypeInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                // read viewmodel.userData.type == 1
                viewmodelUserDataTypeInt1 = (viewmodelUserDataType) == (1);
            if((dirtyFlags & 0x10L) != 0) {
                if(viewmodelUserDataTypeInt1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
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

            this.tvAccountAbout.setOnClickListener(mCallback108);
            this.tvAccountContact.setOnClickListener(mCallback107);
            this.tvAccountFundAds.setOnClickListener(mCallback106);
            this.tvAccountLogout.setOnClickListener(mCallback111);
            this.tvAccountMyAds.setOnClickListener(mCallback105);
            this.tvAccountShare.setOnClickListener(mCallback110);
            this.tvAccountTerms.setOnClickListener(mCallback109);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountName, viewmodelUserDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountType, viewmodelUserDataTypeInt0JavaLangStringTvAccountTypeAndroidStringSeekerJavaLangStringViewmodelUserDataTypeInt1JavaLangStringTvAccountTypeAndroidStringOwnerJavaLangStringJavaLangStringTvAccountTypeAndroidStringRealtorJavaLangString);
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


                    viewmodel.toMyPremiumAds();
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


                    viewmodel.toReviews();
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


                    viewmodel.toAbout();
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


                    viewmodel.toSettings();
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


                    viewmodel.toMyAds();
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


                    viewmodel.toReviews();
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


                    viewmodel.toTerms();
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
        flag 2 (0x3L): viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 3 (0x4L): viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 4 (0x5L): viewmodel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
        flag 5 (0x6L): viewmodel.userData.type == 0 ? ((" ( ") + (@android:string/seeker)) + (" )") : viewmodel.userData.type == 1 ? ((" ( ") + (@android:string/owner)) + (" )") : ((" ( ") + (@android:string/realtor)) + (" )")
    flag mapping end*/
    //end
}