package com.pix.example

/**
 * Half search algorithm implementation in Kotlin.
 * @param arr the sorted list of integers to search in.
 * @param x the integer to search for.
 * @return the index of the first occurrence of x in arr, or -1 if x is not found.
 */
fun halfSearch(arr: List<Int>, x: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        if (arr[mid] == x) {
            return mid
        } else if (arr[mid] < x) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return -1
}

fun main() {
    val arr = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val searchValue = 5
    println("$searchValue found at index ${halfSearch(arr, searchValue)}")
}