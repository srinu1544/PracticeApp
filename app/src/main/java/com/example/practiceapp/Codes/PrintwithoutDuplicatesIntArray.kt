package com.example.practiceapp.Codes


/* This file is for Remove Duplicates And print Given IntArray */

/*This method using for loop  */
fun removeDuplicatesAndprintGivenIntArray () {

    val name = "srinivas"
    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size) {
        for (j in i+1 until arr.size) {
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }

        }
    }
    println(duplicates)
}

/*This method using while loop  */
fun removeDuplicatesAndprintGivenIntArray_2 () {

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




fun main(){
    removeDuplicatesAndprintGivenIntArray()

}