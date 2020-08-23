package com.github.grambbledook.kotlin

import com.github.grambbledook.java.task367.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidPerfectSquareTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        Assertions.assertFalse(test.isPerfectSquare(14))
    }

    @Test
    fun `test case 2`() {
        Assertions.assertTrue(test.isPerfectSquare(16))
    }

    @Test
    fun `test case 3`() {
        Assertions.assertFalse(test.isPerfectSquare(2147483647))
    }

    @Test
    fun `test case 4`() {
        Assertions.assertTrue(test.isPerfectSquare(2147395600))
    }
}