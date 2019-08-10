package com.github.grambbledook.kotlin.task883

import com.github.grambbledook.java.task883.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ProjectionAreaTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = arrayOf(
                intArrayOf(2)
        )

        val result = test.projectionArea(input)
        Assertions.assertEquals(5, result)
    }


    @Test
    fun `test case 2`() {
        val input = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4)
        )

        val result = test.projectionArea(input)
        Assertions.assertEquals(17, result)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(0, 2)
        )

        val result = test.projectionArea(input)
        Assertions.assertEquals(8, result)
    }

    @Test
    fun `test case 4`() {
        val input = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
        )

        val result = test.projectionArea(input)
        Assertions.assertEquals(14, result)
    }

    @Test
    fun `test case 5`() {
        val input = arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 1, 2),
                intArrayOf(2, 2, 2)
        )

        val result = test.projectionArea(input)
        Assertions.assertEquals(21, result)
    }

}