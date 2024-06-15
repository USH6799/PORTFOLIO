# Index
# ----------------------------------------------------------

# 1. Difference between Compiler and Interpreter

# 2. WHAT IS TERMINALS?

# 3. How to Provide Output in Python?

# 4. Variables in Python

# 5. Data Types
#           - Numbers
#               - Integers
#               - Float
#               - complex

#           - Boolean
#           - String

# 6. Type Conversion

#           - to Integer
#           - to String
#           - to Boolean
#           - to float

# 7. Input in Python

# 8. General Terms
#           - Escape Sequences
#           - Raw Strings
#           - Formatted Strings

# 9. Arithmetic Operators
#           - Addition
#           - Subtraction
#           - Multiplication
#           - Division
#           - Exponent
#           - Modulus

# 10. Comparison Operators

# 11. Logical Operators

# 12. Control Flow Statements
#           - if
#           - if else
#           - elif
#           - nested if

# 13. Iterative Statements
#           - for
#           - while

# 14. Jump Statements
#           - break
#           - continue
#
# 15. Functions 
#           - Function Creation And Uses                            
# 
#           - Arguments
#               - Default Arguments
#               - Keyword Arguments

#           - Parameters
#               - Normal Parameters
#               - Default Parameters
# 
# 16. Strings
#           - what is string?
#           - String Indexing
#           - String Slicing
#           - Iteration Over Strings
# 
# 17. List
#           - what is List?
#           - List Indexing
#           - List Slicing
#           - Iteration Over Lists
#           - Adding Items To List
#           - Inserting Items To List
#           - Popping Items from List
#           - Removing Items from List
# 
# 18. Tuples
#           - What is Tuple?
#           - Creating Tuples Through List(Type Conversion)
#           - Accessing Items in tuples
#           - Soft Copy And Hard Copy
#
# 19. Sets
#           - What is Set?
#           - Iterating Over Sets
#
# 20. Dictionaries
#           - What is Dictionary in python?
#           - What are keys and Values in Dictionaries?
#           - Accessing Keys and Values in Dictionaries.
#           - Changing Values of Keys in Dictionaries.
#           - Appending new keys and values in Dictionaries.
#           - Updating Dictionaries(update() fnc)
#           - Iterating Over Dictionaries.
# 
# 21. OOPs (Object Oriented Programming)
#           - Types of Programming
#               - Imperative Programming
#               - Functional Programming
#               - Object Oriented Programming
#
#           - What is the Use of OOPs?
#           - What we need to learn in OOPs?

#           - 4 Pillars Of OOPs Programming
#               - Abstraction
#               - Polymorphism
#               - Encapsulation
#               - Inheritance
#   
#           - What are Classes and Objects?
#           - What is Abstraction?
#           - What is Polymorphism?
#           - What is Encapsulation?
#           - What is Inheritance?
#
#           - CODES PART
#               - Class Attributes And methods.
#               - Private and public attributes and methods.
#               - Accessing private Attributes and Methods.
#
#           - Object Creation
#
#           - Constructor in Python
#            
#           - What is self parameter?
#
#           - Inheritance in classes and objects
#
#           - Abstraction in classes and Methods.




# ----------------------------------------------------------
# 1. Difference between Compiler and Interpreter
# ----------------------------------------------------------

# Compiler -> Takes a set of code at once, converts it into different forms of code, and gives the final code as binary code which is later executed by the computer. Example - Java.

# Interpreter -> Takes a line of code, converts it into binary code, runs it, then moves to the next line of code, and repeats the same process for each line of code. Example - JavaScript.

# Python is an interpreted language. It means it uses an interpreter to execute its code.


# ----------------------------------------------------------
# 2. WHAT IS TERMINALS?
# ----------------------------------------------------------

# Terminal:- It is used to interact with a computer's operating system or execute commands. It provides a way for users to input commands to perform various tasks and receive textual feedback.



# ----------------------------------------------------------
# 3. How to Provide Output in Python?
# ----------------------------------------------------------

# Use the print() function to print output.

# print(value) -> Output: value

# The print() function will print the value or the value of variables, strings, anything written inside the function as an output.

print("Hello!") # Prints the string value (or the value inside the "" double quotes)

print(12233) # Prints the integer value or the number written inside the function.

print(True) # Prints the boolean value (True or False) written inside the function.

print(2.34) # Prints the floating value (decimal values) written inside the function.


print() 
print("Variables Begin:- ")
print()

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.



# ----------------------------------------------------------
# 4. VARIABLES
# ----------------------------------------------------------

# Variables are like empty boxes where you can store or change any value inside them.

# In short, a storage box for the values inside the code.

# If you use the '=' symbol after any word or name then it will become the variable.

name = "USH" # Like this, here 'name' is the variable because it has '=' sign after it and stores the string value "USH" inside it.

# You will later know what a string value is.

print(name) # Now printing the variable. Notice that I don't use "" double quotes because it is the variable, not the value.

# Expected Output will be: name

# But in reality, the real Output will be: USH

# This is because print(name) means print(value inside the variable 'name') --> print("USH") 

# Variables cannot start with numbers and don't contain special characters and spaces (instead they use underscores).

# Wrong variable name declaration:-

# 1name -> Starts with a number, wrong variable

# Corrected variable: name1 | nam1e| n1ame -> these are all right variables because they contain numbers in between or at last, instead of starting. 

# @name -> Starts with special characters, wrong variable.

# nam$e -> Contains special characters in between, wrong variable.

# Corrected variable: name -> this is the right variable because it doesn't contain any special characters. 

# Full name -> Contains spaces, wrong variable.

# Corrected variable: Full_name -> this is the right variable because it contains an underscore (_) instead of spaces.

# Why variables? What is the use?

# A very common example in each programming language, adding 2 numbers.

number1 = 10 # Here, a variable 'number1' is storing 10 as its value.

number2 = 3 # Here, a variable 'number2' is storing 3 as its value.

sum = number1 + number2 # Here a variable 'sum' is storing the addition of the value of variable 'number1' and 'number2' means sum = 10 + 3

# The value of var 'sum' becomes 13.

print(sum) # Checking the answer. The print(sum) -> print(number1 + number2) -> print(10 + 3) -> print(13) --> Output: 13

# One more advantage of variables, that you can change their value anytime at any place.

# Like a variable 'abc' storing 10

abc = 10 # A variable 'abc' storing 10.

# Check the value of var 'abc' using the print() function.
print(abc) # Prints the value of var 'abc' -> Output: 10

abc = 15 # Now the value of var 'abc' changed from 10 to 15.

# Check the value of var 'abc' using the print() function.
print(abc) # Prints the value of var 'abc' -> Output: 15

print() 
print("Datatypes Begin:- ")
print()

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.


# ----------------------------------------------------------
# 5. DATATYPES IN PYTHON
# ----------------------------------------------------------

# Datatype:- Defines which type of value it is (inside the variable). Like,

Integervar = 12 # This is a variable 'Integervar' storing 12 as its value of datatype integer, means the value stored inside this variable is integer or number. It cannot be letters or alphabets.

Stringvar = "12" # This is the variable 'Stringvar' storing "12" as its value of datatype string, means the value stored inside this variable is not integer, it is string or the same value which not changes.

Addvar = 5 # This is the variable 'Addvar' of datatype integer, because it is not surrounded by double quotes and has numbers. Storing 5.

Concatenatevar = "5" # This is the variable 'Concatenatevar' of datatype string, because it is surrounded by double quotes and has value inside it. Storing "5".

print(Integervar + Addvar) # This will add the value of var 'Integervar' and 'Addvar' and give the output.

# print(Integervar + Addvar) -> print(12 + 5) -> print(17) --> Output: 17

print(Stringvar + Concatenatevar) # This will concatenate the string value of var 'Stringvar' and the value of var 'Concatenatevar' and show the output.

# print(Stringvar + Concatenatevar) -> print("12" + "5") -> print("125") -> Output: 125, but as a string not a number.

# Concatenation works only in string values where using + operator it attaches both values as a single unit.

# Ex:- In integer, 1 + 1 = 2, like math toppers says 1 + 1 is 2.
# Ex:- In string, "1" + "1" = "11", like Legends says 1 + 1 is 11.

# ----------------------------------------------------------
# There are mainly three types of data groups,


# ----------------------------------------------------------
# Numbers datatype:-
#       - Integer (all negative and positive numbers without decimal values are called integers.)
#       - Float (All decimal values are called floats)
#           Remember if you store any calculations like division inside the variable, it is always presented in float datatype. Like,

