package com.github.grambbledook.kotlin.task6

import com.github.grambbledook.java.task6.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ZigZagConversionTest {

    val test = Solution()

    @Test
    fun  `test case 1`() {
        val result = test.convert("PAYPALISHIRING", 3)
        Assertions.assertEquals("PAHNAPLSIIGYIR", result)
    }


    @Test
    fun  `test case 2`() {
        val result = test.convert("PAYPALISHIRING", 4)
        Assertions.assertEquals("PINALSIGYAHRPI", result)
    }

    @Test
    fun  `test case 3`() {
        val result = test.convert("PAYPALISHIRING", 1)
        Assertions.assertEquals("PAYPALISHIRING", result)
    }

    @Test
    fun  `test case 4`() {
        val result = test.convert("A", 2)
        Assertions.assertEquals("A", result)
    }

}