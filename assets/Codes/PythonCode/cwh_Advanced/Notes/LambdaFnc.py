# lambda fnc are the small anonymous functions that can be created in a single line of code without a name.

# they are defined using lambda keyword 

# Syntax:- lambda arguments : expression

# like i want to double the inputed value and print it on the screen.

def double(n): # this is the simple function taking input n and returning n*2

    return n*2 # printing n*2
    
print(double(5)) # calling the function with parameter 5 , OUTPUT:- 10


# Now lets create the same with lambda fncs.

DoubleTheVal = lambda x: x*2 # this is the lambda fnc taking input x and returning x*2

# here firstly the name of the fnc like variable. then the = operator then lambda keyword, then parameter , then the returning value.

# Lets call it:

print(DoubleTheVal(4)) # calling the lambda fnc with parameter 4 , OUTPUT:- 8

# Now lets create a cube fnc using lambda fnc.

cube = lambda x: x*x*x # this is the lambda fnc taking input x and returning x*x*x

print(cube(5)) # calling the lambda fnc with parameter 5 , OUTPUT:- 125


# how to give more than one arguments in lambda fncs.

average = lambda a , b , c: (a + b + c) / 3  # this is the lambda fnc taking input a , b , c and returning (a + b + c) / 3

print(average(2,3,4)) # calling the lambda fnc with parameters 2 , 3 , 4 , OUTPUT:- 3.0

# lets create a fnc of multiply two numbers:

def Multiply(a , b): # this is the simple function taking input a , b and returning a * b
    
    print(a * b) # printing a * b
    
    
# Using lambda fnc:

multiply = lambda a , b: print(a * b) # this is the lambda fnc taking input a , b and returning a * b

Multiply(4,5) # calling the function with parameters 4 , 5 , OUTPUT:- 20

multiply(2,3) # calling the lambda fnc with parameters 2 , 3 , OUTPUT:- 6
    
    