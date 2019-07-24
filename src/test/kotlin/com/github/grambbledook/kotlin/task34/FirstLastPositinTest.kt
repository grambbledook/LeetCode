package com.github.grambbledook.kotlin.task34

import com.github.grambbledook.java.task34.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstLastPositinTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)
        Assertions.assertArrayEquals(intArrayOf(3, 4), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)
        Assertions.assertArrayEquals(intArrayOf(-1, -1), result)
    }

    @Test
    fun `test case 3`() {
        val result = test.searchRange(intArrayOf(7, 7), 7)
        Assertions.assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `test case 4`() {
        val result = test.searchRange(intArrayOf(1, 2, 2, 2, 2, 2, 2, 2, 4), 2)
        Assertions.assertArrayEquals(intArrayOf(1, 7), result)
    }

    @Test
    fun `test case 5`() {
        val result = test.searchRange(intArrayOf(2, 2, 2, 2, 2, 2, 2, 4), 2)
        Assertions.assertArrayEquals(intArrayOf(0, 6), result)
    }

    @Test
    fun `test case 6`() {
        val result = test.searchRange(intArrayOf(0, 2, 2, 2, 2, 2, 2, 2), 2)
        Assertions.assertArrayEquals(intArrayOf(1, 7), result)
    }

}