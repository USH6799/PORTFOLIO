num = int(input("Enter a number: ")) # Asking the user to enter a number and storing it in var 'num'.

if(num % 2 == 0): # Checking if 'num' is divisible by 2, which means it's even.
    
    print(f"{num} is an Even number.") # Prints that 'num' is an even number.
    
    # Dry Run Example:
    # If user enters 4:
    # num = 4
    # num % 2 == 0  -> 4 % 2 == 0 -> 0 == 0 (True)
    # Output: "4 is an Even number."

else: # If 'num' is not divisible by 2, it is odd.
    
    print(num , " is an Odd number.") # Prints that 'num' is an odd number.

    # Dry Run Example:
    # If user enters 7:
    # num = 7
    # num % 2 == 0  -> 7 % 2 == 0 -> 1 == 0 (False)
    # Output: "7 is an Odd number."
