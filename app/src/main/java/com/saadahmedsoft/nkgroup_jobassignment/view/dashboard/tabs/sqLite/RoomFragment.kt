package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.sqLite

import android.os.Bundle
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.utils.Constants.Booleans.FALSE
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRoomBinding

class RoomFragment : BaseFragment<FragmentRoomBinding>(FragmentRoomBinding::inflate) {

    override val title: String
        get() = "SQ Lite"
    override val isBackButtonVisible: Boolean
        get() = FALSE

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        //
    }

    override fun observeData() {}
}