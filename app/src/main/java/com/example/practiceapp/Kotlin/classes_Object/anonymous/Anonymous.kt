package com.example.practiceapp.Kotlin.classes_Object.anonymous

interface Human{
    fun think()
}

fun main() {

    var programmer : Human = object : Human {
        override fun think() {
            println("human think")
        }
    }
    programmer.think()
}