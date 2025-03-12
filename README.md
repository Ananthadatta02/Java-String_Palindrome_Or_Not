# String Palindrome Checker

## Description
This Java program checks whether a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same forward and backward (e.g., "madam", "racecar"). The program takes user input, reverses the string, and compares it with the original to determine if it's a palindrome.

## How the Program Works
1. The program imports `java.util.Scanner` to read user input.
2. It prompts the user to enter a string.
3. The program reverses the string using a `for` loop.
4. It compares the reversed string with the original input.
5. If both match, it prints "Palindrome"; otherwise, it prints "Not Palindrome".

## Code Explanation

### 1. Importing Scanner Class
```java
import java.util.Scanner;
```
The `Scanner` class is used to take input from the user.

### 2. Declaring the Main Class and Method
```java
public class String_Palindrome_or_Not {
    public static void main(String[] args) {
```
This defines the main method, which serves as the entry point of the program.

### 3. Taking User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the String");
String st = s.next();
```
- `Scanner s = new Scanner(System.in);` creates a `Scanner` object to take input from the console.
- `System.out.println("Enter the String");` prints a prompt message.
- `String st = s.next();` reads the input string from the user (only the first word, since `next()` reads until space).

### 4. Reversing the String
```java
String temp = "";
for(int i = st.length() - 1; i >= 0; i--) {
    char ch = st.charAt(i);
    temp = temp + ch;
}
```
- `String temp = "";` initializes an empty string to store the reversed string.
- The `for` loop starts from the last character (`st.length() - 1`) and moves to the first character (`i >= 0`).
- `char ch = st.charAt(i);` extracts each character from the end.
- `temp = temp + ch;` appends the extracted character to `temp` to form the reversed string.

### 5. Checking for Palindrome
```java
if(temp.equals(st))
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
```
- `if(temp.equals(st))` checks if the reversed string (`temp`) is equal to the original input (`st`).
- If they match, the program prints "Palindrome".
- Otherwise, it prints "Not Palindrome".

### 6. Closing the Scanner
```java
s.close();
```
- The `Scanner` object is closed to prevent resource leaks.

## Example Output
### Input 1:
```
Enter the String
madam
```
### Output 1:
```
Palindrome
```

### Input 2:
```
Enter the String
hello
```
### Output 2:
```
Not Palindrome
```

## Key Concepts Used
- **Scanner Class**: Used for input handling.
- **String Manipulation**: Using `charAt()` and `+` for string reversal.
- **Loops (`for` loop)**: Iterates through the string from end to start.
- **Conditional Statements (`if-else`)**: Compares original and reversed strings.
- **Printing Statements**: Used to display messages and results to the user.

## Conclusion
This program effectively determines whether a given string is a palindrome by reversing it and comparing it to the original input. It demonstrates fundamental Java concepts such as loops, conditionals, and string manipulation.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-String_Palindrome_Or_Not.git
```
