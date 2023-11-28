package com.example.practiceapp.Kotlin_Android.deligate.standard

import kotlin.properties.Delegates

/*The instance only when it is needed and we can achieve this thing using lazy delegate
 It creates one instance at a time  */

class StudentHeavy {

    init {
        println("student heavy initialized")
    }
}

class Student {

    val studentheavy by lazy { StudentHeavy() }

    var marks : Int by Delegates.observable(50) { property, oldValue, newValue ->

        println("old value $oldValue")
        println("new value $newValue")
    }

}

fun main(){

    val student = Student()
    //student.studentheavy


    student.marks = 60
    student.marks = 70
}