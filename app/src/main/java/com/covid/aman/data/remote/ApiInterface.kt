package com.covid.aman.data.remote

import com.covid.aman.data.model.StateData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("v2/state_district_wise.json")
    fun getCovidCases(): Call<List<StateData>>

}