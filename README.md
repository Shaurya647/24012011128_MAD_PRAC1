# Practical-1: Kotlin Programming Concepts

## AIM

Develop Kotlin programs to demonstrate various fundamental programming concepts, including variables, type conversion, input/output, control flow, functions, recursion, arrays, collections, classes, constructors, inheritance, operator overloading, and matrix operations.

---

# 1.1 Store & Display Values in Different Variables

Create and display variables of different Kotlin data types:

* Integer (`Int`)
* Double (`Double`)
* Float (`Float`)
* Long (`Long`)
* Short (`Short`)
* Byte (`Byte`)
* Character (`Char`)
* Boolean (`Boolean`)
* String (`String`)

### Concepts Covered

* Variable declaration
* `val` and `var`
* Kotlin primitive data types
* String interpolation
* Displaying values using `println()`

---

# 1.2 Type Conversion

Perform conversions between different data types.

### Required Conversions

1. Integer to Double
2. String to Integer
3. String to Double

### Important Kotlin Functions

```kotlin
toDouble()
toInt()
toFloat()
toLong()
```

Example:

```kotlin
val number = 10
val doubleNumber = number.toDouble()

val strNumber = "25"
val intNumber = strNumber.toInt()
val doubleValue = strNumber.toDouble()
```

---

# 1.3 Scan Student's Information

Create a Kotlin program to accept and display student information.

### Information

* Student Name
* Enrollment Number
* Branch
* Class
* Semester
* Lab Batch
* Other required details

### Concepts Covered

* `readLine()`
* User input
* String handling
* Displaying formatted information

Example:

```kotlin
print("Enter Student Name: ")
val name = readLine()

print("Enter Enrollment No: ")
val enrollmentNo = readLine()
```

---

# 1.4 Check Odd or Even Numbers

Create a program to determine whether a number is odd or even.

The condition should be implemented directly within the `println()` statement using control flow.

Example:

```kotlin
val number = 10

println(
    if (number % 2 == 0)
        "Even"
    else
        "Odd"
)
```

### Concept Covered

* `if-else`
* Modulus operator `%`
* Conditional expressions
* Control flow inside `println()`

---

# 1.5 Display Month Name

Use Kotlin's `when` expression to display the month name based on user input.

### Example

```kotlin
val month = 5

when (month) {
    1 -> println("January")
    2 -> println("February")
    3 -> println("March")
    4 -> println("April")
    5 -> println("May")
    6 -> println("June")
    7 -> println("July")
    8 -> println("August")
    9 -> println("September")
    10 -> println("October")
    11 -> println("November")
    12 -> println("December")
    else -> println("Invalid month")
}
```

### Concept Covered

* `when` expression
* User input
* Conditional branching

---

# 1.6 User-Defined Function

Create a user-defined function to perform arithmetic operations on two numbers.

### Operations

* Addition
* Subtraction
* Multiplication
* Division

Example:

```kotlin
fun calculate(a: Double, b: Double) {
    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")
    println("Division: ${a / b}")
}
```

### Concepts Covered

* Function declaration
* Function parameters
* Function calls
* Arithmetic operators
* Return values

---

# 1.7 Factorial Calculation with Recursion

Create a recursive function to calculate the factorial of a number.

### Example

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1)
        1
    else
        n * factorial(n - 1)
}
```

### Example Output

```text
Enter number: 5
Factorial: 120
```

### Concept Covered

* Recursion
* Base condition
* Recursive function calls

---

# 1.8 Working with Arrays

Demonstrate different Kotlin array operations.

### Required Operations

* `Arrays.deepToString()`
* `contentDeepToString()`
* `IntArray.joinToString()`
* Array traversal using loops
* `range`
* `downTo`
* `until`
* Sorting without built-in functions
* Sorting using built-in functions

### Example

```kotlin
val numbers = intArrayOf(5, 2, 8, 1, 9)

println(numbers.joinToString())
```

### Loop Examples

```kotlin
for (i in 1..5) {
    println(i)
}

for (i in 5 downTo 1) {
    println(i)
}

for (i in 0 until 5) {
    println(i)
}
```

### Sorting Without Built-in Function

Use a sorting algorithm such as Bubble Sort.

```kotlin
for (i in 0 until numbers.size - 1) {
    for (j in 0 until numbers.size - i - 1) {
        if (numbers[j] > numbers[j + 1]) {
            val temp = numbers[j]
            numbers[j] = numbers[j + 1]
            numbers[j + 1] = temp
        }
    }
}
```

### Sorting Using Built-in Function

```kotlin
numbers.sort()
```

---

# 1.9 Find Maximum Number from ArrayList

Create an `ArrayList` containing integers and find the maximum value.

Example:

```kotlin
val numbers = arrayListOf(10, 25, 5, 40, 15)

var maximum = numbers[0]

for (number in numbers) {
    if (number > maximum) {
        maximum = number
    }
}

