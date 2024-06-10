letter = input("Enter The Alphabet: ") # Here the input from the user is stored in var 'letter'.

if letter in "aeiouAEIOU": # checking whether the letter is vowel or not, if it is vowel then if block will run.
    
    # here using 'in' keyword checks whether the letter is present in the string or not.
    
    print("Vowel") # prints 'Vowel'.

else: # if letter is not vowel then else block will run.
    
    print("Consonant") # prints 'Consonant'