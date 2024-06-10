List = [] # Here, the value of var 'List' is [] , of list datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    List.append(number) # Here, we are Appending the value of var 'number' to the list.
    
max1 = 0 # Here, the value of var 'max1' is 0 and it gives the output as 0.

max2 = 0 # Here, the value of var 'max2' is 0 used to store the 2nd max value.

index = 0 # Here, the value of var 'index' is 0 used to store the index of the max value.
    
    
for i in range(0 , len(List)): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    if List[i] > max1: # Here, the value of var 'i' is greater than var 'max1' and it gives the output as True.
        
        max2 = max1 # Here, the value of var 'max2' is equal to var 'max1' and it gives the output as True.
        
        max1 = List[i] # Here, the value of var 'max1' is equal to var 'List' at index 'i'.
    
    elif List[i] > max2: # Here, the value of var 'i' is greater than var 'max2' and it gives the output as True.
        
        max2 = List[i] # Here, the value of var 'max2' is equal to var 'List' at index 'i'.
        

print("The 2nd Maximum Number in the List is: " , max2, "at the Index : " , List.index(max2) , ".") # prints the maximum number in the list.
