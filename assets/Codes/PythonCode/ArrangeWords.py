str = input("Enter any string: ") # Here the input from the user is stored in var 'str'.

group = []

group = str.split() # Here, the value of var 'group' is splitting the string.

for word in group:
    upperStr = "" 
    lowerStr = ""
    
    for letter in word: # Here, the value of var 'letter' is less than the length of the string and it gives the output as True and the for loop is executed.
        
        if letter.islower(): # Checking whether the letter is uppercase or not, if it is uppercase then if block will run.
            
            lowerStr = lowerStr + letter # Here, the value of var 'lowerStr' is adding the value of var 'letter'.
            
        else:
            upperStr = upperStr + letter # Here, the value of var 'upperStr' is adding the value of var 'letter'.
            
    print(lowerStr + upperStr , end = " ") # prints the value of var 'lowerStr' which contains only lowercase letters and value of var 'upperStr' which contains only uppercase letters.