package com.github.grambbledook.kotlin.task684

import com.github.grambbledook.java.task684.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RedundantConnectionTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.findRedundantConnection(arrayOf(
                intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3)
        ))

        Assertions.assertArrayEquals(intArrayOf(2, 3), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.findRedundantConnection(arrayOf(
                intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 4), intArrayOf(1, 5)
        ))

        Assertions.assertArrayEquals(intArrayOf(1, 4), result)
    }

    @Test
    fun `test case 3`() {
        val result = test.findRedundantConnection(arrayOf(
                intArrayOf(1, 3), intArrayOf(3, 4), intArrayOf(1, 5), intArrayOf(3, 5), intArrayOf(2, 3)
        ))

        Assertions.assertArrayEquals(intArrayOf(3, 5), result)
    }

}