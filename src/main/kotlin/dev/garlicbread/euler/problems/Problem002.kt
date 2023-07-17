package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem002() }

class Problem002(
    problemInput: Int = 4_000_000
) : Problem<Int>(
    problem = 2
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        var sum = 0
        var a = 1
        var b = 1
        while (b < input) {
            val temp = b
            b += a
            a = temp
            if (b % 2 == 0) {
                sum += b
            }
        }
        return sum
    }
}
