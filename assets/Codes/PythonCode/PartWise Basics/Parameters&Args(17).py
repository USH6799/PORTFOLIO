# ----------------------------------------------------------
# there are two types of Parameters and Arguments.

# 1. Normal Parameters

def Sayhello(name): # Here, the name of the function is 'Sayhello' and the parameter is 'name' and it runs the block code inside it when called.
    
    # name , was a  normal parameter as it needs a argument to be passed.
    
    print("hello! " , name) # prints the input taken from user.


# 2. Default Parameters

def Defaulthello(name = "Uttkarsh"): # Here, the name of the function is 'Defaulthello' and the Default parameter is 'name' and it runs the block code inside it when called.
    
    # name , was a deafult parameter as it doesn't need argument to be passed and already initialized.
    
    
    print("hello! " , name) # prints the input taken from user. Uses , comma to prints two diffrent values under 1 print() fnc like printing String and variable together.
    

# Calling the Dafault parameter fnc without a argument.

Defaulthello() # calling the fnc, without any argument passed. Here, the default value is passed as "Uttkarsh" as it has a parameter to be stored in.

# Output: hello! Uttkarsh

# but What if i passed an argument in the default parameter fnc, then

Defaulthello("USH") # calling the fnc, with the argument "USH" which is later override or cahnge the value parameter 'name' inside the fnc.

# Output: hello! USH    


# like a fnc: 

def Show(a , b , c): # Here, the name of the function is 'Show' and the parameter is 'a , b , c' and it runs the block code inside it when called.
     
    print(a , b , c) # prints the input taken from user.
    
# 3. Default Arguments

# Passing the arguments in the same order as the parameters, Like i want to pass a as 10 , b as 12 and c as 14. Then i will pass in the same order as the parameters.

Show(10 , 12 , 14) # here, it is the Default Arguments, which takes same value as the parameter.

# (10 , 12 , 14) -> (a , b , c)

# Output: (10 , 12 , 14)

# 4. Keyword Arguments

Show(c = 10 , b = 12 , a = 14) # here, it is the Keyword Arguments, which takes same value as the parameter, they are not in same order but specified.

# Output: (14 , 12 , 10)

# (14 , 12 , 10) -> (a , b , c)
# ----------------------------------------------------------
