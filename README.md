
# Child's Face Reaction to Food Project

## Introduction
This project is a simple Java program that allows you to determine a child's face reaction based on the food they are fed. It provides various ways to refactor the code to achieve the same output while removing or replacing the "if-else if" conditions.

## How to Use

### Prerequisites
Before running the program, make sure you have the following installed on your system:

Java Development Kit (JDK)
Java Runtime Environment (JRE)
Running the Program

#### Clone the project repository to your local machine:

#### Navigate to the project directory:
```
cd MoodReactor
```

#### Compile the Java code:

```
javac src/com/atlus/moodreactor/MoodReactor.java
```
#### Run the program:
```
java src/com/atlus/moodreactor/MoodReactor
```

Follow the on-screen instructions to feed the child with "Ice Cream," "Salad," or "Milk." The program will display the child's face reaction based on the input.

Refactoring Options
This project provides three different ways to refactor the code for determining the child's face reaction without using "if-else if" conditions. You can choose the approach that best suits your coding style and requirements:

Using a HashMap: This approach uses a HashMap to map food items to their corresponding face reactions. It provides a clean and extensible way to manage the reactions.

Using Enums: Enums are used to define the possible food types and their corresponding reactions. This approach is more structured and allows for easy maintenance of reaction mappings.

Using a Switch Statement: A switch statement is used to handle the different food cases and assign the corresponding face reaction. It provides a concise way to manage multiple cases.

Feel free to explore and compare these different approaches to see which one fits your needs best.
