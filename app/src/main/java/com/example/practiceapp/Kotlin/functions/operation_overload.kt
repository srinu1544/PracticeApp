package com.example.practiceapp.Kotlin.functions

/*Kotlin allows you to provide custom implementations for the predefined set of operators on types. These operators have predefined
symbolic representation (like + or *) and precedence. To implement an operator, provide a member function or an extension function
with a specific name for the corresponding type. This type becomes the left-hand side type for binary operations and the argument
type for the unary ones*/

fun main(){

    val p1 = Point(10,12)
    val p2 = Point(1,3)
    println(p1.plus(p2))
}

data class Point(val x : Int , val y : Int) {

   /* fun add(point : Point) : Point {

        return Point (this.x + point.x , this.y + point.y)
    }*/

    operator fun plus(point:Point) : Point {
        return Point(this.x + point.x,this.y + point.y)
    }
}

