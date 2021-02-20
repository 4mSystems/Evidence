package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemBailiffsBindingImpl extends ItemBailiffsBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_session_header, 9);
        sViewsWithIds.put(R.id.icon_down_qu, 10);
        sViewsWithIds.put(R.id.v1, 11);
        sViewsWithIds.put(R.id.expansionLayoutSessions, 12);
        sViewsWithIds.put(R.id.court_text, 13);
        sViewsWithIds.put(R.id.v2, 14);
        sViewsWithIds.put(R.id.paper_type_text, 15);
        sViewsWithIds.put(R.id.v3, 16);
        sViewsWithIds.put(R.id.paper_number_text, 17);
        sViewsWithIds.put(R.id.v6, 18);
        sViewsWithIds.put(R.id.session_date_text, 19);
        sViewsWithIds.put(R.id.v7, 20);
        sViewsWithIds.put(R.id.status_text, 21);
        sViewsWithIds.put(R.id.v4, 22);
        sViewsWithIds.put(R.id.edit, 23);
        sViewsWithIds.put(R.id.v5, 24);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBailiffsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ItemBailiffsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[23]
            , (com.github.florent37.expansionpanel.ExpansionLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.github.florent37.expansionpanel.ExpansionHeader) bindings[9]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[1]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[8]
            );
        this.courtValue.setTag(null);
        this.delete.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.paperNumberValue.setTag(null);
        this.paperTypeValue.setTag(null);
        this.sessionMonthValue.setTag(null);
        this.statusValue.setTag(null);
        this.tvPaperNumber.setTag(null);
        this.viewValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
        mCallback20 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback18 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.bailiffsData) {
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
        java.lang.String itemViewModelBailiffsDataPaperNumber = null;
        te.app.evidence.pages.mohdrs.models.ReportersData itemViewModelBailiffsData = null;
        java.lang.String itemViewModelBailiffsDataKhesmName = null;
        boolean itemViewModelBailiffsDataStatusEqualsJavaLangStringFinished = false;
        java.lang.String itemViewModelBailiffsDataSessionDate = null;
        te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelBailiffsDataMokelName = null;
        java.lang.String itemViewModelBailiffsDataStatus = null;
        android.graphics.drawable.Drawable itemViewModelBailiffsDataStatusEqualsJavaLangStringFinishedStatusValueAndroidDrawableCornerViewPrimaryDarkStatusValueAndroidDrawableCornerViewPrimaryAccept = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.bailiffsData
                    itemViewModelBailiffsData = itemViewModel.getBailiffsData();
                }


                if (itemViewModelBailiffsData != null) {
                    // read itemViewModel.bailiffsData.paperNumber
                    itemViewModelBailiffsDataPaperNumber = itemViewModelBailiffsData.getPaperNumber();
                    // read itemViewModel.bailiffsData.khesmName
                    itemViewModelBailiffsDataKhesmName = itemViewModelBailiffsData.getKhesmName();
                    // read itemViewModel.bailiffsData.sessionDate
                    itemViewModelBailiffsDataSessionDate = itemViewModelBailiffsData.getSessionDate();
                    // read itemViewModel.bailiffsData.mokelName
                    itemViewModelBailiffsDataMokelName = itemViewModelBailiffsData.getMokelName();
                    // read itemViewModel.bailiffsData.status
                    itemViewModelBailiffsDataStatus = itemViewModelBailiffsData.getStatus();
                }


                if (itemViewModelBailiffsDataStatus != null) {
                    // read itemViewModel.bailiffsData.status.equals("Finished")
                    itemViewModelBailiffsDataStatusEqualsJavaLangStringFinished = itemViewModelBailiffsDataStatus.equals("Finished");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelBailiffsDataStatusEqualsJavaLangStringFinished) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.bailiffsData.status.equals("Finished") ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_accept
                itemViewModelBailiffsDataStatusEqualsJavaLangStringFinishedStatusValueAndroidDrawableCornerViewPrimaryDarkStatusValueAndroidDrawableCornerViewPrimaryAccept = ((itemViewModelBailiffsDataStatusEqualsJavaLangStringFinished) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(statusValue.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(statusValue.getContext(), R.drawable.corner_view_primary_accept)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.courtValue, itemViewModelBailiffsDataMokelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperNumberValue, itemViewModelBailiffsDataPaperNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paperTypeValue, itemViewModelBailiffsDataKhesmName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionMonthValue, itemViewModelBailiffsDataSessionDate);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.statusValue, itemViewModelBailiffsDataStatusEqualsJavaLangStringFinishedStatusValueAndroidDrawableCornerViewPrimaryDarkStatusValueAndroidDrawableCornerViewPrimaryAccept);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusValue, itemViewModelBailiffsDataStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPaperNumber, itemViewModelBailiffsDataPaperNumber);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback19);
            this.statusValue.setOnClickListener(mCallback18);
            this.viewValue.setOnClickListener(mCallback20);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.delete();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.view();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.mohdrs.viewModels.BailiffsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.changeStatus();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.bailiffsData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.bailiffsData.status.equals("Finished") ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_accept
        flag 4 (0x5L): itemViewModel.bailiffsData.status.equals("Finished") ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_accept
    flag mapping end*/
    //end
}