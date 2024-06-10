num = int(input("Enter a number: ")) # Here the input from the user is stored in var 'num'.

temp = num # Here, the value of var 'temp' is storing the value of var 'num'.

total = 0 # Here, the value of var 'total' is storing 0.

while temp > 0: # Here, the value of var 'temp' is greater than 0 and it gives the output as True and the while loop is executed.
    
    digit = temp % 10 # Here, the value of var 'digit' is storing the remainder of temp divided by 10.

    fact = 1 # Here, the value of var 'fact' is storing 1.
    
    for i in range(1, digit + 1): # Here, the value of var 'i' is less than digit+1 and it gives the output as True and the for loop is executed.
        
        fact = fact * i # Here, the value of var 'fact' is multiplied by i and it gives the output as True and the for loop is executed.
        
    total = total + fact # Here, the value of var 'total' is adding the value of var 'fact'.
    
    temp = temp // 10 # Here, the value of var 'temp' is storing the quotient of temp divided by 10.
    
if num == total: # Checking if the value of var 'num' is equal to var 'total', if it is equal then if block will run.
    
    print(f"{num} is a Strong number.") # prints that num is a Strong number.
    
else: # if the above condition is not true then else block will run,
    
    print(f"{num} is not a Strong number.") # prints that num is not a Strong number.
    