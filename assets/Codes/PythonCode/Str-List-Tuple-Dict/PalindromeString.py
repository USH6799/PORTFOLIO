str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

ReverbStr = "" # Here, a variable is created to store the reversed string.

for letter in str: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
    
    ReverbStr = letter + ReverbStr # Here, the value of var 'ReverbStr' is adding the value of var 'letter'.

if str == ReverbStr: # checking whether the string is palindrome or not, if it is palindrome then if block will run.
    
    print("The String is Palindrome.") # prints 'The String is Palindrome'.

else:
    
    print("The String is not Palindrome.") # prints 'The String is not Palindrome.'