println("Maximum Number: $maximum")
```

### Concept Covered

* `ArrayList`
* Loops
* Comparison
* Finding maximum values

---

# 1.10 Class and Constructor Creation

Create a `Car` class with the following properties:

* Type
* Model
* Price
* Owner
* Miles Driven

### Required Functions

Implement functions to:

1. Get car information
2. Display original car price
3. Calculate/display current car price
4. Display complete car information

### Concepts Covered

* Classes
* Objects
* Primary constructors
* Secondary constructors
* Properties
* Member functions
* Object creation

Example structure:

```kotlin
class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {
    fun displayInfo() {
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }
}
```

---

# 1.11 Operator Overloading and Matrix Operations

Explain and demonstrate operator overloading using a `Matrix` class.

### Required Operations

* Matrix Addition
* Matrix Subtraction
* Matrix Multiplication
* Customized `toString()` output

### Operator Overloading

Kotlin allows operators such as `+`, `-`, and `*` to be overloaded by defining special functions.

Example:

```kotlin
operator fun plus(other: Matrix): Matrix
operator fun minus(other: Matrix): Matrix
operator fun times(other: Matrix): Matrix
```

### Customized Output

Override `toString()`:

```kotlin
override fun toString(): String {
    return "Matrix(...)"
}
```

### Concepts Covered

* Operator overloading
* Classes
* Matrix operations
* Function overriding
* `toString()`

---

# Exercises: Kotlin Programs

## Exercise 1: Swap Two Variables

Create programs to swap the values of two variables in two ways.

### Method 1: Using a Third Variable

```kotlin
var a = 10
var b = 20

val temp = a
a = b
b = temp
```

### Method 2: Without Using a Third Variable

```kotlin
var a = 10
var b = 20

a = a + b
b = a - b
a = a - b
```

### Concepts Covered

* Variables
* Assignment
* Arithmetic operations
* Swapping values

---

# Exercise 2: Product and Laptop Inheritance

Create two classes:

* `Product`
* `Laptop`

`Product` should be the **parent class**, and `Laptop` should be the **child class**.

## Product Class

Add the following properties:

* Product Name
* Quantity
* Amount per Quantity

## Laptop Class

Add laptop configuration details such as:

* CPU Name
* RAM Size
* HDD Size
* Other configuration details

### Constructors

Create:

* Primary constructor
* Secondary constructor

for both classes where appropriate.

### Constructor and Inheritance Question

**If a primary constructor is present, can we create a secondary constructor in an inheritance hierarchy?**

Yes. A Kotlin class can have both a primary constructor and one or more secondary constructors.

However, every secondary constructor must ultimately initialize the class through the primary constructor or another secondary constructor.

### Parent with Multiple Secondary Constructors

If the parent class has more than two secondary constructors, the child class does not have to reproduce all of them.

The child class must invoke a valid parent constructor when it is initialized. The child can define its own constructors independently, subject to Kotlin's constructor delegation rules.

### ArrayList of Laptops

Create a list containing five laptop objects.

Example:

```kotlin
val laptops = ArrayList<Laptop>()

laptops.add(Laptop(...))
laptops.add(Laptop(...))
laptops.add(Laptop(...))
laptops.add(Laptop(...))
laptops.add(Laptop(...))
```

Display the information of all five objects.

---

# Exercise 3: Person and Student Inheritance

Create two classes:

* `Person`
* `Student`

`Person` should be the **parent class**, and `Student` should be the **child class**.

## Person Class

Add:

* First Name
* Last Name
* Age

## Student Class

Add:

* Enrollment Number
* Branch
* Class
* Lab Batch
* Other student details

### Constructors

Create:

* Primary constructor
* Secondary constructor

for both classes where appropriate.

### ArrayList of Students

Create a list containing five student objects.

Example:

```kotlin
val students = ArrayList<Student>()

students.add(Student(...))
students.add(Student(...))
students.add(Student(...))
students.add(Student(...))
students.add(Student(...))
```

Display the information of all five students.

---

# Concepts Covered

This practical covers the following Kotlin programming concepts:

| Practical  | Concept                         |
| ---------- | ------------------------------- |
| 1.1        | Variables and Data Types        |
| 1.2        | Type Conversion                 |
| 1.3        | User Input                      |
| 1.4        | Conditional Statements          |
| 1.5        | `when` Expression               |
| 1.6        | User-Defined Functions          |
| 1.7        | Recursion                       |
| 1.8        | Arrays and Loops                |
| 1.9        | ArrayList and Maximum Value     |
| 1.10       | Classes and Constructors        |
| 1.11       | Operator Overloading and Matrix |
| Exercise 1 | Variable Swapping               |
| Exercise 2 | Inheritance and Constructors    |
| Exercise 3 | Inheritance and Student Objects |

---

# Requirements

* Kotlin compiler / Kotlin-compatible IDE
* IntelliJ IDEA or Android Studio
* JDK
* Basic knowledge of Kotlin syntax

---

# Conclusion

This practical demonstrates the fundamental features of the Kotlin programming language. It starts with basic variables and data types and progresses to type conversion, user input, control flow, functions, recursion, arrays, collections, classes, constructors, inheritance, operator overloading, and matrix operations.

The exercises further strengthen object-oriented programming concepts through variable swapping, `Product`-`Laptop` inheritance, and `Person`-`Student` inheritance.
