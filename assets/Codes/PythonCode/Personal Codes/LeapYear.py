year = int(input("Enter a year: ")) # Here the input from the user is stored in the variable 'year'.

# A century is defined as 100 years, and a leap year is every 4 years, except for every 100 years, except for every 400 years.

# Leap year condition:
# - The year must be divisible by 4.
# - However, if it is also divisible by 100, it must be divisible by 400 to be a leap year.

if year % 4 == 0 and year % 100 != 0 or year % 400 == 0: # Checking whether the year is a leap year.
    
    print(f"{year} is a leap year.") # If conditions are met, it prints that the year is a leap year.
    
    # used f to print the value of year in string format.

else: # If the year does not meet the leap year conditions.
    
    print(f"{year} is not a leap year.") # Prints that the year is not a leap year.

# Dry Run:

# Example 1:
# Assume user inputs: year = 2000
# 1. The user is prompted to enter a year.
# 2. Input: 2000 is converted to an integer and stored in 'year'.
# 3. The condition `year % 4 == 0 and year % 100 != 0 or year % 400 == 0` is evaluated.
#    - 2000 % 4 == 0 is True.
#    - 2000 % 100 != 0 is False.
#    - 2000 % 400 == 0 is True.
#    - Since the condition is True (2000 is divisible by 400), it prints "2000 is a leap year."

# Example 2:
# Assume user inputs: year = 1900
# 1. The user is prompted to enter a year.
# 2. Input: 1900 is converted to an integer and stored in 'year'.
# 3. The condition `year % 4 == 0 and year % 100 != 0 or year % 400 == 0` is evaluated.
#    - 1900 % 4 == 0 is True.
#    - 1900 % 100 != 0 is False.
#    - 1900 % 400 == 0 is False.
#    - Since the condition is False (1900 is not divisible by 400), it prints "1900 is not a leap year."

# Example 3:
# Assume user inputs: year = 2024
# 1. The user is prompted to enter a year.
# 2. Input: 2024 is converted to an integer and stored in 'year'.
# 3. The condition `year % 4 == 0 and year % 100 != 0 or year % 400 == 0` is evaluated.
#    - 2024 % 4 == 0 is True.
#    - 2024 % 100 != 0 is True.
#    - 2024 % 400 == 0 is False.
#    - Since the condition is True (2024 is divisible by 4 but not by 100), it prints "2024 is a leap year."
