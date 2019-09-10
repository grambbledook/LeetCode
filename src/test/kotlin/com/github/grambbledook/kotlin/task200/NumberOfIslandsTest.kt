package com.github.grambbledook.kotlin.task200

import com.github.grambbledook.java.task200.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberOfIslandsTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = arrayOf(charArrayOf('1', '0', '1', '0', '1'))

        val result = test.numIslands(input)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 2`() {
        val input = arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '0', '0', '0', '0')
        )

        val result = test.numIslands(input)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1')
        )

        val result = test.numIslands(input)
        Assertions.assertEquals(3, result)
    }
}