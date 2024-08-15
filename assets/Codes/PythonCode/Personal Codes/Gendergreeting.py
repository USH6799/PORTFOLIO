gender = input("What is Your Gender (m for male and f for female): ").lower()
# Asking the user for their gender and storing it in the variable 'gender'.

# The lower() function is used to convert the input to lowercase.
# This ensures that the input is uniformly handled, regardless of whether the user inputs 'M' or 'm'.

if gender == "m": # Checking whether the gender is male.
    print("Good Morning Sir") # Greets the user with 'Good Morning Sir' if gender is male.

elif gender == "f": # Checking whether the gender is female.
    print("Good Morning Ma'am") # Greets the user with 'Good Morning Ma'am' if gender is female.

else: # If the gender is neither 'm' nor 'f'.
    print("Wrong Input") # Prints 'Wrong Input' for any input that is not 'm' or 'f'.

# Dry Run:

# Example 1:
# Assume user inputs: gender = "M"
# 1. The user is prompted to enter their gender.
# 2. Input: "M" is converted to lowercase, resulting in "m".
# 3. The condition `gender == "m"` is evaluated.
#    - The condition is True, so it prints "Good Morning Sir".

# Example 2:
# Assume user inputs: gender = "f"
# 1. The user is prompted to enter their gender.
# 2. Input: "f" is already in lowercase.
# 3. The condition `gender == "f"` is evaluated.
#    - The condition is True, so it prints "Good Morning Ma'am".

# Example 3:
# Assume user inputs: gender = "x"
# 1. The user is prompted to enter their gender.
# 2. Input: "x" is converted to lowercase, which remains "x".
# 3. Neither `gender == "m"` nor `gender == "f"` conditions are met.
# 4. The else block is executed, printing "Wrong Input".
