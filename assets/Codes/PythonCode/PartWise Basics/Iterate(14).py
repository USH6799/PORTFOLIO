# ----------------------------------------------------------
# ITERATIVE STATEMENTS
# ----------------------------------------------------------


# Iterative statements are those which are used to repeat the statements multiple times.


# ----------------------------------------------------------
# 1. For Loop

# syntax of for loop is as follows,:- for var in range(start, end, step):

for i in range(1 , 10 , 1): # Here, the value of var 'i' is less than 10 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9
    
    # it will not print 10 because it has already printed 9 and it not prints end point means 10.
    
    # if you want to print 10, then you have to write 11 as end point in the for loop.
    
# like,

for i in range(1 , 11 , 1): # Here, the value of var 'i' is less than 11 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9 10
    
# Range fnc takes 3 arguments, start, end and step. Here, start point and end point and step point.

limit = range(1 , 6 , 1) # Here, the value of var 'limit' is less than 6 and it gives the output as True and the for loop is executed.

for i in limit: # Here, the value of var 'i' is less than 6 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 5
    

# Example U have to print the Table of 5, then use the for loop.

for i in range(5 , 51 , 5): # Here, the value of var 'i' is less than 51 and it gives the output as True and the for loop is executed.
    
    # here the step point is 5. which means it will print the table of 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
    
    print(i) # Output: 5 10 15 20 25 30 35 40 45 50
    
# opposite Printing like from 10 to 1 in descending order.

for i in range(10 , 0 , -1): # Here, the value of var 'i' is greater than 0 and it gives the output as True and the for loop is executed.
    
    # here -1 is the step point. which means it will print the table of 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    
    print(i) # Output: 10 9 8 7 6 5 4 3 2 1

    
# ----------------------------------------------------------
# 2. While Loop
# ----------------------------------------------------------


# syntax of while loop is as follows:- while condition:

# Like printing from 1 to 10 then,

i = 1 # Here, the value of var 'i' is 1 and it gives the output as True and the while loop is executed.

while i < 11: # Here, the value of var 'i' is less than 11 and it gives the output as True and the while loop is executed.
    
    print(i) # Output: 1 2 3 4 5 6 7 8 9 10
    
    i = i + 1 # Here, the value of var 'i' is increased by 1 and it gives the output as True and the while loop is executed.
    
# Like , printing the table of 7, then,

i = 7 # Here, the value of var 'i' is 7 and it gives the output as True and the while loop is executed.

while i < 71: # Here, the value of var 'i' is less than 71 and it gives the output as True and the while loop is executed.
    
    print(i) # Output: 7 14 21 28 35 42 49 56 63 70
    
    i = i + 7 # Here, the value of var 'i' is increased by 7 and it gives the output as True and the while loop is executed.
    
    