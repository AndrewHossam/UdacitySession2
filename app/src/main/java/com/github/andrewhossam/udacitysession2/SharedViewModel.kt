package com.github.andrewhossam.udacitysession2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val _inputTextLiveDate = MutableLiveData<String>()
    val inputTextMapper: LiveData<String> = Transformations.map(_inputTextLiveDate) {
        "Input is : $it"
    }

}