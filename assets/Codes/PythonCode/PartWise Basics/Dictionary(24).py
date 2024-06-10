    
# ----------------------------------------------------------
 # DICTIONARIES
# ----------------------------------------------------------
 
# dictionary in python is a collection of key-value pairs. It is used to store data values in key:value pairs. It is Mutable, ordered, and has no duplicate values , it is iteratable but has some special powers like key and value.

# Syntax:- var = {key:value , key:value , key:value}

# Like List of Toppers with their roll no(key) and name(value)-

topper = {
    1: "Akash" ,
    4: "Abhay" ,
    11: "Ananya",
    34: "nihar" ,
    44: "Rishab"
} # Here, the value of var 'topper' is {1: 'Akash', 4: 'Abhay', 11: 'Ananya', 34: 'nihar', 44: 'Rishab'} , of dictionary datatype.

# Lets check the datatype of var 'dic',

print(type(topper)) # prints the datatype of vartopper'.

# OUTPUT:- <class 'dict'>

print(topper) # Output:- {1: 'Akash', 4: 'Abhay', 11: 'Ananya', 34: 'nihar', 44: 'Rishab'}

# ----------------------------------------------------------
#  ACCESSING ELEMENTS OF DICTIONARY: 

# Syntax:- Dict_var[key]

# We can access elements through keys, like index but in place of index we use keys.

print(topper[1]) # OUTPUT:- {1: "Akash"} 


# ----------------------------------------------------------
 # CHANGING ELEMENTS OF DICTIONARY:

# Syntax:- Dict_var[key] = newVal
 
topper[11] = 'Nidhi' # It changes the keys value by ananya to nidhi.

print(topper) # OUTPUT:- {1: 'Akash', 4: 'Abhay', 11: 'Nidhi', 34: 'nihar', 44: 'Rishab'}

# ----------------------------------------------------------
 # APPENDING NEW KEYS AND VALUES: 
 
 # Syntax:- dictVar[key] = val
 
topper[8] = "Ayush" # Adding a new element with new key and value in the dictionary.

print(topper) # OUTPUT:- {1: 'Akash', 4: 'Abhay', 11: 'Nidhi', 34: 'nihar', 44: 'Rishab' , 8: 'Ayush'}

# Values can be same in two or more keys but keys are always Unique.\

# If you want to merge two or more dictionaries together, then u can use update() fnc.

a = {
    1 : "akash" ,
    2 : "abhay" ,
    3 : 'Ananya' , 
    5 : "USH"
    }

b = {
    4: "Ayush"
}

print(a) # Output:- {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH'}


# ----------------------------------------------------------
# TO Combine a and b together, use update() fnc.

a.update(b) # a = {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH', 4: 'Ayush'} , it adds all key the elements og b into a and also overwrite the same key values.

print(a) # Output:- {1: 'akash', 2: 'abhay', 3: 'Ananya', 5: 'USH', 4: 'Ayush'}


# ----------------------------------------------------------
 # ITERATING OVER DICTIONARIES
 
for i in a.keys(): # Here .keys allows to use it as index of a and access each element one by one.
     
     print(i) # Prints Each element of Dictionary 'a' .  
     
     