package com.example.practiceapp
import android.util.ArraySet
import java.util.Arrays

fun removeDuplicates() {

    val name = "srinivas"

    val str = name.toCharArray()
    var index = 0

    for (i in 0 until str.size) {
        var j: Int = 0
        while (j < i) {
            if (str[i] == str[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            str[index++] = str[i]
        }
    }

    println(String(Arrays.copyOf(str, index)))


}


// print duplicates words using contains

fun printDuplicates(string: String) {
    val seenCharacters = mutableSetOf<Char>()
    string.forEach { c ->
        if (seenCharacters.contains(c)) {
            println(c)
        } else {
            seenCharacters.add(c)
        }
    }
}


fun removeDuplicate1(){

    val name = "srinivas"
    val arr_name = name.toCharArray()
    val mutableSet = arr_name.toSet()
    println(mutableSet)
}

fun remove(){
    val name = "srinivas"
    var arr = name.toCharArray()
    var index = 0
    for (i in 0 until arr.size){
        var j : Int = 0
        while(j<i){
            if(arr[i] == arr[j]){
                break
            }
            j++

            if (j == i){
                arr[index++] = arr[i]
            }
        }
    }

    println(String(Arrays.copyOf(arr,index)))
}

fun main(){
    //removeDuplicates()
   //printDuplicates("srinivas")
   // removeDuplicate1()

    remove()

}