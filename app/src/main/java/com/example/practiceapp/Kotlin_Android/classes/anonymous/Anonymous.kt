package com.example.practiceapp.Kotlin_Android.classes.anonymous

interface Human{
    fun think()
}

fun main() {

    var programmer : com.example.practiceapp.Kotlin_Android.classes.anonymous.Human = object :
        com.example.practiceapp.Kotlin_Android.classes.anonymous.Human {
        override fun think() {
            println("human think")
        }
    }
    programmer.think()
}