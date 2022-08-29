package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.restApi

import android.os.Bundle
import com.masudranabd.motorcyclefueltracker.utils.ProgressDialog
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.helper.linearLayoutManager
import com.saadahmedsoft.base.helper.observe
import com.saadahmedsoft.base.utils.Constants.Booleans.TRUE
import com.saadahmedsoft.base.utils.DataState
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRestApiBinding
import com.saadahmedsoft.nkgroup_jobassignment.services.api.RetroInstance
import com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.restApi.adapter.RestApiAdapter

class RestApiFragment : BaseFragment<FragmentRestApiBinding>(FragmentRestApiBinding::inflate) {

    override val title: String
        get() = "Rest API"
    override val isBackButtonVisible: Boolean
        get() = TRUE

    private val adapter by lazy {
        RestApiAdapter()
    }

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        binding.recyclerView.layoutManager = linearLayoutManager(requireContext())
        apiViewModel.getDoctors(RetroInstance)
    }

    override fun observeData() {
        observe(apiViewModel.liveData) {
            when (it) {
                is DataState.Loading -> {
                    ProgressDialog.show(requireContext())
                }

                is DataState.Success -> {
                    ProgressDialog.dismiss()
                    binding.recyclerView.adapter = adapter
                    adapter.addItems(it.data?.doctors!!)
                }

                is DataState.Failed -> {
                    ProgressDialog.dismiss()
                    longSnackBar(it.message!!)
                }
            }
        }
    }
}