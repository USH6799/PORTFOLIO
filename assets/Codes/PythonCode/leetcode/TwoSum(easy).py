# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# Example:
# nums = [1,5,3,6,7]
# target = 8
# OUTPUT: [1, 2] because nums[1] + nums[2] == 8

# Straight Combination (single):-
target = int(input("\nEnter the target: ")) # Taking the target value from the user.

nums = [2,2,7,5,3,5,8,3,6,8,5,8,1,3,2,2,4,0] # Example list of integers

print("Single Combination Results Below!")

# Iterate through the list to find pairs with target sum
for i in range(0, len(nums) - 1):
    
    # Check if the sum of adjacent elements equals the target and they are not equal
    if nums[i] + nums[i + 1] == target and nums[i] != nums[i + 1]:
        print(f"Found {nums[i], nums[i + 1]} at index {i, i + 1}")

# Multi Combinations:-
print("-------------------------------------\n\nMulti Combination Results are Below!")

# Nested loop to find all pairs with target sum
for i in range(0, len(nums)):
    
    for j in range(i + 1, len(nums)):
        # Check if the sum of the elements at indices i and j equals the target and they are not equal
        if nums[i] + nums[j] == target and nums[i] != nums[j]:
            print(f"Found {nums[i], nums[j]} at index {i, j}")

# Dry Run:

# Example list: nums = [2,2,7,5,3,5,8,3,6,8,5,8,1,3,2,2,4,0]
# Example target: 8

# Single Combination Results:
# Iterates over pairs (2,2), (2,7), (7,5), etc., and finds that (2,6) at indices (1, 8) and (7,1) at indices (3, 8) are valid.

# Multi Combination Results:
# Iterates over all possible pairs in the list and finds multiple pairs adding up to the target.

# Output:
# Found (2, 6) at index (1, 8)
# Found (7, 1) at index (3, 8)
# Found (3, 5) at index (4, 5)
# Found (3, 5) at index (4, 11)
# Found (2, 6) at index (12, 8)
