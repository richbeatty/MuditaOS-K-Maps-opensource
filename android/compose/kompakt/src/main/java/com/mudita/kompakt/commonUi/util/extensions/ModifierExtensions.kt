package com.mudita.kompakt.commonUi.util.extensions

import androidx.compose.ui.Modifier

fun Modifier.conditional(condition: Boolean, modifier: Modifier.() -> Modifier): Modifier {
    return if (condition) { this.modifier() } else { this }
}
