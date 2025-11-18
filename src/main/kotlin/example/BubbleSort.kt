package com.pix.example

fun bubbleSort(arr: IntArray): IntArray {
    var n = arr.size
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}

/**
 * Original Array: [64, 34, 25, 12, 22, 11, 90]
 * Sorted Array: [11, 12, 22, 25, 34, 64, 90]
 */
fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original Array: ${arr.contentToString()}")
    val sortedArr = bubbleSort(arr)
    println("Sorted Array: ${sortedArr.contentToString()}")
}