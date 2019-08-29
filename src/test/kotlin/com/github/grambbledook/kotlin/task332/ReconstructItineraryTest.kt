package com.github.grambbledook.kotlin.task332

import com.github.grambbledook.java.task332.ReconstructItinerary
import com.github.grambbledook.java.task332.Solution as Backtrack
import com.github.grambbledook.java.task332.dfs.Solution as DFS
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class ReconstructItineraryTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("JFK", "MUC"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "MUC"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("JFK", "MUC"), listOf("MUC", "SFO"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "MUC", "SFO"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("JFK", "MUC"), listOf("MUC", "JFK"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "MUC", "JFK"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("MUC", "LHR"), listOf("JFK", "MUC"), listOf("SFO", "SJC"), listOf("LHR", "SFO"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "MUC", "LHR", "SFO", "SJC"), result)
    }


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("JFK", "SFO"), listOf("JFK", "ATL"), listOf("SFO", "ATL"), listOf("ATL", "JFK"), listOf("ATL", "SFO"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 6`(test: ReconstructItinerary) {
        val tickets = listOf(listOf("JFK", "KUL"), listOf("JFK", "NRT"), listOf("NRT", "JFK"))
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "NRT", "JFK", "KUL"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 7`(test: ReconstructItinerary) {
        val tickets = listOf(
                listOf("EZE", "AXA"),
                listOf("TIA", "ANU"),
                listOf("ANU", "JFK"),
                listOf("JFK", "ANU"),
                listOf("ANU", "EZE"),
                listOf("TIA", "ANU"),
                listOf("AXA", "TIA"),
                listOf("TIA", "JFK"),
                listOf("ANU", "TIA"),
                listOf("JFK", "TIA")
        )

        val result = test.findItinerary(tickets)
        Assertions.assertEquals(listOf("JFK", "ANU", "EZE", "AXA", "TIA", "ANU", "JFK", "TIA", "ANU", "TIA", "JFK"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 8`(test: ReconstructItinerary) {
        val tickets = listOf(
                listOf("EZE", "TIA"), listOf("EZE", "HBA"), listOf("AXA", "TIA"),
                listOf("JFK", "AXA"), listOf("ANU", "JFK"), listOf("ADL", "ANU"),
                listOf("TIA", "AUA"), listOf("ANU", "AUA"), listOf("ADL", "EZE"),
                listOf("ADL", "EZE"), listOf("EZE", "ADL"), listOf("AXA", "EZE"),
                listOf("AUA", "AXA"), listOf("JFK", "AXA"), listOf("AXA", "AUA"),
                listOf("AUA", "ADL"), listOf("ANU", "EZE"), listOf("TIA", "ADL"),
                listOf("EZE", "ANU"), listOf("AUA", "ANU")
        )
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "AXA", "AUA", "ADL", "ANU", "AUA", "ANU", "EZE", "ADL", "EZE", "ANU", "JFK", "AXA", "EZE", "TIA", "AUA", "AXA", "TIA", "ADL", "EZE", "HBA"), result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 9`(test: ReconstructItinerary) {
        val tickets = listOf(
                listOf("JFK", "TIA"),
                listOf("TIA", "ADL"),
                listOf("TIA", "AUA"),
                listOf("AUA", "AXA"),
                listOf("AXA", "TIA"),
                listOf("ADL", "EZE"),
                listOf("EZE", "HBA")
        )
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "TIA", "AUA", "AXA", "TIA", "ADL", "EZE", "HBA"), result)
    }


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 10`(test: ReconstructItinerary) {
        val tickets = listOf(
                listOf("JFK", "TIA"),
                listOf("JFK", "TIA"),
                listOf("TIA", "JFK"),
                listOf("TIA", "JFK")
        )
        val result = test.findItinerary(tickets)

        Assertions.assertEquals(listOf("JFK", "TIA", "JFK", "TIA", "JFK"), result)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Backtrack()),
                Arguments.of(DFS())
        )
    }
}