# Hello App

## Overview
The Hello App is built incrementally using multiple use cases. 
Each use case extends the previous one while following a structured Git workflow, demonstrating the progression from a basic console output to handling dynamic data arrays efficiently.

---

## Use Case 1 (UC1): Display "Hello World"
Prints the literal text `Hello World` to the console using a simple Java program. This establishes the base repository and branch structure.

---

## Use Case 2 (UC2): Display "Hello" with Command-Line Argument

### Goal
Extend UC1 by accepting a user's name as a command-line argument and displaying a personalized greeting.

### Description
In this use case, the program reads the `args` array passed during execution. If an argument is provided, it dynamically outputs "Hello [Name]" instead of a static message. 

This use case focuses on understanding:
- Command-line execution
- Array indexing (`args[0]`)
- Basic conditional logic (`if` statements)
- String concatenation

---

### Key Concepts Used
- Command-line arguments
- Standard I/O operations
- Conditional execution
- Incremental development using Git feature branches

---

## Use Case 3 (UC3): Command-Line Argument or Default Message
UC3 refactors the logic to include a reliable fallback. If no arguments are provided during execution, the program safely defaults the target name to "World". This adds robustness and prevents array out-of-bounds errors.

---

## Use Case 4 (UC4): Multiple Arguments (Standard Loop)
UC4 extends the application to accept an unlimited number of names as command-line arguments. It introduces a standard `for` loop and `StringBuilder` to process the array of arguments and construct a combined greeting.

---

## Use Case 5 (UC5): Enhanced For Loop
UC5 improves code readability by replacing the standard `for` loop with a Java enhanced for loop (for-each loop) to iterate through the arguments array, preserving the exact same greeting functionality.

---

## Use Case 6 (UC6): Substring Method to Remove Delimiter
UC6 focuses on string manipulation. It concatenates multiple names using an enhanced for loop and a trailing delimiter (`, `). It then introduces the `substring()` method to mathematically target and remove the final trailing comma and space before rendering the output.

---

## Use Case 7 (UC7): String.join() Refactor
UC7 completely refactors the array concatenation logic by replacing the manual loops and `substring` math with Java's built-in `String.join()` method. This drastically improves code conciseness, maintainability, and efficiency while handling delimiters perfectly.

---

### How to Run
Compile the application:
```bash
javac HelloApp.java
