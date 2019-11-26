package com.github.grambbledook.kotlin.task921

import com.github.grambbledook.java.task921.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinimumAddParenthesesTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.minAddToMakeValid("()))((")

        Assertions.assertEquals(4, result)
    }

}