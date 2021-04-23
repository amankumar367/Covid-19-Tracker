package com.covid.aman.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.covid.aman.R
import com.covid.aman.data.model.CovidDataList
import com.covid.aman.data.repository.CovidRepository
import com.covid.aman.databinding.ActivityMainBinding
import com.covid.aman.helper.extensions.createFactory
import com.covid.aman.helper.extensions.showToast
import com.covid.aman.ui.adapter.CovidParentAdapter
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var covidRepository: CovidRepository

    private lateinit var viewModel: MainViewModel

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        init()
        setObserver()
    }

    private fun init() {
        val factory = MainViewModel(covidRepository).createFactory()
        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
    }

    private fun setObserver() {
        viewModel.stateObservable.observe( this, Observer {
            when (it) {
                is MainState.Init -> {
                    viewModel.getCovidCases()
                }
                MainState.Loading -> {
                    viewBinding.showProgress = true
                }
                is MainState.Error -> {
                    viewBinding.showProgress = false
                    showToast(it.message)
                }
                is MainState.Success -> {
                    viewBinding.showProgress = false
                    setAdapter(it.data)
                }
                else -> { }
            }
        })
    }

    private fun setAdapter(data: List<CovidDataList>) {
        viewBinding.rvCovid.adapter = CovidParentAdapter(data)
    }


}