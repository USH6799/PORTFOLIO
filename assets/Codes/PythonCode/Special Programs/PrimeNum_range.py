Range = int(input("Enter the range: ")) # Here the input from the user is stored in var 'Range'.

for num in range(1 , Range + 1): # Here, the value of var 'num' is less than Range+1 and it gives the output as True and the for loop is executed.
    
    for i in range(2 , num): # Here, the value of var 'i' is less than num and it gives the output as True and the for loop is executed.
        
        if num % i == 0: # checking whether the number is divisible by i, if it is divisible then if block will run.
            
            break # breaks the loop
            
    else: # if the above condition is not true then else block will run,
        
        print("The Prime Numbers in Range is: " , num) # prints the value of var 'num'.