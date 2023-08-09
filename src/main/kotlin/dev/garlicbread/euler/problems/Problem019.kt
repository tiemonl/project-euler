package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus
import java.time.DayOfWeek

fun main() = solve { Problem019() }

class Problem019() : Problem<Int>(
    problem = 19,
) {
    override val input = rawInput

    override fun solveProblem() = generateSequence(
        LocalDate(1901, 1, 1),
    ) { it.plus(DatePeriod(months = 1)) }
        .takeWhile { it < LocalDate(2000, 12, 31) }
        .filter { it.dayOfWeek == DayOfWeek.SUNDAY }
        .count()
}
