List = [] # Here, the value of var 'List' is [] , of list datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    List.append(number) # Here, we are Appending the value of var 'number' to the list.
    
MaxNum = max(List) # Here, the max() fnc is used to find the max number in the list.

print("The Maximum Number in the List is: " , MaxNum, "at the Index : " , List.index(MaxNum) , ".") # prints the maximum number in the list.

# Used max() fnc to find the max number in the list.

# Used index(val) fnc to find the index of the max number in the list.