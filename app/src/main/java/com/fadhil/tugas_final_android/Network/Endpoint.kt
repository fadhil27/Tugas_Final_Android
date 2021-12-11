package com.fadhil.tugas_final_android.Network

import com.fadhil.tugas_final_android.Model.DataFish
import retrofit2.Response
import retrofit2.http.GET

interface Endpoint {

    @GET("api/species")
    suspend fun getListFish(): Response<DataFish>

}