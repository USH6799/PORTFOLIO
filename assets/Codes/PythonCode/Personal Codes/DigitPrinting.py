num = int(input("Enter a number: ")) # Here the input from the user is stored in var 'num'.

# ----------------------------------------------------------
# Using While loop because for loop for this is little complex and we prefer while loop for this.
# ----------------------------------------------------------

while(num > 0): # Here the value of var 'num' is greater than 0 and it gives the output as True and the while loop is executed.

    digit = num % 10 # Here, the value of var 'digit' is storing the remainder of num divided by 10.
    
    print(digit) # prints the value of var 'digit'.
    
    num = num // 10 # Here, the value of var 'num' is storing the quotient of num divided by 10.
    
    