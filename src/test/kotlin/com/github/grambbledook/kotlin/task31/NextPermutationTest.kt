package com.github.grambbledook.kotlin.task31

import com.github.grambbledook.java.task31.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class NextPermutationTest {

    private val test = Solution()

    @Test
    fun `test case 1`() {
        doTest(intArrayOf(1, 2, 3), expected = intArrayOf(1, 3, 2))
    }

    @Test
    fun `test case 2`() {
        doTest(intArrayOf(1, 3, 2), expected = intArrayOf(2, 1, 3))
    }

    @Test
    fun `test case 3`() {
        doTest(intArrayOf(3, 2, 1), expected = intArrayOf(1, 2, 3))
    }

    @Test
    fun `test case 4`() {
        doTest(intArrayOf(1, 1, 5), expected = intArrayOf(1, 5, 1))
    }

    @Test
    fun `test case 5`() {
        doTest(intArrayOf(3, 1, 2), expected = intArrayOf(3, 2, 1))
    }

    @Test
    fun `test case 6`() {
        doTest(intArrayOf(2, 3, 1), expected = intArrayOf(3, 1, 2))
    }

    @Test
    fun `test case 7`() {
        doTest(intArrayOf(5, 4, 7, 5, 3, 2), expected = intArrayOf(5, 5, 2, 3, 4, 7))
    }

    @Test
    fun `test case 8`() {
        doTest(intArrayOf(2, 2, 7, 5, 4, 3, 2, 2, 1), expected = intArrayOf(2, 3, 1, 2, 2, 2, 4, 5, 7))
    }

    private fun doTest(input: IntArray, expected: IntArray) {
        test.nextPermutation(input)
        println("Expected array: ${Arrays.toString(expected)}, actual: ${Arrays.toString(input)}")
        Assertions.assertArrayEquals(expected, input)
    }

}
