number = int(input("Enter the number: ")) # Asking the user to enter a number and storing it in var 'number'.

# ----------------------------------------------------------
# Using For loop
# ----------------------------------------------------------

for i in range(1 , number , 1): # Here, the value of var 'i' is less than number+1 and it gives the output as True and the for loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.

        print(f"{i} is the factor of {number}") # prints that i is the factor of number

    
# ----------------------------------------------------------
# Using While Loop
# ----------------------------------------------------------

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < number + 1: # Here, the value of var 'i' is less than number+1 and it gives the output as True and the while loop is executed.

    if number % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.

        print(f"{i} is the factor of {number}") # prints that i is the factor of number

    i = i + 1 # increasing the value of var 'i' by 1 and storing it in var 'i'
    
    