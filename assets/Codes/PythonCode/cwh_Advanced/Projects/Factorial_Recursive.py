def factorial(n):

    if(n == 1 or n == 0):
        return 1

    else:
        return n * factorial(n-1)

while True:
    
    try:
        num = int(input("Enter the Number to find its factorial: "))
        res = factorial(num)
        
        print("\nThe Factorial of " , num , "is: " , res)
    
    except: 
        print("\nWrong Input given, Please Enter a Number\n---------------------------------------------\n\n")
