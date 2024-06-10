# The class methods are the decorators whicha re used to specify that in etxernal fnc, the value of self will be not the object but the class itself.

# lets take an example and understand,

class Employee: # A class Employee
    
    company = "Apple" # storing the name of the company in var 'company'
    
    def show(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        print(f"The name of the employee is {self.name} of company {self.company}")
        
    
    def ChangeCompany(self ,  newCompany): # a method fnc taking 2 parameters 'self' and 'newCompany' which refers to the object of the class.
        
        self.company = newCompany # assigning the value of 'newCompany' to self.company, but here the company was just an instance not the actual class variable, it is just a instance variable or temperory variable.
        
emp1 = Employee() # object of class Employee

emp1.name = "Uttkarsh" # assigning the value of 'Uttkarsh' to emp1.name

emp1.show() # calling the show() fnc of Employee class using emp1 obj.

emp1.ChangeCompany("Google") # calling the ChangeCompany() fnc of Employee class using emp1 obj.

emp1.show() # calling the show() fnc of Employee class using emp1 obj.

# OUTPUT:- The name of the employee is Uttkarsh of company Apple
#          The name of the employee is Uttkarsh of company Google
         
# as you see here the fnc changed the company variable but as i said before it is the instance variable not the class variable of the obj.

# Lets check the value of company class variable.

print(Employee.company) # OUTPUT:- Apple

# If we changed the value of company before in the code from apple to google then it should print google but its apple.

# this is because we accessed the variable from class which means accessing class variable.


print(emp1.company) # OUTPUT:- Google

# as you can see the value of company is google.

# this is because we accessed the variable from instance(object) which means accessing instance variable.


# Now lets know how to change the class variables through methods.

class Employee1: # A class Employee1
    
    company = "Apple" # storing the name of the company in var 'company'
    
    def show(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class.
        
        print(f"The name of the employee is {self.name} of company {self.company}")
        
    @classmethod # here i used the classmethod decorator to convert the value of self from object to class, now the self refers to the class and not the object.
    def ChangeCompany(self ,  newCompany): # a method fnc taking 2 parameters 'self' and 'newCompany' which refers to the object of the class.
        
        self.company = newCompany # assigning the value of 'newCompany' to self.company, but here the company was the class variable, because we used the classmethod decorator and we converted the self from object to class.
        
        
emp2 = Employee1() # object of class Employee1

emp2.name = "Uttkarsh" # assigning the value of 'Uttkarsh' to emp2.name

emp2.show() # calling the show() fnc of Employee1 class using emp2 obj.

emp2.ChangeCompany("Google") # calling the ChangeCompany() fnc of Employee1 class using emp2 obj.

emp2.show() # calling the show() fnc of Employee1 class using emp2 obj.

# OUTPUT:- The name of the employee is Uttkarsh of company Apple
#          The name of the employee is Uttkarsh of company Google


# Lets check the value of instance and class variable.

print(emp2.company) # OUTPUT:- Google
print(Employee1.company) # OUTPUT:- Google