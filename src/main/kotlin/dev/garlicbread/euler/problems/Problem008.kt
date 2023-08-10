package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem008() }

class Problem008(
    val problemInput: Int = 13,
) : Problem<Long>(
    problem = 8,
) {
    override val input = rawInput?.flatMap { it.map { char -> char.digitToInt() } }!!

    override fun solveProblem(): Long {
        var high = 0L
        (0 until input.size - problemInput).map {
            var total = 1L
            (it until it + problemInput).map { curr ->
                total *= input[curr]
            }
            if (high < total) {
                high = total
            }
        }
        return high
    }
}
