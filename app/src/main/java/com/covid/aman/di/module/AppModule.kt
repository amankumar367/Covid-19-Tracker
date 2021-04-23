package com.covid.aman.di.module

import com.covid.aman.data.repository.CovidRepository
import com.covid.aman.data.repository.CovidRepositoryImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideArticleRepo(covidRepositoryImp: CovidRepositoryImp): CovidRepository {
        return covidRepositoryImp
    }
}