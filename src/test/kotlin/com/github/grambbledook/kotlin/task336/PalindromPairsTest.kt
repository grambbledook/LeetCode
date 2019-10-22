package com.github.grambbledook.kotlin.task336

import com.github.grambbledook.java.task336.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PalindromPairsTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.palindromePairs(arrayOf("bat", "tab", "cat"))

        Assertions.assertEquals(listOf(listOf(0, 1), listOf(1, 0)), result)
    }


    @Test
    fun `test case 2`() {
        val result = test.palindromePairs(arrayOf("abcd", "dcba", "lls", "s", "sssll"))

        Assertions.assertEquals(listOf(listOf(0, 1), listOf(1, 0), listOf(3, 2), listOf(2, 4)), result)
    }


}