x = 10 / 5 # Storing the division of 10 and 5 which in reality returns 2 which is integer but it gives output: 2.0 means float datatype.

print(type(x)) # A function 'type(x)' used to check the datatype of variable 'x' and printing it on the terminal window as the output.

#       - Complex (very less used, it can use imaginary numbers or values (iota 'i' or 'j')).

print(type(12j))


# ----------------------------------------------------------
# Boolean datatype:-

# This is the simplest datatype mainly used for comparison. It contains only two types of values inside it:

    # True (Means the condition is true, yes, right, working, correct), anything which is true.
    
    # False (Means the condition is false, no, wrong, not working, incorrect), anything which is false.
    
print(type(True)) # this will returns that true is of boolean datatype.

print(type(10 < 5)) # here if you think that the type will be integer, you are wrong here also the datatype will be booleann, because inside any conditonal statement, we can pass any condition which laters converts into true or flase.

# like here 10 < 5, all we know that this is wrong or false and returns false to the function and the datatype of false is boolean.
    
    
# ----------------------------------------------------------
# String datatype:- Any value inside '' single quotes or "" double quotes are string values. In short, string is a datatype which can hold anything: numbers, symbols, special characters, alphabets, everything together, and prints the same.

print() 
print("Type Conversion Begins:- ")
print()

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.


# ----------------------------------------------------------
# 6. TYPE CONVERSION
# ----------------------------------------------------------

# Type Casting Or Type Conversion:- Means changing the datatype of any variable to different datatypes

# ----------------------------------------------------------
# To type cast from any datatype to integer datatype we use:
        # int(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to string datatype we use:
        # str(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to boolean datatype we use:
        # bool(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to float datatype we use:
        # float(value)
# ----------------------------------------------------------


# Example:

a = "24" # Here the value of var 'a' is "24" of string datatype. You can check the datatype using type(x) function.

print(type(a)) # This will show that the datatype of var 'a' is string.

a = int(a) # Converting the value of var 'a' of string datatype to integer datatype using int(value), type conversion. It will show an error if conversion is not possible like if it contains non-integral values or anything else.

# Storing the converted integer datatype value in var 'a' as its new value.

# Checking the datatype of var 'a' using type(x) function.

print(type(a)) # This will show that the datatype of var 'a' is integer.

# ----------------------------------------------------------
# TRUTHY & FALSY
# ----------------------------------------------------------

# If you convert any value into boolean datatype, then it can be converted into two values either True or False.

# Like, 

a = 25 # An integer variable 'a' storing 25. 
print(bool(a)) # You know the output will be True but the question arises, how? How does 25 become true?

b = 0 # An integer variable 'b' storing 0. 
print(bool(b)) # You know the output will be False but the question arises, how? How does 0 become false?

# More examples:

str1 = "What will be the value?" # A string variable 'str1' storing a string value inside the double quotes.
print(bool(str1)) # You know the output will be True but the question arises, how? How does the string value become true?

str2 = "" # A string variable 'str2' storing nothing inside the double quotes.
print(bool(str2)) # You know the output will be False but the question arises, how? How does an empty string value become false?


# here the concept of truthy and falsy comes, I cannot deeply explain them but just remember if you write anything inside condition in python, it will either convert into true or false.

# The falsy values are:- null , 0 , "" , () , {} , [] , false , and some more.

# the Truthy values are the rest except the falsy values.

# You need to just remember and memorize the falsy values.

print() 
print("Input Begins:- ")
print()

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.


# ----------------------------------------------------------
# 7. INPUT IN PYTHON
# ----------------------------------------------------------

# Input in Python.

# You can use the input() function to take input from the user and can store it anywhere.

# Like,

input() # This will take an input from the user, but like others, the user will also not know why this input is taken or what the purpose of the input is. Then you can use input(terminal_text/purpose).

# Like,

input("Say something: ") # Now it will first print the statement or string values written inside, then ask the user to give the input.

# The above input function takes input from the user but saves the input in a garbage RAM or an unknown area, where you cannot access it. But as I said before, you can save your input anywhere like variables.

name = input("My name is: ") # This will first print the string part then ask the user for input.

# The input was stored in variable 'name'.

# Remember one thing, that all the values taken input from the user including numbers, booleans, special characters are saved as string datatype and you have to do the type conversion in order to use them.

# Lets check above Point, Checking datatype:

print(type(name)) # here if you input a number also then also the type of variable is String datatype.

print("Hello! ", name) # prints the input taken from user. Uses , comma to prints two diffrent values under 1 print() fnc like printing String and variable together.

# The above print() statement will print the string part first and then the variable part.

# print("Hello! " + name) -> print("Hello! " + "My name is: "), here input will be taken -> print("Hello! Uttkarsh) -> Output: Hello! Uttkarsh


print() 
print("General Terms Begins:- ")
print()

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.


# ----------------------------------------------------------
# 8. GENERAL TERMS
# ----------------------------------------------------------


# ----------------------------------------------------------
# ESCAPE SEQUENCES:

# Escape sequences are used to add special characters in the string. Like, \n -> new line, \t -> tab space(4 spaces), \b -> backspace, \r -> carriage return,\b -> backspace etc.

# Like, I want to Print("Hello friend. I am a coder"), here i want th part after full stop goes to next line.

print("Hello friend") # Using print() fnc to print the first part of String.
print("I am a coder") # Using print() fnc to print the Second part of String.

# Instead of Using 2 print() statements like above, we can use 1 print() statement like this:

print("Hello friend,\nI am a coder") # Now we can use \n to add new line and move the right side text of /n to next line. The Output will be same but the code will become Shorter which means code becomes Better.


# ----------------------------------------------------------
# RAW STRINGS:

# like, running this code,

print("Use \n to move to the next line") # It will print: Use   
#                                                         to move to the next line

# beacuse it is the escape sequence which is used to add a line, but here we dont want to use it , we just want to display it as output.

print(r"Use \n to move to the next line") # the 'r' letter before the String converts the String into a raw string.

# It will Print: Use \n to move to the next line


# ----------------------------------------------------------
# FORMATTED STRINGS 

# means, Strings with placeholders. Like,

name = 'dhdk' # Here the value of var 'name' is "dhdk" of string datatype.
age = 17 # Here the value of var 'age' is 17 of integer datatype.

print(f"Hello! My name is {name} and I am {age} years old.") # The above code will print "Hello! My name is dhdk and I am 17 years old."

# U can write variables inside the String part using {} braces and a variable name inside them.


# ----------------------------------------------------------
# ARITHMETIC OPERATORS
# ----------------------------------------------------------

print("\nArithmetic Operators Begins:- \n")

# A print() function statement to add extra empty lines and printing to make the terminal output better to look at.

# Used \n to add new line.

# Arithmetic operators are used to perform Mathematical Operations. Like, Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) , Power (**), Floor Division(//) etc.

# the Values or variables on which operators are applied they are known as operands.

# ----------------------------------------------------------
# Addition(+): operand1 + operand2

operand1 = 10 # Here, a variable 'operand1' is storing 10 as its value.

operand2 = 3 # Here, a variable 'operand2' is storing 3 as its value.

sum = operand1 + operand2 # Here a variable 'sum' is storing the addition of the value of variable 'operand1' and 'operand2' means sum = 10 + 3

print(sum) # Output: 13
# ----------------------------------------------------------


# ----------------------------------------------------------
# Subtraction(-): operand1 - operand2

operand1 = 10 # Here, a variable 'operand1' is storing 10 as its value.

operand2 = 3 # Here, a variable 'operand2' is storing 3 as its value.

sub = operand1 - operand2 # Here a variable 'sub' is storing the subtraction of the value of variable 'operand1' and 'operand2' means sub = 10 - 3

print(sub) # Output: 7
# ----------------------------------------------------------


# ----------------------------------------------------------
# Multiplication(*): operand1 * operand2

operand1 = 10 # Here, a variable 'operand1' is storing 10 as its value.

operand2 = 3 # Here, a variable 'operand2' is storing 3 as its value.

mul = operand1 * operand2 # Here a variable 'mul' is storing the multiplication of the value of variable 'operand1' and 'operand2' means mul = 10 * 3

print(mul) # Output: 30
# ----------------------------------------------------------


# ----------------------------------------------------------
# division(/): operand1 / operand2

operand1 = 10 # Here, a variable 'operand1' is storing 10 as its value.

operand2 = 5 # Here, a variable 'operand2' is storing 5 as its value.

