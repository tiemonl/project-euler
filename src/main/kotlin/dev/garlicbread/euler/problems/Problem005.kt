package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.generatePrimesUnderN
import kotlin.math.floor
import kotlin.math.ln
import kotlin.math.pow

fun main() = solve { Problem005() }

class Problem005(
    problemInput: Int = 20,
) : Problem<Int>(
    problem = 5,
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        val primes = generatePrimesUnderN(input)
        var result = 1
        (primes.indices).map {
            result *= primes[it].toDouble().pow(floor(ln(input.toDouble()) / ln(primes[it].toDouble()))).toInt()
        }
        return result
    }
}
