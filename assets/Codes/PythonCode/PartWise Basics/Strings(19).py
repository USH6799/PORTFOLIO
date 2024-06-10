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
    
