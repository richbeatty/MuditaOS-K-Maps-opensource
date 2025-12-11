package com.mudita.kompakt.commonUi.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DashedHorizontalDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.LightGray,
    thickness: Dp = 1.dp
) {
    Divider(modifier = modifier.fillMaxWidth(), color = color, thickness = thickness)
}

@Composable
fun DashedVerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.LightGray,
    thickness: Dp = 1.dp
) {
    Divider(modifier = modifier.fillMaxHeight(), color = color, thickness = thickness)
}
