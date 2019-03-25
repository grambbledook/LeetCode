package com.github.grambbledook.kotlin.task324

import com.github.grambbledook.kotlin.common.Quickstort


class Solution {
    fun wiggleSort(nums: IntArray) {
        Quickstort.sort(nums, lo = 0, hi = nums.size - 1, k = nums.size / 2 + 1)

        println("Sorted: " + nums.toList())
        return wiggle(nums)
    }

    private fun wiggle(nums: IntArray) {
        val median = if (nums.size % 2 == 0) nums.size / 2 - 1 else nums.size / 2
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[median]

        for (i in 1 until median +1) {
            array[l] = nums[median - i]
            l += 2
        }
        for (i in 1 until median+1) {
            array[r] = nums[nums.size - i]
            r += 2
        }

        array.forEachIndexed { idx, v -> nums[idx] = v }
    }

}

/*
__
1 1 1 4 6 5
    M


 */


fun main(args: Array<String>) {
    val case1 = listOf(1, 5, 1, 1, 6, 4).toIntArray()
    val case2 = listOf(1, 3, 2, 2, 3, 1).toIntArray()
    val case3 = listOf(1, 1, 2, 1, 2, 2, 1).toIntArray()
    val case4 = listOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2).toIntArray()

    exec(case1)
    exec(case2)
    exec(case3)
    exec(case4)

}

private fun exec(nums: IntArray) {
    println("Before: " + nums.toList())
    Solution().wiggleSort(nums)
    println("After: " + nums.toList())
    println("\n")
}

