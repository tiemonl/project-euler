package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.numberOfDivisors

fun main() = solve { Problem012() }

class Problem012(
    problemInput: Int = 500,
) : Problem<Int>(
    problem = 12,
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        var triNum = 0
        var iteration = 1
        while (numberOfDivisors(triNum) as Int <= input) {
            triNum += iteration
            iteration++
        }
        return triNum
    }
}
