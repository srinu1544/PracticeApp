package com.example.practiceapp.Kotlin.classes_Object

/*

class :
-------
In Kotlin, a class is a blueprint for creating objects. It defines the properties and behaviors
that all objects of that class will have. Classes are declared using the class keyword, followed by
the name of the class and a pair of curly braces.

Within the curly braces, you define the properties and methods of the class. Properties are variables
that belong to the class, and methods are functions that belong to the class.

To create an object from a class, you use the new keyword, followed by the name of the class.

For example, the following code creates a new object from the Person class:
val person = Person("John Doe")


Object :
--------

In Kotlin, an object is a special class that only has one instance. It is a way to create a singleton,
which is a design pattern that restricts the instantiation of a class to one object. Objects can be
used to encapsulate data and behavior, and they can also be used to implement singletons.
To declare an object in Kotlin, you use the object keyword. For example, the following code declares
an object called MyObject:

object MyObject {
    var x = 0
    var y = 0

    fun print() {
        println("x = $x, y = $y")
    }
}
Use code with caution.
Learn more
To access the properties and methods of an object, you use the dot notation.
For example,the following code prints the values of the x and y properties of the MyObject object:

MyObject.print()


*/


