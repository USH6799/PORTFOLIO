import random

# Get the player's name
name = input("What is your name?: ")

# Introduction to the game
print("Welcome to KBC! Answer the questions correctly to win rewards.\n")

def Result(a):
    # Function to display the total reward
    print("Congratulations! You won", a, "$ in KBC")

def Wait():
    # Function to ask if the player wants to continue or quit
    n = input("Continue to the next level or take the reward home (Y/N)?: ").upper()
    if n == 'Y':
        return False
    elif n == 'N':
        return True
    else:
        print("Invalid input")
        return Wait()

while True:
    # Ask the player if they want to start the game
    start = input("Start the game? (Y/N): ").upper()
    if start == 'Y':
        pass
    elif start == 'N':
        exit()
    else:
        print("Invalid input")

    # Easy Level Questions
    easy_questions = [
        {"question": "What color is the sky on a clear day?", "options": "A. Blue | B. Green | C. Red | D. Black", "answer": "A"},
        {"question": "How many legs does a spider have?", "options": "A. 6 | B. 8 | C. 4 | D. 2", "answer": "B"},
        {"question": "How many bones does an adult human have?", "options": "A. 209 | B. 206 | C. 208 | D. 207", "answer": "B"},
        {"question": "What is the capital of India?", "options": "A. New Delhi | B. London | C. Mumbai | D. Paris", "answer": "A"},
        {"question": "Which is the smallest country in the world?", "options": "A. Vatican City | B. Monaco | C. Singapore | D. Ireland", "answer": "A"}
    ]

    reward = 0
    dollar = 500  # Initial reward for each correct answer

    for q in easy_questions:
        print("----------------------------------------------------")
        print(f"Your question: {q['question']}")
        print("Reward: ", dollar, '$')
        print("Your options are: ")
        print(q['options'])
        print("----------------------------------------------------")
        
        # Get the player's answer
        decision = input("I choose (A, B, C, D): ").upper()

        # Check if the answer is correct
        if decision == q['answer']:
            reward += dollar
            print(f"Correct! You won {reward} $")
            dollar += 500  # Increase reward for the next question

            # Ask if the player wants to continue or quit
            if Wait():
                Result(reward)
                exit()
        else:
            print(f"Wrong answer! You lost with {reward} $")
            Result(reward)
            exit()

    # If the player finishes all questions in the easy level
    print("You won the Easy Level!")
    Result(reward)

    # Medium Level Questions
    medium_questions = [
        {"question": "What is the largest planet in our solar system?", "options": "A. Jupiter | B. Mercury | C. Mars | D. Venus", "answer": "A"},
        {"question": "Who wrote 'Harry Potter'?", "options": "A. J.K Rowling | B. J. R. R. Tolkien | C. George R. R. Martin | D. J. K. Rowling", "answer": "A"},
        {"question": "What is the boiling point of water?", "options": "A. 100°C | B. 77°C | C. 80°C | D. 90°C", "answer": "A"},
        {"question": "Which gas do plants absorb from the atmosphere?", "options": "A. Nitrogen | B. Oxygen | C. Argon | D. Carbon Dioxide", "answer": "D"},
        {"question": "How many continents are there in the world?", "options": "A. 6 | B. 7 | C. 8 | D. 9", "answer": "B"}
    ]

    dollar = 1000  # Increase reward for medium level

    for q in medium_questions:
        print("----------------------------------------------------")
        print(f"Your question: {q['question']}")
        print("Reward: ", dollar, '$')
        print("Your options are: ")
        print(q['options'])
        print("----------------------------------------------------")
        
        # Get the player's answer
        decision = input("I choose (A, B, C, D): ").upper()

        # Check if the answer is correct
        if decision == q['answer']:
            reward += dollar
            print(f"Correct! You won {reward} $")
            dollar += 1000  # Increase reward for the next question

            # Ask if the player wants to continue or quit
            if Wait():
                Result(reward)
                exit()
        else:
            print(f"Wrong answer! You lost with {reward} $")
            Result(reward)
            exit()

    # If the player finishes all questions in the medium level
    print("You won the Medium Level!")
    Result(reward)

    # Hard Level Questions
    hard_questions = [
        {"question": "What is meant by 0's and 1's in Programming?", "options": "A. Numbers | B. Integer | C. Source Code | D. Binary Code", "answer": "D"},
        {"question": "What is the full form of WHO?", "options": "A. World Healing Organisation | B. World Health Organisation | C. Wide Health Operation | D. World Happy Occasion", "answer": "B"}
    ]

    dollar = 2000  # Increase reward for hard level

    for q in hard_questions:
        print("----------------------------------------------------")
        print(f"Your question: {q['question']}")
        print("Reward: ", dollar, '$')
        print("Your options are: ")
        print(q['options'])
        print("----------------------------------------------------")
        
        # Get the player's answer
        decision = input("I choose (A, B, C, D): ").upper()

        # Check if the answer is correct
        if decision == q['answer']:
            reward += dollar
            print(f"Correct! You won {reward} $")
            dollar += 2000  # Increase reward for the next question

            # Ask if the player wants to continue or quit
            if Wait():
                Result(reward)
                exit()
        else:
            print(f"Wrong answer! You lost with {reward} $")
            Result(reward)
            exit()

    # If the player finishes all questions in the hard level
    print("You won the Hard Level!")
    Result(reward)
    
    # If the player finishes all levels, display a final message
    print(f"Congratulations, {name}! You completed KBC and won {reward} $!")
    exit()
