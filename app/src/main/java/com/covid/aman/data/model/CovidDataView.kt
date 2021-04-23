package com.covid.aman.data.model

data class CovidDataView(
    var districtName: String? = null,
    var districtData: DistrictData? = null
)

data class DistrictData(
    var active: Int? = null,
    var confirmed: Int? = null,
    var deceased: Int? = null,
    var recovered: Int? = null
)