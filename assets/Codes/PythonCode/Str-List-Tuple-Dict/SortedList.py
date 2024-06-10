list = [] # Here, the value of var 'list' is [] , of list datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    list.append(number) # Here, we are Appending the value of var 'number' to the list.
    

for item in range(0 , len(list) - 1): # Here, the value of var 'item' goes from 0 to len(list) - 1 and it gives the output as True and the for loop is executed.
    
    if(list[item] > list[item + 1]): # Here, the value of var 'list' at index 'item' is compared with the value of var 'list' at index 'item + 1'.

        print("List is not Sorted") # prints if the list is not Sorted.
        
        break # breaks the loop.

else: # else part of the for loop.
    
    print("List is Sorted") # prints if the list is Sorted.
    
    
# -------------------------------------------------------------
 # Using Sort method.
 
newList = []

newList = list.copy() # Here, the value of var 'newList' is list.copy() , of list datatype.

# Here, the list is sorted and the new list is stored in var 'newList'.

if(list.sort() == newList):
    print("List is Sorted")
    
else:
    print("List is not Sorted")