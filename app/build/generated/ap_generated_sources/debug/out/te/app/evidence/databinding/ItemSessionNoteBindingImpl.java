package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionNoteBindingImpl extends ItemSessionNoteBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_username, 7);
        sViewsWithIds.put(R.id.v9, 8);
        sViewsWithIds.put(R.id.session_date_text, 9);
        sViewsWithIds.put(R.id.v2, 10);
        sViewsWithIds.put(R.id.session_status_text, 11);
        sViewsWithIds.put(R.id.v3, 12);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemSessionNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[7]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[8]
            );
        this.delete.setTag(null);
        this.edit.setTag(null);
        this.flow2.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionCaseNumber.setTag(null);
        this.sessionDateValue.setTag(null);
        this.statusValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback35 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback36 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notes) {
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
        te.app.evidence.pages.auth.models.UserData itemViewModelNotesUser = null;
        java.lang.String itemViewModelNotesNotes = null;
        int itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelNotesUserName = null;
        java.lang.String itemViewModelNotesStatus = null;
        te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
        te.app.evidence.pages.auth.models.UserMainData itemViewModelUserData = null;
        boolean itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = false;
        te.app.evidence.pages.auth.models.UserData itemViewModelUserDataUserData = null;
        te.app.evidence.pages.clients.notes.models.Notes itemViewModelNotes = null;
        java.lang.String itemViewModelUserDataUserDataType = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.userData
                        itemViewModelUserData = itemViewModel.userData;
                    }


                    if (itemViewModelUserData != null) {
                        // read itemViewModel.userData.userData
                        itemViewModelUserDataUserData = itemViewModelUserData.getUserData();
                    }


                    if (itemViewModelUserDataUserData != null) {
                        // read itemViewModel.userData.userData.type
                        itemViewModelUserDataUserDataType = itemViewModelUserDataUserData.getType();
                    }


                    if (itemViewModelUserDataUserDataType != null) {
                        // read itemViewModel.userData.userData.type.equals("admin")
                        itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin = itemViewModelUserDataUserDataType.equals("admin");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }


                    // read itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
                    itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE = ((itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdmin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (itemViewModel != null) {
                    // read itemViewModel.notes
                    itemViewModelNotes = itemViewModel.getNotes();
                }


                if (itemViewModelNotes != null) {
                    // read itemViewModel.notes.user
                    itemViewModelNotesUser = itemViewModelNotes.getUser();
                    // read itemViewModel.notes.notes
                    itemViewModelNotesNotes = itemViewModelNotes.getNotes();
                    // read itemViewModel.notes.status
                    itemViewModelNotesStatus = itemViewModelNotes.getStatus();
                }


                if (itemViewModelNotesUser != null) {
                    // read itemViewModel.notes.user.name
                    itemViewModelNotesUserName = itemViewModelNotesUser.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback36);
            this.edit.setOnClickListener(mCallback37);
            this.statusValue.setOnClickListener(mCallback35);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.flow2.setVisibility(itemViewModelUserDataUserDataTypeEqualsJavaLangStringAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionCaseNumber, itemViewModelNotesUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDateValue, itemViewModelNotesNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, itemViewModelNotesStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.EDIT);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.CHANGE_STATUS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.clients.notes.viewModels.NotesItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.buttonAction(te.app.evidence.utils.Constants.DELETE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.notes
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.userData.userData.type.equals("admin") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}