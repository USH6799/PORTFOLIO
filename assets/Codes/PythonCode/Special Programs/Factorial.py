number = int(input("Enter the number: ")) # Asking the user to enter a number and storing it in var 'number'.

fact = 1 # Here, the value of var 'fact' is storing 1.

# ----------------------------------------------------------
# Using For loop
# ----------------------------------------------------------

for i in range(1, number + 1): # Here, the value of var 'i' is less than number+1 and it gives the output as True and the for loop is executed.

    fact = fact * i # Here, the value of var 'fact' is multiplied by i and it gives the output as True and the for loop is executed.
    
print("Factorial of " , number , " = " , fact)    


# ----------------------------------------------------------
# Using While loop
print() # adds new line.
# ----------------------------------------------------------

fact = 1 # Here, the value of var 'fact' is storing 1.

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < number + 1: # Here, the value of var 'i' is less than number+1 and it gives the output as True and the while loop is executed.
    
    fact = fact * i # Here, the value of var 'fact' is multiplied by i and it gives the output as True and the while loop is executed.
    
    i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.
    
print("Factorial of " , number , " = " , fact)
    