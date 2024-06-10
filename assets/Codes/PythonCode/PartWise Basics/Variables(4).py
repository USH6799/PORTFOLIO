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
