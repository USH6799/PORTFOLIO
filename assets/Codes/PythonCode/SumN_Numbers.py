n = int(input("Enter the value of n : ")) # Taking input from user and Storing it in var 'n'.

sum = 0 # Here the value of var 'sum' is 0.

# ----------------------------------------------------------
# Using For loop:
# ----------------------------------------------------------

for i in range(1, n + 1 , 1): # Here the value of var 'i' goes from 1 to n+1 and it gives the output as True and the for loop is executed.
    
    sum = sum + i; # Here, the value of var 'sum' is increased by i and it gives the output as True and the for loop is executed.

print("Sum of all numbers till n is : " , sum) # Output: 55

# ----------------------------------------------------------
# While loop
print() # add extra line.
# ----------------------------------------------------------

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < n: # Here, the value of var 'i' is less than n and it gives the output as True and the while loop is executed.
    
    sum = sum + i; # Here, the value of var 'sum' is increased by i and it gives the output as True and the while loop is executed.
    
    i = i + 1; # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.
    
print("Sum of all numbers till n is : " , sum) # Output: 55