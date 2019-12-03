package com.github.grambbledook.kotlin.task283

import com.github.grambbledook.java.task283.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MoveZeroesTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        test.moveZeroes(input)

        Assertions.assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), input)
    }

    @Test
    fun `test case 2`() {
        val input = intArrayOf(4, 2, 4, 0, 0, 3, 0, 5, 1, 0)
        test.moveZeroes(input)

        Assertions.assertArrayEquals(intArrayOf(4, 2, 4, 3, 5, 1, 0, 0, 0, 0), input)
    }

}