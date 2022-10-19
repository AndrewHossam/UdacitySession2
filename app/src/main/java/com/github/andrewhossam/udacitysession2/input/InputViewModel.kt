package com.github.andrewhossam.udacitysession2.input

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.andrewhossam.udacitysession2.App
import timber.log.Timber

class InputViewModel(application: Application) : AndroidViewModel(application) {

    var message: String = "Empty"
    fun helloInputViewModel() {
        Timber.i(getApplication<App>()::class.java.simpleName)
    }
}