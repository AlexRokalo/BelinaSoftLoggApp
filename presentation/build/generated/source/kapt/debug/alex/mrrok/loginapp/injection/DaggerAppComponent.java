// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.loginapp.injection;

import alex.mrrok.data.net.BalinasoftService_Factory;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repository.Repository;
import alex.mrrok.domain.usecase.RegistrationUser;
import alex.mrrok.loginapp.executor.UiThread;
import alex.mrrok.loginapp.executor.UiThread_Factory;
import alex.mrrok.loginapp.presentation.screens.loginactivity.LoginViewModel;
import alex.mrrok.loginapp.presentation.screens.loginactivity.LoginViewModel_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<Repository> provideRepositoryProvider;

  private Provider<UiThread> uiThreadProvider;

  private Provider<PostExecutionThread> providePostExecutionThreadProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private RegistrationUser getRegistrationUser() {
    return new RegistrationUser(
        provideRepositoryProvider.get(), providePostExecutionThreadProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideRepositoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideRepositoryFactory.create(
                builder.appModule, BalinasoftService_Factory.create()));
    this.uiThreadProvider = DoubleCheck.provider(UiThread_Factory.create());
    this.providePostExecutionThreadProvider =
        DoubleCheck.provider(
            AppModule_ProvidePostExecutionThreadFactory.create(
                builder.appModule, uiThreadProvider));
  }

  @Override
  public void inject(LoginViewModel mainViewModel) {
    injectLoginViewModel(mainViewModel);
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectSetRegistry(instance, getRegistrationUser());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}
