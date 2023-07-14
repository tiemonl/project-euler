package dev.garlicbread.euler.utils

import java.math.BigInteger
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun gauss(n: Long) = (n * (n + 1)) / 2

fun gaussSquareNumbers(n: Long) = (n * (n + 1) * (2 * n + 1)) / 6

fun gcd(a: Int, b: Int, vararg numbers: Int): Int = when {
    numbers.isEmpty() -> if (b == 0) a else gcd(b, a % b)
    else -> gcd(gcd(a, b), numbers.first(), *numbers.drop(1).toIntArray())
}

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
    if (temp > 2) {
        primeFactors.add(temp.toInt())
    }
    return primeFactors
}

fun largestPrimeFactor(n: Number) = primeFactors(n).maxOf { it }

fun generatePrimesUnderN(upperLimit: Number): List<Number> {
    val primes = mutableListOf(2L)

    for (i in 3 until upperLimit.toLong() step 2) {
        if (isPrime(primes, i)) primes.add(i)
    }

    return primes.toList()
}

fun findNthPrime(upperLimit: Number): Number {
    var i = 1L
    val primes = mutableListOf(2L)
    while (primes.size < upperLimit.toLong()) {
        i += 2
        if (isPrime(primes, i)) primes.add(i)
    }
    return primes.last()
}

private fun isPrime(primes: MutableList<Long>, index: Long): Boolean {
    var j = 0
    var isPrime = true
    while (primes[j] * primes[j] <= index) {
        if (index % primes[j] == 0L) {
            isPrime = false
            break
        }
        j++
    }
    return isPrime
}

fun numberOfDivisors(num: Number): Number {
    var nod = 0
    val sqrt = sqrt(num.toDouble()).toInt()

    for (i in 1..sqrt) {
        if (num.toDouble().mod(i.toDouble()) == 0.0) {
            nod += 2
        }
    }
    // Correction if the number is a perfect square
    if (sqrt * sqrt == num) nod--

    return nod
}

fun factorial(num: Int): BigInteger = generateSequence(Pair(1, BigInteger.ONE)) { Pair(it.first + 1, it.second.multiply(BigInteger.valueOf(it.first.inc().toLong()))) }.take(num).last().second