div = operand1 / operand2 # Here a variable 'div' is storing the division of the value of variable 'operand1' and 'operand2' means div = 10 / 5

print(div) # Output: 2.0
# ----------------------------------------------------------


# ----------------------------------------------------------
# Power(**): base ** power

base = 4 # Here, a variable 'base' is storing 4 as its value.

power = 2 # Here, a variable 'power' is storing 2 as its value.

power = base ** power # Here a variable 'power' is storing the power of the value of variable 'base' and 'power' means power = 4 ** 2

print(power) # Output: 16
# ----------------------------------------------------------


# ----------------------------------------------------------
# modulus(%): operand1 % operand2

operand1 = 10 # Here, a variable 'operand1' is storing 10 as its value.

operand2 = 3 # Here, a variable 'operand2' is storing 3 as its value.

mod = operand1 % operand2 # Here a variable 'mod' is storing the remainder of the value of variable 'operand1' and 'operand2' means mod = 10 % 3

print(mod) # Output: 1
# ----------------------------------------------------------


# ----------------------------------------------------------
# Arithmetic Operators on Strings,


# ----------------------------------------------------------
# Concatenation(+): str1 + str2

str1 = "First " # Here the value of var 'str1' is "First " of string datatype.

str2 = 'Second' # Here the value of var 'str2' is 'Second' of string datatype.

print(str1 + str2) # The above code will print "First Second"

# Here, we can use + operator to concatenate the string values of var 'str1' and 'str2' and print it.
# ----------------------------------------------------------


# ----------------------------------------------------------
# Subtraction(-): str1 - str2

str1 = "First " # Here the value of var 'str1' is "First " of string datatype.

str2 = 'Second' # Here the value of var 'str2' is 'Second' of string datatype.

# print(str1 - str2) 
# The above code will give an error because string values can't be subtracted.
# ----------------------------------------------------------


# ----------------------------------------------------------
# Multiplication(*): str1 * str2 

str1 = "First " # Here the value of var 'str1' is "First " of string datatype.

str2 = 'Second' # Here the value of var 'str2' is 'Second' of string datatype.

# print(str1 * str2) 
# The above code will give an error because string values can't be multiplied.
# ----------------------------------------------------------


# ----------------------------------------------------------
# multiplication(*): str1 * num1

str1 = "First " # Here the value of var 'str1' is "First " of string datatype.

num1 = 2 # Here the value of var 'num1' is 2 of integer datatype.

print(str1 * num1) 
# The above code will print "First First "

# here the value of var 'str1' is printed twice as it is multiplied by 2.
# ----------------------------------------------------------


# ----------------------------------------------------------
# division(/): str1 / str2

str1 = "First " # Here the value of var 'str1' is "First " of string datatype.  

str2 = 'Second' # Here the value of var 'str2' is 'Second' of string datatype.

# print(str1 / str2) 
# The above code will give an error because string values can't be divided.

# here the value of var 'str1' is divided by 'str2' and it gives an error.
# ----------------------------------------------------------


# ----------------------------------------------------------
# COMPARISON OPERATORS
# ----------------------------------------------------------


# COMPARISON OPERATORS: Means, it compares the values of two variables and returns either True or False.

# like,

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

print(a < b) # Here, the value of var 'a' is less than 'b' and it gives the output as True.

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

print(a > b) # Here, the value of var 'a' is greater than 'b' and it gives the output as False.


# ----------------------------------------------------------
# LOGICAL OPERATORS,
# ----------------------------------------------------------


# Means, it returns True or False based on the conditions.


# ----------------------------------------------------------
# AND OPERATOR

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

print(a > b and a < b) # Here, the value of var 'a' is greater than 'b' and 'a' is less than 'b' and it gives the output as False.

# In and operator, if both the conditions are true then it returns true otherwise it returns false.
# if the first condition is true and the second condition is false then it returns false.


# ----------------------------------------------------------
# OR OPERATOR

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

print(a > b or a < b) # Here, the value of var 'a' is greater than 'b' and 'a' is less than 'b' and it gives the output as True.

# In or operator, if any one of the conditions is true then it returns true otherwise it returns false.

# if the first condition is false and the second condition is true then it returns true.

# if both the conditions are false then it returns false.


# ----------------------------------------------------------
# NOT OPERATOR

# Means, it returns True if the condition is false and returns False if the condition is true.

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

print(not a > b) # Here, the value of var 'a' is greater than 'b' which is true and 'not' operator inverts it and gives the output as False.

# the comparison operators Always returns boolean values either True or False.


# ----------------------------------------------------------
# CONTROL FLOW STATEMENTS
# ----------------------------------------------------------


# ----------------------------------------------------------
# 1. Simple if statement.

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

if a > b: # Here, the value of var 'a' is greater than 'b' and it gives the output as True and the if block is executed.
    
    print("a is greater than b") # Output: a is greater than b
# ----------------------------------------------------------


# ----------------------------------------------------------
# 2. if-else statement.

age = int(input("Enter your age: ")) # Here the input from the user is stored in var 'age'.

if age >= 18: # Here, the value of var 'age' is greater than 18 and it gives the output as True and the if block is executed.
    
    print("You are eligible to vote.") # Output: You are eligible to vote.

else: # Here, the value of var 'age' is less than 18 and it gives the output as False and the else block is executed.
    
    print("You are not eligible to vote.") # Output: You are not eligible to vote.
# ----------------------------------------------------------


# ----------------------------------------------------------
# 3. if-elif-else statement.

exp = int(input("In a Company how much experience do you have in years: ")) # Here the input from the user is stored in var 'exp'.

if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
    
    print("Your Salary will be $500") # Output: Your Salary will be $500

elif 10 > exp > 5: # Here, the value of var 'exp' is less than 10 and greater than 5 and it gives the output as True and the elif block is executed.
    
    print("Your Salary will be $1000") # Output: Your Salary will be $1000

else: # Here, the value of var 'exp' is less than 10 and it gives the output as False and the else block is executed.
    
    print("Your Salary will be $1500") # Output: Your Salary will be $1500
# ----------------------------------------------------------


# ----------------------------------------------------------    
# 4. Nested if else statement.

age = int(input("Enter your age: ")) # Here the input from the user is stored in var 'age'.

exp = int(input("In a Company how much experience do you have in years: ")) # Here the input from the user is stored in var 'exp'.

if age >= 18: # Here, the value of var 'age' is greater than 18 and it gives the output as True and the if block is executed.
        
    if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
        
        print("Your Salary will be $500") # Output: Your Salary will be $500

    else : # Here, the value of var 'exp' is less than 5 and it gives the output as False and the else block is executed.
        
        print("Your Salary will be $700") # Output: Your Salary will be $700

elif age >= 30: # Here, the value of var 'age' is less than 30 and it gives the output as True and the elif block is executed.
    
    if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
        
        print("Your Salary will be $1000") # Output: Your Salary will be $1000

    else : # Here, the value of var 'exp' is less than 5 and it gives the output as False and the else block is executed.
        
        print("Your Salary will be $1500") # Output: Your Salary will be $1500
    
else: # Here, the value of var 'age' is less than 18 and it gives the output as False and the else block is executed.
    
    print("You are not eligible to work.") # Output: You are not eligible to work.
# ----------------------------------------------------------


# ----------------------------------------------------------
# ITERATIVE STATEMENTS
# ----------------------------------------------------------


# Iterative statements are those which are used to repeat the statements multiple times.


# ----------------------------------------------------------
# 1. For Loop

# syntax of for loop is as follows,:- for var in range(start, end, step):

for i in range(1 , 10 , 1): # Here, the value of var 'i' is less than 10 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9
    
    # it will not print 10 because it has already printed 9 and it not prints end point means 10.
    
    # if you want to print 10, then you have to write 11 as end point in the for loop.
    
# like,

for i in range(1 , 11 , 1): # Here, the value of var 'i' is less than 11 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9 10
    
# Range fnc takes 3 arguments, start, end and step. Here, start point and end point and step point.

limit = range(1 , 6 , 1) # Here, the value of var 'limit' is less than 6 and it gives the output as True and the for loop is executed.

for i in limit: # Here, the value of var 'i' is less than 6 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5
    

# Example U have to print the Table of 5, then use the for loop.

for i in range(5 , 51 , 5): # Here, the value of var 'i' is less than 51 and it gives the output as True and the for loop is executed.
    
    # here the step point is 5. which means it will print the table of 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
    
    print(i) # Output: 5 10 15 20 25 30 35 40 45 50
    
