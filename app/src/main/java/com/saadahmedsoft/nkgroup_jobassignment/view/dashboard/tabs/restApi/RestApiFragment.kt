package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.restApi

import android.os.Bundle
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.utils.Constants.Booleans.TRUE
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRestApiBinding

class RestApiFragment : BaseFragment<FragmentRestApiBinding>(FragmentRestApiBinding::inflate) {

    override val title: String
        get() = "Rest API"
    override val isBackButtonVisible: Boolean
        get() = TRUE

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        //
    }

    override fun observeData() {}
}