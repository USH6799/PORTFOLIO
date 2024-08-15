n = int(input("Enter the value of n : ")) # Here, the value of var 'n' is taken from the user and stored in 'n'.

for i in range(n + 1): # Loop from 0 to n (inclusive) to determine the number of rows.
    
    # 'range(n + 1)' generates numbers from 0 to n, inclusive.
    # For each value of 'i', we create a new row with 'i' stars.

    for j in range(i): # Loop from 0 to i (exclusive) to print 'i' stars in the current row.
        
        print('*' , end = " ") # Print a star '*' and stay on the same line.

    print() # Move to the next line after printing 'i' stars to start the next row.

# Dry Run:

# Example 1:
# If user inputs: n = 4

# 1. Outer loop starts with i = 0
#   - Inner loop does not execute because range(0) produces no values.
#   - Prints nothing and moves to the next line.

# 2. Outer loop continues with i = 1
#   - Inner loop runs for j = 0
#     - Prints '*' and stays on the same line.
#   - Prints a new line.

# 3. Outer loop continues with i = 2
#   - Inner loop runs for j = 0 and j = 1
#     - Prints '*' and stays on the same line twice.
#   - Prints a new line.

# 4. Outer loop continues with i = 3
#   - Inner loop runs for j = 0, j = 1, and j = 2
#     - Prints '*' and stays on the same line three times.
#   - Prints a new line.

# 5. Outer loop ends with i = 4
#   - Inner loop runs for j = 0, j = 1, j = 2, and j = 3
#     - Prints '*' and stays on the same line four times.
#   - Prints a new line.

# Output:
# 
# 
# *
# * *
# * * *
# * * * *
