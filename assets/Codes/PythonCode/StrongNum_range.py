Range = int(input("Enter the range: ")) # Here the input from the user is stored in var 'range'.

for num in range(1, Range + 1): # Here, the value of var 'num' is less than range+1 and it gives the output as True and the for loop is executed.
    
    temp = num # Here, the value of var 'temp' is storing the value of var 'num'.

    total = 0 # Here, the value of var 'total' is storing 0.
    
    while temp > 0: # Here, the value of var 'temp' is greater than 0 and it gives the output as True and the while loop is executed.
        
        digit = temp % 10 # Here, the value of var 'digit' is storing the remainder of temp divided by 10.

        fact = 1 # Here, the value of var 'fact' is storing 1.
        
        for j in range(1, digit + 1): # Here, the value of var 'j' is less than digit+1 and it gives the output as True and the for loop is executed.
            
            fact = fact * j # Here, the value of var 'fact' is multiplied by j and it gives the output as True and the for loop is executed.
            
        total = total + fact # Here, the value of var 'total' is adding the value of var 'fact'.
            
        temp = temp // 10 # Here, the value of var 'temp' is storing the quotient of temp divided by 10.
        
    if num == total: # Checking if the value of var 'num' is equal to var 'total', if it is equal then if block will run.
        
        print("The Strong Numbers in range is: " ,i) # prints the value of var 'num'.