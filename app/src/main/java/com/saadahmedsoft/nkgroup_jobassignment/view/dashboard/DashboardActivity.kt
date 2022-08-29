package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard

import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import com.saadahmedsoft.base.BaseActivity
import com.saadahmedsoft.nkgroup_jobassignment.R
import com.saadahmedsoft.nkgroup_jobassignment.databinding.ActivityDashboardBinding
import com.saadahmedsoft.nkgroup_jobassignment.databinding.AppToolbarBinding

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(ActivityDashboardBinding::inflate){

    override val toolbarBinding: AppToolbarBinding
        get() = binding.appToolbar

    override fun onActivityCreate(savedInstanceState: Bundle?) {
        val myNavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = myNavHostFragment.navController

        val options = NavOptions.Builder()
            .setLaunchSingleTop(true)
            .setEnterAnim(com.saadahmedsoft.shortintent.R.anim.animate_swipe_left_enter)
            .setExitAnim(com.saadahmedsoft.shortintent.R.anim.animate_swipe_left_exit)
            .setPopEnterAnim(com.saadahmedsoft.shortintent.R.anim.animate_swipe_right_enter)
            .setPopExitAnim(com.saadahmedsoft.shortintent.R.anim.animate_swipe_right_exit)
            .setPopUpTo(navController.graph.startDestinationId, false)
            .build()

        binding.navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.roomFragment -> {
                    if (toolbarBinding.toolbarTitle.text != "SQ Lite") {
                        navController.navigate(R.id.roomFragment, null, options)
                    }
                }
                R.id.restApiFragment -> {
                    if (toolbarBinding.toolbarTitle.text != "Rest API") {
                        navController.navigate(R.id.restApiFragment, null, options)
                    }
                }
            }
            true
        }
    }

    fun setNavButton() {
        binding.navView.selectedItemId = R.id.roomFragment
    }

    override fun observeData() {}
}