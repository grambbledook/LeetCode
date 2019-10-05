package com.github.grambbledook.kotlin.task168

import com.github.grambbledook.java.task168.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExcelSheetColumnTitleTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.convertToTitle(1)
        Assertions.assertEquals("A", result)
    }

    @Test
    fun `test case 2`() {
        val result = test.convertToTitle(26)
        Assertions.assertEquals("Z", result)
    }

    @Test
    fun `test case 3`() {
        val result = test.convertToTitle(27)
        Assertions.assertEquals("AA", result)
    }

    @Test
    fun `test case 4`() {
        val result = test.convertToTitle(701)
        Assertions.assertEquals("ZY", result)
    }


    @Test
    fun `test case 5`() {
        val result = test.convertToTitle(28)
        Assertions.assertEquals("AB", result)
    }

}