package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.gauss

fun main() = solve { Problem001() }

class Problem001 : Problem<Int>(
    problem = 1
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        val n = 999L
        return (3 * gauss(((n) / 3)) + 5 * gauss(((n) / 5)) - 15 * gauss(((n) / 15))).toInt()
    }
}
