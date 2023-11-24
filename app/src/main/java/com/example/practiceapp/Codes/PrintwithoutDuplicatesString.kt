package com.example.practiceapp.Codes


/*This file is for Remove Duplicates And print Given String*/

/*This method for using for loop  */
fun removeDuplicatesAndPrintGivenString () {

    val name = "srinivas"
    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size){
        for (j in i+1 until arr.size){
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }

        }
    }
    println(duplicates)
}

/*This method for using while loop */
fun removeDuplicatesAndprintGivenString_2 () {

    val name = "srinivas"

    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

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
    removeDuplicatesAndPrintGivenString()
    //removeDuplicatesAndprintGivenString_2()
}