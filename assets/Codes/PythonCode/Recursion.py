# Recursion means recalling a function inside the fnc until base case is matched then return back, like Factorial of any number.

# Ex:- 6!

# !6 = 6 X 5 X 4 X 3 X 2 X 1

# U can say !5 = 5 X 4 X 3 X 2 X 1

# also, !4 = 4 X 3 X 2 X 1

# also, !3 = 3 X 2 X 1

# also, !2 = 2 X 1

# also, !1 = 1

# Placing each values.

# !6 = 6 X !5

# !5 = 5 X !4

# !4 = 4 X !3

# !3 = 3 X !2

# !2 = 2 X !1

# You can derive a formula that n! = n X (n-1)!

# Now lets create it using recursion methods.

n = int(input("Enter a number: ")) # Taking input from the user.

def factorial(n): # Defining the factorial fnc.
    
    if(n == 1 or n == 0): # Base case.
        
        return 1 # Returning 1.
    
    return n * factorial(n-1) # Returning n * (n-1)!

a = factorial(n) # Calling the factorial fnc.

print(a) # Printing the output.

# Now recursion backend, Dry run:-

# let n = 5

# Then inside the fnc factorial(n):

# Inside Factorial(5) fnc:
    # checks the base case.(False)
    # returns 5 * Factorial(4)
    
    # Inside Factorial(4) fnc:
        # checks the base case.(False)
        # returns 4 * Factorial(3)
        
        # Inside Factorial(3) fnc:
            # checks the base case.(False)
            # returns 3 * Factorial(2)
            
            # Inside Factorial(2) fnc:
                # checks the base case.(False)
                # returns 2 * Factorial(1)
                
                # Inside Factorial(1) fnc:
                    # checks the base case.(True)
                    # returns 1
                    
                    # It returns 1 to the previous fnc Factorial(2)
                    
                
                # It returns 2 * 1 to the previous fnc Factorial(3)
                
            # It returns 3 * 2 * 1 to the previous fnc Factorial(4)
            
        # It returns 4 * 3 * 2 * 1 to the previous fnc Factorial(5)
        
    # It returns 5 * 4 * 3 * 2 * 1 to the previous fnc Factorial(6)

# At last the fnc returns 120 to the caller(a)

# OUTPUT:- 120
