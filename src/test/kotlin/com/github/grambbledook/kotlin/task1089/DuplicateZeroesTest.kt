package com.github.grambbledook.kotlin.task1089

import com.github.grambbledook.java.task1089.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DuplicateZeroesTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)

        test.duplicateZeros(input)
        Assertions.assertArrayEquals(intArrayOf(1, 0, 0, 2, 3, 0, 0, 4), input)
    }

    @Test
    fun `test case 2`() {
        val input = intArrayOf(0, 1, 7, 6, 0, 2, 0, 7)

        test.duplicateZeros(input)
        Assertions.assertArrayEquals(intArrayOf(0, 0, 1, 7, 6, 0, 0, 2), input)
    }

    @Test
    fun `test case 3`() {
        val input = intArrayOf(8, 4, 5, 0, 0, 0, 0, 7)

        test.duplicateZeros(input)
        Assertions.assertArrayEquals(intArrayOf(8, 4, 5, 0, 0, 0, 0, 0), input)
    }
}