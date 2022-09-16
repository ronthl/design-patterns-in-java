# Design Patterns in Java
## Open-Closed Principle Introduction
The _Open-Closed Principle_ (OCP) was coined in 1988 by Bertrand Meyer.
It says: **_A software artifact should be open for extension but closed for modification_**.

In the `src/main/java/dev/rontran/violations` package, I wrote the code that violates the principle.
And in the `src/main/java/dev/rontran/corrections` package, I update the code to fix the violations.

## How to run the project
### Violations package
* Compile: `javac -d "violations" ./src/main/java/dev/rontran/violations/*`
* Run: `java -classpath "violations" dev.rontran.violations.Client`
### Corrections package
* Compile: `javac -d "corrections" ./src/main/java/dev/rontran/corrections/**/*.java`
* Run: `java -classpath "corrections" dev.rontran.corrections.Client`
