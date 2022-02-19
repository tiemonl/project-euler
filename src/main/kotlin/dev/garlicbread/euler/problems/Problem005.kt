package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.generatePrimes
import kotlin.math.floor
import kotlin.math.ln
import kotlin.math.pow

fun main() = solve { Problem005() }

class Problem005 : Problem<Int>(
    problem = 5
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        val max = 20.0
        val primes = generatePrimes(max)
        var result = 1
        (primes.indices).map {
            result *= primes[it].toDouble().pow(floor(ln(max) / ln(primes[it].toDouble()))).toInt()
        }
        return result
    }
}
