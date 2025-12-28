package com.digitalhorizons.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<ViewState, ViewAction> : ViewModel() {
    private val _state = MutableLiveData<ViewState>()

    private val _action = SingleLiveEvent<ViewAction>()

    val state: LiveData<ViewState> get() = _state

    val action: LiveData<ViewAction> get() = _action as LiveData<ViewAction>

    fun sendAction(action: ViewAction) {
        _action.value = action
    }

    fun sendState(newState: ViewState) {
        _state.value = newState
    }
}