package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem016() }

class Problem016(
    problemInput: Int = 1000,
) : Problem<Int>(
    problem = 16,
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        val base = 2
        val num = base.toBigInteger().pow(input).toString()
        return num.sumOf { it.digitToInt() }
    }
}
