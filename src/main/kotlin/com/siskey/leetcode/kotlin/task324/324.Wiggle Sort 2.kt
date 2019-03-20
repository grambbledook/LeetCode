package com.siskey.leetcode.kotlin.task324

import com.siskey.leetcode.util.timed

class Solution {
    fun wiggleSort(nums: List<Int>): List<Int> {
        return quicksort(nums.toIntArray(), nums.size / 2).toList()
    }

    fun quicksort(nums: IntArray, k: Int): IntArray {
        sort(nums, lo = 0, hi = nums.size - 1, k = k)

        wiggle(nums)

        return nums
    }

    private fun wiggle(nums: IntArray) {
        val median = nums.size / 2

        for (i in 0 until median) {
            val tmp = nums[i + 1]
            nums[i + 1] = nums[median + i]
            nums[median + 1] = tmp
        }
    }

    private tailrec fun sort(nums: IntArray, lo: Int, hi: Int, k: Int) {
        if (lo >= hi) return

        val p = partition(nums, lo, hi)

        if (k <= p) sort(nums, lo, p - 1, k)
        else sort(nums, p + 1, hi, k)
    }

    private fun partition(nums: IntArray, lo: Int, hi: Int): Int {
        val p = nums[hi]
        var i = lo
        for (j in lo until hi) {
            if (nums[j] < p) {
                swap(nums, i, j)
                i++
            }
        }
        swap(nums, i, hi)
        return i
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}


fun main(args: Array<String>) {
    val case1 = listOf(1, 5, 1, 1, 6, 4)
    val case2 = listOf(1, 3, 2, 2, 3, 1)

    val test = Solution()

    timed("First case [$case1]", 5) { test.wiggleSort(case1) }
    timed("Second case [$case2]", 4) { test.wiggleSort(case2) }
}

