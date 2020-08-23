package com.github.grambbledook.kotlin.task1528

import com.github.grambbledook.leetcode.task1528.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ShuffleStringTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.restoreString(s = "codeleet", indices = intArrayOf(4,5,6,7,0,2,1,3))

        Assertions.assertEquals("leetcode", result)
    }
}