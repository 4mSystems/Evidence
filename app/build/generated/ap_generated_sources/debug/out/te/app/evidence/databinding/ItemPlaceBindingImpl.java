package te.app.evidence.databinding;
import te.app.evidence.R;
import te.app.evidence.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPlaceBindingImpl extends ItemPlaceBinding implements te.app.evidence.generated.callback.OnClickListener.Listener {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPlaceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemPlaceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (te.app.evidence.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.evidence.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.address.setTag(null);
        this.icPlace.setTag(null);
        this.icShare.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMap.setTag(null);
        this.userName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new te.app.evidence.generated.callback.OnClickListener(this, 3);
        mCallback57 = new te.app.evidence.generated.callback.OnClickListener(this, 1);
        mCallback58 = new te.app.evidence.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.evidence.pages.places.viewModels.ItemPlacesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.evidence.pages.places.viewModels.ItemPlacesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.evidence.pages.places.viewModels.ItemPlacesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.evidence.pages.places.viewModels.ItemPlacesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.placesData) {
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
        te.app.evidence.pages.places.models.PlacesData itemViewModelPlacesData = null;
        android.graphics.drawable.Drawable itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonthIcPlaceAndroidDrawableIcEstateLocationItemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation = null;
        android.graphics.drawable.Drawable itemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation = null;
        te.app.evidence.pages.places.viewModels.ItemPlacesViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonth = false;
        java.lang.String itemViewModelPlacesDataAddress = null;
        java.lang.String itemViewModelPlacesDataName = null;
        boolean itemViewModelPlacesDataTypeEqualsConstantsCOURT = false;
        java.lang.String itemViewModelPlacesDataType = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.placesData
                    itemViewModelPlacesData = itemViewModel.getPlacesData();
                }


                if (itemViewModelPlacesData != null) {
                    // read itemViewModel.placesData.address
                    itemViewModelPlacesDataAddress = itemViewModelPlacesData.getAddress();
                    // read itemViewModel.placesData.name
                    itemViewModelPlacesDataName = itemViewModelPlacesData.getName();
                    // read itemViewModel.placesData.type
                    itemViewModelPlacesDataType = itemViewModelPlacesData.getType();
                }


                if (itemViewModelPlacesDataType != null) {
                    // read itemViewModel.placesData.type.equals(Constants.Real_estate_month)
                    itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonth = itemViewModelPlacesDataType.equals(te.app.evidence.utils.Constants.Real_estate_month);
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonth) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (itemViewModelPlacesDataType != null) {
                    // read itemViewModel.placesData.type.equals(Constants.COURT)
                    itemViewModelPlacesDataTypeEqualsConstantsCOURT = itemViewModelPlacesDataType.equals(te.app.evidence.utils.Constants.COURT);
                }
            if((dirtyFlags & 0x8L) != 0) {
                if(itemViewModelPlacesDataTypeEqualsConstantsCOURT) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
                itemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation = ((itemViewModelPlacesDataTypeEqualsConstantsCOURT) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(icPlace.getContext(), R.drawable.ic_pin_court)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(icPlace.getContext(), R.drawable.ic_police_station)));
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.placesData.type.equals(Constants.Real_estate_month) ? @android:drawable/ic_estate_location : itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
                itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonthIcPlaceAndroidDrawableIcEstateLocationItemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation = ((itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonth) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(icPlace.getContext(), R.drawable.ic_estate_location)) : (itemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, itemViewModelPlacesDataAddress);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icPlace, itemViewModelPlacesDataTypeEqualsConstantsRealEstateMonthIcPlaceAndroidDrawableIcEstateLocationItemViewModelPlacesDataTypeEqualsConstantsCOURTIcPlaceAndroidDrawableIcPinCourtIcPlaceAndroidDrawableIcPoliceStation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, itemViewModelPlacesDataName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icPlace.setOnClickListener(mCallback57);
            this.icShare.setOnClickListener(mCallback59);
            this.tvMap.setOnClickListener(mCallback58);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.places.viewModels.ItemPlacesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(te.app.evidence.utils.Constants.SHARE_BAR);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.places.viewModels.ItemPlacesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(te.app.evidence.utils.Constants.LOCATIONS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.evidence.pages.places.viewModels.ItemPlacesViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(te.app.evidence.utils.Constants.LOCATIONS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.placesData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.placesData.type.equals(Constants.Real_estate_month) ? @android:drawable/ic_estate_location : itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
        flag 4 (0x5L): itemViewModel.placesData.type.equals(Constants.Real_estate_month) ? @android:drawable/ic_estate_location : itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
        flag 5 (0x6L): itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
        flag 6 (0x7L): itemViewModel.placesData.type.equals(Constants.COURT) ? @android:drawable/ic_pin_court : @android:drawable/ic_police_station
    flag mapping end*/
    //end
}