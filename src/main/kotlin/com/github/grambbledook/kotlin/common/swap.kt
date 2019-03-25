package com.github.grambbledook.kotlin.common

fun swap(nums: IntArray, l: Int, r: Int) {
    val tmp = nums[r]
    nums[r] = nums[l]
    nums[l] = tmp
}