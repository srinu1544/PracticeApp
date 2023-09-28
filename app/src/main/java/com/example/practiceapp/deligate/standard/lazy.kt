package com.example.practiceapp.deligate.standard

class StudentHeavy {

    init {
        println("student heavy initialized")
    }
}

class Student {

    val studentheavy by lazy { StudentHeavy() }

}

fun main(){

    val student = Student()
    student.studentheavy
}