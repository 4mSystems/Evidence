package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddAttachmentBindingImpl extends FragmentAddAttachmentBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.attachmentRequest.desc
            //         is viewmodel.attachmentRequest.setDesc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.attachmentRequest != null
            boolean viewmodelAttachmentRequestJavaLangObjectNull = false;
            // viewmodel.attachmentRequest
            te.app.evidence.pages.attachments.models.AddAttachmentRequest viewmodelAttachmentRequest = null;
            // viewmodel.attachmentRequest.desc
            java.lang.String viewmodelAttachmentRequestDesc = null;
            // viewmodel
            te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAttachmentRequest = viewmodel.getAttachmentRequest();

                viewmodelAttachmentRequestJavaLangObjectNull = (viewmodelAttachmentRequest) != (null);
                if (viewmodelAttachmentRequestJavaLangObjectNull) {




                    viewmodelAttachmentRequest.setDesc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddAttachmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentAddAttachmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[6]
            );
        this.btnSave.setTag(null);
        this.file.setTag(null);
        this.inputDesc.setTag(null);
        this.inputFile.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback26 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAttachmentRequestDescError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAttachmentRequestFileError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodel((te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAttachmentRequestDescError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAttachmentRequestDescError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAttachmentRequestFileError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAttachmentRequestFileError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAttachmentRequestFileErrorGet = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = 0;
        java.lang.String viewmodelAttachmentRequestDesc = null;
        java.lang.String viewmodelMessage = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAttachmentRequestDescErrorGet = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        te.app.evidence.pages.attachments.models.AddAttachmentRequest viewmodelAttachmentRequest = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAttachmentRequestDescError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAttachmentRequestFileError = null;
        te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x1cL) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x17L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.attachmentRequest
                        viewmodelAttachmentRequest = viewmodel.getAttachmentRequest();
                    }

                if ((dirtyFlags & 0x14L) != 0) {

                        if (viewmodelAttachmentRequest != null) {
                            // read viewmodel.attachmentRequest.desc
                            viewmodelAttachmentRequestDesc = viewmodelAttachmentRequest.getDesc();
                        }
                }
                if ((dirtyFlags & 0x15L) != 0) {

                        if (viewmodelAttachmentRequest != null) {
                            // read viewmodel.attachmentRequest.descError
                            viewmodelAttachmentRequestDescError = viewmodelAttachmentRequest.descError;
                        }
                        updateRegistration(0, viewmodelAttachmentRequestDescError);


                        if (viewmodelAttachmentRequestDescError != null) {
                            // read viewmodel.attachmentRequest.descError.get()
                            viewmodelAttachmentRequestDescErrorGet = viewmodelAttachmentRequestDescError.get();
                        }
                }
                if ((dirtyFlags & 0x16L) != 0) {

                        if (viewmodelAttachmentRequest != null) {
                            // read viewmodel.attachmentRequest.fileError
                            viewmodelAttachmentRequestFileError = viewmodelAttachmentRequest.fileError;
                        }
                        updateRegistration(1, viewmodelAttachmentRequestFileError);


                        if (viewmodelAttachmentRequestFileError != null) {
                            // read viewmodel.attachmentRequest.fileError.get()
                            viewmodelAttachmentRequestFileErrorGet = viewmodelAttachmentRequestFileError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.evidence.utils.Constants.HIDE_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x1cL) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x1cL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x1cL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (getColorFromResource(btnSave, R.color.colorPrimaryDark)) : (getColorFromResource(btnSave, R.color.medium_color)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnSave, androidx.databinding.adapters.Converters.convertColorToDrawable(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBtnSaveAndroidColorColorPrimaryDarkBtnSaveAndroidColorMediumColor));
            this.btnSave.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback26);
            this.file.setOnClickListener(mCallback25);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.inputDesc.setError(viewmodelAttachmentRequestDescErrorGet);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.inputFile.setError(viewmodelAttachmentRequestFileErrorGet);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelAttachmentRequestDesc);
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
                te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.select();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.addAttach();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.attachmentRequest.descError
        flag 1 (0x2L): viewmodel.attachmentRequest.fileError
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.message
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 6 (0x7L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:color/colorPrimaryDark : @android:color/medium_color
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}