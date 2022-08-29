package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.restApi

import android.os.Bundle
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.helper.observe
import com.saadahmedsoft.base.utils.Constants.Booleans.TRUE
import com.saadahmedsoft.base.utils.DataState
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRestApiBinding
import com.saadahmedsoft.nkgroup_jobassignment.services.api.RetroInstance

class RestApiFragment : BaseFragment<FragmentRestApiBinding>(FragmentRestApiBinding::inflate) {

    override val title: String
        get() = "Rest API"
    override val isBackButtonVisible: Boolean
        get() = TRUE

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        apiViewModel.getDoctors(RetroInstance)
    }

    override fun observeData() {
        observe(apiViewModel.liveData) {
            when (it) {
                is DataState.Loading -> {
                    //s
                }

                is DataState.Success -> {
                    longSnackBar(it.data?.msg!!)
                }

                is DataState.Failed -> {
                    //s
                }
            }
        }
    }
}