package com.github.grambbledook.kotlin.task668

import com.github.grambbledook.java.task668.FindKthNumber
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task668.Solution as PQ
import com.github.grambbledook.java.task668.bs.Solution as BS

class KthSmallestInMultiMatrixTest {


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: FindKthNumber) {
        val result = test.findKthNumber(3, 3, 5)
        Assertions.assertEquals(3, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: FindKthNumber) {
        val result = test.findKthNumber(2, 3, 5)
        Assertions.assertEquals(4, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: FindKthNumber) {
        val result = test.findKthNumber(2, 3, 6)
        Assertions.assertEquals(6, result)
    }
}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(PQ()),
                Arguments.of(BS())
        )
    }
}