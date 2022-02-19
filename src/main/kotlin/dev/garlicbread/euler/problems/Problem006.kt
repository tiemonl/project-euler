package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.gauss
import dev.garlicbread.euler.utils.gaussSquareNumbers
import kotlin.math.pow

fun main() = solve { Problem006() }

class Problem006 : Problem<Int>(
    problem = 6
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        val sumSquared = gauss(100).toDouble().pow(2)
        val squaredSum = gaussSquareNumbers(100)
        return (sumSquared - squaredSum).toInt()
    }
}
