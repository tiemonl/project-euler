package dev.garlicbread.euler.utils

class Memoize<in T, out R>(val f: (T) -> R) : (T) -> R {
    private val values = mutableMapOf<T, R>()
    override fun invoke(x: T): R = values.getOrPut(x) { f(x) }
}

fun <T, R> ((T) -> R).memoize(): (T) -> R = Memoize(this)
