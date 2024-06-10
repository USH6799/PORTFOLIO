list = [] # Here, the value of var 'list' is [] , of list datatype.

while True:
    Item = input("Enter the Elements or Enter 0 to End: ") # Here, the input from the user is stored in var 'Item'.
    list.append(Item) # Here, we are Appending the value of var 'Item' to the list.
    
    if(Item == "0"):
        break
    
print(list)