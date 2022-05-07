package org.wit.dogadoptioncentre.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseUser
import org.wit.dogadoptioncentre.firebase.FirebaseDBManager
import org.wit.dogadoptioncentre.models.AdoptionManager
import org.wit.dogadoptioncentre.models.AdoptionModel
import timber.log.Timber

class AdoptionViewModelContent: ViewModel() {
    private val status = MutableLiveData<Boolean>()

    val observableStatus: LiveData<Boolean>
        get() = status


//    fun addDonation(adoptions: AdoptionModel) {
//        status.value = try {
//            AdoptionManager.create(adoptions)
//            true
//        } catch (e: IllegalArgumentException) {
//            false
//        }
//    }

    fun addDonation(firebaseUser: MutableLiveData<FirebaseUser>,
                    adoptions: AdoptionModel) {
        status.value = try {
            //DonationManager.create(donation)
            FirebaseDBManager.create(firebaseUser,adoptions)
            true
        } catch (e: IllegalArgumentException) {
            false
        }
    }

//    fun getAdoptions(userid:String, id: String) {
//        try {
//            //DonationManager.findById(email, id, donation)
//            FirebaseDBManager.findById(userid, id, )
//            Timber.i("Detail getDonation() Success : ${
//                donation.value.toString()}")
//        }
//        catch (e: Exception) {
//            Timber.i("Detail getDonation() Error : $e.message")
//        }
//    }

    fun updateDonation(userid:String, id: String,adoptions: AdoptionModel) {
        try {
            //DonationManager.update(email, id, donation)
            FirebaseDBManager.update(userid, id, adoptions)
            Timber.i("Detail update() Success : $adoptions")
        }
        catch (e: Exception) {
            Timber.i("Detail update() Error : $e.message")
        }
    }








}