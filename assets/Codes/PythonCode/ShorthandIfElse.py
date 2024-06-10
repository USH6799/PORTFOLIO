num = 4 # A variable 'num' storing 4

if num < 5: # if checking the number is smaller than 5 or not.

    print("number is less than 5")
    
else: # if the above condition becomes false then these code will run. 
    print("Number is more than 5 or equal to 5")


# Now Can we write this if else code in one line:

# Syntax for shorthand if else:

# <If block code> if <condition> else <else block code>

print("Number is less than 5") if num < 5 else print("Number is not less than 5")

# it is more simple and related to real life reading.

# Syntax for if elif else:

# <if code block> if <condition1> else <elif code block> if <condition2> else <else code block.>

print("Number is less than 5") if num < 5 else print("number is equal to 5") if num == 5 else print("number is more than 5")

# else code is compulsory to write.

# it is good for single line of code inside conditon but not good for many line of code.