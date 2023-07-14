package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.factorial
import java.math.BigInteger
import kotlin.time.times

fun main() = solve { Problem015() }

class Problem015 : Problem<BigInteger>(
    problem = 15,
) {
    override val input = rawInput

    override fun solveProblem(): BigInteger {
        val sides = 20
        return factorial(sides.times(2)).divide(factorial(sides).multiply(factorial(sides)))
    }
}
