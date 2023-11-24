package com.example.practiceapp.Codes

import java.util.Arrays

/*This file  for Remove duplicate char in a given Int array and print duplicates*/

/*for using for loop */

fun printDuplicatesInIntArray() {

    val arr = arrayOf(1,3,3,2,4,4,5)

    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i])
            }
        }
    }
    println("Duplicates: $duplicates")


}

/*This method for using while loop */
fun printDuplicatesInIntArray_2 () {

    val arr = arrayOf(1,3,3,2,4,4,5)

    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        var j: Int = 0
        while (j < i) {
            if (arr[i] == arr[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            duplicates.add(arr[i])
        }
    }
    println(duplicates)
}


fun main(args: Array<String>) {

    printDuplicatesInIntArray()
   // printDuplicatesInIntArray_2()
}