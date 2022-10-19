package com.github.andrewhossam.udacitysession2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val inputTextLive = MutableLiveData<String>()
}