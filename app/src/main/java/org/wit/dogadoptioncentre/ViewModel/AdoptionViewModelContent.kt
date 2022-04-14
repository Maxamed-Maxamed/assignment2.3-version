package org.wit.dogadoptioncentre.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.wit.dogadoptioncentre.models.AdoptionManager
import org.wit.dogadoptioncentre.models.AdoptionModel

class AdoptionViewModelContent: ViewModel() {
    private val status = MutableLiveData<Boolean>()

    val observableStatus: LiveData<Boolean>
        get() = status

    fun addDonation(adoptions: AdoptionModel) {
        status.value = try {
            AdoptionManager.create(adoptions)
            true
        } catch (e: IllegalArgumentException) {
            false
        }
    }
}