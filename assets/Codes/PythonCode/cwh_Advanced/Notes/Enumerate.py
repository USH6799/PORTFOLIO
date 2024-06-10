# Imagine you have to print the items of the list and as well as their index then,

l = [1,3,5,4,3,53,4,34,45,4,54,5]

i = 0

for item in l: # Iterates over each item of the list.
    
    print(f"{i}. {item}") # prints the items as well as their index.
    
    i = i + 1 # increasing the value of index 'i' by 1.
    
    
# In the above loop we need an additional temporary variable to print the index, but we can get the index by enumerate() fnc inside of range(), lets see how:

for index , item in enumerate(l): # here it will move to each item of the list and also gives their indexes.
    
    # Remember there are two variables in the for loop , the index always goes in the first variable so keep the first variable as your index and second variable as the value.
    
    print(f"{index}. {item}")

# As you see no use of additional temporary variable for index.

# U can also start the indexing from diffrent number instead of 0 by using start= <val> inside the enumerate fnc.

for i , item in enumerate(l , start = 1):
    print(i , ". " , item)
    
    # now the value of i starts from 1 instead of 0.
    