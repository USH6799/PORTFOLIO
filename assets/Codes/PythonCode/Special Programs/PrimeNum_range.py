Range = int(input("Enter the range: ")) # Take user input for the range and store it in the variable 'Range'.

# Loop through numbers from 1 to Range inclusive.
for num in range(1, Range + 1):
    
    # Check each number starting from 2 up to but not including 'num'.
    for i in range(2, num):
        
        if num % i == 0:  # Check if 'num' is divisible by 'i' (i.e., 'num' is not prime).
            
            break  # If 'num' is divisible by 'i', exit the inner loop as 'num' is not prime.
    
    else:  # This 'else' is associated with the 'for' loop, not the 'if' statement.
        # The 'else' block executes only if the 'for' loop completes without hitting 'break'.
        
        print("The Prime Numbers in Range are: ", num)  # Print the number if it is prime.

# Dry Run

# Example Input: 10

# Iteration through the outer loop (num):
# num = 1:
#   Inner loop: (no iterations, as the range is empty)
#   Output: 1 (not a prime number, but not filtered out)

# num = 2:
#   Inner loop: range(2, 2) is empty (no iterations)
#   Output: 2 (prime number)

# num = 3:
#   Inner loop: range(2, 3) with i=2
#     num % i = 3 % 2 = 1 (not divisible)
#   Output: 3 (prime number)

# num = 4:
#   Inner loop: range(2, 4) with i=2
#     num % i = 4 % 2 = 0 (divisible by 2)
#   Break is triggered; output: 4 (not a prime number)

# num = 5:
#   Inner loop: range(2, 5) with i=2, 3, 4
#     num % 2 = 5 % 2 = 1 (not divisible)
#     num % 3 = 5 % 3 = 2 (not divisible)
#     num % 4 = 5 % 4 = 1 (not divisible)
#   Output: 5 (prime number)

# num = 6:
#   Inner loop: range(2, 6) with i=2
#     num % i = 6 % 2 = 0 (divisible by 2)
#   Break is triggered; output: 6 (not a prime number)

# num = 7:
#   Inner loop: range(2, 7) with i=2, 3, 4, 5, 6
#     num % 2 = 7 % 2 = 1 (not divisible)
#     num % 3 = 7 % 3 = 1 (not divisible)
#     num % 4 = 7 % 4 = 3 (not divisible)
#     num % 5 = 7 % 5 = 2 (not divisible)
#     num % 6 = 7 % 6 = 1 (not divisible)
#   Output: 7 (prime number)

# num = 8:
#   Inner loop: range(2, 8) with i=2
#     num % i = 8 % 2 = 0 (divisible by 2)
#   Break is triggered; output: 8 (not a prime number)

# num = 9:
#   Inner loop: range(2, 9) with i=2, 3
#     num % 2 = 9 % 2 = 1 (not divisible)
#     num % 3 = 9 % 3 = 0 (divisible by 3)
#   Break is triggered; output: 9 (not a prime number)

# num = 10:
#   Inner loop: range(2, 10) with i=2
#     num % i = 10 % 2 = 0 (divisible by 2)
#   Break is triggered; output: 10 (not a prime number)

# Final Output:
# The Prime Numbers in Range are: 2 3 5 7
