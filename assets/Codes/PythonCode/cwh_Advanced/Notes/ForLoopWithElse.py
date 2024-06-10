# do you know in python you can use else in for loop and as well as in while loop,

for i in range(1 , 6): # A for loop iterating on var i in range 1 to 6 and i iterates from 1 to 5
     
    print(i) # printing the value of i
    
else: # this will be executed when the loop ends 
    
    print("Loop Ends") # this will be printed
    
# OUTPUT:- 1
#          2
#          3
#          4
#          5
#          Loop Ends

# As you can see fiestly the loop runs and when the loop ends then the else code will run. Remember if you use break keyword or try to forcefully stop the loop and else code will run, like:-

for i in range(1 , 11): # A for loop iterating on var i in range 1 to 11 and i iterates from 1 to 10
    
    if i % 5 == 0: # checking if i is divisible by 5
        
        break # forcefully stop the loop
    
    else: # this will be executed when if code is not executed or becomes False.
        
        print(i) # prints the value of var 'i'
        
else: # this will run when the loop ends.
    
    print("Loop Ends") # printing..
    
# OUTPUT:- 1   
#          2
#          3
#          4

# And the loops terminate without else code because else code only runs when the loop ends satisfactorily.