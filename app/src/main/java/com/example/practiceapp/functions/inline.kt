package com.example.practiceapp.functions


/* inline functions enhance the performance of higher order function
   inline line function tells the compiler to copy perameters and functions to the call site

   Uses
   -----
   When you define a higher-order function (a function that takes another function as a parameter),
   you can use the inline keyword to suggest to the compiler that the function should be inlined at
   the call site. This can be beneficial when you want to avoid the runtime overhead of a function call,
   especially when working with lambda expressions


   */
fun main() {

    executeOperation {
     println("hii")
 }

}

inline fun executeOperation(action : () -> Unit) {
    return action()
}