package dev.sunnat629.baseAndroidFiles

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.sunnat629.baseAndroidFiles.di.DaggerAppComponent


class RootApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out RootApp> {
        return DaggerAppComponent.builder().create(this)
    }
}