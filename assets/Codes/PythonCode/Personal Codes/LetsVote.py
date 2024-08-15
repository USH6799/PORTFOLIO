name = input("Enter your name: ") # Here the input from the user is stored in the variable 'name'.

age = int(input("Enter your age: ")) # Here the input from the user is stored in the variable 'age', and converted to an integer.

if age >= 18: # Here, the value of 'age' is checked if it is greater than or equal to 18.
    
    print(f"{name} is eligible to vote.") # If 'age' is 18 or older, it prints that the person is eligible to vote.

elif 0 < age < 18: # Here, the value of 'age' is checked if it is between 0 and 18 (exclusive).
    
    print(f"{name} is not eligible to vote.") # If 'age' is less than 18 but greater than 0, it prints that the person is not eligible to vote.

else: # Here, the value of 'age' is less than or equal to 0.
    
    print(f"{name} is not born yet. Please provide your correct age.") # If 'age' is less than or equal to 0, it prints that the person is not born yet and asks for the correct age.

# Dry Run:

# Assume user inputs: name = "Alice", age = 20
# 1. The user is prompted to enter their name and age.
# 2. Input: "Alice" is stored in 'name'.
# 3. Input: "20" is converted to an integer and stored in 'age'.
# 4. The condition `age >= 18` is checked.
#    - Since 20 is greater than or equal to 18, this condition is True.
# 5. The message "Alice is eligible to vote." is printed.

# Example with different inputs:

# Assume user inputs: name = "Bob", age = 16
# 1. The user is prompted to enter their name and age.
# 2. Input: "Bob" is stored in 'name'.
# 3. Input: "16" is converted to an integer and stored in 'age'.
# 4. The condition `age >= 18` is checked.
#    - Since 16 is less than 18, this condition is False.
# 5. The condition `0 < age < 18` is checked.
#    - Since 16 is between 0 and 18, this condition is True.
# 6. The message "Bob is not eligible to vote." is printed.

# Assume user inputs: name = "Charlie", age = -1
# 1. The user is prompted to enter their name and age.
# 2. Input: "Charlie" is stored in 'name'.
# 3. Input: "-1" is converted to an integer and stored in 'age'.
# 4. The condition `age >= 18` is checked.
#    - Since -1 is less than 18, this condition is False.
# 5. The condition `0 < age < 18` is checked.
#    - Since -1 is not between 0 and 18, this condition is False.
# 6. The `else` block executes, printing "Charlie is not born yet. Please provide your correct age."
