package dev.garlicbread.euler.utils

import kotlin.math.roundToInt
import kotlin.math.sqrt

fun gauss(n: Long) = (n * (n + 1)) / 2

fun gaussSquareNumbers(n: Long) = (n * (n + 1) * (2 * n + 1)) / 6

fun primeFactors(n: Number): List<Int> {
    val primeFactors = mutableListOf<Int>()
    var temp = n.toLong()
    while ((n as Long).rem(2) == 0L) {
        primeFactors.add(2)
        temp /= 2
    }
    for (i in 3..sqrt(temp.toDouble()).roundToInt() step 2) {
        while (temp.toDouble().rem(i) == 0.0) {
            primeFactors.add(i)
            temp /= i
        }
    }
    if (temp > 2)
        primeFactors.add(temp.toInt())
    return primeFactors
}

fun largestPrimeFactor(n: Number) = primeFactors(n).maxOf { it }

fun generatePrimes(upperLimit: Number): List<Int> {
    val primes = mutableListOf(2)
    var isPrime: Boolean
    var j: Int

    for (i in 3 until upperLimit.toInt() step 2) {
        j = 0
        isPrime = true
        while (primes[j] * primes[j] <= i) {
            if (i % primes[j] == 0) {
                isPrime = false
                break
            }
            j++
        }
        if (isPrime) {
            primes.add(i)
        }
    }

    return primes.toList()
}
