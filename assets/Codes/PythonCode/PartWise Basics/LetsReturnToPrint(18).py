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