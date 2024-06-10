dic = {} # Here, the value of var 'dic' is {} , of dictionary datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    key = input("Enter the key: ") # Here, the input from the user is stored in var 'key'.
    
    value = int(input("Enter the value: ")) # Here, the input from the user is stored in var 'value'.
    
    dic[key] = value # Here, the key and value is stored in the dictionary 'dic'.
    
Sum = 0 # Here, the value of var 'Sum' is 0 , of integer datatype.
    
for key in dic: # here, the value of var 'key' goes from the dictionary 'dic' and it gives the output as True and the for loop is executed.
    
    Sum = Sum + dic[key] # Here, the value of var 'Sum' is increased by the value of var 'key' and it gives the output as True and the for loop is executed.

print(f"Sum of all values in dictionary is : {Sum}")