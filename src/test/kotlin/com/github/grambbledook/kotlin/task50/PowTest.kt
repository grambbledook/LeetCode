package com.github.grambbledook.kotlin.task50

import com.github.grambbledook.java.task50.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PowTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.myPow(2.0, 10)

        Assertions.assertEquals(1024.0, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.myPow(2.1, 3)

        Assertions.assertEquals(9.261, result, 0.0001)
    }

    @Test
    fun `test case 3`() {
        val result = test.myPow(2.0, -2)

        Assertions.assertEquals(0.25000, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.myPow(2.0, Int.MIN_VALUE)

        Assertions.assertEquals(0.0, result, 0.0000001)
    }

    @Test
    fun `test case 5`() {
        val result = test.myPow(2.0, -2147483648 + 1)

        Assertions.assertEquals(0.0, result, 0.0000001)
    }

}