# Design Patterns in Java
## Liskov Substitution Principle Introduction
The Interface Segregation Principle (ISP) suggests that you don't pollute an interface
with the unnecessary methods only to support one (or some) of the implementing classes
of this interface.

The idea is that **_a client should not depend on a method that it does not use_**.

In the `src/main/java/dev/rontran/violations` package, I wrote the code that violates the principle.
And in the `src/main/java/dev/rontran/corrections` package, I update the code to fix the violations.

## How to run a project
### Violations package
* Compile: `javac -d "violations" ./src/main/java/dev/rontran/violations/*`
* Run: `java -classpath "violations" dev.rontran.violations.Client`
### Corrections package
* Compile: `javac -d "corrections" ./src/main/java/dev/rontran/corrections/*`
* Run: `java -classpath "corrections" dev.rontran.corrections.Client`
