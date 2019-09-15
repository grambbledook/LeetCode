package com.github.grambbledook.kotlin.task796

import com.github.grambbledook.java.task796.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateStringTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.rotateString("abcde", "eabcd")
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 2`() {
        val result = test.rotateString("aa", "a")
        Assertions.assertFalse(result)
    }

}