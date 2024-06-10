# ----------------------------------------------------------
# 6. TYPE CONVERSION
# ----------------------------------------------------------

# Type Casting Or Type Conversion:- Means changing the datatype of any variable to different datatypes

# ----------------------------------------------------------
# To type cast from any datatype to integer datatype we use:
        # int(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to string datatype we use:
        # str(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to boolean datatype we use:
        # bool(value)
# ----------------------------------------------------------


# ----------------------------------------------------------
# To type cast from any datatype to float datatype we use:
        # float(value)
# ----------------------------------------------------------


# Example:

a = "24" # Here the value of var 'a' is "24" of string datatype. You can check the datatype using type(x) function.

print(type(a)) # This will show that the datatype of var 'a' is string.

a = int(a) # Converting the value of var 'a' of string datatype to integer datatype using int(value), type conversion. It will show an error if conversion is not possible like if it contains non-integral values or anything else.

# Storing the converted integer datatype value in var 'a' as its new value.

# Checking the datatype of var 'a' using type(x) function.

print(type(a)) # This will show that the datatype of var 'a' is integer.