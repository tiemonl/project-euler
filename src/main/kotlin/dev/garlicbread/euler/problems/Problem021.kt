package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.getProperDivisorsOf

fun main() = solve { Problem021() }

class Problem021(
    problemInput: Int = 10000,
) : Problem<Int>(
    problem = 21,
) {
    override val input = problemInput

    override fun solveProblem() = (0L..input).flatMapTo(mutableSetOf()) {
        val amicable = getProperDivisorsOf(it).sum()
        if (amicable != it && getProperDivisorsOf(amicable).sum() == it) {
            listOf(it, amicable)
        } else {
            emptyList()
        }
    }.sum().toInt()
}
