n1 = input("Enter first number: ")
n2 = input("Enter Second number: ")

oper = input("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication\nEnter / for division\nEnter % for modulus\nEnter ** for power\nEnter // for floor division\nChoose Your Operator From Above: ")

if oper == "+":
    print(f"Sum of {n1} and {n2} is {int(n1) + int(n2)}")
    
elif oper == "-":
    print(f"Subtraction of {n1} and {n2} is {int(n1) - int(n2)}")
    
elif oper == "*":
    print(f"Multiplication of {n1} and {n2} is {int(n1) * int(n2)}")
    
elif oper == "/":
    print(f"Division of {n1} and {n2} is {int(n1) / int(n2)}")
    
elif oper == "%":
    print(f"Modulus of {n1} and {n2} is {int(n1) % int(n2)}")
    
elif oper == "**":
    print(f"Power of {n1} and {n2} is {int(n1) ** int(n2)}")
    
elif oper == "//":
    print(f"Floor Division of {n1} and {n2} is {int(n1) // int(n2)}")
    
else:
    print("Invalid Operator")

