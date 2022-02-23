package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.findNthPrime

fun main() = solve { Problem007() }

class Problem007 : Problem<Number>(
    problem = 7
) {
    override val input = rawInput

    private val upperLimit = 10001

    override fun solveProblem(): Number = findNthPrime(upperLimit)
}