# opposite Printing like from 10 to 1 in descending order.

for i in range(10 , 0 , -1): # Here, the value of var 'i' is greater than 0 and it gives the output as True and the for loop is executed.
    
    # here -1 is the step point. which means it will print the table of 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    
    print(i) # Output: 10 9 8 7 6 5 4 3 2 1

    
# ----------------------------------------------------------
# 2. While Loop
# ----------------------------------------------------------


# syntax of while loop is as follows:- while condition:

# Like printing from 1 to 10 then,

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < 11: # Here, the value of var 'i' is less than 11 and it gives the output as True and the while loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9 10
    
    i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.
    
# Like , printing the table of 7, then,

i = 7 # Here, the value of var 'i' is 7 and it gives the output as True and the while loop is executed.

while i < 71: # Here, the value of var 'i' is less than 71 and it gives the output as True and the while loop is executed.
    
    print(i) # Output: 7 14 21 28 35 42 49 56 63 70
    
    i = i + 7 # Here, the value of var 'i' is increased by 7 and it gives the output as True and the while loop is executed.
    
    
# ----------------------------------------------------------
# BREAK AND CONTINUE STATEMENTS
# ----------------------------------------------------------


# Like in a for loop if the value of i iterating from 0 to 10 and when 7 will come then it will break the loop.

for i in range(0 , 11 , 1): # Here, the value of var 'i' is less than 11 and it gives the output as True and the for loop is executed.
    
    if i == 7: # Here, the value of var 'i' is equal to 7 and it gives the output as True and the if statement is executed.
        
        break # Here, the value of var 'i' is equal to 7 and it gives the output as True and the if statement is executed.
    
    print(i) # Output: 0 1 2 3 4 5 6 8 9 10
    

# Like in a while loop if the value of i iterating from 0 to 10 and i want to skip the even numbers then it will continue the loop.

i = 0 # Here, the value of var 'i' is 0 and it gives the output as True and the while loop is executed.

while i < 11: # Here, the value of var 'i' is less than 11 and it gives the output as True and the while loop is executed.
    
    if i % 2 == 0: # Here, the value of var 'i' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed.
        
        i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the if statement is executed.
        
        continue # Here, the value of var 'i' is increased by 1 and it gives the output as True and the if statement is executed.
    
    print(i) # Output: 1 3 5 7 9 11

    i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.

# ----------------------------------------------------------
    # FUNCTIONS
# ----------------------------------------------------------
        
# Function is a reusable block of code which performs a specific task. Like, I have to print the table of 5, then we can use the function.

# function syntax:- def function_name():

# function have two main things:- 1. Paramters and 2.Arguments.

# like Checking even and odd numbers.


# 1st Number
# ----------------------------------------------------------
a = 12 # Here, the value of var 'a' is 12 and it gives the output as True and the if statement is executed.

if a % 2 == 0: # Here, the value of var 'a' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------


# 2nd number
# ----------------------------------------------------------
b = 13 # Here, the value of var 'b' is 13 and it gives the output as True and the if statement is executed.

if b % 2 == 0: # Here, the value of var 'b' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------
    

# 3rd Number
# ----------------------------------------------------------
c = 14 # Here, the value of var 'c' is 14 and it gives the output as True and the if statement is executed.

if c % 2 == 0: # Here, the value of var 'c' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------


# Above , we are writing seperate if else for each number. Which makes the Program bigger and Complex. Instead we can use function.

# FUNCTION EX:
# ----------------------------------------------------------

def checkEvenOdd(num): # Here, the name of the function is 'checkEvenOdd' and the parameter is 'num' and it gives the output as True and the if statement is executed.

    if num % 2 == 0: # Here, the value of var 'num' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed.

        print("Even") # Output: Even

    else: # if num is odd then else block will run.

        print("Odd") # prints that num is an Odd number.

# ----------------------------------------------------------

# Now we have created a fnc checkEvenOdd and we can use it in our program.

checkEvenOdd(12) # Here, the value of var 'num' is 12 which is passed as arguments later stored as parameter inside the fnc, calling the fnc.

checkEvenOdd(13) # calling the fnc, with the argument 13 which is later stored as parameter inside the fnc

checkEvenOdd(14) # calling the fnc, with the argument 14 which is later stored as parameter inside the fnc

# So the Complex Program and a block of codes becomes Shorter and Better.

# We can reuse fnc as many times as we want.

# Remember the Diffrence btw arguments and Parameters.


# ----------------------------------------------------------
 # Above checkEvenOdd(14) in this 14 is the argument passed , or the value passed when calling a fnc is called Arguments.
 
 # Later, Inside the fnc the argument is Stored in a variable or a parameter , which is written during fnc declaration is called Parameters. Like , def checkOddEven(num) . In this case, num is a parameter.

# ----------------------------------------------------------



# ----------------------------------------------------------
# there are two types of Parameters and Arguments.

# 1. Normal Parameters

def Sayhello(name): # Here, the name of the function is 'Sayhello' and the parameter is 'name' and it runs the block code inside it when called.
    
    # name , was a  normal parameter as it needs a argument to be passed.
    
    print("hello! " , name) # prints the input taken from user.


# 2. Default Parameters

def Defaulthello(name = "Uttkarsh"): # Here, the name of the function is 'Defaulthello' and the Default parameter is 'name' and it runs the block code inside it when called.
    
    # name , was a deafult parameter as it doesn't need argument to be passed and already initialized.
    
    
    print("hello! " , name) # prints the input taken from user. Uses , comma to prints two diffrent values under 1 print() fnc like printing String and variable together.
    

# Calling the Dafault parameter fnc without a argument.

Defaulthello() # calling the fnc, without any argument passed. Here, the default value is passed as "Uttkarsh" as it has a parameter to be stored in.

# Output: hello! Uttkarsh

# but What if i passed an argument in the default parameter fnc, then

Defaulthello("USH") # calling the fnc, with the argument "USH" which is later override or cahnge the value parameter 'name' inside the fnc.

# Output: hello! USH    


# like a fnc: 

def Show(a , b , c): # Here, the name of the function is 'Show' and the parameter is 'a , b , c' and it runs the block code inside it when called.
     
    print(a , b , c) # prints the input taken from user.
    
# 3. Default Arguments

# Passing the arguments in the same order as the parameters, Like i want to pass a as 10 , b as 12 and c as 14. Then i will pass in the same order as the parameters.

Show(10 , 12 , 14) # here, it is the Default Arguments, which takes same value as the parameter.

# (10 , 12 , 14) -> (a , b , c)

# Output: (10 , 12 , 14)

# 4. Keyword Arguments

Show(c = 10 , b = 12 , a = 14) # here, it is the Keyword Arguments, which takes same value as the parameter, they are not in same order but specified.

# Output: (14 , 12 , 10)

# (14 , 12 , 10) -> (a , b , c)
# ----------------------------------------------------------



# ----------------------------------------------------------
# DIFFRENCE BTW Print() and return 
# ----------------------------------------------------------

def PrintOddEven(num): # Here, the name of the function is 'PrintOddEven' and the parameter is 'num' and it runs the block of codes inside it when called.
    
    if num % 2 == 0: # checking whether the number is even or odd, if it is even then if block will run.
        
        print("Even") # prints that num is an Even number.

    else: # if num is odd then else block will run.
        
        print("Odd") # prints that num is an Odd number.
        
    # This is how a function of print() works.
    
PrintOddEven(14) # calling the fnc, with the argument 14 which is later stored as parameter inside the fnc

# Output: Even

# But what if i want to store the result of the fnc in a variable?

# A fnc like,

def ReturnOddEven(num): # Here, the name of the function is 'ReturnOddEven' and the parameter is 'num' and it runs the block of codes inside it when called.
    
    if num % 2 == 0: # checking whether the number is even or odd, if it is even then if block will run.
        
        return "Even" # returns that num is an Even number.

    else: # if num is odd then else block will run. 
        
        return "Odd" # returns that num is an Odd number.
    
    # This is how a function of return() works.
    
answer = ReturnOddEven(13) # Calling the fnc, with the argument 13 which is later stored as parameter inside the fnc, and the Returned value is stored in a variable 'answer'.

print(answer) # Checking the answer. 

# Output: Odd   

# ----------------------------------------------------------
# STRINGS
# ----------------------------------------------------------

str = "I Am a String !@#$%^&* 1234567890" # Here, the value of var 'str' is "I Am a String !@#$%^&* 1234567890" of string datatype. 

