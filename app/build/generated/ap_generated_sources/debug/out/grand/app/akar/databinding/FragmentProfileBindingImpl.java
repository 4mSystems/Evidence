package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_account_title, 11);
        sViewsWithIds.put(R.id.account_card_container, 12);
        sViewsWithIds.put(R.id.tv_register_name, 13);
        sViewsWithIds.put(R.id.tv_register_email, 14);
        sViewsWithIds.put(R.id.tv_register_phone, 15);
        sViewsWithIds.put(R.id.tv_register_password, 16);
        sViewsWithIds.put(R.id.tv_type, 17);
        sViewsWithIds.put(R.id.br11, 18);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView10;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback164;
    @Nullable
    private final android.view.View.OnClickListener mCallback165;
    @Nullable
    private final android.view.View.OnClickListener mCallback166;
    @Nullable
    private final android.view.View.OnClickListener mCallback167;
    @Nullable
    private final android.view.View.OnClickListener mCallback163;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputEmailtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputEmail);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputNametextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputName);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputNewPasswordtextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.password
            //         is viewmodel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputNewPassword);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.password
            java.lang.String viewmodelRequestPassword = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputPhonetextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(inputPhone);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[18]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[5]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[2]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[1]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[4]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.akar.customViews.views.CustomTextViewMedium) bindings[17]
            );
        this.appCompatButtonNext.setTag(null);
        this.btOwner.setTag(null);
        this.btRealtor.setTag(null);
        this.btnSeeker.setTag(null);
        this.imgLoginLogo.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputNewPassword.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatImageView) bindings[10];
        this.mboundView10.setTag(null);
        setRootTag(root);
        // listeners
        mCallback164 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
        mCallback165 = new grand.app.akar.generated.callback.OnClickListener(this, 3);
        mCallback166 = new grand.app.akar.generated.callback.OnClickListener(this, 4);
        mCallback167 = new grand.app.akar.generated.callback.OnClickListener(this, 5);
        mCallback163 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((grand.app.akar.pages.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.profile.ProfileViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.profile.ProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.profile.ProfileViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.type) {
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
        grand.app.akar.pages.auth.models.RegisterRequest viewmodelRequest = null;
        android.graphics.drawable.Drawable viewmodelTypeInt1BtOwnerAndroidDrawableCornerViewPrimaryDarkBtOwnerAndroidDrawableCornerViewLight = null;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        android.graphics.drawable.Drawable viewmodelTypeInt0BtnSeekerAndroidDrawableCornerViewPrimaryDarkBtnSeekerAndroidDrawableCornerViewLight = null;
        boolean viewmodelTypeInt0 = false;
        java.lang.String viewmodelUserDataImg = null;
        android.graphics.drawable.Drawable viewmodelTypeInt2BtRealtorAndroidDrawableCornerViewPrimaryDarkBtRealtorAndroidDrawableCornerViewLight = null;
        int viewmodelType = 0;
        boolean viewmodelTypeInt1 = false;
        java.lang.String viewmodelRequestPassword = null;
        java.lang.String viewmodelRequestPhone = null;
        int viewmodelTypeInt1BtOwnerAndroidColorWhiteBtOwnerAndroidColorColordark = 0;
        int viewmodelTypeInt2BtRealtorAndroidColorWhiteBtRealtorAndroidColorColordark = 0;
        grand.app.akar.pages.auth.models.UserData viewmodelUserData = null;
        boolean viewmodelTypeInt2 = false;
        int viewmodelTypeInt0BtnSeekerAndroidColorWhiteBtnSeekerAndroidColorColordark = 0;
        grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelRequest != null) {
                        // read viewmodel.request.name
                        viewmodelRequestName = viewmodelRequest.getName();
                        // read viewmodel.request.email
                        viewmodelRequestEmail = viewmodelRequest.getEmail();
                        // read viewmodel.request.password
                        viewmodelRequestPassword = viewmodelRequest.getPassword();
                        // read viewmodel.request.phone
                        viewmodelRequestPhone = viewmodelRequest.getPhone();
                    }
                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.img
                        viewmodelUserDataImg = viewmodelUserData.getImg();
                    }
            }

                if (viewmodel != null) {
                    // read viewmodel.type
                    viewmodelType = viewmodel.getType();
                }


                // read viewmodel.type == 0
                viewmodelTypeInt0 = (viewmodelType) == (0);
                // read viewmodel.type == 1
                viewmodelTypeInt1 = (viewmodelType) == (1);
                // read viewmodel.type == 2
                viewmodelTypeInt2 = (viewmodelType) == (2);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelTypeInt0) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelTypeInt1) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelTypeInt2) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }


                // read viewmodel.type == 0 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
                viewmodelTypeInt0BtnSeekerAndroidDrawableCornerViewPrimaryDarkBtnSeekerAndroidDrawableCornerViewLight = ((viewmodelTypeInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSeeker.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSeeker.getContext(), R.drawable.corner_view_light)));
                // read viewmodel.type == 0 ? @android:color/white : @android:color/colordark
                viewmodelTypeInt0BtnSeekerAndroidColorWhiteBtnSeekerAndroidColorColordark = ((viewmodelTypeInt0) ? (getColorFromResource(btnSeeker, R.color.white)) : (getColorFromResource(btnSeeker, R.color.colordark)));
                // read viewmodel.type == 1 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
                viewmodelTypeInt1BtOwnerAndroidDrawableCornerViewPrimaryDarkBtOwnerAndroidDrawableCornerViewLight = ((viewmodelTypeInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btOwner.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btOwner.getContext(), R.drawable.corner_view_light)));
                // read viewmodel.type == 1 ? @android:color/white : @android:color/colordark
                viewmodelTypeInt1BtOwnerAndroidColorWhiteBtOwnerAndroidColorColordark = ((viewmodelTypeInt1) ? (getColorFromResource(btOwner, R.color.white)) : (getColorFromResource(btOwner, R.color.colordark)));
                // read viewmodel.type == 2 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
                viewmodelTypeInt2BtRealtorAndroidDrawableCornerViewPrimaryDarkBtRealtorAndroidDrawableCornerViewLight = ((viewmodelTypeInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btRealtor.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btRealtor.getContext(), R.drawable.corner_view_light)));
                // read viewmodel.type == 2 ? @android:color/white : @android:color/colordark
                viewmodelTypeInt2BtRealtorAndroidColorWhiteBtRealtorAndroidColorColordark = ((viewmodelTypeInt2) ? (getColorFromResource(btRealtor, R.color.white)) : (getColorFromResource(btRealtor, R.color.colordark)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback166);
            this.btOwner.setOnClickListener(mCallback164);
            this.btRealtor.setOnClickListener(mCallback165);
            this.btnSeeker.setOnClickListener(mCallback163);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputEmail, inputEmailtextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputName, inputNametextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputNewPassword, inputNewPasswordtextAttrChanged);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.inputPhone, inputPhonetextAttrChanged);
            this.mboundView10.setOnClickListener(mCallback167);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btOwner, viewmodelTypeInt1BtOwnerAndroidDrawableCornerViewPrimaryDarkBtOwnerAndroidDrawableCornerViewLight);
            this.btOwner.setTextColor(viewmodelTypeInt1BtOwnerAndroidColorWhiteBtOwnerAndroidColorColordark);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btRealtor, viewmodelTypeInt2BtRealtorAndroidDrawableCornerViewPrimaryDarkBtRealtorAndroidDrawableCornerViewLight);
            this.btRealtor.setTextColor(viewmodelTypeInt2BtRealtorAndroidColorWhiteBtRealtorAndroidColorColordark);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSeeker, viewmodelTypeInt0BtnSeekerAndroidDrawableCornerViewPrimaryDarkBtnSeekerAndroidDrawableCornerViewLight);
            this.btnSeeker.setTextColor(viewmodelTypeInt0BtnSeekerAndroidColorWhiteBtnSeekerAndroidColorColordark);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.loadImage(this.imgLoginLogo, viewmodelUserDataImg);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputEmail, viewmodelRequestEmail);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputName, viewmodelRequestName);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputNewPassword, viewmodelRequestPassword);
            grand.app.akar.customViews.views.CustomEditText.getText(this.inputPhone, viewmodelRequestPhone);
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
                grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeUserType(1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeUserType(2);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.updateProfile();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.imageSubmit();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.profile.ProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeUserType(0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.type
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.type == 1 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 4 (0x5L): viewmodel.type == 1 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 5 (0x6L): viewmodel.type == 0 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 6 (0x7L): viewmodel.type == 0 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 7 (0x8L): viewmodel.type == 2 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 8 (0x9L): viewmodel.type == 2 ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_light
        flag 9 (0xaL): viewmodel.type == 1 ? @android:color/white : @android:color/colordark
        flag 10 (0xbL): viewmodel.type == 1 ? @android:color/white : @android:color/colordark
        flag 11 (0xcL): viewmodel.type == 2 ? @android:color/white : @android:color/colordark
        flag 12 (0xdL): viewmodel.type == 2 ? @android:color/white : @android:color/colordark
        flag 13 (0xeL): viewmodel.type == 0 ? @android:color/white : @android:color/colordark
        flag 14 (0xfL): viewmodel.type == 0 ? @android:color/white : @android:color/colordark
    flag mapping end*/
    //end
}