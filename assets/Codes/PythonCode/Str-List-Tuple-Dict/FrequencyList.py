list = [1,2,2,3,5,343,4,32,4,324,23,4,3,2,1,1,3,32,3,43,4,2,3,4,34,2,3,4,34,2,5,2,5,435,4,23,4,23,42,1,3,2,4,2,3,2,4,3,4,32,2,2,2,4,2,1,22,4,2,3,21,4,4,2,1,1,4,2,2,1,11,1,4,3,3]  # List of integers with repeated elements.

dic = {}  # Initializes an empty dictionary 'dic' to store element counts.

for i in list:  # Iterates through each element 'i' in the list.
    if i in dic.keys():  # Checks if 'i' is already a key in the dictionary.
        dic[i] = dic[i] + 1  # Increments the count of 'i' in the dictionary.
    else:  # If 'i' is not a key in the dictionary.
        dic[i] = 1  # Adds 'i' as a new key with a count of 1.

print(dic)  # Prints the dictionary with element counts.

# Dry Run:
# Given list: [1,2,2,3,5,343,4,32,4,324,23,4,3,2,1,1,3,32,3,43,4,2,3,4,34,2,3,4,34,2,5,2,5,435,4,23,4,23,42,1,3,2,4,2,3,2,4,3,4,32,2,2,2,4,2,1,22,4,2,3,21,4,4,2,1,1,4,2,2,1,11,1,4,3,3]

# Initialization:
# dic = {}

# Iteration details:
# i = 1; not in dic, add dic[1] = 1
# i = 2; not in dic, add dic[2] = 1
# i = 2; 2 already in dic, increment dic[2] = 2
# i = 3; not in dic, add dic[3] = 1
# i = 5; not in dic, add dic[5] = 1
# i = 343; not in dic, add dic[343] = 1
# i = 4; not in dic, add dic[4] = 1
# i = 32; not in dic, add dic[32] = 1
# i = 4; 4 already in dic, increment dic[4] = 2
# i = 324; not in dic, add dic[324] = 1
# i = 23; not in dic, add dic[23] = 1
# i = 4; 4 already in dic, increment dic[4] = 3
# i = 3; 3 already in dic, increment dic[3] = 2
# i = 2; 2 already in dic, increment dic[2] = 3
# i = 1; 1 already in dic, increment dic[1] = 2
# ...

# Final dictionary:
# dic = {1: 8, 2: 11, 3: 8, 5: 2, 343: 1, 4: 15, 32: 3, 324: 1, 23: 3, 43: 1, 34: 2, 435: 1, 42: 1, 22: 1, 11: 1}
