package com.mudita.kompakt.commonUi.util

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun NoRippleInteractionSource(): MutableInteractionSource = remember { MutableInteractionSource() }
