package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.factorial
import java.math.BigInteger
import kotlin.time.times

fun main() = solve { Problem015() }

class Problem015(
    problemInput: Int = 20,
) : Problem<BigInteger>(
    problem = 15,
) {
    override val input = problemInput

    override fun solveProblem(): BigInteger = factorial(input.times(2)).divide(factorial(input).multiply(factorial(input)))
}
