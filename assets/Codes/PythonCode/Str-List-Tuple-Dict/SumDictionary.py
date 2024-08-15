dic = {}  # Initializes an empty dictionary named 'dic'.

limit = int(input("Enter the number of elements: "))  # Takes an integer input from the user to define how many key-value pairs will be added to the dictionary.

for i in range(0, limit, 1):  # Iterates from 0 to 'limit' - 1.
    
    key = input("Enter the key: ")  # Takes input from the user for the dictionary key.
    
    value = int(input("Enter the value: "))  # Takes input from the user for the dictionary value, converts it to an integer.
    
    dic[key] = value  # Adds the key-value pair to the dictionary 'dic'.
    
Sum = 0  # Initializes a variable 'Sum' to store the sum of all dictionary values.

for key in dic:  # Iterates over all keys in the dictionary 'dic'.
    
    Sum = Sum + dic[key]  # Adds the value corresponding to the current key to 'Sum'.

print(f"Sum of all values in dictionary is : {Sum}")  # Prints the sum of all values in the dictionary.

# Dry Run:
# Let's take limit = 3 for this example.

# 1. First iteration (i = 0):
#    key = input("Enter the key: ")  # Suppose input is 'a'
#    value = int(input("Enter the value: "))  # Suppose input is 5
#    dic['a'] = 5
#    Dictionary now: {'a': 5}

# 2. Second iteration (i = 1):
#    key = input("Enter the key: ")  # Suppose input is 'b'
#    value = int(input("Enter the value: "))  # Suppose input is 10
#    dic['b'] = 10
#    Dictionary now: {'a': 5, 'b': 10}

# 3. Third iteration (i = 2):
#    key = input("Enter the key: ")  # Suppose input is 'c'
#    value = int(input("Enter the value: "))  # Suppose input is 15
#    dic['c'] = 15
#    Dictionary now: {'a': 5, 'b': 10, 'c': 15}

# Sum calculation:
# 1. For key 'a': Sum = 0 + dic['a'] = 0 + 5 = 5
# 2. For key 'b': Sum = 5 + dic['b'] = 5 + 10 = 15
# 3. For key 'c': Sum = 15 + dic['c'] = 15 + 15 = 30

# Final Output:
# Sum of all values in dictionary is : 30
