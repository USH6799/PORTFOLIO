print("Welcome to the Bubble Sort")  # Prints a welcome message to the user.
print()  # Prints a blank line for better readability.

numbers = []  # Initializes an empty list named 'numbers' to store the user inputs.

while True:  # Starts an infinite loop to repeatedly ask for user input.
    num = input("Enter The number or q to sort: ")  # Prompts the user to enter a number or 'q' to sort the list.

    try:
        num = int(num)  # Tries to convert the input to an integer.
        numbers.append(num)  # If successful, appends the number to the 'numbers' list.
    except:
        # If conversion to integer fails (i.e., the input is not a number),
        # it checks if the input is 'q' to proceed with sorting.
        if num == "q":
            print("You Want to sort It in Ascending order Or Descending Order")  # Asks user for sorting preference.
            option = input("Enter a For Ascending Order\nEnter z For Descending Order: ")  # Prompts for sorting order preference.
            if option == "a":
                numbers.sort(reverse=False)  # Sorts the list in ascending order.
                print(numbers)  # Prints the sorted list.
                break  # Exits the loop after sorting.
            elif option == "z":
                numbers.sort(reverse=True)  # Sorts the list in descending order.
                print(numbers)  # Prints the sorted list.
                break  # Exits the loop after sorting.
            else:
                print("Wrong input")  # Handles invalid sorting order input.
                continue  # Continues the loop to ask for sorting order again.
        else:
            print("Wrong Input")  # Handles invalid non-numeric input.
            continue  # Continues the loop to ask for input again.

# Dry Run:
# Assume the user enters the following inputs:

# Input 1: 5
# Input 2: 3
# Input 3: 8
# Input 4: q
# User then chooses sorting order:
# Input 5: a

# Execution steps:
# 1. User enters 5, which is added to the 'numbers' list. List now: [5]
# 2. User enters 3, which is added to the 'numbers' list. List now: [5, 3]
# 3. User enters 8, which is added to the 'numbers' list. List now: [5, 3, 8]
# 4. User enters 'q', indicating they want to sort the list.
# 5. User chooses 'a' for ascending order.
# 6. The list is sorted in ascending order: [3, 5, 8]
# 7. The sorted list is printed, and the loop is exited.

# Final Output:
# Welcome to the Bubble Sort
#
# (user input and sorting actions occur)
#
# [3, 5, 8]  # Sorted list printed in ascending order.
