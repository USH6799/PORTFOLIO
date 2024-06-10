import random

a = input("Hello, Welcome to Secret code coder and Decoder\nDo you want to code a msg or Decode a msg. Enter 1 for code and 0 for Decode: ")

try: 
    a = int(a)
    
except: 
    print("Invalid Input Enter 1 or 0")
    
def ReverseStr(str):
    val = ""
    for i in range(len(str) - 1 , -1 , -1):
        val = val + str[i]
        
    return val

def RandomWords(len):
    words = ""

    for i in range(1 , len + 1):
        words = words + chr(random.randint(97 , 123))

    return words

if a == 1:
    word = input("Enter Your Message: ")
    
    if(len(word) >= 3):
        last = word[0]
        
        word = word[1:] + last
        
        word = RandomWords(3) + word + RandomWords(3)
        
        print("The Encrypted Code Word: " , word)
    
    else:
        print("The Encrypted Code Word Was: " , ReverseStr(word))
    
elif a == 0:
    word = input("Enter The Encrypted Message To decode: ")
    
    
    if len(word) >= 3:
        word = word[3 : len(word) - 3]
        first = word[len(word) - 1]
        word =  first + word[0 : len(word) - 1]
        print("The Decode Message Was: " , word)
    else:
        ReverseStr(word)
        print("The Decode Message Was: " , word)
        

    
    