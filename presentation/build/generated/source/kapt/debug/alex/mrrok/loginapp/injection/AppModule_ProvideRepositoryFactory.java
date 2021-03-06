// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.loginapp.injection;

import alex.mrrok.data.net.BalinasoftService;
import alex.mrrok.domain.repository.Repository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideRepositoryFactory implements Factory<Repository> {
  private final AppModule module;

  private final Provider<BalinasoftService> restServiceProvider;

  public AppModule_ProvideRepositoryFactory(
      AppModule module, Provider<BalinasoftService> restServiceProvider) {
    this.module = module;
    this.restServiceProvider = restServiceProvider;
  }

  @Override
  public Repository get() {
    return provideInstance(module, restServiceProvider);
  }

  public static Repository provideInstance(
      AppModule module, Provider<BalinasoftService> restServiceProvider) {
    return proxyProvideRepository(module, restServiceProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      AppModule module, Provider<BalinasoftService> restServiceProvider) {
    return new AppModule_ProvideRepositoryFactory(module, restServiceProvider);
  }

  public static Repository proxyProvideRepository(
      AppModule instance, BalinasoftService restService) {
    return Preconditions.checkNotNull(
        instance.provideRepository(restService),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
