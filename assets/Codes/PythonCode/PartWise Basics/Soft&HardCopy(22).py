# ----------------------------------------------------------
#  SOFT COPY AND HARD COPY

a = [1 , 2 , 3 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(a) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

b = a # Here, the value of var 'b' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(b) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

c = a.copy() # Here, the value of var 'c' is [1 , 2 , 3 , 4 , 5] , of list datatype.

print(c) # prints the whole list.

# OUTPUT:- [1 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

# Here All have the Same output.

# Above b is the Soft copy of a and c is the hard copy of a.

# Soft Copy only copies the reference of the object and not the actual object.

# Hard Copy copies the actual object.

b[0] = 6 

print(b) # prints the whole list.

# OUTPUT:- [6 , 2 , 3 , 4 , 5] , here the item inside the list 'b' is changed.

# But in Reality the Same item in list 'a' is also changed.

# PROOF:-

print(a) # prints the whole list.

# OUTPUT:- [6 , 2 , 3 , 4 , 5]

# ----------------------------------------------------------

# If we do opposite , changes the item in list 'a' then it also changes from list 'b' and vice versa. Because list 'b' is only a reference of list 'a' or it only copies the address of items inside list 'a'.

a[1] = 10 

print(a) # prints the whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5]

# And in list 'b' ,

print(b) # Prints the Whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5]

# ----------------------------------------------------------

# After All this Still there is no change in the list of 'c' because it is the hard copy of a , which means it really copies the items from list and have space in memory.

# List 'a' has space in memory.
# List 'b' has no space in memory , because it is the reference copy or soft copy.
# List 'c' has space in memory.

print(a) # prints the whole list.
print(b) # prints the whole list.
print(c) # prints the whole list.

# OUTPUT:- [6 , 10 , 3 , 4 , 5] , list a
# OUTPUT:- [6 , 10 , 3 , 4 , 5] , list b
# OUTPUT:- [1 , 2 , 3 , 4 , 5] , list c