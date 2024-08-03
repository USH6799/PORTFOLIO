def Calc(n1 , n2):

    oper = input("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication\nEnter / for    division\nEnter % for modulus\nEnter ** for power\nEnter // for floor division\nChoose Your Operator From  Above: ")


    if oper == "+":
        print(f"Sum of {n1} and {n2} is {n1 + n2}")

    elif oper == "-":
        print(f"Subtraction of {n1} and {n2} is {n1 - n2}")

    elif oper == "*":
        print(f"Multiplication of {n1} and {n2} is {n1 * n2}")

    elif oper == "/":
        print(f"Division of {n1} and {n2} is {n1 / n2}")

    elif oper == "%":
        print(f"Modulus of {n1} and {n2} is {n1 % n2}")

    elif oper == "**":
        print(f"Power of {n1} and {n2} is {n1 ** n2}")

    elif oper == "//":
        print(f"Floor Division of {n1} and {n2} is {n1 // n2}")

    else:
        print("Invalid Operator")
        
while True:
    try:
        num1 = int(input("Enter the First number: "))
        num2 = int(input("Enter the Second number: "))
        Calc(num1 , num2)
        print("\nNew Calculations Begins\n-----------------------------------\n")
        continue

    except:
        print("Wrong Input Given, Require Number!")
        print("----------------------------------------")
    

