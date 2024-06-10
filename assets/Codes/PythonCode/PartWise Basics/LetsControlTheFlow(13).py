# ----------------------------------------------------------
# CONTROL FLOW STATEMENTS
# ----------------------------------------------------------


# ----------------------------------------------------------
# 1. Simple if statement.

a = 10 # Here the value of var 'a' is 10 of integer datatype.

b = 20 # Here the value of var 'b' is 20 of integer datatype.

if a > b: # Here, the value of var 'a' is greater than 'b' and it gives the output as True and the if block is executed.
    
    print("a is greater than b") # Output: a is greater than b
# ----------------------------------------------------------


# ----------------------------------------------------------
# 2. if-else statement.

age = int(input("Enter your age: ")) # Here the input from the user is stored in var 'age'.

if age >= 18: # Here, the value of var 'age' is greater than 18 and it gives the output as True and the if block is executed.
    
    print("You are eligible to vote.") # Output: You are eligible to vote.

else: # Here, the value of var 'age' is less than 18 and it gives the output as False and the else block is executed.
    
    print("You are not eligible to vote.") # Output: You are not eligible to vote.
# ----------------------------------------------------------


# ----------------------------------------------------------
# 3. if-elif-else statement.

exp = int(input("In a Company how much experience do you have in years: ")) # Here the input from the user is stored in var 'exp'.

if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
    
    print("Your Salary will be $500") # Output: Your Salary will be $500

elif 10 > exp > 5: # Here, the value of var 'exp' is less than 10 and greater than 5 and it gives the output as True and the elif block is executed.
    
    print("Your Salary will be $1000") # Output: Your Salary will be $1000

else: # Here, the value of var 'exp' is less than 10 and it gives the output as False and the else block is executed.
    
    print("Your Salary will be $1500") # Output: Your Salary will be $1500
# ----------------------------------------------------------


# ----------------------------------------------------------    
# 4. Nested if else statement.

age = int(input("Enter your age: ")) # Here the input from the user is stored in var 'age'.

exp = int(input("In a Company how much experience do you have in years: ")) # Here the input from the user is stored in var 'exp'.

if age >= 18: # Here, the value of var 'age' is greater than 18 and it gives the output as True and the if block is executed.
        
    if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
        
        print("Your Salary will be $500") # Output: Your Salary will be $500

    else : # Here, the value of var 'exp' is less than 5 and it gives the output as False and the else block is executed.
        
        print("Your Salary will be $700") # Output: Your Salary will be $700

elif age >= 30: # Here, the value of var 'age' is less than 30 and it gives the output as True and the elif block is executed.
    
    if exp < 5: # Here, the value of var 'exp' is greater than 5 and it gives the output as True and the if block is executed.
        
        print("Your Salary will be $1000") # Output: Your Salary will be $1000

    else : # Here, the value of var 'exp' is less than 5 and it gives the output as False and the else block is executed.
        
        print("Your Salary will be $1500") # Output: Your Salary will be $1500
    
else: # Here, the value of var 'age' is less than 18 and it gives the output as False and the else block is executed.
    
    print("You are not eligible to work.") # Output: You are not eligible to work.
# ----------------------------------------------------------
