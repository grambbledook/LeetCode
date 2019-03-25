package com.github.grambbledook.kotlin.task324

import com.github.grambbledook.kotlin.common.Quickselect
import org.junit.jupiter.api.Assertions


class Solution {
    fun wiggleSort(nums: IntArray) {
        Quickselect.sort(nums, lo = 0, hi = nums.size - 1, k = nums.size / 2 + 1)
        return wiggle(nums)
    }

    private fun wiggle(nums: IntArray) {
        val array = if (nums.size % 2 == 0) wiggleEven(nums, nums.size / 2 - 1)
        else wiggleOdd(nums, nums.size / 2)

        array.forEachIndexed { idx, v -> nums[idx] = v }
    }

    private fun wiggleOdd(nums: IntArray, median: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[median]

        for (i in 1 until median + 1) {
            array[l] = nums[median - i]
            l += 2
        }
        for (i in 1 until median + 1) {
            array[r] = nums[nums.size - i]
            r += 2
        }
        return array
    }

    private fun wiggleEven(nums: IntArray, median: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[nums.size / 2]
        array[nums.size - 1] = nums[nums.size / 2 - 1]

        for (i in 0 until median) {
            array[l] = nums[median - i - 1]
            l += 2
        }
        for (i in 0 until median - 1) {
            array[r] = nums[nums.size - median + 1 + i]
            r += 2
        }
        return array
    }

}
// L L L M M H H H
// 4 5 5 5 5 6 6 6
// M H L H L H L M
// 5 6 5 6 5 6 4 5

fun main(args: Array<String>) {
    exec(listOf(1, 5, 1, 1, 6, 4))
    exec(listOf(1, 3, 2, 2, 3, 1))
    exec(listOf(1, 1, 2, 1, 2, 2, 1))
    exec(listOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2))
    exec(listOf(4, 5, 5, 6))
    exec(listOf(4, 5, 5, 5, 5, 6, 6, 6))
}

private fun exec(nums: List<Int>) {
    print("Test case : $nums. ")

    nums.toIntArray().also {
        Solution().wiggleSort(it)
        assertWiggled(it)
    }


    println("Passed. \n")
}

fun assertWiggled(nums: IntArray) {
    var last = nums[0]

    for (i in 1 until nums.size) {
        val invariant = if (i % 2 == 1) last < nums[i] else last > nums[i]
        last = nums[i]

        Assertions.assertTrue(invariant, "${nums.toList()}")
    }

}