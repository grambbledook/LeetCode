package com.github.grambbledook.kotlin.task324

import com.github.grambbledook.kotlin.common.Quickselect


class Solution {
    fun wiggleSort(nums: IntArray) {
        Quickselect.sort(nums, lo = 0, hi = nums.size - 1, k = nums.size / 2 + 1)

        println("Sorted: " + nums.toList())
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
        for (i in 0 until median ) {
            array[r] = nums[nums.size - i -1]
            r += 2
        }
        return array
    }

}

/*
1 1 1 4 6 5
1 1 2 2 3 3

m h l h l m
2 3 1 3 1 2
1 5 1 6 1 4


 */


fun main(args: Array<String>) {
    val case1 = listOf(1, 5, 1, 1, 6, 4)
    val case2 = listOf(1, 3, 2, 2, 3, 1)
    val case3 = listOf(1, 1, 2, 1, 2, 2, 1)
    val case4 = listOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2)
    val case5 = listOf(4, 5, 5, 6)
    val case6 = listOf(4,5,5,5,5,6,6,6)

    exec(case1)
    exec(case2)
    exec(case3)
    exec(case4)
    exec(case5)
    exec(case6)

}

private fun exec(nums: List<Int>) {
    println("Before: $nums")

    nums.toIntArray().also {
        Solution().wiggleSort(it)
        println("After: ${it.toList()}")
    }

    println("\n")
}

