package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem013() }

class Problem013 : Problem<Long>(
    problem = 13,
) {
    override val input = rawInput!!.map { it.toBigInteger() }

    override fun solveProblem() = input.sumOf { it }.toString().take(10).toLong()
}
