package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem014() }

class Problem014(
    problemInput: Long = 1000000,
) : Problem<Long>(
    problem = 14,
) {
    override val input = problemInput

    private val cache = mutableMapOf(1L to 1)

    override fun solveProblem(): Long {
        var longestChain = 0
        var startingNum = 0L
        var currentNum: Long
        for (i in 2..input) {
            var length = 0
            currentNum = i
            while (currentNum > 1 && currentNum >= i) {
                length++
                currentNum = collatz(currentNum)
            }
            cache[i] = length + (cache[currentNum] ?: -1)
            if (longestChain < cache[i]!!) {
                longestChain = cache[i]!!
                startingNum = i
            }
        }
        return startingNum
    }

    private fun collatz(n: Long) = if (n.mod(2) == 0) n / 2 else 3 * n + 1
}
