package com.saadahmedsoft.base.helper

import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.saadahmedsoft.shortintent.R

fun navigate(view: View, id: Int) {
    val navBuilder = NavOptions.Builder()
    navBuilder
        .setEnterAnim(R.anim.animate_swipe_left_enter)
        .setExitAnim(R.anim.animate_swipe_left_exit)
        .setPopEnterAnim(R.anim.animate_swipe_right_enter)
        .setPopExitAnim(R.anim.animate_swipe_right_exit)

    Navigation.findNavController(view).navigate(id, null, navBuilder.build())
}