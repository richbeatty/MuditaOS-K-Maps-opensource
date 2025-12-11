package com.mudita.kompakt.commonUi.components.progress

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mudita.kompakt.commonUi.colorBlack

@Composable
fun KompaktAnimatedLoader(modifier: Modifier = Modifier) {
    CircularProgressIndicator(modifier = modifier, color = colorBlack)
}
