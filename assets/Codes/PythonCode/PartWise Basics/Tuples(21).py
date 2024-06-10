# ----------------------------------------------------------
 # TUPLES
# ----------------------------------------------------------


# Tuples are also same as list but they are immutable and cannot be changed once created. U have to use () instead of [] to create Tuples.

x = (1 , 2 , 3 , "hello" , "Wello") # Here, the value of var 'x' is (1 , 2 , 3 , "hello" , "Wello") , of tuple datatype.

# Lets check the datatype of var 'x',

print(type(x)) # prints the datatype of var 'x'.

# OUTPUT:- <class 'tuple'>

# YOU CAN CREATE TUPLES THROUGH LIST by type conversion,

a = [1 , 2 , 3 , "what " , 3] # Here, the value of var 'a' is [1 , 2 , 3 , "what " , 3] , of list datatype.

x = tuple(a) # Here, the value of var 'x' becomes the value of var 'a' but it converted from list to tuple datatype.

print(x) # prints the whole tuple.

# OUTPUT:- (1, 2, 3, 'what ', 3)


# ----------------------------------------------------------
 # ACCESSING ITEMS OF TUPLE 

print(x[0]) # prints the 1st item of the tuple.

# OUTPUT:- 1

# You can access the items of tuple but You cannot Change them.

# x[0] = 12 
# This will Show an error as Tuples are immutable.

