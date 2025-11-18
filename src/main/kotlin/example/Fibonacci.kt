package com.pix.example


/**
 * This function returns the n-th Fibonacci number.
 * @param n the index of the Fibonacci number to be returned.
 * @return the n-th Fibonacci number.
 */
fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val n = 10;
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = fibonacci(i)
    }
    println("n = $n, arr = ${arr.contentToString()}")
}