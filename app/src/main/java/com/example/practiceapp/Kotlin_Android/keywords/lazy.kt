package com.example.practiceapp.Kotlin_Android.keywords

/*
lazy :
------

by using lazy it creates object when it is coming to used state

In Kotlin, you can use the lazy delegate to create a property that is initialized lazily,
meaning it will only be computed the first time it is accessed. This can be useful for
expensive or time-consuming operations that you only want to perform when the value is
actually needed. Here's an example:

 */


class MyClass {
    val myLazyProperty: String by lazy {
        // This block of code will only be executed the first time myLazyProperty is accessed
        println("Computing the value")
        "Lazy Property Value"
    }
}

fun main() {
    val myObject = MyClass()

    // The following line will trigger the initialization of myLazyProperty
    println(myObject.myLazyProperty)

    // Since the property is now initialized, accessing it again won't recompute the value
    println(myObject.myLazyProperty)
}