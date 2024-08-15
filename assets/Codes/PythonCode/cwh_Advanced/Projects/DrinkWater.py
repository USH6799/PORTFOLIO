import pyttsx3
import time

# Initialize the pyttsx3 text-to-speech engine
eng = pyttsx3.init()

# Prompt the user to enter the timer duration in minutes
t = input("Enter The Timer You want to set For Your Water Reminder in minutes: ")

# Convert the input to a floating-point number
t = float(t)

def call():
    # Function to make an announcement and check user response
    eng.say("Time For Drinking Water")  # Announce reminder
    eng.runAndWait()  # Wait for the announcement to complete
    if input("Enter ok to Stop the Reminder: ") == "ok":
        eng.stop()  # Stop the reminder if the user inputs "ok"
    else:
        call()  # Recursive call to continue the reminder if user inputs anything other than "ok"

# Wait for the specified duration (converted to seconds)
time.sleep(t * 60)

# Call the reminder function
call()

# Dry Run:
# 1. **Initialization:**
#    - `eng = pyttsx3.init()`: Initializes the text-to-speech engine.

# 2. **User Input:**
#    - `t = input("Enter The Timer You want to set For Your Water Reminder in minutes: ")`: Prompts the user to enter the timer duration.
#    - `t = float(t)`: Converts the user input from a string to a floating-point number.

# 3. **Timer Countdown:**
#    - `time.sleep(t * 60)`: Pauses the execution of the program for `t` minutes (converted to seconds).

# 4. **Reminder Function:**
#    - `call()`: The function that announces the reminder and handles user response.
#      - `eng.say("Time For Drinking Water")`: Announces the reminder.
#      - `eng.runAndWait()`: Waits for the speech to finish.
#      - `if input("Enter ok to Stop the Reminder: ") == "ok":`: Checks user input to stop the reminder.
#        - `eng.stop()`: Stops the reminder if user inputs "ok".
#        - `else: call()`: Recursively calls `call()` to continue the reminder if user input is not "ok".
