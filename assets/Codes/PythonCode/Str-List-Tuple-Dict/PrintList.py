list = []  # Initializes an empty list named 'list'.

while True:  # Starts an infinite loop to repeatedly ask for user input.
    Item = input("Enter the Elements or Enter 0 to End: ")  # Prompts the user to enter an item or '0' to end input.
    list.append(Item)  # Appends the input item to the 'list'.
    
    if Item == "0":  # Checks if the input is '0' to terminate the loop.
        break  # Exits the loop if the input is '0'.
    
print(list)  # Prints the final list after exiting the loop.

# Dry Run:
# Assume the user enters the following inputs:

# Input 1: apple
# Input 2: banana
# Input 3: cherry
# Input 4: 0

# Execution steps:
# 1. User enters 'apple'. The list now: ['apple']
# 2. User enters 'banana'. The list now: ['apple', 'banana']
# 3. User enters 'cherry'. The list now: ['apple', 'banana', 'cherry']
# 4. User enters '0', which triggers the condition to break the loop.

# Final Output:
# ['apple', 'banana', 'cherry']
