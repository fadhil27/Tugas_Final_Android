package com.fadhil.tugas_final_android.UI.ListFish

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fadhil.tugas_final_android.Model.DataFish
import com.fadhil.tugas_final_android.Model.DataFishItem
import com.fadhil.tugas_final_android.Network.RetrofitClient
import retrofit2.Response
import java.lang.Exception

class LishFishViewModel: ViewModel() {
    private val TAG = "LishFishViewModel"
    private var listFish = mutableListOf<DataFishItem>()

    suspend fun getListFish(adapter: FishAdapter) {
        if(listFish.isEmpty()) {
            var response: Response<DataFish>? = null
            try {
                response = RetrofitClient.instance.getListFish()
                if(response.isSuccessful) {
                    adapter.setData(response.body()!!)
                }
            } catch (e: Exception) {
                Log.e(TAG, "${e.message}")
            }
        } else {
            adapter.setData(listFish)
        }
    }

}