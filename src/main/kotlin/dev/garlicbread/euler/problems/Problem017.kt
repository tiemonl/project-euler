package dev.garlicbread.euler.problems

import dev.garlicbread.euler.Problem
import dev.garlicbread.euler.solve

fun main() = solve { Problem017() }

class Problem017(
    problemInput: Int = 1000,
) : Problem<Int>(
    problem = 17,
) {
    override val input = problemInput

    private val numberToLetter = hashMapOf(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four",
        5 to "five",
        6 to "six",
        7 to "seven",
        8 to "eight",
        9 to "nine",
        10 to "ten",
        11 to "eleven",
        12 to "twelve",
        13 to "thirteen",
        14 to "fourteen",
        15 to "fifteen",
        16 to "sixteen",
        17 to "seventeen",
        18 to "eighteen",
        19 to "nineteen",
        20 to "twenty",
        30 to "thirty",
        40 to "forty",
        50 to "fifty",
        60 to "sixty",
        70 to "seventy",
        80 to "eighty",
        90 to "ninety",
        1000 to "one thousand",
    )

    override fun solveProblem(): Int {
        var sum = 0
        (1..input).forEach {
            numberToLetter[it] = numberLetterCount(it)
            sum += numberToLetter[it]?.replace(" ", "")?.length ?: 0
        }
        return sum
    }

    private fun numberLetterCount(num: Int): String {
        if (num in numberToLetter) return numberToLetter[num].orEmpty()

        return when (num) {
            in 1 until 20 -> numberToLetter[num].orEmpty()
            in 20 until 100 -> {
                if (num % 10 == 0) {
                    numberToLetter[num].orEmpty()
                } else {
                    numberLetterCount((num / 10) * 10) + numberLetterCount(num % 10)
                }
            }
            in 100 until 1000 -> {
                if (num % 100 == 0) {
                    numberLetterCount(num / 100) + "hundred"
                } else {
                    numberLetterCount(num / 100) + "hundred and " + numberLetterCount(num % 100)
                }
            }
            1000 -> numberToLetter[1000].orEmpty()
            else -> ""
        }
    }
}
