import random  # Importing the random module to use for generating random choices.

# Asking for the user's name.
name = input("What is Your Name?\nMy Name is ")

# Function to randomly pick a choice for the computer: Snake, Water, or Gun.
def Comppick():
    # Randomly choosing from the list ["Snake", "Water", "Gun"]
    pick = random.choice(["Snake", "Water", "Gun"])
    return pick  # Returning the computer's choice.

# Function to determine the result based on the user's and computer's choices.
def Result(set):
    
    # If the user picks Snake and the computer also picks Snake, it's a draw.
    if(set == [1 , "Snake"]):
        print("Draw")
        
    # If the user picks Snake and the computer picks Water, the user wins.
    elif (set == [1 , "Water"]):
        print(f"{name} Win")
        
    # If the user picks Snake and the computer picks Gun, the user loses.
    elif (set == [1 , "Gun"]):
        print(f"{name} Lose")
        
    # If the user picks Water and the computer also picks Water, it's a draw.
    elif (set == [2 , "Water"]):
        print("Draw")
        
    # If the user picks Water and the computer picks Gun, the user wins.
    elif (set == [2 , "Gun"]):
        print(f"{name} Win")
        
    # If the user picks Water and the computer picks Snake, the user loses.
    elif (set == [2 , "Snake"]):
        print(f"{name} Lose")
        
    # If the user picks Gun and the computer also picks Gun, it's a draw.
    elif (set == [3 , "Gun"]):
        print("Draw")
        
    # If the user picks Gun and the computer picks Snake, the user wins.
    elif (set == [3 , "Snake"]):
        print(f"{name} Win")
        
    # If the user picks Gun and the computer picks Water, the user loses.
    else:
        print(f"{name} Lose")

# Main game loop that continues until the user decides to stop.
while(True):

    print("\nComputer Picked Its Choice!\n")  # Informing the user that the computer has made its choice.
    
    comp = Comppick()  # Storing the computer's choice.
    
    # Displaying the options for the user to pick from.
    print("Enter Your Choice\n Enter 1 for Snake\n Enter 2 for Water\n Enter 3 for Gun")
    
    user = input("My Choice is ")  # Taking the user's choice as input.
    print()
    
    try:
        user = int(user)  # Attempting to convert the user's choice to an integer.
        
    except:
        print("Invalid Input\n\n")  # If the input is not an integer, print an error message.
        continue  # Restart the loop for another valid input.
    
    if(0 < user < 4):  # Check if the user's choice is within the valid range (1 to 3).
        l = [user , comp]  # Creating a list with the user's choice and the computer's choice.
        Result(l)  # Passing the list to the Result function to determine the outcome.
        print("Computer Choice: " , comp)  # Displaying the computer's choice.
        continue  # Restart the loop for the next round.
    
    else:
        print("Invalid Input")  # If the user's choice is outside the valid range, print an error message.
        continue  # Restart the loop for another valid input.
