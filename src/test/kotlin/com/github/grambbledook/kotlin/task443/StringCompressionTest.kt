package com.github.grambbledook.kotlin.task443

import org.junit.jupiter.api.Test
import com.github.grambbledook.java.task443.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled

@Disabled
class StringCompressionTest {


    val test = Solution()

    @Test
    fun `test case 0`() {
        val input = charArrayOf('a', 'a', 'a', 'a')
        val result = test.compress(input)

        assertEquals(2, result)
        assertArrayEquals(charArrayOf('a', '4'), input)
    }

    @Test
    fun `test case 1`() {
        val input = charArrayOf('a', 'b', 'b')
        val result = test.compress(input)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', 'b', '2'), input)
    }


    @Test
    fun `test case 2`() {
        val input = charArrayOf('a', 'a', 'b')
        val result = test.compress(input)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', '2', 'b'), input)
    }

    @Test
    fun `test case 3`() {
        val input = charArrayOf(' ', ' ', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'd')
        val result = test.compress(input)

        assertEquals(9, result)
        assertArrayEquals(charArrayOf(' ', '2', 'a', '3', 'b', '2', 'c', '2', 'd'), input)
    }

    private fun assertArrayEquals(expected: CharArray, input: CharArray) {
        expected.forEachIndexed { index, value ->
            assertEquals(value, input[index])
        }
    }


}