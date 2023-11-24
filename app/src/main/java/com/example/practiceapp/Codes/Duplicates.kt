package com.example.practiceapp.Codes

fun printduplicateinString() {

    val name = "srinivas"
    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size) {
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }

        }
    }
    println(duplicates)
}


fun printWithOutDuplicatesInString() {

    val name = "srinivas"
    val arr = name.toCharArray()
    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }

    println(duplicates)
}


fun printduplicateinIntArray() {


    val arr = arrayOf(1,2,3,4,4,4,4,5,5,6,6,6)

    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }

        }
    }
    println(duplicates)
}


fun printWithOutDuplicatesInIntArray() {

    val arr = arrayOf(1,2,3,4,4,4,4,5,5,6,66)
    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        for(j in 0 until arr.size) {
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }
    println(duplicates)
}


fun main() {
    printduplicateinString()
    printWithOutDuplicatesInString()
    printduplicateinIntArray()
    printWithOutDuplicatesInIntArray()
}