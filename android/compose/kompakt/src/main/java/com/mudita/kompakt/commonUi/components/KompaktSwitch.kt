package com.mudita.kompakt.commonUi.components

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.mudita.kompakt.commonUi.colorBlack

@Composable
fun KompaktSwitch(
    modifier: Modifier = Modifier,
    isSwitchedOn: Boolean,
    height: Dp,
    width: Dp,
    horizontalTouchAreaPadding: Dp = Dp.Unspecified,
    verticalTouchAreaPadding: Dp = Dp.Unspecified,
    onSwitch: (Boolean) -> Unit
) {
    Switch(
        modifier = modifier,
        checked = isSwitchedOn,
        onCheckedChange = { onSwitch(it) },
        colors = SwitchDefaults.colors(checkedThumbColor = colorBlack, checkedTrackColor = colorBlack)
    )
}
