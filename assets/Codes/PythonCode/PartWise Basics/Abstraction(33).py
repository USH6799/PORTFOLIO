# ----------------------------------------------------------
 # Abstraction in objects and Classes
# ----------------------------------------------------------

 # In one sentence , there is no abstraction in python , because it is easily accessible and unsecure because during the creation of python language it is not prepared to face abstractions..
 
 # but through a module u can do abstraction in Python...
 
from abc import ABC, abstractmethod
from contextlib import AbstractAsyncContextManager

class AbstractClass(ABC): # Here this class is the Abstracted class because it has ABC has it inherited class and This class becomes Abstracted.
    
    @ abstractmethod # this is a decorator which tells that this method is the Abstarcted method.
    
    def AbstractMethod(self): # a function 'AbstractMethod()' taking self as its parameter. which later refers to the obj.
        
        print("hello! Guys") # Printing hello guys.
        
class Normal(AbstractClass): # A class 'Normal' inherited the abstracted class 'AbstractClass'.
    
    pass # running the empty class.

# Normal()

# this will show that the error that you didn't run the AbstarctMethod() of inherited class in your own class , because if any class inherited the abstract class then it becomes compulsory to define the methods of abstracted class.

class Normal2(AbstractClass):# A class 'Normal2' inherited the abstracted class 'AbstractClass'.
    
    def AbstractMethod(self): # Defining the method of AbstractMethod in your own class.
        
        super().AbstractMethod() # Calling the method of super or inherited class using super() fnc.
        
obj1 = Normal2() # Creating a object 'obj1' of class Normal2.

obj1.AbstractMethod() # Calling the abstract method of class Normal2 using object 'obj1'.

# which later calls the abstract method of super class.

# OUTPUT:- hello! Guys