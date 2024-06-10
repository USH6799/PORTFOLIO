# wlarus operator is a new feature introduced in python 3.8. It is used to assign the value of a variable within a expression.

# this can be useful when you want values used several times inside a loop.

# syntax:- variable := expression

# lets see the use of walrus operator.

cond = True # cond is the variable and True is the value, of datatype boolean.

# print(cond = false) 

# if i want to change the value of variable with the print fnc then it will give error.

# comment out above print() fnc to see the error and comment it out again to see the output and make the program working without error.

# Now lets use walrus operator,

print(cond := False) # cond is the variable and False is the value, of datatype boolean.

# OUTPUT:- False

# here as we use the walrus operator, it divides the expression into two parts, intialization of variable and the Expression or condition.

# here as we write cond := False, it will assign the value of False to the variable.

# print(cond := False)

# Divides it as cond = False , and then print(cond)


# the walrus operator can also be used to create a variable with a value of a expression.

print(check := True)

# OUTPUT:- True

# as you saw i created a new variable then initialized it with True and finally at last expression continues and runs the print statement.


# lets know how to use walrus operator in while loop. 

list = [3,5,6,7,2] # list is the variable and [] is the value, of datatype list.

while(item:=len(list)) > 0: # item is the variable and len(list) is the expression.
    # a conditional statement saying if item is greater than 0 then do the following.
    
    print(list.pop()) # removing the last item of the list and printing it also.
    
# in this while loop we use walrus operator to store the length of the list in variable 'item', and then checks the condition.

# And if condition is Justified, then prints and removes the last item of the list.

# OUTPUT:- 3
#          5
#          6
#          7
#          2    

# and as the list empties, it breaks out of the loop.


# Now lets take another Example, What foods do you like?

basket = [] # basket is the variable and [] is the value, of datatype list.

while True:
    food = input("What food do you like: ") # food is the variable and input("What food do you like: ") is the expression.
    
    # Taking input from user and storing it in food variable.
    
    if food == "quit": # if food is equal to 'quit' then break out of the loop.
        break # break out of the loop.
    
    else: # if food is not equal to 'quit' then
        
        basket.append(food) # appending the food in the basket list.

print(basket) # printing the basket list.


# this is the normal life of coder without walrus in Python.

# Now lets use walrus operator here,

foods = [] # foods is the variable and [] is the value, of datatype list.

while (food := input("What food do you like: ")) != "quit": # food is the variable and input("What food do you like: ") is the expression.
    
    foods.append(food) # appending the food in the foods list.
    
print(foods) # printing the foods list.


# (food := input("What food do you like: ")) != "quit"

# Yes this is the above expression lets understand it in deep and breakdown.

# Firstly intialization of variables then expression,

# here variable food is intialized as input("What food do you like: ") and storing the input in var food each time the loop runs.

# Secondly, checking the Expression:

# if the value of var food is not equal to 'quit' then loops runs , and if the value of var food is equal to 'quit' then loop breaks.

# Isn't it easy to breakdown and learn the logic of walrus operator.

# it can make the code more readable and short but too much using of walrus operator can make the code hard to read and decrease the readability.

# So i prefer try to implement it but not forcefully.