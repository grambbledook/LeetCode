package com.github.grambbledook.kotlin.task5

import com.github.grambbledook.java.task5.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class MakeValidPalindromeTest {

    private val test = Solution()

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `Test make palindrome`(input: String, expected: Int) {
        doTest(input, expected)
    }

    private fun doTest(input: String, expected: Int) {
        val result = test.palindromize(input)
        Assertions.assertEquals(expected, result)
    }

}

class Args: ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of("abcaacba", -1),
                    Arguments.of("bbbbb", -1),
                    Arguments.of("a", -1),
                    Arguments.of("", -1),
                    Arguments.of("baa", 0),
                    Arguments.of("aab", 2),
                    Arguments.of("aabcaa", 2),
                    Arguments.of("aacbaa", 2),
                    Arguments.of("aabbbbbccbbbbaa", 6),
                    Arguments.of("aaaabb", -1)
            )
}