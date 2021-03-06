// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.loginapp.presentation.screens.loginactivity;

import alex.mrrok.domain.usecase.RegistrationUser;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class LoginViewModel_MembersInjector implements MembersInjector<LoginViewModel> {
  private final Provider<RegistrationUser> p0Provider;

  public LoginViewModel_MembersInjector(Provider<RegistrationUser> p0Provider) {
    this.p0Provider = p0Provider;
  }

  public static MembersInjector<LoginViewModel> create(Provider<RegistrationUser> p0Provider) {
    return new LoginViewModel_MembersInjector(p0Provider);
  }

  @Override
  public void injectMembers(LoginViewModel instance) {
    injectSetRegistry(instance, p0Provider.get());
  }

  public static void injectSetRegistry(LoginViewModel instance, RegistrationUser p0) {
    instance.setRegistry(p0);
  }
}
