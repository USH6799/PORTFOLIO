# ----------------------------------------------------------
# 8. GENERAL TERMS
# ----------------------------------------------------------


# ----------------------------------------------------------
# ESCAPE SEQUENCES:

# Escape sequences are used to add special characters in the string. Like, \n -> new line, \t -> tab space(4 spaces), \b -> backspace, \r -> carriage return,\b -> backspace etc.

# Like, I want to Print("Hello friend. I am a coder"), here i want th part after full stop goes to next line.

print("Hello friend") # Using print() fnc to print the first part of String.
print("I am a coder") # Using print() fnc to print the Second part of String.

# Instead of Using 2 print() statements like above, we can use 1 print() statement like this:

print("Hello friend,\nI am a coder") # Now we can use \n to add new line and move the right side text of /n to next line. The Output will be same but the code will become Shorter which means code becomes Better.


# ----------------------------------------------------------
# RAW STRINGS:

# like, running this code,

print("Use \n to move to the next line") # It will print: Use   
#                                                         to move to the next line

# beacuse it is the escape sequence which is used to add a line, but here we dont want to use it , we just want to display it as output.

print(r"Use \n to move to the next line") # the 'r' letter before the String converts the String into a raw string.

# It will Print: Use \n to move to the next line


# ----------------------------------------------------------
# FORMATTED STRINGS 

# means, Strings with placeholders. Like,

name = 'dhdk' # Here the value of var 'name' is "dhdk" of string datatype.
age = 17 # Here the value of var 'age' is 17 of integer datatype.

print(f"Hello! My name is {name} and I am {age} years old.") # The above code will print "Hello! My name is dhdk and I am 17 years old."

# U can write variables inside the String part using {} braces and a variable name inside them.