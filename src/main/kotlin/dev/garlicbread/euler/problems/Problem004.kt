package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem004() }

class Problem004(
    problemInput: Problem004Input = Problem004Input(
        upperBound = 999,
        lowerBound = 100,
    ),
) : Problem<Int>(
    problem = 4,
) {
    data class Problem004Input(val upperBound: Int, val lowerBound: Int)

    override val input = problemInput

    override fun solveProblem(): Int {
        var found = false
        var firstHalf = input.upperBound - 1
        var palindrome = 0
        val factors = IntArray(2)

        while (!found) {
            firstHalf--
            palindrome = (firstHalf.toString() + firstHalf.toString().reversed()).toInt()
            for (i in input.upperBound downTo input.lowerBound) {
                if (palindrome / i > input.upperBound || i * i < palindrome) {
                    break
                }
                if (palindrome % i == 0) {
                    found = true
                    factors[0] = palindrome / i
                    factors[1] = i
                    break
                }
            }
        }
        return palindrome
    }
}
