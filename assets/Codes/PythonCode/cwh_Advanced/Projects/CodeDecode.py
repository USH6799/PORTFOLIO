import random
    
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

def Code():
    word = input("\n------------------------------\nEnter Your Message: ")
    
    if(len(word) >= 3):
        last = word[0]
        
        word = word[1:] + last
        
        word = RandomWords(3) + word + RandomWords(3)
        
        print("The Encrypted Code Word: " , word)
    
    else:
        print("The Encrypted Code Word Was: " , ReverseStr(word))

def Decode():
    word = input("\n------------------------------\nEnter The Encrypted Message To decode: ")
    
    
    if len(word) > 9:
        word = word[3 : len(word) - 3]
        first = word[len(word) - 1]
        word =  first + word[0 : len(word) - 1]
        print("The Decode Message Was: " , word)
    
    else:
        word = ReverseStr(word)
        print("The Decode Message Was: " , word)
        
while True:
    a = input("Hello, Welcome to Secret code coder and Decoder\nDo you want to code a msg or Decode a msg. Enter 1 for code and 0 for Decode: ")

    try: 
        a = int(a)
    
    except: 
        print("Invalid Input, please enter 1 or 0\n--------------------------------------------------\n\n")
        continue

    Code() if a==1 else Decode() if a==0 else print("Enter Either 1 or 0\n------------------------------\n")
    
    