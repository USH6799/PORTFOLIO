def Square(n): 
    '''A fnc Square taking parameter n and retruning n**2'''
    
    # U have to add the multiline comment just below the fnc to make it the docstring.
    
    return n**2 # returning n**2

a = Square(4) # calling the function with parameter 4 and storing it in a

print(a) # printing the output

# OUTPUT:- 16

# Now the docstring are the info about the fnc in form of comments like,

print(Square.__doc__) # this will print the docstring

# OUTPUT:- A fnc Square taking parameter n and retruning n**2 