List = []


# -------------------------------------------------------------
 # Using reverse() fnc
 
for i in range(0 , int(input("Enter the Number of Elements: ")) , 1): # Here, the value of var 'i' goes from 0 to input and it gives the output as True and the for loop is executed.
    
    Item = input("Enter the Elements: ") # Here, the input from the user is stored in var 'Item'.
    
    List.append(Item) # Here, we are Appending the value of var 'Item' to the list.
    
List.reverse() # Here, the list is reversed.

print(List) # prints the whole list.


# -------------------------------------------------------------
 # Using Indexing.

reverb = [] # Here, the value of var 'reverb' is [] , of list datatype. Used to store the reversed list. 
 
for i in range(len(List) - 1 , -1 , -1): # Here, the value of var 'i' goes from len(list) - 1 to 0 and it gives the output as True and the for loop is executed.
    
    reverb.append(List[i]) # Here, we are Appending the value of var 'List' at index 'i' to the list.

print(reverb) # prints the whole list.
    
    


