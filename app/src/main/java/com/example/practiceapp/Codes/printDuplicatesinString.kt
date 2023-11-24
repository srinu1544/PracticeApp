package com.example.practiceapp.Codes

import java.util.Arrays


/*This file  for Remove duplicate char in a given string and print duplicates */

/* using  for loop */
fun printDuplicatesInString() {

    val name = "srinivas"
    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i])
            }
        }
    }
    println("Duplicates: $duplicates")


}


/*This method for Remove duplicate char in a given string and print duplicates */

/* using while loop */
fun printDuplicatesInString_2 () {

    val name = "srinivas"

    val str = name.toCharArray()

    val duplicates = mutableListOf<Char>()
    var index = 0

    for (i in 0 until str.size) {
        var j: Int = 0
        while (j < i) {
            if (str[i] != str[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            duplicates.add(str[i])
        }
    }

    println(duplicates)

}


fun main(){
    printDuplicatesInString()
    printDuplicatesInString_2()
}