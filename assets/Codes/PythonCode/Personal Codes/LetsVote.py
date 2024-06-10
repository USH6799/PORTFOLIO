name = input("Enter your name: ") # Here the input from the user is stored in var 'name'.

age = int(input("Enter your age: ")) # Here the input from the user is stored in var 'age'.

if age >= 18: # Here, the value of var 'age' is greater than 18 and it gives the output as True and the if block is executed.
    
    print(f"{name} is eligible to vote.") # Output: You are eligible to vote.

elif 0 < age < 18: # Here, the value of var 'age' is less than 18 and it gives the output as True and the elif block is executed.
    
    print(f"{name} is not eligible to vote.") # Output: You are not eligible to vote.

else: # Here, the value of var 'age' is less than 0 and it gives the output as False and the else block is executed.
    
    print(f"{name} is not born yet. Please Provide your correct age.") # Output: You are not born yet.