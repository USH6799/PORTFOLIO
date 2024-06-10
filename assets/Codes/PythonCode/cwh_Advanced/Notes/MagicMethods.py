# magic methods are given by the object itself, and we can apply them on our objects , like __init__ fnc is automatically called when an object is created aso no need on custom calling, but we can call it manually also.

# We use len() function to know the length of the object , which is a magic method.

# lets understand with example,

class Employee: # a class
    
    name = "USH" # a class variable
     
    def __len__(self): # a magic method
        
        i = 0 # a local variable initially set to 0
        
        for c in self.name: # a loop iterating on each character of the string

            i += 1 # increasing the value of i by 1
            
        return i # returning the value of i
    
    # the above is a raw explanation of len() method that we use on string sin python and on other datatypes.
    
    # We can say that python does not have any len() method but it has __len__ magic method and python does encapsulation of the len() method.
    
e = Employee() # object of class Employee

print(e.name) # OUTPUT:- USH

# But lets try the len() method to find length of string.

print(len(e.name)) # OUTPUT:- 3

# len() method is known as magic method because it is diffrently named during defination and during calling. From __len__() to len()


# __str__ and __repr__

# this above methods are used to convert the object into strings.

class Person: # a class
    
    name = "Abhay" # a class variable
    
    def __str__(self): # a magic method
        
        return f"My Name is {self.name} str"
    
    def __repr__(self): # a magic method
        
        return f"My Name is {self.name} repr"
    
p = Person() # object of class Person

print(p) # OUTPUT:- <__main__.Person object at 0x00000157AEA824E0>

# if you want to get the above value you have to the above two methods.

# if you dont define the above two methods then the output will be that the address of the object in memory but what if i want the value of the object.

# then i can def __str__ or __repr__ methods.

print(p) # After defining the above two methods, the output will be that the value of the object in memory.

# OUTPUT:- My Name is Abhay str


# Both the __str__ and __repr__ works the same but if both are defined in the class, on printing the object will always call the __str__ method because str in more dominant than repr.

# if you want the output from __repr__ you can either remove the str method or call it manually.

print(repr(p)) # remember that repr is a magic method. 

# OUTPUT:- My Name is Abhay repr