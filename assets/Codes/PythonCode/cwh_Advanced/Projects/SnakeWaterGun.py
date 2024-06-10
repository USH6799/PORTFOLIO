import random


name = input("What is Your Name?\n My Name is ")

def Comppick():
    pick = random.choice(["Snake", "Water", "Gun"])
    
    return pick;


def Result(set):
    
    if(set == [1 , "Snake"]):
        
        print("Draw")
        
        
    elif (set == [1 , "Water"]):
        
        print(f"{name} Win")
        
        
    elif (set == [1 , "Gun"]):
        
        print(f"{name} Loose")
        
    elif (set == [2 , "Water"]):
        
        print("Draw")
        
        
    elif (set == [2 , "Gun"]):
        
        print(f"{name} Win")
        
        
    elif (set == [2 , "Snake"]):
        
        print(f"{name} Loose")
        
        
    elif (set == [3 , "Gun"]):
        
        print("Draw")
        
        
    elif (set == [3 , "Snake"]):
        
        print(f"{name} Win")
        
        
    else:
        
        print(f"{name} Loose")
        

while(True):

    print("\nComputer Picked His Choice!\n")
    
    comp = Comppick()
    
    print("Enter Your Choice\n Enter 1 for Snake\n Enter 2 for Water\n Enter 3 for Gun")
    
    user = input("My Choice is ")
    print()
    
    try:
        user = int(user)
        
    except:
        print("Invalid Input\n\n")
        continue
    
    if(0 < user < 4):
        l = [user , comp]
        Result(l)
        print("Computer Choice: " , comp)
        continue
    
    else:
        print("Invalid Input")
        continue
    
    
       