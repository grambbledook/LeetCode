package com.github.grambbledook.kotlin.task324

object Solution {
    fun wiggleSort(nums: IntArray): IntArray {
        nums.sortDescending()
//        Quickselect.sort(nums, 0, nums.size -1, nums.size / 2 + 1)
//        QuickselectSedgwick.select(nums, nums.size / 2 + 1)
        return wiggle(nums)
    }

    private fun wiggle(nums: IntArray): IntArray {
        val array = if (nums.size % 2 == 0) wiggleEven(nums, nums.size / 2 - 1)
        else wiggleOdd(nums, nums.size / 2)

        array.forEachIndexed { idx, v -> nums[idx] = v }
        return nums
    }

    private fun wiggleOdd(nums: IntArray, median: Int): IntArray {
        val array = IntArray(nums.size)

        var l = 1
        var r = 2

        array[0] = nums[median]

        for (i in 0 until median) {
            array[l] = nums[i]
            l += 2
        }
        for (i in 1 until median + 1) {
            array[r] = nums[median + i]
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
            array[l] = nums[i]
            l += 2
        }
        for (i in 0 until median) {
            array[r] = nums[nums.size - median + i]
            r += 2
        }
        return array
    }

}