package te.app.evidence.base;

import javax.inject.Singleton;

import dagger.Component;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.connection.ConnectionModule;
import te.app.evidence.pages.auth.changePassword.ChangePasswordFragment;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.evidence.pages.auth.login.LoginFragment;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.pages.profile.ProfileFragment;
import te.app.evidence.pages.reporters.ReportersDetailsFragment;
import te.app.evidence.pages.splash.SplashFragment;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.pages.users.UserPermissionsFragment;
import te.app.evidence.pages.users.UsersFragment;

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

    void inject(ProfileFragment profileFragment);

    void inject(HomeFragment homeFragment);

    void inject(ReportersDetailsFragment reportersDetailsFragment);

    void inject(UsersFragment usersFragment);

    void inject(AddUserFragment addUserFragment);

    void inject(UserPermissionsFragment userPermissionsFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
