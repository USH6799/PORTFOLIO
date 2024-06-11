# Regular Expression helps to find patterns in strings and also make the code more readable.

import re # importing RegularExpression module

pattern = "is" # Pattern to be searched in my string means whereever is is present in my string, it will be printed.

string = """
    Cyclone myclone Dyclone FlyClone RYnclone enclone is in my foot is in my leg is in my wind, a windstorm coming in my village, a cyclone coming in my house. 
""" 

# here i used """ content """ String to contain many lines of word without any error.

# Lets search for the pattern in this text.

match = re.search(pattern , string) # calling RegularExpression function with pattern and string as arguments.

print(match) # printing the result if the pattern is present in the string it returns the address of the pattern inside the string.

# OUTPUT:- <re.Match object; span=(55, 57), match='is'>

# Now i want all the clones starting with capital letters, instead of thinking and creating big logics to find them, i can use regular expression.

ptn = "[A-Z]yclone" # this is the pattern to be searched where the first letter of the word is capital and can be any alphabet. and the word is 'yclone'

str = "Cyclone myclone Dyclone Flyclone Rynclone enyclone Weyclone Myclone gyclone"

# Lets search for the pattern in this text.

match = re.search(ptn , str) # calling RegularExpression function with pattern and string as arguments.

print(match) # printing the result if the pattern is present in the string it returns the address of the pattern inside the string.

# OUTPUT:- <re.Match object; span=(0, 9), match='Cyclone'>

# As you saw it returns the first match only.

match = re.finditer(ptn , str) # Calling the finditer function with pattern and string as arguments and finditer returns the all the matches in form of object.

for m in match: # printing the result if the pattern is present in the string it returns the address of the pattern inside the string.

    print(m) # prints the result if the pattern is present in the string it returns the address of the pattern inside the string.

    # OUTPUT:- <re.Match object; span=(0, 9), match='Cyclone'>
    #          <re.Match object; span=(20, 29), match='Dyclone'>
    #          <re.Match object; span=(66, 74), match='Myclone'>

