package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.findNthPrime

fun main() = solve { Problem007() }

class Problem007(
    problemInput: Int = 10001
) : Problem<Number>(
    problem = 7
) {
    override val input = problemInput

    override fun solveProblem(): Number = findNthPrime(input)
}
