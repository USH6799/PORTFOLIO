# if you want to throw yourown custom error at any point of code then u can use raise keyword like lets ask user to enter a number btw 1 to 9

num = input("Enter the Number btw 1 to 9: ")

try:
    num = int(num)
    
except: 
    print("Not a Integer")
    exit()
    
if (0 < num < 10): # type: ignore added type ignore so that it doesn't show error because according to python still is the input is string and cannot perform operations on string.
    
    print("Number: " , num)
    
else:
    raise ValueError("not A valid value , number should be btw 1 to 9") # this is will raise a custom error if the number is not btw 1 to 9.

# that's all