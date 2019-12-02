package com.github.grambbledook.kotlin.task503

import com.github.grambbledook.java.task503.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NextGreaterElementIiTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.nextGreaterElements(intArrayOf(1, 2, 1))

        Assertions.assertArrayEquals(intArrayOf(2, -1, 2), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.nextGreaterElements(intArrayOf(1, 2, 1, 3, 4, 5))

        Assertions.assertArrayEquals(intArrayOf(2, 3, 3, 4,  5, -1), result)
    }
}