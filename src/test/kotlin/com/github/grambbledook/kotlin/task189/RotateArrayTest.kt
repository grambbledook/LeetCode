package com.github.grambbledook.kotlin.task189

import com.github.grambbledook.java.task189.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateArrayTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val ints = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        test.rotate(ints, 3)
        Assertions.assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), ints)
    }

    @Test
    fun `test case 2`() {
        val ints = intArrayOf(-1, -100, 3, 99)
        test.rotate(ints, 2)
        Assertions.assertArrayEquals(intArrayOf(3, 99, -1, -100), ints)
    }

    @Test
    fun `test case 3`() {
        val ints = intArrayOf(-1)
        test.rotate(ints, 2)
        Assertions.assertArrayEquals(intArrayOf(-1), ints)
    }
}