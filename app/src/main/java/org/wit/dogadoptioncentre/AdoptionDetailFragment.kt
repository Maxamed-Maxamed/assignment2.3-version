package org.wit.dogadoptioncentre

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AdoptionDetailFragment : Fragment() {

    companion object {
        fun newInstance() = AdoptionDetailFragment()
    }

    private lateinit var viewModel: AdoptionDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.adoption_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AdoptionDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}