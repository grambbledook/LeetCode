package com.github.grambbledook.leetcode.task153

class Solution {

    fun findMin(nums: IntArray): Int {
        if (nums.size == 1) return nums.first()

        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val mid = (l + r) / 2
            if (nums[mid] < nums[r]) r = mid
            else l = mid + 1

        }
        return nums[l]
    }

}