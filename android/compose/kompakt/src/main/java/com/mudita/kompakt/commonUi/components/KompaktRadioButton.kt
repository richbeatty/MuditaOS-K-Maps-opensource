package com.mudita.kompakt.commonUi.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mudita.kompakt.commonUi.colorBlack

@Composable
fun KompaktRadioButton(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    isSwitchedOn: Boolean,
    touchAreaPadding: Dp = Dp.Unspecified,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit
) {
    RadioButton(
        modifier = modifier.size(size),
        selected = isSwitchedOn,
        onClick = { onCheckedChange(!isSwitchedOn) },
        enabled = enabled,
        colors = RadioButtonDefaults.colors(selectedColor = colorBlack)
    )
}
