package com.github.grambbledook.kotlin.task9

import com.github.grambbledook.java.task9.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PalindromeNumberTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.isPalindrome(121)

        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 2`() {
        val result = test.isPalindrome(-121)

        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 3`() {
        val result = test.isPalindrome(10)

        Assertions.assertFalse(result)
    }
}