package com.example.practiceapp.Kotlin.deligate.standard

import kotlin.properties.Delegates

//Observable properties: listeners are notified about changes to this property.

class Employ {

    var salary : Int by Delegates.observable(50) {property, oldValue, newValue ->
        println("old value $oldValue")
        println("new value $newValue")
    }

}

fun main(){

    val employ = com.example.practiceapp.Kotlin.deligate.standard.Employ()
    employ.salary = 60
    employ.salary = 70



}