# String is a sequence of characters. Like, I am a String. It can contain different characters like !@#$%^&* 1234567890. Everything.

print(str) # prints the string.


# ----------------------------------------------------------
# STRING INDEXING...

# A index in python is a position in a string. It always starts from 0 instead of 1 , so 1 -> 0 and 2 -> 1 .

# Accessing Character of String through Index.

print(str[0]) # Accessing the character of String at index 0 means the first letter.
# Output: I

# Assume a String 'hello' here h -> index 0 | e -> index 1 | l -> index 2 | l -> index 3 | o -> index 4.

# ----------------------------------------------------------
# STRING SLICING...

str = "helloGuys Cutit" # Here, the value of var 'str' is "helloGuys Cutit" of string datatype.

# Slicing Syntax:- var[start : end : step]

# like,

print(str[0:5]) # prints the string from index 0 to index 4.

# Output: hello

print(str[6:12]) # prints the string from index 6 to index 11.

# Output: Guys

print(str[0:12:2]) # prints the string from index 0 to index 11 in steps of 2.

# Output: hloGy


# ----------------------------------------------------------
# ITERATING OVER STRINGS

str = "Hello World" # Here, the value of var 'str' is "Hello World" of string datatype.

# Using For Loop, means in keyword

for i in str: # Here, i is a variable that will take the value of each character of the String.
    # using 'in' keyword we can check whether the variable 'i' is present in the String or not.
    
    print(i) # prints each character of the String.
    
    # OUTPUT:- H, e, l, l, o, W, o, r, l, d
    
# TO FIND LENGTH OF STRING, We use len() fnc:

print(len(str)) # prints the length of the string 'str'.

# Output: 11

# For loop using range() fnc,

for i in range(0 , len(str) , 1): # Here, the value of var 'i' goes from 0 to 11 and it gives the output as True and the for loop is executed.
    
    print(str[i]) # prints the character of the String at index 'i'.
    
    # OUTPUT:- H, e, l, l, o, W, o, r, l, d
    

# ----------------------------------------------------------
# LIST IN PYTHON
# ----------------------------------------------------------

# A list is a versatile and mutable data structure that can contain different data types and allows you to store collection of data items.

# list Syntax:- var = [val1 , val2 , val3 , val4 , val5], here you can store diffrent datatypes inside this list.

List = [12 , 122 , 1652 , "hello" , True , "Lets Work"] # Here, the value of var 'List' is [12 , 122 , 1652 , "hello" , True , "Lets Work" , ] of list datatype.

# Lets check the datatype of var 'List',

print(type(List)) # prints the datatype of var 'List'.

# Output: <class 'list'> , here you can see that it is a list datatype.

# List is varsatile because it can contain different data types.

# It is mutable because it can be changed.

print(List) # prints the whole list.

# Output:- [12 , 122 , 1652 , "hello" , True , "Lets Work"]

# Lets change the 2nd item of the list.

# Syntax:- var[index] = value

List[1] = 673 # Here, the value of var 'List' at index 1 is changed to 673.

print(List) # prints the whole list.

# OUTPUT:- [12 , 673 , 1652 , "hello" , True , "Lets Work"]


# ----------------------------------------------------------
# LIST INDEXING...

# Same indexing as in Strings like,

# List[0] -> 1st Item of list --> 12
# List[1] -> 2nd Item of list --> 673
# List[2] -> 3rd Item of list --> 1652
# List[3] -> 4th Item of list --> "hello"
# List[4] -> 5th Item of list --> True
# List[5] -> 6th Item of list --> "Lets Work"


# ----------------------------------------------------------
 # LIST SLICING...
 
 # Again, Same as Strings in slicing.

# Like, printing 1st 3 items of the list.

print(List[0 : 3]) # prints the whole list from index 0 to index 2.

# OUTPUT:- [12 , 673 , 1652]


# ---------------------------------------------------------- 
 # ITERATING OVER LISTS:
 
 # We use for loop in list. ( Using in keyword)
 
for i in List: # Here, i is a variable that will take the value of each item of the list.
    
    print(i) # prints each item of the list.
    
    # OUTPUT:- 12 , 673 , 1652 , "hello" , True , "Lets Work"
    

 # Using range() fnc,
 
for i in range(0 , len(List) , 1): # Here, the value of var 'i' goes from 0 to 6 and it gives the output as True and the for loop is executed.
    
    print(List[i]) # prints each item of the list.

    # Output:- 12 , 673 , 1652 , "hello" , True , "Lets Work"
    
    
# ----------------------------------------------------------
 # ADDING ITEMS TO LIST:
 
 # We use append() fnc to add items to list.
 # Syntax:- list.append(val)
 
a = [2,3,4,5] # Here, the value of var 'a' is [2,3,4,5] , of list datatype.

a.append(1) # Here, the value of var 'a' is [2,3,4,5,1] after appending 1 to the list.

# .append(val) fnc is used to add value 'val' at the last index of the list. Here, the value of var 'a' is [2,3,4,5,1] after appending 1 to the list.

print(a) # prints the whole list.

# OUTPUT:- [2, 3, 4, 5, 1]


# ----------------------------------------------------------
# INSERTING ITEMS TO LIST:
 
# We use insert() fnc to add items to list.
# Syntax:- list.insert(index , val)

a = [1 , 2 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 4 , 5] , of list datatype.

a.insert(2 , 3) # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] after inserting 3 at index 2.

print(a) # prints the whole list.

# OUTPUT:- [1, 2, 3, 4, 5]

# ----------------------------------------------------------
# POPPING ITEMS FROM LIST:
 
# We use pop() fnc to remove items from list.
# Syntax:- list.pop(index)

a = [1 , 2 , 3 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] , of list datatype.

a.pop(2) # Here, the value of var 'a' is [1 , 2 , 4 , 5] after removing 3 at index 2.

print(a) # prints the whole list.

# OUTPUT:- [1, 2, 4, 5]

# This Removed item Can be Stored in any variable.

a = [9,8,6,7,5] # Here, the value of var 'a' is [9,8,6,7,5] , of list datatype.

removedItem = a.pop(3) # Here, the value of var 'a' is [9,8,6,5] after removing 7 at index 3.

# The item at index 3 is removed and stored in the variable 'removedItem'

print(f"The item at index 3 is {removedItem}.") # prints the value of 'removedItem'.

print(f"The List After Removing the 3th Item of the List: {a}") # prints the whole list after removing the 3th item.

# OUTPUT:- The item at index 3 is 7.
# OUTPUT:- The List After Removing the 3th Item of the List: [9, 8, 6, 5]


# ----------------------------------------------------------
# REMOVING ITEMS FROM LIST,

# We use remove() fnc to remove items from list.
# Syntax:- list.remove(Item)

# The Two Diffrences between pop() and remove() are:-

 # IN pop():
 #      - It Returns the Removed item to the Caller or to the Variable and can be stored.
 #      - It can be used to remove any item from the list through its index.
 
 # IN remove():
 #      - It Doesn't returns the Removed item to the Caller or to the Variable and can't be stored.
 #      - It can be used to Remove the item from the list through its value not ita index.
 
a = [2 , 3 , 4 , 5 , 6 , 7 , 8 , 3 , 5 , 7] # Here, the value of var 'a' is [2 , 3 , 4 , 5 , 6 , 7 , 8 , 3 , 5 , 7] , of list datatype.

a.remove(3) # remove(item) fnc removes only the first '3' from the List.

a.remove(7) # remove(item) fnc removes only the first '7' from the List. 

a.remove(5) # remove(item) fnc removes only the first '3' from the List. 

print(a) # prints the List after removing the Above Items from it.

# OUTPUT:- [2 , 4 , 6 , 8 , 3 , 5 , 7]


# ----------------------------------------------------------
 # TUPLES
# ----------------------------------------------------------


# Tuples are also same as list but they are immutable and cannot be changed once created. U have to use () instead of [] to create Tuples.

x = (1 , 2 , 3 , "hello" , "Wello") # Here, the value of var 'x' is (1 , 2 , 3 , "hello" , "Wello") , of tuple datatype.

# Lets check the datatype of var 'x',

print(type(x)) # prints the datatype of var 'x'.

# OUTPUT:- <class 'tuple'>

# YOU CAN CREATE TUPLES THROUGH LIST by type conversion,

a = [1 , 2 , 3 , "what " , 3] # Here, the value of var 'a' is [1 , 2 , 3 , "what " , 3] , of list datatype.

x = tuple(a) # Here, the value of var 'x' becomes the value of var 'a' but it converted from list to tuple datatype.

