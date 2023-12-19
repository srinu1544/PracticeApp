package com.example.practiceapp.Kotlin_Android.Codes

fun main(args: Array<String>) {

    highestCountChar()
    /*val str = "Hello World"
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in str) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }
    val maxChar = charCountMap.maxByOrNull { it.value }
    println("The highest repeated char is ${maxChar?.key} and it repeats ${maxChar?.value} times")*/
}


fun highestCountChar() {

    val str = "hello"
    val  charCountMap =  mutableMapOf<Char,Int>()
    for (char in str) {
        charCountMap[char] = charCountMap.getOrDefault(char,0) +1
    }



    val maxChar : Map.Entry<Char, Int>? = charCountMap.maxByOrNull { it.value }
    println("${maxChar?.key} and ${maxChar?.value}")

}



