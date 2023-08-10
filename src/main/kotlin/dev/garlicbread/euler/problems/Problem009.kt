package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem009() }

class Problem009(
    problemInput: Int = 1000,
) : Problem<Int>(
    problem = 9,
) {
    override val input = problemInput

    override fun solveProblem(): Int {
        val upperLimit = input
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
