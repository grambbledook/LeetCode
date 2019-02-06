package com.siskey.leetcode.task215

import com.siskey.leetcode.util.timed

class SolutionKt {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        return quicksort(nums, k)
    }

    fun sdk(nums: IntArray, k: Int): Int {
        nums.sortDescending()
        return nums[k - 1]
    }

    fun quicksort(nums: IntArray, k: Int): Int {
        quicksort0(nums, lo = 0, hi = nums.size - 1, k = k)
        return nums[k - 1]
    }

    private tailrec fun quicksort0(nums: IntArray, lo: Int, hi: Int, k: Int) {
        if (lo >= hi) return

        val p = partition(nums, lo, hi)

        if (k <= p) quicksort0(nums, lo, p - 1, k)
        else quicksort0(nums, p + 1, hi, k)
    }

    private fun partition(nums: IntArray, lo: Int, hi: Int): Int {
        val p = nums[(lo + hi) / 2]
        var i = lo
        for (j in lo until hi) {
            if (nums[j] >= p) {
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
    val case1 = listOf(3, 2, 1, 5, 6, 4)
    val case2 = listOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
    val case3 = listOf(-1, -1)

    val test = SolutionKt()

    timed("Quicksort-ish First case [$case1]", 5) { test.quicksort(case1.toIntArray(), 2) }
    timed("Quicksort-ish Second case [$case2]", 4) { test.quicksort(case2.toIntArray(), 4) }
    timed("Quicksort-ish Third case [$case3]", -1) { test.quicksort(case3.toIntArray(), 2) }

    timed("Sdk First case [$case1]", 5) { test.sdk(case1.toIntArray(), 2) }
    timed("Sdk Second case [$case2]", 4) { test.sdk(case2.toIntArray(), 4) }
    timed("Sdk Third case [$case3]", -1) { test.sdk(case3.toIntArray(), 2) }
}