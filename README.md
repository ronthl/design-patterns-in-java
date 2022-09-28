# Design Patterns in Java
## Dependency Inversion Principle Introduction
The Dependency Inversion Principle (DIP) covers two important things:
* A high-level concrete class should not depend on a low-level concrete class.
Instead, both should depend on abstractions.
* Abstractions should not depend upon details.
Instead, the details should depend upon abstraction.

> In his book _Agile Principles, Patterns and Practices in C#_,
> Robert C. Martin explains that a traditional software development model in those days
> (such as structured analysis and design) tends to create software
> where high-level modules used to depend on low-level modules.
> But in OOP, a well-designed program opposes this idea.
> It inverts the dependency structure that often results from a traditional procedural method.
> This is the reason he used the word "inversion" in this principle.

In the `src/main/java/dev/rontran/dev.rontran.violations` package, I wrote the code that violates the principle.
And in the `src/main/java/dev/rontran/corrections` package, I update the code to fix the dev.rontran.violations.

## How to run a project
### Violations package
* Compile: `javac -d "violations" ./src/main/java/dev/rontran/violations/*`
* Run: `java -classpath "violations" dev.rontran.violations.Client`
### Corrections package
* Compile: `javac -d "corrections" ./src/main/java/dev/rontran/corrections/*`
* Run: `java -classpath "corrections" dev.rontran.corrections.Client`
