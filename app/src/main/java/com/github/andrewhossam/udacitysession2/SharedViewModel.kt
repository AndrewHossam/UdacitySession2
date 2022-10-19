package com.github.andrewhossam.udacitysession2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
     val _inputTextLiveDate = MutableLiveData<String>()
    val inputTextLiveData : LiveData<String>
        get() = _inputTextLiveDate

    fun updateText(text: String) {
        _inputTextLiveDate.postValue(text)
    }}