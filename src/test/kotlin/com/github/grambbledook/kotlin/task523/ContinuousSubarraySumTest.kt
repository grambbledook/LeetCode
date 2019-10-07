package com.github.grambbledook.kotlin.task523

import com.github.grambbledook.java.task523.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ContinuousSubarraySumTest {

    val test = Solution()
//
    @Test
    fun `test case 1`() {
        val result = test.checkSubarraySum(intArrayOf(23, 2, 4, 6, 7), 6)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 2`() {
        val result = test.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 6)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 3`() {
        val result = test.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), -6)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 4`() {
        val result = test.checkSubarraySum(intArrayOf(0, 0), 0)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 5`() {
        val result = test.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 0)
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 6`() {
        val result = test.checkSubarraySum(intArrayOf(0, 0), -1)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 7`() {
        val result = test.checkSubarraySum(intArrayOf(23, 6, 9), 6)
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 8`() {
        val result = test.checkSubarraySum(intArrayOf(1, 1), 2)
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 9`() {
        val result = test.checkSubarraySum(intArrayOf(23, 0, 0), 6)
        Assertions.assertTrue(result)
    }

}