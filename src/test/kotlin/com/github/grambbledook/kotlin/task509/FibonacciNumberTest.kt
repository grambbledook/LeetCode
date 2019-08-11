package com.github.grambbledook.kotlin.task509

import com.github.grambbledook.java.task509.array.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class FibonacciNumberTest {


    val test = Solution()

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `Test fib number`(N: Int, expected: Int) {
        val result = test.fib(N)

        Assertions.assertEquals(expected, result)
    }


}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3)
        )
    }

}