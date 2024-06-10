
# ------------------------------------------------------------------
 # MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP
 
 
# a map fnc applies a function to each item of an iterable and returns a list containing the results.

# Syntax:- map(function , iterable)

# like i have a cube fnc 

cube = lambda n: n * n * n # this is the lambda fnc taking input n and returning n*n*n

# Now what if i want these fn con each item of this list?

l = [2,4,6,5,3,7] # this is my list 'l'

# Now by our method,

newl = [] # A new list used to store the cube of each item

for item in l: # iterating over each item of the list
    
    newl.append(cube(item)) # appending the cube of each item
    
print(newl) # printing the new list with the cube of each item

# OUTPUT:- [8, 64, 216, 125, 27, 343]


# Now lets use map fnc and try!

newList = map(cube , l) # map(fnc , iterable) , here the cube() fnc is passed as a argument in the fnc map so map is known as higher order fnc or the functions which accepts or return a function as an argument or as the value.

# l is the list which is iterable passed as argument in map fnc.

# Now, the map fnc calls each item of iterable list and passes it in the fnc cube(),

# means [cube(l[0]) , cube(l[1]) , cube(l[2]) , cube(l[3]) , cube(l[4]) , cube(l[5])]

# This will be returned by the map fnc but it will be in map datatype.

print(type(newList)) # OUTPUT:- <class 'map'>

# So now let convert it from map datatype to list datatype.


newList = list(newList) # converting the map datatype to list datatype

print(newList) # OUTPUT:- [8, 64, 216, 125, 27, 343]

# as you saw the same output by just a snigle line of code using map fnc.


# Lets create a square fnc and apply it on the list,

# square = lambda n: n * n 
# this is the lambda fnc taking input n and returning n*n

# We can create a lambda fnc and then store it in var and then pass it argument or we can directly create it during the call of the map fnc.

l2 = map(lambda x: x * 2 , l) # map(fnc , iterable) , here the square() fnc is passed as a argument in the fnc map so map is known as higher order fnc or the functions which accepts or return a function as an argument or as the value.

print(list(l2)) # OUTPUT:- [4, 8, 12, 10, 6, 14]

# ------------------------------------------------------------------



# ------------------------------------------------------------------
 # FILTER FILTER FILTER FILTER
 
 
# A filter fnc is the fnc which takes a function and an iterable and returns an iterator with the items for which the function returns True.

# this is the fnc to filter the values and save it or store them anywhere else.

# Syntax:- filter(function , iterable)
 
# now lets filter the even values from the list

l = [1,2,3,4,5,6,7,8,9,10] # this is my list 'l'

FileredVal = filter(lambda x: x % 2 == 0 , l) # filter(fnc , iterable)

# here i passed a lambda fnc as an argument in the filter fnc, where lambda fnc taking input x and returning true or false based on the condition x % 2 == 0.

# Now the filtre() fnc only returns the values for which the lambda fnc returns true.

# here also the filter() fnc returns the value of filter datatype u have to manually convert it into list.

print(type(FileredVal)) # OUTPUT:- <class 'filter'>

print(list(FileredVal)) # OUTPUT:- [2, 4, 6, 8, 10]

# ------------------------------------------------------------------



# ------------------------------------------------------------------
 # REDUCE REDUCE REDUCE REDUCE REDUCE REDUCE
 
# first of all, we need to import reduce fnc it is not given by default in python, it is also a higher order fnc.

from functools import reduce # importing reduce fnc from functools module

# lets calculate the sum of the numbers using reduce() fnc:

l = [1,2,3,4,5,6,7,8,9,10] # this is my list 'l'


sum = reduce(lambda x,y: x + y , l) # reduce(fnc , iterable), here the lambda fnc is passed as a argument in the fnc reduce so reduce is known as higher order fnc or the functions which accepts or return a function as an argument or as the value.

# lambda fnc taking input x , y and returning x + y

# Now behind the scene , the reduce()fnc works like this,

"""
    Original List:
    
    l = [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10] , total length = 10

    for 1st and 2nd item,
    l = [1 + 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10] , total length = 9
    
    for again 1st and 2nd item,
    l = [3 + 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10] , total length = 8

    for again 1st and 2nd item,
    l = [6 + 4 , 5 , 6 , 7 , 8 , 9 , 10] , total length = 7

    for again 1st and 2nd item,
    l = [10 + 5 , 6 , 7 , 8 , 9 , 10] , total length = 6

    for again 1st and 2nd item,
    l = [15 + 6 , 7 , 8 , 9 , 10] , total length = 5

    for again 1st and 2nd item,
    l = [21 + 7 , 8 , 9 , 10] , total length = 4

    for again 1st and 2nd item,
    l = [28 + 8 , 9 , 10] , total length = 3

    for again 1st and 2nd item,
    l = [36 + 9 , 10] , total length = 2

    for again 1st and 2nd item,
    l = [45 + 10] , total length = 1

    for again 1st and 2nd item,
    l = [55] , total length = 0
    
    # Now the reduce() fnc returns the final value to the variable 'sum'
    
    
"""

print(sum) # OUTPUT:- 55
# ------------------------------------------------------------------