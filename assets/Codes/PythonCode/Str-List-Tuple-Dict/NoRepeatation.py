a = []  # Initializes an empty list 'a'.

limit = int(input("Enter the number of elements: "))  # Takes input for the number of elements to add to the list and converts it to an integer.

for i in range(0, limit, 1):  # Iterates from 0 to 'limit' (exclusive) with a step of 1.
    number = int(input("Enter the number: "))  # Takes input for a number and converts it to an integer.
    a.append(number)  # Appends the input number to the list 'a'.

print(set(a))  # Converts the list 'a' to a set to remove duplicates and prints the unique values.

# Type casted the list into a set and printed the unique values in the list.

print("No. of Unique Numbers: ", len(set(a)))  # Prints the count of unique values by taking the length of the set.

# Dry Run:
# Assume the user inputs 5 for the number of elements and then inputs: 1, 2, 2, 3, 4.

# Execution steps:
# 1. Initial values: a = []
# 2. User inputs 5 for the number of elements, so the for loop will iterate 5 times.

# Iteration details:
# - 1st iteration: number = 1; list 'a' becomes [1]
# - 2nd iteration: number = 2; list 'a' becomes [1, 2]
# - 3rd iteration: number = 2; list 'a' becomes [1, 2, 2]
# - 4th iteration: number = 3; list 'a' becomes [1, 2, 2, 3]
# - 5th iteration: number = 4; list 'a' becomes [1, 2, 2, 3, 4]

# After the loop:
# - list 'a' = [1, 2, 2, 3, 4]
# - Converting list 'a' to a set removes duplicates: {1, 2, 3, 4}
# - Printing the set shows the unique values: {1, 2, 3, 4}
# - The length of this set is 4, so "No. of Unique Numbers: 4" is printed.
