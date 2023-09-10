## Type Conversions

### Objective:

In Kotlin, smaller data types cannot be implicitly converted to larger types. This means that each data type conversion needs to be explicitly done. Your task is to create a program that can convert between different basic data types based on user input.

### Requirements:

1. Your program should first ask: "Which data type do you want to convert from? (Int, Double, String)"
2. After the user selects a data type, prompt them to enter a value: "Please enter the value:"
3. Then, your program should ask: "Which data type do you want to convert to? (Int, Double, String)"
4. Perform the conversion and print out the converted value.
5. If the conversion is not possible (e.g., trying to convert a non-numeric string to an Int or Double), print: "Conversion not possible."

### Example:

```plaintext
Which data type do you want to convert from? (Int, Double, String): Int
Please enter the value: 42
Which data type do you want to convert to? (Int, Double, String): String
Converted value: "42"
