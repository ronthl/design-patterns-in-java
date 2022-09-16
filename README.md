# Design Patterns in Java
## Single Responsibility Principle Introduction
This principle says that **_a class should have only one reason to change_**.

In the `src/main/java/dev/rontran/violations` package, I wrote the code that violates the principle.
And in the `src/main/java/dev/rontran/corrections` package, I update the code to fix the violations.

## How to run a project
### Violations package
* Compile: `javac -d "violations" ./src/main/java/dev/rontran/violations/*`
* Run: `java -classpath "violations" dev.rontran.violations.Client`
### Corrections package
* Compile: `javac -d "corrections" ./src/main/java/dev/rontran/corrections/*`
* Run: `java -classpath "corrections" dev.rontran.corrections.Client`
