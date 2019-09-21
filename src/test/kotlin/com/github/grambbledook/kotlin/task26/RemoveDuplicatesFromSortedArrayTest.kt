package com.github.grambbledook.kotlin.task26

import org.junit.jupiter.api.Test
import com.github.grambbledook.java.task26.Solution
import org.junit.jupiter.api.Assertions.assertEquals

class RemoveDuplicatesFromSortedArrayTest {


    val test = Solution()

    @Test
    fun `test case 0`() {
        val input = intArrayOf(1, 1, 1, 1)
        val result = test.removeDuplicates(input)

        assertEquals(1, result)
        assertArrayEquals(intArrayOf(1), input)
    }

   @Test
    fun `test case 1`() {
        val input = intArrayOf(1, 2, 2)
        val result = test.removeDuplicates(input)

        assertEquals(2, result)
        assertArrayEquals(intArrayOf(1, 2), input)
    }


   @Test
    fun `test case 2`() {
        val input = intArrayOf(1, 1, 2)
        val result = test.removeDuplicates(input)

        assertEquals(2, result)
        assertArrayEquals(intArrayOf(1, 2), input)
    }

    @Test
    fun `test case 3`() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = test.removeDuplicates(input)

        assertEquals(5, result)
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4), input)
    }

    private fun assertArrayEquals(expected: IntArray, input: IntArray) {
        expected.forEachIndexed { index, value ->
            assertEquals(value, input[index])
        }
    }


}