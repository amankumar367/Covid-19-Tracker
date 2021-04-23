package com.covid.aman.di

import android.app.Application
import com.covid.aman.CovidApplication
import com.covid.aman.di.module.ActivityBuilderModule
import com.covid.aman.di.module.NetworkModule
import com.covid.aman.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class,
    NetworkModule::class
])
interface AppComponent: AndroidInjector<CovidApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}