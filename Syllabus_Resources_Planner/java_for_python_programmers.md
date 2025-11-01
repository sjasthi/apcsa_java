# Java for Python Programmers

Welcome! Since you already know Python, learning Java will be easier than you think. Many concepts are the same, but Java has different syntax and some new ideas.

## Quick Comparison

| Feature | Python | Java |
|---------|--------|------|
| **File extension** | `.py` | `.java` |
| **Typing** | Dynamic (types checked at runtime) | Static (types declared and checked before running) |
| **Indentation** | Required for code blocks | Optional (uses `{}` instead) |
| **Semicolons** | Not needed | Required at end of statements |
| **Main entry point** | Any code at top level | Must have `main` method |

## Hello World

**Python:**
```python
print("Hello, World!")
```

**Java:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Every Java program needs a class, and the program starts in the `main` method. Don't worry about `public static` for now - just remember it's required!

## Variables and Data Types

In Java, you must declare the type of each variable.

**Python:**
```python
name = "Alice"
age = 13
height = 5.2
is_student = True
```

**Java:**
```java
String name = "Alice";
int age = 13;
double height = 5.2;
boolean isStudent = true;
```

### Common Data Types

| Python | Java | What it stores |  Variable type | 
|--------|------|----------------|----------------|
| `int` | `int` | Whole numbers (-2 billion to 2 billion) | primitive variable | 
| `float` | `float` | Decimal numbers |  primitive variable | 
| `str` | `String` | Text (note: capital S!) |  Reference variable | 
| `bool` | `boolean` | True/False (lowercase in Java!) | primitive variable | 
| `list` | `ArrayList` or `[]` | Collections of items | Reference variable | 
| - | `short` | small integer |  primitive variable | 
| - | `byte` | byte integer | primitive variable | 
| - | `long` | long integer | primitive variable | 
|- | `doulbe` | Decimal numbers | primitive variable | 
| - | `char` | A single character in single quote| primitive variable | 


**Important:** In Java, `True` and `False` are written as `true` and `false` (lowercase).

## Comments

**Python:**
```python
# Single line comment

"""
Multi-line
comment
"""
```

**Java:**
```java
// Single line comment

/*
Multi-line
comment
*/

/**
JavaDoc style
comment
*/

```

## Input and Output

**Python:**
```python
name = input("What's your name? ")
print("Hello, " + name)
print(f"You are {age} years old")
```

**Java:**
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("What's your name? ");
String name = scanner.nextLine();
System.out.println("Hello, " + name);
System.out.println("You are " + age + " years old");
```

## Operators

Most operators are the same, but there are a few differences:

| Operation | Python | Java |
|-----------|--------|------|
| Addition | `+` | `+` |
| Subtraction | `-` | `-` |
| Multiplication | `*` | `*` |
| Division | `/` | `/` |
| Integer division | `//` | `/` (if both numbers are ints) |
| Modulo | `%` | `%` |
| Exponent | `**` | `Math.pow(base, exp)` |
| Equal to | `==` | `==` |
| Not equal | `!=` | `!=` |
| And | `and` | `&&` |
| Or | `or` | `||` |
| Not | `not` | `!` |

## If Statements

**Python:**
```python
if age < 13:
    print("You're a kid")
elif age < 20:
    print("You're a teenager")
else:
    print("You're an adult")
```

**Java:**
```java
if (age < 13) {
    System.out.println("You're a kid");
} else if (age < 20) {
    System.out.println("You're a teenager");
} else {
    System.out.println("You're an adult");
}
```

Key differences:
- Use `else if` instead of `elif`
- Conditions must be in parentheses `()`
- Code blocks use curly braces `{}` instead of indentation

## Loops

### For Loops

**Python:**
```python
# Looping through a range
for i in range(5):
    print(i)

# Looping through a list
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)
```

**Java:**
```java
// Looping through a range
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// Looping through an array
String[] fruits = {"apple", "banana", "cherry"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

### While Loops

**Python:**
```python
count = 0
while count < 5:
    print(count)
    count += 1
```

**Java:**
```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```

Note: `count++` is a shorthand for `count = count + 1` in Java.

## Lists and Arrays

### Arrays (Fixed Size)

**Java:**
```java
// Create an array
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};

// Access elements
System.out.println(numbers[0]); // Prints 1

// Get length
System.out.println(numbers.length); // Note: no parentheses!
```

### ArrayList (Dynamic Size - More like Python lists)

**Java:**
```java
import java.util.ArrayList;

ArrayList<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("cherry");

System.out.println(fruits.get(0)); // "apple"
System.out.println(fruits.size()); // 3

fruits.remove("banana");
```

## Methods (Functions)

**Python:**
```python
def greet(name):
    return f"Hello, {name}!"

def add(a, b):
    return a + b

message = greet("Alice")
sum = add(5, 3)
```

**Java:**
```java
public static String greet(String name) {
    return "Hello, " + name + "!";
}

public static int add(int a, int b) {
    return a + b;
}

String message = greet("Alice");
int sum = add(5, 3);
```

Key differences:
- Must specify the return type before the method name
- Must specify the type of each parameter
- Use `void` if the method doesn't return anything

## Classes and Objects

**Python:**
```python
class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def bark(self):
        print(f"{self.name} says woof!")

my_dog = Dog("Buddy", 3)
my_dog.bark()
```

**Java:**
```java
public class Dog {
    // Instance variables
    private String name;
    private int age;
    
    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method
    public void bark() {
        System.out.println(name + " says woof!");
    }
}

// Using the class
Dog myDog = new Dog("Buddy", 3);
myDog.bark();
```

Key differences:
- Use `this` instead of `self`
- Constructor has the same name as the class
- Instance variables are usually `private`
- Use `new` keyword to create objects

## Strings

**Python:**
```python
text = "Hello"
print(text.upper())
print(text.lower())
print(len(text))
print(text[0])
```

**Java:**
```java
String text = "Hello";
System.out.println(text.toUpperCase());
System.out.println(text.toLowerCase());
System.out.println(text.length());
System.out.println(text.charAt(0));
```

## Common Gotchas

1. **String comparison:** In Java, use `.equals()` not `==`
   ```java
   // Wrong
   if (name == "Alice") { }
   
   // Correct
   if (name.equals("Alice")) { }
   ```

2. **Semicolons:** Don't forget them at the end of statements!

3. **Curly braces:** Always close your `{}` blocks

4. **Case sensitivity:** Remember `String` (capital S) and `boolean` (lowercase b)

5. **Array indexing:** Just like Python, arrays start at 0

## Quick Reference: Side by Side

```python
# Python
def calculate_area(radius):
    pi = 3.14159
    return pi * radius ** 2

radius = 5
area = calculate_area(radius)
print(f"Area: {area}")
```

```java
// Java
public static double calculateArea(double radius) {
    double pi = 3.14159;
    return pi * Math.pow(radius, 2);
}

double radius = 5;
double area = calculateArea(radius);
System.out.println("Area: " + area);
```

## Practice Tips

1. Start with small programs and gradually add complexity
2. Pay attention to error messages - they often tell you exactly what's wrong
3. Remember to save your Java file with the same name as your class
4. Use an IDE like IntelliJ IDEA, Eclipse, or VS Code - they help catch errors!
5. Practice converting your Python programs to Java

## Next Steps

Once you're comfortable with the basics, explore:
- Exception handling (try-catch)
- Inheritance and polymorphism
- Interfaces
- Java Collections (HashMap, HashSet, etc.)
- File I/O

Good luck with your Java journey! Remember, the logic and problem-solving skills you learned in Python transfer directly to Java - it's mainly the syntax that's different.
