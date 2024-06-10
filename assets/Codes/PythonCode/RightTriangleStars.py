n = int(input("Enter the value of n : ")) # Here, the value of var 'n' is taken from user and stored in var 'n'.

for i in range(n + 1): # Here, the value of var 'i' goes from 1 to n+1 and it gives the output as True and the for loop is executed.
    
    # Here it directly takes the end point in range and starts from 1 , incrementing by 1.

    for j in range(i): # Here, the value of var 'j' goes from 1 to i and it gives the output as True and the for loop is executed.
        
        print('*' , end = " ") # Printing stars '*' on the Same line Each time.
        
    print() # used to move to the next line or row
