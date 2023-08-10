package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.gauss
import dev.garlicbread.euler.utils.gaussSquareNumbers
import kotlin.math.pow

fun main() = solve { Problem006() }

class Problem006(
    problemInput: Long = 100,
) : Problem<Int>(
    problem = 6,
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        val sumSquared = gauss(input).toDouble().pow(2)
        val squaredSum = gaussSquareNumbers(input)
        return (sumSquared - squaredSum).toInt()
    }
}
