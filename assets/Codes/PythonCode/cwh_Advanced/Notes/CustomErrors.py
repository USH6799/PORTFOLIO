# If you want to throw your own custom error at any point in your code, you can use the 'raise' keyword. 
# Let's ask the user to enter a number between 1 and 9.

num = input("Enter the Number between 1 to 9: ") # Prompts the user to enter a number.

try:
    num = int(num) # Attempts to convert the input to an integer.
    
except:
    # If the conversion fails (e.g., if the input is not a number), print an error message and exit.
    print("Not an Integer")
    exit()
    
if 0 < num < 10: # Checks if the number is between 1 and 9 (inclusive).
    
    print("Number:", num) # Prints the valid number.
    
else:
    # If the number is not between 1 and 9, raise a custom ValueError with a message.
    raise ValueError("Not a valid value, number should be between 1 and 9")

# That's all


##################################################