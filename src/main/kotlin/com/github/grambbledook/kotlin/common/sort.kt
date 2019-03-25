package com.github.grambbledook.kotlin.common


object Quickstort {
    tailrec fun sort(nums: IntArray, lo: Int, hi: Int, k: Int) {
        if (lo >= hi) return

        val p = partition(nums, lo, hi)

        if (k <= p) sort(nums, lo, p - 1, k)
        else sort(nums, p + 1, hi, k)
    }

    private fun partition(nums: IntArray, lo: Int, hi: Int): Int {
        val p = nums[hi]
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
