package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditCaseBindingImpl extends FragmentEditCaseBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.circle_num
            //         is viewmodel.addCaseRequest.setCircle_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.circle_num
            java.lang.String viewmodelAddCaseRequestCircleNum = null;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setCircle_num(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.invetation_num
            //         is viewmodel.addCaseRequest.setInvetation_num((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.addCaseRequest.invetation_num
            java.lang.String viewmodelAddCaseRequestInvetationNum = null;
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setInvetation_num(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.court
            //         is viewmodel.addCaseRequest.setCourt((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.court
            java.lang.String viewmodelAddCaseRequestCourt = null;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setCourt(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCaseRequest.inventation_type
            //         is viewmodel.addCaseRequest.setInventation_type((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel.addCaseRequest
            te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCaseRequest.inventation_type
            java.lang.String viewmodelAddCaseRequestInventationType = null;
            // viewmodel.addCaseRequest != null
            boolean viewmodelAddCaseRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();

                viewmodelAddCaseRequestJavaLangObjectNull = (viewmodelAddCaseRequest) != (null);
                if (viewmodelAddCaseRequestJavaLangObjectNull) {




                    viewmodelAddCaseRequest.setInventation_type(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentEditCaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentEditCaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[12]
            );
        this.btnSave.setTag(null);
        this.inputCase.setTag(null);
        this.inputCat.setTag(null);
        this.inputCircle.setTag(null);
        this.inputCourt.setTag(null);
        this.inputInviteType.setTag(null);
        this.inputWhom.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback28 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel) {
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
                return onChangeViewmodelAddCaseRequestInvetationNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddCaseRequestCourtError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddCaseRequestCircleNumError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelAddCaseRequestInvetationTypeError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelAddCaseRequestCatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodel((te.app.evidence.pages.cases.viewModels.AddCaseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCourtError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCourtError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCircleNumError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCircleNumError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestInvetationTypeError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestInvetationTypeError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddCaseRequestCatError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCaseRequestCatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.cases.viewModels.AddCaseViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
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
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean textUtilsIsEmptyViewmodelMessage = false;
        java.lang.String viewmodelAddCaseRequestCourt = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAddCaseRequestInvetationNum = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationNumError = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelAddCaseRequestInventationType = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelAddCaseRequestInvetationTypeErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCourtError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCircleNumError = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableRoundedViewPrimaryDarkBtnSaveAndroidDrawableRoundedViewMedium = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        te.app.evidence.pages.cases.models.AddCaseRequest viewmodelAddCaseRequest = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        java.lang.String viewmodelAddCaseRequestCircleNumErrorGet = null;
        java.lang.String viewmodelAddCaseRequestInvetationNumErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestInvetationTypeError = null;
        java.lang.String viewmodelAddCaseRequestCatErrorGet = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCaseRequestCatError = null;
        java.lang.String viewmodelAddCaseRequestCourtErrorGet = null;
        java.lang.String viewmodelAddCaseRequestCircleNum = null;
        te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xe0L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xe0L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
            if ((dirtyFlags & 0xbfL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCaseRequest
                        viewmodelAddCaseRequest = viewmodel.getAddCaseRequest();
                    }

                if ((dirtyFlags & 0xa0L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.court
                            viewmodelAddCaseRequestCourt = viewmodelAddCaseRequest.getCourt();
                            // read viewmodel.addCaseRequest.invetation_num
                            viewmodelAddCaseRequestInvetationNum = viewmodelAddCaseRequest.getInvetation_num();
                            // read viewmodel.addCaseRequest.inventation_type
                            viewmodelAddCaseRequestInventationType = viewmodelAddCaseRequest.getInventation_type();
                            // read viewmodel.addCaseRequest.circle_num
                            viewmodelAddCaseRequestCircleNum = viewmodelAddCaseRequest.getCircle_num();
                        }
                }
                if ((dirtyFlags & 0xa1L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationNumError
                            viewmodelAddCaseRequestInvetationNumError = viewmodelAddCaseRequest.invetationNumError;
                        }
                        updateRegistration(0, viewmodelAddCaseRequestInvetationNumError);


                        if (viewmodelAddCaseRequestInvetationNumError != null) {
                            // read viewmodel.addCaseRequest.invetationNumError.get()
                            viewmodelAddCaseRequestInvetationNumErrorGet = viewmodelAddCaseRequestInvetationNumError.get();
                        }
                }
                if ((dirtyFlags & 0xa2L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.courtError
                            viewmodelAddCaseRequestCourtError = viewmodelAddCaseRequest.courtError;
                        }
                        updateRegistration(1, viewmodelAddCaseRequestCourtError);


                        if (viewmodelAddCaseRequestCourtError != null) {
                            // read viewmodel.addCaseRequest.courtError.get()
                            viewmodelAddCaseRequestCourtErrorGet = viewmodelAddCaseRequestCourtError.get();
                        }
                }
                if ((dirtyFlags & 0xa4L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.circleNumError
                            viewmodelAddCaseRequestCircleNumError = viewmodelAddCaseRequest.circleNumError;
                        }
                        updateRegistration(2, viewmodelAddCaseRequestCircleNumError);


                        if (viewmodelAddCaseRequestCircleNumError != null) {
                            // read viewmodel.addCaseRequest.circleNumError.get()
                            viewmodelAddCaseRequestCircleNumErrorGet = viewmodelAddCaseRequestCircleNumError.get();
                        }
                }
                if ((dirtyFlags & 0xa8L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError
                            viewmodelAddCaseRequestInvetationTypeError = viewmodelAddCaseRequest.invetationTypeError;
                        }
                        updateRegistration(3, viewmodelAddCaseRequestInvetationTypeError);


                        if (viewmodelAddCaseRequestInvetationTypeError != null) {
                            // read viewmodel.addCaseRequest.invetationTypeError.get()
                            viewmodelAddCaseRequestInvetationTypeErrorGet = viewmodelAddCaseRequestInvetationTypeError.get();
                        }
                }
                if ((dirtyFlags & 0xb0L) != 0) {

                        if (viewmodelAddCaseRequest != null) {
                            // read viewmodel.addCaseRequest.catError
                            viewmodelAddCaseRequestCatError = viewmodelAddCaseRequest.catError;
                        }
                        updateRegistration(4, viewmodelAddCaseRequestCatError);


                        if (viewmodelAddCaseRequestCatError != null) {
                            // read viewmodel.addCaseRequest.catError.get()
                            viewmodelAddCaseRequestCatErrorGet = viewmodelAddCaseRequestCatError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x20000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xe0L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xe0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xe0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/rounded_view_primary_dark : @android:drawable/rounded_view_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableRoundedViewPrimaryDarkBtnSaveAndroidDrawableRoundedViewMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.rounded_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnSave.getContext(), R.drawable.rounded_view_medium)));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidDrawableRoundedViewPrimaryDarkBtnSaveAndroidDrawableRoundedViewMedium);
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback28);
            this.inputCat.setOnClickListener(mCallback27);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            this.inputCase.setError(viewmodelAddCaseRequestInvetationNumErrorGet);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            this.inputCircle.setError(viewmodelAddCaseRequestCircleNumErrorGet);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            this.inputCourt.setError(viewmodelAddCaseRequestCourtErrorGet);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            this.inputInviteType.setError(viewmodelAddCaseRequestInvetationTypeErrorGet);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            this.inputWhom.setError(viewmodelAddCaseRequestCatErrorGet);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddCaseRequestCircleNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAddCaseRequestInvetationNum);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelAddCaseRequestCourt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddCaseRequestInventationType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toCategories();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.cases.viewModels.AddCaseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.editCase();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addCaseRequest.invetationNumError
        flag 1 (0x2L): viewmodel.addCaseRequest.courtError
        flag 2 (0x3L): viewmodel.addCaseRequest.circleNumError
        flag 3 (0x4L): viewmodel.addCaseRequest.invetationTypeError
        flag 4 (0x5L): viewmodel.addCaseRequest.catError
        flag 5 (0x6L): viewmodel
        flag 6 (0x7L): viewmodel.message
        flag 7 (0x8L): null
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/rounded_view_primary_dark : @android:drawable/rounded_view_medium
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/rounded_view_primary_dark : @android:drawable/rounded_view_medium
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}