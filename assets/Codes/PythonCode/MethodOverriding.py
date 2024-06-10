# lets know how to chnage method of parent class to child class.

# Example i have to find the area of rectangle.

class Shape: # A class Shape
    
    def __init__(self , x , y): # constructor fnc taking 2 parameters 'x' and 'y' and a additional parameter 'self' which refers to the object of the class.
        
        self.x = x # assigning the value of x to self.x
        self.y = y # assigning the value of y to self.y
        
    def area(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        return self.x * self.y # returning the value of x * y
    
rec = Shape(10 , 20) # creating an object of the class Shape

print(rec.area()) # calling the method

# OUTPUT:- 200

class Circle(Shape):
    
    def __init__(self , r): # constructor fnc taking 1 parameter 'r' and a additional parameter 'self' which refers to the object of the class.
        
        super().__init__(r , r) # calling the init of parent class

        # we can use super() fnc to call the init of base class but the ares of circle is calculated diffrently and this can cause wrong output and problem in our program, so how does i change the area method of parent class by calling it from child class.
        
    def area(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.

        return 3.14 * super().area() # returning the value of 3.14 * super().area()
    
# as you saw we changed the area method by calling the area method of parent class and multiply it with 3.14. which makes method to return the area of circle.

cir = Circle(10) # creating an object of the class Circle

print(cir.area()) # calling the method

# OUTPUT:- 314.0 

# this is called method overriding.
    
        