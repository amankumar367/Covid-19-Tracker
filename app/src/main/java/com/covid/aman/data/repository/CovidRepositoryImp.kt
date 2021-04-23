package com.covid.aman.data.repository

import com.covid.aman.data.CovidData
import com.covid.aman.data.model.CovidDataList
import com.covid.aman.data.remote.ApiInterface
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class CovidRepositoryImp @Inject constructor(
    var apiInterface: ApiInterface
): CovidRepository {

    override fun getCovidCases(): Single<List<CovidDataList>> {
        return Single.create { emitter ->
            apiInterface.getCovidCases().enqueue(object : Callback<CovidData> {
                override fun onFailure(call: Call<CovidData>, t: Throwable) {
                    emitter.onError(t)
                }

                override fun onResponse(call: Call<CovidData>, response: Response<CovidData>) {
                    if (response.body() != null && response.isSuccessful) {
                        val list: MutableList<CovidDataList> = mutableListOf()
                        emitter.onSuccess(list)
                    }
                }
            })
        }
    }
}