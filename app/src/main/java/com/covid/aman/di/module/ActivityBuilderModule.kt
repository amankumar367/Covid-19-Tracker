package com.covid.aman.di.module

import com.covid.aman.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector()
    abstract fun mainActivityActivityProvider() : MainActivity

}
