year = int(input("Enter a year: ")) # Here the input from the user is stored in var 'year'.

# A century is defined as 100 years, and a leap year is every 4 years, except for every 100 years, except for every 400 years.

if year % 4 == 0 and year % 100 != 0 or year % 400 == 0: # checking whether the year is leap or not, if it is leap then if block will run.
    
    print(f"{year} is a leap year.") # prints that year is a leap year.
    
    # used f to print the value of year in string format.

else: # if year is not leap then else block will run.
    
    print(f"{year} is not a leap year.") # prints that year is not a leap year.