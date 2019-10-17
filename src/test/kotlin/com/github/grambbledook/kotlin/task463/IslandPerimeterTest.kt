package com.github.grambbledook.kotlin.task463

import com.github.grambbledook.java.task468.cycle.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IslandPerimeterTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.islandPerimeter(arrayOf(
                intArrayOf(1)
        ))

        Assertions.assertEquals(4, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.islandPerimeter(arrayOf(
                intArrayOf(1, 1)
        ))

        Assertions.assertEquals(6, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.islandPerimeter(arrayOf(
                intArrayOf(1, 1),
                intArrayOf(1, 0)
        ))

        Assertions.assertEquals(8, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.islandPerimeter(arrayOf(
                intArrayOf(0, 1, 1)
        ))

        Assertions.assertEquals(6, result)
    }

}