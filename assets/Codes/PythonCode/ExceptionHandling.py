# Now lest's see how to handle errors and exceptions,

# Like lets ask a number from user,

num = input("Enter the Number: ") # Asking for the number from the user.

#num = int(num) # Converting the num value from String type to integer datatype.

# Now Imagine our user is smart , and little cracked enetered abcd in this then during conversion it will show the error and the rest of code will also not run due to the error.

# We can use try and except block to stop the termination of program due to errors.

try:
    num = int(num)

except Exception as e:
    print(e)
    print("Wrong Input Given")
    
# if user enter de in input

# OUTPUT:- invalid literal for int() with base 10: 'de'

#          Wrong Input Given

print("Rest of code") # as you can see if you enter correct or wrong still you can see the rest of code running.

# U can the error using Exception in except block and then print it or save it using as to diffrent variable like here Exception is stored in var e.

# U can also check for specific exception like,

l = [2,3,4,5] # this is the simple list having 4 items.

item = int(input("Enter the Index: ")) # asking for the index of specific item.

try: # the try block printing the item from the list using index.
    print(l[item])

except IndexError as e: # if printing will show error in try block than except will run and check whether it is the index Error means the value inputed in more than maximum index in the list.
    print("Error:- " , e)
    print("Wrong index input!") # printing...
    
# As here we check an specific Exception which is IndexError .


# Finally keyword,

# it is used to specify what code should be run after try and except block, like,

a = input("Enter the Number: ")

try: # it will try to type cast from string to integer 
    a = int(a)
    
except: # if type casting is not possible or throws error than except block will run.
    print("Not A number")
    
finally: # after try and except block finally block code will run.
    print("Rest of the code here.")
    
# now a question comes that wtihout finally block also the code can run but if you want to see the diffrence you need to see it in fnc.

def EvenOdd(n):
    try:
        n = int(n)
        if n % 2 == 0:
            return "Even"
        else:
            return "Odd"
    
    except Exception as e:
        return e    
    
    print("Rest of code here inside the fnc") # as you can see this code is unreachable or doesn't execute because in try and except block any one block will run and return the value and closes the fnc
    
print(EvenOdd(4))
# OUTPUT:- Even

print(EvenOdd("hello"))
# OUTPUT:- invalid literal for int() with base 10: 'hello'
    
# But i want that part should run then i will use finally keyword.

def EvenOdd1(n):
    try:
        n = int(n)
        if n % 2 == 0:
            return "Even"
        else:
            return "Odd"
    
    except Exception as e:
        return e    
    
    finally:
        print("Rest of code here inside the fnc")

print(EvenOdd1(4)) 
# OUTPUT:- Even
#          Rest of code here inside the fnc


print(EvenOdd1("GameOver"))
# OUTPUT:- invalid literal for int() with base 10: 'GameOver'
#          Rest of code here inside the fnc

# As you can see in both cases either try or except case , the finally block code will execute also after returning from fnc.


    

