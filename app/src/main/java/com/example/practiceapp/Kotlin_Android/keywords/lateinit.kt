package com.example.practiceapp.Kotlin_Android.keywords

/*

lateinit :
----------

The lateinit keyword in Kotlin is used to declare a variable that will be initialized
later in the program. This can be useful in cases where you need to use a variable before
it has been initialized, but you are sure that it will be initialized before it is used.*/


lateinit var myVariable: String

fun myFunction() {
    myVariable = "Hello, world!"
    println(myVariable)
}


fun main() {
    myFunction()
}

