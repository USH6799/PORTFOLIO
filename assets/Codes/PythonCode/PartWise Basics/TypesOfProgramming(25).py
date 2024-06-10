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
