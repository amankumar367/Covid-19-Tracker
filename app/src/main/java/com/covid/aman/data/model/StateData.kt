package com.covid.aman.data.model

data class StateData(
    val state: String? = null,
    val districtData: List<DistrictData>? = null
)

data class DistrictData(
    val district: String? = null,
    val active: Int? = null,
    val confirmed: Int? = null,
    val deceased: Int? = null,
    val recovered: Int? = null
)