l1 = [1, 4, 6, 8, 12, 14] # Initial list l1

l2 = [1, 2, 3, 4, 8, 10, 12] # Initial list l2

l1.extend(l2) # Extend l1 by appending elements from l2 to it.

# After extend:
# l1 becomes [1, 4, 6, 8, 12, 14, 1, 2, 3, 4, 8, 10, 12]

l1.sort() # Sort l1 in ascending order.

# After sort:
# l1 becomes [1, 1, 2, 3, 4, 4, 8, 8, 10, 12, 12, 14]

print("\n", l1) # Print the sorted list.

# Dry Run:

# Initial lists:
# l1 = [1, 4, 6, 8, 12, 14]
# l2 = [1, 2, 3, 4, 8, 10, 12]

# After extending l1 with l2:
# l1 = [1, 4, 6, 8, 12, 14, 1, 2, 3, 4, 8, 10, 12]

# After sorting l1:
# l1 = [1, 1, 2, 3, 4, 4, 8, 8, 10, 12, 12, 14]

# Output:
# [1, 1, 2, 3, 4, 4, 8, 8, 10, 12, 12, 14]
