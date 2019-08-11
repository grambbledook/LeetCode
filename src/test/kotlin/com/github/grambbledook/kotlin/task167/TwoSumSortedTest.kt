package com.github.grambbledook.kotlin.task167

import com.github.grambbledook.java.task167.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumSortedTest {

    private val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assertions.assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.twoSum(intArrayOf(2, 3 ,4), 6)
        Assertions.assertArrayEquals(intArrayOf(1, 3), result)
    }

    @Test
    fun `test case 3`() {
        val result = test.twoSum(intArrayOf(1, 2 ,3, 4, 5), 6)
        Assertions.assertArrayEquals(intArrayOf(1, 5), result)
    }

    @Test
    fun `test case 4`() {
        val result = test.twoSum(intArrayOf(5, 25, 75), 100)
        Assertions.assertArrayEquals(intArrayOf(2, 3), result)
    }

}
