package com.github.grambbledook.kotlin.task79

import com.github.grambbledook.java.task79.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WordSearchTest {

    val input = arrayOf(
            charArrayOf('A','B', 'C', 'E'),
            charArrayOf('S','F', 'C', 'S'),
            charArrayOf('A','D', 'E', 'E')
    )

    val test = Solution()

    @Test
    fun `test case 1`(): Unit {
        val result = test.exist(input, "ABCCED")
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 2`(): Unit {
        val result = test.exist(input, "SEE")
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 3`(): Unit {
        val result = test.exist(input, "ABCB")
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 4`(): Unit {
        val result = test.exist(arrayOf(charArrayOf('B'), charArrayOf('A'), charArrayOf('B')), "BBABAB")
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 5`(): Unit {
        val result = test.exist(arrayOf(charArrayOf('A'), charArrayOf('A')), "AAA")
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 6`(): Unit {
        val result = test.exist(arrayOf(charArrayOf('A')), "A")
        Assertions.assertTrue(result)
    }
@Test
    fun `test case 7`(): Unit {
        val result = test.exist(arrayOf(charArrayOf('A'), charArrayOf('A')), "A")
        Assertions.assertTrue(result)
    }

}