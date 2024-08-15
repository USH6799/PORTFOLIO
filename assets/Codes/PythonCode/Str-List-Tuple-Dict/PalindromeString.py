str = input("Enter any string: ")  # Here, the input from the user is stored in the variable 'str'.

ReverbStr = ""  # Initializes an empty string 'ReverbStr' to store the reversed version of 'str'.

for letter in str:  # Iterates over each character in the input string 'str'.
    ReverbStr = letter + ReverbStr  # Prepend the current letter to 'ReverbStr', building the reversed string.

if str == ReverbStr:  # Checks if the original string 'str' is equal to the reversed string 'ReverbStr'.
    print("The String is Palindrome.")  # Prints 'The String is Palindrome' if the condition is true.
else:
    print("The String is not Palindrome.")  # Prints 'The String is not Palindrome' if the condition is false.

# Dry Run:
# Assume the user enters the string 'radar'.

# Execution steps:
# 1. User inputs 'radar'.
# 2. Initial values: str = 'radar', ReverbStr = ''
# 3. First iteration: letter = 'r'; ReverbStr = 'r'
# 4. Second iteration: letter = 'a'; ReverbStr = 'ar'
# 5. Third iteration: letter = 'd'; ReverbStr = 'dar'
# 6. Fourth iteration: letter = 'a'; ReverbStr = 'adar'
# 7. Fifth iteration: letter = 'r'; ReverbStr = 'radar'
# 8. Reversed string 'ReverbStr' = 'radar' matches the original string 'str'.
# 9. Since 'radar' == 'radar', the condition is true, so it prints "The String is Palindrome."

# If the user had entered 'hello':
# 1. User inputs 'hello'.
# 2. Initial values: str = 'hello', ReverbStr = ''
# 3. First iteration: letter = 'h'; ReverbStr = 'h'
# 4. Second iteration: letter = 'e'; ReverbStr = 'eh'
# 5. Third iteration: letter = 'l'; ReverbStr = 'leh'
# 6. Fourth iteration: letter = 'l'; ReverbStr = 'lleh'
# 7. Fifth iteration: letter = 'o'; ReverbStr = 'olleh'
# 8. Reversed string 'ReverbStr' = 'olleh' does not match the original string 'str'.
# 9. Since 'hello' != 'olleh', it prints "The String is not Palindrome."
