package com.example.practiceapp.classes

import java.io.File
import javax.sql.DataSource

/*
Sealed classes and interfaces

Sealed classes and interfaces represent restricted class hierarchies
that provide more control over inheritance. All direct subclasses of
a sealed class are known at compile time. No other subclasses may
appear outside the module and package within which the sealed class
is defined. For example, third-party clients can't extend your sealed
class in their code. Thus, each instance of a sealed class has a type
from a limited set that is known when this class is compiled.

The same works for sealed interfaces and their implementations: once a
module with a sealed interface is compiled, no new implementations can appear.

In some sense, sealed classes are similar to enum classes: the set of
values for an enum type is also restricted, but each enum constant exists
only as a single instance, whereas a subclass of a sealed class can have
multiple instances, each with its own state.

As an example, consider a library's API. It's likely to contain
error classes to let the library users handle errors that it can throw.
If the hierarchy of such error classes includes interfaces or abstract
classes visible in the public API, then nothing prevents implementing
or extending them in the client code. However, the library doesn't know
about errors declared outside it, so it can't treat them consistently
with its own classes. With a sealed hierarchy of error classes, library
authors can be sure that they know all possible error types and no other
ones can appear later. */

/*To declare a sealed class or interface, put the sealed modifier before its name:*/

sealed interface Error

sealed class IOError(): Error

class FileReadError(val file: File): IOError()
class DatabaseError(val source: DataSource): IOError()

object RuntimeError : Error


/*A sealed class is abstract by itself, it cannot be instantiated
 directly and can have abstract members.

Constructors of sealed classes can have one of two visibilities:
protected (by default) or private:*/


/*sealed class IOError {
    constructor() { *//*...*//* } // protected by default
    private constructor(description: String): this() { *//*...*//* } // private is OK
    // public constructor(code: Int): this() {} // Error: public and internal are not allowed
}*/


/*Location of direct subclasses
Direct subclasses of sealed classes and interfaces must be declared in the same package.
They may be top-level or nested inside any number of other named classes, named interfaces,
or named objects. Subclasses can have any visibility as long as they are compatible with
normal inheritance rules in Kotlin.

Subclasses of sealed classes must have a proper qualified name. They can't be local nor
anonymous objects.

enum classes can't extend a sealed class (as well as any other class), but they can
implement sealed interfaces.

These restrictions don't apply to indirect subclasses. If a direct subclass of a sealed
class is not marked as sealed, it can be extended in any way that its modifiers allow:

sealed interface Error // has implementations only in same package and module

sealed class IOError(): Error // extended only in same package and module
open class CustomError(): Error // can be extended wherever it's visible
Inheritance in multiplatform projects
There is one more inheritance restriction in multiplatform projects: direct subclasses
of sealed classes must reside in the same source set. It applies to sealed classes
without the expect and actual modifiers.

If a sealed class is declared as expect in a common source set and have actual implementations in platform source sets, both expect and actual versions can have subclasses in their source sets. Moreover, if you use a hierarchical structure, you can create subclasses in any source set between the expect and actual declarations.*/


/*link https://kotlinlang.org/docs/sealed-classes.html*/




