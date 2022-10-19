package com.github.andrewhossam.udacitysession2

import androidx.lifecycle.*

class SharedViewModel : ViewModel() {
    val inputTextLiveDate = MutableLiveData<String>()
    val toggleLiveData = MutableLiveData<Boolean>(false)
    val inputTextMapper: LiveData<String> = Transformations.map(inputTextLiveDate) {
        "Input is : $it"
    }

    val inputMediator = MediatorLiveData<String>().apply {
        addSource(toggleLiveData) {
            value = handleInputTextWithToggle()
        }
        addSource(inputTextLiveDate) {
            value = handleInputTextWithToggle()
        }
    }

    private fun handleInputTextWithToggle(): String? {
        return if (toggleLiveData.value == true) {
            inputTextLiveDate.value
        } else {
            ""
        }
    }
}