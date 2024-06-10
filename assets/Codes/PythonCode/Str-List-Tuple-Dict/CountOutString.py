str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

char = 0 # Here, a variable is created to store the number of characters in the string.

Integer = 0 # Here, a variable is created to store the number of integers in the string.

Symbol = 0 # Here, a variable is created to store the number of symbols in the string.

for letter in str: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    if (letter.isalpha()): # Checking whether the letter is alphabets or not, if it is alphabets then if block will run.
        
        char = char + 1 # Here, the value of var 'char' is adding 1.
        
    elif (letter.isnumeric()): # Checking whether the letter is numbers or not, if it is numbers then elif block will run.
        
        Integer = Integer + 1 # Here, the value of var 'Integer' is adding 1.
        
    else:
        Symbol = Symbol + 1 # Here, the value of var 'Symbol' is adding 1.
        
print(f"In the String \"{str}\" there are {char} Alphabets, {Integer} Integers and {Symbol} Symbols.")