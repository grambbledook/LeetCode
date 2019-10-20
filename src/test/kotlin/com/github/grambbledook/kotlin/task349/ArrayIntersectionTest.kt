package com.github.grambbledook.kotlin.task349

import com.github.grambbledook.java.task349.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArrayIntersectionTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
        Assertions.assertArrayEquals(intArrayOf(2), result)
    }

}