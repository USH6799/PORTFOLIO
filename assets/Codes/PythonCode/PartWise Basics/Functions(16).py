# ----------------------------------------------------------
    # FUNCTIONS
# ----------------------------------------------------------
        
# Function is a reusable block of code which performs a specific task. Like, I have to print the table of 5, then we can use the function.

# function syntax:- def function_name():

# function have two main things:- 1. Paramters and 2.Arguments.

# like Checking even and odd numbers.


# 1st Number
# ----------------------------------------------------------
a = 12 # Here, the value of var 'a' is 12 and it gives the output as True and the if statement is executed.

if a % 2 == 0: # Here, the value of var 'a' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------


# 2nd number
# ----------------------------------------------------------
b = 13 # Here, the value of var 'b' is 13 and it gives the output as True and the if statement is executed.

if b % 2 == 0: # Here, the value of var 'b' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------
    

# 3rd Number
# ----------------------------------------------------------
c = 14 # Here, the value of var 'c' is 14 and it gives the output as True and the if statement is executed.

if c % 2 == 0: # Here, the value of var 'c' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed. 

    print("Even") # Output: Even

else: # if num is odd then else block will run.
    
    print("Odd") # prints that num is an Odd number.
# ----------------------------------------------------------


# Above , we are writing seperate if else for each number. Which makes the Program bigger and Complex. Instead we can use function.

# FUNCTION EX:
# ----------------------------------------------------------

def checkEvenOdd(num): # Here, the name of the function is 'checkEvenOdd' and the parameter is 'num' and it gives the output as True and the if statement is executed.

    if num % 2 == 0: # Here, the value of var 'num' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed.

        print("Even") # Output: Even

    else: # if num is odd then else block will run.

        print("Odd") # prints that num is an Odd number.

# ----------------------------------------------------------

# Now we have created a fnc checkEvenOdd and we can use it in our program.

checkEvenOdd(12) # Here, the value of var 'num' is 12 which is passed as arguments later stored as parameter inside the fnc, calling the fnc.

checkEvenOdd(13) # calling the fnc, with the argument 13 which is later stored as parameter inside the fnc

checkEvenOdd(14) # calling the fnc, with the argument 14 which is later stored as parameter inside the fnc

# So the Complex Program and a block of codes becomes Shorter and Better.

# We can reuse fnc as many times as we want.

# Remember the Diffrence btw arguments and Parameters.


# ----------------------------------------------------------
 # Above checkEvenOdd(14) in this 14 is the argument passed , or the value passed when calling a fnc is called Arguments.
 
 # Later, Inside the fnc the argument is Stored in a variable or a parameter , which is written during fnc declaration is called Parameters. Like , def checkOddEven(num) . In this case, num is a parameter.

# ----------------------------------------------------------

