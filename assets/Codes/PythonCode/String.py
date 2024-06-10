str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

# let input be: "Hello World"

# -----------------------------------------------------
#  STRING REVERSING
# -----------------------------------------------------


# -----------------------------------------------------
# Using For loop

reverb_str = "" # Here, a variable is created to store the reversed string.

# a var 'reverb_str' is created to store the reversed string.

for letter in str: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    reverb_str = letter + reverb_str # Here, the value of var 'reverb_str' is adding the value of var 'letter'.
    
print(reverb_str) # prints the value of var 'reverb_str'

# OUTPUT:- "dlroW olleH"

# -----------------------------------------------------
 # Using Slice fnc:


print(str[ : : -1]) # prints the string in reverse order.

# Here, step point is -1 so it will print the string in reverse order.

# OUTPUT:- dlroW olleH 


# -----------------------------------------------------
 # Using index:
 
reverb_str = "" # Here, a variable is created to store the reversed string.
 
for letter in range(len(str) - 1 , -1 , -1): # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    reverb_str = reverb_str + str[letter] # Here, the value of var 'reverb_str' is adding the value of var 'letter'.
    
print(reverb_str) # prints the value of var 'reverb_str'

# OUTPUT:- "dlroW olleH"
    


# -----------------------------------------------------
 # STRING LENGTH
# -----------------------------------------------------

print("The Length of the String \"" , str , "\" is: " , len(str)) # prints the length of the string

# OUTPUT:- The Length of the String  "Hello World"  is:  11


# -----------------------------------------------------
 # CONVERSION TO UPPERCASE
# -----------------------------------------------------

print(str.upper()) # prints the string in uppercase

# OUTPUT:- HELLO WORLD


# -----------------------------------------------------
 # CONVERSION TO LOWERCASE
# -----------------------------------------------------

print(str.lower()) # prints the string in Lowercase

# OUTPUT:- hello world


# -----------------------------------------------------
 # STRING DUPLICATION
# -----------------------------------------------------

Duplicate_str = str

print(f"The Value Stored in var 'Duplicate_str' is: {Duplicate_str}")

# OUTPUT:- The Value Stored in var 'Duplicate_str' is: Hello World
