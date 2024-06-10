num = int(input("Enter a number: ")) # Asking the user to enter a number and storing it in var 'num'.

if(num % 2 == 0): # checking whether the number is even or odd, if it is even then if block will run.
    
    print(f"{num} is an Even number.") # prints that num is an Even number.
    
    # used f to print the value of num in string format.

else: # if num is odd then else block will run.
    
    print(num , " is an Odd number.") # prints that num is an Odd number.