package com.github.grambbledook.kotlin.task324


class Solution {
    fun wiggleSort(nums: IntArray) {
        nums.sortDescending()
//        QuickselectSedgwick.select(nums, nums.size / 2 )
        return wiggle(nums)
    }

    private fun wiggle(nums: IntArray) {
        val array = if (nums.size % 2 == 0) wiggleEven(nums, nums.size / 2, 2)
        else wiggleOdd(nums, nums.size / 2, 1)

        array.forEachIndexed { idx, v -> nums[idx] = v }
    }

    private fun wiggleOdd(nums: IntArray, median: Int, offset: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[median]

        for (i in 0 until median) {
            array[l] = nums[i]
            l += 2
        }
        for (i in 0 until median) {
            array[r] = nums[median + i + offset]
            r += 2
        }
        return array
    }

    private fun wiggleEven(nums: IntArray, median: Int, offset: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[median]
        array[nums.size - 1] = nums[median - 1]

        for (i in 0 until median) {
            array[l] = nums[i]
            l += 2
        }
        for (i in 0 until median) {
            array[r % nums.size] = nums[median + i]
            r += 2
        }
        return array
    }

}