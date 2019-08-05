package com.github.grambbledook.kotlin.task5

import com.github.grambbledook.java.task5.longest.brute.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class LongestPalindromicSubstringTest {

    private val test = Solution()

    @ParameterizedTest
    @ArgumentsSource(LongestPalindromicArgs::class)
    fun `Test make palindrome`(input: String, expected: String) {
        doTest(input, expected)
    }

    private fun doTest(input: String, expected: String) {
        val result = test.longestPalindrome(input)
        Assertions.assertEquals(expected, result)
    }

}

class LongestPalindromicArgs: ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of("babad", "bab"),
                    Arguments.of("cbbd", "bb"),

                    Arguments.of("aabbccbbaa", "aabbccbbaa")
            )
}