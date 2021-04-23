package com.covid.aman.data.repository

import com.covid.aman.data.model.StateData
import com.covid.aman.data.remote.ApiInterface
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class CovidRepositoryImp @Inject constructor(
    var apiInterface: ApiInterface
): CovidRepository {

    override fun getCovidCases(): Single<List<StateData>> {
        return Single.create { emitter ->
            apiInterface.getCovidCases().enqueue(object : Callback<List<StateData>> {
                override fun onFailure(call: Call<List<StateData>>, t: Throwable) {
                    emitter.onError(t)
                }

                override fun onResponse(call: Call<List<StateData>>, response: Response<List<StateData>>) {
                    if (response.body() != null && response.isSuccessful) {
                        emitter.onSuccess(response.body()!!)
                    }
                }
            })
        }
    }
}