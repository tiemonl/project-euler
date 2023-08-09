package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem022() }

class Problem022 : Problem<Int>(
    problem = 22,
) {
    override val input = rawInput?.flatMap { it.replace("\"", "").split(",") }!!.sorted()

    override fun solveProblem() = input.mapIndexed { index, name ->
        name.toCharArray().sumOf { (it - 64).code } * index.inc()
    }.sum()
}
