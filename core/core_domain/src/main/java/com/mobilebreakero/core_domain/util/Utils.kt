package com.mobilebreakero.core_domain.util

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText

class Utils {
    companion object {
        fun print(e: Exception) = Log.e(TAG, e.stackTraceToString())

        fun showMessage(
            context: Context,
            message: String?
        ) = makeText(context, message, LENGTH_LONG).show()
    }
}

fun generateRandomIdNumber(): Int {
    return (100000000..999999999).random()
}
