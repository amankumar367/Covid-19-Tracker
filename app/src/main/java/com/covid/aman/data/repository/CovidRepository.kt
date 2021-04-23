package com.covid.aman.data.repository

import com.covid.aman.data.model.StateData
import io.reactivex.Single

interface CovidRepository {
    fun getCovidCases(): Single<List<StateData>>
}