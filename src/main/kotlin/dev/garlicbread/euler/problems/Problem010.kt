package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.generatePrimesUnderN

fun main() = solve { Problem010() }

class Problem010 : Problem<Long>(
    problem = 10
) {
    override val input = rawInput

    override fun solveProblem() = generatePrimesUnderN(2000000)
        .sumOf { it.toLong() }
}
