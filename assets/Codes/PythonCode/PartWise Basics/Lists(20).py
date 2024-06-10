# ----------------------------------------------------------
# LIST IN PYTHON
# ----------------------------------------------------------

# A list is a versatile and mutable data structure that can contain different data types and allows you to store collection of data items.

# list Syntax:- var = [val1 , val2 , val3 , val4 , val5], here you can store diffrent datatypes inside this list.

List = [12 , 122 , 1652 , "hello" , True , "Lets Work"] # Here, the value of var 'List' is [12 , 122 , 1652 , "hello" , True , "Lets Work" , ] of list datatype.

# Lets check the datatype of var 'List',

print(type(List)) # prints the datatype of var 'List'.

# Output: <class 'list'> , here you can see that it is a list datatype.

# List is varsatile because it can contain different data types.

# It is mutable because it can be changed.

print(List) # prints the whole list.

# Output:- [12 , 122 , 1652 , "hello" , True , "Lets Work"]

# Lets change the 2nd item of the list.

# Syntax:- var[index] = value

List[1] = 673 # Here, the value of var 'List' at index 1 is changed to 673.

print(List) # prints the whole list.

# OUTPUT:- [12 , 673 , 1652 , "hello" , True , "Lets Work"]


# ----------------------------------------------------------
# LIST INDEXING...

# Same indexing as in Strings like,

# List[0] -> 1st Item of list --> 12
# List[1] -> 2nd Item of list --> 673
# List[2] -> 3rd Item of list --> 1652
# List[3] -> 4th Item of list --> "hello"
# List[4] -> 5th Item of list --> True
# List[5] -> 6th Item of list --> "Lets Work"


# ----------------------------------------------------------
 # LIST SLICING...
 
 # Again, Same as Strings in slicing.

# Like, printing 1st 3 items of the list.

print(List[0 : 3]) # prints the whole list from index 0 to index 2.

# OUTPUT:- [12 , 673 , 1652]


# ---------------------------------------------------------- 
 # ITERATING OVER LISTS:
 
 # We use for loop in list. ( Using in keyword)
 
for i in List: # Here, i is a variable that will take the value of each item of the list.
    
    print(i) # prints each item of the list.
    
    # OUTPUT:- 12 , 673 , 1652 , "hello" , True , "Lets Work"
    

 # Using range() fnc,
 
for i in range(0 , len(List) , 1): # Here, the value of var 'i' goes from 0 to 6 and it gives the output as True and the for loop is executed.
    
    print(List[i]) # prints each item of the list.

    # Output:- 12 , 673 , 1652 , "hello" , True , "Lets Work"
    
    
# ----------------------------------------------------------
 # ADDING ITEMS TO LIST:
 
 # We use append() fnc to add items to list.
 # Syntax:- list.append(val)
 
a = [2,3,4,5] # Here, the value of var 'a' is [2,3,4,5] , of list datatype.

a.append(1) # Here, the value of var 'a' is [2,3,4,5,1] after appending 1 to the list.

# .append(val) fnc is used to add value 'val' at the last index of the list. Here, the value of var 'a' is [2,3,4,5,1] after appending 1 to the list.

print(a) # prints the whole list.

# OUTPUT:- [2, 3, 4, 5, 1]


# ----------------------------------------------------------
# INSERTING ITEMS TO LIST:
 
# We use insert() fnc to add items to list.
# Syntax:- list.insert(index , val)

a = [1 , 2 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 4 , 5] , of list datatype.

a.insert(2 , 3) # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] after inserting 3 at index 2.

print(a) # prints the whole list.

# OUTPUT:- [1, 2, 3, 4, 5]

# ----------------------------------------------------------
# POPPING ITEMS FROM LIST:
 
# We use pop() fnc to remove items from list.
# Syntax:- list.pop(index)

a = [1 , 2 , 3 , 4 , 5] # Here, the value of var 'a' is [1 , 2 , 3 , 4 , 5] , of list datatype.

a.pop(2) # Here, the value of var 'a' is [1 , 2 , 4 , 5] after removing 3 at index 2.

print(a) # prints the whole list.

# OUTPUT:- [1, 2, 4, 5]

# This Removed item Can be Stored in any variable.

a = [9,8,6,7,5] # Here, the value of var 'a' is [9,8,6,7,5] , of list datatype.

removedItem = a.pop(3) # Here, the value of var 'a' is [9,8,6,5] after removing 7 at index 3.

# The item at index 3 is removed and stored in the variable 'removedItem'

print(f"The item at index 3 is {removedItem}.") # prints the value of 'removedItem'.

print(f"The List After Removing the 3th Item of the List: {a}") # prints the whole list after removing the 3th item.

# OUTPUT:- The item at index 3 is 7.
# OUTPUT:- The List After Removing the 3th Item of the List: [9, 8, 6, 5]


# ----------------------------------------------------------
# REMOVING ITEMS FROM LIST,

# We use remove() fnc to remove items from list.
# Syntax:- list.remove(Item)

# The Two Diffrences between pop() and remove() are:-

 # IN pop():
 #      - It Returns the Removed item to the Caller or to the Variable and can be stored.
 #      - It can be used to remove any item from the list through its index.
 
 # IN remove():
 #      - It Doesn't returns the Removed item to the Caller or to the Variable and can't be stored.
 #      - It can be used to Remove the item from the list through its value not ita index.
 
a = [2 , 3 , 4 , 5 , 6 , 7 , 8 , 3 , 5 , 7] # Here, the value of var 'a' is [2 , 3 , 4 , 5 , 6 , 7 , 8 , 3 , 5 , 7] , of list datatype.

a.remove(3) # remove(item) fnc removes only the first '3' from the List.

a.remove(7) # remove(item) fnc removes only the first '7' from the List. 

a.remove(5) # remove(item) fnc removes only the first '3' from the List. 

print(a) # prints the List after removing the Above Items from it.

# OUTPUT:- [2 , 4 , 6 , 8 , 3 , 5 , 7]

