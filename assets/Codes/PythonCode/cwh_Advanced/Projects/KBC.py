import math
import random

name = input("What is your name?: ")

print("Lets Start KBC,\n You will know the reward money after every Question,\n You have to choose and type (A, B, C, D) from the Options for Each Questions.\n")

def Result(a):
    print("Congratulations U won " , a , "$ in KBC")
    
    
def Wait():
    n = input("Do You Want to Move To the Next Level Or Take the Reward Home(Y/N): ").upper()
    
    if(n == 'Y'):
        return False
    
    elif(n == 'N'):
        return True
    
    else:
        print("Wrong Input")
        Wait()

while True:

    print("----------------------------------------------------")
    start = input("Do You Want to Start the Game?(Y/N): ").upper()
    
    if(start == 'Y'):
        pass

    elif(start == 'N'):
        exit()

    else:
        print("Wrong Input")


    Easy = ["What color is the sky on a clear day?" ,
        "How many legs does a spider have?", 
        "How many bones does an adult human have?", 
        "What is the capital of India?", 
        "Which is the smallest country in the world?",
        "Which fruit is known as the \"king of fruits\"?",
        "Which is the longest river in the world?",
        "Which is the largest mammal in the world?",
        "Which is the largest country in the world?",
        "What is the color of a ripe banana?"]

    easy_ans = ["A" , "B" , "C" , "A" , "A" , "B" , "B" , "A" , "C" , "A"]

    easy_opt = {1: "A. Blue | B. Green | C. Red | D. Black",
            2: "A. 6 | B. 8 | C. 4 | D. 2",
            3: "A. 209 | B. 206 | C. 208 | D. 207",
            4: "A. New Delhi | B. London | C. mumbai | D. Paris",
            5: "A. Vatican City | B. Monaco | C. Singapore | D. Ireland",
            6: "A. Apple | B. Mango | C. Orange | D. Pineapple",
            7: "A. Ganga | B. Nile | C. Godavari | D. Indus",
            8: "A. Whale | B. Dolphin | C. human | D. Crocodile",
            9: "A. China | B. India | C. Russia | D. Japan",
            10: "A. Yellow | B. Orange | C. White | D. Black"}

    Easy_main = Easy.copy()

    reward = 0

    ans = True
    level = True
    
    
    dollar = 500
    # Easy
    while ans and level:
    
        if(len(Easy) == 0):
            print("----------------------------------------------------")
            print(name, " won in Easy Level!!!")
            print("----------------------------------------------------")
            print(name, " won in Easy Level!!!!")
            print("----------------------------------------------------")
            print(name, " won in Easy Level!!!!! ")
            print("----------------------------------------------------")
            
            Result(reward)
            if (Wait()):
                exit()
            
            else: 
                level = False
                break
    
        q = random.choice(Easy_main)
        index = Easy_main.index(q)
        
        if(q in Easy):
            Easy.pop(Easy.index(q))

        else:
            continue
        
        next = True
        
        opt = easy_opt[index + 1]
        
        while next:
            print("----------------------------------------------------")
            print("----------------------------------------------------")
            print("Your  Question is :" , q)
            print("Reward: " , dollar , '$')
            print("----------------------------------------------------")
            print("Your Options are: ")
            print(opt)
            print("----------------------------------------------------")
                  
            decision = input("I choose(A,B,C,D): ").upper()
        
            if not('A' in decision or 'B' in decision or 'C' in decision or 'D' in decision):
            
                print("\nWrong Option Choosed\n")
    
                continue
            
            if(decision == easy_ans[index]):
                print("You Choosed the Right Option , You Won: " , reward + dollar , "$")
            
                reward = reward + dollar
                
                dollar = 500
            
                
                while(True):
                    print("----------------------------------------------------")
                    con = input("Want to Continue to Next Question(Y/N): ").upper()
                    if(con == 'Y' or con == 'N'):
                        next = False
                        break
                    else:
                        print("Wrong Option Choosed\n")
                        continue
                    
            else:
                print("You Choosed the Wrong Option , You Lost: " , reward , "$")
                dollar = 0
                ans = False
                print("You Lost KBC")
                Result(reward)
                exit()
    
    level = True
    
        
    # Medium
    
    medium = [
        "What is the largest planet in our solar system?" ,
        "Who wrote \"Harry Potter\"?" ,
        "What is the boiling point of water?" ,
        "Which gas do plants absorb from the atmosphere?" ,
        "How many continents are there in the world?" ,
        "Who was the first president of the United States?" ,
        "What is the hardest natural substance on Earth?" ,
        "Which language is the most widely spoken in the world?" ,
        "Which country has the longest coastline in the world?" ,
        "Who invented the light bulb?"]

    medium_ans = ["A" , "A" , "A" , "D" , "B" , "B" , "A" , "C" , "B" , "A"]

    medium_opt = {1: "A. Jupiter | B. Mercury | C. Mars | D. Venus",
            2: "A. J.K Rowling | B. J. R. R. Tolkien | C. J. R. R. Tolkien | D. J. K. Rowling",
            3: "A. 100 | B. 77 | C. 80 | D. 90",
            4: "A. Nitrogen | B. Oxygen | C. Argon | D. Carbon Dioxide",
            5: "A. 6 | B. 7 | C. 8 | D. 9",
            6: "A. Abraham Lincoln | B. George Washington | C. Thomas Jefferson | D. Thomas Alva Edison",
            7: "A. Diamond | B. Gold | C. Silver | D. Copper",
            8: "A. Spanish | B. English | C. Mandarin Chinese | D. Hindi",
            9: "A. Asia | B. Canada | C. Europe | D. North America",
            10: "A. Thomas Edison | B. Nikola Tesla | C. James Watt | D. Charles Babbage"}
    
    
    medium_main = medium.copy()
    
    dollar = 1000
    while ans and level:
    
        if(len(medium) == 0):
            print("----------------------------------------------------")
            print(name, " won in medium Level: ")
            print("----------------------------------------------------")
            print(name, " won in medium Level: ")
            print("----------------------------------------------------")
            print(name, " won in medium Level: ")
            print("----------------------------------------------------")
            
            Result(reward)
            if (Wait()):
                exit()
            
            else: 
                level = False
                break
    
        q = random.choice(medium_main)
        index = medium_main.index(q)
        
        if(q in medium):
            medium.pop(medium.index(q))

        else:
            continue
        
        next = True
    
        while next:
            print("----------------------------------------------------")
            print("----------------------------------------------------")
            print("Your  Question is :" , q)
            print("Reward: " , dollar , '$')
            print("----------------------------------------------------")
            print("Your Options are: ")
            print(medium_opt.pop(index + 1))
            print("----------------------------------------------------")

            decision = input("I choose(A,B,C,D): ").upper()

            if not('A' in decision or 'B' in decision or 'C' in decision or 'D' in decision):

                print("\nWrong Option Choosed\n")

                continue
            
            if(decision == medium_ans[index]):
                print("You Choosed the Right Option , You Won: " , reward + dollar , "$")

                reward = reward + dollar 

                dollar = dollar + (dollar / 2)
                


                while(True):
                    print("----------------------------------------------------")
                    con = input("Want to Continue to Next Question(Y/N): ").upper()
                    if(con == 'Y' or con == 'N'):
                        next = False
                        break
                    else:
                        print("Wrong Option Choosed\n")
                        continue
                    
            else:
                print("You Choosed the Wrong Option , You Lost: " , reward , "$")
                dollar = 0
                ans = False
                print("You Lost KBC")
                Result(reward)
                exit()
            
    # hard
    
    hard = [
        "What is meant by 0's and 1's in Programming?" ,
        "What is the full form of WHO?" ,]

    hard_ans = ["D" , "B" ]

    hard_opt = {1: "A. Numbers | B. Integer | C. Source Code | D. Binary Code",
            2: "A. World Healing Organisation | B. World Health Organisation | C. Wide Health Operation | D. World happy Ocassion",}
    
    
    hard_main = hard.copy()
    
    dollar = 500
    while ans and level:
    
        if(len(hard) == 0):
            print("You had Completed KBC Successfully Bonus reward: 10000$")
            
            Result(reward + 10000)
            
            print("---------------------------------------------")
            print("The Next Round is Double or Nothing, remember that! before continuing...")
            
            if (Wait()):
                exit()
            
            else: 
                level = False
                break
    
        q = random.choice(hard_main)
        index = hard_main.index(q)
        
        if(q in Easy):
            hard.pop(hard.index(q))

        else:
            continue
        
        next = True
    
        while next:
            print("----------------------------------------------------")
            print("----------------------------------------------------")
            print("Your  Question is :" , q)
            print("Reward: " , dollar*2 , '$')
            print("----------------------------------------------------")
            print("Your Options are: ")
            print(hard_opt.pop(index + 1))
            print("----------------------------------------------------")

            decision = input("I choose(A,B,C,D): ").upper()

            if not('A' in decision or 'B' in decision or 'C' in decision or 'D' in decision):

                print("\nWrong Option Choosed\n")

                continue
            
            if(decision == hard_ans[index]):
                print("You Choosed the Right Option , You Won: " , reward + dollar , "$")

                reward = reward + dollar 

                dollar = dollar * 2
                


                while(True):
                    print("----------------------------------------------------")
                    con = input("Want to Continue to Next Question(Y/N): ").upper()
                    if(con == 'Y' or con == 'N'):
                        next = False
                        break
                    else:
                        print("Wrong Option Choosed\n")
                        continue
                    
            else:
                print("You Choosed the Wrong Option , You Lost: " , reward , "$")
                dollar = 0
                ans = False
                print("You Lost KBC")
                Result(reward)
                exit()
            
        
        
    # double or nothing
    
    extreme = []

    extreme_ans = []

    extreme_opt = {}
    
    
    extreme_main = extreme.copy()
    
    dollar = reward * 2
    while ans and level:
    
        if(len(extreme) == 0):
            print("You had Completed KBC Successfully Bonus reward: 1M $")
            
            print("Total Reward: " , reward + 1000000)
            
            exit()
            
    
        q = random.choice(extreme_main)
        index = extreme_main.index(q)
        
        if(q in Easy):
            extreme.pop(extreme.index(q))

        else:
            continue
        
        next = True
    
        while next:
            print("----------------------------------------------------")
            print("----------------------------------------------------")
            print("Your  Question is :" , q)
            print("Reward: " , dollar , '$')
            print("----------------------------------------------------")
            print("Your Options are: ")
            print(extreme_opt.pop(index + 1))
            print("----------------------------------------------------")

            decision = input("I choose(A,B,C,D): ").upper()

            if not('A' in decision or 'B' in decision or 'C' in decision or 'D' in decision):

                print("\nWrong Option Choosed\n")

                continue
            
            if(decision == extreme_ans[index]):
                print("You Choosed the Right Option , You Won: " , reward , "$")

                reward = dollar 

                dollar = reward * 2
                


                while(True):
                    print("----------------------------------------------------")
                    con = input("Want to Continue to Next Question(Y/N): ").upper()
                    if(con == 'Y' or con == 'N'):
                        next = False
                        break
                    else:
                        print("Wrong Option Choosed\n")
                        continue
                    
            else:
                print("You Choosed the Wrong Option , You Lost: " , reward , "$")
                dollar = 0
                ans = False
                print("You Lost KBC")
                Result(0)
                exit()
            
        
        