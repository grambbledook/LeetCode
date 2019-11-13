package com.github.grambbledook.kotlin

import com.github.grambbledook.java.task861.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ScoreAfterFlippingMatrixTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.matrixScore(arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1)
        ))

        Assertions.assertEquals(21, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.matrixScore(arrayOf(
                intArrayOf(0, 1, 1),
                intArrayOf(0, 1, 1),
                intArrayOf(0, 1, 1)
        ))

        Assertions.assertEquals(21, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.matrixScore(arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 1, 1)
        ))

        Assertions.assertEquals(18, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.matrixScore(arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 0, 0)
        ))

        Assertions.assertEquals(21, result)
    }

    @Test
    fun `test case 5`() {
        val result = test.matrixScore(arrayOf(
                intArrayOf(0, 0, 1, 1),
                intArrayOf(1, 0, 1, 0),
                intArrayOf(1, 1, 0, 0)
        ))

        Assertions.assertEquals(39, result)
    }

}