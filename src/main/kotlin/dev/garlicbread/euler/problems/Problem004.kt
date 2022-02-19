package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem004() }

class Problem004 : Problem<Int>(
    problem = 4
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        var found = false
        var firstHalf = 998
        var palin = 0
        val factors = IntArray(2)

        while (!found) {
            firstHalf--
            palin = (firstHalf.toString() + firstHalf.toString().reversed()).toInt()
            for (i in 999 downTo 100) {
                if (palin / i > 999 || i * i < palin) {
                    break
                }
                if (palin % i == 0) {
                    found = true
                    factors[0] = palin / i
                    factors[1] = i
                    break
                }
            }
        }
        return palin
    }
}
