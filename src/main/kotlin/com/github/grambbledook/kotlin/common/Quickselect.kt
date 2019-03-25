package com.github.grambbledook.kotlin.common


object Quickselect {
    tailrec fun sort(nums: IntArray, lo: Int, hi: Int, k: Int, order: SortOrder = SortOrder.Desc) {
        if (lo >= hi) return

        val p = partition(nums, lo, hi, order)

        if (k <= p) sort(nums, lo, p - 1, k, order)
        else sort(nums, p + 1, hi, k, order)
    }

    private fun partition(nums: IntArray, lo: Int, hi: Int, order: SortOrder): Int {
        val p = nums[hi]
        var i = lo
        for (j in lo until hi) {
            if (order.compare(nums[j], p)) {
                swap(nums, i, j)
                i++
            }
        }
        swap(nums, i, hi)
        return i
    }

}