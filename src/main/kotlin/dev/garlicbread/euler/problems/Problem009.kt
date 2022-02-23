package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem009() }

class Problem009 : Problem<Int>(
    problem = 9
) {
    override val input = rawInput

    override fun solveProblem(): Int {
        val upperLimit = 1000
        var product = 0
        for (a in 3..upperLimit / 3) {
            for (b in a..upperLimit / 2) {
                val c = upperLimit - a - b
                if ((a * a) + (b * b) == (c * c)) {
                    product = a * b * c
                    break
                }
            }
            if (product != 0) break
        }
        return product
    }
}
