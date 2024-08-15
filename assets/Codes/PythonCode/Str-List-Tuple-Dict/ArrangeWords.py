str = input("Enter any string: ") # Here, the input from the user is stored in variable 'str'.

group = []  # Initialize an empty list 'group'.

group = str.split()  # Split the input string into words using whitespace as the delimiter and store the resulting list of words in 'group'.

for word in group:  # Iterate through each word in the 'group' list.
    upperStr = ""  # Initialize an empty string to store uppercase letters found in the current word.
    lowerStr = ""  # Initialize an empty string to store lowercase letters found in the current word.
    
    for letter in word:  # Iterate through each letter in the current word.
        
        if letter.islower():  # Check if the letter is a lowercase letter.
            
            lowerStr = lowerStr + letter  # If it is lowercase, append the letter to 'lowerStr'.
            
        else:
            upperStr = upperStr + letter  # If it is not lowercase (i.e., it is uppercase), append the letter to 'upperStr'.
            
    print(lowerStr + upperStr, end = " ")  # Print the concatenation of 'lowerStr' and 'upperStr' for the current word. 'end = " "' ensures that words are printed on the same line separated by a space.

# Dry Run

# Example Input: "Hello World"

# Step-by-Step Execution:

# 1. Splitting Input
#   - Input string: "Hello World"
#   - Split into: ['Hello', 'World']

# 2. Processing Each Word:

# Processing 'Hello':
#   - Initialize `upperStr = ""`, `lowerStr = ""`
#   - Iteration:
#     - 'H' (uppercase): `upperStr = "H"`
#     - 'e' (lowercase): `lowerStr = "e"`
#     - 'l' (lowercase): `lowerStr = "el"`
#     - 'l' (lowercase): `lowerStr = "ell"`
#     - 'o' (lowercase): `lowerStr = "ello"`
#   - After processing 'Hello': `lowerStr = "ello"`, `upperStr = "H"`
#   - Output for 'Hello': "elloH"

# Processing 'World':
#   - Initialize `upperStr = ""`, `lowerStr = ""`
#   - Iteration:
#     - 'W' (uppercase): `upperStr = "W"`
#     - 'o' (lowercase): `lowerStr = "o"`
#     - 'r' (lowercase): `lowerStr = "or"`
#     - 'l' (lowercase): `lowerStr = "orl"`
#     - 'd' (lowercase): `lowerStr = "orld"`
#   - After processing 'World': `lowerStr = "orld"`, `upperStr = "W"`
#   - Output for 'World': "orldW"

# Final Output: "elloH orldW"
