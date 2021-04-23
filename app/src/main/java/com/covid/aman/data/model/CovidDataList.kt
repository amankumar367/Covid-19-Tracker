package com.covid.aman.data.model

data class CovidDataList(
    var stateName: String? = null,
    var covidDataView: MutableList<CovidDataView>? = null
)