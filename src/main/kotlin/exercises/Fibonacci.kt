package com.pix.example


/**
 * This function returns the n-th Fibonacci number
 * @param n the index of the Fibonacci number to be returned
 * @return the n-th Fibonacci number
 */
fun fibonacci(arr: IntArray): IntArray {
    val n = arr.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}

fun main() {
    val n = 10;
    val arr = fibonacci(IntArray(n))
    println("n = $n, Fibonacci Array: ${arr.contentToString()}")
}