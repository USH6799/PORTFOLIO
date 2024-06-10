list = [1,2,2,3,5,343,4,32,4,324,23,4,3,2,1,1,3,32,3,43,4,2,3,4,34,2,3,4,34,2,5,2,5,435,4,23,4,23,42,1,3,2,4,2,3,2,4,3,4,32,2,2,2,4,2,1,22,4,2,3,21,4,4,2,1,1,4,2,2,1,11,1,4,3,3]

dic = {} # Here, the value of var 'dic' is {} , of dictionary datatype.

for i in list: # Here, the value of var 'i' goes from the list and it gives the output as True and the for loop is executed.
    
    if(i in dic.keys()): # Here, the value of var 'i' is checked in the dictionary 'dic'.
        
        dic[i] = dic[i] + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the if loop is executed.
        
    else: # Here, the value of var 'i' is not in the dictionary 'dic'.
        
        dic[i] = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the else loop is executed.
        
print(dic) # Output: {1: 8, 2: 11, 3: 8, 5: 2, 343: 1, 4: 15, 32: 3, 324: 1, 23: 3, 3243: 1, 43: 1, 34: 2, 435: 1, 42: 1, 22: 1, 11: 1}

