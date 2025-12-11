package com.mudita.kompakt.commonUi.components.fakeScroll

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

val LazyListState.canScroll: Boolean
    get() = layoutInfo.totalItemsCount > layoutInfo.visibleItemsInfo.size

@Composable
fun KompaktLazyFakeScroll(
    modifier: Modifier = Modifier,
    listState: LazyListState = rememberLazyListState(),
    content: LazyListScope.() -> Unit
) {
    LazyColumn(modifier = modifier, state = listState, content = content)
}
