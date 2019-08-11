package com.github.grambbledook.kotlin

import com.github.grambbledook.java.SubarrayWithSum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubarrayWithSumTest {

    val test = SubarrayWithSum()

    @Test
    fun `test case 1`() {
        val inpt = intArrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
        val result = test.find(inpt, 15)
        Assertions.assertArrayEquals(intArrayOf(2, 4), result)

    }

    @Test
    fun `test case 2`() {
        val inpt = intArrayOf(7, 1, 65, 3, 1, 2, 17, 46, 22)
        val result = test.find(inpt, 20)
        Assertions.assertArrayEquals(intArrayOf(4, 6), result)

    }

    @Test
    fun `test case 3`() {
        val inpt = intArrayOf(99, 2, 1, 99)
        val result = test.find(inpt, 100)
        Assertions.assertArrayEquals(intArrayOf(2, 3), result)

    }
}