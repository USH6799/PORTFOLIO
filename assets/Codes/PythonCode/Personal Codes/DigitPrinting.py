num = int(input("Enter a number: ")) # Here the input from the user is stored in variable 'num'.

# ----------------------------------------------------------
# Using a while loop because a for loop for this is more complex.
# The while loop is more straightforward for this task.
# ----------------------------------------------------------

while num > 0: # Loop continues as long as 'num' is greater than 0.

    digit = num % 10 # The remainder when 'num' is divided by 10 gives the last digit of 'num'.
    
    print(digit) # Prints the last digit of 'num'.
    
    num = num // 10 # Removes the last digit from 'num' by performing integer division by 10.
    
# Dry Run:

# Example 1:
# Assume user inputs: num = 1234
# 1. The input '1234' is converted to integer and stored in 'num'.
# 2. The while loop begins since 'num' (1234) is greater than 0.
# 3. In the first iteration:
#    - digit = 1234 % 10 = 4
#    - 4 is printed.
#    - num = 1234 // 10 = 123
# 4. In the second iteration:
#    - digit = 123 % 10 = 3
#    - 3 is printed.
#    - num = 123 // 10 = 12
# 5. In the third iteration:
#    - digit = 12 % 10 = 2
#    - 2 is printed.
#    - num = 12 // 10 = 1
# 6. In the fourth iteration:
#    - digit = 1 % 10 = 1
#    - 1 is printed.
#    - num = 1 // 10 = 0
# 7. The while loop terminates as 'num' is now 0.

# Example 2:
# Assume user inputs: num = 890
# 1. The input '890' is converted to integer and stored in 'num'.
# 2. The while loop begins since 'num' (890) is greater than 0.
# 3. In the first iteration:
#    - digit = 890 % 10 = 0
#    - 0 is printed.
#    - num = 890 // 10 = 89
# 4. In the second iteration:
#    - digit = 89 % 10 = 9
#    - 9 is printed.
#    - num = 89 // 10 = 8
# 5. In the third iteration:
#    - digit = 8 % 10 = 8
#    - 8 is printed.
#    - num = 8 // 10 = 0
# 6. The while loop terminates as 'num' is now 0.
