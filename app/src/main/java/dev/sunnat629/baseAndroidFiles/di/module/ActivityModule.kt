package dev.sunnat629.baseAndroidFiles.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.sunnat629.baseAndroidFiles.ui.main.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}