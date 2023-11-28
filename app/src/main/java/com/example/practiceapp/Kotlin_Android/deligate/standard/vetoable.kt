package com.example.practiceapp.Kotlin_Android.deligate.standard

import kotlin.properties.Delegates




class Worker {

    var age: Int by Delegates.vetoable(18) { _, oldValue, newValue ->
        if (newValue < 18) {
            println("Age cannot be less than 18")
            false // Veto the change
        } else {
            true
        }
    }
}

fun main(){

    val worker = Worker()
    worker.age = 17


}