package com.github.grambbledook.kotlin.task287

import com.github.grambbledook.java.task287.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindDuplicatedNumTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.findDuplicate(intArrayOf(1, 3, 4, 2, 2))
        Assertions.assertEquals(2, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.findDuplicate(intArrayOf(3, 1, 3, 4, 2))
        Assertions.assertEquals(3, result)
    }


}