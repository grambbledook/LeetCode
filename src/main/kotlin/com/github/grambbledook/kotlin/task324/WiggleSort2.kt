package com.github.grambbledook.kotlin.task324

object Solution {
    fun wiggleSort(nums: IntArray): IntArray {
        nums.sortDescending()
//        Quickselect.sort(nums, 0, nums.size -1, nums.size / 2 + 1)
//        QuickselectSedgwick.select(nums, nums.size / 2 + 1)
        return wiggle(nums)
    }

    private fun wiggle(nums: IntArray): IntArray {
        val array = if (nums.size % 2 == 0) wiggle(nums, nums.size / 2 - 1)
        else wiggle(nums, nums.size / 2 - 1)

        array.forEachIndexed { idx, v -> nums[idx] = v }
        return nums
    }

    private fun wiggle(nums: IntArray, median: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 0

        for (i in 0 until median + 1) {
            array[l] = nums[i]
            l += 2
        }
        for (i in 1 until median + 2 + nums.size % 2) {
            val idx = median + i
            array[r] = nums[idx]
            r += 2
        }
        return array
    }

}