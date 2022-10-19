package com.github.andrewhossam.udacitysession2.input

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.andrewhossam.udacitysession2.App
import timber.log.Timber

class InputViewModel(application: Application, private val anyValue: String) :
    AndroidViewModel(application) {

    var message: String = "Empty"
    fun helloInputViewModel() {
        Timber.i(anyValue)
    }

    companion object {
        class InputViewModelFactory(
            private val application: Application,
            private val anyValue: String,
        ) :
            ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                if (modelClass.isAssignableFrom(InputViewModel::class.java)) {
                    return InputViewModel(application, anyValue) as T
                }
                throw IllegalArgumentException("Unknow VM")
            }
        }
    }
}