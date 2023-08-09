package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.factorial

fun main() = solve { Problem020() }

class Problem020(
    problemInput: Int = 100
) : Problem<Int>(
    problem = 20
) {
    override val input = problemInput

    override fun solveProblem() = factorial(input).toString().sumOf { it.digitToInt() }
}
