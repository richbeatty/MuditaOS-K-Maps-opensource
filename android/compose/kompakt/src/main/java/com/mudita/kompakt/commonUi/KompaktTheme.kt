package com.mudita.kompakt.commonUi

import androidx.compose.runtime.Composable

enum class KompaktButtonAttributes { Small, Medium, Large }

object KompaktTheme {
    val buttonStyle: ButtonStyles = ButtonStyles()
}

data class ButtonStyles(val large: KompaktButtonAttributes = KompaktButtonAttributes.Large)

@Composable
fun KompaktTheme(content: @Composable () -> Unit) {
    content()
}
