package com.example.practiceapp.ui.theme.demo



fun main(args: Array<String>) {
    val str = "Hello World"
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in str) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
        println("$char")
    }
    val maxChar = charCountMap.maxByOrNull { it.value }
    println("The highest repeated char is ${maxChar?.key} and it repeats ${maxChar?.value} times")
}






















