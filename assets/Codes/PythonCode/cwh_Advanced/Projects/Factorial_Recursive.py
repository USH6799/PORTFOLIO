def factorial(n):
    # Recursive function to calculate the factorial of n

    if n == 1 or n == 0:
        # Base case: factorial of 0 and 1 is 1
        return 1
    else:
        # Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1)

while True:
    try:
        # Prompt the user to enter a number
        num = int(input("Enter the Number to find its factorial: "))
        
        # Calculate the factorial of the entered number
        res = factorial(num)
        
        # Print the result
        print("\nThe Factorial of", num, "is:", res)
    
    except:
        # Handle any errors (e.g., if the input is not a number)
        print("\nWrong Input given, Please Enter a Number\n---------------------------------------------\n\n")

# Dry Run:
# 1. **Function Definition:**
#    - `factorial(n)`: Defines a recursive function to compute the factorial of `n`.
#    - **Base Case:** If `n` is 0 or 1, return 1.
#    - **Recursive Case:** If `n` is greater than 1, return `n * factorial(n - 1)`.

# 2. **User Input:**
#    - `num = int(input("Enter the Number to find its factorial: "))`: Prompts the user to enter a number and converts it to an integer.

# 3. **Factorial Calculation:**
#    - `res = factorial(num)`: Calls the `factorial` function with `num` to compute the factorial and stores the result in `res`.

# 4. **Output Result:**
#    - `print("\nThe Factorial of", num, "is:", res)`: Prints the factorial result.

# 5. **Exception Handling:**
#    - `except:`: Catches any errors (such as invalid input) and prints an error message prompting the user to enter a valid number.
