package com.github.grambbledook.kotlin.task1019

import com.github.grambbledook.java.task1019.Solution
import com.github.grambbledook.kotlin.common.list
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NextGreaterNodeInListTest {

    val test = Solution()

    @Test
    fun `test case 0`() {
        val result = test.nextLargerNodes(null)
        Assertions.assertArrayEquals(intArrayOf(), result)
    }

    @Test
    fun `test case 1`() {
        val result = test.nextLargerNodes(list(2, 1, 5))
        Assertions.assertArrayEquals(intArrayOf(5, 5, 0), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.nextLargerNodes(list(2, 7, 4, 3, 5))
        Assertions.assertArrayEquals(intArrayOf(7, 0, 5, 5, 0), result)
    }

    @Test
    fun `test case 3`() {
        val result = test.nextLargerNodes(list(1, 7, 5, 1, 9, 2, 5, 1))
        Assertions.assertArrayEquals(intArrayOf(7, 9, 9, 9, 0, 5, 0, 0), result)
    }

    @Test
    fun `test case 4`() {
        val result = test.nextLargerNodes(list(9, 7, 6, 7, 6, 9))
        Assertions.assertArrayEquals(intArrayOf(0, 9, 7, 9, 9, 0), result)
    }

    @Test
    fun `test case 5`() {
        val result = test.nextLargerNodes(list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
        Assertions.assertArrayEquals(intArrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 0), result)
    }

    @Test
    fun `test case 6`() {
        val result = test.nextLargerNodes(list(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
        Assertions.assertArrayEquals(intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), result)
    }

}