package te.app.evidence.activity;

import androidx.lifecycle.MutableLiveData;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.model.base.Mutable;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MutableLiveData<Mutable>> liveDataProvider;

  public MainActivity_MembersInjector(Provider<MutableLiveData<Mutable>> liveDataProvider) {
    this.liveDataProvider = liveDataProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MutableLiveData<Mutable>> liveDataProvider) {
    return new MainActivity_MembersInjector(liveDataProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectLiveData(instance, liveDataProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.activity.MainActivity.liveData")
  public static void injectLiveData(MainActivity instance, MutableLiveData<Mutable> liveData) {
    instance.liveData = liveData;
  }
}
