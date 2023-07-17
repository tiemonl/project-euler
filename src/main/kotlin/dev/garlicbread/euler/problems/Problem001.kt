package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.gauss

fun main() = solve { Problem001() }

class Problem001(
    problemInput: Long = 999L,
) : Problem<Int>(
    problem = 1,
) {
    override val input = problemInput

    override fun solveProblem() = (3 * gauss(((input) / 3)) + 5 * gauss(((input) / 5)) - 15 * gauss(((input) / 15))).toInt()
}
