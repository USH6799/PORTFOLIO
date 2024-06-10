num = int(input("Enter a number to check whether it is palindrome or not: ")) # Here the input from the user is stored in var 'num'.

# ----------------------------------------------------------
# Using While loop because for loop for this is little complex and we prefer while loop for this.
# ----------------------------------------------------------

temp = num # Here, the value of var 'temp' is storing the value of var 'num'.
rev = 0 # Here, the value of var 'rev' is storing the value 0.

while(temp > 0): # Here the value of var 'temp' is greater than 0 and it gives the output as True and the while loop is executed.
    
    digit = temp % 10 # Here, the value of var 'digit' is storing the remainder of temp divided by 10.
    
    rev = (rev * 10) + digit # Here, the value of var 'rev' is storing the quotient of temp divided by 10.
    
    temp = temp // 10 # Here, the value of var 'temp' is storing the quotient of temp divided by 10.
    
if num == rev: # Checking if the value of var 'num' is equal to var 'rev', if it is equal then if block will run.
    
    print(f"{num} is a Palindrome number.") # prints that num is a Palindrome number.
    
else: # if the above condition is not true then else block will run,
    
    print(f"{num} is not a Palindrome number.") # prints that num is not a Palindrome number.