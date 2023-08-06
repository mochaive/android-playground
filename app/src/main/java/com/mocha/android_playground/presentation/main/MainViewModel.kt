package com.mocha.android_playground.presentation.main

import com.mocha.android_playground.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : BaseViewModel() {
    private val _text: MutableStateFlow<String> = MutableStateFlow("Hello")
    val text: StateFlow<String> = _text
}