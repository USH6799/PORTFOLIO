n = int(input("Enter the value of n : ")) # Here, the value of var 'n' is taken from user and stored in var 'n'.

a = 0 # Here, the value of var 'a' is 0 and stored in var 'a'.

b = 1 # Here, the value of var 'b' is 1 and stored in var 'b'.

print(a , b , end = " ") # Here, the value of var 'a' and 'b' are printed in the same line. Used end = "" to print next value in same line.

# Used \t to add a tab space between a and b or 4 spaces.

for i in range(1 , n + 1): # Here, the value of var 'i' is less than n and it gives the output as True and the for loop is executed.
    
    c = a + b # Here, the value of var 'c' is added by a and b and stored in var 'c'.

    print(c , end = " ") # Here, the value of var 'c' is printed.

    a = b # Here, the value of var 'a' is added by b and stored in var 'a'.
    
    b = c # Here, the value of var 'b' is added by c and stored in var 'b'.
    
