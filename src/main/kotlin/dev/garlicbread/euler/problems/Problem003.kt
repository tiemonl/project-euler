package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.largestPrimeFactor

fun main() = solve { Problem003() }

class Problem003(
    problemInput: Long = 600851475143
) : Problem<Int>(
    problem = 3
) {
    override val input = problemInput

    override fun solveProblem() = largestPrimeFactor(input)
}
