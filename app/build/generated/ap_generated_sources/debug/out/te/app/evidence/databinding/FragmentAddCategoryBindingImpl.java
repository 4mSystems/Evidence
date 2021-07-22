package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddCategoryBindingImpl extends FragmentAddCategoryBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addCategoryRequest.name
            //         is viewmodel.addCategoryRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.addCategoryRequest
            te.app.evidence.pages.categories.models.AddCategoryRequest viewmodelAddCategoryRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addCategoryRequest.name
            java.lang.String viewmodelAddCategoryRequestName = null;
            // viewmodel.addCategoryRequest != null
            boolean viewmodelAddCategoryRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddCategoryRequest = viewmodel.getAddCategoryRequest();

                viewmodelAddCategoryRequestJavaLangObjectNull = (viewmodelAddCategoryRequest) != (null);
                if (viewmodelAddCategoryRequestJavaLangObjectNull) {




                    viewmodelAddCategoryRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentAddCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback24 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewmodel((te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelAddCategoryRequestUserNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddCategoryRequestUserNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddCategoryRequestUserNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewmodelAddCategoryRequestUserNameErrorGet = null;
        te.app.evidence.PassingObject viewmodelPassingObject = null;
        te.app.evidence.pages.categories.models.AddCategoryRequest viewmodelAddCategoryRequest = null;
        java.lang.Object viewmodelPassingObjectObjectClass = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddCategoryRequestUserNameError = null;
        java.lang.String viewmodelAddCategoryRequestName = null;
        boolean viewmodelPassingObjectObjectClassJavaLangObjectNull = false;
        te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewCategoryMboundView3AndroidStringEditCategory = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.objectClass
                        viewmodelPassingObjectObjectClass = viewmodelPassingObject.getObjectClass();
                    }


                    // read viewmodel.passingObject.objectClass == null
                    viewmodelPassingObjectObjectClassJavaLangObjectNull = (viewmodelPassingObjectObjectClass) == (null);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewmodelPassingObjectObjectClassJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.passingObject.objectClass == null ? @android:string/add_new_category : @android:string/edit_category
                    viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewCategoryMboundView3AndroidStringEditCategory = ((viewmodelPassingObjectObjectClassJavaLangObjectNull) ? (mboundView3.getResources().getString(R.string.add_new_category)) : (mboundView3.getResources().getString(R.string.edit_category)));
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addCategoryRequest
                        viewmodelAddCategoryRequest = viewmodel.getAddCategoryRequest();
                    }


                    if (viewmodelAddCategoryRequest != null) {
                        // read viewmodel.addCategoryRequest.userNameError
                        viewmodelAddCategoryRequestUserNameError = viewmodelAddCategoryRequest.userNameError;
                    }
                    updateRegistration(0, viewmodelAddCategoryRequestUserNameError);


                    if (viewmodelAddCategoryRequestUserNameError != null) {
                        // read viewmodel.addCategoryRequest.userNameError.get()
                        viewmodelAddCategoryRequestUserNameErrorGet = viewmodelAddCategoryRequestUserNameError.get();
                    }
                if ((dirtyFlags & 0xaL) != 0) {

                        if (viewmodelAddCategoryRequest != null) {
                            // read viewmodel.addCategoryRequest.name
                            viewmodelAddCategoryRequestName = viewmodelAddCategoryRequest.getName();
                        }
                }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddCategoryRequestUserNameErrorGet);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddCategoryRequestName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewCategoryMboundView3AndroidStringEditCategory);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.addNewCategory();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addCategoryRequest.userNameError
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.passingObject
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_category : @android:string/edit_category
        flag 5 (0x6L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_category : @android:string/edit_category
    flag mapping end*/
    //end
}