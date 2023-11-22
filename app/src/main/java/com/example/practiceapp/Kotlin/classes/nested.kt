package com.example.practiceapp.Kotlin.classes

/*
creation of class inside a class
*/


 class Box(val length : Int,val width:Int,val height  : Int) {

     inner class Content(val content : String) {

       fun printBoxInfo(){
           println("$length , $width , $height")
       }

        fun printContent(){
            println(content)
        }

     }
 }


fun main() {

    val box = Box(10,4,5)
    val content = box.Content("some content")
    content.printContent()
    content.printBoxInfo()

}