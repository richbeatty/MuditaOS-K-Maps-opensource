package com.mudita.kompakt.commonUi.components.appBar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mudita.kompakt.commonUi.KompaktTypography900
import com.mudita.kompakt.commonUi.colorBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KompaktTopAppBar(
    title: String,
    navigationIconResId: Int,
    barHeight: Dp = 56.dp,
    onNavigationIconClick: () -> Unit,
    actionView: @Composable () -> Unit = {}
) {
    TopAppBar(
        modifier = Modifier,
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(painter = painterResource(id = navigationIconResId), contentDescription = null)
            }
        },
        title = {
            Text(text = title, style = KompaktTypography900.titleMedium, color = colorBlack, maxLines = 1, overflow = TextOverflow.Ellipsis)
        },
        actions = { actionView() },
        windowInsets = androidx.compose.foundation.layout.WindowInsets(0)
    )
}
