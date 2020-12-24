// Generated by Dagger (https://dagger.dev).
package grand.app.akar.activity;

import androidx.lifecycle.MutableLiveData;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MutableLiveData<Mutable>> liveDataProvider;

  private final Provider<HomeViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<MutableLiveData<Mutable>> liveDataProvider,
      Provider<HomeViewModel> viewModelProvider) {
    this.liveDataProvider = liveDataProvider;
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MutableLiveData<Mutable>> liveDataProvider,
      Provider<HomeViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(liveDataProvider, viewModelProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectLiveData(instance, liveDataProvider.get());
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.activity.MainActivity.liveData")
  public static void injectLiveData(MainActivity instance, MutableLiveData<Mutable> liveData) {
    instance.liveData = liveData;
  }

  @InjectedFieldSignature("grand.app.akar.activity.MainActivity.viewModel")
  public static void injectViewModel(MainActivity instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
