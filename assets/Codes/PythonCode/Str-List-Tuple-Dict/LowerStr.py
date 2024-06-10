str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

# Let Input be:- "HeLLoWoRLD123@!"

LowerStr = "" # Here, a variable is created to store the New string in which it contains only lowercase letters.

UpperStr = "" # Here, a variable is created to store the New string in which it only contains uppercase letters.

UnknownStr = "" # Here, a variable is created to store non-alphabetical parts of String like special characters and Numbers.

for letter in str: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    if (letter.islower()): # Checking whether the letter is lowercase or not, if it is lowercase then if block will run.

        LowerStr = LowerStr + letter # Here, the value of var 'LowerStr' is adding the value of var 'letter'.
        
    elif (letter.isupper()): # Checking whether the letter is uppercase or not, if the letter is uppercase then elif block will run.
        
        UpperStr = UpperStr + letter # Here, the value of var 'UpperStr' is adding the value of var 'letter'.
        
    else:
        UnknownStr = UnknownStr + letter

print(LowerStr + UpperStr + UnknownStr) # prints the value of var 'LowerStr' which contains only lowercase letters and value of var 'UpperStr' which contains only uppercase letters and value of var 'UnknownStr' which contains non-alphabetical parts of String like special characters and Numbers.

# Output:- eooHLLWRLD123@!

