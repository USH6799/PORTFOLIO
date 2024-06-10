
# ----------------------------------------------------------
 # SETS
# ----------------------------------------------------------

# Sets are Same as list and tuples , but all has some diffrences,

# Sets is also a list but in this list all items should unique or do not repeat themeselves.

# So Sets are used to store multiple items in a single variable. Sets are unordered, unchangeable, and do not allow duplicate values.

# Unordered means the items in Sets are not stored in any particular order. And cannot accessed by index.

# Sets are written with curly brackets {}.

a = {1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5} # Here, the value of var 'a' is {1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5} , of set datatype.

# Lets check the datatype of var 'a',

print(type(a)) # prints the datatype of var 'a'.

# OUTPUT:- <class 'set'>


# ----------------------------------------------------------
#  ITERATING OVER SET:

# Only One for loop will work , 'in' keyword for loop.

for i in a: # Here, the value of var 'i' is 1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 5 and it gives the output as True and the for loop is executed.
    
    print(i) # Output: 1 2 3 4 4 6 7 8 5
    