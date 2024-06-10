# ----------------------------------------------------------
# BREAK AND CONTINUE STATEMENTS
# ----------------------------------------------------------


# Like in a for loop if the value of i iterating from 0 to 10 and when 7 will come then it will break the loop.

for i in range(0 , 11 , 1): # Here, the value of var 'i' is less than 11 and it gives the output as True and the for loop is executed.
    
    if i == 7: # Here, the value of var 'i' is equal to 7 and it gives the output as True and the if statement is executed.
        
        break # Here, the value of var 'i' is equal to 7 and it gives the output as True and the if statement is executed.
    
    print(i) # Output: 0 1 2 3 4 5 6 8 9 10
    

# Like in a while loop if the value of i iterating from 0 to 10 and i want to skip the even numbers then it will continue the loop.

i = 0 # Here, the value of var 'i' is 0 and it gives the output as True and the while loop is executed.

while i < 11: # Here, the value of var 'i' is less than 11 and it gives the output as True and the while loop is executed.
    
    if i % 2 == 0: # Here, the value of var 'i' is divided by 2 and gives remainder as 0 and it gives the output as True and the if statement is executed.
        
        i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the if statement is executed.
        
        continue # Here, the value of var 'i' is increased by 1 and it gives the output as True and the if statement is executed.
    
    print(i) # Output: 1 3 5 7 9 11

    i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.