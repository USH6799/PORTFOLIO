num1 = int(input("Enter Your 1st Number: ")) # Asking the 1st number from user and Storing it in var 'num1'.

# Used int to convert the input from string datatype to Integer.

num2 = int(input("Enter Your 2nd Number: ")) # Asking the 2nd number from user and Storing it in var 'num2'.

# Used int to convert the input from string datatype to Integer.

if(num1 < num2): # checking whether the 1st number 'num1' is smaller than 2nd number 'num2', if it is smaller then if code block will run.
    
    print(f"{num2} is Greater than {num1}") # prints that num2 is greater than num1
    
elif(num1 > num2): # if num1 is greater than num2 then elif code block will run.
    
    print(f"{num1} is Greater than {num2}") # prints that num1 is greater than num2
    
else: # if num1 is equal to num2 then else code will run,

    print(f"{num1} is Equal to {num2}") # prints that both numbers are equal.


    