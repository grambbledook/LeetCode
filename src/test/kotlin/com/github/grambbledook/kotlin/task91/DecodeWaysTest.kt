package com.github.grambbledook.kotlin.task91

import com.github.grambbledook.java.task91.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DecodeWaysTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.numDecodings("12")

        Assertions.assertEquals(2, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.numDecodings("226")

        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.numDecodings("2222")

        Assertions.assertEquals(5, result)
    }


    @Test
    fun `test case 4`() {
        val result = test.numDecodings("10")

        Assertions.assertEquals(1, result)
    }


    @Test
    fun `test case 5`() {
        val result = test.numDecodings("100")

        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 6`() {
        val result = test.numDecodings("110")

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 7`() {
        val result = test.numDecodings("230")

        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 8`() {
        val result = test.numDecodings("27")

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 9`() {
        val result = test.numDecodings("301")

        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 10`() {
        val result = test.numDecodings("12120")

        Assertions.assertEquals(3, result)
    }

   @Test
    fun `test case 11`() {
        val result = test.numDecodings("101")

        Assertions.assertEquals(1, result)
    }

   @Test
    fun `test case 12`() {
        val result = test.numDecodings("1010")

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 13`() {
        val result = test.numDecodings("1110")

        Assertions.assertEquals(2, result)
    }

    @Test
    fun `test case 14`() {
        val result = test.numDecodings("7206")

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 15`() {
        val result = test.numDecodings("1212")

        Assertions.assertEquals(5, result)
    }

}