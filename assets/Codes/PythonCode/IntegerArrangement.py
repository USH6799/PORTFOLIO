list = [] # Here, the value of var 'list' is [] , of list datatype.

limit = int(input("Enter the number of elements: ")) # Here, the value of var 'limit' is input and it gives the output as 0 and the loop is executed.

for i in range(0 , limit , 1): # Here, the value of var 'i' goes from 0 to limit and it gives the output as True and the for loop is executed.
    
    number = int(input("Enter the number: ")) # Here, the input from the user is stored in var 'number'.
    
    list.append(number) # Here, we are Appending the value of var 'number' to the list.
    
PositiveList = [] # Here, the value of var 'PositiveList' is [] , of list datatype.To Store the Positive numbers.

NegativeList = [] # Here, the value of var 'NegativeList' is [] , of list datatype. To Store the Negative numbers.

for i in range(0 , len(list) , 1): # Here, the value of var 'i' goes from 0 to len(list) and it gives the output as True and the for loop is executed.
    
    if(list[i] > 0): # Here, the value of var 'list' at index 'i' is compared with 0.
        
        PositiveList.append(list[i]) # Here, we are Appending the value of var 'list' at index 'i' to the PositiveList.
        
    elif(list[i] < 0): # Here, the value of var 'list' at index 'i' is compared with 0.
        
        NegativeList.append(list[i]) # Here, we are Appending the value of var 'list' at index 'i' to the NegativeList.
        
    else:
        print("List Contains Zero.") # prints if the list contains zero.
        

print("The List Of Positive Numbers: " ,PositiveList) # prints the whole PositiveList.

print("The List Of Negative Numbers: " , NegativeList) # prints the whole NegativeList.