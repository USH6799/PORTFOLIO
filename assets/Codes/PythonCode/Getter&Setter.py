# in this we are going to understand the getter and setter fncs in python.

# like i have a class,

class Myclass:
    def __init__(self , value): # A constructor fnc taking 2 parameters 'self' and 'value'
        
        self._value = value # assigning the value of 'value' to self.value
        
    def show(self):
        print(f"The value of self.value: {self._value}")
    
    @property
    def GetValue(self): # a getter fnc taking 1 parameter 'self'
        
        return self._value # return the value of self.value
    
# lets create a obj,


# Let us understand how to create a setter fnc.

# we use @getterfnc.setter decorator to create a setter fnc.
    @GetValue.setter
    def SetValue(self , value): # a setter fnc taking 2 parameters 'self' and 'value'
        
        self._value = value # assigning the value of 'value' to self.value
        
        return self._value # return the value of self.value


obj = Myclass(10)

# print(obj.value) 
# this will show the error because the var 'value' in private.

# and cannot be accessed from here.

obj.show() # this will call the fnc and pass obj as self and can access private var 'value' 

# OUTPUT:- The value of self.value: 10

# but what if i want to access that value outside the class, then we need to create setter and getter fnc.

# Now we created a getter fnc GetValue() using property decorator.

print(obj.GetValue) # this will print the returned value or the value of privatye var.

# OUTPUT:- 10


# lets use setter to change the value,

obj.SetValue = 15 # this will change the value of private var 'value' to 15.

obj.show() # this will print the new value of private var 'value'

# OUTPUT:- The value of self.value: 15


print(obj.GetValue) # lets et the value of private var using the property which is in reality a fnc but python encapsulates it and displays it as property.



    
    