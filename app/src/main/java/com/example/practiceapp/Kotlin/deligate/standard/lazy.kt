package com.example.practiceapp.Kotlin.deligate.standard

class StudentHeavy {

    init {
        println("student heavy initialized")
    }
}

class Student {

    val studentheavy by lazy { com.example.practiceapp.Kotlin.deligate.standard.StudentHeavy() }

}

fun main(){

    val student = com.example.practiceapp.Kotlin.deligate.standard.Student()
    student.studentheavy
}