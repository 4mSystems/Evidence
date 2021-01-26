package te.app.evidence.pages.splash;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.onBoard.OnBoardAdapter;
import te.app.evidence.pages.onBoard.models.OnBoard;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;
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


    public void getSettings() {
        compositeDisposable.add(repository.getSettings());
    }

    public void setupSlider(SliderView sliderView) {
        List<OnBoard> onBoardList = new ArrayList<>();
        onBoardList.add(new OnBoard(ResourceManager.getDrawable(R.drawable.board1), ResourceManager.getString(R.string.slider_title1), ResourceManager.getString(R.string.slider_desc1), 1));
        onBoardList.add(new OnBoard(ResourceManager.getDrawable(R.drawable.board2), ResourceManager.getString(R.string.slider_title2), ResourceManager.getString(R.string.slider_desc2), 1));
        onBoardList.add(new OnBoard(ResourceManager.getDrawable(R.drawable.board3), ResourceManager.getString(R.string.slider_title3), ResourceManager.getString(R.string.slider_desc3), 1));
        getOnBoardAdapter().updateData(onBoardList);
        sliderView.setSliderAdapter(onBoardAdapter);
    }

    public void toNext() {
        liveData.setValue(new Mutable(Constants.NEXT));
    }

    public void toLogin() {
        liveData.setValue(new Mutable(Constants.START_APP));
    }
}
