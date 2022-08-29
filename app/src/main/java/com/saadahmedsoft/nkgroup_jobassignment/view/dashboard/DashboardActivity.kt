package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard

import android.os.Bundle
import com.saadahmedsoft.base.BaseActivity
import com.saadahmedsoft.nkgroup_jobassignment.databinding.ActivityDashboardBinding
import com.saadahmedsoft.nkgroup_jobassignment.databinding.AppToolbarBinding

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(ActivityDashboardBinding::inflate){

    override val toolbarBinding: AppToolbarBinding
        get() = binding.appToolbar

    override fun onActivityCreate(savedInstanceState: Bundle?) {
        //
    }

    override fun observeData() {}
}