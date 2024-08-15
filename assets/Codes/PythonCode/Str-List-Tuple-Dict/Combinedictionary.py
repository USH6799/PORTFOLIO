dic1 = {
    1: 10,
    2: 20,
    3: 30,
    4: 40,
    5: 50
}

dic2 = {
    6: 60,
    7: 70,
    3: 30,
    4: 40,
    5: 50
}

for i in dic2.keys():  # Iterate through each key 'i' in dic2
    if i in dic1.keys():  # Check if 'i' is also a key in dic1
        dic1[i] = dic1[i] + dic2[i]  # If 'i' is in dic1, add the value from dic2 to the existing value in dic1
    else:  # If 'i' is not in dic1
        dic1[i] = dic2[i]  # Add 'i' to dic1 with the value from dic2

print(dic1)  # Print the updated dic1

# Dry Run:

# Initial dictionaries:
# dic1 = {1: 10, 2: 20, 3: 30, 4: 40, 5: 50}
# dic2 = {6: 60, 7: 70, 3: 30, 4: 40, 5: 50}

# Iteration through dic2 keys:
# i = 6
# 6 is not in dic1; Add 6 to dic1 with value 60
# dic1 becomes {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}

# i = 7
# 7 is not in dic1; Add 7 to dic1 with value 70
# dic1 becomes {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60, 7: 70}

# i = 3
# 3 is in dic1; Update dic1[3] by adding dic2[3] to dic1[3]
# dic1[3] = 30 + 30 = 60
# dic1 becomes {1: 10, 2: 20, 3: 60, 4: 40, 5: 50, 6: 60, 7: 70}

# i = 4
# 4 is in dic1; Update dic1[4] by adding dic2[4] to dic1[4]
# dic1[4] = 40 + 40 = 80
# dic1 becomes {1: 10, 2: 20, 3: 60, 4: 80, 5: 50, 6: 60, 7: 70}

# i = 5
# 5 is in dic1; Update dic1[5] by adding dic2[5] to dic1[5]
# dic1[5] = 50 + 50 = 100
# dic1 becomes {1: 10, 2: 20, 3: 60, 4: 80, 5: 100, 6: 60, 7: 70}

# Final result:
# dic1 = {1: 10, 2: 20, 3: 60, 4: 80, 5: 100, 6: 60, 7: 70}
