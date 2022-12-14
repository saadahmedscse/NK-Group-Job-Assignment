package com.saadahmedsoft.base.utils

import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Constants {
    object App {
        const val APP_NAME = "NK Group - Job Assignment"
    }

    object Booleans {
        const val TRUE = true
        const val FALSE = false
    }

    object Durations {
        const val SNACK_SHORT = Snackbar.LENGTH_SHORT
        const val SNACK_LONG = Snackbar.LENGTH_LONG
        const val TOAST_SHORT = Toast.LENGTH_SHORT
        const val TOAST_LONG = Toast.LENGTH_LONG
    }

    object Api {
        const val BASE_URL = "https://topseba.com/api/"
    }

    object Errors {
        const val UNEXPECTED_ERROR_OCCURRED = "Unexpected error occurred"
        const val NO_INTERNET = "No Internet Connection"
    }

    object Database {
        const val TABLE_NAME = "NK_Group"
    }
}