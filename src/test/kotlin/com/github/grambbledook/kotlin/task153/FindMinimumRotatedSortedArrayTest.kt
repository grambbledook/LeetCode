package com.github.grambbledook.kotlin.task153

import com.github.grambbledook.leetcode.task153.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindMinimumRotatedSortedArrayTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.findMin(intArrayOf(3, 4, 5, 1, 2))
        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2))
        Assertions.assertEquals(0, result)
    }

}