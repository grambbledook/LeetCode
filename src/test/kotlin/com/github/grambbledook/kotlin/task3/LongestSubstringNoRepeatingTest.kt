package com.github.grambbledook.kotlin.task3

import com.github.grambbledook.java.task3.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestSubstringNoRepeatingTest {

    private val test = Solution()

    @Test
    fun `test case 1`() {
        doTest("abcabcdabcde", 5)
    }

    @Test
    fun `test case 2`() {
        doTest("bbbbb", 1)
    }

    @Test
    fun `test case 3`() {
        doTest("pwwkew", 3)
    }

    @Test
    fun `test case 4`() {
        doTest("", 0)
    }

    @Test
    fun `test case 5`() {
        doTest("d", 1)
    }

    @Test
    fun `test case 6`() {
        doTest("dvdf", 3)
    }

    @Test
    fun `test case 7`() {
        doTest("123453678", 6)
    }

    @Test
    fun `test case 8`() {
        doTest("tmmzuxt", 5)
    }

    private fun doTest(input: String, expected: Int) {
        val result = test.lengthOfLongestSubstring(input)
        Assertions.assertEquals(expected, result)
    }

}
