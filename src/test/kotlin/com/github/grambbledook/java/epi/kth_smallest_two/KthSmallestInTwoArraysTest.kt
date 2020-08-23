package com.github.grambbledook.java.epi.kth_smallest_two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class KthSmallestInTwoArraysTest {
    val test = KthSmallestInTwoArrays()

    @Test
    fun `test case 1`() {
        val result = test.kthSmallest(
                intArrayOf(1, 2, 3, 4 ,5),
                intArrayOf(6, 7, 8, 9, 10),
                3
        )

        Assertions.assertEquals(8, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.kthSmallest(
                intArrayOf(1, 2, 3, 4 ,5),
                intArrayOf(6, 7, 8, 9, 10),
                8
        )

        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.kthSmallest(
                intArrayOf(1, 2, 3, 4 ,5),
                intArrayOf(6, 7, 8, 9, 9),
                3
        )

        Assertions.assertEquals(7, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.kthSmallest(
                intArrayOf(1, 2, 2, 3),
                intArrayOf(1, 2, 2, 3, 3),
                3
        )

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 5`() {
        val result = test.kthSmallest(
                intArrayOf(1, 2, 3),
                intArrayOf(1, 2, 3),
                4
        )

        Assertions.assertEquals(-1, result)
    }

}