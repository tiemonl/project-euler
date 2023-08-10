package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.isAbundant

fun main() = solve { Problem023() }

class Problem023 : Problem<Int>(
    problem = 23,
) {
    override val input = rawInput

    override fun solveProblem() = (1L.rangeTo(28123)).filter { !isSumOfTwoAbundantNumbers(it) }.sum().toInt()

    private fun isSumOfTwoAbundantNumbers(num: Long) = (1.rangeTo(num / 2)).any { isAbundant(it) && isAbundant(num - it) }
}
