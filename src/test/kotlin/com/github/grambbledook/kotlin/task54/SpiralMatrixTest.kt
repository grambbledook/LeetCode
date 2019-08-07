package com.github.grambbledook.kotlin.task54

import com.github.grambbledook.java.task54.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SpiralMatrixTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
        )
        val expected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 2`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12)
        )
        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
                intArrayOf(10, 11, 12)
        )
        val expected = listOf(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 4`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3)
        )
        val expected = listOf(1, 2, 3)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 5`() {
        val input = arrayOf(
                intArrayOf(1),
                intArrayOf(2),
                intArrayOf(3)
        )
        val expected = listOf(1, 2, 3)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 6`() {
        val input = arrayOf(
                intArrayOf(2, 3, 4),
                intArrayOf(5, 6, 7),
                intArrayOf(8, 9, 10),
                intArrayOf(11, 12, 13),
                intArrayOf(14, 15, 16)
        )
        val expected = listOf(2, 3, 4, 7, 10, 13, 16, 15, 14, 11, 8, 5, 6, 9, 12)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 7`() {
        val input = arrayOf(
                intArrayOf(2, 5),
                intArrayOf(8, 4),
                intArrayOf(0, -1)
        )
        val expected = listOf(2, 5, 4, -1, 0, 8)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 8`() {
        val input = arrayOf(
                intArrayOf(2, 5),
                intArrayOf(8, 4)
        )
        val expected = listOf(2, 5, 4, 8)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 9`() {
        val input = arrayOf(
                intArrayOf(2, 5, 8),
                intArrayOf(4, 0, -1)
        )
        val expected = listOf(2, 5, 8, -1, 0, 4)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 10`() {
        val input = arrayOf<IntArray>()
        val expected = emptyList<Int>()
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `test case 11`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                intArrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        )
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
        val result = test.spiralOrder(input)

        Assertions.assertEquals(expected, result)
    }

}