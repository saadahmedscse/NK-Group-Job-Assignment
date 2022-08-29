package com.masudranabd.motorcyclefueltracker.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.saadahmedsoft.nkgroup_jobassignment.R

object ProgressDialog {

    private lateinit var dialog: Dialog

    fun show(context: Context){
        dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_progress)

        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show();
    }

    fun dismiss(){
        dialog.dismiss()
    }
}