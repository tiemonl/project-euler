package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve
import dev.garlicbread.euler.utils.Direction
import dev.garlicbread.euler.utils.Point

fun main() = solve { Problem011() }

class Problem011 : Problem<Long>(
    problem = 11,
) {
    override val input = rawInput!!.flatMapIndexed { x, numbers ->
        numbers.split(" ").mapIndexed { y, digit -> Point(x, y) to digit.toInt() }
    }.toMap()

    override fun solveProblem(): Long {
        var high = 0L
        (0..input.keys.maxOf { it.x }).map { x ->
            (0..input.keys.maxOf { it.y }).map { y ->
                listOf(Direction.South, Direction.SouthWest, Direction.SouthEast, Direction.East).forEach {
                    val current = getDirectionMultiplied(times = 4, point = Point(x, y), direction = it)
                    high = if (current > high) current else high
                }
            }
        }
        return high
    }

    private fun getDirectionMultiplied(times: Int, point: Point, direction: Direction): Long {
        var product = input[point]?.toLong() ?: 1L
        var tempPoint = point
        repeat(times.dec()) {
            tempPoint = tempPoint.move(direction)
            product *= input[tempPoint]?.toLong() ?: 1L
        }
        return product
    }
}
