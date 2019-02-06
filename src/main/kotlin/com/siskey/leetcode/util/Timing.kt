package com.siskey.leetcode.util

fun <T> timed(name: String, expected: T, f: () -> T) {
    val start = System.nanoTime()
    val result = f()
    val end = System.nanoTime()
    println("Test case [$name]. Expected: [$expected]. Actual: [$result]. Passed: [${result == expected}]")
    println("Time consumed millis: ${end - start}\n")
}