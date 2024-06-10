# ----------------------------------------------------------
# 5. DATATYPES IN PYTHON
# ----------------------------------------------------------

# Datatype:- Defines which type of value it is (inside the variable). Like,

Integervar = 12 # This is a variable 'Integervar' storing 12 as its value of datatype integer, means the value stored inside this variable is integer or number. It cannot be letters or alphabets.

Stringvar = "12" # This is the variable 'Stringvar' storing "12" as its value of datatype string, means the value stored inside this variable is not integer, it is string or the same value which not changes.

Addvar = 5 # This is the variable 'Addvar' of datatype integer, because it is not surrounded by double quotes and has numbers. Storing 5.

Concatenatevar = "5" # This is the variable 'Concatenatevar' of datatype string, because it is surrounded by double quotes and has value inside it. Storing "5".

print(Integervar + Addvar) # This will add the value of var 'Integervar' and 'Addvar' and give the output.

# print(Integervar + Addvar) -> print(12 + 5) -> print(17) --> Output: 17

print(Stringvar + Concatenatevar) # This will concatenate the string value of var 'Stringvar' and the value of var 'Concatenatevar' and show the output.

# print(Stringvar + Concatenatevar) -> print("12" + "5") -> print("125") -> Output: 125, but as a string not a number.

# Concatenation works only in string values where using + operator it attaches both values as a single unit.

# Ex:- In integer, 1 + 1 = 2
# Ex:- In string, "1" + "1" = "11"

# ----------------------------------------------------------
# There are mainly three types of data groups,


# ----------------------------------------------------------
# Numbers datatype:-
#       - Integer (all negative and positive numbers without decimal values are called integers.)
#       - Float (All decimal values are called floats)
#           Remember if you store any calculations like division inside the variable, it is always presented in float datatype. Like,

x = 10 / 5 # Storing the division of 10 and 5 which in reality returns 2 which is integer but it gives output: 2.0 means float datatype.

print(type(x)) # A function 'type(x)' used to check the datatype of variable 'x' and printing it on the terminal window as the output.

#       - Complex (very less used, it can use imaginary numbers or values (iota 'i')).


# ----------------------------------------------------------
# Boolean datatype:-

# This is the simplest datatype mainly used for comparison. It contains only two types of values inside it:

    # True (Means the condition is true, yes, right, working, correct), anything which is true.
    
    # False (Means the condition is false, no, wrong, not working, incorrect), anything which is false.
    
    
# ----------------------------------------------------------
# String datatype:- Any value inside '' single quotes or "" double quotes are string values. In short, string is a datatype which can hold anything: numbers, symbols, special characters, alphabets, everything together, and prints the same.