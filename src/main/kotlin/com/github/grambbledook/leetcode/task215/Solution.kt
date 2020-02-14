package com.github.grambbledook.leetcode.task215

class Solution {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        quickselect(nums, k)
        return nums[k - 1]
    }

    private fun quickselect(nums: IntArray, k: Int) {
        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val p = partition(nums, l, r)

            if (k <= p) r = p - 1
            else l = p + 1
        }
    }

    private fun partition(nums: IntArray, l: Int, r: Int): Int {
        val p = nums[r]
        var i = l
        for (j in l until r) {
            if (nums[j] >= p) {
                swap(nums, i++, j)
            }
        }
        swap(nums, i, r)
        return i
    }

    private fun swap(nums: IntArray, l: Int, r: Int) {
        val tmp = nums[l]
        nums[l] = nums[r]
        nums[r] = tmp
    }

}
