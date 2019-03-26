package com.github.grambbledook.kotlin.task215

import com.github.grambbledook.kotlin.common.QuickselectSedgwick
import org.junit.jupiter.api.Assertions

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
//        Quickselect.sort(nums, lo = 0, hi = nums.size - 1, k = k)
        QuickselectSedgwick.select(nums, k)
        return nums[k - 1]
    }
}

fun main(args: Array<String>) {
    val case1 = listOf(3, 2, 1, 5, 6, 4)
    val case2 = listOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
    val case3 = listOf(-1, -1)
    val case4 = listOf(5, 3, 1, 2, 6, 7, 8, 5, 5)
    val test = Solution()

    Assertions.assertEquals(5, test.findKthLargest(case1.toIntArray(), 2))
    Assertions.assertEquals(4, test.findKthLargest(case2.toIntArray(), 4))
    Assertions.assertEquals(-1, test.findKthLargest(case3.toIntArray(), 2))
    Assertions.assertEquals(8, test.findKthLargest(case4.toIntArray(), 1))
}