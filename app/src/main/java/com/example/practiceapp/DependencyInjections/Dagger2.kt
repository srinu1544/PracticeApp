package com.example.practiceapp.DependencyInjections

/*

** what is dagger **
Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android.
It is an adaptation of an earlier version created by Square and now maintained by Google.


Dagger 2 is a popular dependency injection framework for Java and Android applications. It helps
manage the dependencies within your application by generating code to provide objects with their
dependencies, making it easier to create scalable and maintainable code. Dagger 2 uses a set of
annotations to achieve this. Below, I'll explain some of the key Dagger 2 annotations:

@Module:
Annotates classes that define Dagger 2 modules.
Modules provide a way to define how to provide instances of certain types (dependencies).
You create methods within a module annotated with @Provides to specify how to create and provide instances
of dependencies.

@Provides:
Used inside a module class to annotate methods that provide instances of dependencies.
Dagger 2 will call these methods to obtain instances of the dependencies when needed.
Example:

@Module
public class MyModule {
    @Provides
    public MyDependency provideMyDependency() {
        return new MyDependency();
    }
}

@Component:
Annotates an interface or abstract class that acts as the bridge between the dependencies and the parts of
your application that need them.
Dagger 2 generates an implementation of this component at compile time.
You typically declare the dependencies you want to use in the component interface and define the
injection methods.

@Inject:
Annotates constructors, fields, or methods that Dagger 2 should use to satisfy dependencies.
Constructor injection is commonly used to provide dependencies when an object is created.
Field and method injection are used when Dagger 2 can't directly control the object's creation.

@Scope:
Allows you to define custom scoping for your components to control the lifecycle of objects.
Commonly used to create singletons or other scoped instances.
Scoping ensures that the same instance of a dependency is reused within a specific scope.

@Qualifier:
Used to disambiguate between multiple dependencies of the same type.
For example, if you have two String dependencies, you can use a custom @Qualifier annotation to specify
which one to inject.

@Named:
A common @Qualifier annotation used to specify a dependency by its name.
You can use it with @Inject or @Provides to distinguish between different instances of the same type.
@Component.Builder and @BindsInstance:

Used to create builder methods in your component interface to provide instances or values that are not known
at compile time.
Helpful for passing runtime parameters to the component.
Dagger 2 uses these annotations to generate code at compile time,
which builds a dependency graph and handles the injection of dependencies into your application's
components. This approach provides compile-time safety and efficient dependency resolution, making
your code more maintainable and testable.




*/