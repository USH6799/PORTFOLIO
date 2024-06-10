# A example like i have a class employee and i want to use this calss to create other classes like programmer , manager or enginner etc.

# then let's see how we inherit the properties of emloyee to other classes.

# Ex:-

class Employee: # base class Employee
    
    def __init__(self , name , id): # a constructor fnc taking 2 parameters 'name' and 'id' and a additional parameter 'self' which refers to the object of the class.
        
        self.name = name # assigning the value of 'name' to self.name

        self.id = id # assigning the value of 'id' to self.id
        
    def show(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        print(f"Name of the Employee is {self.name} \nID of the Employee is {self.id}") # printing the values of self.name and self.id
        

# lets create an object of class Employee.


# 1st Employee
emp1 = Employee("Ur DHDK" , 10) # object of class Employee calling the constructor fnc giving 2 arguments 'name' and 'id' and emp1 as object for self.

emp1.show() # calling the method fnc

# OUTPUT:- Name of the Employee is Ur DHDK
#          ID of the Employee is 10


# 2nd Employee
emp2 = Employee("Abhay Vaishya" , 25) # object of class Employee calling the constructor fnc giving 2 arguments 'name' and 'id' and emp1 as object for self.

emp1.show() # calling the method fnc

# OUTPUT:- Name of the Employee is Abhay Vaishya
#          ID of the Employee is 25


# Oh no! I want to specify their position also like enginner , manager of programmer,

# There are 2 ways either i make changes in the base class Employee or i create new class inheriting Employee class.

# if there are tons of line of code then it will be difficult to maintain and use the 1st way.


# lets create a new class Programmer inheriting Employee class.

class Programmer(Employee): # class Programmer inheriting Employee class
    def __init__(self , language): # a constructor fnc taking 1 parameter 'language' which refers to the object of the class and additional parameter 'self' which refers to the object of the class.
        
        self.language = language # assigning the value of 'language' to self.language
        
    def ShowLanguage(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        print(f"The language of the Programmer is {self.language}") # printing the value of self.language
        
        
# Now can i access these fncs of Programmer class using employee obj, it's a No.

# But i can access the fncs of Employee class using programmer obj.

# Lets Try:

prg1 = Programmer("Python") # object of class Programmer calling the constructor fnc giving 1 argument 'language' and prg1 as object for self.

# prg1.show() 
# # calling the show() fnc of Employee class using programmer obj.

# prg1.ShowLanguage() 
# calling the ShowLanguage() fnc of Programmer class using programmer obj.

# Here u can see that how does we can access the fncs and attributes of employee class using programmer obj because programmer class inherited all the Properties of employee class.

# but there is a problem the output will show a error beacause programmer class has its own constructor and through constructor obj how can we call the Employee class Constructor and change values?

# Answer is by calling the constructor of employee class from the constructor of programmer class.


# Lets create a Manager class,

class Manager(Employee): # class Manager inheriting Employee class
    
    def __init__(self , name , id , rank): # a constructor fnc taking 3 parameters 'name' , 'id' and 'rank' which refers to the object of the class and additional parameter 'self' which refers to the object of the class.
        
        Employee(name , id) # calling the constructor fnc of employee class giving 2 arguments 'name' and 'id' and emp1 as object for self.
        
        self.rank = rank # assigning the value of 'rank' to self.rank
        
    
    def ShowRank(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        print(f"The Rank of the Manager is {self.rank}") 
        

# Now in the constructor of manager class we have to pass 3 arguments 'name' , 'id' and 'rank' and mng1 as object for self.


# 1st Manager
mng1 = Manager("Abhay Vaishya" , 25 , "Senior Manager") # object of class Manager calling the constructor fnc giving 3 arguments 'name' , 'id' and 'rank' and mng1 as object for self.

mng1.show() # calling the show() fnc of Employee class using manager obj.

mng1.ShowRank() # calling the ShowRank() fnc of Manager class using manager obj.

# OUTPUT:- Name of the Employee is Abhay Vaishya
#          ID of the Employee is 25
#          The Rank of the Manager is Senior Manager


# 2nd Manager
mng2 = Manager("Annaya Gupta" , 30 , "Junior Manager") # object of class Manager calling the constructor fnc giving 3 arguments 'name' , 'id' and 'rank' and mng1 as object for self.

mng1.show() # calling the show() fnc of Employee class using manager obj.

mng1.ShowRank() # calling the ShowRank() fnc of Manager class using manager obj.    

# OUTPUT:- Name of the Employee is Annaya Gupta
#          ID of the Employee is 30
#          The Rank of the Manager is Junior Manager

