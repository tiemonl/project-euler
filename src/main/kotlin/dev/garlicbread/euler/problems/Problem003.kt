package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.largestPrimeFactor

fun main() = solve { Problem003() }

class Problem003 : Problem<Int>(
    problem = 3
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        return largestPrimeFactor(600851475143)
    }
}
