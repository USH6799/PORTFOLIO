number = int(input("Enter the number: ")) # Asking the user to enter a number and storing it in var 'number'.

# ----------------------------------------------------------
# Using For loop
# ----------------------------------------------------------


sum = 0; # Here the value of var 'sum' is 0.

for i in range(1 , number , 1): # Here, the value of var 'i' is less than number+1 and it gives the output as True and the for loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.
        
        sum = sum + i # Here, the value of var 'sum' is increased by i and it gives the output as True and the for loop is executed.

if number == sum: # Checking if the number is equal to sum, if it is equal then if block will run.
    
    print(f"{number} is a perfect number") # prints that number is a perfect number

else: # if the above condition is not true then else block will run,

    print(f"{number} is not a perfect number") # prints that number is not a perfect number
    
    
# ----------------------------------------------------------
# Using While Loop
print() # prints an empty line
# ----------------------------------------------------------

sum = 0 # Here the value of var 'sum' is 0.

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < number: # Here, the value of var 'i' is less than number+1 and it gives the output as True and the while loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.

        sum = sum + i # Here, the value of var 'sum' is increased by i and it gives the output as True and the while loop is executed.
        
    i = i + 1 # increasing the value of var 'i' by 1 and storing it in var 'i'
    
if number == sum: # Checking if the number is equal to sum, if it is equal then if block will run.
    
    print(f"{number} is a perfect number") # prints that number is a perfect number

else: # if the above condition is not true then else block will run,

    print(f"{number} is not a perfect number") # prints that number is not a perfect number
    
    