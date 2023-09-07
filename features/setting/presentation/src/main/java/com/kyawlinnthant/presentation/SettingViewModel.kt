package com.kyawlinnthant.presentation

import androidx.lifecycle.ViewModel
import com.kyawlinnthant.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor(
    private val appNavigator : AppNavigator
): ViewModel(){

    fun back() {
        appNavigator.back()
    }
}