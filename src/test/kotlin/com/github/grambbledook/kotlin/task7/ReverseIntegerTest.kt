package com.github.grambbledook.kotlin.task7

import com.github.grambbledook.java.task7.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReverseIntegerTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.reverse(123)

        Assertions.assertEquals(321, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.reverse(-123)

        Assertions.assertEquals(-321, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.reverse(120)

        Assertions.assertEquals(21, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.reverse(1534236469)

        Assertions.assertEquals(0, result)
    }
}