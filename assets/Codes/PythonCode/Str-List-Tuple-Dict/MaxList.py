List = []  # Initializes an empty list 'List'.

limit = int(input("Enter the number of elements: "))  # Takes input for the number of elements to add to the list and converts it to an integer.

for i in range(0, limit, 1):  # Iterates from 0 to 'limit' (exclusive) with a step of 1.
    number = int(input("Enter the number: "))  # Takes input for a number and converts it to an integer.
    List.append(number)  # Appends the input number to the list 'List'.

MaxNum = max(List)  # Finds the maximum number in the list using the max() function.

print("The Maximum Number in the List is: ", MaxNum, "at the Index: ", List.index(MaxNum), ".")  # Prints the maximum number and its index in the list.

# Used max() function to find the maximum number in the list.
# Used index(val) function to find the index of the maximum number in the list.

# Dry Run:
# Assume the user inputs 5 for the number of elements and then inputs: 10, 20, 30, 40, 50.

# Execution steps:
# 1. Initial values: List = []
# 2. User inputs 5 for the number of elements, so the for loop will iterate 5 times.

# Iteration details:
# - 1st iteration: number = 10; List becomes [10]
# - 2nd iteration: number = 20; List becomes [10, 20]
# - 3rd iteration: number = 30; List becomes [10, 20, 30]
# - 4th iteration: number = 40; List becomes [10, 20, 30, 40]
# - 5th iteration: number = 50; List becomes [10, 20, 30, 40, 50]

# After the loop:
# - List = [10, 20, 30, 40, 50]
# - max(List) = 50 (the maximum number in the list)
# - List.index(50) = 4 (the index of the maximum number in the list)

# Output:
# The Maximum Number in the List is: 50 at the Index: 4.
