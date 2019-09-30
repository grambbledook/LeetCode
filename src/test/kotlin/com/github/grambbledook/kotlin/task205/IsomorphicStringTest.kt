package com.github.grambbledook.kotlin.task205

import com.github.grambbledook.java.task205.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IsomorphicStringTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        Assertions.assertTrue(test.isIsomorphic("add", "egg"))
    }

    @Test
    fun `test case 2`() {
        Assertions.assertFalse(test.isIsomorphic("foo", "bar"))
    }

    @Test
    fun `test case 3`() {
        Assertions.assertFalse(test.isIsomorphic("add", "ooz"))
    }

    @Test
    fun `test case 4`() {
        Assertions.assertFalse(test.isIsomorphic("abba", "abab"))
    }

    @Test
    fun `test case 5`() {
        Assertions.assertTrue(test.isIsomorphic("", ""))
    }

    @Test
    fun `test case 6`() {
        Assertions.assertTrue(test.isIsomorphic("qwertyuio", "asdfghjkl"))
    }

    @Test
    fun `test case 7`() {
        Assertions.assertFalse(test.isIsomorphic("aa", "ab"))
    }

}