package com.github.grambbledook.kotlin.task238

import com.github.grambbledook.java.task238.ArrayProduct
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task238.Solution as Linear
import com.github.grambbledook.java.task238.constant.Solution as Constant

class ProductArrayExceptSelfTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: ArrayProduct) {
        val result = test.productExceptSelf(intArrayOf(1, 2, 3, 4))
        Assertions.assertArrayEquals(intArrayOf(24, 12, 8, 6), result)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Linear()),
                Arguments.of(Constant())
        )
    }
}