package com.github.grambbledook.kotlin

import com.github.grambbledook.leetcode.task686.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RepeatedStringMatchTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.repeatedStringMatch("abcd", "cdabcdab")
        Assertions.assertEquals(3, result)
    }
}