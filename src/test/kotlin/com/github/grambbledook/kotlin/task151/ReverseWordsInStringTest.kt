package com.github.grambbledook.kotlin.task151

import com.github.grambbledook.java.task151.ReverseString
import com.github.grambbledook.java.task151.Solution as StringBuilder
import com.github.grambbledook.java.task151.reverse.Solution as Reverse
import com.github.grambbledook.java.task151.another.Solution as DoubleReverse
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class ReverseWordsInStringTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 0`(test: ReverseString) {
        val result = test.reverseWords("hello")
        Assertions.assertEquals("hello", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: ReverseString) {
        val result = test.reverseWords("hello world!")
        Assertions.assertEquals("world! hello", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: ReverseString) {
        val result = test.reverseWords("hello  world!")
        Assertions.assertEquals("world! hello", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: ReverseString) {
        val result = test.reverseWords("hello! world!")
        Assertions.assertEquals("world! hello!", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: ReverseString) {
        val result = test.reverseWords("the sky is blue")
        Assertions.assertEquals("blue is sky the", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: ReverseString) {
        val result = test.reverseWords("  hello world!  ")
        Assertions.assertEquals("world! hello", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 6`(test: ReverseString) {
        val result = test.reverseWords("  ")
        Assertions.assertEquals("", result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 7`(test: ReverseString) {
        val result = test.reverseWords("a")
        Assertions.assertEquals("a", result)
    }
}

class Args: ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(StringBuilder()),
                Arguments.of(DoubleReverse()),
                Arguments.of(Reverse())
        )
    }
}