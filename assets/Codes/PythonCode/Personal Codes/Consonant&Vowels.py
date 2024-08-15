letter = input("Enter The Alphabet: ") # Here the input from the user is stored in variable 'letter'.

if letter in "aeiouAEIOU": # Checking whether the letter is a vowel.
    
    # The 'in' keyword checks if 'letter' is present in the string "aeiouAEIOU" (which includes both lowercase and uppercase vowels).
    
    print("Vowel") # If 'letter' is found in the string, print "Vowel".

else: # If 'letter' is not a vowel.
    
    print("Consonant") # If 'letter' is not found in the string, print "Consonant".

# Dry Run:

# Example 1:
# Assume user inputs: letter = 'a'
# 1. The input 'a' is stored in 'letter'.
# 2. The condition 'a in "aeiouAEIOU"' evaluates to True because 'a' is in the string of vowels.
# 3. "Vowel" is printed.

# Example 2:
# Assume user inputs: letter = 'b'
# 1. The input 'b' is stored in 'letter'.
# 2. The condition 'b in "aeiouAEIOU"' evaluates to False because 'b' is not in the string of vowels.
# 3. "Consonant" is printed.
