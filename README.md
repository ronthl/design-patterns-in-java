# Design Patterns in Java
## Simple Factory Pattern 
### Definition
It creates an object without exposing the instantiation logic to the client.

### Concept
In object-oriented programming, a factory is an object that can create other object.
A factory can be invoked in many different ways, but most often it uses a method that can return objects
with varying prototypes. Any subroutine that can help you create these new objects can be considered
as a factory. Most importantly, it helps you abstract the process of object creation from
the consumers of the application.

### Note
The Simple Factory pattern is not treated as a standard design pattern in the GoF's famous book,
but the approach is common to any application you write where you want to separate the code
that varies a lot from the code that does not vary. It is assumed that you follow this approach
in all applications you write.

Checkout the `dev.rontran` package to see the sample code.

## How to run the project
* Compile: `javac -d "animal" ./src/main/java/dev/rontran/*`
* Run: `java -classpath "animal" dev.rontran.Client`
