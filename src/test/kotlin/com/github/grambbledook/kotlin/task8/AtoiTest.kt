package com.github.grambbledook.kotlin.task8

import com.github.grambbledook.java.task8.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class AtoiTest {

    private val test = Solution()

    @ParameterizedTest
    @ArgumentsSource(AtoiArgs::class)
    fun `Test make palindrome`(input: String, expected: Int) {
        doTest(input, expected)
    }

    private fun doTest(input: String, expected: Int) {
        val result = test.myAtoi(input)
        Assertions.assertEquals(expected, result)
    }

}

class AtoiArgs: ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of("42", 42),
                    Arguments.of("     -42", -42),
                    Arguments.of("4183 sadaasdq qweq eq", 4183),
                    Arguments.of("  0000000000012345678", 12345678),
                    Arguments.of("-9223372036854775828", Integer.MIN_VALUE),
                    Arguments.of("9223372036854775808", Integer.MAX_VALUE),
                    Arguments.of("-01324000", -1324000),
                    Arguments.of("010", 10),
                    Arguments.of("+1", 1),
                    Arguments.of("wirfds asdq 132", 0),
                    Arguments.of("-91283472332", Integer.MIN_VALUE)
            )
}