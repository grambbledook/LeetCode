package com.github.grambbledook.kotlin.common

sealed abstract class SortOrder {
    object Asc: SortOrder() {
        override fun compare(l: Int, r: Int) = l <= r
    }

    object Desc: SortOrder() {
        override fun compare(l: Int, r: Int) = l >= r
    }

    abstract fun compare(l: Int, r: Int): Boolean
}