package com.github.grambbledook.leetcode.task179

class Solution {

    fun largestNumber(nums: IntArray): String {
        return nums.asSequence()
                .map { it.toString() }
                .sortedWith(Comparator { l, r ->
                    val a = r + l
                    val b = l + r

                    a.compareTo(b)
                })
                .joinToString(EMPTY)
                .handleZero()
    }

    private fun String.handleZero() = when {
        isEmpty() -> ZERO
        startsWith(ZERO) -> ZERO
        else -> this
    }

    companion object {
        const val EMPTY = ""
        const val ZERO = "0"
    }

}