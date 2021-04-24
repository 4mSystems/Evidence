package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddNoteBindingImpl extends FragmentAddNoteBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addNoteRequest.notes
            //         is viewmodel.addNoteRequest.setNotes((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addNoteRequest
            te.app.evidence.pages.notes.models.AddNoteRequest viewmodelAddNoteRequest = null;
            // viewmodel.addNoteRequest != null
            boolean viewmodelAddNoteRequestJavaLangObjectNull = false;
            // viewmodel.addNoteRequest.notes
            java.lang.String viewmodelAddNoteRequestNotes = null;
            // viewmodel
            te.app.evidence.pages.notes.viewModels.AddNoteViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddNoteRequest = viewmodel.getAddNoteRequest();

                viewmodelAddNoteRequestJavaLangObjectNull = (viewmodelAddNoteRequest) != (null);
                if (viewmodelAddNoteRequestJavaLangObjectNull) {




                    viewmodelAddNoteRequest.setNotes(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentAddNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.evidence.pages.notes.viewModels.AddNoteViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.evidence.pages.notes.viewModels.AddNoteViewModel Viewmodel) {
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
                return onChangeViewmodelAddNoteRequestNoteError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.evidence.pages.notes.viewModels.AddNoteViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddNoteRequestNoteError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddNoteRequestNoteError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.evidence.pages.notes.viewModels.AddNoteViewModel Viewmodel, int fieldId) {
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
        java.lang.String viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewNoteMboundView3AndroidStringEditNote = null;
        te.app.evidence.PassingObject viewmodelPassingObject = null;
        java.lang.String viewmodelAddNoteRequestNoteErrorGet = null;
        te.app.evidence.pages.notes.models.AddNoteRequest viewmodelAddNoteRequest = null;
        java.lang.String viewmodelAddNoteRequestNotes = null;
        java.lang.Object viewmodelPassingObjectObjectClass = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddNoteRequestNoteError = null;
        boolean viewmodelPassingObjectObjectClassJavaLangObjectNull = false;
        te.app.evidence.pages.notes.viewModels.AddNoteViewModel viewmodel = mViewmodel;

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


                    // read viewmodel.passingObject.objectClass == null ? @android:string/add_new_note : @android:string/edit_note
                    viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewNoteMboundView3AndroidStringEditNote = ((viewmodelPassingObjectObjectClassJavaLangObjectNull) ? (mboundView3.getResources().getString(R.string.add_new_note)) : (mboundView3.getResources().getString(R.string.edit_note)));
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addNoteRequest
                        viewmodelAddNoteRequest = viewmodel.getAddNoteRequest();
                    }

                if ((dirtyFlags & 0xaL) != 0) {

                        if (viewmodelAddNoteRequest != null) {
                            // read viewmodel.addNoteRequest.notes
                            viewmodelAddNoteRequestNotes = viewmodelAddNoteRequest.getNotes();
                        }
                }

                    if (viewmodelAddNoteRequest != null) {
                        // read viewmodel.addNoteRequest.noteError
                        viewmodelAddNoteRequestNoteError = viewmodelAddNoteRequest.noteError;
                    }
                    updateRegistration(0, viewmodelAddNoteRequestNoteError);


                    if (viewmodelAddNoteRequestNoteError != null) {
                        // read viewmodel.addNoteRequest.noteError.get()
                        viewmodelAddNoteRequestNoteErrorGet = viewmodelAddNoteRequestNoteError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.mboundView1.setError(viewmodelAddNoteRequestNoteErrorGet);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelAddNoteRequestNotes);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback59);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelPassingObjectObjectClassJavaLangObjectNullMboundView3AndroidStringAddNewNoteMboundView3AndroidStringEditNote);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.evidence.pages.notes.viewModels.AddNoteViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.addNewNote();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addNoteRequest.noteError
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.passingObject
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_note : @android:string/edit_note
        flag 5 (0x6L): viewmodel.passingObject.objectClass == null ? @android:string/add_new_note : @android:string/edit_note
    flag mapping end*/
    //end
}