print(x) # prints the whole tuple.

# OUTPUT:- (1, 2, 3, 'what ', 3)


# ----------------------------------------------------------
 # ACCESSING ITEMS OF TUPLE 

print(x[0]) # prints the 1st item of the tuple.

# OUTPUT:- 1

# You can access the items of tuple but You cannot Change them.

# x[0] = 12 
# This will Show an error as Tuples are immutable.


# ----------------------------------------------------------
#  SOFT COPY AND HARD COPY

a = [1 , 2 , 3 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(a) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

b = a # Here, the value of var 'b' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(b) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

c = a.copy() # Here, the value of var 'c' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(c) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

# Here All have the Same output.

# Above b is the Soft copy of a and c is the hard copy of a.

# Soft Copy only copies the reference of the object and not the actual object.

# Hard Copy copies the actual object.

b[0] = 6 

print(b) # prints the whole list.

# OUTPUT:- [6 , 2 , 3 , 4 , 5] , here the item inside the list 'b' is changed.

# But in Reality the Same item in list 'a' is also changed.

# PROOF:-

print(a) # prints the whole list.

# OUTPUT:- [6 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

# If we do opposite , changes the item in list 'a' then it also changes from list 'b' and vice versa. Because list 'b' is only a reference of list 'a' or it only copies the address of items inside list 'a'.

a[1] = 10 

print(a) # prints the whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5]

# And in list 'b' ,

print(b) # Prints the Whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5]

# ----------------------------------------------------------

# After All this Still there is no change in the list of 'c' because it is the hard copy of a , which means it really copies the items from list and have space in memory.

# List 'a' has space in memory.
# List 'b' has no space in memory , because it is the reference copy or soft copy.
# List 'c' has space in memory.

print(a) # prints the whole list.
print(b) # prints the whole list.
print(c) # prints the whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5] , list a
# OUTPUT:- [6 , 10 , 3 , 4 , 5] , list b
# OUTPUT:- [1 , 2 , 3 , 4 , 5] , list c



# ----------------------------------------------------------
 # SETS
# ----------------------------------------------------------

# Sets are Same as list and tuples , but all has some diffrences,

# Sets is also a list but in this list all items should unique or do not repeat themeselves.

# So Sets are used to store multiple items in a single variable. Sets are unordered, unchangeable, and do not allow duplicate values.

# Unordered means the items in Sets are not stored in any particular order. And cannot accessed by index.

# Sets are written with curly brackets {}.

a = {1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5} # Here, the value of var 'a' is {1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5} , of set datatype.

# Lets check the datatype of var 'a',

print(type(a)) # prints the datatype of var 'a'.

# OUTPUT:- <class 'set'>


# ----------------------------------------------------------
#  ITERATING OVER SET:

# Only One for loop will work , 'in' keyword for loop.

for i in a: # Here, the value of var 'i' is 1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 4 6 7 8 5
    
    
    
# ----------------------------------------------------------
 # DICTIONARIES
# ----------------------------------------------------------
 
# dictionary in python is a collection of key-value pairs. It is used to store data values in key:value pairs. It is Mutable, ordered, and has no duplicate values , it is iteratable but has some special powers like key and value.

# Syntax:- var = {key:value , key:value , key:value}

# Like List of Toppers with their roll no(key) and name(value)-

topper = {
    1: "Akash" ,
    4: "Abhay" ,
    11: "Ananya",
    34: "nihar" ,
    44: "Rishab"
} # Here, the value of var 'topper' is {1: 'Akash', 4: 'Abhay', 11: 'Ananya', 34: 'nihar', 44: 'Rishab'} , of dictionary datatype.

# Lets check the datatype of var 'dic',

print(type(topper)) # prints the datatype of vartopper'.

# OUTPUT:- <class 'dict'>

print(topper) # Output:- {1: 'Akash', 4: 'Abhay', 11: 'Ananya', 34: 'nihar', 44: 'Rishab'}

# ----------------------------------------------------------
#  ACCESSING ELEMENTS OF DICTIONARY: 

# Syntax:- Dict_var[key]

# We can access elements through keys, like index but in place of index we use keys.

print(topper[1]) # OUTPUT:- {1: "Akash"} 


# ----------------------------------------------------------
 # CHANGING ELEMENTS OF DICTIONARY:

# Syntax:- Dict_var[key] = newVal
 
topper[11] = 'Nidhi' # It changes the keys value by ananya to nidhi.

print(topper) # OUTPUT:- {1: 'Akash', 4: 'Abhay', 11: 'Nidhi', 34: 'nihar', 44: 'Rishab'}

# ----------------------------------------------------------
 # APPENDING NEW KEYS AND VALUES: 
 
 # Syntax:- dictVar[key] = val
 
topper[8] = "Ayush" # Adding a new element with new key and value in the dictionary.

print(topper) # OUTPUT:- {1: 'Akash', 4: 'Abhay', 11: 'Nidhi', 34: 'nihar', 44: 'Rishab' , 8: 'Ayush'}

# Values can be same in two or more keys but keys are always Unique.\

# If you want to merge two or more dictionaries together, then u can use update() fnc.

a = {
    1 : "akash" ,
    2 : "abhay" ,
    3 : 'Ananya' , 
    5 : "USH"
    }

b = {
    4: "Ayush"
}

print(a) # Output:- {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH'}


# ----------------------------------------------------------
# TO Combine a and b together, use update() fnc.

a.update(b) # a = {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH', 4: 'Ayush'} , it adds all key the elements og b into a and also overwrite the same key values.

print(a) # Output:- {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH', 4: 'Ayush'}


# ----------------------------------------------------------
 # ITERATING OVER DICTIONARIES
 
for i in a.keys(): # Here .keys allows to use it as index of a and access each element one by one.
     
     print(i) # Prints Each element of Dictionary 'a' .  
     
     
     
# ----------------------------------------------------------
 # OOPS (Object Oriented Programming)
# ----------------------------------------------------------


# There Are Three Types of Programmig:

# ----------------------------------------------------------
 # IMPERATIVE PROGRAMMING
 
num = int(input()) # Here the input from the user is stored in var 'num'.

if num % 2 == 0: # checking whether the number is even or odd, if it is even then if block will run.
    
    print("Even") # prints that num is an Even number.

else: # if num is odd then else block will run. 
    
    print("Odd")
    
# OUTPUT:- "Even" or "Odd"

# ----------------------------------------------------------
 # FUNCTIONAL PROGRAMMING
 
def OddEven(num): # Here, the name of the function is 'OddEven' and the parameter is 'num' and it runs the block of codes inside it when called.
    
    if num % 2 == 0: # checking whether the number is even or odd, if it is even then if block will run.
        
        return "Even" # returns that num is an Even number.

    else: # if num is odd then else block will run.

        return "Odd" # returns that num is an Odd number.
    
print(OddEven(20)) # OUTPUT:- "Even"
print(OddEven(23)) # OUTPUT:- "Odd"


# ----------------------------------------------------------
 # Object Oriented
class OddEvenChecker: # Here, the name of the class is 'OddEvenChecker'
    
    def __init__(self , num): # Here, the name of the function is '__init__' and the parameter is 'num' and it runs the block of codes inside it when called.
    
        if num % 2 == 0: # checking whether the number is even or odd, if it is even then if block will run.
        
            print("Even") # prints that num is an Even number.

        else: # if num is odd then else block will run.

            print("Odd") # prints that num is an Odd number.

OddEvenChecker(20) # OUTPUT:- "Even"

OddEvenChecker(23) # OUTPUT:- "Odd"


# ----------------------------------------------------------
 # What is the use of OOPs
 
    # 1. Make your code more reusable.
    # 2. Easier to work with large Programs.
    # 3. OOPs program prevents us from repeating codes.
    # 4. OOPs Provide Security to our program.
    
    
# ----------------------------------------------------------
 # What We need?
 
    # What is Encapsulation?
    # What is Class and Object?
    # Creating class Attributes and class methods.
    # Diffrence btw public and private class Attributes and Methods.
    # Making Classe's object.
    # What is Constructor fnc?
    # Object Attributes and Methods.
    # What is Polymorphism?
    # What is inheritance?
    # What is Abstraction?
    
# ----------------------------------------------------------   
 # there Are mainly 4 Pillars in OOPs Programming
    # 1. Encapsulation
    # 2. Inheritance
    # 3. Polymorphism
    # 4. Abstraction
    
    
# ----------------------------------------------------------
 # What are classes and Objects.
 
 # Classes are the blueprints for creating diffrent objects, they also know as object factory.
 
 # Like, A car factory , imagine it is a class
 
 # Now it needs three requirements like body type , tyres , and engine type to create a car.
 
 # Object are the instances of class, they have their own behaviour , attributes and methods or functions.
 
 # Like A Car factory (class),
 
 # Ferrari(object) : Covered(body) , 2 layers(tyres) and 8 cycle(Engine).
 
 # Lord Alto(object) : Covered(body) , 1 layer(tyres) and 4 cycle(Engine).

 # Splendor(object) : open(body) , 3 layers(tyres) and 8 cycle(Engine).

 # Above all vechiles are the object of Car factory, means car factory is the class which is a blueprint of vechiles(requirements) and creates the object.
 
 # all vechiles are the instance of the class.
 
 
# ----------------------------------------------------------
 # What is Abstraction?
 
    # Abstraction is the process of showing essential data to the user and hiding the unnecessary data from the user.
    
    # It means showing essential data to the user and hiding the unnecessary data from the user.
    
    # It is done by using private and public methods.
    
    # Real life example of Abstraction is:
    
        # A Brake of a car, As a driver we know that how to use brake and when to use brake, we know what to press to apply brake and slowdown or stop our car.
        
        # But, we Don't know the inside process after pressing brakes, like what happens that makes moving tyres slow or stop.
        
        # As a Car maker, they also show only the Essential information to the user or driver like where is brake and what to press, but they hide the backend or unnecessary information from the user or driver like functionality of brake in stopping the moving tyres and the engine.
        
        # This makes the code secure and not accessible to diffrent classes.
        

# ----------------------------------------------------------
 # What is Encapsulation?
 
    # Encapsulation is the process of hiding the data of the class from the outside world.
    
    # It makes the code secure and unaccessible to diffrent classes.
    
    # it can only be accessed through the class at specific methods or ways.
    
    # Real life example of Encapsulation is:
    
    # like a Lecture class , and a condition there is only the fees paid specific students can access it or attend it and the other students can't. This means that class is encapsulated.
    
    # In a open lecture class , anyone can attend the lecture, listen and watch which means no restriction and no security. This means this class is not encapsulated.
    
    
# ----------------------------------------------------------
 # What is Polymorphism?
 
    # Polymorphism means many forms, it is the ability of an object to take on many forms.
    
    # Real life example of Polymorphism is:
    
        # Like a Smart Phone , it can be used to make calls, send messages, play games, browse the internet, etc.
        
        # A Phone has the property of calculator and the property of camera, property of radio etc.
        
        # this means one phone has many features.
        

        # Another real life example is a person.
        
        # On earth , he is a Human.
        
        # In Office , He is the boss.
        
        # For his parents, he is their son.
        
        # For His Kids, he is their father.
        
        # So One person, has many diffrent forms in respect of the time , place and the person whom he met or belong.
        

# ----------------------------------------------------------
 # What is inheritance?
 
 # Inheritance means taking the features of another class to its own, means inheriting their features and using them.
 
 # The Most Simplest and Best Example Of inheritance in real life is:
 
 # GENETICS IN BIOLOGY
 
 # Like my father has a brown colored eye but my mother has a black colored eye.

 # We are 2 kids of my parents: Me and my brother.
 
 # So, i am having brown colored eyes , so i can say that i inherited this feature from my father. 
 
 # But my brother has black colored eyes, so i can say that i inherited this feature from my mother. 
 

# ----------------------------------------------------------
#  LETS CODE:- Creating class

 # Syntax for class: class class_name:
 
 # here 'class' is a keyword used to create class.
 
class CarFactory1: # this is a simple example of class

    pass   # A keyword used to declare a empty class.

# Lets check the type of var 'CarFactory',

print(type(CarFactory1)) # prints the type of var 'CarFactory'.

# Output: <class 'type'>


# ----------------------------------------------------------
 # CLASS ATTRIBUTES AND METHODS
 
 # A variable inside any class or class variables are known as attributes.
 
 # A function inside any class or class functions are known as methods.
 
class CarFactory2: # this is a simple example of class
    
    a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    def hello(): # here, a function 'hello' is declared inside the class and it is known as class methods.
        
        pass # A keyword used to declare a empty function.
    
    
# ----------------------------------------------------------
 # PUBLIC AND PRIVATE ATTRIBUTES AND METHODS
 
 
class CarFactory3: # this is a simple example of class
    
    a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    def hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
        
    hello() # here inside the class You can directly call the class method inside the class by calling the class outside.
    
CarFactory3() # here it called the class and class runs and the method inside it will run.
    
print(CarFactory3.a) # Here, Accessing attribute 'a' of Class 'CarFactory3' using . operator and printing on terminal.

# here as you see anybody can access the class variables outside the class easily.

# Now lets Try to Access Class method:

CarFactory3.hello() # Same as calling the fnc but specify the classname with . operator to access its method.

# OUTPUT:- Hello! I am a Class Method

# As You saw anybody here can access the class variables and methods easily outside the class, hence they are called public attributes and public methods of the class.


class CarFactory4: # this is a simple example of class
    
    __a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    # Using Double Underscore in front of any attribute or method will make it private.
    
    
    def __hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
         
    # hello()
     
    # here inside the class You can directly call the class method inside the class but now You cannot access it inside the class Also if you tey to call the method that it will show the error and some thinks that i changed the name of the method So here it is:
    
# print(CarFactory4.a)

# You can try to Print the value of attribute 'a' outside the class using classname and . operator , still you cannot access it and print it. It shows the error that it is not defined in the class.

# CarFactory4.hello()

# You can try same with method but still you cannot access it because they all becomes private using (__) double underscore.


# ----------------------------------------------------------
 # HOW TO ACCESS PRIVATE ATTRIBUTES AND METHODS?
 
 # you can access private method by calling them inside the class and calling the class from outside.
 
class CarFactory5: # this is a simple example of class
    
    __a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    # Using Double Underscore in front of any attribute or method will make it private.
    
    def __hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
        
    # hello()
     
    # here inside the class You can directly call the class method inside the class but now You cannot access it inside the class Also if you tey to call the method that it will show the error and some thinks that i changed the name of the method So here it is:
    
    __hello() # using this statement with the class method let you access the method in the class. U can use double underscore during calling the fnc to access it.
    
CarFactory5() # Calling the Class from outside to run the class line wise,

# after class running the method __hello() will run and prints the statements which means the method is accessiable.


# ----------------------------------------------------------
 # OBJECT CREATION
# ----------------------------------------------------------
 
#  To create a Object u have to call the class and Store it in the variable.

# Then that variable becomes object.

class CarFactory6: # This is the Simple of Class.
    a = 10 # A variable 'a' storing 10 inside it , declared inside the class and becomes class attribute.
    
    __b = 15 # A private variable 'b' Storing 15 inside it, declared inside the class becomes class attribute.
    
    def hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello Guys") # Printing...
        
# Syntax for object:- objname = classname()

obj = CarFactory6() # Here the variable 'obj' becomes an object by calling the class 'CarFactory6'.

print(obj.a) # Instead of Writing classname , u can use object to access class attributes and methods.

# Object gets all the powers of classes.

# Object has the advantage that they can create as many as we want , means diffrent objects of same class like,

obj1 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.

obj2 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.

obj3 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.


# ----------------------------------------------------------
 # CONSTRUCTOR IN PYTHON
# ----------------------------------------------------------

 
#  constructor Method is the the fnc which has the __init__ method with self as the parameter, So that whenever u need some predefined input for the class then you can use constructor.

class CarFactory7: # This is the Simple of Class.
    
    def __init__(self): # this is the main method which automatically runs during class calls and doesn't reuired to call it.
        
        print("Hello! I am Automaticlly Called") # Prints hello
        
    def ManualHello(): # here, a function 'ManualHello()' is declared inside the class and it is known as class methods.
        
        print("Hello! I Am called by the user") # prints hello
        
# Lets try calling class,

CarFactory7() # This will call the class and class automatically calls the __init__ or main method.

# OUTPUT:- Hello! I am Automatically Called

CarFactory7.ManualHello()


# U can give more parameters is the constructor fnc like,

class CarFactory8: # this is the simple class
    
    def __init__(self , body , tyre , engine): # here, 3 parameters are given in the constructor fnc.
        
        print(body , tyre , engine) # prints the 3 parameters
        
# CarFactory8() 

# this will call the class and class automatically calls the __init__ or main method but it needs 3 arguments to be passed and if no arguments are passed it will show error.


CarFactory8("Covered" , 2 , "8 cycle") # here, 3 arguments are passed and the constructor fnc automatically runs.

# OUTPUT:- "Covered" 2 "8 cycle"


# ----------------------------------------------------------
 # What is self in methods?
# ----------------------------------------------------------
# 
# So the Question arises What is the Use of self parameter in the constructor fnc, always remember that self refers to the object or the variable in which class will be stored when called.


ferrari = CarFactory8("Covered" , 2 , "8 cycle") # here the self parameter takes ferrari as its argument.


# Lets check what self contains or refer to.

class CarFactory9: # this is a simple class
    
    def __init__(self): # It is the constructor fnc of the class which automatically runs when class called.
        
        print(self) # Printing the value of var 'self'
        

CarFactory9()

# OUTPUT when class called:- <__main__.CarFactory9 object at 0x0000000001E2A5C0> , this is the address of obj 'ferrari'

# if you don not believe that you can try printing the obj 'ferrari' on the terminal.

print(ferrari) # Output:- <__main__.CarFactory9 object at 0x0000000001E2A5C0> 

# Both the output as same which means self refers to the parent obj or the calling obj.


# Now lets store the value of parameters in inside the object.

class CarFactory: # this is a simple class
    
    def __init__(self , body , tyre , engine): # here, 3 parameters are given in the constructor fnc.
        
        self.body = body # Here, the variable 'body' is stored in the parameter 'body' , used self because self refers to the parent obj
        
        self.tyre = tyre # Here, the variable 'tyre' is stored in the parameter 'tyre' used self because self refers to the parent obj
        
        self.engine = engine # Here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj
        
        print(body , tyre , engine) # prints the 3 parameters
        
ferrari = CarFactory("Covered" , 4 , "8 cycle") # here the self parameter takes ferrari as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Covered 4 8 cycle

Alto = CarFactory("Covered" , 4 , "4 cycle") # here the self parameter takes Alto as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Covered 4 4 cycle

Splendor = CarFactory("Open" , 2 , "8 cycle") # here the self parameter takes Splendor as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Open 2 8 cycle


# Now like i want to change the alto engine type from 4 cycle to 6 cycle.

Alto.engine = "6 cycle" # here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj


# -----------------------------------------------
class Main: # this is a simple class
    
    def hello(): # this is a fnc of class , also known as class method taking no parameters
        
        print("hello!") # prints hello

        
# Calling With Classname:

Main.hello() # This will call the class and from class it calls the hello() method passing no parameters

# OUTPUT:- hello!


# Calling With Objectname

obj = Main() # Here the variable 'obj' becomes an object by calling the class 'Main'.

# obj.hello() 

# This will call the class through object and from class it calls the hello() method passing no parameters. 

# but this will show error that it requires no parameters but one parameter is passed.

# Now, the Question arise, what parameter is being passed?

# The answer is the object 'obj' is passed in the fnc 'hello()' of 0 parameters, because whenever method is called through object, it takes object as its parameter.

# here self is used to store the object parameter inside any method.


class Main2: # this is a simple class
    
    def hello(self): # this is a fnc of class , also known as class method taking 1 parameter
        
        print("hello !") # prints hello
        
obj = Main2() # Here the variable 'obj' becomes an object by calling the class 'Main2'.

obj.hello() # This will call the class through object and from class it calls the hello() method passing 1 parameter 'that is obj'.

# OUTPUT:- hello !


class Factory: # this is a simple class
    
    def __init__(self , bodytype , tyretype , enginetype): # It is the constructor fnc of the class which automatically runs when class called taking 3 parameters.
        
        self.BT = bodytype # Here, the variable 'bodytype' is stored in the parameter 'BT' , used self because self refers to the parent obj
        
        self.TT = tyretype # Here, the variable 'tyretype' is stored in the parameter 'TT' used self because self refers to the parent obj

        self.ET = enginetype # Here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj
        
    def PrintDetails(self): # this is a fnc of class , also known as class method taking 1 parameter is the obj.
        
        print(f"The Details are :\n Body Type: {self.BT} ,Tyre Type: {self.TT} ,Engine Type: {self.ET}") # prints the 3 parameters
        
ferrari = Factory("Covered" , 4 , "8 cycle") # here the self parameter takes ferrari as its argument. and calling the constructor fnc with 3 parameters.

ferrari.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Covered
# Tyre Type: 4
# Engine Type: 8 cycle


alto = Factory("Covered" , 4 , "4 cycle") # here the self parameter takes Alto as its argument. and calling the constructor fnc with 3 parameters.

alto.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Covered
# Tyre Type: 4
# Engine Type: 4 cycle


Splendor = Factory("Open" , 2 , "8 cycle") # here the self parameter takes Splendor as its argument. and calling the constructor fnc with 3 parameters.

Splendor.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Open
# Tyre Type: 2
# Engine Type: 8 cycle


# ----------------------------------------------------------
 # Inheritance In classes and objects.
# ----------------------------------------------------------
 
 
 # Imagine there is a brand factory of cars and they give the blueprint to Factory to make vechiles, but they do not make any cars but they sent a blueprint to factory which has additional attributes and methods.
 
class Brand(Factory): # When class has () brackets and another classname is written inside it then the main class or sub class inherits the property of bracket class or parent class.
     
     # here Brand is known as sub class and Factory is called as parent class.
     
    pass

honda_civic = Brand("Covered" , 4 , "4 cycle") # here you can see that the  Brand() class method requires 3 parameters but we didn't created any constructor in Brand class then the Question arises from where did the constructor fnc came?

# & the answer is the Super class 'Factory' which has a constructor and the sub class inherits the Super class and its method and hence calling the Constructor of Brand calls the Constructor of Super class 'Factory'


# Imagine if the sub class also has a Own constructor.

class Honda(Factory): # Here is the class 'Honda' which inherits the class 'Factory'
    
    def __init__(self): # the constructor fnc of class 'Honda' , it runs automatically when class is called.
        
        print("I am the constructor of Sub class") # Printing that it is the constructot of Sub class.
        
Honda() # OUTPUT:- I am the constructor of Sub class

# We can see that it calls the constructor of its own rather than the constructor of parent class.

# if you want to call the constructor of parent class from the constructor of Sub class then u can use Super() fnc.

class RR(Factory): # A class 'RR' inheriting the class 'Factory'
    
    
    def __init__(self, bodytype, tyretype, enginetype , Edition): # The constructor of sub class 'RR', it runs automatically when class is called taking 4 parameter and a default parameter self which refers to the object.
        
        super().__init__(bodytype, tyretype, enginetype) # Calling the constructor of super class or inherited class 'Factory' using the method super() taking 3 arguments in it.
        
        print(self.PrintDetails() , "Edition: " , Edition) # Printing...
        
        
RR2015 = RR("open" , 4 , "6 cycle" , 2015) # Calls the constructor of class 'RR' with 4 parameters

# this constructor calls the constructor of its super class or 'Factory' with following parameters.


# ----------------------------------------------------------
 # Abstraction in objects and Classes
# ----------------------------------------------------------

 # In one sentence , there is no abstraction in python , because it is easily accessible and unsecure because during the creation of python language it is not prepared to face abstractions..
 
 # but through a module u can use do abstraction in Python...
 
from abc import ABC, abstractmethod
from contextlib import AbstractAsyncContextManager

class AbstractClass(ABC): # Here this class is the Abstracted class because it has ABC has it inherited class and This class becomes Abstracted.
    
    @ abstractmethod # this is a decorator which tells that this method is the Abstarcted method.
    
    def AbstractMethod(self): # a function 'AbstractMethod()' taking self as its parameter. which later refers to the obj.
        
        print("hello! Guys") # Printing hello guys.
        
class Normal(AbstractClass): # A class 'Normal' inherited the abstracted class 'AbstractClass'.
    
    pass # running the empty class.

# Normal()

# this will show that the error that you didn't run the AbstarctMethod() of inherited class in your own class , because if any class inherited the abstract class then it becomes compulsory to define the methods of abstracted class.

class Normal2(AbstractClass):# A class 'Normal2' inherited the abstracted class 'AbstractClass'.
    
    def AbstractMethod(self): # Defining the method of AbstractMethod in your own class.
        
        super().AbstractMethod() # Calling the method of super or inherited class using super() fnc.
        
Normal2() # it wont show any error and prints hello! guys


    
    
    

    



   






 
        

    

        

 
    




    





        