# Question was to create a function that reverses the string `s` and returns it,
# but the string is in array type where characters of the string are the parts of the array.

# Input: s = ['h', 'e', 'l', 'l', 'o']
# Output: ['o', 'l', 'l', 'e', 'h']

# Taking input from the user
str = input("Enter the String: ") # Example input: "hello"

arr = [] # Initialize an empty list to store characters

# Convert the input string into a list of characters
for char in str:
    arr.append(char) # Append each character to the list arr

newarr = [] # Initialize an empty list to store the reversed characters

# Iterate over the list arr in reverse order
for i in range(len(arr) - 1, -1, -1):
    newarr.append(arr[i]) # Append characters from the end of arr to newarr

print("The Reversed Array is: ", newarr) # Print the reversed list

# Dry Run:

# Input: str = "hello"

# After the first loop:
# arr = ['h', 'e', 'l', 'l', 'o']

# After the second loop (reverse):
# newarr = ['o', 'l', 'l', 'e', 'h']

# Output:
# The Reversed Array is: ['o', 'l', 'l', 'e', 'h']
