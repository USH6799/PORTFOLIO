# did you know that we can use classmethods as a constructor?

# they can be used as alternate constructors of any class.

class Person: # A class Person
    
    def __init__(self , name , age): # a constructor fnc taking 2 parameters 'name' and 'age' which refers to the object of the class and additional parameter 'self' which refers to the object of the class.
        
        self.name = name # assigning the value of 'name' to self.name
        
        self.age = age # assigning the value of 'age' to self.age
        
    @classmethod # here i used the classmethod decorator to convert the value of self from object to class, now the self refers to the class and not the object.
    def fromStr(cls , String): # a classmethod fnc taking 1 parameter 'String' which refers to the object of the class.
         
         return cls(String.split(",")[0] , String.split(",")[1]) # Splitting the String and returning the object of the class, splits to a list of 2 elements and calling the constructor fnc with 2 arguments 'name' and 'age' and calling the class.
     
    
# 1st Way to Pass Arguments
p1 = Person("Abhay" , 25) # object of class Person calling the constructor fnc giving 2 arguments 'name' and 'age' and p1 as object for self.

print(p1.name , p1.age) # OUTPUT:- Abhay 25


# 2nd Way to Pass Arguments

str = "Ananya,27"

p2 = Person.fromStr(str) # object of class Person calling the classmethod fnc giving 1 argument 'String' and p2 as object for self.

print(p2.name , p2.age) # OUTPUT:- Ananya 27


# 3rd Way to Pass Arguments

str = "USH, 23"

p3 = Person(str.split(",")[0] , str.split(",")[1]) # object of class Person calling the classmethod fnc giving 1 argument 'String' and p3 as object for self.

print(p3.name , p3.age) # OUTPUT:- USH 23


# in this 1st and 2nd way is fine for working with data, 1st way only works with same form of data and shows error if any other data is passed.

# in 2nd way we can use the classmethod decorator to convert the value of self from object to class, now the self refers to the class and not the object, it helps to pass different form of data.

# 3rd way causes your program messy and hard to maintain.


# here in 2nd way we use classmethods as alternate constructors.
