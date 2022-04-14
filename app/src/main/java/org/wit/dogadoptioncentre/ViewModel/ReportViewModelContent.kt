package org.wit.dogadoptioncentre.ViewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.wit.dogadoptioncentre.models.AdoptionManager
import org.wit.dogadoptioncentre.models.AdoptionModel

class ReportViewModelContent: ViewModel() {

    private val adoptionsList = MutableLiveData<List<AdoptionModel>>()

    val observableAdoptionsList: LiveData<List<AdoptionModel>>
        get() = adoptionsList

    init {
        load()
    }

    fun load() {
        adoptionsList.value = AdoptionManager.findAll()
    }



}