package com.covid.aman.data.remote

import com.covid.aman.data.CovidData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("state_district_wise.json")
    fun getCovidCases(): Call<CovidData>

}