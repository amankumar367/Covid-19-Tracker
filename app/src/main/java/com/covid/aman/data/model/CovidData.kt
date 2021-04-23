package com.covid.aman.data


import com.google.gson.annotations.SerializedName

data class CovidData(
    @SerializedName("State Unassigned")
    var stateUnassigned: StateUnassigned? = null,
    @SerializedName("Andaman and Nicobar Islands")
    var andamanAndNicobarIslands: AndamanAndNicobarIslands? = null,
    @SerializedName("Andhra Pradesh")
    var andhraPradesh: AndhraPradesh? = null,
    @SerializedName("Arunachal Pradesh")
    var arunachalPradesh: ArunachalPradesh? = null,
    @SerializedName("Assam")
    var assam: Assam? = null,
    @SerializedName("Bihar")
    var bihar: Bihar? = null,
    @SerializedName("Chandigarh")
    var chandigarh: Chandigarh? = null
) {
    data class StateUnassigned(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Unassigned")
            var unassigned: Unassigned? = null
        ) {
            data class Unassigned(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class AndamanAndNicobarIslands(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Nicobars")
            var nicobars: Nicobars? = null,
            @SerializedName("North and Middle Andaman")
            var northAndMiddleAndaman: NorthAndMiddleAndaman? = null,
            @SerializedName("South Andaman")
            var southAndaman: SouthAndaman? = null,
            @SerializedName("Unknown")
            var unknown: Unknown? = null
        ) {
            data class Nicobars(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class NorthAndMiddleAndaman(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class SouthAndaman(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Unknown(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class AndhraPradesh(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Foreign Evacuees")
            var foreignEvacuees: ForeignEvacuees? = null,
            @SerializedName("Anantapur")
            var anantapur: Anantapur? = null,
            @SerializedName("Chittoor")
            var chittoor: Chittoor? = null,
            @SerializedName("East Godavari")
            var eastGodavari: EastGodavari? = null,
            @SerializedName("Guntur")
            var guntur: Guntur? = null,
            @SerializedName("Krishna")
            var krishna: Krishna? = null,
            @SerializedName("Kurnool")
            var kurnool: Kurnool? = null,
            @SerializedName("Other State")
            var otherState: OtherState? = null,
            @SerializedName("Prakasam")
            var prakasam: Prakasam? = null,
            @SerializedName("S.P.S. Nellore")
            var sPSNellore: SPSNellore? = null,
            @SerializedName("Srikakulam")
            var srikakulam: Srikakulam? = null,
            @SerializedName("Visakhapatnam")
            var visakhapatnam: Visakhapatnam? = null,
            @SerializedName("Vizianagaram")
            var vizianagaram: Vizianagaram? = null,
            @SerializedName("West Godavari")
            var westGodavari: WestGodavari? = null,
            @SerializedName("Y.S.R. Kadapa")
            var ySRKadapa: YSRKadapa? = null
        ) {
            data class ForeignEvacuees(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Anantapur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Chittoor(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class EastGodavari(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Guntur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Krishna(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kurnool(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class OtherState(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Prakasam(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class SPSNellore(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Srikakulam(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Visakhapatnam(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Vizianagaram(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class WestGodavari(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class YSRKadapa(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class ArunachalPradesh(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Anjaw")
            var anjaw: Anjaw? = null,
            @SerializedName("Changlang")
            var changlang: Changlang? = null,
            @SerializedName("East Kameng")
            var eastKameng: EastKameng? = null,
            @SerializedName("East Siang")
            var eastSiang: EastSiang? = null,
            @SerializedName("Kamle")
            var kamle: Kamle? = null,
            @SerializedName("Kra Daadi")
            var kraDaadi: KraDaadi? = null,
            @SerializedName("Kurung Kumey")
            var kurungKumey: KurungKumey? = null,
            @SerializedName("Lepa Rada")
            var lepaRada: LepaRada? = null,
            @SerializedName("Lohit")
            var lohit: Lohit? = null,
            @SerializedName("Longding")
            var longding: Longding? = null,
            @SerializedName("Lower Dibang Valley")
            var lowerDibangValley: LowerDibangValley? = null,
            @SerializedName("Lower Siang")
            var lowerSiang: LowerSiang? = null,
            @SerializedName("Lower Subansiri")
            var lowerSubansiri: LowerSubansiri? = null,
            @SerializedName("Namsai")
            var namsai: Namsai? = null,
            @SerializedName("Pakke Kessang")
            var pakkeKessang: PakkeKessang? = null,
            @SerializedName("Papum Pare")
            var papumPare: PapumPare? = null,
            @SerializedName("Shi Yomi")
            var shiYomi: ShiYomi? = null,
            @SerializedName("Siang")
            var siang: Siang? = null,
            @SerializedName("Tawang")
            var tawang: Tawang? = null,
            @SerializedName("Tirap")
            var tirap: Tirap? = null,
            @SerializedName("Upper Dibang Valley")
            var upperDibangValley: UpperDibangValley? = null,
            @SerializedName("Upper Siang")
            var upperSiang: UpperSiang? = null,
            @SerializedName("Upper Subansiri")
            var upperSubansiri: UpperSubansiri? = null,
            @SerializedName("West Kameng")
            var westKameng: WestKameng? = null,
            @SerializedName("West Siang")
            var westSiang: WestSiang? = null
        ) {
            data class Anjaw(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Changlang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class EastKameng(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class EastSiang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kamle(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class KraDaadi(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class KurungKumey(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class LepaRada(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Lohit(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Longding(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class LowerDibangValley(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class LowerSiang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class LowerSubansiri(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Namsai(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class PakkeKessang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class PapumPare(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class ShiYomi(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Siang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Tawang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Tirap(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class UpperDibangValley(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class UpperSiang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class UpperSubansiri(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class WestKameng(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class WestSiang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class Assam(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Airport Quarantine")
            var airportQuarantine: AirportQuarantine? = null,
            @SerializedName("Baksa")
            var baksa: Baksa? = null,
            @SerializedName("Barpeta")
            var barpeta: Barpeta? = null,
            @SerializedName("Biswanath")
            var biswanath: Biswanath? = null,
            @SerializedName("Bongaigaon")
            var bongaigaon: Bongaigaon? = null,
            @SerializedName("Cachar")
            var cachar: Cachar? = null,
            @SerializedName("Charaideo")
            var charaideo: Charaideo? = null,
            @SerializedName("Chirang")
            var chirang: Chirang? = null,
            @SerializedName("Darrang")
            var darrang: Darrang? = null,
            @SerializedName("Dhemaji")
            var dhemaji: Dhemaji? = null,
            @SerializedName("Dhubri")
            var dhubri: Dhubri? = null,
            @SerializedName("Dibrugarh")
            var dibrugarh: Dibrugarh? = null,
            @SerializedName("Dima Hasao")
            var dimaHasao: DimaHasao? = null,
            @SerializedName("Goalpara")
            var goalpara: Goalpara? = null,
            @SerializedName("Golaghat")
            var golaghat: Golaghat? = null,
            @SerializedName("Hailakandi")
            var hailakandi: Hailakandi? = null,
            @SerializedName("Hojai")
            var hojai: Hojai? = null,
            @SerializedName("Jorhat")
            var jorhat: Jorhat? = null,
            @SerializedName("Kamrup")
            var kamrup: Kamrup? = null,
            @SerializedName("Kamrup Metropolitan")
            var kamrupMetropolitan: KamrupMetropolitan? = null,
            @SerializedName("Karbi Anglong")
            var karbiAnglong: KarbiAnglong? = null,
            @SerializedName("Karimganj")
            var karimganj: Karimganj? = null,
            @SerializedName("Kokrajhar")
            var kokrajhar: Kokrajhar? = null,
            @SerializedName("Lakhimpur")
            var lakhimpur: Lakhimpur? = null,
            @SerializedName("Majuli")
            var majuli: Majuli? = null,
            @SerializedName("Morigaon")
            var morigaon: Morigaon? = null,
            @SerializedName("Nagaon")
            var nagaon: Nagaon? = null,
            @SerializedName("Nalbari")
            var nalbari: Nalbari? = null,
            @SerializedName("Other State")
            var otherState: OtherState? = null,
            @SerializedName("Sivasagar")
            var sivasagar: Sivasagar? = null,
            @SerializedName("Sonitpur")
            var sonitpur: Sonitpur? = null,
            @SerializedName("South Salmara Mankachar")
            var southSalmaraMankachar: SouthSalmaraMankachar? = null,
            @SerializedName("Tinsukia")
            var tinsukia: Tinsukia? = null,
            @SerializedName("Udalguri")
            var udalguri: Udalguri? = null,
            @SerializedName("West Karbi Anglong")
            var westKarbiAnglong: WestKarbiAnglong? = null,
            @SerializedName("Unknown")
            var unknown: Unknown? = null
        ) {
            data class AirportQuarantine(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Baksa(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Barpeta(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Biswanath(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Bongaigaon(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Cachar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Charaideo(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Chirang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Darrang(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Dhemaji(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Dhubri(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Dibrugarh(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class DimaHasao(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Goalpara(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Golaghat(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Hailakandi(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Hojai(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Jorhat(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kamrup(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class KamrupMetropolitan(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class KarbiAnglong(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Karimganj(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kokrajhar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Lakhimpur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Majuli(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Morigaon(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Nagaon(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Nalbari(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class OtherState(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Sivasagar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Sonitpur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class SouthSalmaraMankachar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Tinsukia(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Udalguri(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class WestKarbiAnglong(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Unknown(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class Bihar(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Araria")
            var araria: Araria? = null,
            @SerializedName("Arwal")
            var arwal: Arwal? = null,
            @SerializedName("Aurangabad")
            var aurangabad: Aurangabad? = null,
            @SerializedName("Banka")
            var banka: Banka? = null,
            @SerializedName("Begusarai")
            var begusarai: Begusarai? = null,
            @SerializedName("Bhagalpur")
            var bhagalpur: Bhagalpur? = null,
            @SerializedName("Bhojpur")
            var bhojpur: Bhojpur? = null,
            @SerializedName("Buxar")
            var buxar: Buxar? = null,
            @SerializedName("Darbhanga")
            var darbhanga: Darbhanga? = null,
            @SerializedName("East Champaran")
            var eastChamparan: EastChamparan? = null,
            @SerializedName("Gaya")
            var gaya: Gaya? = null,
            @SerializedName("Gopalganj")
            var gopalganj: Gopalganj? = null,
            @SerializedName("Jamui")
            var jamui: Jamui? = null,
            @SerializedName("Jehanabad")
            var jehanabad: Jehanabad? = null,
            @SerializedName("Kaimur")
            var kaimur: Kaimur? = null,
            @SerializedName("Katihar")
            var katihar: Katihar? = null,
            @SerializedName("Khagaria")
            var khagaria: Khagaria? = null,
            @SerializedName("Kishanganj")
            var kishanganj: Kishanganj? = null,
            @SerializedName("Lakhisarai")
            var lakhisarai: Lakhisarai? = null,
            @SerializedName("Madhepura")
            var madhepura: Madhepura? = null,
            @SerializedName("Madhubani")
            var madhubani: Madhubani? = null,
            @SerializedName("Munger")
            var munger: Munger? = null,
            @SerializedName("Muzaffarpur")
            var muzaffarpur: Muzaffarpur? = null,
            @SerializedName("Nalanda")
            var nalanda: Nalanda? = null,
            @SerializedName("Nawada")
            var nawada: Nawada? = null,
            @SerializedName("Patna")
            var patna: Patna? = null,
            @SerializedName("Purnia")
            var purnia: Purnia? = null,
            @SerializedName("Rohtas")
            var rohtas: Rohtas? = null,
            @SerializedName("Saharsa")
            var saharsa: Saharsa? = null,
            @SerializedName("Samastipur")
            var samastipur: Samastipur? = null,
            @SerializedName("Saran")
            var saran: Saran? = null,
            @SerializedName("Sheikhpura")
            var sheikhpura: Sheikhpura? = null,
            @SerializedName("Sheohar")
            var sheohar: Sheohar? = null,
            @SerializedName("Sitamarhi")
            var sitamarhi: Sitamarhi? = null,
            @SerializedName("Siwan")
            var siwan: Siwan? = null,
            @SerializedName("Supaul")
            var supaul: Supaul? = null,
            @SerializedName("Vaishali")
            var vaishali: Vaishali? = null,
            @SerializedName("West Champaran")
            var westChamparan: WestChamparan? = null
        ) {
            data class Araria(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Arwal(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Aurangabad(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Banka(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Begusarai(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Bhagalpur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Bhojpur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Buxar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Darbhanga(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class EastChamparan(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Gaya(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Gopalganj(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Jamui(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Jehanabad(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kaimur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Katihar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Khagaria(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Kishanganj(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Lakhisarai(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Madhepura(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Madhubani(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Munger(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Muzaffarpur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Nalanda(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Nawada(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Patna(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Purnia(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Rohtas(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Saharsa(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Samastipur(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Saran(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Sheikhpura(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Sheohar(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Sitamarhi(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Siwan(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Supaul(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class Vaishali(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }

            data class WestChamparan(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }

    data class Chandigarh(
        @SerializedName("districtData")
        var districtData: DistrictData? = null,
        @SerializedName("statecode")
        var statecode: String? = null
    ) {
        data class DistrictData(
            @SerializedName("Chandigarh")
            var chandigarh: Chandigarh? = null
        ) {
            data class Chandigarh(
                @SerializedName("notes")
                var notes: String? = null,
                @SerializedName("active")
                var active: Int? = null,
                @SerializedName("confirmed")
                var confirmed: Int? = null,
                @SerializedName("deceased")
                var deceased: Int? = null,
                @SerializedName("recovered")
                var recovered: Int? = null,
                @SerializedName("delta")
                var delta: Delta? = null
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    var confirmed: Int? = null,
                    @SerializedName("deceased")
                    var deceased: Int? = null,
                    @SerializedName("recovered")
                    var recovered: Int? = null
                )
            }
        }
    }
}