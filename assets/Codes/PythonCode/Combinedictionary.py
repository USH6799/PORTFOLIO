dic1 = {
    1 : 10 ,
    2 : 20 , 
    3 : 30 ,
    4 : 40 , 
    5 : 50
    }

dic2 = {
    6 : 60 ,
    7 : 70 , 
    3 : 30 ,
    4 : 40 , 
    5 : 50
    }

for i in dic2.keys(): # Here, the value of var 'i' is less than dic2 and it gives the output as True and the for loop is executed.
    
    if i in dic1.keys(): # Here, the value of var 'i' is in the dictionary 'dic1'.
        
        dic1[i] = dic1[i] + dic2[i] #Here, adding the value of dic1[i] and dic2[i] and stores in dic1[i].
        
    else: # Here, the value of var 'i' is not in the dictionary 'dic1'.
        
        dic1[i] = dic2[i] # Here, storing the value of dic2[i] in dic1[i].
    
print(dic1) # Printing the value of var 'dic1'