a = [] # Here, the value of var 'a' is an empty list and it gives the output as True and the if statement is executed.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    a.append(number) # Here, we are Appending the value of var 'number' to the list.
    
print(set(a)) # prints the unique values in the list.

# Type casted the list into a set and printed the unique values in the list.

print("No. of Unique Numbers: " , len(set(a))) # prints the number of unique values in the list.

    
    