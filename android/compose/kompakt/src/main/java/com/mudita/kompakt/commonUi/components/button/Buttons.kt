package com.mudita.kompakt.commonUi.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mudita.kompakt.commonUi.KompaktButtonAttributes
import com.mudita.kompakt.commonUi.KompaktTypography500
import com.mudita.kompakt.commonUi.colorBlack

@Composable
fun KompaktPrimaryButton(
    modifier: Modifier = Modifier,
    iconResId: Int? = null,
    text: String? = null,
    size: KompaktButtonAttributes = KompaktButtonAttributes.Medium,
    attributes: KompaktButtonAttributes = size,
    enabled: Boolean = true,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit = {
        if (iconResId != null) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = text,
                modifier = Modifier.size(20.dp)
            )
        }
        text?.let { Text(text = it, style = KompaktTypography500.labelMedium) }
    }
) {
    ElevatedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        content = content
    )
}

@Composable
fun KompaktSecondaryButton(
    modifier: Modifier = Modifier,
    iconResId: Int? = null,
    text: String? = null,
    size: KompaktButtonAttributes = KompaktButtonAttributes.Medium,
    attributes: KompaktButtonAttributes = size,
    enabled: Boolean = true,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit = {
        if (iconResId != null) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = text,
                modifier = Modifier.size(20.dp)
            )
        }
        text?.let { Text(text = it, style = KompaktTypography500.labelMedium, color = colorBlack) }
    }
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        border = BorderStroke(1.dp, colorBlack),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = colorBlack)
    ) {
        content()
    }
}
