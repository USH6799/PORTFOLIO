def Calc(n1, n2):
    # Prompt the user to choose an operator
    oper = input("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication\nEnter / for division\nEnter % for modulus\nEnter ** for power\nEnter // for floor division\nChoose Your Operator From Above: ")

    # Perform the chosen operation
    if oper == "+":
        print(f"Sum of {n1} and {n2} is {n1 + n2}")

    elif oper == "-":
        print(f"Subtraction of {n1} and {n2} is {n1 - n2}")

    elif oper == "*":
        print(f"Multiplication of {n1} and {n2} is {n1 * n2}")

    elif oper == "/":
        # Ensure no division by zero
        if n2 != 0:
            print(f"Division of {n1} and {n2} is {n1 / n2}")
        else:
            print("Error: Division by zero is not allowed.")

    elif oper == "%":
        # Ensure no division by zero
        if n2 != 0:
            print(f"Modulus of {n1} and {n2} is {n1 % n2}")
        else:
            print("Error: Division by zero is not allowed.")

    elif oper == "**":
        print(f"Power of {n1} and {n2} is {n1 ** n2}")

    elif oper == "//":
        # Ensure no division by zero
        if n2 != 0:
            print(f"Floor Division of {n1} and {n2} is {n1 // n2}")
        else:
            print("Error: Division by zero is not allowed.")

    else:
        print("Invalid Operator")
        
while True:
    try:
        # Take two integer inputs from the user
        num1 = int(input("Enter the First number: "))
        num2 = int(input("Enter the Second number: "))
        
        # Call the Calc function to perform the chosen operation
        Calc(num1, num2)
        
        print("\nNew Calculations Begins\n-----------------------------------\n")

    except ValueError:
        # Handle invalid inputs (non-integer values)
        print("Wrong Input Given, Require Number!")
        print("----------------------------------------")
    

# Dry Run:
# 1. **User Input:**
#    - Prompt user for two numbers.
#    - Prompt user to select an operator (+, -, *, /, %, **, //).

# 2. **Operations:**
#    - If the operator is "+", calculate and print the sum of the numbers.
#    - If the operator is "-", calculate and print the difference of the numbers.
#    - If the operator is "*", calculate and print the product of the numbers.
#    - If the operator is "/", calculate and print the quotient of the numbers if the divisor is not zero.
#    - If the operator is "%", calculate and print the modulus of the numbers if the divisor is not zero.
#    - If the operator is "**", calculate and print the power of the numbers.
#    - If the operator is "//", calculate and print the floor division of the numbers if the divisor is not zero.
#    - If the operator is invalid, print an error message.

# 3. **Error Handling:**
#    - If the user inputs something other than integers for the numbers, handle the exception and prompt for valid input.
