package com.github.grambbledook.kotlin.task48

import com.github.grambbledook.java.task48.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateImageTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = arrayOf(
                intArrayOf(1)
        )
        val expected = arrayOf(
                intArrayOf(1)
        )
        test.rotate(input)

        Assertions.assertArrayEquals(expected, input)
    }

    @Test
    fun `test case 2`() {
        val input = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4)
        )
        val expected = arrayOf(
                intArrayOf(3, 1),
                intArrayOf(4, 2)
        )
        test.rotate(input)

        Assertions.assertArrayEquals(expected, input)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
        )
        val expected = arrayOf(
                intArrayOf(7, 4, 1),
                intArrayOf(8, 5, 2),
                intArrayOf(9, 6, 3)
        )
        test.rotate(input)

        Assertions.assertArrayEquals(expected, input)
    }

    @Test
    fun `test case 4`() {
        val input = arrayOf(
                intArrayOf(5, 1, 9, 11),
                intArrayOf(2, 4, 8, 10),
                intArrayOf(13, 3, 6, 7),
                intArrayOf(15, 14, 12, 16)
        )
        val expected = arrayOf(
                intArrayOf(15, 13, 2, 5),
                intArrayOf(14, 3, 4, 1),
                intArrayOf(12, 6, 8, 9),
                intArrayOf(16, 7, 10, 11)
        )
        test.rotate(input)

        Assertions.assertArrayEquals(expected, input)
    }

}