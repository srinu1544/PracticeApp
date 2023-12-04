package com.example.practiceapp.Kotlin_Android.Codes

import android.R.string





fun main(){

    //isPalindrome()
    //palindromeUsingLogic()
}

fun isPalindrome(){

    val name = "srinivas"

    val arr = name.toCharArray()

    for (i in arr.size until 0){

        println(arr[i])

    }

  /*  {
        var i: Int = string.length() - 1
        while (i >= 0) {
            reversedString += string.charAt(i)
            i -= 1
        }
    }*/




  /*  val reverse = name.reversed()

    if (name == reverse){
        println("given string is palindrome")
    }else {
        println("given string is not palindrome")
    }*/
}


   fun palindromeUsingLogic() {

       val string = "srinivas"
        var reversedString : String = ""


          var i = string.length -1
          while(i >= 0){
              reversedString += string[i]
              i -= 1
          }

         println(reversedString)

   }



