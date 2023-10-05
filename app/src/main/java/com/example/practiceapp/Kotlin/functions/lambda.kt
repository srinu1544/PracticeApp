package com.example.practiceapp.Kotlin.functions


/*In Kotlin, a lambda function is an anonymous function that can be
used as an argument to higher-order functions, or it can be stored
in a variable and called later. Lambda functions are a concise way
to define small, inline functions without explicitly declaring a
separate function*/

fun main() {


        // lambda example
        val greet = {println("hello")}
        greet()


        // ex single perameter
        val square = {x:Int -> x*x}
        println("square root of 3 is ${square(3)}")


        // with multiple perameters
        val add = {x:Int,y:Int -> x+y}
        val addNum = add(4,5)
        println(addNum)


        //print lucky number by given name and number
        val luckyNum = {name:String,num:Int -> "hi $name your lucky number is $num"}
        println(luckyNum("srinivas",4))

}
