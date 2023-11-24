package com.example.practiceapp.Kotlin.classes_Object

/*
A data class in Kotlin is a special kind of class that is used to store data. It is a concise way to
define a class that has properties and some basic operations on those properties. Data classes are immutable,
which means that their properties cannot be changed once they are created. This makes them ideal for storing
data that needs to be kept consistent.

Here is an example of a data class in Kotlin:
data class User(val name: String, val age: Int)
Use code with caution.
Learn more
This class has two properties, name and age. The name property is a string, and the age property is an integer. The data keyword tells the compiler that this is a data class. This allows the compiler to generate some useful functions for the class, such as equals(), hashCode(), and toString().
Here is an example of how to use the User data class:
val user1 = User("Alice", 25)

val user2 = User("Bob", 30)

println(user1.name) // prints "Alice"
println(user1.age) // prints 25
println(user1 == user2) // prints false



val user3 = user1.copy() // creates a copy of user1

println(user3.name) // prints "Alice"

println(user3.age) // prints 25



println(user1 == user3) // prints true
Use code with caution.
Learn more
As you can see, the User data class is a concise and efficient way to store data. It provides some useful functions that make it easy to work with the data.*/