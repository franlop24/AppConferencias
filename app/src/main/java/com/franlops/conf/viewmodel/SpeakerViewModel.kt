package com.franlops.conf.viewmodel

import androidx.lifecycle.MutableLiveData
import com.franlops.conf.model.Speaker
import com.franlops.conf.network.Callback
import com.franlops.conf.network.FirestoreService
import java.lang.Exception

class SpeakerViewModel {
    val firestoreService = FirestoreService()
    var listSpeakers: MutableLiveData<List<Speaker>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh(){
        getSpeakerFromFirebase()
    }

    fun getSpeakerFromFirebase(){
        firestoreService.getSpeakers(object: Callback<List<Speaker>>{
            override fun onSuccess(result: List<Speaker>?){
                listSpeakers.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception){
                processFinished()
            }
        })

    }

    fun processFinished(){
        isLoading.value = true
    }
}