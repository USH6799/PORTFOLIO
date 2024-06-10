# lets add two vectors and find the answer.

class Vector: # creating a class 'Vector'
    
    def __init__(self , x , y , z): # constructor fnc taking 3 parameters 'x' , 'y' and 'z' and a additional parameter 'self' which refers to the object of the class.
        
        self.x = x # assigning the value of x to self.x
        
        self.y = y # assigning the value of y to self.y
        
        self.z = z # assigning the value of z to self.z
        
    def __str__(self): # a magic method
        
        return f"({self.x}x , {self.y}y , {self.z}z)" # returning the values of x , y and z
    
    def __add__(self , a):
        return f"{self.x + a.x}x , {self.y + a.y}y , {self.z + a.z}z"
    
        # return Vector(self.x + a.x , self.y + a.y , self.z + a.z) 
    # you can comment out the 2nd return statement and add # before the first return statement to change the datatype from str to Vector.
        
    
v1 = Vector(2,4,6) # creating an object of the class 'Vector'

print(type(v1)) # Checking the type of 'v1'

# OUTPUT:- <class '__main__.Vector'>

# as here it is the Vector datatype.

print(v1) # OUTPUT:- (2x , 4y , 6z)


v2 = Vector(4,8,12) # creating an object of the class 'Vector'

print(type(v2)) # Checking the type of 'v2'

# OUTPUT:- <class '__main__.Vector'>

print(v2) # OUTPUT:- (4x , 8y , 12z)

# as you above both are of vector type , now i want to add them means the values with same variables will be added.

# like x to x and y to y and z to z.


# v3 = v1 + v2 
# # adding v1 and v2

# this will show error because v1 and v2 are of vector type and + is not defined for them, means python doesn't know how to add them.

# Here You need to specify it using __add__ magic method.

# Now lets try to add them,

print(v1 + v2) # OUTPUT:- 6x , 12y , 18z

# Its working but lets check the datatype,

print(type(v1 + v2)) # OUTPUT:- <class 'str'>

# here as you sum of two vectors is a string which we don't want, so we can do one thing that convert it into vector and get the output.

# After changing the return statement lets add them and check the datatype also,

print(v1 + v2) # OUTPUT:- 6x , 12y , 18z

print(type(v1 + v2)) # OUTPUT:- <class '__main__.Vector'>

# as you saw that output is same but datatype is changed.

# now if any class inherit this than it will overload its + operator which is also known as operator overloading.


