number = int(input("Enter the number: "))

# ----------------------------------------------------------
# Using For loop
# ----------------------------------------------------------

for i in range(2 , number): # Here, the value of var 'i' is less than number and it gives the output as True and the for loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.
        
        print(f"{number} is not a prime number") # prints that number is not a prime number
        break # breaks the loop

else: # if the above condition is not true then else block will run,

    print(f"{number} is a prime number") # prints that number is a prime number
    
# ----------------------------------------------------------
# Using While Loop
print() # Adds the new line.
# ----------------------------------------------------------

i = 2 # Here, the value of var 'i' is 2 and it gives the output as True and the while loop is executed.

while i < number: # Here, the value of var 'i' is less than number and it gives the output as True and the while loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.
        
        print(f"{number} is not a prime number") # prints that number is not a prime number
        break # breaks the loop

    i = i + 1 # increasing the value of var 'i' by 1 and storing it in var 'i'

else: # if the above condition is not true then else block will run,

    print(f"{number} is a prime number") # prints that number is a prime number