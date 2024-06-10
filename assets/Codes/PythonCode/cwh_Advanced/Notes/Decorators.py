# Decorators in python are the powerful and versatile tool that allows us to modify the behaviour of any fncs and methods, it is used to extend the functionaly of any method without editing its source code.

# Lets understand with a example like i have 3 fncs, Hello() , sum() , square()

def Hello(): # a fnc to print Hello World
    
    print("Hello World") # printing Hello World
    

def sum(a , b): # a fnc to add two numbers
    
    print(a + b) # printing the sum of two numbers
    

def square(n): # a fnc to square a number
    
    print(n * n) # printing the square of a number



Hello() # calling the Hello() fnc

sum(4 , 5) # calling the sum() fnc

square(4) # calling the square() fnc

# OUTPUT:- Hello World
#          9
#          16

# as you saw output is little messy and i didn't know when the fnc begins or starts


# I think i want to add a greeting msg using print() fnc whenever i call any fnc in my program but manually changing each fnc will not be a easy task and for 1000th of program, it will be complex.


# Lets use decorators for this work.

def greet(fnc): # a decorator taking a fnc as an argument
    
    def main_fnc(): # a fnc to print Good Morning
        
        print("Good Morning Fnc starts...") # printing Good Morning

        fnc() # calling the passed fnc

        print("Fnc ends here.") # printing Fnc ends here
    
    return main_fnc # returning the main_fnc fnc

@greet # Adding greet() fnc to helloWorld() as a decorator
def helloWorld(): # a fnc to print Hello World

    print("Hello World") # printing Hello World
    
helloWorld()

# now lets see the behind scene,
"""
    As i Call the helloWorld() fnc, it will call the greet() fnc because the greet() fnc is a decorator and it becomes compulsory to call the decorator fnc of the fnc on which decorator is applied.
    
    Inside the greet(fnc) -> greet(helloWorld())
    
        it calls the main_fnc() fnc, inside that,
        
        1. It will first print good moring, then call the helloWorld() fnc,
        2. then the helloWorld() fnc prints hello world,
        3. At last it prints the ending line.
        
    So the main_fnc ends and we are in greet() fnc returning thr main_fnc
    
    # Now the greet() fnc returns the three print() statements which later get printed on screen.
    
"""

# You can call it through the fnc also like,

greet(helloWorld)() # Passing fnc as argument and calling it also.



def greetings(fnc): # the decorator fnc takes a fnc as an argument
    def main_fnc(*args , **dicargs): # here *args and **args are the arguments of the fnc where *args means any number of arguments in form of tuple and **args means any number of arguments in form of dictionary
        
        print("Good Morning Fnc starts...")

        fnc(*args , **dicargs) # calling the passed fnc
        
        print("Fnc ends here.")
    
    return main_fnc



# lets define a fnc add() with 2 parameters,

@greetings # applied decorator

def add(a , b): # a simple fnc to add two numbers taking 2 parameters

    print(a + b) # printing the sum
    
# greet(add)(1 , 2) 

# this showing error to console and not taking the arguments.


# now you can call it using

greetings(add)(1 , 2) # OUTPUT:- Good Morning Fnc starts... 
#                                3 
#                                Fnc ends here.


add(1 , 3) # OUTPUT:- Good Morning Fnc starts...
#                       4
#                       Fnc ends here

# same but the upper one is more useful in industries and at large scale.
    
    


