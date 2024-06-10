str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

vowel = 0 # Here, a variable is created to store the number of vowels in the string.

consonant = 0 # Here, a variable is created to store the number of consonants in the string.

for letter in str: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    if letter in "aeiouAEIOU": # checking whether the letter is vowel or not, if it is vowel then if block will run.
        
        vowel = vowel + 1 # Here, the value of var 'vowel' is adding 1.
        
    else:
        consonant = consonant + 1 # Here, the value of var 'consonant' is adding 1.
        
    
print(f"The number of vowels in the string \"{str}\" is {vowel} & the number of consonants is {consonant}.") # prints the number of vowels and consonants.

# OUTPUT:- The number of vowels in the string "Hello World" is 3 & the number of consonants is 5.