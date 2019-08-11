package com.github.grambbledook.kotlin.task1

import com.github.grambbledook.java.task1.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assertions.assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.twoSum(intArrayOf(3, 2 ,4), 6)
        Assertions.assertArrayEquals(intArrayOf(1, 2), result)
    }

}
