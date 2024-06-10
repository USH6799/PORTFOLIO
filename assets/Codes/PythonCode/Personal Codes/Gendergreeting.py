gender = input("What is Your Gender(m for male and f for female): ").lower()
# Asking the user for his/her gender and storing it in var 'gender'.

# lower() fnc is used to convert the input into lower case letters.
# Reason because if the user enters uppercase letter than if the user enters 'm' or 'f' then it will give wrong output.

if(gender == "m"): # checking whether the gender is male or female, if it is male then if block will run.
    
    print("Good Morning Sir") # greets the user with 'Good Morning Sir'.

elif(gender == "f"): # checking whether the gender is male or female, if it is female then elif block will run.
    
    print("Good Morning Ma'am") # greets the user with 'Good Morning Ma'am'.

else: # if gender is neither male nor female then else block will run.
    
    print("Wrong Input") # prints 'Wrong Input'