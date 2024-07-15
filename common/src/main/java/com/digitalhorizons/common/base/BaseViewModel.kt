package com.digitalhorizons.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<ViewState, ViewAction> : ViewModel() {
    private val _state = MutableLiveData<ViewState>()

    private val _action = OneShotLiveData<ViewAction>()

    val state: LiveData<ViewState> get() = _state

    val action: LiveData<ViewAction> get() = _action

    fun sendAction(action: ViewAction) {
        _action.value = action
    }

    fun sendState(newState: ViewState) {
        _state.value = newState
    }
}

class OneShotLiveData<T> : MutableLiveData<T>() {
    override fun setValue(value: T?) {
        super.setValue(value)
        super.setValue(null)
    }
}