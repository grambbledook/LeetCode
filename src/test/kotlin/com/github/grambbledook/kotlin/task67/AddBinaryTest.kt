package com.github.grambbledook.kotlin.task67

import com.github.grambbledook.java.task67.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AddBinaryTest {
    val test = Solution()


    @Test
    fun `test case 1`() {
        val result = test.addBinary("11", "1")
        Assertions.assertEquals("100", result)
    }

    @Test
    fun `test case 2`() {
        val result = test.addBinary("1010", "1011")
        Assertions.assertEquals("10101", result)
    }


    @Test
    fun `test case 3`() {
        val result = test.addBinary("101111", "10")
        Assertions.assertEquals("110001", result)
    }
}