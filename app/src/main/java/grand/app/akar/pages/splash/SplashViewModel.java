package grand.app.akar.pages.splash;

import android.os.Handler;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.pages.onBoard.OnBoardAdapter;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OnBoardAdapter onBoardAdapter = new OnBoardAdapter();
    @Inject
    AuthRepository repository;

    @Inject
    public SplashViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public AuthRepository getRepository() {
        return repository;
    }

    public void runSplash() {
        new Handler().postDelayed(() -> {
            if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null) {
                liveData.setValue(new Mutable(Constants.HOME));
            } else {
                liveData.setValue(new Mutable(Constants.BOARD));
            }
        }, 3000);
    }

    @Bindable
    public OnBoardAdapter getOnBoardAdapter() {
        notifyChange(BR.onBoardAdapter);
        return onBoardAdapter;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void getSlider() {
        compositeDisposable.add(repository.getBoard());
    }

    public void setupSlider(SliderView sliderView) {
        sliderView.setSliderAdapter(onBoardAdapter);
    }

    public void toNext() {
        liveData.setValue(new Mutable(Constants.NEXT));
    }

    public void toLogin() {
        liveData.setValue(new Mutable(Constants.START_APP));
    }
}
