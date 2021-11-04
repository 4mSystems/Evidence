package te.app.evidence.base;

import javax.inject.Singleton;

import dagger.Component;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.activity.SupportActivity;
import te.app.evidence.connection.ConnectionModule;
import te.app.evidence.pages.home.MainHomeFragment;
import te.app.evidence.pages.places.PlacesFragment;
import te.app.evidence.pages.attachments.AddAttachmentFragment;
import te.app.evidence.pages.attachments.AttachmentsFragment;
import te.app.evidence.pages.auth.changePassword.ChangePasswordFragment;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.evidence.pages.auth.login.LoginFragment;
import te.app.evidence.pages.auth.register.RegisterFragment;
import te.app.evidence.pages.cases.AddCaseFragment;
import te.app.evidence.pages.cases.AddClientToCaseFragment;
import te.app.evidence.pages.cases.CaseClientsFragment;
import te.app.evidence.pages.cases.CaseDetailsFragment;
import te.app.evidence.pages.cases.CasesFragment;
import te.app.evidence.pages.cases.EditCaseFragment;
import te.app.evidence.pages.cases.SearchClientsFragment;
import te.app.evidence.pages.categories.AddCategoryFragment;
import te.app.evidence.pages.categories.CategoriesFragment;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.ClientProfileFragment;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.pages.mohdrs.AddBailiffsFragment;
import te.app.evidence.pages.mohdrs.BailiffsFragment;
import te.app.evidence.pages.mohdrs.ReportersDetailsFragment;
import te.app.evidence.pages.clients.notes.AddNoteFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.pages.points.PointsFragment;
import te.app.evidence.pages.profile.ProfileFragment;
import te.app.evidence.pages.publicFiles.PublicFilesFragment;
import te.app.evidence.pages.reports.DailyReportsFragment;
import te.app.evidence.pages.reports.MonthlyReportsFragment;
import te.app.evidence.pages.services.AddServiceFragment;
import te.app.evidence.pages.services.ServiceDetailsFragment;
import te.app.evidence.pages.services.ServicesFragment;
import te.app.evidence.pages.sessions.AddSessionFragment;
import te.app.evidence.pages.sessions.SessionNotesFragment;
import te.app.evidence.pages.sessions.SessionsFragment;
import te.app.evidence.pages.settings.ContactUsFragment;
import te.app.evidence.pages.settings.PackagesFragment;
import te.app.evidence.pages.splash.SplashFragment;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.pages.users.UserPermissionsFragment;
import te.app.evidence.pages.users.UsersFragment;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SupportActivity supportActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);

    void inject(LoginFragment loginFragment);

    void inject(RegisterFragment registerFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(ProfileFragment profileFragment);

    void inject(HomeFragment homeFragment);

    void inject(ReportersDetailsFragment reportersDetailsFragment);

    void inject(UsersFragment usersFragment);

    void inject(AddUserFragment addUserFragment);

    void inject(UserPermissionsFragment userPermissionsFragment);

    void inject(ClientsFragment clientsFragment);

    void inject(AddClientFragment addClientFragment);

    void inject(ClientProfileFragment clientProfileFragment);

    void inject(AttachmentsFragment attachmentsFragment);

    void inject(AddAttachmentFragment addAttachmentFragment);

    void inject(CategoriesFragment categoriesFragment);

    void inject(AddCategoryFragment addCategoryFragment);

    void inject(BailiffsFragment bailiffsFragment);

    void inject(AddBailiffsFragment addBailiffsFragment);

    void inject(AddNoteFragment addNoteFragment);

    void inject(AddCaseFragment addCaseFragment);

    void inject(SearchClientsFragment searchClientsFragment);

    void inject(CasesFragment casesFragment);

    void inject(CaseDetailsFragment caseDetailsFragment);

    void inject(AddClientToCaseFragment addClientToCaseFragment);

    void inject(EditCaseFragment editCaseFragment);

    void inject(CaseClientsFragment caseClientsFragment);

    void inject(SessionsFragment sessionsFragment);

    void inject(AddSessionFragment addSessionFragment);

    void inject(SessionNotesFragment sessionNotesFragment);

    void inject(DailyReportsFragment dailyReportsFragment);

    void inject(MonthlyReportsFragment monthlyReportsFragment);

    void inject(ContactUsFragment contactUsFragment);

    void inject(PackagesFragment packagesFragment);

    void inject(PointsFragment pointsFragment);

    void inject(PlacesFragment placesFragment);

    void inject(ServicesFragment servicesFragment);

    void inject(ServiceDetailsFragment serviceDetailsFragment);

    void inject(AddServiceFragment addServiceFragment);

    void inject(MainHomeFragment mainHomeFragment);

    void inject(PublicFilesFragment publicFilesFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
