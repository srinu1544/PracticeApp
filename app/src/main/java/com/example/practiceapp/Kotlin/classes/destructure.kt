package com.example.practiceapp.Kotlin.classes

/*In Kotlin, destructuring declarations allow you to break down an
object into its individual parts and assign them to multiple variables
in a single line of code. This feature is particularly useful when working
with data structures like data classes, pairs, or custom objects.*/


fun main(){

    val persion = com.example.practiceapp.Kotlin.classes.Persion("sai srinivas", "valluru", 30)

    val (n,v,a) = persion
    println(n)
    println(v)
    println(a)
}

data class Persion(val name : String, val address : String, val age : Int ){

}