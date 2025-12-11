package com.mudita.kompakt.commonUi.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun KompaktIconButton(
    modifier: Modifier = Modifier,
    iconResId: Int,
    iconSize: Dp = 24.dp,
    onClick: () -> Unit,
    touchAreaPadding: androidx.compose.foundation.layout.PaddingValues = androidx.compose.foundation.layout.PaddingValues(0.dp),
    enabled: Boolean = true,
    content: @Composable (() -> Unit)? = null
) {
    KompaktIconButton(
        modifier = modifier,
        iconResId = iconResId,
        iconSize = iconSize,
        touchAreaPadding = touchAreaPadding,
        enabled = enabled,
        onClick = onClick,
        content = content
    )
}

@Composable
fun KompaktIconButton(
    modifier: Modifier = Modifier,
    iconResId: Int? = null,
    iconSize: Dp = 24.dp,
    touchAreaPadding: androidx.compose.foundation.layout.PaddingValues = androidx.compose.foundation.layout.PaddingValues(0.dp),
    enabled: Boolean = true,
    onClick: () -> Unit,
    content: @Composable (() -> Unit)? = null
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.padding(touchAreaPadding),
        enabled = enabled
    ) {
        when {
            content != null -> content()
            iconResId != null -> Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                modifier = Modifier.size(iconSize)
            )
        }
    }
}
