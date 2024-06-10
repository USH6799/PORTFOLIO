dic1 = {} # A dictionary is created and stored in var 'dic1'.

dic2 = {} # A dictionary is created and stored in var 'dic2'.

limit = int(input("Enter the number of elements of 1st Dictionary: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    key = input("Enter the key: ") # Here, the input from the user is stored in var 'key'.
    
    value = input("Enter the value: ") # Here, the input from the user is stored in var 'value'.
    
    dic1[key] = value # Here, the key and value is stored in the dictionary 'dic1'.
    
limit = int(input("Enter the number of elements of 2nd Dictionary: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    key = input("Enter the key: ") # Here, the input from the user is stored in var 'key'.
    
    value = input("Enter the value: ") # Here, the input from the user is stored in var 'value'.
    
    dic2[key] = value # Here, the key and value is stored in the dictionary 'dic2'.
    
dic1.update(dic2)

print(dic1)