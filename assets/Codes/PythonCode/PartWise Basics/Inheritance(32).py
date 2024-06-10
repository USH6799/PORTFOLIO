# ----------------------------------------------------------
 # Inheritance In classes and objects.
# ----------------------------------------------------------
 
 
 # Imagine there is a brand factory of cars and they give the blueprint to Factory to make vechiles, but they do not make any cars but they sent a blueprint to factory which has additional attributes and methods.

class Factory: # this is a simple class
    
    def __init__(self , bodytype , tyretype , enginetype): # It is the constructor fnc of the class which automatically runs when class called taking 3 parameters.
        
        self.BT = bodytype # Here, the variable 'bodytype' is stored in the parameter 'BT' , used self because self refers to the parent obj
        
        self.TT = tyretype # Here, the variable 'tyretype' is stored in the parameter 'TT' used self because self refers to the parent obj

        self.ET = enginetype # Here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj
        
    def PrintDetails(self): # this is a fnc of class , also known as class method taking 1 parameter is the obj.
        
        print(f"The Details are :\n Body Type: {self.BT} ,Tyre Type: {self.TT} ,Engine Type: {self.ET}") # prints the 3 parameters
        
ferrari = Factory("Covered" , 4 , "8 cycle") # here the self parameter takes ferrari as its argument. and calling the constructor fnc with 3 parameters.

ferrari.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Covered
# Tyre Type: 4
# Engine Type: 8 cycle

 
class Brand(Factory): # When class has () brackets and another classname is written inside it then the main class or sub class inherits the property of bracket class or parent class.
     
     # here Brand is known as sub class and Factory is called as parent class.
     
    pass

honda_civic = Brand("Covered" , 4 , "4 cycle") # here you can see that the  Brand() class method requires 3 parameters but we didn't created any constructor in Brand class then the Question arises from where did the constructor fnc came?

# & the answer is the Super class 'Factory' which has a constructor and the sub class inherits the Super class and its method and hence calling the Constructor of Brand calls the Constructor of Super class 'Factory'


# Imagine if the sub class also has a Own constructor.

class Honda(Factory): # Here is the class 'Honda' which inherits the class 'Factory'
    
    def __init__(self): # the constructor fnc of class 'Honda' , it runs automatically when class is called.
        
        print("I am the constructor of Sub class") # Printing that it is the constructot of Sub class.
        
Honda() # OUTPUT:- I am the constructor of Sub class

# We can see that it calls the constructor of its own rather than the constructor of parent class.

# if you want to call the constructor of parent class from the constructor of Sub class then u can use Super() fnc.

class RR(Factory): # A class 'RR' inheriting the class 'Factory'
    
    
    def __init__(self, bodytype, tyretype, enginetype , Edition): # The constructor of sub class 'RR', it runs automatically when class is called taking 4 parameter and a default parameter self which refers to the object.
        
        super().__init__(bodytype, tyretype, enginetype) # Calling the constructor of super class or inherited class 'Factory' using the method super() taking 3 arguments in it.
        
        print(self.PrintDetails() , "Edition: " , Edition) # Printing...
        
        
RR2015 = RR("open" , 4 , "6 cycle" , 2015) # Calls the constructor of class 'RR' with 4 parameters

# this constructor calls the constructor of its super class or 'Factory' with following parameters.
