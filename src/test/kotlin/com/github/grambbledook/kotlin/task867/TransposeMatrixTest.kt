package com.github.grambbledook.kotlin.task867

import com.github.grambbledook.java.task867.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TransposeMatrixTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = arrayOf(
                intArrayOf(1)
        )
        val expected = arrayOf(
                intArrayOf(1)
        )
        val result = test.transpose(input)

        Assertions.assertArrayEquals(expected, result)
    }


    @Test
    fun `test case 2`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3)
        )
        val expected = arrayOf(
                intArrayOf(1), intArrayOf(2), intArrayOf(3)
        )
        val result = test.transpose(input)

        Assertions.assertArrayEquals(expected, result)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(
                intArrayOf(1),
                intArrayOf(2),
                intArrayOf(3)
        )
        val expected = arrayOf(
                intArrayOf(1, 2, 3)
        )
        val result = test.transpose(input)

        Assertions.assertArrayEquals(expected, result)
    }

    @Test
    fun `test case 4`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
        )
        val expected = arrayOf(
                intArrayOf(1, 4, 7),
                intArrayOf(2, 5, 8),
                intArrayOf(3, 6, 9)
        )
        val result = test.transpose(input)

        Assertions.assertArrayEquals(expected, result)
    }

    @Test
    fun `test case 5`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6)
        )
        val expected = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(2, 5),
                intArrayOf(3, 6)
        )
        val result = test.transpose(input)

        Assertions.assertArrayEquals(expected, result)
    }

}