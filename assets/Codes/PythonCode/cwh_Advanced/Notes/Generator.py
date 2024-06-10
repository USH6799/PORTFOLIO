# generators in python are special type of fncs that can be used to create iteratable sequences of values.

# We use yield keyword to create generators.

def my_Generator(): # here my_Generator is the name of the generator function.
    
    yield 1 # here yield keyword is used to return the value on the 1st call.
    yield 2 # here yield keyword is used to return the value on the 2nd call.
    yield 3 # here yield keyword is used to return the value on the 3rd call.
    yield 4 # here yield keyword is used to return the value on the 4th call.
    yield 5 # here yield keyword is used to return the value on the 5th call.
    
    
    yield 6 # here yield keyword is used to return the value on the 6th call.
    yield 7 # here yield keyword is used to return the value on the 7th call.
    yield 8 # here yield keyword is used to return the value on the 8th call.

# lets create a generator object:

my_Gen = my_Generator() # here my_Gen is the object of my_Generator() fnc.

print(next(my_Gen)) # here value is the variable and next() is the fnc that takes the generator object as the parameter and returns the first value of the generator object.

# OUTPUT:- 1

print(next(my_Gen)) # here value is the variable and next() is the fnc that takes the generator object as the parameter and returns the second value of the generator object.

# OUTPUT:- 2

print(next(my_Gen)) # here value is the variable and next() is the fnc that takes the generator object as the parameter and returns the third value of the generator object.

# OUTPUT:- 3

print(next(my_Gen)) # here value is the variable and next() is the fnc that takes the generator object as the parameter and returns the fourth value of the generator object.

# OUTPUT:- 4

print(next(my_Gen)) # here value is the variable and next() is the fnc that takes the generator object as the parameter and returns the fifth value of the generator object.

# OUTPUT:- 5

# I have requested for values till 5 so the rest yield values are not created and doesn't take space in memory which helps us to converse it.

# as You saw each time i have to call the next() fnc to get the next value of th object and we can understand that generator fnc has its own memory space as requires and doesn't take extra memory which is an advantage.

# When the next() fnc is called it prints the first yield value and then wait for the next request otherwise it doesn't print.


# We can also apply for in loop for printing each values,

for val in my_Gen: # A for loop running on the values of my_Gen object but as we already requested first 5 values, it will print the rest values.
    
    print(val , " Called By For Loop") # printing the rest yield values of the my_Gen object.
    
# OUTPUT:- 6 Called By For Loop
#          7 Called By For Loop
#          8 Called By For Loop


# If i create a new object of the constructor then it will also have its own yield values which are not yet requested.

obj1 = my_Generator() # here obj1 is the object of my_Generator() fnc.

for val in obj1: # A for loop running on the values of obj1 object but as we already requested first 5 values, it will print the rest values.
    
    print(val , " Of new Obj") # printing the yield values of the obj1 object.
    
# OUTPUT:- 1 Of new Obj
#          2 Of new Obj
#          3 Of new Obj
#          4 Of new Obj
#          5 Of new Obj

