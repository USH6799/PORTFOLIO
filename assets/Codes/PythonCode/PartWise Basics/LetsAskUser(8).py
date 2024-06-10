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
