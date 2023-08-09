package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem018() }

class Problem018 : Problem<Int>(
    problem = 18,
) {
    override val input = rawInput?.map { it.split(" ").map { num -> Integer.parseInt(num) }.toMutableList() }!!.toMutableList()

    override fun solveProblem(): Int {
        (input.indices.reversed()).map { i ->
            (1 until input[i].size).map { j ->
                input[i - 1][j - 1] += maxOf(input[i][j - 1], input[i][j])
            }
        }
        return input[0][0]
    }
}
