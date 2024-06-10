# In thsi we will compare is keyword and == operator

# They are both the comparison oeprators where,

# == Compares the value.

# is keyword compares the Exact location of the object in memory.



# The most simple example like,

a = 4 # a is the variable and 4 is the value, of datatype integer.

b = "4" # b is the variable and "4" is the value, of datatype string.


print(a is b) # OUTPUT:- False

print(a == b) # OUTPUT:- False


# here both are false, and is correct, lets now try this with list.

l1 = [1,2,3] # l1 is the variable and [1,2,3] is the value, of datatype list.

l2 = [1,2,3] # l2 is the variable and [1,2,3] is the value, of datatype list.


print(l1 is l2) # OUTPUT:- False

print(l1 == l2) # OUTPUT:- True

# here the is keyword checks for the exact location of both diffrent lists and returns false.

# and the == operator checks for the value of both the lists and returns true because the value stored in both lists are same.



# What if i choose same value Integer value for 2 variables,

a = 4 # a is the variable and 4 is the value, of datatype integer.

b = 4 # b is the variable and 4 is the value, of datatype integer.


print(a is b) # OUTPUT:- True

print(a == b) # OUTPUT:- True

# == operator will check for the value and here the value of both variables is same.

# but how does is operator compares both and returns true, as they both the variable occupy diffrent memory locations.

# 4 is the immutable object in python.

# The logic behind is that python is so smart, as python knows that the integer value 4 will not change inside the memory so both the variables occupy same memory location for that value and is keyword will return true.

str1 = "USH" # str1 is the variable and "USH" is the value, of datatype string.

str2 = "USH" # str2 is the variable and "USH" is the value of datatype String.

print(a is b) # OUTPUT:- True , the reason was same for strings also.

print(a == b) # OUTPUT:- True



# Lets try these for tuples as we know tuples are immutable.

tuple1 = (1,2,3) # tuple1 is the variable and (1,2,3) is the value, of datatype tuple.

tuple2 = (1,2,3) # tuple2 is the variable and (1,2,3) is the value, of datatype tuple.

print(tuple1 is tuple2) # OUTPUT:- True , the reason was same for tuples also.

print(tuple1 == tuple2) # OUTPUT:- True


# Same for None value.

a = None # a is the variable and None is the value, of datatype None.

b = None # b is the variable and None is the value, of datatype None.

print(a is b) # OUTPUT:- True , the reason was same for None also.

print(a == b) # OUTPUT:- True