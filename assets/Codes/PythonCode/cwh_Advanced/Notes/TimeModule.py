# lets know about time module in python, it is pre-installed module in python.

# it is used to know the current time of the system.

import time # this is used to import time module and access it methods and other data.

# lets create two fncs for running loops and calculating times btw there completion.

def UsingWhileLoop(): # a fnc for running loops
    
    i = 0 # local variable

    while(i < 50000): # A while loop running on i less than 50000
        
        print(i) # printing the value of i

        i = i + 1 # increasing the value of i by 1


def UsingForLoop(): # a fnc for running loops
    
    for i in range(0 , 50000): # A for loop iterating on var i in range 0 to 50000 and i iterates from 0 to 49999
        
        print(i) # printing the value of i
        
        
# UsingWhileLoop() # calling the fnc UsingWhileLoop()

# UsingForLoop() # calling the fnc UsingForLoop()

# now when u see the output , u will see the values are printing, but i dont know how fast the complete printing, or if i want a dealy of accurate 1 sec in my program. then how could i do that

# here time module helps us.

# Comment the above two fncs calls. Or simply add # before them.


import time # import time module

initialTime = time.time() # this is the method used to get the initial time of the program

print(initialTime) # printing the value of initialTime

UsingForLoop() # calling the fnc UsingForLoop()

forend = time.time() - initialTime # this is the method used to get the final time of the program, and get the time btw initial and final.

print(forend) # OUTPUT:- 7.8s in my computer.

# Or btw 7 and 8s the for loop completes.

# localtime() method is the method of time module that gives the current time of the location where you are or according to your computer time.

t1 = time.localtime() # this is the method used to get the current time of the location where you are or according to your computer time.

print(t1) # OUTPUT:- time.struct_time(tm_year=2022, tm_mon=3, tm_mday=12, tm_hour=23, tm_min=11, tm_sec=5, tm_wday=2, tm_yday=63, tm_isdst=0)

# as you saw it gives a tuple form of data representing every format of time.


# strfttime() is the method of time module that gives the current time in any format in which you want.

formattedTime = time.strftime("%H:%M:%S , %d-%m-%Y" , t1) # it takes 2 arguments, 1st | format in which you want to print the time, it can be either formatted string or list and 2nd | time in which you want to print the time.

# in the formatted string %H represents hours, %M represents minutes, %S represents seconds.

# %Y represents year, %m represents month, %d represents day.

# lets print it,

print(formattedTime) # OUTPUT:- 23:11:05 , 12-03-2022

# the output will you be your local time in proper format, you can change it according to your need.