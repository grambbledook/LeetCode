package com.github.grambbledook.kotlin.task215

import com.github.grambbledook.leetcode.task215.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindKthLargestTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2)
        Assertions.assertEquals(5, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4)
        Assertions.assertEquals(4, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.findKthLargest(intArrayOf(-1, -1), 2)
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.findKthLargest(intArrayOf(5, 3, 1, 2, 6, 7, 8, 5, 5), 1)
        Assertions.assertEquals(8, result)
    }

    @Test
    fun `test case 5`() {
        val result = test.findKthLargest(intArrayOf(6,1, 2, 4, 8, 0), 3)
        Assertions.assertEquals(4, result)
    }
}