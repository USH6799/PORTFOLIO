number = int(input("Enter a number: ")) # Here the input from the user is stored in var 'number'.

# ----------------------------------------------------------
# Using For loop:
# ----------------------------------------------------------

for i in range(1,11): # Here the value of var 'i' goes from 1 to 11 and it gives the output as True and the for loop is executed.
    
    print(number , "X" , i , "=" , number * i)
    
# ----------------------------------------------------------
# Using While loop:
print() # for new line
# ----------------------------------------------------------

i = 1 # Here the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < 11: # Here the value of var 'i' is less than 11 and it gives the output as True and the while loop is executed.
    
    print(f"{number} X {i} = {number * i}")
    
    i = i + 1 # Here the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.