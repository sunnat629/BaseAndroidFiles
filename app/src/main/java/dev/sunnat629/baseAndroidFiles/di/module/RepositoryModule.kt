package dev.sunnat629.baseAndroidFiles.di.module

import dagger.Binds
import dagger.Module
import dev.sunnat629.baseAndroidFiles.models.repository.GitHubRepository

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindAuthRepository(authDataRepository: GitHubRepository): GitHubRepository
}