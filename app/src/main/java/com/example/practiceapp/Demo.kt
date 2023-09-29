package com.example.practiceapp

fun main(){

    println("start")
    println("middle")
    end({println("end")},{println("xyz")})
    println("done")

}

inline fun end(abc : () -> Unit , noinline xyz : () -> Unit){
     abc()
     xyz()
 }