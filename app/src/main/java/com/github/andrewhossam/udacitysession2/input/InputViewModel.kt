package com.github.andrewhossam.udacitysession2.input

import androidx.lifecycle.ViewModel
import timber.log.Timber

class InputViewModel : ViewModel() {

    var message: String = "Empty"
    fun helloInputViewModel() {
        Timber.i(message)
    }
}