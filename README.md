# Design Patterns in Java
## Liskov Substitution Principle Introduction
The Liskov Substitution Principle (LSP) was initially introduced from the work of
Barbara Liskov in 1988. **_The LSP says that you should be able to substitute a parent
(or base) type with a subtype_**.

In the `src/main/java/dev/rontran/violations` package, I wrote the code that violates the principle.
And in the `src/main/java/dev/rontran/corrections` package, I update the code to fix the violations.

## How to run a project
### Violations package
* Compile: `javac -d "violations" ./src/main/java/dev/rontran/violations/*`
* Run: `java -classpath "violations" dev.rontran.violations.Client`
### Corrections package
* Compile: `javac -d "corrections" ./src/main/java/dev/rontran/corrections/*`
* Run: `java -classpath "corrections" dev.rontran.corrections.Client`
