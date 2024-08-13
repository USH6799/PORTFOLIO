def is_evil_number(n):
    # Convert the number to its binary representation
    binary = bin(n)[2:]
    
    # Count the number of 1s in the binary representation
    count_of_ones = binary.count('1')
    
    # Check if the count of 1s is even (evil number) or odd (not evil)
    return count_of_ones % 2 == 0

# Read the input number from the user
n = int(input("Enter a number: "))
    
# Determine if the number is evil or not
if is_evil_number(n):
       print(f"{n} is an evil number.")
else:
    print(f"{n} is not an evil number.")

# Dry Run Example:
# Input: 7
# Binary representation: '111'
# Count of 1s: 3
# Since 3 is odd, 7 is not an evil number.
#
# Input: 8
# Binary representation: '1000'
# Count of 1s: 1
# Since 1 is odd, 8 is not an evil number.
#
# Input: 15
# Binary representation: '1111'
# Count of 1s: 4
# Since 4 is even, 15 is an evil number.

