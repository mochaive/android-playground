package com.mocha.android_playground.presentation.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mocha.android_playground.presentation.base.BaseActivity
import com.mocha.android_playground.ui.theme.AndroidplaygroundTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Composable
    override fun Content() {
        val viewModel: MainViewModel = hiltViewModel()
        AndroidplaygroundTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Text(text = viewModel.text.collectAsState().value)
            }
        }
    }
}