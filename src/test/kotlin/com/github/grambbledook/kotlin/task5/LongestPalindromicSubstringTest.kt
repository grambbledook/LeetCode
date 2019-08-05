package com.github.grambbledook.kotlin.task5

import com.github.grambbledook.java.task5.longest.LongestPalindromic
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task5.longest.brute.Solution as BruteForce
import com.github.grambbledook.java.task5.longest.Solution as Memoized

class LongestPalindromicSubstringTest {

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 1`(test: LongestPalindromic) {
        val result = test.longestPalindrome("babad")
        Assertions.assertTrue("bab" == result || "aba" == result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 2`(test: LongestPalindromic) {
        val result = test.longestPalindrome("aaabaaaa")
        Assertions.assertEquals("aaabaaa", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 3`(test: LongestPalindromic) {
        val result = test.longestPalindrome("cbbd")
        Assertions.assertEquals("bb", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 4`(test: LongestPalindromic) {
        val result = test.longestPalindrome("yvfkwwkkfyxqjcv")
        Assertions.assertEquals("kwwk", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 5`(test: LongestPalindromic) {
        val result = test.longestPalindrome("gjwmfklkffehbvlhv")
        Assertions.assertEquals("fklkf", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 6`(test: LongestPalindromic) {
        val result = test.longestPalindrome("aabbccbbaa")
        Assertions.assertEquals("aabbccbbaa", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 7`(test: LongestPalindromic) {
        val result = test.longestPalindrome("ac")
        Assertions.assertEquals("a", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 8`(test: LongestPalindromic) {
        val result = test.longestPalindrome("ccd")
        Assertions.assertEquals("cc", result)
    }

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test case 9`(test: LongestPalindromic) {
        val result = test.longestPalindrome("cbbd")
        Assertions.assertEquals("bb", result)
    }

}

class LongestPalindromicArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(BruteForce()),
                    Arguments.of(Memoized())
            )
}