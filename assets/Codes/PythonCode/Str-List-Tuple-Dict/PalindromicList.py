list = [] # Here, the value of var 'list' is [] , of list datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    list.append(number) # Here, we are Appending the value of var 'number' to the list.
    
opp = []

for i in range(len(list) - 1 , -1 , -1): # Here, the value of var 'i' goes from len(list) - 1 to 0 and it gives the output as True and the for loop is executed.
    
    opp.append(list[i]) # Here, we are Appending the value of var 'list' at index 'i' to the list.

if(list == opp): # Here, the value of var 'list' is compared with the value of var 'opp'.
    
    print("List is Palindromic") # prints if the list is Palindromic.
    
else:
    
    print("List is not Palindromic") # prints if the list is not Palindromic.
    