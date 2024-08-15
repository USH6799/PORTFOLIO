str = input("Enter any string: ")  # Here the input from the user is stored in var 'str'.

vowel = 0  # Here, a variable is created to store the number of vowels in the string.

consonant = 0  # Here, a variable is created to store the number of consonants in the string.

numerical = 0  # Here, a variable is created to store the number of numerical digits in the string.

special_char = 0  # Here, a variable is created to store the number of special characters in the string.

for letter in str:  # Iterates over each character in the string.
    
    if letter in "aeiouAEIOU":  # Checks if the letter is a vowel.
        
        vowel = vowel + 1  # If it is a vowel, increment the vowel counter by 1.
        
    elif letter.isalpha():  # Checks if the letter is an alphabetic character but not a vowel (i.e., consonant).
        consonant = consonant + 1  # If it is a consonant, increment the consonant counter by 1.
        
    elif letter.isnumeric():  # Checks if the letter is a numeric digit.
        numerical = numerical + 1  # If it is a numeric digit, increment the numerical counter by 1.
        
    else:  # If the character is neither a vowel, consonant, nor a numeric digit.
        special_char = special_char + 1  # Increment the special character counter by 1.
        
    
print(f"The number of vowels in \"{str}\" is {vowel} \nThe number of consonants in \"{str}\" is {consonant} \nNumber of Numerical Values in \"{str}\" were: {numerical} \nNumber of Special Characters in \"{str}\" were: {special_char}")  # Prints the counts of vowels, consonants, numerical digits, and special characters.

# Dry Run:
# Let's take the input string as "Hello World 123!".

# Initialization:
# str = "Hello World 123!"
# vowel = 0
# consonant = 0
# numerical = 0
# special_char = 0

# Iteration:
# 1. letter = 'H'
#    'H' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 1

# 2. letter = 'e'
#    'e' is a vowel, so vowel = vowel + 1 -> vowel = 1

# 3. letter = 'l'
#    'l' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 2

# 4. letter = 'l'
#    'l' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 3

# 5. letter = 'o'
#    'o' is a vowel, so vowel = vowel + 1 -> vowel = 2

# 6. letter = ' '
#    ' ' (space) is neither a vowel, consonant, nor a numeric digit, so special_char = special_char + 1 -> special_char = 1

# 7. letter = 'W'
#    'W' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 4

# 8. letter = 'o'
#    'o' is a vowel, so vowel = vowel + 1 -> vowel = 3

# 9. letter = 'r'
#    'r' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 5

# 10. letter = 'l'
#     'l' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 6

# 11. letter = 'd'
#     'd' is not a vowel, but it is an alphabetic character, so consonant = consonant + 1 -> consonant = 7

# 12. letter = ' '
#     ' ' (space) is neither a vowel, consonant, nor a numeric digit, so special_char = special_char + 1 -> special_char = 2

# 13. letter = '1'
#     '1' is a numeric digit, so numerical = numerical + 1 -> numerical = 1

# 14. letter = '2'
#     '2' is a numeric digit, so numerical = numerical + 1 -> numerical = 2

# 15. letter = '3'
#     '3' is a numeric digit, so numerical = numerical + 1 -> numerical = 3

# 16. letter = '!'
#     '!' is neither a vowel, consonant, nor a numeric digit, so special_char = special_char + 1 -> special_char = 3

# End of Iteration:
# vowel = 3
# consonant = 7
# numerical = 3
# special_char = 3

# Output:
# The number of vowels in "Hello World 123!" is 3 
# The number of consonants in "Hello World 123!" is 7 
# Number of Numerical Values in "Hello World 123!" were: 3 
# Number of Special Characters in "Hello World 123!" were: 3
