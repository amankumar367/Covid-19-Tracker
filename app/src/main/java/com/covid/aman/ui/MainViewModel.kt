package com.covid.aman.ui

import androidx.lifecycle.MutableLiveData
import com.covid.aman.base.BaseViewModel
import com.covid.aman.data.repository.CovidRepository
import com.covid.aman.helper.extensions.transform
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel(
    private val covidRepository: CovidRepository
): BaseViewModel<MainState>() {

    private var state: MainState = MainState.Init
        set(value) {
            field = value
            publishState(value)
        }

    override val stateObservable: MutableLiveData<MainState> by lazy {
        MutableLiveData<MainState>()
    }

    fun getCovidCases() {
        state = MainState.Loading
        disposables.add(
            covidRepository.getCovidCases()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    state = MainState.Success(it)
                }, {
                    state = MainState.Error(it.transform().localizedMessage)
                })
        )
    }

}