package com.github.grambbledook.kotlin.task73

import com.github.grambbledook.java.task73.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PermutationsTest {

    val test = Solution()


    @Test
    fun `test case 1`() {
        val input = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
        )
        val expected = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 1)
        )
        test.setZeroes(input)

        input.forEachIndexed { idx, row ->
            Assertions.assertArrayEquals(expected[idx], row)
        }
    }

    @Test
    fun `test case 2`() {
        val input = arrayOf(
                intArrayOf(0, 1, 2, 0),
                intArrayOf(3, 4, 5, 2),
                intArrayOf(1, 3, 1, 5)
        )
        val expected = arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 4, 5, 0),
                intArrayOf(0, 3, 1, 0)
        )
        test.setZeroes(input)

        input.forEachIndexed { idx, row ->
            Assertions.assertArrayEquals(expected[idx], row)
        }
    }

}