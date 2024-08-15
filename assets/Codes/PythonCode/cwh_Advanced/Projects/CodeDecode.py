import random

def ReverseStr(s):
    val = ""
    # Iterate over the string in reverse order
    for i in range(len(s) - 1, -1, -1):
        val = val + s[i]
    return val

def RandomWords(length):
    words = ""
    # Generate a random string of lowercase letters of given length
    for _ in range(length):
        words = words + chr(random.randint(97, 122))  # ASCII values for 'a' to 'z'
    return words

def Code():
    # Function to encode a message
    word = input("\n------------------------------\nEnter Your Message: ")
    
    if len(word) >= 3:
        last = word[0]
        # Rotate the first character to the end
        word = word[1:] + last
        
        # Add random characters to both ends
        word = RandomWords(3) + word + RandomWords(3)
        
        print("The Encrypted Code Word: ", word)
    
    else:
        # If message is too short, just reverse it
        print("The Encrypted Code Word Was: ", ReverseStr(word))

def Decode():
    # Function to decode a message
    word = input("\n------------------------------\nEnter The Encrypted Message To decode: ")
    
    if len(word) > 9:
        # Remove the random characters from both ends
        word = word[3:len(word) - 3]
        
        # Rotate the last character to the front
        first = word[-1]
        word = first + word[:-1]
        
        print("The Decode Message Was: ", word)
    
    else:
        # If message is too short, just reverse it
        print("The Decode Message Was: ", ReverseStr(word))

while True:
    # Main loop to choose between coding or decoding
    a = input("Hello, Welcome to Secret code coder and Decoder\nDo you want to code a msg or Decode a msg. Enter 1 for code and 0 for Decode: ")

    try: 
        a = int(a)
    
    except: 
        print("Invalid Input, please enter 1 or 0\n--------------------------------------------------\n\n")
        continue

    # Call Code() if 1, Decode() if 0, otherwise show an error message
    Code() if a == 1 else Decode() if a == 0 else print("Enter Either 1 or 0\n------------------------------\n")
    
# Dry Run:
# 1. **User Input:**
#    - Prompt user to choose encoding (1) or decoding (0).
#    - Convert user input to integer and handle invalid inputs.

# 2. **Encoding (Code()):**
#    - If the message length is 3 or more:
#        - Rotate the first character to the end.
#        - Append and prepend 3 random characters.
#    - If the message is shorter than 3 characters:
#        - Reverse the string.

# 3. **Decoding (Decode()):**
#    - If the message length is greater than 9:
#        - Remove the 3 random characters from both ends.
#        - Rotate the last character to the front.
#    - If the message is 9 characters or fewer:
#        - Reverse the string.

# 4. **Repeat:**
#    - The process repeats based on user input until the program is manually stopped.
