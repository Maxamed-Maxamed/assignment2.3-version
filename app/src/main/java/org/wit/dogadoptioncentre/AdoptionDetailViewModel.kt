package org.wit.dogadoptioncentre

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.wit.dogadoptioncentre.models.AdoptionManager
import org.wit.dogadoptioncentre.models.AdoptionModel

class AdoptionDetailViewModel : ViewModel() {
    // TODO: Implement the ViewModel


    private val adoption = MutableLiveData<AdoptionModel>()

    val observableAdoption: LiveData<AdoptionModel>
        get() = adoption

    fun getAdoption(id: Long) {
        adoption.value = AdoptionManager.findById(id)
    }
}