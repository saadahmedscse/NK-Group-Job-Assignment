package com.saadahmedsoft.base.helper

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.snackbar.Snackbar
import com.saadahmedsoft.nkgroup_jobassignment.R

fun snackBar(context: Context, view: View, message: String, duration: Int) {
    val snackBar = Snackbar.make(view, message, duration)
    snackBar.setAction("Close") {
        snackBar.dismiss()
    }

    val snackbarView = snackBar.view
    val font = ResourcesCompat.getFont(context, R.font.regular)

    snackbarView.setBackgroundResource(R.drawable.bg_dark_grey_5)
    val snackText =
        snackbarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
    val snackActionText =
        snackbarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_action)
    snackText.setTextColor(Color.LTGRAY)
    snackText.typeface = font
    snackActionText.typeface = font
    snackActionText.isAllCaps = false
    snackActionText.setTextColor(ContextCompat.getColor(context, R.color.colorRed))
    snackText.setTextColor(ContextCompat.getColor(context, R.color.colorLightGrey))
    snackBar.show()
}

fun toast(context: Context, message: String, duration: Int) {
    Toast.makeText(context, message, duration).show()
}