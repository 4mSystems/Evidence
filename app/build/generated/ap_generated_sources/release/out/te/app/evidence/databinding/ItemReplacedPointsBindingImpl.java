package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemReplacedPointsBindingImpl extends ItemReplacedPointsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemReplacedPointsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemReplacedPointsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.btnAction.setTag(null);
        this.catName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.point.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.replacedPoints) {
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
        te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelReplacedPointsPointsNumConcatJavaLangStringConcatPointAndroidStringPoint = null;
        boolean itemViewModelReplacedPointsTypeEqualsJavaLangStringFriend = false;
        te.app.evidence.pages.points.models.ReplacedPoints itemViewModelReplacedPoints = null;
        java.lang.String itemViewModelReplacedPointsType = null;
        java.lang.String itemViewModelReplacedPointsName = null;
        java.lang.String itemViewModelReplacedPointsPointsNumConcatJavaLangString = null;
        int itemViewModelReplacedPointsTypeEqualsJavaLangStringFriendViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelReplacedPointsPointsNum = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.replacedPoints
                    itemViewModelReplacedPoints = itemViewModel.getReplacedPoints();
                }


                if (itemViewModelReplacedPoints != null) {
                    // read itemViewModel.replacedPoints.type
                    itemViewModelReplacedPointsType = itemViewModelReplacedPoints.getType();
                    // read itemViewModel.replacedPoints.name
                    itemViewModelReplacedPointsName = itemViewModelReplacedPoints.getName();
                    // read itemViewModel.replacedPoints.pointsNum
                    itemViewModelReplacedPointsPointsNum = itemViewModelReplacedPoints.getPointsNum();
                }


                if (itemViewModelReplacedPointsType != null) {
                    // read itemViewModel.replacedPoints.type.equals("friend")
                    itemViewModelReplacedPointsTypeEqualsJavaLangStringFriend = itemViewModelReplacedPointsType.equals("friend");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelReplacedPointsTypeEqualsJavaLangStringFriend) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (itemViewModelReplacedPointsPointsNum != null) {
                    // read itemViewModel.replacedPoints.pointsNum.concat(" ")
                    itemViewModelReplacedPointsPointsNumConcatJavaLangString = itemViewModelReplacedPointsPointsNum.concat(" ");
                }


                // read itemViewModel.replacedPoints.type.equals("friend") ? View.VISIBLE : View.GONE
                itemViewModelReplacedPointsTypeEqualsJavaLangStringFriendViewVISIBLEViewGONE = ((itemViewModelReplacedPointsTypeEqualsJavaLangStringFriend) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (itemViewModelReplacedPointsPointsNumConcatJavaLangString != null) {
                    // read itemViewModel.replacedPoints.pointsNum.concat(" ").concat(@android:string/point)
                    itemViewModelReplacedPointsPointsNumConcatJavaLangStringConcatPointAndroidStringPoint = itemViewModelReplacedPointsPointsNumConcatJavaLangString.concat(point.getResources().getString(R.string.point));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnAction.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.btnAction.setVisibility(itemViewModelReplacedPointsTypeEqualsJavaLangStringFriendViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catName, itemViewModelReplacedPointsName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.point, itemViewModelReplacedPointsPointsNumConcatJavaLangStringConcatPointAndroidStringPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.evidence.pages.points.viewModels.ItemReplacedPointsViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {




            itemViewModel.itemAction(te.app.evidence.utils.Constants.INVITE);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.replacedPoints
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.replacedPoints.type.equals("friend") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.replacedPoints.type.equals("friend") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}