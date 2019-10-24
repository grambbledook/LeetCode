package com.github.grambbledook.kotlin.task148

import com.github.grambbledook.java.task148.Sort
import com.github.grambbledook.kotlin.common.list
import com.github.grambbledook.kotlin.common.toIntArray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task148.bottom.Solution as Bottom
import com.github.grambbledook.java.task148.top.Solution as Top

class MergeSortTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: Sort) {
        val result = test.sortList(list(4, 3, 2, 1))

        Assertions.assertArrayEquals(intArrayOf(1, 2, 3, 4), result.toIntArray())
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: Sort) {
        val result = test.sortList(list(4, 3, 2, 1, 5))

        Assertions.assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result.toIntArray())
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Bottom()),
                Arguments.of(Top())
        )
    }
}