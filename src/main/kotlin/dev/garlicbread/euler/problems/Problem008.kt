package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem008() }

class Problem008 : Problem<Long>(
    problem = 8
) {
    override val input = rawInput?.flatMap { it.map { char -> char.digitToInt() } }!!

    private val sequenceLength = 13

    override fun solveProblem(): Long {
        var high = 0L
        (0 until input.size - sequenceLength).map {
            var total = 1L
            (it until it + sequenceLength).map { curr ->
                total *= input[curr]
            }
            if (high < total) {
                high = total
            }
        }
        return high
    }
}
