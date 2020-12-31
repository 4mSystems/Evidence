package grand.app.akar.databinding;
import grand.app.akar.R;
import grand.app.akar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChatBindingImpl extends FragmentChatBinding implements grand.app.akar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v14, 5);
        sViewsWithIds.put(R.id.chat_actions, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener sendChattextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.text
            //         is viewmodel.request.setText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = grand.app.akar.customViews.views.CustomEditText.setText(sendChat);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.akar.pages.chat.model.ChatRequest viewmodelRequest = null;
            // viewmodel.request.text
            java.lang.String viewmodelRequestText = null;
            // viewmodel
            grand.app.akar.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.request;

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setText(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (grand.app.akar.customViews.views.CustomEditText) bindings[3]
            , (android.view.View) bindings[5]
            );
        this.attach.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.more.setTag(null);
        this.rcChat.setTag(null);
        this.sendChat.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new grand.app.akar.generated.callback.OnClickListener(this, 1);
        mCallback26 = new grand.app.akar.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((grand.app.akar.pages.chat.viewmodel.ChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.akar.pages.chat.viewmodel.ChatViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.akar.pages.chat.viewmodel.ChatViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.akar.pages.chat.viewmodel.ChatViewModel Viewmodel, int fieldId) {
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
        grand.app.akar.pages.chat.model.ChatRequest viewmodelRequest = null;
        grand.app.akar.pages.chat.adapter.ChatAdapter viewmodelAdapter = null;
        java.lang.String viewmodelRequestText = null;
        grand.app.akar.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.request
                    viewmodelRequest = viewmodel.request;
                    // read viewmodel.adapter
                    viewmodelAdapter = viewmodel.adapter;
                }


                if (viewmodelRequest != null) {
                    // read viewmodel.request.text
                    viewmodelRequestText = viewmodelRequest.getText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.attach.setOnClickListener(mCallback25);
            this.more.setOnClickListener(mCallback26);
            grand.app.akar.customViews.views.CustomEditText.setTextListner(this.sendChat, sendChattextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            grand.app.akar.base.ApplicationBinding.getItemsV2Binding(this.rcChat, viewmodelAdapter, "1", "1");
            grand.app.akar.customViews.views.CustomEditText.getText(this.sendChat, viewmodelRequestText);
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
                grand.app.akar.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sendMessage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.akar.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.select();
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
    flag mapping end*/
    //end
}