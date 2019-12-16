package dev.sunnat629.baseAndroidFiles.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.sunnat629.baseAndroidFiles.ui.main.MainFragment

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}