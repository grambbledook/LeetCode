package com.github.grambbledook.kotlin.task56

import com.github.grambbledook.java.task56.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeIntervalsTest {

    val test = Solution()

    @Test
    fun `test case 0`() {
        val result = test.merge(arrayOf(intArrayOf(1, 3)))

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(1,3)))
    }

    @Test
    fun `test case 1`() {
        val result = test.merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(1,6), intArrayOf(8, 10), intArrayOf(15, 18)))
    }

    @Test
    fun `test case 2`() {
        val result = test.merge(arrayOf(intArrayOf(1, 3), intArrayOf(3, 5)))

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(1,5)))
    }

    @Test
    fun `test case 3`() {
        val result = test.merge(arrayOf())

        Assertions.assertArrayEquals(result, arrayOf<IntArray>())
    }

    @Test
    fun `test case 4`() {
        val result = test.merge(null)

        Assertions.assertArrayEquals(result, arrayOf<IntArray>())
    }

}