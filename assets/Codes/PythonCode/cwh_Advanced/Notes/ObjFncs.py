# dir() method helps us to know about all the methods and attributes about any data.

# like a list,

l = [1,4,2,2,4,56,3]

print(dir(l)) # Access all the methods and attributes of the list

# OUTPUT:- ['__add__', '__class__', '__class_getitem__', '__contains__', '__delattr__', '__delitem__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__getstate__', '__gt__', '__hash__', '__iadd__', '__imul__', '__init__', '__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__mul__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__reversed__', '__rmul__', '__setattr__', '__setitem__', '__sizeof__', '__str__', '__subclasshook__', 'append', 'clear', 'copy', 'count', 'extend', 'index', 'insert', 'pop', 'remove', 'reverse', 'sort']

# this is the list of all the fncs and attributes of the list datatype.


# Alternative way for dir() method,

print(l.__dir__())

# Lets apply one thing from the list like __add__,

print(l.__add__) # OUTPUT:- <method-wrapper '__add__' of list object at 0x000001E7CCA4D180>

# this prints that it is a method wrapper.


# lets try to see the methods of tuples:

tpl = (1,4,21,3)

print(dir(tpl))

# OUTPUT:- ['__add__', '__class__', '__class_getitem__', '__contains__', '__delattr__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__getnewargs__', '__getstate__', '__gt__', '__hash__', '__init__', '__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__mul__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__rmul__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', 'count', 'index']



# Lets know about __dict__ , it is the method used for converting any data into dictionary datatype.

class Person: # creating a class

    def __init__(self , name , age): # a constructor fnc taking 2 parameters 'name' and 'age' which refers to the object of the class and additional parameter 'self' which refers to the object of the class.
        
        self.name = name # assigning the value of 'name' to self.name
        
        self.age = age # assigning the value of 'age' to self.age

p1 = Person("John" , 36) # object of class Person calling the constructor fnc giving 2 arguments 'name' and 'age' and p1 as object for self.

print(p1.__dict__) # OUTPUT:- {'name': 'John', 'age': 36}


# lets know about help() method

# it just give a desciption about any class like here,

print(help(Person))

# OUTPUT:-
#   Help on class Person in module __main__:

#   class Person(builtins.object)
#    |  Person(name, age)
#    |
#    |  Methods defined here:
#    |
#    |  __init__(self, name, age)
#    |      Initialize self.  See help(type(self)) for accurate signature.
#    |
#    |  ----------------------------------------------------------------------
#    |  Data descriptors defined here:
#    |
#    |  __dict__
#    |      dictionary for instance variables
#    |
#   -- More  --

