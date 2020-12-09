package grand.app.akar.base;

import javax.inject.Singleton;

import dagger.Component;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.activity.MainActivity;
import grand.app.akar.connection.ConnectionModule;
import grand.app.akar.pages.ads.AdsInfoFragment;
import grand.app.akar.pages.ads.AdvertisingFeeFragment;
import grand.app.akar.pages.ads.AkarLocationsCitiesFragment;
import grand.app.akar.pages.ads.AkarLocationsMapFragment;
import grand.app.akar.pages.ads.CategoriesFragment;
import grand.app.akar.pages.ads.forms.AdUploadingSuccessFragment;
import grand.app.akar.pages.ads.forms.AddFactoryFormFragment;
import grand.app.akar.pages.ads.forms.AddFlatFormFragment;
import grand.app.akar.pages.ads.forms.AddLandFormFragment;
import grand.app.akar.pages.ads.forms.AddOfficeFormFragment;
import grand.app.akar.pages.ads.forms.AddResetFormFragment;
import grand.app.akar.pages.ads.forms.AddStoreFormFragment;
import grand.app.akar.pages.ads.forms.AddVillaHouseManagmentFormFragment;
import grand.app.akar.pages.ads.forms.AddWareHosueFormFragment;
import grand.app.akar.pages.ads.forms.AdsAttachmentsFragment;
import grand.app.akar.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.akar.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.akar.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.akar.pages.auth.login.LoginFragment;
import grand.app.akar.pages.auth.register.RegisterFragment;
import grand.app.akar.pages.chat.view.ChatFragment;
import grand.app.akar.pages.home.HomeFragment;
import grand.app.akar.pages.myAccount.MyAccountFragment;
import grand.app.akar.pages.notifications.NotificationsFragment;
import grand.app.akar.pages.onBoard.OnBoardFragment;
import grand.app.akar.pages.profile.ProfileFragment;
import grand.app.akar.pages.settings.AboutAppFragment;
import grand.app.akar.pages.settings.ContactUsFragment;
import grand.app.akar.pages.settings.TermsFragment;
import grand.app.akar.pages.splash.SplashFragment;

//Component refer to an interface or waiter for make an coffee cup to me
@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);


    void inject(LoginFragment loginFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(RegisterFragment registerFragment);

    void inject(HomeFragment homeFragment);

    void inject(NotificationsFragment notificationsFragment);

    void inject(MyAccountFragment myAccountFragment);

    void inject(ProfileFragment profileFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(ContactUsFragment contactUsFragment);

    void inject(TermsFragment termsFragment);

    void inject(ChatFragment chatFragment);

    void inject(AdsInfoFragment adsInfoFragment);

    void inject(AdvertisingFeeFragment advertisingFeeFragment);

    void inject(CategoriesFragment categoriesFragment);

    void inject(AkarLocationsCitiesFragment akarLocationsCitiesFragment);

    void inject(AkarLocationsMapFragment akarLocationsMapFragment);

    void inject(AddVillaHouseManagmentFormFragment addVillaFormFragment);

    void inject(AddFlatFormFragment addFlatFormFragment);

    void inject(AddWareHosueFormFragment addWareHouseFormFragment);

    void inject(AddStoreFormFragment addStoreFormFragment);

    void inject(AddLandFormFragment addLandFormFragment);

    void inject(AddFactoryFormFragment addFactoryFormFragment);

    void inject(AddResetFormFragment addResetFormFragment);

    void inject(AddOfficeFormFragment addOfficeFormFragment);

    void inject(AdsAttachmentsFragment adsAttachmentsFragment);

    void inject(AdUploadingSuccessFragment adUploadingSuccessFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
