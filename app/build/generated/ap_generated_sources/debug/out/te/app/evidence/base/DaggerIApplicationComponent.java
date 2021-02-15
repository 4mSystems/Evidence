// Generated by Dagger (https://dagger.dev).
package te.app.evidence.base;

import androidx.lifecycle.MutableLiveData;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.activity.MainActivity_MembersInjector;
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
import te.app.evidence.pages.categories.AddCategoryFragment;
import te.app.evidence.pages.categories.AddCategoryFragment_MembersInjector;
import te.app.evidence.pages.categories.CategoriesFragment;
import te.app.evidence.pages.categories.CategoriesFragment_MembersInjector;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.AddClientFragment_MembersInjector;
import te.app.evidence.pages.clients.ClientProfileFragment;
import te.app.evidence.pages.clients.ClientProfileFragment_MembersInjector;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.pages.clients.ClientsFragment_MembersInjector;
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
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.pages.mohdrs.AddBailiffsFragment;
import te.app.evidence.pages.mohdrs.AddBailiffsFragment_MembersInjector;
import te.app.evidence.pages.mohdrs.BailiffsFragment;
import te.app.evidence.pages.mohdrs.BailiffsFragment_MembersInjector;
import te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel;
import te.app.evidence.pages.notes.AddNoteFragment;
import te.app.evidence.pages.notes.AddNoteFragment_MembersInjector;
import te.app.evidence.pages.notes.viewModels.AddNoteViewModel;
import te.app.evidence.pages.notes.viewModels.AddNoteViewModel_Factory;
import te.app.evidence.pages.notes.viewModels.AddNoteViewModel_MembersInjector;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment_MembersInjector;
import te.app.evidence.pages.profile.ProfileFragment;
import te.app.evidence.pages.profile.ProfileFragment_MembersInjector;
import te.app.evidence.pages.profile.ProfileViewModel;
import te.app.evidence.pages.profile.ProfileViewModel_Factory;
import te.app.evidence.pages.profile.ProfileViewModel_MembersInjector;
import te.app.evidence.pages.reporters.ReportersDetailsFragment;
import te.app.evidence.pages.reporters.ReportersDetailsFragment_MembersInjector;
import te.app.evidence.pages.reporters.viewModels.ReportersDetailsViewModel;
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
import te.app.evidence.pages.users.viewModels.UsersViewModel;
import te.app.evidence.pages.users.viewModels.UsersViewModel_Factory;
import te.app.evidence.pages.users.viewModels.UsersViewModel_MembersInjector;
import te.app.evidence.repository.AttachmentsRepository;
import te.app.evidence.repository.AttachmentsRepository_Factory;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.repository.AuthRepository_Factory;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.repository.ClientsRepository_Factory;
import te.app.evidence.repository.NotesRepository;
import te.app.evidence.repository.NotesRepository_Factory;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.repository.SystemUsersRepository_Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<MutableLiveData<Mutable>> getMutableLiveDataProvider;

  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private Provider<SystemUsersRepository> systemUsersRepositoryProvider;

  private Provider<ClientsRepository> clientsRepositoryProvider;

  private Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  private Provider<NotesRepository> notesRepositoryProvider;

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

  private SplashViewModel getSplashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private LoginViewModel getLoginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private ForgetPasswordViewModel getForgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private ConfirmViewModel getConfirmViewModel() {
    return injectConfirmViewModel(ConfirmViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private ChangePasswordViewModel getChangePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private ProfileViewModel getProfileViewModel() {
    return injectProfileViewModel(ProfileViewModel_Factory.newInstance(authRepositoryProvider.get()));}

  private UsersViewModel getUsersViewModel() {
    return injectUsersViewModel(UsersViewModel_Factory.newInstance(systemUsersRepositoryProvider.get()));}

  private AddUserViewModel getAddUserViewModel() {
    return injectAddUserViewModel(AddUserViewModel_Factory.newInstance(systemUsersRepositoryProvider.get()));}

  private ClientsViewModel getClientsViewModel() {
    return injectClientsViewModel(ClientsViewModel_Factory.newInstance(clientsRepositoryProvider.get()));}

  private AddClientViewModel getAddClientViewModel() {
    return injectAddClientViewModel(AddClientViewModel_Factory.newInstance(clientsRepositoryProvider.get()));}

  private ClientProfileViewModel getClientProfileViewModel() {
    return injectClientProfileViewModel(ClientProfileViewModel_Factory.newInstance(clientsRepositoryProvider.get()));}

  private AttachmentsViewModel getAttachmentsViewModel() {
    return injectAttachmentsViewModel(AttachmentsViewModel_Factory.newInstance(attachmentsRepositoryProvider.get()));}

  private AddNoteViewModel getAddNoteViewModel() {
    return injectAddNoteViewModel(AddNoteViewModel_Factory.newInstance(notesRepositoryProvider.get()));}

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam,
      final LiveData liveDataParam) {
    this.getMutableLiveDataProvider = DoubleCheck.provider(LiveData_GetMutableLiveDataFactory.create(liveDataParam));
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.systemUsersRepositoryProvider = DoubleCheck.provider(SystemUsersRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.clientsRepositoryProvider = DoubleCheck.provider(ClientsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.attachmentsRepositoryProvider = DoubleCheck.provider(AttachmentsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.notesRepositoryProvider = DoubleCheck.provider(NotesRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);}

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);}

  @Override
  public void inject(OnBoardFragment onBoardFragment) {
    injectOnBoardFragment(onBoardFragment);}

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);}

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);}

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);}

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);}

  @Override
  public void inject(ProfileFragment profileFragment) {
    injectProfileFragment(profileFragment);}

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);}

  @Override
  public void inject(ReportersDetailsFragment reportersDetailsFragment) {
    injectReportersDetailsFragment(reportersDetailsFragment);}

  @Override
  public void inject(UsersFragment usersFragment) {
    injectUsersFragment(usersFragment);}

  @Override
  public void inject(AddUserFragment addUserFragment) {
    injectAddUserFragment(addUserFragment);}

  @Override
  public void inject(UserPermissionsFragment userPermissionsFragment) {
    injectUserPermissionsFragment(userPermissionsFragment);}

  @Override
  public void inject(ClientsFragment clientsFragment) {
    injectClientsFragment(clientsFragment);}

  @Override
  public void inject(AddClientFragment addClientFragment) {
    injectAddClientFragment(addClientFragment);}

  @Override
  public void inject(ClientProfileFragment clientProfileFragment) {
    injectClientProfileFragment(clientProfileFragment);}

  @Override
  public void inject(AttachmentsFragment attachmentsFragment) {
    injectAttachmentsFragment(attachmentsFragment);}

  @Override
  public void inject(AddAttachmentFragment addAttachmentFragment) {
    injectAddAttachmentFragment(addAttachmentFragment);}

  @Override
  public void inject(CategoriesFragment categoriesFragment) {
    injectCategoriesFragment(categoriesFragment);}

  @Override
  public void inject(AddCategoryFragment addCategoryFragment) {
    injectAddCategoryFragment(addCategoryFragment);}

  @Override
  public void inject(BailiffsFragment bailiffsFragment) {
    injectBailiffsFragment(bailiffsFragment);}

  @Override
  public void inject(AddBailiffsFragment addBailiffsFragment) {
    injectAddBailiffsFragment(addBailiffsFragment);}

  @Override
  public void inject(AddNoteFragment addNoteFragment) {
    injectAddNoteFragment(addNoteFragment);}

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectLiveData(instance, getMutableLiveDataProvider.get());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, getSplashViewModel());
    return instance;
  }

  private OnBoardFragment injectOnBoardFragment(OnBoardFragment instance) {
    OnBoardFragment_MembersInjector.injectViewModel(instance, getSplashViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, getLoginViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, getForgetPasswordViewModel());
    return instance;
  }

  private ConfirmViewModel injectConfirmViewModel(ConfirmViewModel instance) {
    ConfirmViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, getConfirmViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, getChangePasswordViewModel());
    return instance;
  }

  private ProfileViewModel injectProfileViewModel(ProfileViewModel instance) {
    ProfileViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ProfileFragment injectProfileFragment(ProfileFragment instance) {
    ProfileFragment_MembersInjector.injectViewModel(instance, getProfileViewModel());
    return instance;
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModel(instance, new HomeViewModel());
    return instance;
  }

  private ReportersDetailsFragment injectReportersDetailsFragment(
      ReportersDetailsFragment instance) {
    ReportersDetailsFragment_MembersInjector.injectViewModel(instance, new ReportersDetailsViewModel());
    return instance;
  }

  private UsersViewModel injectUsersViewModel(UsersViewModel instance) {
    UsersViewModel_MembersInjector.injectUsersRepository(instance, systemUsersRepositoryProvider.get());
    return instance;
  }

  private UsersFragment injectUsersFragment(UsersFragment instance) {
    UsersFragment_MembersInjector.injectViewModel(instance, getUsersViewModel());
    return instance;
  }

  private AddUserViewModel injectAddUserViewModel(AddUserViewModel instance) {
    AddUserViewModel_MembersInjector.injectUsersRepository(instance, systemUsersRepositoryProvider.get());
    return instance;
  }

  private AddUserFragment injectAddUserFragment(AddUserFragment instance) {
    AddUserFragment_MembersInjector.injectViewModel(instance, getAddUserViewModel());
    return instance;
  }

  private UserPermissionsFragment injectUserPermissionsFragment(UserPermissionsFragment instance) {
    UserPermissionsFragment_MembersInjector.injectViewModel(instance, new UserPermissionsViewModel());
    return instance;
  }

  private ClientsViewModel injectClientsViewModel(ClientsViewModel instance) {
    ClientsViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private ClientsFragment injectClientsFragment(ClientsFragment instance) {
    ClientsFragment_MembersInjector.injectViewModel(instance, getClientsViewModel());
    return instance;
  }

  private AddClientViewModel injectAddClientViewModel(AddClientViewModel instance) {
    AddClientViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private AddClientFragment injectAddClientFragment(AddClientFragment instance) {
    AddClientFragment_MembersInjector.injectViewModel(instance, getAddClientViewModel());
    return instance;
  }

  private ClientProfileViewModel injectClientProfileViewModel(ClientProfileViewModel instance) {
    ClientProfileViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider.get());
    return instance;
  }

  private ClientProfileFragment injectClientProfileFragment(ClientProfileFragment instance) {
    ClientProfileFragment_MembersInjector.injectViewModel(instance, getClientProfileViewModel());
    return instance;
  }

  private AttachmentsViewModel injectAttachmentsViewModel(AttachmentsViewModel instance) {
    AttachmentsViewModel_MembersInjector.injectAttachmentsRepository(instance, attachmentsRepositoryProvider.get());
    return instance;
  }

  private AttachmentsFragment injectAttachmentsFragment(AttachmentsFragment instance) {
    AttachmentsFragment_MembersInjector.injectViewModel(instance, getAttachmentsViewModel());
    return instance;
  }

  private AddAttachmentFragment injectAddAttachmentFragment(AddAttachmentFragment instance) {
    AddAttachmentFragment_MembersInjector.injectViewModel(instance, new AddAttachmentViewModel());
    return instance;
  }

  private CategoriesFragment injectCategoriesFragment(CategoriesFragment instance) {
    CategoriesFragment_MembersInjector.injectViewModel(instance, new CategoriesViewModel());
    return instance;
  }

  private AddCategoryFragment injectAddCategoryFragment(AddCategoryFragment instance) {
    AddCategoryFragment_MembersInjector.injectViewModel(instance, new AddCategoriesViewModel());
    return instance;
  }

  private BailiffsFragment injectBailiffsFragment(BailiffsFragment instance) {
    BailiffsFragment_MembersInjector.injectViewModel(instance, new BailiffsViewModel());
    return instance;
  }

  private AddBailiffsFragment injectAddBailiffsFragment(AddBailiffsFragment instance) {
    AddBailiffsFragment_MembersInjector.injectViewModel(instance, new AddBailiffsViewModel());
    return instance;
  }

  private AddNoteViewModel injectAddNoteViewModel(AddNoteViewModel instance) {
    AddNoteViewModel_MembersInjector.injectNotesRepository(instance, notesRepositoryProvider.get());
    return instance;
  }

  private AddNoteFragment injectAddNoteFragment(AddNoteFragment instance) {
    AddNoteFragment_MembersInjector.injectViewModel(instance, getAddNoteViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule(), new LiveData());
    }
  }
}
