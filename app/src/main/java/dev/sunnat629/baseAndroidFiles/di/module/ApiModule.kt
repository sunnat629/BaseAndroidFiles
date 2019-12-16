package dev.sunnat629.baseAndroidFiles.di.module

import dev.sunnat629.baseAndroidFiles.di.Authorized
import dagger.Module
import dagger.Provides
import dev.sunnat629.baseAndroidFiles.models.api.GitHubApi
import retrofit2.Retrofit

@Module
object ApiModule {

    @JvmStatic
    @Provides
    fun provideAuthApi(retrofit: Retrofit): GitHubApi {
        return retrofit.create(GitHubApi::class.java)
    }

//    @JvmStatic
//    @Provides
//    fun provideProductApi(@Authorized retrofit: Retrofit): GitHubApi {
//        return retrofit.create(GitHubApi::class.java)
//    }
}