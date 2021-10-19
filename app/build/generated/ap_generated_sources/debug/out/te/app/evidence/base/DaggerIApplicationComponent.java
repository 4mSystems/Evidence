package te.app.evidence.base;

import androidx.lifecycle.MutableLiveData;
import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.activity.MainActivity_MembersInjector;
import te.app.evidence.activity.SupportActivity;
import te.app.evidence.connection.Api;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.connection.ConnectionHelper_Factory;
import te.app.evidence.connection.ConnectionModule;
import te.app.evidence.connection.ConnectionModule_WebServiceFactory;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.AddAttachmentFragment;
import te.app.evidence.pages.attachments.AddAttachmentFragment_MembersInjector;
import te.app.evidence.pages.attachments.AttachmentsFragment;
import te.app.evidence.pages.attachments.AttachmentsFragment_MembersInjector;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel_Factory;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel_MembersInjector;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel_Factory;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel_MembersInjector;
import te.app.evidence.pages.auth.changePassword.ChangePasswordFragment;
import te.app.evidence.pages.auth.changePassword.ChangePasswordFragment_MembersInjector;
import te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel;
import te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel_Factory;
import te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel_MembersInjector;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment_MembersInjector;
import te.app.evidence.pages.auth.confirmCode.ConfirmViewModel;
import te.app.evidence.pages.auth.confirmCode.ConfirmViewModel_Factory;
import te.app.evidence.pages.auth.confirmCode.ConfirmViewModel_MembersInjector;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment_MembersInjector;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel_Factory;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordViewModel_MembersInjector;
import te.app.evidence.pages.auth.login.LoginFragment;
import te.app.evidence.pages.auth.login.LoginFragment_MembersInjector;
import te.app.evidence.pages.auth.login.LoginViewModel;
import te.app.evidence.pages.auth.login.LoginViewModel_Factory;
import te.app.evidence.pages.auth.login.LoginViewModel_MembersInjector;
import te.app.evidence.pages.auth.register.RegisterFragment;
import te.app.evidence.pages.auth.register.RegisterFragment_MembersInjector;
import te.app.evidence.pages.auth.register.RegisterViewModel;
import te.app.evidence.pages.auth.register.RegisterViewModel_Factory;
import te.app.evidence.pages.auth.register.RegisterViewModel_MembersInjector;
import te.app.evidence.pages.cases.AddCaseFragment;
import te.app.evidence.pages.cases.AddCaseFragment_MembersInjector;
import te.app.evidence.pages.cases.AddClientToCaseFragment;
import te.app.evidence.pages.cases.AddClientToCaseFragment_MembersInjector;
import te.app.evidence.pages.cases.CaseClientsFragment;
import te.app.evidence.pages.cases.CaseClientsFragment_MembersInjector;
import te.app.evidence.pages.cases.CaseDetailsFragment;
import te.app.evidence.pages.cases.CaseDetailsFragment_MembersInjector;
import te.app.evidence.pages.cases.CasesFragment;
import te.app.evidence.pages.cases.CasesFragment_MembersInjector;
import te.app.evidence.pages.cases.EditCaseFragment;
import te.app.evidence.pages.cases.EditCaseFragment_MembersInjector;
import te.app.evidence.pages.cases.SearchClientsFragment;
import te.app.evidence.pages.cases.SearchClientsFragment_MembersInjector;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel_Factory;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel_MembersInjector;
import te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel;
import te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel_Factory;
import te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel_MembersInjector;
import te.app.evidence.pages.cases.viewModels.CaseClientsViewModel;
import te.app.evidence.pages.cases.viewModels.CaseClientsViewModel_Factory;
import te.app.evidence.pages.cases.viewModels.CaseClientsViewModel_MembersInjector;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;
import te.app.evidence.pages.cases.viewModels.CasesViewModel_Factory;
import te.app.evidence.pages.cases.viewModels.CasesViewModel_MembersInjector;
import te.app.evidence.pages.cases.viewModels.SearchClientsViewModel;
import te.app.evidence.pages.cases.viewModels.SearchClientsViewModel_Factory;
import te.app.evidence.pages.cases.viewModels.SearchClientsViewModel_MembersInjector;
import te.app.evidence.pages.categories.AddCategoryFragment;
import te.app.evidence.pages.categories.AddCategoryFragment_MembersInjector;
import te.app.evidence.pages.categories.CategoriesFragment;
import te.app.evidence.pages.categories.CategoriesFragment_MembersInjector;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel_Factory;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel_MembersInjector;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel_Factory;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel_MembersInjector;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.AddClientFragment_MembersInjector;
import te.app.evidence.pages.clients.ClientProfileFragment;
import te.app.evidence.pages.clients.ClientProfileFragment_MembersInjector;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.pages.clients.ClientsFragment_MembersInjector;
import te.app.evidence.pages.clients.notes.AddNoteFragment;
import te.app.evidence.pages.clients.notes.AddNoteFragment_MembersInjector;
import te.app.evidence.pages.clients.notes.viewModels.AddNoteViewModel;
import te.app.evidence.pages.clients.notes.viewModels.AddNoteViewModel_Factory;
import te.app.evidence.pages.clients.notes.viewModels.AddNoteViewModel_MembersInjector;
import te.app.evidence.pages.clients.viewModels.AddClientViewModel;
import te.app.evidence.pages.clients.viewModels.AddClientViewModel_Factory;
import te.app.evidence.pages.clients.viewModels.AddClientViewModel_MembersInjector;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel_Factory;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel_MembersInjector;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel_Factory;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel_MembersInjector;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.pages.home.HomeFragment_MembersInjector;
import te.app.evidence.pages.home.MainHomeFragment;
import te.app.evidence.pages.home.MainHomeFragment_MembersInjector;
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.pages.home.viewModels.HomeViewModel_Factory;
import te.app.evidence.pages.home.viewModels.HomeViewModel_MembersInjector;
import te.app.evidence.pages.mohdrs.AddBailiffsFragment;
import te.app.evidence.pages.mohdrs.AddBailiffsFragment_MembersInjector;
import te.app.evidence.pages.mohdrs.BailiffsFragment;
import te.app.evidence.pages.mohdrs.BailiffsFragment_MembersInjector;
import te.app.evidence.pages.mohdrs.ReportersDetailsFragment;
import te.app.evidence.pages.mohdrs.ReportersDetailsFragment_MembersInjector;
import te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel;
import te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel_Factory;
import te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel_MembersInjector;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel_Factory;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel_MembersInjector;
import te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel;
import te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel_Factory;
import te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel_MembersInjector;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment_MembersInjector;
import te.app.evidence.pages.places.PlacesFragment;
import te.app.evidence.pages.places.PlacesFragment_MembersInjector;
import te.app.evidence.pages.places.viewModels.PlacesViewModel;
import te.app.evidence.pages.places.viewModels.PlacesViewModel_Factory;
import te.app.evidence.pages.places.viewModels.PlacesViewModel_MembersInjector;
import te.app.evidence.pages.points.PointsFragment;
import te.app.evidence.pages.points.PointsFragment_MembersInjector;
import te.app.evidence.pages.points.viewModels.PointsViewModel;
import te.app.evidence.pages.points.viewModels.PointsViewModel_Factory;
import te.app.evidence.pages.points.viewModels.PointsViewModel_MembersInjector;
import te.app.evidence.pages.profile.ProfileFragment;
import te.app.evidence.pages.profile.ProfileFragment_MembersInjector;
import te.app.evidence.pages.profile.ProfileViewModel;
import te.app.evidence.pages.profile.ProfileViewModel_Factory;
import te.app.evidence.pages.profile.ProfileViewModel_MembersInjector;
import te.app.evidence.pages.reports.DailyReportsFragment;
import te.app.evidence.pages.reports.DailyReportsFragment_MembersInjector;
import te.app.evidence.pages.reports.MonthlyReportsFragment;
import te.app.evidence.pages.reports.MonthlyReportsFragment_MembersInjector;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel_Factory;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel_MembersInjector;
import te.app.evidence.pages.services.AddServiceFragment;
import te.app.evidence.pages.services.AddServiceFragment_MembersInjector;
import te.app.evidence.pages.services.ServiceDetailsFragment;
import te.app.evidence.pages.services.ServiceDetailsFragment_MembersInjector;
import te.app.evidence.pages.services.ServicesFragment;
import te.app.evidence.pages.services.ServicesFragment_MembersInjector;
import te.app.evidence.pages.services.viewModels.ServicesViewModel;
import te.app.evidence.pages.services.viewModels.ServicesViewModel_Factory;
import te.app.evidence.pages.services.viewModels.ServicesViewModel_MembersInjector;
import te.app.evidence.pages.sessions.AddSessionFragment;
import te.app.evidence.pages.sessions.AddSessionFragment_MembersInjector;
import te.app.evidence.pages.sessions.SessionNotesFragment;
import te.app.evidence.pages.sessions.SessionNotesFragment_MembersInjector;
import te.app.evidence.pages.sessions.SessionsFragment;
import te.app.evidence.pages.sessions.SessionsFragment_MembersInjector;
import te.app.evidence.pages.sessions.viewModels.AddSessionViewModel;
import te.app.evidence.pages.sessions.viewModels.AddSessionViewModel_Factory;
import te.app.evidence.pages.sessions.viewModels.AddSessionViewModel_MembersInjector;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel_Factory;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel_MembersInjector;
import te.app.evidence.pages.sessions.viewModels.SessionsViewModel;
import te.app.evidence.pages.sessions.viewModels.SessionsViewModel_Factory;
import te.app.evidence.pages.sessions.viewModels.SessionsViewModel_MembersInjector;
import te.app.evidence.pages.settings.ContactUsFragment;
import te.app.evidence.pages.settings.ContactUsFragment_MembersInjector;
import te.app.evidence.pages.settings.PackagesFragment;
import te.app.evidence.pages.settings.PackagesFragment_MembersInjector;
import te.app.evidence.pages.settings.viewModels.SettingsViewModel;
import te.app.evidence.pages.settings.viewModels.SettingsViewModel_Factory;
import te.app.evidence.pages.settings.viewModels.SettingsViewModel_MembersInjector;
import te.app.evidence.pages.splash.SplashFragment;
import te.app.evidence.pages.splash.SplashFragment_MembersInjector;
import te.app.evidence.pages.splash.SplashViewModel;
import te.app.evidence.pages.splash.SplashViewModel_Factory;
import te.app.evidence.pages.splash.SplashViewModel_MembersInjector;
import te.app.evidence.pages.users.AddUserFragment;
import te.app.evidence.pages.users.AddUserFragment_MembersInjector;
import te.app.evidence.pages.users.UserPermissionsFragment;
import te.app.evidence.pages.users.UserPermissionsFragment_MembersInjector;
import te.app.evidence.pages.users.UsersFragment;
import te.app.evidence.pages.users.UsersFragment_MembersInjector;
import te.app.evidence.pages.users.viewModels.AddUserViewModel;
import te.app.evidence.pages.users.viewModels.AddUserViewModel_Factory;
import te.app.evidence.pages.users.viewModels.AddUserViewModel_MembersInjector;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel_Factory;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel_MembersInjector;
import te.app.evidence.pages.users.viewModels.UsersViewModel;
import te.app.evidence.pages.users.viewModels.UsersViewModel_Factory;
import te.app.evidence.pages.users.viewModels.UsersViewModel_MembersInjector;
import te.app.evidence.repository.AttachmentsRepository;
import te.app.evidence.repository.AttachmentsRepository_Factory;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.repository.AuthRepository_Factory;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.repository.CasesRepository_Factory;
import te.app.evidence.repository.CategoriesRepository;
import te.app.evidence.repository.CategoriesRepository_Factory;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.repository.ClientsRepository_Factory;
import te.app.evidence.repository.HomeRepository;
import te.app.evidence.repository.HomeRepository_Factory;
import te.app.evidence.repository.NotesRepository;
import te.app.evidence.repository.NotesRepository_Factory;
import te.app.evidence.repository.ReportsRepository;
import te.app.evidence.repository.ReportsRepository_Factory;
import te.app.evidence.repository.SettingsRepository;
import te.app.evidence.repository.SettingsRepository_Factory;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.repository.SystemUsersRepository_Factory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<MutableLiveData<Mutable>> getMutableLiveDataProvider;

  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private Provider<HomeRepository> homeRepositoryProvider;

  private Provider<CasesRepository> casesRepositoryProvider;

  private Provider<SystemUsersRepository> systemUsersRepositoryProvider;

  private Provider<ClientsRepository> clientsRepositoryProvider;

  private Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  private Provider<CategoriesRepository> categoriesRepositoryProvider;

  private Provider<NotesRepository> notesRepositoryProvider;

  private Provider<ReportsRepository> reportsRepositoryProvider;

  private Provider<SettingsRepository> settingsRepositoryProvider;

  private DaggerIApplicationComponent(ConnectionModule connectionModuleParam,
      LiveData liveDataParam) {

    initialize(connectionModuleParam, liveDataParam);
  }

  public static IApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static IApplicationComponent create() {
    return new Builder().build();
  }

  private SplashViewModel splashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private LoginViewModel loginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private RegisterViewModel registerViewModel() {
    return injectRegisterViewModel(RegisterViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ForgetPasswordViewModel forgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ConfirmViewModel confirmViewModel() {
    return injectConfirmViewModel(ConfirmViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ChangePasswordViewModel changePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ProfileViewModel profileViewModel() {
    return injectProfileViewModel(ProfileViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private HomeViewModel homeViewModel() {
    return injectHomeViewModel(HomeViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private ReportersDetailsViewModel reportersDetailsViewModel() {
    return injectReportersDetailsViewModel(ReportersDetailsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private UsersViewModel usersViewModel() {
    return injectUsersViewModel(UsersViewModel_Factory.newInstance(systemUsersRepositoryProvider.get()));
  }

  private AddUserViewModel addUserViewModel() {
    return injectAddUserViewModel(AddUserViewModel_Factory.newInstance(systemUsersRepositoryProvider.get()));
  }

  private UserPermissionsViewModel userPermissionsViewModel() {
    return injectUserPermissionsViewModel(UserPermissionsViewModel_Factory.newInstance(systemUsersRepositoryProvider.get()));
  }

  private ClientsViewModel clientsViewModel() {
    return injectClientsViewModel(ClientsViewModel_Factory.newInstance(clientsRepositoryProvider.get()));
  }

  private AddClientViewModel addClientViewModel() {
    return injectAddClientViewModel(AddClientViewModel_Factory.newInstance(clientsRepositoryProvider.get()));
  }

  private ClientProfileViewModel clientProfileViewModel() {
    return injectClientProfileViewModel(ClientProfileViewModel_Factory.newInstance(clientsRepositoryProvider.get()));
  }

  private AttachmentsViewModel attachmentsViewModel() {
    return injectAttachmentsViewModel(AttachmentsViewModel_Factory.newInstance(attachmentsRepositoryProvider.get()));
  }

  private AddAttachmentViewModel addAttachmentViewModel() {
    return injectAddAttachmentViewModel(AddAttachmentViewModel_Factory.newInstance(attachmentsRepositoryProvider.get()));
  }

  private CategoriesViewModel categoriesViewModel() {
    return injectCategoriesViewModel(CategoriesViewModel_Factory.newInstance(categoriesRepositoryProvider.get()));
  }

  private AddCategoriesViewModel addCategoriesViewModel() {
    return injectAddCategoriesViewModel(AddCategoriesViewModel_Factory.newInstance(categoriesRepositoryProvider.get()));
  }

  private BailiffsViewModel bailiffsViewModel() {
    return injectBailiffsViewModel(BailiffsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private AddBailiffsViewModel addBailiffsViewModel() {
    return injectAddBailiffsViewModel(AddBailiffsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private AddNoteViewModel addNoteViewModel() {
    return injectAddNoteViewModel(AddNoteViewModel_Factory.newInstance(notesRepositoryProvider.get()));
  }

  private AddCaseViewModel addCaseViewModel() {
    return injectAddCaseViewModel(AddCaseViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private SearchClientsViewModel searchClientsViewModel() {
    return injectSearchClientsViewModel(SearchClientsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private CasesViewModel casesViewModel() {
    return injectCasesViewModel(CasesViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private AddClientToCaseViewModel addClientToCaseViewModel() {
    return injectAddClientToCaseViewModel(AddClientToCaseViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private CaseClientsViewModel caseClientsViewModel() {
    return injectCaseClientsViewModel(CaseClientsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private SessionsViewModel sessionsViewModel() {
    return injectSessionsViewModel(SessionsViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private AddSessionViewModel addSessionViewModel() {
    return injectAddSessionViewModel(AddSessionViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private SessionNotesViewModel sessionNotesViewModel() {
    return injectSessionNotesViewModel(SessionNotesViewModel_Factory.newInstance(casesRepositoryProvider.get()));
  }

  private ReportsViewModel reportsViewModel() {
    return injectReportsViewModel(ReportsViewModel_Factory.newInstance(reportsRepositoryProvider.get()));
  }

  private SettingsViewModel settingsViewModel() {
    return injectSettingsViewModel(SettingsViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  private PointsViewModel pointsViewModel() {
    return injectPointsViewModel(PointsViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  private PlacesViewModel placesViewModel() {
    return injectPlacesViewModel(PlacesViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  private ServicesViewModel servicesViewModel() {
    return injectServicesViewModel(ServicesViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam,
      final LiveData liveDataParam) {
    this.getMutableLiveDataProvider = DoubleCheck.provider(LiveData_GetMutableLiveDataFactory.create(liveDataParam));
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.homeRepositoryProvider = DoubleCheck.provider(HomeRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.casesRepositoryProvider = DoubleCheck.provider(CasesRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.systemUsersRepositoryProvider = DoubleCheck.provider(SystemUsersRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.clientsRepositoryProvider = DoubleCheck.provider(ClientsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.attachmentsRepositoryProvider = DoubleCheck.provider(AttachmentsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.categoriesRepositoryProvider = DoubleCheck.provider(CategoriesRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.notesRepositoryProvider = DoubleCheck.provider(NotesRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.reportsRepositoryProvider = DoubleCheck.provider(ReportsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.settingsRepositoryProvider = DoubleCheck.provider(SettingsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(SupportActivity supportActivity) {
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);
  }

  @Override
  public void inject(OnBoardFragment onBoardFragment) {
    injectOnBoardFragment(onBoardFragment);
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);
  }

  @Override
  public void inject(RegisterFragment registerFragment) {
    injectRegisterFragment(registerFragment);
  }

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);
  }

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);
  }

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);
  }

  @Override
  public void inject(ProfileFragment profileFragment) {
    injectProfileFragment(profileFragment);
  }

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);
  }

  @Override
  public void inject(ReportersDetailsFragment reportersDetailsFragment) {
    injectReportersDetailsFragment(reportersDetailsFragment);
  }

  @Override
  public void inject(UsersFragment usersFragment) {
    injectUsersFragment(usersFragment);
  }

  @Override
  public void inject(AddUserFragment addUserFragment) {
    injectAddUserFragment(addUserFragment);
  }

  @Override
  public void inject(UserPermissionsFragment userPermissionsFragment) {
    injectUserPermissionsFragment(userPermissionsFragment);
  }

  @Override
  public void inject(ClientsFragment clientsFragment) {
    injectClientsFragment(clientsFragment);
  }

  @Override
  public void inject(AddClientFragment addClientFragment) {
    injectAddClientFragment(addClientFragment);
  }

  @Override
  public void inject(ClientProfileFragment clientProfileFragment) {
    injectClientProfileFragment(clientProfileFragment);
  }

  @Override
  public void inject(AttachmentsFragment attachmentsFragment) {
    injectAttachmentsFragment(attachmentsFragment);
  }

  @Override
  public void inject(AddAttachmentFragment addAttachmentFragment) {
    injectAddAttachmentFragment(addAttachmentFragment);
  }

  @Override
  public void inject(CategoriesFragment categoriesFragment) {
    injectCategoriesFragment(categoriesFragment);
  }

  @Override
  public void inject(AddCategoryFragment addCategoryFragment) {
    injectAddCategoryFragment(addCategoryFragment);
  }

  @Override
  public void inject(BailiffsFragment bailiffsFragment) {
    injectBailiffsFragment(bailiffsFragment);
  }

  @Override
  public void inject(AddBailiffsFragment addBailiffsFragment) {
    injectAddBailiffsFragment(addBailiffsFragment);
  }

  @Override
  public void inject(AddNoteFragment addNoteFragment) {
    injectAddNoteFragment(addNoteFragment);
  }

  @Override
  public void inject(AddCaseFragment addCaseFragment) {
    injectAddCaseFragment(addCaseFragment);
  }

  @Override
  public void inject(SearchClientsFragment searchClientsFragment) {
    injectSearchClientsFragment(searchClientsFragment);
  }

  @Override
  public void inject(CasesFragment casesFragment) {
    injectCasesFragment(casesFragment);
  }

  @Override
  public void inject(CaseDetailsFragment caseDetailsFragment) {
    injectCaseDetailsFragment(caseDetailsFragment);
  }

  @Override
  public void inject(AddClientToCaseFragment addClientToCaseFragment) {
    injectAddClientToCaseFragment(addClientToCaseFragment);
  }

  @Override
  public void inject(EditCaseFragment editCaseFragment) {
    injectEditCaseFragment(editCaseFragment);
  }

  @Override
  public void inject(CaseClientsFragment caseClientsFragment) {
    injectCaseClientsFragment(caseClientsFragment);
  }

  @Override
  public void inject(SessionsFragment sessionsFragment) {
    injectSessionsFragment(sessionsFragment);
  }

  @Override
  public void inject(AddSessionFragment addSessionFragment) {
    injectAddSessionFragment(addSessionFragment);
  }

  @Override
  public void inject(SessionNotesFragment sessionNotesFragment) {
    injectSessionNotesFragment(sessionNotesFragment);
  }

  @Override
  public void inject(DailyReportsFragment dailyReportsFragment) {
    injectDailyReportsFragment(dailyReportsFragment);
  }

  @Override
  public void inject(MonthlyReportsFragment monthlyReportsFragment) {
    injectMonthlyReportsFragment(monthlyReportsFragment);
  }

  @Override
  public void inject(ContactUsFragment contactUsFragment) {
    injectContactUsFragment(contactUsFragment);
  }

  @Override
  public void inject(PackagesFragment packagesFragment) {
    injectPackagesFragment(packagesFragment);
  }

  @Override
  public void inject(PointsFragment pointsFragment) {
    injectPointsFragment(pointsFragment);
  }

  @Override
  public void inject(PlacesFragment placesFragment) {
    injectPlacesFragment(placesFragment);
  }

  @Override
  public void inject(ServicesFragment servicesFragment) {
    injectServicesFragment(servicesFragment);
  }

  @Override
  public void inject(ServiceDetailsFragment serviceDetailsFragment) {
    injectServiceDetailsFragment(serviceDetailsFragment);
  }

  @Override
  public void inject(AddServiceFragment addServiceFragment) {
    injectAddServiceFragment(addServiceFragment);
  }

  @Override
  public void inject(MainHomeFragment mainHomeFragment) {
    injectMainHomeFragment(mainHomeFragment);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectLiveData(instance, getMutableLiveDataProvider.get());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    return instance;
  }

  private OnBoardFragment injectOnBoardFragment(OnBoardFragment instance) {
    OnBoardFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, loginViewModel());
    return instance;
  }

  private RegisterViewModel injectRegisterViewModel(RegisterViewModel instance) {
    RegisterViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
    RegisterFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, forgetPasswordViewModel());
    return instance;
  }

  private ConfirmViewModel injectConfirmViewModel(ConfirmViewModel instance) {
    ConfirmViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, confirmViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, changePasswordViewModel());
    return instance;
  }

  private ProfileViewModel injectProfileViewModel(ProfileViewModel instance) {
    ProfileViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ProfileFragment injectProfileFragment(ProfileFragment instance) {
    ProfileFragment_MembersInjector.injectViewModel(instance, profileViewModel());
    return instance;
  }

  private HomeViewModel injectHomeViewModel(HomeViewModel instance) {
    HomeViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private ReportersDetailsViewModel injectReportersDetailsViewModel(
      ReportersDetailsViewModel instance) {
    ReportersDetailsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private ReportersDetailsFragment injectReportersDetailsFragment(
      ReportersDetailsFragment instance) {
    ReportersDetailsFragment_MembersInjector.injectViewModel(instance, reportersDetailsViewModel());
    return instance;
  }

  private UsersViewModel injectUsersViewModel(UsersViewModel instance) {
    UsersViewModel_MembersInjector.injectUsersRepository(instance, systemUsersRepositoryProvider.get());
    return instance;
  }

  private UsersFragment injectUsersFragment(UsersFragment instance) {
    UsersFragment_MembersInjector.injectViewModel(instance, usersViewModel());
    return instance;
  }

  private AddUserViewModel injectAddUserViewModel(AddUserViewModel instance) {
    AddUserViewModel_MembersInjector.injectUsersRepository(instance, systemUsersRepositoryProvider.get());
    return instance;
  }

  private AddUserFragment injectAddUserFragment(AddUserFragment instance) {
    AddUserFragment_MembersInjector.injectViewModel(instance, addUserViewModel());
    return instance;
  }

  private UserPermissionsViewModel injectUserPermissionsViewModel(
      UserPermissionsViewModel instance) {
    UserPermissionsViewModel_MembersInjector.injectUsersRepository(instance, systemUsersRepositoryProvider.get());
    return instance;
  }

  private UserPermissionsFragment injectUserPermissionsFragment(UserPermissionsFragment instance) {
    UserPermissionsFragment_MembersInjector.injectViewModel(instance, userPermissionsViewModel());
    return instance;
  }

  private ClientsViewModel injectClientsViewModel(ClientsViewModel instance) {
    ClientsViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private ClientsFragment injectClientsFragment(ClientsFragment instance) {
    ClientsFragment_MembersInjector.injectViewModel(instance, clientsViewModel());
    return instance;
  }

  private AddClientViewModel injectAddClientViewModel(AddClientViewModel instance) {
    AddClientViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private AddClientFragment injectAddClientFragment(AddClientFragment instance) {
    AddClientFragment_MembersInjector.injectViewModel(instance, addClientViewModel());
    return instance;
  }

  private ClientProfileViewModel injectClientProfileViewModel(ClientProfileViewModel instance) {
    ClientProfileViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private ClientProfileFragment injectClientProfileFragment(ClientProfileFragment instance) {
    ClientProfileFragment_MembersInjector.injectViewModel(instance, clientProfileViewModel());
    return instance;
  }

  private AttachmentsViewModel injectAttachmentsViewModel(AttachmentsViewModel instance) {
    AttachmentsViewModel_MembersInjector.injectAttachmentsRepository(instance, attachmentsRepositoryProvider.get());
    return instance;
  }

  private AttachmentsFragment injectAttachmentsFragment(AttachmentsFragment instance) {
    AttachmentsFragment_MembersInjector.injectViewModel(instance, attachmentsViewModel());
    return instance;
  }

  private AddAttachmentViewModel injectAddAttachmentViewModel(AddAttachmentViewModel instance) {
    AddAttachmentViewModel_MembersInjector.injectAttachmentsRepository(instance, attachmentsRepositoryProvider.get());
    return instance;
  }

  private AddAttachmentFragment injectAddAttachmentFragment(AddAttachmentFragment instance) {
    AddAttachmentFragment_MembersInjector.injectViewModel(instance, addAttachmentViewModel());
    return instance;
  }

  private CategoriesViewModel injectCategoriesViewModel(CategoriesViewModel instance) {
    CategoriesViewModel_MembersInjector.injectCategoriesRepository(instance, categoriesRepositoryProvider.get());
    return instance;
  }

  private CategoriesFragment injectCategoriesFragment(CategoriesFragment instance) {
    CategoriesFragment_MembersInjector.injectViewModel(instance, categoriesViewModel());
    return instance;
  }

  private AddCategoriesViewModel injectAddCategoriesViewModel(AddCategoriesViewModel instance) {
    AddCategoriesViewModel_MembersInjector.injectCategoriesRepository(instance, categoriesRepositoryProvider.get());
    return instance;
  }

  private AddCategoryFragment injectAddCategoryFragment(AddCategoryFragment instance) {
    AddCategoryFragment_MembersInjector.injectViewModel(instance, addCategoriesViewModel());
    return instance;
  }

  private BailiffsViewModel injectBailiffsViewModel(BailiffsViewModel instance) {
    BailiffsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private BailiffsFragment injectBailiffsFragment(BailiffsFragment instance) {
    BailiffsFragment_MembersInjector.injectViewModel(instance, bailiffsViewModel());
    return instance;
  }

  private AddBailiffsViewModel injectAddBailiffsViewModel(AddBailiffsViewModel instance) {
    AddBailiffsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private AddBailiffsFragment injectAddBailiffsFragment(AddBailiffsFragment instance) {
    AddBailiffsFragment_MembersInjector.injectViewModel(instance, addBailiffsViewModel());
    return instance;
  }

  private AddNoteViewModel injectAddNoteViewModel(AddNoteViewModel instance) {
    AddNoteViewModel_MembersInjector.injectNotesRepository(instance, notesRepositoryProvider.get());
    return instance;
  }

  private AddNoteFragment injectAddNoteFragment(AddNoteFragment instance) {
    AddNoteFragment_MembersInjector.injectViewModel(instance, addNoteViewModel());
    return instance;
  }

  private AddCaseViewModel injectAddCaseViewModel(AddCaseViewModel instance) {
    AddCaseViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private AddCaseFragment injectAddCaseFragment(AddCaseFragment instance) {
    AddCaseFragment_MembersInjector.injectViewModel(instance, addCaseViewModel());
    return instance;
  }

  private SearchClientsViewModel injectSearchClientsViewModel(SearchClientsViewModel instance) {
    SearchClientsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private SearchClientsFragment injectSearchClientsFragment(SearchClientsFragment instance) {
    SearchClientsFragment_MembersInjector.injectViewModel(instance, searchClientsViewModel());
    return instance;
  }

  private CasesViewModel injectCasesViewModel(CasesViewModel instance) {
    CasesViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private CasesFragment injectCasesFragment(CasesFragment instance) {
    CasesFragment_MembersInjector.injectViewModel(instance, casesViewModel());
    return instance;
  }

  private CaseDetailsFragment injectCaseDetailsFragment(CaseDetailsFragment instance) {
    CaseDetailsFragment_MembersInjector.injectViewModel(instance, casesViewModel());
    return instance;
  }

  private AddClientToCaseViewModel injectAddClientToCaseViewModel(
      AddClientToCaseViewModel instance) {
    AddClientToCaseViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private AddClientToCaseFragment injectAddClientToCaseFragment(AddClientToCaseFragment instance) {
    AddClientToCaseFragment_MembersInjector.injectViewModel(instance, addClientToCaseViewModel());
    return instance;
  }

  private EditCaseFragment injectEditCaseFragment(EditCaseFragment instance) {
    EditCaseFragment_MembersInjector.injectViewModel(instance, addCaseViewModel());
    return instance;
  }

  private CaseClientsViewModel injectCaseClientsViewModel(CaseClientsViewModel instance) {
    CaseClientsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private CaseClientsFragment injectCaseClientsFragment(CaseClientsFragment instance) {
    CaseClientsFragment_MembersInjector.injectViewModel(instance, caseClientsViewModel());
    return instance;
  }

  private SessionsViewModel injectSessionsViewModel(SessionsViewModel instance) {
    SessionsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private SessionsFragment injectSessionsFragment(SessionsFragment instance) {
    SessionsFragment_MembersInjector.injectViewModel(instance, sessionsViewModel());
    return instance;
  }

  private AddSessionViewModel injectAddSessionViewModel(AddSessionViewModel instance) {
    AddSessionViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private AddSessionFragment injectAddSessionFragment(AddSessionFragment instance) {
    AddSessionFragment_MembersInjector.injectViewModel(instance, addSessionViewModel());
    return instance;
  }

  private SessionNotesViewModel injectSessionNotesViewModel(SessionNotesViewModel instance) {
    SessionNotesViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider.get());
    return instance;
  }

  private SessionNotesFragment injectSessionNotesFragment(SessionNotesFragment instance) {
    SessionNotesFragment_MembersInjector.injectViewModel(instance, sessionNotesViewModel());
    return instance;
  }

  private ReportsViewModel injectReportsViewModel(ReportsViewModel instance) {
    ReportsViewModel_MembersInjector.injectReportsRepository(instance, reportsRepositoryProvider.get());
    return instance;
  }

  private DailyReportsFragment injectDailyReportsFragment(DailyReportsFragment instance) {
    DailyReportsFragment_MembersInjector.injectViewModel(instance, reportsViewModel());
    return instance;
  }

  private MonthlyReportsFragment injectMonthlyReportsFragment(MonthlyReportsFragment instance) {
    MonthlyReportsFragment_MembersInjector.injectViewModel(instance, reportsViewModel());
    return instance;
  }

  private SettingsViewModel injectSettingsViewModel(SettingsViewModel instance) {
    SettingsViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private ContactUsFragment injectContactUsFragment(ContactUsFragment instance) {
    ContactUsFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private PackagesFragment injectPackagesFragment(PackagesFragment instance) {
    PackagesFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private PointsViewModel injectPointsViewModel(PointsViewModel instance) {
    PointsViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private PointsFragment injectPointsFragment(PointsFragment instance) {
    PointsFragment_MembersInjector.injectViewModel(instance, pointsViewModel());
    return instance;
  }

  private PlacesViewModel injectPlacesViewModel(PlacesViewModel instance) {
    PlacesViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private PlacesFragment injectPlacesFragment(PlacesFragment instance) {
    PlacesFragment_MembersInjector.injectViewModel(instance, placesViewModel());
    return instance;
  }

  private ServicesViewModel injectServicesViewModel(ServicesViewModel instance) {
    ServicesViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private ServicesFragment injectServicesFragment(ServicesFragment instance) {
    ServicesFragment_MembersInjector.injectViewModel(instance, servicesViewModel());
    return instance;
  }

  private ServiceDetailsFragment injectServiceDetailsFragment(ServiceDetailsFragment instance) {
    ServiceDetailsFragment_MembersInjector.injectViewModel(instance, servicesViewModel());
    return instance;
  }

  private AddServiceFragment injectAddServiceFragment(AddServiceFragment instance) {
    AddServiceFragment_MembersInjector.injectViewModel(instance, servicesViewModel());
    return instance;
  }

  private MainHomeFragment injectMainHomeFragment(MainHomeFragment instance) {
    MainHomeFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule(), new LiveData());
    }
  }
}
