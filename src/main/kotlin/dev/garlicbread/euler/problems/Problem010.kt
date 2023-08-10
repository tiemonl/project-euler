package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.generatePrimesUnderN

fun main() = solve { Problem010() }

class Problem010(
    problemInput: Int = 2000000,
) : Problem<Long>(
    problem = 10,
) {
    override val input = problemInput

    override fun solveProblem() = generatePrimesUnderN(input)
        .sumOf { it.toLong() }
}
