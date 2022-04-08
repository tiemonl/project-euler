package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.numberOfDivisors

fun main() = solve { Problem012() }

class Problem012 : Problem<Int>(
    problem = 12
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        var triNum = 0
        var iteration = 1
        while (numberOfDivisors(triNum) as Int <= 500) {
            triNum += iteration
            iteration++
        }
        return triNum
    }
}
