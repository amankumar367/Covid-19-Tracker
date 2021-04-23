package com.covid.aman.data.repository

import com.covid.aman.data.model.CovidDataList
import io.reactivex.Single

interface CovidRepository {
    fun getCovidCases(): Single<List<CovidDataList>>
}