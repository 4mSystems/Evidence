package te.app.evidence.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.pages.auth.models.UserMainData;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.session.UserHelper;


public class BaseViewModel extends ViewModel implements Observable {
    private MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
    private String message;
    PropertyChangeRegistry mCallBacks;
    private PassingObject passingObject = new PassingObject();
    public UserMainData userData = UserHelper.getInstance(MyApplication.getInstance()).getUserData();
    List<CategoriesData> categoriesDataList = new ArrayList<>();
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();

    public BaseViewModel() {
        mCallBacks = new PropertyChangeRegistry();
    }

    public MutableLiveData<Object> getLiveData() {
        return mutableLiveData == null ? mutableLiveData = new MutableLiveData<>() : mutableLiveData;
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    @Bindable
    public void setMessage(String message) {
        notifyChange(BR.message);
        this.message = message;
    }


    public String getString(int stringRes) {
        return ResourceManager.getString(stringRes);
    }

    public Drawable getDrawable(int drawable) {
        return ResourceManager.getDrawable(drawable);
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

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

    public void setCategoriesDataList(List<CategoriesData> categoriesDataList) {
        this.categoriesDataList = categoriesDataList;
    }

}
