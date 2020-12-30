package grand.app.akar.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.BR;
import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.pages.ads.forms.AddFactoryFormFragment;
import grand.app.akar.pages.ads.forms.AddFlatFormFragment;
import grand.app.akar.pages.ads.forms.AddLandFormFragment;
import grand.app.akar.pages.ads.forms.AddOfficeFormFragment;
import grand.app.akar.pages.ads.forms.AddResetFormFragment;
import grand.app.akar.pages.ads.forms.AddStoreFormFragment;
import grand.app.akar.pages.ads.forms.AddVillaHouseManagmentFormFragment;
import grand.app.akar.pages.ads.forms.AddWareHosueFormFragment;
import grand.app.akar.pages.ads.models.CategoriesData;
import grand.app.akar.pages.auth.models.UserData;
import grand.app.akar.utils.images.PhotoFullPopupWindow;
import grand.app.akar.utils.resources.ResourceManager;
import grand.app.akar.utils.session.UserHelper;


public class BaseViewModel extends ViewModel implements Observable {
    private MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
    private ObservableField<String> message = new ObservableField<>();
    private PropertyChangeRegistry mCallBacks;
    private PassingObject passingObject = new PassingObject();
    private String countryCurrency;
    public UserData userData = UserHelper.getInstance(MyApplication.getInstance()).getUserData();
    private List<CategoriesData> categoriesDataList = new ArrayList<>();

    public List<CategoriesData> getCategoriesDataList() {
        categoriesDataList.add(new CategoriesData(1, ResourceManager.getString(R.string.villa), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(2, ResourceManager.getString(R.string.house), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(3, ResourceManager.getString(R.string.flat), AddFlatFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(4, ResourceManager.getString(R.string.ware_house), AddWareHosueFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(5, ResourceManager.getString(R.string.store), AddStoreFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(6, ResourceManager.getString(R.string.land), AddLandFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(7, ResourceManager.getString(R.string.manage_building), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(8, ResourceManager.getString(R.string.factory), AddFactoryFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(9, ResourceManager.getString(R.string.rest), AddResetFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(10, ResourceManager.getString(R.string.building), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(11, ResourceManager.getString(R.string.office), AddOfficeFormFragment.class.getName()));
        return categoriesDataList;
    }

    public BaseViewModel() {
        mCallBacks = new PropertyChangeRegistry();
    }

    public MutableLiveData<Object> getLiveData() {
        return mutableLiveData == null ? mutableLiveData = new MutableLiveData<>() : mutableLiveData;
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(Object message) {
        this.message.set(message.toString());
    }

    public void setMessageFromRes(int stringRes) {
        this.message.set(getString(stringRes));
    }


    public String getString(int stringRes) {
        return ResourceManager.getString(stringRes);
    }

    public Drawable getDrawable(int drawable) {
        return ResourceManager.getDrawable(drawable);
    }


    public String[] getStringArray(int resArray) {
        return MyApplication.getInstance().getResources().getStringArray(resArray);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.remove(callback);
    }

    public void goBack(Context context) {
        ((Activity) context).finish();
    }

    public void notifyChange() {
        mCallBacks.notifyChange(this, 0);
    }

    public void notifyChange(int propertyId) {
        mCallBacks.notifyChange(this, propertyId);
    }

    @Bindable
    public PassingObject getPassingObject() {
        return passingObject;
    }

    @Bindable
    public void setPassingObject(PassingObject passingObject) {
        notifyChange(BR.passingObject);
        this.passingObject = passingObject;
    }

    public String getCountryCurrency() {
        return UserHelper.getInstance(MyApplication.getInstance()).getCountryCurrency();
    }

    public void showImage(String imgUrl, View imageView) {
        new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, imgUrl, null);
    }
}
