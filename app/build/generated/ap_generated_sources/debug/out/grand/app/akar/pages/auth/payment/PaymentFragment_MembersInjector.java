// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.auth.payment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentFragment_MembersInjector implements MembersInjector<PaymentFragment> {
  private final Provider<PaymentViewModel> viewModelProvider;

  public PaymentFragment_MembersInjector(Provider<PaymentViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PaymentFragment> create(
      Provider<PaymentViewModel> viewModelProvider) {
    return new PaymentFragment_MembersInjector(viewModelProvider);}

  @Override
  public void injectMembers(PaymentFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.auth.payment.PaymentFragment.viewModel")
  public static void injectViewModel(PaymentFragment instance, PaymentViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}