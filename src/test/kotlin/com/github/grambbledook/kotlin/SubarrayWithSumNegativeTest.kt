package com.github.grambbledook.kotlin

import com.github.grambbledook.java.SubarrayWithSumNegative
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubarrayWithSumNegativeTest {

    val test = SubarrayWithSumNegative()

    @Test
    fun `test case 1`() {
        val inpt = intArrayOf(1, 4, 20, 3, 10, 5)
        val result = test.find(inpt, 33)
        Assertions.assertArrayEquals(intArrayOf(2, 4), result)

    }

    @Test
    fun `test case 2`() {
        val inpt = intArrayOf(10, 2, -2, -20, 10)
        val result = test.find(inpt, -10)
        Assertions.assertArrayEquals(intArrayOf(0, 3), result)

    }

    @Test
    fun `test case 3`() {
        val inpt = intArrayOf(-10, 0, 2, -2, -20, 10)
        val result = test.find(inpt, 20)
        Assertions.assertArrayEquals(intArrayOf(-1, -1), result)

    }

}