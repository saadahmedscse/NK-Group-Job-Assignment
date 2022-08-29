package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.sqLite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.utils.Constants.Booleans.FALSE
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRoomBinding
import com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.DashboardActivity

class RoomFragment : BaseFragment<FragmentRoomBinding>(FragmentRoomBinding::inflate) {

    override val title: String
        get() = "SQ Lite"
    override val isBackButtonVisible: Boolean
        get() = FALSE

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        //
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as DashboardActivity).setNavButton()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun observeData() {}
}